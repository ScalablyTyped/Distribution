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
    charIndex: js.UndefOr[Double] = js.undefined,
    charLength: js.UndefOr[Double] = js.undefined,
    composed: js.UndefOr[scala.Boolean] = js.undefined,
    elapsedTime: js.UndefOr[Double] = js.undefined,
    name: java.lang.String = null
  ): SpeechSynthesisEventInit = {
    val __obj = js.Dynamic.literal(utterance = utterance.asInstanceOf[js.Any])
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(charIndex)) __obj.updateDynamic("charIndex")(charIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(charLength)) __obj.updateDynamic("charLength")(charLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(elapsedTime)) __obj.updateDynamic("elapsedTime")(elapsedTime.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeechSynthesisEventInit]
  }
}

