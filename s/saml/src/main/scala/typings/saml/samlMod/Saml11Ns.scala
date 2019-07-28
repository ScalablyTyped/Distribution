package typings.saml.samlMod

import typings.node.Buffer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("saml", "Saml11")
@js.native
object Saml11Ns extends js.Object {
  def create(opts: SamlOpts): js.Any = js.native
  def create(
    opts: SamlOpts,
    cb: js.Function3[/* err */ Error | Null, /* result */ js.Array[_], /* proofSecret */ Buffer, Unit]
  ): js.Any = js.native
}

