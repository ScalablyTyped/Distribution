package typings.slate

import typings.slate.distInterfacesOperationMod.Operation
import typings.slate.distTypesTypesMod.TextDirection
import typings.slate.slateInts.`-1`
import typings.slate.slateInts.`0`
import typings.slate.slateInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distInterfacesPathMod {
  
  @JSImport("slate/dist/interfaces/path", "Path")
  @js.native
  val Path: PathInterface = js.native
  type Path = js.Array[Double]
  
  trait PathAncestorsOptions extends StObject {
    
    var reverse: js.UndefOr[Boolean] = js.undefined
  }
  object PathAncestorsOptions {
    
    inline def apply(): PathAncestorsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PathAncestorsOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PathAncestorsOptions] (val x: Self) extends AnyVal {
      
      inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
    }
  }
  
  @js.native
  trait PathInterface extends StObject {
    
    /**
      * Get a list of ancestor paths for a given path.
      *
      * The paths are sorted from shallowest to deepest ancestor. However, if the
      * `reverse: true` option is passed, they are reversed.
      */
    def ancestors(path: typings.slate.distInterfacesPathMod.Path): js.Array[typings.slate.distInterfacesPathMod.Path] = js.native
    def ancestors(path: typings.slate.distInterfacesPathMod.Path, options: PathAncestorsOptions): js.Array[typings.slate.distInterfacesPathMod.Path] = js.native
    
    /**
      * Get the common ancestor path of two paths.
      */
    def common(path: typings.slate.distInterfacesPathMod.Path, another: typings.slate.distInterfacesPathMod.Path): typings.slate.distInterfacesPathMod.Path = js.native
    
    /**
      * Compare a path to another, returning an integer indicating whether the path
      * was before, at, or after the other.
      *
      * Note: Two paths of unequal length can still receive a `0` result if one is
      * directly above or below the other. If you want exact matching, use
      * [[Path.equals]] instead.
      */
    def compare(path: typings.slate.distInterfacesPathMod.Path, another: typings.slate.distInterfacesPathMod.Path): `-1` | `0` | `1` = js.native
    
    /**
      * Check if a path ends after one of the indexes in another.
      */
    def endsAfter(path: typings.slate.distInterfacesPathMod.Path, another: typings.slate.distInterfacesPathMod.Path): Boolean = js.native
    
    /**
      * Check if a path ends at one of the indexes in another.
      */
    def endsAt(path: typings.slate.distInterfacesPathMod.Path, another: typings.slate.distInterfacesPathMod.Path): Boolean = js.native
    
    /**
      * Check if a path ends before one of the indexes in another.
      */
    def endsBefore(path: typings.slate.distInterfacesPathMod.Path, another: typings.slate.distInterfacesPathMod.Path): Boolean = js.native
    
    /**
      * Check if a path is exactly equal to another.
      */
    def equals(path: typings.slate.distInterfacesPathMod.Path, another: typings.slate.distInterfacesPathMod.Path): Boolean = js.native
    
    /**
      * Check if the path of previous sibling node exists
      */
    def hasPrevious(path: typings.slate.distInterfacesPathMod.Path): Boolean = js.native
    
    /**
      * Check if a path is after another.
      */
    def isAfter(path: typings.slate.distInterfacesPathMod.Path, another: typings.slate.distInterfacesPathMod.Path): Boolean = js.native
    
    /**
      * Check if a path is an ancestor of another.
      */
    def isAncestor(path: typings.slate.distInterfacesPathMod.Path, another: typings.slate.distInterfacesPathMod.Path): Boolean = js.native
    
    /**
      * Check if a path is before another.
      */
    def isBefore(path: typings.slate.distInterfacesPathMod.Path, another: typings.slate.distInterfacesPathMod.Path): Boolean = js.native
    
    /**
      * Check if a path is a child of another.
      */
    def isChild(path: typings.slate.distInterfacesPathMod.Path, another: typings.slate.distInterfacesPathMod.Path): Boolean = js.native
    
    /**
      * Check if a path is equal to or an ancestor of another.
      */
    def isCommon(path: typings.slate.distInterfacesPathMod.Path, another: typings.slate.distInterfacesPathMod.Path): Boolean = js.native
    
    /**
      * Check if a path is a descendant of another.
      */
    def isDescendant(path: typings.slate.distInterfacesPathMod.Path, another: typings.slate.distInterfacesPathMod.Path): Boolean = js.native
    
    /**
      * Check if a path is the parent of another.
      */
    def isParent(path: typings.slate.distInterfacesPathMod.Path, another: typings.slate.distInterfacesPathMod.Path): Boolean = js.native
    
    /**
      * Check is a value implements the `Path` interface.
      */
    def isPath(value: Any): /* is slate.slate/dist/interfaces/path.Path */ Boolean = js.native
    
    /**
      * Check if a path is a sibling of another.
      */
    def isSibling(path: typings.slate.distInterfacesPathMod.Path, another: typings.slate.distInterfacesPathMod.Path): Boolean = js.native
    
    /**
      * Get a list of paths at every level down to a path. Note: this is the same
      * as `Path.ancestors`, but including the path itself.
      *
      * The paths are sorted from shallowest to deepest. However, if the `reverse:
      * true` option is passed, they are reversed.
      */
    def levels(path: typings.slate.distInterfacesPathMod.Path): js.Array[typings.slate.distInterfacesPathMod.Path] = js.native
    def levels(path: typings.slate.distInterfacesPathMod.Path, options: PathLevelsOptions): js.Array[typings.slate.distInterfacesPathMod.Path] = js.native
    
    /**
      * Given a path, get the path to the next sibling node.
      */
    def next(path: typings.slate.distInterfacesPathMod.Path): typings.slate.distInterfacesPathMod.Path = js.native
    
    /**
      * Returns whether this operation can affect paths or not. Used as an
      * optimization when updating dirty paths during normalization
      *
      * NOTE: This *must* be kept in sync with the implementation of 'transform'
      * below
      */
    def operationCanTransformPath(operation: Operation): Boolean = js.native
    
    /**
      * Given a path, return a new path referring to the parent node above it.
      */
    def parent(path: typings.slate.distInterfacesPathMod.Path): typings.slate.distInterfacesPathMod.Path = js.native
    
    /**
      * Given a path, get the path to the previous sibling node.
      */
    def previous(path: typings.slate.distInterfacesPathMod.Path): typings.slate.distInterfacesPathMod.Path = js.native
    
    /**
      * Get a path relative to an ancestor.
      */
    def relative(path: typings.slate.distInterfacesPathMod.Path, ancestor: typings.slate.distInterfacesPathMod.Path): typings.slate.distInterfacesPathMod.Path = js.native
    
    /**
      * Transform a path by an operation.
      */
    def transform(path: typings.slate.distInterfacesPathMod.Path, operation: Operation): typings.slate.distInterfacesPathMod.Path | Null = js.native
    def transform(
      path: typings.slate.distInterfacesPathMod.Path,
      operation: Operation,
      options: PathTransformOptions
    ): typings.slate.distInterfacesPathMod.Path | Null = js.native
  }
  
  trait PathLevelsOptions extends StObject {
    
    var reverse: js.UndefOr[Boolean] = js.undefined
  }
  object PathLevelsOptions {
    
    inline def apply(): PathLevelsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PathLevelsOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PathLevelsOptions] (val x: Self) extends AnyVal {
      
      inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
    }
  }
  
  trait PathTransformOptions extends StObject {
    
    var affinity: js.UndefOr[TextDirection | Null] = js.undefined
  }
  object PathTransformOptions {
    
    inline def apply(): PathTransformOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PathTransformOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PathTransformOptions] (val x: Self) extends AnyVal {
      
      inline def setAffinity(value: TextDirection): Self = StObject.set(x, "affinity", value.asInstanceOf[js.Any])
      
      inline def setAffinityNull: Self = StObject.set(x, "affinity", null)
      
      inline def setAffinityUndefined: Self = StObject.set(x, "affinity", js.undefined)
    }
  }
}
