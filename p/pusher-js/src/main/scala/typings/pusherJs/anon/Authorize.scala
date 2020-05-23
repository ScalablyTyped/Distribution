package typings.pusherJs.anon

import typings.pusherJs.mod.AuthInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Authorize extends js.Object {
  def authorize(
    socketId: String,
    callback: js.Function2[/* errored */ Boolean, /* authInfo */ js.UndefOr[AuthInfo], Unit]
  ): Unit
}

object Authorize {
  @scala.inline
  def apply(
    authorize: (String, js.Function2[/* errored */ Boolean, /* authInfo */ js.UndefOr[AuthInfo], Unit]) => Unit
  ): Authorize = {
    val __obj = js.Dynamic.literal(authorize = js.Any.fromFunction2(authorize))
    __obj.asInstanceOf[Authorize]
  }
}

