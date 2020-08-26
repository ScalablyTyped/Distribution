package typings.ractive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SanitizeOpts extends js.Object {
  /** A list of element names to remove from the template. */
  var elements: js.Array[String] = js.native
  /** Whether or not to remove DOM event listener attributes, like onclick, from the template. */
  var eventAttributes: js.UndefOr[Boolean] = js.native
}

object SanitizeOpts {
  @scala.inline
  def apply(elements: js.Array[String]): SanitizeOpts = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.asInstanceOf[SanitizeOpts]
  }
  @scala.inline
  implicit class SanitizeOptsOps[Self <: SanitizeOpts] (val x: Self) extends AnyVal {
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
    def setElementsVarargs(value: String*): Self = this.set("elements", js.Array(value :_*))
    @scala.inline
    def setElements(value: js.Array[String]): Self = this.set("elements", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventAttributes(value: Boolean): Self = this.set("eventAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventAttributes: Self = this.set("eventAttributes", js.undefined)
  }
  
}

