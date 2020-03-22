package typings.saxes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SaxesAttribute extends js.Object {
  var local: String
  var name: String
  var prefix: String
  var uri: String
  var value: String
}

object SaxesAttribute {
  @scala.inline
  def apply(local: String, name: String, prefix: String, uri: String, value: String): SaxesAttribute = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SaxesAttribute]
  }
}

