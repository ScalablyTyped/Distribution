package typings
package serverLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("server", JSImport.Namespace)
@js.native
object serverMod extends js.Object {
  val reply: serverLib.replyMod.Reply = js.native
  val router: serverLib.routerMod.Router = js.native
  def apply(
    /* import warning: Dropping repeated marker of param TsIdentSimple(middlewares) because its type Some(TsTypeRef(TsQIdent(List(TsIdentSimple(Middlewares))),List())) is not an array type */middlewares: serverLib.typingsCommonMod.Middlewares
  ): js.Promise[serverLib.typingsCommonMod.Context] = js.native
  def apply(
    options: serverLib.typingsOptionsMod.Options,
    /* import warning: Dropping repeated marker of param TsIdentSimple(middlewares) because its type Some(TsTypeRef(TsQIdent(List(TsIdentSimple(Middlewares))),List())) is not an array type */middlewares: serverLib.typingsCommonMod.Middlewares
  ): js.Promise[serverLib.typingsCommonMod.Context] = js.native
}

