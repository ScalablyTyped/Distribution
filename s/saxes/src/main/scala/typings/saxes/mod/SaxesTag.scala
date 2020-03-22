package typings.saxes.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SaxesTag extends js.Object {
  var attributes: Record[String, SaxesAttribute | String]
  var isSelfClosing: Boolean
  var local: String
  var name: String
  var ns: Record[String, String]
  var prefix: String
  var uri: String
}

object SaxesTag {
  @scala.inline
  def apply(
    attributes: Record[String, SaxesAttribute | String],
    isSelfClosing: Boolean,
    local: String,
    name: String,
    ns: Record[String, String],
    prefix: String,
    uri: String
  ): SaxesTag = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], isSelfClosing = isSelfClosing.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SaxesTag]
  }
}

