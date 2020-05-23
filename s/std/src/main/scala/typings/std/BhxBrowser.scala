package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BhxBrowser extends js.Object {
  val lastError: DOMException = js.native
  def checkMatchesGlobExpression(pattern: java.lang.String, value: java.lang.String): scala.Boolean = js.native
  def checkMatchesUriExpression(pattern: java.lang.String, value: java.lang.String): scala.Boolean = js.native
  def clearLastError(): Unit = js.native
  def currentWindowId(): Double = js.native
  def fireExtensionApiTelemetry(
    functionName: java.lang.String,
    isSucceeded: scala.Boolean,
    isSupported: scala.Boolean,
    errorString: java.lang.String
  ): Unit = js.native
  def genericFunction(functionId: Double, destination: js.Any): Unit = js.native
  def genericFunction(functionId: Double, destination: js.Any, parameters: java.lang.String): Unit = js.native
  def genericFunction(functionId: Double, destination: js.Any, parameters: java.lang.String, callbackId: Double): Unit = js.native
  def genericSynchronousFunction(functionId: Double): java.lang.String = js.native
  def genericSynchronousFunction(functionId: Double, parameters: java.lang.String): java.lang.String = js.native
  def getExtensionId(): java.lang.String = js.native
  def getThisAddress(): js.Any = js.native
  def registerGenericFunctionCallbackHandler(callbackHandler: js.Function): Unit = js.native
  def registerGenericListenerHandler(eventHandler: js.Function): Unit = js.native
  def setLastError(parameters: java.lang.String): Unit = js.native
  def webPlatformGenericFunction(destination: js.Any): Unit = js.native
  def webPlatformGenericFunction(destination: js.Any, parameters: java.lang.String): Unit = js.native
  def webPlatformGenericFunction(destination: js.Any, parameters: java.lang.String, callbackId: Double): Unit = js.native
}

