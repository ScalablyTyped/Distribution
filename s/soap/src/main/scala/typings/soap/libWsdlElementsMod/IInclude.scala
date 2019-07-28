package typings.soap.libWsdlElementsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInclude extends js.Object {
  var location: String
  var namespace: String
}

object IInclude {
  @scala.inline
  def apply(location: String, namespace: String): IInclude = {
    val __obj = js.Dynamic.literal(location = location, namespace = namespace)
  
    __obj.asInstanceOf[IInclude]
  }
}

