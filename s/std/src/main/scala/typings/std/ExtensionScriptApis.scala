package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtensionScriptApis extends js.Object {
  def extensionIdToShortId(extensionId: java.lang.String): Double = js.native
  def fireExtensionApiTelemetry(
    functionName: java.lang.String,
    isSucceeded: scala.Boolean,
    isSupported: scala.Boolean,
    errorString: java.lang.String
  ): Unit = js.native
  def genericFunction(routerAddress: js.Any): Unit = js.native
  def genericFunction(routerAddress: js.Any, parameters: java.lang.String): Unit = js.native
  def genericFunction(routerAddress: js.Any, parameters: java.lang.String, callbackId: Double): Unit = js.native
  def genericSynchronousFunction(functionId: Double): java.lang.String = js.native
  def genericSynchronousFunction(functionId: Double, parameters: java.lang.String): java.lang.String = js.native
  def genericWebRuntimeCallout(to: js.Any, from: js.Any, payload: java.lang.String): Unit = js.native
  def getExtensionId(): java.lang.String = js.native
  def registerGenericFunctionCallbackHandler(callbackHandler: js.Function): Unit = js.native
  def registerGenericPersistentCallbackHandler(callbackHandler: js.Function): Unit = js.native
  def registerWebRuntimeCallbackHandler(handler: js.Function): js.Any = js.native
}

