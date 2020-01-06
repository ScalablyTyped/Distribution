package typings.server

import typings.server.replyMod.Reply
import typings.server.routerMod.Router
import typings.server.typingsCommonMod.Context
import typings.server.typingsCommonMod.Middlewares
import typings.server.typingsOptionsMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("server", JSImport.Namespace)
@js.native
object serverMod extends js.Object {
  val reply: Reply = js.native
  val router: Router = js.native
  def apply(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param middlewares because its type Middlewares is not an array type */ middlewares: Middlewares
  ): js.Promise[Context] = js.native
  def apply(
    options: Options,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param middlewares because its type Middlewares is not an array type */ middlewares: Middlewares
  ): js.Promise[Context] = js.native
}

