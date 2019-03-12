package typings
package reactDashNativeDashSettingsDashListLib.reactDashNativeDashSettingsDashListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeaderProps extends js.Object {
  /**
    * default: 1
    */
  var headerNumberOfLines: js.UndefOr[scala.Double] = js.undefined
  var headerRef: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var headerStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle]
  ] = js.undefined
  var headerText: js.UndefOr[java.lang.String] = js.undefined
}

object HeaderProps {
  @scala.inline
  def apply(
    headerNumberOfLines: scala.Int | scala.Double = null,
    headerRef: () => scala.Unit = null,
    headerStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle] = null,
    headerText: java.lang.String = null
  ): HeaderProps = {
    val __obj = js.Dynamic.literal()
    if (headerNumberOfLines != null) __obj.updateDynamic("headerNumberOfLines")(headerNumberOfLines.asInstanceOf[js.Any])
    if (headerRef != null) __obj.updateDynamic("headerRef")(js.Any.fromFunction0(headerRef))
    if (headerStyle != null) __obj.updateDynamic("headerStyle")(headerStyle.asInstanceOf[js.Any])
    if (headerText != null) __obj.updateDynamic("headerText")(headerText)
    __obj.asInstanceOf[HeaderProps]
  }
}

