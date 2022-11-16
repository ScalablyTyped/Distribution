package typings.std.global

import typings.std.COSEAlgorithmIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("AuthenticatorAttestationResponse")
@js.native
/* standard dom */
open class AuthenticatorAttestationResponse ()
  extends StObject
     with typings.std.AuthenticatorAttestationResponse {
  
  /* standard dom */
  /* CompleteClass */
  override val attestationObject: js.typedarray.ArrayBuffer = js.native
  
  /* standard dom */
  /* CompleteClass */
  override val clientDataJSON: js.typedarray.ArrayBuffer = js.native
  
  /* standard dom */
  /* CompleteClass */
  override def getAuthenticatorData(): js.typedarray.ArrayBuffer = js.native
  
  /* standard dom */
  /* CompleteClass */
  override def getPublicKey(): js.typedarray.ArrayBuffer | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  override def getPublicKeyAlgorithm(): COSEAlgorithmIdentifier = js.native
  
  /* standard dom */
  /* CompleteClass */
  override def getTransports(): js.Array[java.lang.String] = js.native
}
