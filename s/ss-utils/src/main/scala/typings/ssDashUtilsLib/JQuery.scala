package typings
package ssDashUtilsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//Needs to be declared locally
//declare var EventSource: ssutils.IEventSourceStatic;
@js.native
trait JQuery extends js.Object {
  def applyErrors(status: ssDashUtilsLib.ssutilsNs.ResponseStatus): JQuery = js.native
  def applyErrors(status: ssDashUtilsLib.ssutilsNs.ResponseStatus, opt: ssDashUtilsLib.ssutilsNs.ApplyErrorsOptions): JQuery = js.native
  def applyValues(values: org.scalablytyped.runtime.StringDictionary[java.lang.String]): JQuery = js.native
  def bindForm(): JQuery = js.native
  def bindForm(opt: ssDashUtilsLib.ssutilsNs.ApplyErrorsOptions): JQuery = js.native
  def bindHandlers(handlers: org.scalablytyped.runtime.StringDictionary[js.Function]): JQuery = js.native
  def clearErrors(): JQuery = js.native
  def handleServerEvents(): scala.Unit = js.native
  def handleServerEvents(opt: ssDashUtilsLib.ssutilsNs.HandleServerEventsOptions): scala.Unit = js.native
  def serializeMap(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  def setActiveLinks(): JQuery = js.native
  def setFieldError(name: java.lang.String, msg: java.lang.String): scala.Unit = js.native
}

