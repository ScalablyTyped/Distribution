package typings.slate

import typings.slate.operationMod.Operation
import typings.slate.slateNumbers.`-1`
import typings.slate.slateNumbers.`0`
import typings.slate.slateNumbers.`1`
import typings.slate.typesMod.TextDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pathMod {
  
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
    
    extension [Self <: PathAncestorsOptions](x: Self) {
      
      inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
    }
  }
  
  @js.native
  trait PathInterface extends StObject {
    
    def ancestors(path: typings.slate.pathMod.Path): js.Array[typings.slate.pathMod.Path] = js.native
    def ancestors(path: typings.slate.pathMod.Path, options: PathAncestorsOptions): js.Array[typings.slate.pathMod.Path] = js.native
    
    def common(path: typings.slate.pathMod.Path, another: typings.slate.pathMod.Path): typings.slate.pathMod.Path = js.native
    
    def compare(path: typings.slate.pathMod.Path, another: typings.slate.pathMod.Path): `-1` | `0` | `1` = js.native
    
    def endsAfter(path: typings.slate.pathMod.Path, another: typings.slate.pathMod.Path): Boolean = js.native
    
    def endsAt(path: typings.slate.pathMod.Path, another: typings.slate.pathMod.Path): Boolean = js.native
    
    def endsBefore(path: typings.slate.pathMod.Path, another: typings.slate.pathMod.Path): Boolean = js.native
    
    def equals(path: typings.slate.pathMod.Path, another: typings.slate.pathMod.Path): Boolean = js.native
    
    def hasPrevious(path: typings.slate.pathMod.Path): Boolean = js.native
    
    def isAfter(path: typings.slate.pathMod.Path, another: typings.slate.pathMod.Path): Boolean = js.native
    
    def isAncestor(path: typings.slate.pathMod.Path, another: typings.slate.pathMod.Path): Boolean = js.native
    
    def isBefore(path: typings.slate.pathMod.Path, another: typings.slate.pathMod.Path): Boolean = js.native
    
    def isChild(path: typings.slate.pathMod.Path, another: typings.slate.pathMod.Path): Boolean = js.native
    
    def isCommon(path: typings.slate.pathMod.Path, another: typings.slate.pathMod.Path): Boolean = js.native
    
    def isDescendant(path: typings.slate.pathMod.Path, another: typings.slate.pathMod.Path): Boolean = js.native
    
    def isParent(path: typings.slate.pathMod.Path, another: typings.slate.pathMod.Path): Boolean = js.native
    
    def isPath(value: Any): /* is slate.slate/dist/interfaces/path.Path */ Boolean = js.native
    
    def isSibling(path: typings.slate.pathMod.Path, another: typings.slate.pathMod.Path): Boolean = js.native
    
    def levels(path: typings.slate.pathMod.Path): js.Array[typings.slate.pathMod.Path] = js.native
    def levels(path: typings.slate.pathMod.Path, options: PathLevelsOptions): js.Array[typings.slate.pathMod.Path] = js.native
    
    def next(path: typings.slate.pathMod.Path): typings.slate.pathMod.Path = js.native
    
    def operationCanTransformPath(operation: Operation): Boolean = js.native
    
    def parent(path: typings.slate.pathMod.Path): typings.slate.pathMod.Path = js.native
    
    def previous(path: typings.slate.pathMod.Path): typings.slate.pathMod.Path = js.native
    
    def relative(path: typings.slate.pathMod.Path, ancestor: typings.slate.pathMod.Path): typings.slate.pathMod.Path = js.native
    
    def transform(path: typings.slate.pathMod.Path, operation: Operation): typings.slate.pathMod.Path | Null = js.native
    def transform(path: typings.slate.pathMod.Path, operation: Operation, options: PathTransformOptions): typings.slate.pathMod.Path | Null = js.native
  }
  
  trait PathLevelsOptions extends StObject {
    
    var reverse: js.UndefOr[Boolean] = js.undefined
  }
  object PathLevelsOptions {
    
    inline def apply(): PathLevelsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PathLevelsOptions]
    }
    
    extension [Self <: PathLevelsOptions](x: Self) {
      
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
    
    extension [Self <: PathTransformOptions](x: Self) {
      
      inline def setAffinity(value: TextDirection): Self = StObject.set(x, "affinity", value.asInstanceOf[js.Any])
      
      inline def setAffinityNull: Self = StObject.set(x, "affinity", null)
      
      inline def setAffinityUndefined: Self = StObject.set(x, "affinity", js.undefined)
    }
  }
}
