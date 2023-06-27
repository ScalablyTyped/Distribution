package typings.std.global

import typings.std.AuthenticationExtensionsClientOutputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("PublicKeyCredential")
@js.native
/* standard dom */
open class PublicKeyCredential ()
  extends StObject
     with typings.std.PublicKeyCredential {
  
  /* standard dom */
  /* CompleteClass */
  override val authenticatorAttachment: java.lang.String | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PublicKeyCredential/getClientExtensionResults) */
  /* standard dom */
  /* CompleteClass */
  override def getClientExtensionResults(): AuthenticationExtensionsClientOutputs = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Credential/id) */
  /* standard dom */
  /* CompleteClass */
  override val id: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PublicKeyCredential/rawId) */
  /* standard dom */
  /* CompleteClass */
  override val rawId: js.typedarray.ArrayBuffer = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PublicKeyCredential/response) */
  /* standard dom */
  /* CompleteClass */
  override val response: typings.std.AuthenticatorResponse = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Credential/type) */
  /* standard dom */
  /* CompleteClass */
  override val `type`: java.lang.String = js.native
}
object PublicKeyCredential {
  
  @JSGlobal("PublicKeyCredential")
  @js.native
  val ^ : js.Any = js.native
  
  /* standard dom */
  inline def isConditionalMediationAvailable(): js.Promise[scala.Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isConditionalMediationAvailable")().asInstanceOf[js.Promise[scala.Boolean]]
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PublicKeyCredential/isUserVerifyingPlatformAuthenticatorAvailable) */
  /* standard dom */
  inline def isUserVerifyingPlatformAuthenticatorAvailable(): js.Promise[scala.Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isUserVerifyingPlatformAuthenticatorAvailable")().asInstanceOf[js.Promise[scala.Boolean]]
}
