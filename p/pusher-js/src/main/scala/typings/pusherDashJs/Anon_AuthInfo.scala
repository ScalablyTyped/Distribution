package typings.pusherDashJs

import typings.pusherDashJs.pusherDashJsMod.AuthInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AuthInfo extends js.Object {
  def authorize(
    socketId: String,
    callback: js.Function2[/* errored */ Boolean, /* authInfo */ js.UndefOr[AuthInfo], Unit]
  ): Unit
}

object Anon_AuthInfo {
  @scala.inline
  def apply(
    authorize: (String, js.Function2[/* errored */ Boolean, /* authInfo */ js.UndefOr[AuthInfo], Unit]) => Unit
  ): Anon_AuthInfo = {
    val __obj = js.Dynamic.literal(authorize = js.Any.fromFunction2(authorize))
  
    __obj.asInstanceOf[Anon_AuthInfo]
  }
}

