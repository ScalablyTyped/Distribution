package typings.reactToolbox.libTabsTabsMod

import typings.reactToolbox.tabsTabMod.TabTheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.reactToolbox.tabsTabContentMod.TabContentTheme because var conflicts: active. Inlined tab */ trait TabsTheme extends TabTheme {
  /**
    * Class used for arrows.
    */
  var arrow: js.UndefOr[String] = js.undefined
  /**
    * Class used for arrow container.
    */
  var arrowContainer: js.UndefOr[String] = js.undefined
  /**
    * Class used when 'disableAnimatedBottomBorder' is true.
    */
  var disableAnimation: js.UndefOr[String] = js.undefined
  /**
    * Used to make the 'fixed tabs'.
    */
  var fixed: js.UndefOr[String] = js.undefined
  /**
    * Used to invert the colors.
    */
  var inverse: js.UndefOr[String] = js.undefined
  /**
    * Used for the navigation element.
    */
  var navigation: js.UndefOr[String] = js.undefined
  /**
    * Used for navigation container.
    */
  var navigationContainer: js.UndefOr[String] = js.undefined
  /**
    * Used for the moving underline element.
    */
  var pointer: js.UndefOr[String] = js.undefined
  /**
    * Used for the tab content element.
    */
  var tab: js.UndefOr[String] = js.undefined
  /**
    * Used as a root classname for the component.
    */
  var tabs: js.UndefOr[String] = js.undefined
}

object TabsTheme {
  @scala.inline
  def apply(
    active: String = null,
    arrow: String = null,
    arrowContainer: String = null,
    disableAnimation: String = null,
    disabled: String = null,
    fixed: String = null,
    hidden: String = null,
    inverse: String = null,
    label: String = null,
    navigation: String = null,
    navigationContainer: String = null,
    pointer: String = null,
    tab: String = null,
    tabs: String = null,
    withIcon: String = null,
    withText: String = null
  ): TabsTheme = {
    val __obj = js.Dynamic.literal()
    if (active != null) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (arrow != null) __obj.updateDynamic("arrow")(arrow.asInstanceOf[js.Any])
    if (arrowContainer != null) __obj.updateDynamic("arrowContainer")(arrowContainer.asInstanceOf[js.Any])
    if (disableAnimation != null) __obj.updateDynamic("disableAnimation")(disableAnimation.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (fixed != null) __obj.updateDynamic("fixed")(fixed.asInstanceOf[js.Any])
    if (hidden != null) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (inverse != null) __obj.updateDynamic("inverse")(inverse.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (navigation != null) __obj.updateDynamic("navigation")(navigation.asInstanceOf[js.Any])
    if (navigationContainer != null) __obj.updateDynamic("navigationContainer")(navigationContainer.asInstanceOf[js.Any])
    if (pointer != null) __obj.updateDynamic("pointer")(pointer.asInstanceOf[js.Any])
    if (tab != null) __obj.updateDynamic("tab")(tab.asInstanceOf[js.Any])
    if (tabs != null) __obj.updateDynamic("tabs")(tabs.asInstanceOf[js.Any])
    if (withIcon != null) __obj.updateDynamic("withIcon")(withIcon.asInstanceOf[js.Any])
    if (withText != null) __obj.updateDynamic("withText")(withText.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabsTheme]
  }
}

