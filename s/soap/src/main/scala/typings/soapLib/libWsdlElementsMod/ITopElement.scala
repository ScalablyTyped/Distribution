package typings
package soapLib.libWsdlElementsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITopElement extends js.Object {
  var methodName: java.lang.String
  var outputName: java.lang.String
}

object ITopElement {
  @scala.inline
  def apply(methodName: java.lang.String, outputName: java.lang.String): ITopElement = {
    val __obj = js.Dynamic.literal(methodName = methodName, outputName = outputName)
  
    __obj.asInstanceOf[ITopElement]
  }
}

