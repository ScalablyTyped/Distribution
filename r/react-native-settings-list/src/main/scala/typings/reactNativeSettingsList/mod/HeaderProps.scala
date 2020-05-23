package typings.reactNativeSettingsList.mod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
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
    headerNumberOfLines: js.UndefOr[Double] = js.undefined,
    headerRef: () => Unit = null,
    headerStyle: js.UndefOr[Null | StyleProp[TextStyle]] = js.undefined,
    headerText: String = null
  ): HeaderProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(headerNumberOfLines)) __obj.updateDynamic("headerNumberOfLines")(headerNumberOfLines.get.asInstanceOf[js.Any])
    if (headerRef != null) __obj.updateDynamic("headerRef")(js.Any.fromFunction0(headerRef))
    if (!js.isUndefined(headerStyle)) __obj.updateDynamic("headerStyle")(headerStyle.asInstanceOf[js.Any])
    if (headerText != null) __obj.updateDynamic("headerText")(headerText.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeaderProps]
  }
}

