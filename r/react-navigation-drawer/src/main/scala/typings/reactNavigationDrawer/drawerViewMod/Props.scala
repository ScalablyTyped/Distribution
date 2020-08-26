package typings.reactNavigationDrawer.drawerViewMod

import typings.reactNavigation.mod.NavigationParams
import typings.reactNavigation.mod.NavigationScreenProp
import typings.reactNavigationDrawer.anon.DrawerOptionscontentCompo
import typings.reactNavigationDrawer.typesMod.NavigationDrawerState
import typings.reactNavigationDrawer.typesMod.SceneDescriptorMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props extends js.Object {
  var descriptors: SceneDescriptorMap = js.native
  var `lazy`: Boolean = js.native
  var navigation: NavigationScreenProp[NavigationDrawerState, NavigationParams] = js.native
  var navigationConfig: DrawerOptionscontentCompo = js.native
  var screenProps: js.Any = js.native
}

object Props {
  @scala.inline
  def apply(
    descriptors: SceneDescriptorMap,
    `lazy`: Boolean,
    navigation: NavigationScreenProp[NavigationDrawerState, NavigationParams],
    navigationConfig: DrawerOptionscontentCompo,
    screenProps: js.Any
  ): Props = {
    val __obj = js.Dynamic.literal(descriptors = descriptors.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], navigationConfig = navigationConfig.asInstanceOf[js.Any], screenProps = screenProps.asInstanceOf[js.Any])
    __obj.updateDynamic("lazy")(`lazy`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
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
    def setDescriptors(value: SceneDescriptorMap): Self = this.set("descriptors", value.asInstanceOf[js.Any])
    @scala.inline
    def setLazy(value: Boolean): Self = this.set("lazy", value.asInstanceOf[js.Any])
    @scala.inline
    def setNavigation(value: NavigationScreenProp[NavigationDrawerState, NavigationParams]): Self = this.set("navigation", value.asInstanceOf[js.Any])
    @scala.inline
    def setNavigationConfig(value: DrawerOptionscontentCompo): Self = this.set("navigationConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def setScreenProps(value: js.Any): Self = this.set("screenProps", value.asInstanceOf[js.Any])
  }
  
}

