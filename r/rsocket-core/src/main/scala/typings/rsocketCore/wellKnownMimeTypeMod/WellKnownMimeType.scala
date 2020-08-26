package typings.rsocketCore.wellKnownMimeTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WellKnownMimeType extends js.Object {
  /** @return the byte identifier of the mime type, guaranteed to be positive or zero. */
  val identifier: Double = js.native
  /**
    * @return the mime type represented as a {@link String}, which is made of US_ASCII compatible
    *     characters only
    */
  val string: String = js.native
}

object WellKnownMimeType {
  @scala.inline
  def apply(identifier: Double, string: String): WellKnownMimeType = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
    __obj.asInstanceOf[WellKnownMimeType]
  }
  @scala.inline
  implicit class WellKnownMimeTypeOps[Self <: WellKnownMimeType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIdentifier(value: Double): Self = this.set("identifier", value.asInstanceOf[js.Any])
    @scala.inline
    def setString(value: String): Self = this.set("string", value.asInstanceOf[js.Any])
  }
  
}

