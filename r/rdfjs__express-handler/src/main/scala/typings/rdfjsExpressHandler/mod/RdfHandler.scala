package typings.rdfjsExpressHandler.mod

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.rdfjsExpressHandler.mod.expressAugmentingMod.Request
import typings.rdfjsExpressHandler.mod.expressAugmentingMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RdfHandler extends js.Object {
  def apply(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(options: RdfHandlerOptions): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def attach(req: Request, res: Response): js.Promise[Unit] = js.native
}

