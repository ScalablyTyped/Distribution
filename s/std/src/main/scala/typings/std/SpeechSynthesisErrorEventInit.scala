package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpeechSynthesisErrorEventInit extends SpeechSynthesisEventInit {
  var error: SpeechSynthesisErrorCode
}

object SpeechSynthesisErrorEventInit {
  @scala.inline
  def apply(
    error: SpeechSynthesisErrorCode,
    utterance: SpeechSynthesisUtterance,
    bubbles: js.UndefOr[scala.Boolean] = js.undefined,
    cancelable: js.UndefOr[scala.Boolean] = js.undefined,
    charIndex: js.UndefOr[Double] = js.undefined,
    charLength: js.UndefOr[Double] = js.undefined,
    composed: js.UndefOr[scala.Boolean] = js.undefined,
    elapsedTime: js.UndefOr[Double] = js.undefined,
    name: java.lang.String = null
  ): SpeechSynthesisErrorEventInit = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], utterance = utterance.asInstanceOf[js.Any])
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(charIndex)) __obj.updateDynamic("charIndex")(charIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(charLength)) __obj.updateDynamic("charLength")(charLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(elapsedTime)) __obj.updateDynamic("elapsedTime")(elapsedTime.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeechSynthesisErrorEventInit]
  }
}

