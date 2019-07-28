package typings.reactDashNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MessageQueue")
@js.native
class MessageQueue () extends js.Object {
  def getCallableModule(name: String): js.Object = js.native
  def registerCallableModule(name: String, module: js.Object): Unit = js.native
  def registerLazyCallableModule(name: String, factory: js.Function0[js.Object]): Unit = js.native
}

/* static members */
@JSGlobal("MessageQueue")
@js.native
object MessageQueue extends js.Object {
  def spy(spyOrToggle: js.Function1[/* data */ SpyData, Unit]): Unit = js.native
  def spy(spyOrToggle: Boolean): Unit = js.native
}

