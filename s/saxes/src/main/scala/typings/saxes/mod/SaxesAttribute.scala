package typings.saxes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.saxes.mod.SaxesAttributeNS
  - typings.saxes.mod.SaxesAttributePlain
*/
trait SaxesAttribute
  extends AttributeEventForOptions[js.Any]

object SaxesAttribute {
  @scala.inline
  def SaxesAttributeNS(local: String, name: String, prefix: String, uri: String, value: String): SaxesAttribute = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaxesAttribute]
  }
  @scala.inline
  def SaxesAttributePlain(name: String, value: String): SaxesAttribute = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaxesAttribute]
  }
}

