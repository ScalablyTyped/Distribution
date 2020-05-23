package typings.semanticRelease.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error extends js.Object {
  def error(message: String, vars: js.Any*): Unit
  def log(message: String, vars: js.Any*): Unit
}

object Error {
  @scala.inline
  def apply(error: (String, /* repeated */ js.Any) => Unit, log: (String, /* repeated */ js.Any) => Unit): Error = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction2(error), log = js.Any.fromFunction2(log))
    __obj.asInstanceOf[Error]
  }
}

