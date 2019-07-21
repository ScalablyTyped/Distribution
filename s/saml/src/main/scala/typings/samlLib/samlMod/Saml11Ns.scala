package typings
package samlLib.samlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("saml", "Saml11")
@js.native
object Saml11Ns extends js.Object {
  def create(opts: samlLib.samlMod.SamlOpts): js.Any = js.native
  def create(
    opts: samlLib.samlMod.SamlOpts,
    cb: js.Function3[
      /* err */ stdLib.Error | scala.Null, 
      /* result */ js.Array[_], 
      /* proofSecret */ nodeLib.Buffer, 
      scala.Unit
    ]
  ): js.Any = js.native
}

