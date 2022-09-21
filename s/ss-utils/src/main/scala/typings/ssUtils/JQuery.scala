package typings.ssUtils

import org.scalablytyped.runtime.StringDictionary
import typings.ssUtils.ssutils.ApplyErrorsOptions
import typings.ssUtils.ssutils.HandleServerEventsOptions
import typings.ssUtils.ssutils.ResponseStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//Needs to be declared locally
//declare var EventSource: ssutils.IEventSourceStatic;
@js.native
trait JQuery extends StObject {
  
  def applyErrors(status: ResponseStatus): JQuery = js.native
  def applyErrors(status: ResponseStatus, opt: ApplyErrorsOptions): JQuery = js.native
  
  def applyValues(values: StringDictionary[String]): JQuery = js.native
  
  def bindForm(): JQuery = js.native
  def bindForm(opt: ApplyErrorsOptions): JQuery = js.native
  
  def bindHandlers(handlers: StringDictionary[js.Function]): JQuery = js.native
  
  def clearErrors(): JQuery = js.native
  
  def handleServerEvents(): Unit = js.native
  def handleServerEvents(opt: HandleServerEventsOptions): Unit = js.native
  
  def serializeMap(): StringDictionary[Any] = js.native
  
  def setActiveLinks(): JQuery = js.native
  
  def setFieldError(name: String, msg: String): Unit = js.native
}
