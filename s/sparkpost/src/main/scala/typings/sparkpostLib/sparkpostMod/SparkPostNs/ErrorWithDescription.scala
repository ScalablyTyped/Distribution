package typings
package sparkpostLib.sparkpostMod.SparkPostNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorWithDescription extends js.Object {
  var code: java.lang.String
  var description: java.lang.String
  var message: java.lang.String
}

object ErrorWithDescription {
  @scala.inline
  def apply(code: java.lang.String, description: java.lang.String, message: java.lang.String): ErrorWithDescription = {
    val __obj = js.Dynamic.literal(code = code, description = description, message = message)
  
    __obj.asInstanceOf[ErrorWithDescription]
  }
}

