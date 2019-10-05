package typings.samlp.samlpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samlp", "getSamlResponse")
@js.native
object getSamlResponse extends js.Object {
  def apply(
    options: IdPOptions,
    user: js.Any,
    callback: js.Function2[/* err */ js.Any, /* samlResponse */ String, Unit]
  ): Unit = js.native
}

