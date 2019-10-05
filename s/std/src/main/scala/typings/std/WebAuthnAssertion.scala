package typings.std

import org.scalablytyped.runtime.Instantiable0
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
object WebAuthnAssertion extends Instantiable0[WebAuthnAssertion]

