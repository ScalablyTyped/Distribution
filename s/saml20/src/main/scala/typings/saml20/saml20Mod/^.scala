package typings.saml20.saml20Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("saml20", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def parse(rawAssertion: String, cb: ParseCallback): Unit = js.native
  def validate(rawAssertion: String, options: ValidationOptions, cb: ParseCallback): Unit = js.native
}

