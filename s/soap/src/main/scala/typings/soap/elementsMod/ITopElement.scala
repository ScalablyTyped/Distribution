package typings.soap.elementsMod

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
    val __obj = js.Dynamic.literal(methodName = methodName.asInstanceOf[js.Any], outputName = outputName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITopElement]
  }
}

