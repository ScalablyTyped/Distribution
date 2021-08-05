package typings.reactMd.mod

import typings.reactMdUtils.resizeListenerMod.ResizeListenerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ResizeListener {
  
  inline def apply(hasOnResizeOptionsImmediate: ResizeListenerProps): Null = ^.asInstanceOf[js.Dynamic].apply(hasOnResizeOptionsImmediate.asInstanceOf[js.Any]).asInstanceOf[Null]
  
  @JSImport("react-md", "ResizeListener")
  @js.native
  val ^ : js.Any = js.native
  
  object propTypes {
    
    @JSImport("react-md", "ResizeListener.propTypes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-md", "ResizeListener.propTypes.immediate")
    @js.native
    def immediate: js.Any = js.native
    inline def immediate_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("immediate")(x.asInstanceOf[js.Any])
    
    @JSImport("react-md", "ResizeListener.propTypes.onResize")
    @js.native
    def onResize: js.Any = js.native
    inline def onResize_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onResize")(x.asInstanceOf[js.Any])
    
    @JSImport("react-md", "ResizeListener.propTypes.options")
    @js.native
    def options: js.Any = js.native
    inline def options_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
  }
}
