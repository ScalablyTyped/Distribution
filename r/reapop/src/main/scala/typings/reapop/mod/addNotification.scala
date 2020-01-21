package typings.reapop.mod

import typings.redux.mod.Dispatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("reapop", "addNotification")
@js.native
object addNotification extends js.Object {
  def apply(notification: Notification): js.Function1[/* dispatch */ Dispatch[_], Notification] = js.native
}

