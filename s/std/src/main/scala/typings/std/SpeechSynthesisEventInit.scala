package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpeechSynthesisEventInit extends EventInit {
  var charIndex: js.UndefOr[Double] = js.undefined
  var charLength: js.UndefOr[Double] = js.undefined
  var elapsedTime: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var utterance: SpeechSynthesisUtterance
}

object SpeechSynthesisEventInit {
  @scala.inline
  def apply(
    utterance: SpeechSynthesisUtterance,
    bubbles: js.UndefOr[scala.Boolean] = js.undefined,
    cancelable: js.UndefOr[scala.Boolean] = js.undefined,
    charIndex: Int | Double = null,
    charLength: Int | Double = null,
    composed: js.UndefOr[scala.Boolean] = js.undefined,
    elapsedTime: Int | Double = null,
    name: java.lang.String = null
  ): SpeechSynthesisEventInit = {
    val __obj = js.Dynamic.literal(utterance = utterance.asInstanceOf[js.Any])
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable.asInstanceOf[js.Any])
    if (charIndex != null) __obj.updateDynamic("charIndex")(charIndex.asInstanceOf[js.Any])
    if (charLength != null) __obj.updateDynamic("charLength")(charLength.asInstanceOf[js.Any])
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed.asInstanceOf[js.Any])
    if (elapsedTime != null) __obj.updateDynamic("elapsedTime")(elapsedTime.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeechSynthesisEventInit]
  }
}

