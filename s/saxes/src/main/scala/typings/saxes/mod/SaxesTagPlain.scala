package typings.saxes.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<saxes.saxes.SaxesTag, 'name' | 'attributes' | 'isSelfClosing'> & {  attributes  :std.Record<string, string>} */
trait SaxesTagPlain
  extends TagForOptions[js.Any] {
  var attributes: (Record[String, SaxesAttributeNS | String]) with (Record[String, String])
  var isSelfClosing: Boolean
  var name: String
}

object SaxesTagPlain {
  @scala.inline
  def apply(
    attributes: (Record[String, SaxesAttributeNS | String]) with (Record[String, String]),
    isSelfClosing: Boolean,
    name: String
  ): SaxesTagPlain = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], isSelfClosing = isSelfClosing.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SaxesTagPlain]
  }
}

