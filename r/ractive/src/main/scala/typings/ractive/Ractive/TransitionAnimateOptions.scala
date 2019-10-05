package typings.ractive.Ractive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitionAnimateOptions extends js.Object {
  // TODO: Do it have default value?
  var delay: Double
  // TODO: Do it have default value?
  var duration: Double
  // Any valid CSS timing function
  // Default 'linear'
  var easing: js.UndefOr[String] = js.undefined
}

object TransitionAnimateOptions {
  @scala.inline
  def apply(delay: Double, duration: Double, easing: String = null): TransitionAnimateOptions = {
    val __obj = js.Dynamic.literal(delay = delay, duration = duration)
    if (easing != null) __obj.updateDynamic("easing")(easing)
    __obj.asInstanceOf[TransitionAnimateOptions]
  }
}

