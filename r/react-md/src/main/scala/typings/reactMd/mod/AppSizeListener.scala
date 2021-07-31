package typings.reactMd.mod

import typings.react.mod.ReactElement
import typings.reactMdUtils.appSizeListenerMod.AppSizeListenerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AppSizeListener {
  
  @scala.inline
  def apply(
    hasChildrenOnChangePhoneMaxWidthTabletMinWidthTabletMaxWidthDesktopMinWidthDesktopLargeMinWidthDefaultSize: AppSizeListenerProps
  ): ReactElement = ^.asInstanceOf[js.Dynamic].apply(hasChildrenOnChangePhoneMaxWidthTabletMinWidthTabletMaxWidthDesktopMinWidthDesktopLargeMinWidthDefaultSize.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  @JSImport("react-md", "AppSizeListener")
  @js.native
  val ^ : js.Any = js.native
  
  object propTypes {
    
    @JSImport("react-md", "AppSizeListener.propTypes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-md", "AppSizeListener.propTypes.children")
    @js.native
    def children: js.Any = js.native
    @scala.inline
    def children_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
    
    @JSImport("react-md", "AppSizeListener.propTypes.defaultSize")
    @js.native
    def defaultSize: js.Any = js.native
    @scala.inline
    def defaultSize_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultSize")(x.asInstanceOf[js.Any])
    
    @JSImport("react-md", "AppSizeListener.propTypes.desktopLargeMinWidth")
    @js.native
    def desktopLargeMinWidth: js.Any = js.native
    @scala.inline
    def desktopLargeMinWidth_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("desktopLargeMinWidth")(x.asInstanceOf[js.Any])
    
    @JSImport("react-md", "AppSizeListener.propTypes.desktopMinWidth")
    @js.native
    def desktopMinWidth: js.Any = js.native
    @scala.inline
    def desktopMinWidth_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("desktopMinWidth")(x.asInstanceOf[js.Any])
    
    @JSImport("react-md", "AppSizeListener.propTypes.onChange")
    @js.native
    def onChange: js.Any = js.native
    @scala.inline
    def onChange_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onChange")(x.asInstanceOf[js.Any])
    
    @JSImport("react-md", "AppSizeListener.propTypes.phoneMaxWidth")
    @js.native
    def phoneMaxWidth: js.Any = js.native
    @scala.inline
    def phoneMaxWidth_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("phoneMaxWidth")(x.asInstanceOf[js.Any])
    
    @JSImport("react-md", "AppSizeListener.propTypes.tabletMaxWidth")
    @js.native
    def tabletMaxWidth: js.Any = js.native
    @scala.inline
    def tabletMaxWidth_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tabletMaxWidth")(x.asInstanceOf[js.Any])
    
    @JSImport("react-md", "AppSizeListener.propTypes.tabletMinWidth")
    @js.native
    def tabletMinWidth: js.Any = js.native
    @scala.inline
    def tabletMinWidth_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tabletMinWidth")(x.asInstanceOf[js.Any])
  }
}
