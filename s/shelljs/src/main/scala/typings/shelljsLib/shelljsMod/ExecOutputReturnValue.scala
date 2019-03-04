package typings
package shelljsLib.shelljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecOutputReturnValue extends js.Object {
  var code: scala.Double
  var stderr: java.lang.String
  var stdout: java.lang.String
}

object ExecOutputReturnValue {
  @scala.inline
  def apply(code: scala.Double, stderr: java.lang.String, stdout: java.lang.String): ExecOutputReturnValue = {
    val __obj = js.Dynamic.literal(code = code, stderr = stderr, stdout = stdout)
  
    __obj.asInstanceOf[ExecOutputReturnValue]
  }
}

