package typings.pusherJs

import typings.pusherJs.mod.AuthInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAuthInfo extends js.Object {
  def authorize(
    socketId: String,
    callback: js.Function2[/* errored */ Boolean, /* authInfo */ js.UndefOr[AuthInfo], Unit]
  ): Unit
}

object AnonAuthInfo {
  @scala.inline
  def apply(
    authorize: (String, js.Function2[/* errored */ Boolean, /* authInfo */ js.UndefOr[AuthInfo], Unit]) => Unit
  ): AnonAuthInfo = {
    val __obj = js.Dynamic.literal(authorize = js.Any.fromFunction2(authorize))
  
    __obj.asInstanceOf[AnonAuthInfo]
  }
}

