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
class WebAuthnAssertionCls () extends WebAuthnAssertion {
  /* CompleteClass */
  override val authenticatorData: ArrayBuffer = js.native
  /* CompleteClass */
  override val clientData: ArrayBuffer = js.native
  /* CompleteClass */
  override val credential: ScopedCredential = js.native
  /* CompleteClass */
  override val signature: ArrayBuffer = js.native
}

@JSGlobal("WebAuthnAssertion")
@js.native
object WebAuthnAssertion extends Instantiable0[WebAuthnAssertion]

