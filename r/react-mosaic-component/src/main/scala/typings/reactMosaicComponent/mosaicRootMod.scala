package typings.reactMosaicComponent

import typings.react.mod.Context
import typings.react.mod.PureComponent
import typings.react.mod.global.JSX.Element
import typings.reactMosaicComponent.contextTypesMod.MosaicContext
import typings.reactMosaicComponent.typesMod.MosaicBranch
import typings.reactMosaicComponent.typesMod.MosaicKey
import typings.reactMosaicComponent.typesMod.MosaicNode
import typings.reactMosaicComponent.typesMod.ResizeOptions
import typings.reactMosaicComponent.typesMod.TileRenderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mosaicRootMod {
  
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
    
    extension [Self <: MosaicRootProps[?], T /* <: MosaicKey */](x: Self & MosaicRootProps[T]) {
      
      inline def setRenderTile(value: (T, /* path */ js.Array[MosaicBranch]) => Element): Self = StObject.set(x, "renderTile", js.Any.fromFunction2(value))
      
      inline def setResize(value: ResizeOptions): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
      
      inline def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
      
      inline def setRoot(value: MosaicNode[T]): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
