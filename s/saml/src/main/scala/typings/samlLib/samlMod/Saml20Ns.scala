package typings
package samlLib.samlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("saml", "Saml20")
@js.native
object Saml20Ns extends js.Object {
  def create(opts: samlLib.samlMod.SamlOpts): js.Any = js.native
  def create(
    opts: samlLib.samlMod.SamlOpts,
    cb: js.Function2[/* err */ stdLib.Error | scala.Null, /* signed */ java.lang.String, scala.Unit]
  ): js.Any = js.native
}

