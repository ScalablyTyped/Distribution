package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppInstanceErrorDetails extends ClientObject {
  
  def get_correlationId(): Guid = js.native
  
  def get_errorDetail(): String = js.native
  
  def get_errorType(): AppInstanceErrorType = js.native
  
  def get_errorTypeName(): String = js.native
  
  def get_exceptionMessage(): String = js.native
  
  def get_source(): AppInstanceErrorSource = js.native
  
  def get_sourceName(): String = js.native
  
  def set_correlationId(value: Guid): Unit = js.native
  
  def set_errorType(value: AppInstanceErrorType): Unit = js.native
  
  def set_source(value: AppInstanceErrorSource): Unit = js.native
}
