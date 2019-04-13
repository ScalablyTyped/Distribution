package typings
package samlpLib.samlpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samlp", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var PassportProfileMapper: ProfileMapperConstructor = js.native
  def auth(options: IdPOptions): expressLib.expressMod.Handler = js.native
  def getSamlResponse(
    options: IdPOptions,
    user: js.Any,
    callback: js.Function2[/* err */ js.Any, /* samlResponse */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def logout(options: IdPOptions): expressLib.expressMod.Handler = js.native
  def metadata(options: IdPMetadataOptions): expressLib.expressMod.Handler = js.native
  def parseRequest(
    req: expressLib.expressMod.Request,
    callback: js.Function2[/* err */ js.Any, /* data */ SamlRequest, scala.Unit]
  ): scala.Unit = js.native
  def sendError(options: IdPOptions): expressLib.expressMod.Handler = js.native
}

