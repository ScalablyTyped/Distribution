package typings.reapop.reapopMod

import typings.reapop.Anon_PayloadType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("reapop", "reducer")
@js.native
object reducer extends js.Object {
  def apply(): js.Function2[
    /* state */ js.Array[Notification], 
    /* notification */ Anon_PayloadType, 
    js.Array[Notification]
  ] = js.native
  def apply(defaultNotification: Notification): js.Function2[
    /* state */ js.Array[Notification], 
    /* notification */ Anon_PayloadType, 
    js.Array[Notification]
  ] = js.native
}

