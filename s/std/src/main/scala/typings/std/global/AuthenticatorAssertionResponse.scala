package typings.std.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("AuthenticatorAssertionResponse")
@js.native
/* standard dom */
open class AuthenticatorAssertionResponse ()
  extends StObject
     with typings.std.AuthenticatorAssertionResponse {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AuthenticatorAssertionResponse/authenticatorData) */
  /* standard dom */
  /* CompleteClass */
  override val authenticatorData: js.typedarray.ArrayBuffer = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AuthenticatorResponse/clientDataJSON) */
  /* standard dom */
  /* CompleteClass */
  override val clientDataJSON: js.typedarray.ArrayBuffer = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AuthenticatorAssertionResponse/signature) */
  /* standard dom */
  /* CompleteClass */
  override val signature: js.typedarray.ArrayBuffer = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AuthenticatorAssertionResponse/userHandle) */
  /* standard dom */
  /* CompleteClass */
  override val userHandle: js.typedarray.ArrayBuffer | Null = js.native
}
