package typings.samlp.samlpMod

import typings.express.expressMod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samlp", "parseRequest")
@js.native
object parseRequest extends js.Object {
  def apply(req: Request, callback: js.Function2[/* err */ js.Any, /* data */ SamlRequest, Unit]): Unit = js.native
}

