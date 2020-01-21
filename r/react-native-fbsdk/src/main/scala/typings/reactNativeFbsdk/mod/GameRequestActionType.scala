package typings.reactNativeFbsdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactNativeFbsdk.reactNativeFbsdkStrings.send
  - typings.reactNativeFbsdk.reactNativeFbsdkStrings.askfor
  - typings.reactNativeFbsdk.reactNativeFbsdkStrings.turn
*/
trait GameRequestActionType extends js.Object

object GameRequestActionType {
  @scala.inline
  def askfor: typings.reactNativeFbsdk.reactNativeFbsdkStrings.askfor = this.cast("askfor")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def send: typings.reactNativeFbsdk.reactNativeFbsdkStrings.send = this.cast("send")
  @scala.inline
  def turn: typings.reactNativeFbsdk.reactNativeFbsdkStrings.turn = this.cast("turn")
}

