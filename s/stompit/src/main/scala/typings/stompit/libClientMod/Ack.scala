package typings.stompit.libClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.stompit.stompitStrings.auto
  - typings.stompit.stompitStrings.client
  - typings.stompit.stompitStrings.`client-individual`
*/
trait Ack extends js.Object

object Ack {
  @scala.inline
  def auto: typings.stompit.stompitStrings.auto = this.cast("auto")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def client: typings.stompit.stompitStrings.client = this.cast("client")
  @scala.inline
  def `client-individual`: typings.stompit.stompitStrings.`client-individual` = this.cast("client-individual")
}

