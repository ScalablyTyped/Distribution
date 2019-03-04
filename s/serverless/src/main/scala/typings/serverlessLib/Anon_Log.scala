package typings
package serverlessLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Log extends js.Object {
  def log(message: java.lang.String): scala.Null
}

object Anon_Log {
  @scala.inline
  def apply(log: js.Function1[java.lang.String, scala.Null]): Anon_Log = {
    val __obj = js.Dynamic.literal(log = log)
  
    __obj.asInstanceOf[Anon_Log]
  }
}

