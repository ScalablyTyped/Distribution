package typings.saml.mod

import typings.node.Buffer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("saml", "Saml11")
@js.native
object Saml11 extends js.Object {
  
  def create(opts: SamlOpts): js.Any = js.native
  def create(
    opts: SamlOpts,
    cb: js.Function3[/* err */ Error | Null, /* result */ js.Array[_], /* proofSecret */ Buffer, Unit]
  ): js.Any = js.native
}
