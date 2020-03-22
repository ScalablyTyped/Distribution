package typings.reactNavigationStack.vendorTypesMod

import typings.reactNative.mod.LayoutChangeEvent
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackHeaderTitleProps extends js.Object {
  /**
    * Whether title font should scale to respect Text Size accessibility settings.
    */
  var allowFontScaling: js.UndefOr[Boolean] = js.undefined
  /**
    * Content of the title element. Usually the title string.
    */
  var children: js.UndefOr[String] = js.undefined
  /**
    * Style object for the title element.
    */
  var style: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  /**
    * Tint color for the header.
    */
  var tintColor: js.UndefOr[String] = js.undefined
  /**
    * Callback to trigger when the size of the title element changes.
    */
  def onLayout(e: LayoutChangeEvent): Unit
}

object StackHeaderTitleProps {
  @scala.inline
  def apply(
    onLayout: LayoutChangeEvent => Unit,
    allowFontScaling: js.UndefOr[Boolean] = js.undefined,
    children: String = null,
    style: StyleProp[TextStyle] = null,
    tintColor: String = null
  ): StackHeaderTitleProps = {
    val __obj = js.Dynamic.literal(onLayout = js.Any.fromFunction1(onLayout))
    if (!js.isUndefined(allowFontScaling)) __obj.updateDynamic("allowFontScaling")(allowFontScaling.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tintColor != null) __obj.updateDynamic("tintColor")(tintColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackHeaderTitleProps]
  }
}

