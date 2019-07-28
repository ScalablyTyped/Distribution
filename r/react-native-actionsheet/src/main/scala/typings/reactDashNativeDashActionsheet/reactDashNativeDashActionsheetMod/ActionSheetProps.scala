package typings.reactDashNativeDashActionsheet.reactDashNativeDashActionsheetMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionSheetProps extends js.Object {
  var cancelButtonIndex: js.UndefOr[Double] = js.undefined
  var destructiveButtonIndex: js.UndefOr[Double] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  var options: js.Array[ReactNode]
  var styles: js.UndefOr[js.Object] = js.undefined
  var tintColor: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  def onPress(index: Double): Unit
}

object ActionSheetProps {
  @scala.inline
  def apply(
    onPress: Double => Unit,
    options: js.Array[ReactNode],
    cancelButtonIndex: Int | Double = null,
    destructiveButtonIndex: Int | Double = null,
    message: String = null,
    styles: js.Object = null,
    tintColor: String = null,
    title: String = null
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

