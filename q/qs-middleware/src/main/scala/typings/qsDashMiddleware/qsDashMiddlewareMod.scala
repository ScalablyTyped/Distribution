package typings.qsDashMiddleware

import typings.express.expressMod.RequestHandler
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import typings.qs.qsMod.IParseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("qs-middleware", JSImport.Namespace)
@js.native
object qsDashMiddlewareMod extends js.Object {
  def apply(): RequestHandler[ParamsDictionary] = js.native
  def apply(options: IParseOptions): RequestHandler[ParamsDictionary] = js.native
}

