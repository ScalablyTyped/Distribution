package typings.sparkly.mod

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
  def apply(
    maximum: js.UndefOr[Double] = js.undefined,
    minimum: js.UndefOr[Double] = js.undefined,
    style: fire = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maximum)) __obj.updateDynamic("maximum")(maximum.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minimum)) __obj.updateDynamic("minimum")(minimum.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

