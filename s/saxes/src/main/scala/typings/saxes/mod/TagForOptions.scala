package typings.saxes.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.saxes.mod.SaxesTag
  - typings.saxes.mod.SaxesTagPlain
  - typings.saxes.mod.SaxesTagNS
*/
trait TagForOptions[O /* <: SaxesOptions */] extends js.Object

object TagForOptions {
  @scala.inline
  def SaxesTag[O](
    attributes: Record[String, SaxesAttributeNS | String],
    isSelfClosing: Boolean,
    name: String,
    local: String = null,
    ns: Record[String, String] = null,
    prefix: String = null,
    uri: String = null
  ): TagForOptions[O] = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], isSelfClosing = isSelfClosing.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (local != null) __obj.updateDynamic("local")(local.asInstanceOf[js.Any])
    if (ns != null) __obj.updateDynamic("ns")(ns.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagForOptions[O]]
  }
  @scala.inline
  def SaxesTagPlain[O](
    attributes: (Record[String, SaxesAttributeNS | String]) with (Record[String, String]),
    isSelfClosing: Boolean,
    name: String
  ): TagForOptions[O] = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], isSelfClosing = isSelfClosing.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagForOptions[O]]
  }
  @scala.inline
  def SaxesTagNS[O](
    attributes: (Record[String, SaxesAttributeNS | String]) with (Record[String, SaxesAttributeNS]),
    isSelfClosing: Boolean,
    local: String,
    name: String,
    ns: Record[String, String],
    prefix: String,
    uri: String
  ): TagForOptions[O] = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], isSelfClosing = isSelfClosing.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagForOptions[O]]
  }
}

