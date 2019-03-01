package typings
package ractiveLib.RactiveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitionAnimateOptions extends js.Object {
  // TODO: Do it have default value?
  var delay: scala.Double
  // TODO: Do it have default value?
  var duration: scala.Double
  // Any valid CSS timing function
  // Default 'linear'
  var easing: js.UndefOr[java.lang.String] = js.undefined
}

object TransitionAnimateOptions {
  @scala.inline
  def apply(delay: scala.Double, duration: scala.Double, easing: java.lang.String = null): TransitionAnimateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delay")(delay)
    __obj.updateDynamic("duration")(duration)
    if (easing != null) __obj.updateDynamic("easing")(easing)
    __obj.asInstanceOf[TransitionAnimateOptions]
  }
}

