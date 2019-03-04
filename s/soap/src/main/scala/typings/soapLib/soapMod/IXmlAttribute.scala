package typings
package soapLib.soapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IXmlAttribute extends js.Object {
  var name: java.lang.String
  var value: java.lang.String
}

object IXmlAttribute {
  @scala.inline
  def apply(name: java.lang.String, value: java.lang.String): IXmlAttribute = {
    val __obj = js.Dynamic.literal(name = name, value = value)
  
    __obj.asInstanceOf[IXmlAttribute]
  }
}

