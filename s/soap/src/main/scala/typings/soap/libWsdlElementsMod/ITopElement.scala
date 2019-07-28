package typings.soap.libWsdlElementsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITopElement extends js.Object {
  var methodName: String
  var outputName: String
}

object ITopElement {
  @scala.inline
  def apply(methodName: String, outputName: String): ITopElement = {
    val __obj = js.Dynamic.literal(methodName = methodName, outputName = outputName)
  
    __obj.asInstanceOf[ITopElement]
  }
}

