package typings.rsocketCore.wellKnownMimeTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WellKnownMimeType extends js.Object {
  /** @return the byte identifier of the mime type, guaranteed to be positive or zero. */
  val identifier: Double
  /**
    * @return the mime type represented as a {@link String}, which is made of US_ASCII compatible
    *     characters only
    */
  val string: String
}

object WellKnownMimeType {
  @scala.inline
  def apply(identifier: Double, string: String): WellKnownMimeType = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WellKnownMimeType]
  }
}

