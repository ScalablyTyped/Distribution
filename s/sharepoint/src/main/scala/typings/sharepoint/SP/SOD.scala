package typings.sharepoint.SP

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SOD extends js.Object {
  def delayUntilEventNotified(func: js.Function1[/* repeated */ js.Any, Unit], eventName: String): Unit = js.native
  def execute(fileName: String, functionName: String, args: js.Any*): Unit = js.native
  def executeFunc(fileName: String, typeName: String, fn: js.Function0[Unit]): Unit = js.native
  def executeOrDelayUntilEventNotified(func: js.Function1[/* repeated */ js.Any, Unit], eventName: String): Boolean = js.native
  def executeOrDelayUntilScriptLoaded(func: js.Function0[Unit], depScriptFileName: String): Boolean = js.native
  def get_prefetch(): Boolean = js.native
  def get_ribbonImagePrefetchEnabled(): Boolean = js.native
  def loadMultiple(keys: js.Array[String], fn: js.Function0[Unit]): Unit = js.native
  def loadMultiple(keys: js.Array[String], fn: js.Function0[Unit], bSync: Boolean): Unit = js.native
  def notifyEventAndExecuteWaitingJobs(eventName: String): Unit = js.native
  def notifyEventAndExecuteWaitingJobs(eventName: String, args: js.Array[_]): Unit = js.native
  def notifyScriptLoadedAndExecuteWaitingJobs(scriptFileName: String): Unit = js.native
  def registerSod(fileName: String, url: String): Unit = js.native
  def registerSodDep(fileName: String, dependentFileName: String): Unit = js.native
  def set_prefetch(value: Boolean): Unit = js.native
  def set_ribbonImagePrefetchEnabled(value: Boolean): Unit = js.native
}

@JSGlobal("SP.SOD")
@js.native
object SOD extends TopLevel[SOD]

