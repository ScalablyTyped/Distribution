package typings.soap.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IXmlAttribute extends js.Object {
  var name: String
  var value: String
}

object IXmlAttribute {
  @scala.inline
  def apply(name: String, value: String): IXmlAttribute = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IXmlAttribute]
  }
}

