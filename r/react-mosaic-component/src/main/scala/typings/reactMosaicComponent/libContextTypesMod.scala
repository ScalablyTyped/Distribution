package typings.reactMosaicComponent

import typings.react.mod.Context
import typings.react.mod.ReactElement
import typings.reactMosaicComponent.libTypesMod.MosaicKey
import typings.reactMosaicComponent.libTypesMod.MosaicNode
import typings.reactMosaicComponent.libTypesMod.MosaicPath
import typings.reactMosaicComponent.libTypesMod.MosaicUpdate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libContextTypesMod {
  
  trait MosaicContext[T /* <: MosaicKey */] extends StObject {
    
    var blueprintNamespace: String
    
    var mosaicActions: MosaicRootActions[T]
    
    var mosaicId: String
  }
  object MosaicContext {
    
    @JSImport("react-mosaic-component/lib/contextTypes", "MosaicContext")
    @js.native
    val ^ : Context[MosaicContext[MosaicKey]] = js.native
    
    extension [Self <: MosaicContext[?], T /* <: MosaicKey */](x: Self & MosaicContext[T]) {
      
      inline def setBlueprintNamespace(value: String): Self = StObject.set(x, "blueprintNamespace", value.asInstanceOf[js.Any])
      
      inline def setMosaicActions(value: MosaicRootActions[T]): Self = StObject.set(x, "mosaicActions", value.asInstanceOf[js.Any])
      
      inline def setMosaicId(value: String): Self = StObject.set(x, "mosaicId", value.asInstanceOf[js.Any])
    }
  }
  
  trait MosaicWindowContext extends StObject {
    
    var blueprintNamespace: String
    
    var mosaicWindowActions: MosaicWindowActions
  }
  object MosaicWindowContext {
    
    @JSImport("react-mosaic-component/lib/contextTypes", "MosaicWindowContext")
    @js.native
    val ^ : Context[MosaicWindowContext] = js.native
    
    extension [Self <: MosaicWindowContext](x: Self) {
      
      inline def setBlueprintNamespace(value: String): Self = StObject.set(x, "blueprintNamespace", value.asInstanceOf[js.Any])
      
      inline def setMosaicWindowActions(value: MosaicWindowActions): Self = StObject.set(x, "mosaicWindowActions", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MosaicRootActions[T /* <: MosaicKey */] extends StObject {
    
    /**
      * Increases the size of this node and bubbles up the tree
      * @param path Path to node to expand
      * @param percentage Every node in the path up to root will be expanded to this percentage
      */
    def expand(path: MosaicPath): Unit = js.native
    def expand(path: MosaicPath, percentage: Double): Unit = js.native
    
    /**
      * Returns the root of this Mosaic instance
      */
    def getRoot(): MosaicNode[T] | Null = js.native
    
    /**
      * Hide the node at `path` but keep it in the DOM. Used in Drag and Drop
      * @param path
      */
    def hide(path: MosaicPath): Unit = js.native
    
    /**
      * Remove the node at `path`
      * @param path
      */
    def remove(path: MosaicPath): Unit = js.native
    
    /**
      * Replace currentNode at `path` with `node`
      * @param path
      * @param node
      */
    def replaceWith(path: MosaicPath, node: MosaicNode[T]): Unit = js.native
    
    /**
      * Atomically applies all updates to the current tree
      * @param updates
      * @param suppressOnRelease (default: false)
      */
    def updateTree(updates: js.Array[MosaicUpdate[T]]): Unit = js.native
    def updateTree(updates: js.Array[MosaicUpdate[T]], suppressOnRelease: Boolean): Unit = js.native
  }
  
  trait MosaicWindowActions extends StObject {
    
    /**
      * Enables connecting a different drag source besides the react-mosaic toolbar
      */
    def connectDragSource(connectedElements: ReactElement): ReactElement | Null
    
    /**
      * Returns the path to this window
      */
    def getPath(): MosaicPath
    
    /**
      * Fails if no `createNode()` is defined
      * Convenience function to call `createNode()` and replace the current node with it.
      */
    def replaceWithNew(args: Any*): js.Promise[Unit]
    
    /**
      * Sets the open state for the tray that holds additional controls
      */
    def setAdditionalControlsOpen(open: Boolean): Unit
    
    /**
      * Fails if no `createNode()` is defined
      * Creates a new node and splits the current node.
      * The current node becomes the `first` and the new node the `second` of the result.
      * `direction` is chosen by querying the DOM and splitting along the longer axis
      */
    def split(args: Any*): js.Promise[Unit]
  }
  object MosaicWindowActions {
    
    inline def apply(
      connectDragSource: ReactElement => ReactElement | Null,
      getPath: () => MosaicPath,
      replaceWithNew: /* repeated */ Any => js.Promise[Unit],
      setAdditionalControlsOpen: Boolean => Unit,
      split: /* repeated */ Any => js.Promise[Unit]
    ): MosaicWindowActions = {
      val __obj = js.Dynamic.literal(connectDragSource = js.Any.fromFunction1(connectDragSource), getPath = js.Any.fromFunction0(getPath), replaceWithNew = js.Any.fromFunction1(replaceWithNew), setAdditionalControlsOpen = js.Any.fromFunction1(setAdditionalControlsOpen), split = js.Any.fromFunction1(split))
      __obj.asInstanceOf[MosaicWindowActions]
    }
    
    extension [Self <: MosaicWindowActions](x: Self) {
      
      inline def setConnectDragSource(value: ReactElement => ReactElement | Null): Self = StObject.set(x, "connectDragSource", js.Any.fromFunction1(value))
      
      inline def setGetPath(value: () => MosaicPath): Self = StObject.set(x, "getPath", js.Any.fromFunction0(value))
      
      inline def setReplaceWithNew(value: /* repeated */ Any => js.Promise[Unit]): Self = StObject.set(x, "replaceWithNew", js.Any.fromFunction1(value))
      
      inline def setSetAdditionalControlsOpen(value: Boolean => Unit): Self = StObject.set(x, "setAdditionalControlsOpen", js.Any.fromFunction1(value))
      
      inline def setSplit(value: /* repeated */ Any => js.Promise[Unit]): Self = StObject.set(x, "split", js.Any.fromFunction1(value))
    }
  }
}
