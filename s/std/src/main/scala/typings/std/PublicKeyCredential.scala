package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublicKeyCredential extends Credential {
  val rawId: ArrayBuffer
  val response: AuthenticatorResponse
  def getClientExtensionResults(): AuthenticationExtensionsClientOutputs
}

@JSGlobal("PublicKeyCredential")
@js.native
class PublicKeyCredentialCls () extends PublicKeyCredential {
  /* CompleteClass */
  override val id: java.lang.String = js.native
  /* CompleteClass */
  override val rawId: ArrayBuffer = js.native
  /* CompleteClass */
  override val response: AuthenticatorResponse = js.native
  /* CompleteClass */
  override val `type`: java.lang.String = js.native
  /* CompleteClass */
  override def getClientExtensionResults(): AuthenticationExtensionsClientOutputs = js.native
}

@JSGlobal("PublicKeyCredential")
@js.native
object PublicKeyCredential extends Instantiable0[PublicKeyCredential] {
  def isUserVerifyingPlatformAuthenticatorAvailable(): js.Promise[scala.Boolean] = js.native
}

