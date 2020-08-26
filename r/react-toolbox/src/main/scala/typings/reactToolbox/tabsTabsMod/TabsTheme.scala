package typings.reactToolbox.tabsTabsMod

import typings.reactToolbox.tabMod.TabTheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.reactToolbox.tabContentMod.TabContentTheme because var conflicts: active. Inlined tab */ @js.native
trait TabsTheme extends TabTheme {
  /**
    * Class used for arrows.
    */
  var arrow: js.UndefOr[String] = js.native
  /**
    * Class used for arrow container.
    */
  var arrowContainer: js.UndefOr[String] = js.native
  /**
    * Class used when 'disableAnimatedBottomBorder' is true.
    */
  var disableAnimation: js.UndefOr[String] = js.native
  /**
    * Used to make the 'fixed tabs'.
    */
  var fixed: js.UndefOr[String] = js.native
  /**
    * Used to invert the colors.
    */
  var inverse: js.UndefOr[String] = js.native
  /**
    * Used for the navigation element.
    */
  var navigation: js.UndefOr[String] = js.native
  /**
    * Used for navigation container.
    */
  var navigationContainer: js.UndefOr[String] = js.native
  /**
    * Used for the moving underline element.
    */
  var pointer: js.UndefOr[String] = js.native
  /**
    * Used for the tab content element.
    */
  var tab: js.UndefOr[String] = js.native
  /**
    * Used as a root classname for the component.
    */
  var tabs: js.UndefOr[String] = js.native
}

object TabsTheme {
  @scala.inline
  def apply(): TabsTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabsTheme]
  }
  @scala.inline
  implicit class TabsThemeOps[Self <: TabsTheme] (val x: Self) extends AnyVal {
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
    def setArrow(value: String): Self = this.set("arrow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrow: Self = this.set("arrow", js.undefined)
    @scala.inline
    def setArrowContainer(value: String): Self = this.set("arrowContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrowContainer: Self = this.set("arrowContainer", js.undefined)
    @scala.inline
    def setDisableAnimation(value: String): Self = this.set("disableAnimation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableAnimation: Self = this.set("disableAnimation", js.undefined)
    @scala.inline
    def setFixed(value: String): Self = this.set("fixed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFixed: Self = this.set("fixed", js.undefined)
    @scala.inline
    def setInverse(value: String): Self = this.set("inverse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInverse: Self = this.set("inverse", js.undefined)
    @scala.inline
    def setNavigation(value: String): Self = this.set("navigation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavigation: Self = this.set("navigation", js.undefined)
    @scala.inline
    def setNavigationContainer(value: String): Self = this.set("navigationContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavigationContainer: Self = this.set("navigationContainer", js.undefined)
    @scala.inline
    def setPointer(value: String): Self = this.set("pointer", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePointer: Self = this.set("pointer", js.undefined)
    @scala.inline
    def setTab(value: String): Self = this.set("tab", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTab: Self = this.set("tab", js.undefined)
    @scala.inline
    def setTabs(value: String): Self = this.set("tabs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabs: Self = this.set("tabs", js.undefined)
  }
  
}

