package typings.samlp.mod

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samlp", "parseRequest")
@js.native
object parseRequest extends js.Object {
  def apply(
    req: Request_[ParamsDictionary, _, _, Query],
    callback: js.Function2[/* err */ js.Any, /* data */ SamlRequest, Unit]
  ): Unit = js.native
}

