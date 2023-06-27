package typings.std.global

import typings.std.EpochTimeStamp
import typings.std.RTCDtlsFingerprint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("RTCCertificate")
@js.native
/* standard dom */
open class RTCCertificate ()
  extends StObject
     with typings.std.RTCCertificate {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCCertificate/expires) */
  /* standard dom */
  /* CompleteClass */
  override val expires: EpochTimeStamp = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCCertificate/getFingerprints) */
  /* standard dom */
  /* CompleteClass */
  override def getFingerprints(): js.Array[RTCDtlsFingerprint] = js.native
}
