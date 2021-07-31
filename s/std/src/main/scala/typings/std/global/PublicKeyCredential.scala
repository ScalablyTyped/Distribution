package typings.std.global

import typings.std.AuthenticationExtensionsClientOutputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("PublicKeyCredential")
@js.native
class PublicKeyCredential ()
  extends StObject
     with typings.std.PublicKeyCredential {
  
  /* CompleteClass */
  override def getClientExtensionResults(): AuthenticationExtensionsClientOutputs = js.native
  
  /* CompleteClass */
  override val id: java.lang.String = js.native
  
  /* CompleteClass */
  override val rawId: typings.std.ArrayBuffer = js.native
  
  /* CompleteClass */
  override val response: typings.std.AuthenticatorResponse = js.native
  
  /* CompleteClass */
  override val `type`: java.lang.String = js.native
}
object PublicKeyCredential {
  
  @JSGlobal("PublicKeyCredential")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def isUserVerifyingPlatformAuthenticatorAvailable(): js.Promise[scala.Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isUserVerifyingPlatformAuthenticatorAvailable")().asInstanceOf[js.Promise[scala.Boolean]]
}
