package typings.socks.typingsCommonConstantsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.socks.socksStrings.connect
  - typings.socks.socksStrings.bind
  - typings.socks.socksStrings.associate
*/
trait SocksCommandOption extends js.Object

object SocksCommandOption {
  @scala.inline
  def associate: typings.socks.socksStrings.associate = this.cast("associate")
  @scala.inline
  def bind: typings.socks.socksStrings.bind = this.cast("bind")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def connect: typings.socks.socksStrings.connect = this.cast("connect")
}

