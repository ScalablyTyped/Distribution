package typings.saxes.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Required<saxes.saxes.SaxesTag> & {  attributes :std.Record<string, saxes.saxes.SaxesAttributeNS>} */
@js.native
trait SaxesTagNS
  extends TagForOptions[js.Any] {
  var attributes: (Record[String, SaxesAttributeNS | String]) with (Record[String, SaxesAttributeNS]) = js.native
  var isSelfClosing: Boolean = js.native
  var local: String = js.native
  var name: String = js.native
  var ns: Record[String, String] = js.native
  var prefix: String = js.native
  var uri: String = js.native
}

object SaxesTagNS {
  @scala.inline
  def apply(
    attributes: (Record[String, SaxesAttributeNS | String]) with (Record[String, SaxesAttributeNS]),
    isSelfClosing: Boolean,
    local: String,
    name: String,
    ns: Record[String, String],
    prefix: String,
    uri: String
  ): SaxesTagNS = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], isSelfClosing = isSelfClosing.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaxesTagNS]
  }
  @scala.inline
  implicit class SaxesTagNSOps[Self <: SaxesTagNS] (val x: Self) extends AnyVal {
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
    def setAttributes(value: (Record[String, SaxesAttributeNS | String]) with (Record[String, SaxesAttributeNS])): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsSelfClosing(value: Boolean): Self = this.set("isSelfClosing", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocal(value: String): Self = this.set("local", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNs(value: Record[String, String]): Self = this.set("ns", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
  }
  
}

