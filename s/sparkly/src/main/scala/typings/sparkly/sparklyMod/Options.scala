package typings.sparkly.sparklyMod

import typings.sparkly.sparklyStrings.fire
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		Maximum range.
  		*/
  val maximum: js.UndefOr[Double] = js.undefined
  /**
  		Minimum range.
  		*/
  val minimum: js.UndefOr[Double] = js.undefined
  /**
  		Style for the sparklines.
  		*/
  val style: js.UndefOr[fire] = js.undefined
}

object Options {
  @scala.inline
  def apply(maximum: Int | Double = null, minimum: Int | Double = null, style: fire = null): Options = {
    val __obj = js.Dynamic.literal()
    if (maximum != null) __obj.updateDynamic("maximum")(maximum.asInstanceOf[js.Any])
    if (minimum != null) __obj.updateDynamic("minimum")(minimum.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[Options]
  }
}

