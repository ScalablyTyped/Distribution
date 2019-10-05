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
object AuthenticatorAssertionResponse extends Instantiable0[AuthenticatorAssertionResponse]

