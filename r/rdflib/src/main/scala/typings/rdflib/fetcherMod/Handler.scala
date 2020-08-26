package typings.rdflib.fetcherMod

import typings.std.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Handler extends js.Object {
  var dom: Document = js.native
  var response: ExtendedResponse = js.native
}

object Handler {
  @scala.inline
  def apply(dom: Document, response: ExtendedResponse): Handler = {
    val __obj = js.Dynamic.literal(dom = dom.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[Handler]
  }
  @scala.inline
  implicit class HandlerOps[Self <: Handler] (val x: Self) extends AnyVal {
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
    def setDom(value: Document): Self = this.set("dom", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: ExtendedResponse): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

