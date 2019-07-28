package typings.soap.libTypesMod

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
    val __obj = js.Dynamic.literal(name = name, value = value)
  
    __obj.asInstanceOf[IXmlAttribute]
  }
}

