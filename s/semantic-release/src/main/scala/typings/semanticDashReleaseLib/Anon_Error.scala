package typings
package semanticDashReleaseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Error extends js.Object {
  def error(message: java.lang.String, vars: js.Any*): scala.Unit
  def log(message: java.lang.String, vars: js.Any*): scala.Unit
}

object Anon_Error {
  @scala.inline
  def apply(
    error: js.Function2[java.lang.String, /* repeated */ js.Any, scala.Unit],
    log: js.Function2[java.lang.String, /* repeated */ js.Any, scala.Unit]
  ): Anon_Error = {
    val __obj = js.Dynamic.literal(error = error, log = log)
  
    __obj.asInstanceOf[Anon_Error]
  }
}

