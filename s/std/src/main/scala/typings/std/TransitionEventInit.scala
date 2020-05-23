package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitionEventInit extends EventInit {
  var elapsedTime: js.UndefOr[Double] = js.undefined
  var propertyName: js.UndefOr[java.lang.String] = js.undefined
  var pseudoElement: js.UndefOr[java.lang.String] = js.undefined
}

object TransitionEventInit {
  @scala.inline
  def apply(
    bubbles: js.UndefOr[scala.Boolean] = js.undefined,
    cancelable: js.UndefOr[scala.Boolean] = js.undefined,
    composed: js.UndefOr[scala.Boolean] = js.undefined,
    elapsedTime: js.UndefOr[Double] = js.undefined,
    propertyName: java.lang.String = null,
    pseudoElement: java.lang.String = null
  ): TransitionEventInit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(elapsedTime)) __obj.updateDynamic("elapsedTime")(elapsedTime.get.asInstanceOf[js.Any])
    if (propertyName != null) __obj.updateDynamic("propertyName")(propertyName.asInstanceOf[js.Any])
    if (pseudoElement != null) __obj.updateDynamic("pseudoElement")(pseudoElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionEventInit]
  }
}

