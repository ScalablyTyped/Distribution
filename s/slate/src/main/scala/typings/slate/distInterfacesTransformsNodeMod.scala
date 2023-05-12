package typings.slate

import typings.slate.anon.Always
import typings.slate.anon.At
import typings.slate.anon.Compare
import typings.slate.anon.Hanging
import typings.slate.anon.Match
import typings.slate.anon.Mode
import typings.slate.anon.Split
import typings.slate.distInterfacesEditorMod.Editor
import typings.slate.distInterfacesEditorMod.NodeMatch
import typings.slate.distInterfacesElementMod.Element
import typings.slate.distInterfacesLocationMod.Location
import typings.slate.distInterfacesNodeMod.Node
import typings.slate.distInterfacesPathMod.Path
import typings.slate.distTypesTypesMod.RangeMode
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distInterfacesTransformsNodeMod {
  
  @js.native
  trait NodeTransforms extends StObject {
    
    def insertNodes[T /* <: Node */](editor: Editor, nodes: js.Array[Node]): Unit = js.native
    def insertNodes[T /* <: Node */](editor: Editor, nodes: js.Array[Node], options: NodeInsertNodesOptions[T]): Unit = js.native
    /**
      * Insert nodes in the editor
      * at the specified location or (if not defined) the current selection or (if not defined) the end of the document.
      */
    def insertNodes[T /* <: Node */](editor: Editor, nodes: Node): Unit = js.native
    def insertNodes[T /* <: Node */](editor: Editor, nodes: Node, options: NodeInsertNodesOptions[T]): Unit = js.native
    
    /**
      * Lift nodes at a specific location upwards in the document tree, splitting
      * their parent in two if necessary.
      */
    def liftNodes[T /* <: Node */](editor: Editor): Unit = js.native
    def liftNodes[T /* <: Node */](editor: Editor, options: At[T]): Unit = js.native
    
    /**
      * Merge a node at a location with the previous node of the same depth,
      * removing any empty containing nodes after the merge if necessary.
      */
    def mergeNodes[T /* <: Node */](editor: Editor): Unit = js.native
    def mergeNodes[T /* <: Node */](editor: Editor, options: Hanging[T]): Unit = js.native
    
    /**
      * Move the nodes at a location to a new location.
      */
    def moveNodes[T /* <: Node */](editor: Editor, options: Match[T]): Unit = js.native
    
    /**
      * Remove the nodes at a specific location in the document.
      */
    def removeNodes[T /* <: Node */](editor: Editor): Unit = js.native
    def removeNodes[T /* <: Node */](editor: Editor, options: Hanging[T]): Unit = js.native
    
    /**
      * Set new properties on the nodes at a location.
      */
    def setNodes[T /* <: Node */](editor: Editor, props: Partial[T]): Unit = js.native
    def setNodes[T /* <: Node */](editor: Editor, props: Partial[T], options: Compare[T]): Unit = js.native
    
    /**
      * Split the nodes at a specific location.
      */
    def splitNodes[T /* <: Node */](editor: Editor): Unit = js.native
    def splitNodes[T /* <: Node */](editor: Editor, options: Always[T]): Unit = js.native
    
    /**
      * Unset properties on the nodes at a location.
      */
    def unsetNodes[T /* <: Node */](editor: Editor, props: String): Unit = js.native
    def unsetNodes[T /* <: Node */](editor: Editor, props: String, options: Mode[T]): Unit = js.native
    def unsetNodes[T /* <: Node */](editor: Editor, props: js.Array[String]): Unit = js.native
    def unsetNodes[T /* <: Node */](editor: Editor, props: js.Array[String], options: Mode[T]): Unit = js.native
    
    /**
      * Unwrap the nodes at a location from a parent node, splitting the parent if
      * necessary to ensure that only the content in the range is unwrapped.
      */
    def unwrapNodes[T /* <: Node */](editor: Editor): Unit = js.native
    def unwrapNodes[T /* <: Node */](editor: Editor, options: Split[T]): Unit = js.native
    
    /**
      * Wrap the nodes at a location in a new container node, splitting the edges
      * of the range first to ensure that only the content in the range is wrapped.
      */
    def wrapNodes[T /* <: Node */](editor: Editor, element: Element): Unit = js.native
    def wrapNodes[T /* <: Node */](editor: Editor, element: Element, options: Split[T]): Unit = js.native
  }
  @JSImport("slate/dist/interfaces/transforms/node", "NodeTransforms")
  @js.native
  val NodeTransforms: typings.slate.distInterfacesTransformsNodeMod.NodeTransforms = js.native
  
  trait NodeInsertNodesOptions[T /* <: Node */] extends StObject {
    
    var at: js.UndefOr[Location] = js.undefined
    
    var hanging: js.UndefOr[Boolean] = js.undefined
    
    var `match`: js.UndefOr[NodeMatch[T]] = js.undefined
    
    var mode: js.UndefOr[RangeMode] = js.undefined
    
    var select: js.UndefOr[Boolean] = js.undefined
    
    var voids: js.UndefOr[Boolean] = js.undefined
  }
  object NodeInsertNodesOptions {
    
    inline def apply[T /* <: Node */](): NodeInsertNodesOptions[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodeInsertNodesOptions[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NodeInsertNodesOptions[?], T /* <: Node */] (val x: Self & NodeInsertNodesOptions[T]) extends AnyVal {
      
      inline def setAt(value: Location): Self = StObject.set(x, "at", value.asInstanceOf[js.Any])
      
      inline def setAtUndefined: Self = StObject.set(x, "at", js.undefined)
      
      inline def setAtVarargs(value: Double*): Self = StObject.set(x, "at", js.Array(value*))
      
      inline def setHanging(value: Boolean): Self = StObject.set(x, "hanging", value.asInstanceOf[js.Any])
      
      inline def setHangingUndefined: Self = StObject.set(x, "hanging", js.undefined)
      
      inline def setMatch(value: (/* node */ Node, /* path */ Path) => /* is T */ Boolean): Self = StObject.set(x, "match", js.Any.fromFunction2(value))
      
      inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
      
      inline def setMode(value: RangeMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setSelect(value: Boolean): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
      
      inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
      
      inline def setVoids(value: Boolean): Self = StObject.set(x, "voids", value.asInstanceOf[js.Any])
      
      inline def setVoidsUndefined: Self = StObject.set(x, "voids", js.undefined)
    }
  }
}
