package typings.std.global

import typings.std.Algorithm
import typings.std.MSCredentialType
import typings.std.MSTransportType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MSFIDOCredentialAssertion")
@js.native
class MSFIDOCredentialAssertion ()
  extends StObject
     with typings.std.MSFIDOCredentialAssertion {
  
  /* CompleteClass */
  override val algorithm: java.lang.String | Algorithm = js.native
  
  /* CompleteClass */
  override val attestation: js.Any = js.native
  
  /* CompleteClass */
  override val id: java.lang.String = js.native
  
  /* CompleteClass */
  override val publicKey: java.lang.String = js.native
  
  /* CompleteClass */
  override val transportHints: js.Array[MSTransportType] = js.native
  
  /* CompleteClass */
  override val `type`: MSCredentialType = js.native
}
