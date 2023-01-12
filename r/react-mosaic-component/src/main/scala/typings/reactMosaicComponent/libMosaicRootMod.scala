package typings.reactMosaicComponent

import typings.react.mod.Context
import typings.react.mod.PureComponent
import typings.react.mod.global.JSX.Element
import typings.reactMosaicComponent.libContextTypesMod.MosaicContext
import typings.reactMosaicComponent.libTypesMod.MosaicBranch
import typings.reactMosaicComponent.libTypesMod.MosaicKey
import typings.reactMosaicComponent.libTypesMod.MosaicNode
import typings.reactMosaicComponent.libTypesMod.ResizeOptions
import typings.reactMosaicComponent.libTypesMod.TileRenderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMosaicRootMod {
  
  @JSImport("react-mosaic-component/lib/MosaicRoot", "MosaicRoot")
  @js.native
  open class MosaicRoot[T /* <: MosaicKey */] protected ()
    extends PureComponent[MosaicRootProps[T], js.Object, Any] {
    def this(props: MosaicRootProps[T]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: MosaicRootProps[T], context: Any) = this()
    
    @JSName("context")
    var context_MosaicRoot: MosaicContext[T] = js.native
    
    /* private */ var onResize: Any = js.native
    
    /* private */ var renderRecursively: Any = js.native
    
    /* private */ var renderSplit: Any = js.native
  }
  /* static members */
  object MosaicRoot {
    
    @JSImport("react-mosaic-component/lib/MosaicRoot", "MosaicRoot")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-mosaic-component/lib/MosaicRoot", "MosaicRoot.contextType")
    @js.native
    def contextType: Context[MosaicContext[MosaicKey]] = js.native
    inline def contextType_=(x: Context[MosaicContext[MosaicKey]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
  }
  
  trait MosaicRootProps[T /* <: MosaicKey */] extends StObject {
    
    var renderTile: TileRenderer[T]
    
    var resize: js.UndefOr[ResizeOptions] = js.undefined
    
    var root: MosaicNode[T]
  }
  object MosaicRootProps {
    
    inline def apply[T /* <: MosaicKey */](renderTile: (T, /* path */ js.Array[MosaicBranch]) => Element, root: MosaicNode[T]): MosaicRootProps[T] = {
      val __obj = js.Dynamic.literal(renderTile = js.Any.fromFunction2(renderTile), root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[MosaicRootProps[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MosaicRootProps[?], T /* <: MosaicKey */] (val x: Self & MosaicRootProps[T]) extends AnyVal {
      
      inline def setRenderTile(value: (T, /* path */ js.Array[MosaicBranch]) => Element): Self = StObject.set(x, "renderTile", js.Any.fromFunction2(value))
      
      inline def setResize(value: ResizeOptions): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
      
      inline def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
      
      inline def setRoot(value: MosaicNode[T]): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
