package typings.reactNativeGoogleAnalyticsBridge.nativeBridgesMod

import typings.reactNative.mod.EventSubscriptionVendor
import typings.reactNativeGoogleAnalyticsBridge.dataLayerEventMod.DataLayerEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGoogleTagManagerBridge extends EventSubscriptionVendor {
  def booleanForKey(key: String): js.Promise[Boolean] = js.native
  def doubleForKey(key: js.Any): js.Promise[Double] = js.native
  def openContainerWithId(containerId: String): js.Promise[Boolean] = js.native
  def pushDataLayerEvent(event: DataLayerEvent): js.Promise[Boolean] = js.native
  def refreshContainer(): js.Promise[Boolean] = js.native
  def registerFunctionCallTagHandler(functionName: String): js.Promise[Boolean] = js.native
  def setVerboseLoggingEnabled(enabled: Boolean): js.Promise[Boolean] = js.native
  def stringForKey(key: String): js.Promise[String] = js.native
}

