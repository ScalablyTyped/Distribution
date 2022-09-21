package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Inherits from Event, and represents the event object of an event sent on a document or worker when its content security policy is violated. */
@js.native
trait SecurityPolicyViolationEvent
  extends StObject
     with Event {
  
  /* standard dom */
  val blockedURI: java.lang.String = js.native
  
  /* standard dom */
  val columnNumber: Double = js.native
  
  /* standard dom */
  val disposition: SecurityPolicyViolationEventDisposition = js.native
  
  /* standard dom */
  val documentURI: java.lang.String = js.native
  
  /* standard dom */
  val effectiveDirective: java.lang.String = js.native
  
  /* standard dom */
  val lineNumber: Double = js.native
  
  /* standard dom */
  val originalPolicy: java.lang.String = js.native
  
  /* standard dom */
  val referrer: java.lang.String = js.native
  
  /* standard dom */
  val sample: java.lang.String = js.native
  
  /* standard dom */
  val sourceFile: java.lang.String = js.native
  
  /* standard dom */
  val statusCode: Double = js.native
  
  /* standard dom */
  val violatedDirective: java.lang.String = js.native
}
