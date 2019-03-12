package typings
package pusherDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AuthInfo extends js.Object {
  def authorize(
    socketId: java.lang.String,
    callback: js.Function2[
      /* errored */ scala.Boolean, 
      /* authInfo */ js.UndefOr[pusherDashJsLib.pusherDashJsMod.pusherNs.AuthInfo], 
      scala.Unit
    ]
  ): scala.Unit
}

object Anon_AuthInfo {
  @scala.inline
  def apply(
    authorize: (java.lang.String, js.Function2[
      /* errored */ scala.Boolean, 
      /* authInfo */ js.UndefOr[pusherDashJsLib.pusherDashJsMod.pusherNs.AuthInfo], 
      scala.Unit
    ]) => scala.Unit
  ): Anon_AuthInfo = {
    val __obj = js.Dynamic.literal(authorize = js.Any.fromFunction2(authorize))
  
    __obj.asInstanceOf[Anon_AuthInfo]
  }
}

