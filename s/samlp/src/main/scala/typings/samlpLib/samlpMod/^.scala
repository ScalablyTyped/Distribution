package typings
package samlpLib.samlpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samlp", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var PassportProfileMapper: samlpLib.samlpMod.ProfileMapperConstructor = js.native
  def auth(options: samlpLib.samlpMod.IdPOptions): expressLib.expressMod.eNs.Handler = js.native
  def getSamlResponse(
    options: samlpLib.samlpMod.IdPOptions,
    user: js.Any,
    callback: js.Function2[/* err */ js.Any, /* samlResponse */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def logout(options: samlpLib.samlpMod.IdPOptions): expressLib.expressMod.eNs.Handler = js.native
  def metadata(options: samlpLib.samlpMod.IdPMetadataOptions): expressLib.expressMod.eNs.Handler = js.native
  def parseRequest(
    req: expressLib.expressMod.eNs.Request,
    callback: js.Function2[/* err */ js.Any, /* data */ samlpLib.samlpMod.SamlRequest, scala.Unit]
  ): scala.Unit = js.native
  def sendError(options: samlpLib.samlpMod.IdPOptions): expressLib.expressMod.eNs.Handler = js.native
}

