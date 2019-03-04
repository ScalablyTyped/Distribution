package typings
package sharedbLib.libSharedbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error extends js.Object {
  var code: scala.Double
  var message: java.lang.String
}

object Error {
  @scala.inline
  def apply(code: scala.Double, message: java.lang.String): Error = {
    val __obj = js.Dynamic.literal(code = code, message = message)
  
    __obj.asInstanceOf[Error]
  }
}

