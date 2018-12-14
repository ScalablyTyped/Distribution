package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BhxBrowser extends js.Object {
  val lastError: DOMException = js.native
  def checkMatchesGlobExpression(pattern: java.lang.String, value: java.lang.String): scala.Boolean = js.native
  def checkMatchesUriExpression(pattern: java.lang.String, value: java.lang.String): scala.Boolean = js.native
  def clearLastError(): scala.Unit = js.native
  def currentWindowId(): scala.Double = js.native
  def fireExtensionApiTelemetry(
    functionName: java.lang.String,
    isSucceeded: scala.Boolean,
    isSupported: scala.Boolean,
    errorString: java.lang.String
  ): scala.Unit = js.native
  def genericFunction(functionId: scala.Double, destination: js.Any): scala.Unit = js.native
  def genericFunction(functionId: scala.Double, destination: js.Any, parameters: java.lang.String): scala.Unit = js.native
  def genericFunction(
    functionId: scala.Double,
    destination: js.Any,
    parameters: java.lang.String,
    callbackId: scala.Double
  ): scala.Unit = js.native
  def genericSynchronousFunction(functionId: scala.Double): java.lang.String = js.native
  def genericSynchronousFunction(functionId: scala.Double, parameters: java.lang.String): java.lang.String = js.native
  def getExtensionId(): java.lang.String = js.native
  def getThisAddress(): js.Any = js.native
  def registerGenericFunctionCallbackHandler(callbackHandler: js.Function): scala.Unit = js.native
  def registerGenericListenerHandler(eventHandler: js.Function): scala.Unit = js.native
  def setLastError(parameters: java.lang.String): scala.Unit = js.native
  def webPlatformGenericFunction(destination: js.Any): scala.Unit = js.native
  def webPlatformGenericFunction(destination: js.Any, parameters: java.lang.String): scala.Unit = js.native
  def webPlatformGenericFunction(destination: js.Any, parameters: java.lang.String, callbackId: scala.Double): scala.Unit = js.native
}

@JSGlobal("BhxBrowser")
@js.native
object BhxBrowser
  extends org.scalablytyped.runtime.Instantiable0[BhxBrowser]

