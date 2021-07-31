package typings.std.global

import typings.std.AlgorithmIdentifier
import typings.std.RTCDtlsFingerprint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("RTCCertificate")
@js.native
class RTCCertificate ()
  extends StObject
     with typings.std.RTCCertificate {
  
  /* CompleteClass */
  override val expires: Double = js.native
  
  /* CompleteClass */
  override def getFingerprints(): js.Array[RTCDtlsFingerprint] = js.native
}
object RTCCertificate {
  
  @JSGlobal("RTCCertificate")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getSupportedAlgorithms(): js.Array[AlgorithmIdentifier] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSupportedAlgorithms")().asInstanceOf[js.Array[AlgorithmIdentifier]]
}
