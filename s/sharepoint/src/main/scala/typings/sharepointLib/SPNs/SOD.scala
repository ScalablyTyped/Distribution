package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SOD extends js.Object {
  def delayUntilEventNotified(func: js.Function1[/* repeated */ js.Any, scala.Unit], eventName: java.lang.String): scala.Unit = js.native
  def execute(fileName: java.lang.String, functionName: java.lang.String, args: js.Any*): scala.Unit = js.native
  def executeFunc(fileName: java.lang.String, typeName: java.lang.String, fn: js.Function0[scala.Unit]): scala.Unit = js.native
  def executeOrDelayUntilEventNotified(func: js.Function1[/* repeated */ js.Any, scala.Unit], eventName: java.lang.String): scala.Boolean = js.native
  def executeOrDelayUntilScriptLoaded(func: js.Function0[scala.Unit], depScriptFileName: java.lang.String): scala.Boolean = js.native
  def get_prefetch(): scala.Boolean = js.native
  def get_ribbonImagePrefetchEnabled(): scala.Boolean = js.native
  def loadMultiple(keys: js.Array[java.lang.String], fn: js.Function0[scala.Unit]): scala.Unit = js.native
  def loadMultiple(keys: js.Array[java.lang.String], fn: js.Function0[scala.Unit], bSync: scala.Boolean): scala.Unit = js.native
  def notifyEventAndExecuteWaitingJobs(eventName: java.lang.String): scala.Unit = js.native
  def notifyEventAndExecuteWaitingJobs(eventName: java.lang.String, args: js.Array[_]): scala.Unit = js.native
  def notifyScriptLoadedAndExecuteWaitingJobs(scriptFileName: java.lang.String): scala.Unit = js.native
  def registerSod(fileName: java.lang.String, url: java.lang.String): scala.Unit = js.native
  def registerSodDep(fileName: java.lang.String, dependentFileName: java.lang.String): scala.Unit = js.native
  def set_prefetch(value: scala.Boolean): scala.Unit = js.native
  def set_ribbonImagePrefetchEnabled(value: scala.Boolean): scala.Unit = js.native
}

