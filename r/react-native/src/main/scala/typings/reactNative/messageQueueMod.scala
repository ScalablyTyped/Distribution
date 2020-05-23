package typings.reactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native/Libraries/BatchedBridge/MessageQueue", JSImport.Namespace)
@js.native
object messageQueueMod extends js.Object {
  @js.native
  class default () extends MessageQueue {
    /* CompleteClass */
    override def getCallableModule(name: String): js.Object = js.native
    /* CompleteClass */
    override def registerCallableModule(name: String, module: js.Object): Unit = js.native
    /* CompleteClass */
    override def registerLazyCallableModule(name: String, factory: js.Function0[js.Object]): Unit = js.native
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    def spy(spyOrToggle: js.Function1[/* data */ SpyData, Unit]): Unit = js.native
    def spy(spyOrToggle: Boolean): Unit = js.native
  }
  
}

