package typings
package reactDashNativeDashActionsheetLib.reactDashNativeDashActionsheetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionSheetProps extends js.Object {
  var cancelButtonIndex: js.UndefOr[scala.Double] = js.undefined
  var destructiveButtonIndex: js.UndefOr[scala.Double] = js.undefined
  var message: js.UndefOr[java.lang.String] = js.undefined
  var options: js.Array[reactLib.reactMod.ReactNode]
  var styles: js.UndefOr[js.Object] = js.undefined
  var tintColor: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  def onPress(index: scala.Double): scala.Unit
}

object ActionSheetProps {
  @scala.inline
  def apply(
    onPress: scala.Double => scala.Unit,
    options: js.Array[reactLib.reactMod.ReactNode],
    cancelButtonIndex: scala.Int | scala.Double = null,
    destructiveButtonIndex: scala.Int | scala.Double = null,
    message: java.lang.String = null,
    styles: js.Object = null,
    tintColor: java.lang.String = null,
    title: java.lang.String = null
  ): ActionSheetProps = {
    val __obj = js.Dynamic.literal(onPress = js.Any.fromFunction1(onPress), options = options)
    if (cancelButtonIndex != null) __obj.updateDynamic("cancelButtonIndex")(cancelButtonIndex.asInstanceOf[js.Any])
    if (destructiveButtonIndex != null) __obj.updateDynamic("destructiveButtonIndex")(destructiveButtonIndex.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message)
    if (styles != null) __obj.updateDynamic("styles")(styles)
    if (tintColor != null) __obj.updateDynamic("tintColor")(tintColor)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[ActionSheetProps]
  }
}

