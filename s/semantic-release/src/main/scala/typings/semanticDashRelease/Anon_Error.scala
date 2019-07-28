package typings.semanticDashRelease

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Error extends js.Object {
  def error(message: String, vars: js.Any*): Unit
  def log(message: String, vars: js.Any*): Unit
}

object Anon_Error {
  @scala.inline
  def apply(error: (String, /* repeated */ js.Any) => Unit, log: (String, /* repeated */ js.Any) => Unit): Anon_Error = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction2(error), log = js.Any.fromFunction2(log))
  
    __obj.asInstanceOf[Anon_Error]
  }
}

