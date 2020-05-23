package typings.rdflib.fetcherMod

import typings.std.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Handler extends js.Object {
  var dom: Document
  var response: ExtendedResponse
}

object Handler {
  @scala.inline
  def apply(dom: Document, response: ExtendedResponse): Handler = {
    val __obj = js.Dynamic.literal(dom = dom.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[Handler]
  }
}

