package typings
package atStorybookClientDashLoggerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Debug extends js.Object {
  def debug(message: js.Any, rest: js.Any*): scala.Unit
  def error(message: js.Any, rest: js.Any*): scala.Unit
  def info(message: js.Any, rest: js.Any*): scala.Unit
  def log(message: js.Any, rest: js.Any*): scala.Unit
  def warn(message: js.Any, rest: js.Any*): scala.Unit
}

object Anon_Debug {
  @scala.inline
  def apply(
    debug: (js.Any, /* repeated */ js.Any) => scala.Unit,
    error: (js.Any, /* repeated */ js.Any) => scala.Unit,
    info: (js.Any, /* repeated */ js.Any) => scala.Unit,
    log: (js.Any, /* repeated */ js.Any) => scala.Unit,
    warn: (js.Any, /* repeated */ js.Any) => scala.Unit
  ): Anon_Debug = {
    val __obj = js.Dynamic.literal(debug = js.Any.fromFunction2(debug), error = js.Any.fromFunction2(error), info = js.Any.fromFunction2(info), log = js.Any.fromFunction2(log), warn = js.Any.fromFunction2(warn))
  
    __obj.asInstanceOf[Anon_Debug]
  }
}

