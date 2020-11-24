package typings.reactNativeTabNavigator.mod

import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabNavigatorProps extends js.Object {
  
  /**
    * Disable onPress opacity for Tab
    *
    * @default false
    */
  var hidesTabTouch: js.UndefOr[Boolean] = js.native
  
  /**
    * Define for rendered scene
    */
  var sceneStyle: js.UndefOr[ViewStyle] = js.native
  
  /**
    * Define shadow style for tabBar
    */
  var tabBarShadowStyle: js.UndefOr[ViewStyle] = js.native
  
  /**
    * Define style for TabBar
    */
  var tabBarStyle: js.UndefOr[ViewStyle] = js.native
}
object TabNavigatorProps {
  
  @scala.inline
  def apply(): TabNavigatorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabNavigatorProps]
  }
  
  @scala.inline
  implicit class TabNavigatorPropsOps[Self <: TabNavigatorProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHidesTabTouch(value: Boolean): Self = this.set("hidesTabTouch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHidesTabTouch: Self = this.set("hidesTabTouch", js.undefined)
    
    @scala.inline
    def setSceneStyle(value: ViewStyle): Self = this.set("sceneStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSceneStyle: Self = this.set("sceneStyle", js.undefined)
    
    @scala.inline
    def setTabBarShadowStyle(value: ViewStyle): Self = this.set("tabBarShadowStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabBarShadowStyle: Self = this.set("tabBarShadowStyle", js.undefined)
    
    @scala.inline
    def setTabBarStyle(value: ViewStyle): Self = this.set("tabBarStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabBarStyle: Self = this.set("tabBarStyle", js.undefined)
  }
}
