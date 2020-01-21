package typings.reactNativeFbsdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactNativeFbsdk.reactNativeFbsdkStrings.friends
  - typings.reactNativeFbsdk.reactNativeFbsdkStrings.everyone
  - typings.reactNativeFbsdk.reactNativeFbsdkStrings.only_me
*/
trait DefaultAudience extends js.Object

object DefaultAudience {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def everyone: typings.reactNativeFbsdk.reactNativeFbsdkStrings.everyone = this.cast("everyone")
  @scala.inline
  def friends: typings.reactNativeFbsdk.reactNativeFbsdkStrings.friends = this.cast("friends")
  @scala.inline
  def only_me: typings.reactNativeFbsdk.reactNativeFbsdkStrings.only_me = this.cast("only_me")
}

