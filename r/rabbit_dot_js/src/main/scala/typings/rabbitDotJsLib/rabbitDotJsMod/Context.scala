package typings
package rabbitDotJsLib.rabbitDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rabbit.js", "Context")
@js.native
class Context ()
  extends nodeLib.eventsMod.EventEmitter {
  def close(callback: js.Function): js.Any = js.native
  def socket[T](`type`: java.lang.String): T = js.native
  def socket[T](`type`: java.lang.String, options: SocketOptions): T = js.native
}

