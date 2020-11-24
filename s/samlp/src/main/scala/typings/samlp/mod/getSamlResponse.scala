package typings.samlp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("samlp", "getSamlResponse")
@js.native
object getSamlResponse extends js.Object {
  
  def apply(
    options: IdPOptions,
    user: js.Any,
    callback: js.Function2[/* err */ js.Any, /* samlResponse */ String, Unit]
  ): Unit = js.native
}
