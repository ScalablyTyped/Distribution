package typings
package saml20Lib.saml20Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("saml20", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def parse(rawAssertion: java.lang.String, cb: saml20Lib.saml20Mod.ParseCallback): scala.Unit = js.native
  def validate(
    rawAssertion: java.lang.String,
    options: saml20Lib.saml20Mod.ValidationOptions,
    cb: saml20Lib.saml20Mod.ParseCallback
  ): scala.Unit = js.native
}

