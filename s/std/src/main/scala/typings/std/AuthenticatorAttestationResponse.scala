package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthenticatorAttestationResponse extends AuthenticatorResponse {
  val attestationObject: ArrayBuffer
}

@JSGlobal("AuthenticatorAttestationResponse")
@js.native
class AuthenticatorAttestationResponseCls () extends AuthenticatorAttestationResponse {
  /* CompleteClass */
  override val attestationObject: ArrayBuffer = js.native
  /* CompleteClass */
  override val clientDataJSON: ArrayBuffer = js.native
}

@JSGlobal("AuthenticatorAttestationResponse")
@js.native
object AuthenticatorAttestationResponse extends Instantiable0[AuthenticatorAttestationResponse]

