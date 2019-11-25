package typings.ractive.ractiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SanitizeOpts extends js.Object {
  /** A list of element names to remove from the template. */
  var elements: js.Array[String]
  /** Whether or not to remove DOM event listener attributes, like onclick, from the template. */
  var eventAttributes: js.UndefOr[Boolean] = js.undefined
}

object SanitizeOpts {
  @scala.inline
  def apply(elements: js.Array[String], eventAttributes: js.UndefOr[Boolean] = js.undefined): SanitizeOpts = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    if (!js.isUndefined(eventAttributes)) __obj.updateDynamic("eventAttributes")(eventAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SanitizeOpts]
  }
}

