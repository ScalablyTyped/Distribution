package typings.reactDashNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native/Libraries/BatchedBridge/MessageQueue", JSImport.Namespace)
@js.native
object librariesBatchedBridgeMessageQueueMod extends js.Object {
  @js.native
  class default () extends MessageQueue
  
  /* static members */
  @js.native
  object default extends js.Object {
    def spy(spyOrToggle: js.Function1[/* data */ SpyData, Unit]): Unit = js.native
    def spy(spyOrToggle: Boolean): Unit = js.native
  }
  
}

