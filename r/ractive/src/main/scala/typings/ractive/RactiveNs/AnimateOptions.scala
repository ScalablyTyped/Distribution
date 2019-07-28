package typings.ractive.RactiveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimateOptions extends js.Object {
   // TODO: void?
  // TODO: number as type correct?
  var complate: js.UndefOr[js.Function2[/* t */ Double, /* value */ Double, Unit]] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var easing: js.UndefOr[String | js.Function] = js.undefined
  // TODO: number as type correct?
  var step: js.UndefOr[js.Function2[/* t */ Double, /* value */ Double, Unit]] = js.undefined
}

object AnimateOptions {
  @scala.inline
  def apply(
    complate: (/* t */ Double, /* value */ Double) => Unit = null,
    duration: Int | Double = null,
    easing: String | js.Function = null,
    step: (/* t */ Double, /* value */ Double) => Unit = null
  ): AnimateOptions = {
    val __obj = js.Dynamic.literal()
    if (complate != null) __obj.updateDynamic("complate")(js.Any.fromFunction2(complate))
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(js.Any.fromFunction2(step))
    __obj.asInstanceOf[AnimateOptions]
  }
}

