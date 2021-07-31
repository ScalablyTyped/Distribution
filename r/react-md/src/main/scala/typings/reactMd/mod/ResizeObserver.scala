package typings.reactMd.mod

import typings.react.mod.ReactElement
import typings.reactMdUtils.resizeObserverMod.ResizeObserverProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ResizeObserver {
  
  @scala.inline
  def apply(hasDisableHeightDisableWidthClassNameComponentTargetOnResize: ResizeObserverProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].apply(hasDisableHeightDisableWidthClassNameComponentTargetOnResize.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
  
  @JSImport("react-md", "ResizeObserver")
  @js.native
  val ^ : js.Any = js.native
  
  object propTypes {
    
    @JSImport("react-md", "ResizeObserver.propTypes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-md", "ResizeObserver.propTypes.className")
    @js.native
    def className: js.Any = js.native
    @scala.inline
    def className_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
    
    @JSImport("react-md", "ResizeObserver.propTypes.component")
    @js.native
    def component: js.Any = js.native
    @scala.inline
    def component_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("component")(x.asInstanceOf[js.Any])
    
    @JSImport("react-md", "ResizeObserver.propTypes.disableHeight")
    @js.native
    def disableHeight: js.Any = js.native
    @scala.inline
    def disableHeight_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disableHeight")(x.asInstanceOf[js.Any])
    
    @JSImport("react-md", "ResizeObserver.propTypes.disableWidth")
    @js.native
    def disableWidth: js.Any = js.native
    @scala.inline
    def disableWidth_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disableWidth")(x.asInstanceOf[js.Any])
    
    @JSImport("react-md", "ResizeObserver.propTypes.target")
    @js.native
    def target: js.Any = js.native
    @scala.inline
    def target_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("target")(x.asInstanceOf[js.Any])
  }
}
