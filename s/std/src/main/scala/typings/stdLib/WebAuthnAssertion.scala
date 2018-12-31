package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebAuthnAssertion extends js.Object {
  val authenticatorData: ArrayBuffer
  val clientData: ArrayBuffer
  val credential: ScopedCredential
  val signature: ArrayBuffer
}

@JSGlobal("WebAuthnAssertion")
@js.native
object WebAuthnAssertion
  extends org.scalablytyped.runtime.Instantiable0[WebAuthnAssertion]

