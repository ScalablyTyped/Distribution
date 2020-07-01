package typings.reactTypingEffect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactTypingEffectProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var cursor: js.UndefOr[String] = js.undefined
  var cursorClassName: js.UndefOr[String] = js.undefined
  var eraseDelay: js.UndefOr[Double] = js.undefined
  var speed: js.UndefOr[Double] = js.undefined
  var staticText: js.UndefOr[String] = js.undefined
  var text: String | js.Array[String]
  var typingDelay: js.UndefOr[Double] = js.undefined
}

object ReactTypingEffectProps {
  @scala.inline
  def apply(
    text: String | js.Array[String],
    className: String = null,
    cursor: String = null,
    cursorClassName: String = null,
    eraseDelay: js.UndefOr[Double] = js.undefined,
    speed: js.UndefOr[Double] = js.undefined,
    staticText: String = null,
    typingDelay: js.UndefOr[Double] = js.undefined
  ): ReactTypingEffectProps = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (cursorClassName != null) __obj.updateDynamic("cursorClassName")(cursorClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(eraseDelay)) __obj.updateDynamic("eraseDelay")(eraseDelay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(speed)) __obj.updateDynamic("speed")(speed.get.asInstanceOf[js.Any])
    if (staticText != null) __obj.updateDynamic("staticText")(staticText.asInstanceOf[js.Any])
    if (!js.isUndefined(typingDelay)) __obj.updateDynamic("typingDelay")(typingDelay.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactTypingEffectProps]
  }
}

