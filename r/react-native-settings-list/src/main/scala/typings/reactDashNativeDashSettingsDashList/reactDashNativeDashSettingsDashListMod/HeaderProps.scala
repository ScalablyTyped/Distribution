package typings.reactDashNativeDashSettingsDashList.reactDashNativeDashSettingsDashListMod

import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.TextStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeaderProps extends js.Object {
  /**
    * default: 1
    */
  var headerNumberOfLines: js.UndefOr[Double] = js.undefined
  var headerRef: js.UndefOr[js.Function0[Unit]] = js.undefined
  var headerStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var headerText: js.UndefOr[String] = js.undefined
}

object HeaderProps {
  @scala.inline
  def apply(
    headerNumberOfLines: Int | Double = null,
    headerRef: () => Unit = null,
    headerStyle: StyleProp[TextStyle] = null,
    headerText: String = null
  ): HeaderProps = {
    val __obj = js.Dynamic.literal()
    if (headerNumberOfLines != null) __obj.updateDynamic("headerNumberOfLines")(headerNumberOfLines.asInstanceOf[js.Any])
    if (headerRef != null) __obj.updateDynamic("headerRef")(js.Any.fromFunction0(headerRef))
    if (headerStyle != null) __obj.updateDynamic("headerStyle")(headerStyle.asInstanceOf[js.Any])
    if (headerText != null) __obj.updateDynamic("headerText")(headerText)
    __obj.asInstanceOf[HeaderProps]
  }
}

