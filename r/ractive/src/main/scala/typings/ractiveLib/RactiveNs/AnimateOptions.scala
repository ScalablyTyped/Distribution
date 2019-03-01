package typings
package ractiveLib.RactiveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimateOptions extends js.Object {
   // TODO: void?
  // TODO: number as type correct?
  var complate: js.UndefOr[js.Function2[/* t */ scala.Double, /* value */ scala.Double, scala.Unit]] = js.undefined
  var duration: js.UndefOr[scala.Double] = js.undefined
  var easing: js.UndefOr[java.lang.String | js.Function] = js.undefined
  // TODO: number as type correct?
  var step: js.UndefOr[js.Function2[/* t */ scala.Double, /* value */ scala.Double, scala.Unit]] = js.undefined
}

object AnimateOptions {
  @scala.inline
  def apply(
    complate: js.Function2[/* t */ scala.Double, /* value */ scala.Double, scala.Unit] = null,
    duration: scala.Int | scala.Double = null,
    easing: java.lang.String | js.Function = null,
    step: js.Function2[/* t */ scala.Double, /* value */ scala.Double, scala.Unit] = null
  ): AnimateOptions = {
    val __obj = js.Dynamic.literal()
    if (complate != null) __obj.updateDynamic("complate")(complate)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step)
    __obj.asInstanceOf[AnimateOptions]
  }
}

