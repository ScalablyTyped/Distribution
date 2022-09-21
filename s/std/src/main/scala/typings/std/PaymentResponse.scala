package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This Payment Request API interface is returned after a user selects a payment method and approves a payment request.
  * Available only in secure contexts.
  */
@js.native
trait PaymentResponse
  extends StObject
     with EventTarget {
  
  /* standard dom */
  def complete(): js.Promise[Unit] = js.native
  def complete(result: PaymentComplete): js.Promise[Unit] = js.native
  
  /* standard dom */
  val details: Any = js.native
  
  /* standard dom */
  val methodName: java.lang.String = js.native
  
  /* standard dom */
  val requestId: java.lang.String = js.native
  
  /* standard dom */
  def retry(): js.Promise[Unit] = js.native
  def retry(errorFields: PaymentValidationErrors): js.Promise[Unit] = js.native
  
  /* standard dom */
  def toJSON(): Any = js.native
}
