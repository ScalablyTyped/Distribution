package typings
package sparklyLib.sparklyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		Maximum range.
  		*/
  val maximum: js.UndefOr[scala.Double] = js.undefined
  /**
  		Minimum range.
  		*/
  val minimum: js.UndefOr[scala.Double] = js.undefined
  /**
  		Style for the sparklines.
  		*/
  val style: js.UndefOr[sparklyLib.sparklyLibStrings.fire] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    maximum: scala.Int | scala.Double = null,
    minimum: scala.Int | scala.Double = null,
    style: sparklyLib.sparklyLibStrings.fire = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (maximum != null) __obj.updateDynamic("maximum")(maximum.asInstanceOf[js.Any])
    if (minimum != null) __obj.updateDynamic("minimum")(minimum.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[Options]
  }
}

