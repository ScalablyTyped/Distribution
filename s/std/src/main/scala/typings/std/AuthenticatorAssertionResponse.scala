package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthenticatorAssertionResponse extends AuthenticatorResponse {
  val authenticatorData: ArrayBuffer
  val signature: ArrayBuffer
  val userHandle: ArrayBuffer | Null
}

@JSGlobal("AuthenticatorAssertionResponse")
@js.native
class AuthenticatorAssertionResponseCls () extends AuthenticatorAssertionResponse {
  /* CompleteClass */
  override val authenticatorData: ArrayBuffer = js.native
  /* CompleteClass */
  override val clientDataJSON: ArrayBuffer = js.native
  /* CompleteClass */
  override val signature: ArrayBuffer = js.native
  /* CompleteClass */
  override val userHandle: ArrayBuffer | Null = js.native
}

@JSGlobal("AuthenticatorAssertionResponse")
@js.native
object AuthenticatorAssertionResponse extends Instantiable0[AuthenticatorAssertionResponse]

