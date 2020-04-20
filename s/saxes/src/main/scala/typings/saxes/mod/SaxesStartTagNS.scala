package typings.saxes.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Required<saxes.saxes.SaxesStartTag> */
trait SaxesStartTagNS
  extends StartTagForOptions[js.Any] {
  var attributes: Record[String, SaxesAttributeNS | String]
  var name: String
  var ns: Record[String, String]
}

object SaxesStartTagNS {
  @scala.inline
  def apply(attributes: Record[String, SaxesAttributeNS | String], name: String, ns: Record[String, String]): SaxesStartTagNS = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaxesStartTagNS]
  }
}

