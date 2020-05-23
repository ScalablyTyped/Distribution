package typings.reactNativeActionsheet.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionSheetCustomProps extends js.Object {
  var buttonUnderlayColor: js.UndefOr[String] = js.undefined
  var cancelButtonIndex: js.UndefOr[Double] = js.undefined
  var destructiveButtonIndex: js.UndefOr[Double] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  var options: js.Array[ReactNode]
  var styles: js.UndefOr[js.Object] = js.undefined
  var tintColor: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[ReactNode] = js.undefined
  def onPress(index: Double): Unit
}

object ActionSheetCustomProps {
  @scala.inline
  def apply(
    onPress: Double => Unit,
    options: js.Array[ReactNode],
    buttonUnderlayColor: String = null,
    cancelButtonIndex: js.UndefOr[Double] = js.undefined,
    destructiveButtonIndex: js.UndefOr[Double] = js.undefined,
    message: String = null,
    styles: js.Object = null,
    tintColor: String = null,
    title: ReactNode = null
  ): ActionSheetCustomProps = {
    val __obj = js.Dynamic.literal(onPress = js.Any.fromFunction1(onPress), options = options.asInstanceOf[js.Any])
    if (buttonUnderlayColor != null) __obj.updateDynamic("buttonUnderlayColor")(buttonUnderlayColor.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelButtonIndex)) __obj.updateDynamic("cancelButtonIndex")(cancelButtonIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(destructiveButtonIndex)) __obj.updateDynamic("destructiveButtonIndex")(destructiveButtonIndex.get.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (tintColor != null) __obj.updateDynamic("tintColor")(tintColor.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionSheetCustomProps]
  }
}

