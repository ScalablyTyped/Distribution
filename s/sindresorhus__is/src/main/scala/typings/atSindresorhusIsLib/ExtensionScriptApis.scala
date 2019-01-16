package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtensionScriptApis extends js.Object {
  def extensionIdToShortId(extensionId: java.lang.String): scala.Double = js.native
  def fireExtensionApiTelemetry(
    functionName: java.lang.String,
    isSucceeded: scala.Boolean,
    isSupported: scala.Boolean,
    errorString: java.lang.String
  ): scala.Unit = js.native
  def genericFunction(routerAddress: js.Any): scala.Unit = js.native
  def genericFunction(routerAddress: js.Any, parameters: java.lang.String): scala.Unit = js.native
  def genericFunction(routerAddress: js.Any, parameters: java.lang.String, callbackId: scala.Double): scala.Unit = js.native
  def genericSynchronousFunction(functionId: scala.Double): java.lang.String = js.native
  def genericSynchronousFunction(functionId: scala.Double, parameters: java.lang.String): java.lang.String = js.native
  def genericWebRuntimeCallout(to: js.Any, from: js.Any, payload: java.lang.String): scala.Unit = js.native
  def getExtensionId(): java.lang.String = js.native
  def registerGenericFunctionCallbackHandler(callbackHandler: Function): scala.Unit = js.native
  def registerGenericPersistentCallbackHandler(callbackHandler: Function): scala.Unit = js.native
  def registerWebRuntimeCallbackHandler(handler: Function): js.Any = js.native
}

@JSGlobal("ExtensionScriptApis")
@js.native
object ExtensionScriptApis
  extends org.scalablytyped.runtime.Instantiable0[ExtensionScriptApis]

