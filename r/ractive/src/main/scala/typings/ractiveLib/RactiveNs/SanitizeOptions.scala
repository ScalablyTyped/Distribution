package typings
package ractiveLib.RactiveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SanitizeOptions extends js.Object {
  var elements: js.Array[java.lang.String]
  // TODO: Undocumented what default value is, but probably false
  var eventAttributes: js.UndefOr[scala.Boolean] = js.undefined
}

object SanitizeOptions {
  @scala.inline
  def apply(elements: js.Array[java.lang.String], eventAttributes: js.UndefOr[scala.Boolean] = js.undefined): SanitizeOptions = {
    val __obj = js.Dynamic.literal(elements = elements)
    if (!js.isUndefined(eventAttributes)) __obj.updateDynamic("eventAttributes")(eventAttributes)
    __obj.asInstanceOf[SanitizeOptions]
  }
}

