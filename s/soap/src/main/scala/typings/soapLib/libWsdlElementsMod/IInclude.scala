package typings
package soapLib.libWsdlElementsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInclude extends js.Object {
  var location: java.lang.String
  var namespace: java.lang.String
}

object IInclude {
  @scala.inline
  def apply(location: java.lang.String, namespace: java.lang.String): IInclude = {
    val __obj = js.Dynamic.literal(location = location, namespace = namespace)
  
    __obj.asInstanceOf[IInclude]
  }
}

