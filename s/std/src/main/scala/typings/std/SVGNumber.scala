package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Corresponds to the <number> basic data type. */
trait SVGNumber extends js.Object {
  var value: Double
}

object SVGNumber {
  @scala.inline
  def apply(value: Double): SVGNumber = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGNumber]
  }
}

