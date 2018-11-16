package typings
package reactDashNativeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MessageQueue")
@js.native
class MessageQueue () extends js.Object {
  def getCallableModule(name: java.lang.String): js.Object = js.native
  def registerCallableModule(name: java.lang.String, module: js.Object): scala.Unit = js.native
  def registerLazyCallableModule(name: java.lang.String, factory: js.Function0[js.Object]): scala.Unit = js.native
}

@JSGlobal("MessageQueue")
@js.native
object MessageQueue extends js.Object {
  def spy(spyOrToggle: js.Function1[/* data */ reactDashNativeLib.SpyData, scala.Unit]): scala.Unit = js.native
  def spy(spyOrToggle: scala.Boolean): scala.Unit = js.native
}

