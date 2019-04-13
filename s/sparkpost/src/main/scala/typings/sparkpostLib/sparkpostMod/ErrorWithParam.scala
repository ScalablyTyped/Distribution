package typings
package sparkpostLib.sparkpostMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorWithParam extends js.Object {
  var message: java.lang.String
  var param: java.lang.String
  var value: java.lang.String | scala.Null
}

object ErrorWithParam {
  @scala.inline
  def apply(message: java.lang.String, param: java.lang.String, value: java.lang.String = null): ErrorWithParam = {
    val __obj = js.Dynamic.literal(message = message, param = param)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ErrorWithParam]
  }
}

