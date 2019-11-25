package typings.reactDashAdal.reactDashAdalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactDashAdal.reactDashAdalStrings.LOGIN
  - typings.reactDashAdal.reactDashAdalStrings.RENEW_TOKEN
  - typings.reactDashAdal.reactDashAdalStrings.UNKNOWN
*/
trait RequestType extends js.Object

object RequestType {
  @scala.inline
  def LOGIN: typings.reactDashAdal.reactDashAdalStrings.LOGIN = this.cast("LOGIN")
  @scala.inline
  def RENEW_TOKEN: typings.reactDashAdal.reactDashAdalStrings.RENEW_TOKEN = this.cast("RENEW_TOKEN")
  @scala.inline
  def UNKNOWN: typings.reactDashAdal.reactDashAdalStrings.UNKNOWN = this.cast("UNKNOWN")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

