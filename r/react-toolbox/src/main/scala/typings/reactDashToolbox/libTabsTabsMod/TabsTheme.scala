package typings.reactDashToolbox.libTabsTabsMod

import typings.reactDashToolbox.libTabsTabMod.TabTheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.reactDashToolbox.libTabsTabContentMod.TabContentTheme because var conflicts: active. Inlined tab */ trait TabsTheme extends TabTheme {
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
    if (active != null) __obj.updateDynamic("active")(active)
    if (arrow != null) __obj.updateDynamic("arrow")(arrow)
    if (arrowContainer != null) __obj.updateDynamic("arrowContainer")(arrowContainer)
    if (disableAnimation != null) __obj.updateDynamic("disableAnimation")(disableAnimation)
    if (disabled != null) __obj.updateDynamic("disabled")(disabled)
    if (fixed != null) __obj.updateDynamic("fixed")(fixed)
    if (hidden != null) __obj.updateDynamic("hidden")(hidden)
    if (inverse != null) __obj.updateDynamic("inverse")(inverse)
    if (label != null) __obj.updateDynamic("label")(label)
    if (navigation != null) __obj.updateDynamic("navigation")(navigation)
    if (navigationContainer != null) __obj.updateDynamic("navigationContainer")(navigationContainer)
    if (pointer != null) __obj.updateDynamic("pointer")(pointer)
    if (tab != null) __obj.updateDynamic("tab")(tab)
    if (tabs != null) __obj.updateDynamic("tabs")(tabs)
    if (withIcon != null) __obj.updateDynamic("withIcon")(withIcon)
    if (withText != null) __obj.updateDynamic("withText")(withText)
    __obj.asInstanceOf[TabsTheme]
  }
}

