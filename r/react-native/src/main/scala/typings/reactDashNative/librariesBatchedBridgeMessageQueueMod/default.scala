package typings.reactDashNative.librariesBatchedBridgeMessageQueueMod

import typings.reactDashNative.MessageQueue
import typings.reactDashNative.SpyData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native/Libraries/BatchedBridge/MessageQueue", JSImport.Default)
@js.native
class default () extends MessageQueue

/* static members */
@JSImport("react-native/Libraries/BatchedBridge/MessageQueue", JSImport.Default)
@js.native
object default extends js.Object {
  def spy(spyOrToggle: js.Function1[/* data */ SpyData, Unit]): Unit = js.native
  def spy(spyOrToggle: Boolean): Unit = js.native
}

