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
    authorize: js.Function2[
      java.lang.String, 
      js.Function2[
        /* errored */ scala.Boolean, 
        /* authInfo */ js.UndefOr[pusherDashJsLib.pusherDashJsMod.pusherNs.AuthInfo], 
        scala.Unit
      ], 
      scala.Unit
    ]
  ): Anon_AuthInfo = {
    val __obj = js.Dynamic.literal(authorize = authorize)
  
    __obj.asInstanceOf[Anon_AuthInfo]
  }
}

