package typings.samlp.samlpMod

import typings.express.expressMod.Handler
import typings.express.expressMod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samlp", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var PassportProfileMapper: ProfileMapperConstructor = js.native
  def auth(options: IdPOptions): Handler = js.native
  def getSamlResponse(
    options: IdPOptions,
    user: js.Any,
    callback: js.Function2[/* err */ js.Any, /* samlResponse */ String, Unit]
  ): Unit = js.native
  def logout(options: IdPOptions): Handler = js.native
  def metadata(options: IdPMetadataOptions): Handler = js.native
  def parseRequest(req: Request, callback: js.Function2[/* err */ js.Any, /* data */ SamlRequest, Unit]): Unit = js.native
  def sendError(options: IdPOptions): Handler = js.native
}

