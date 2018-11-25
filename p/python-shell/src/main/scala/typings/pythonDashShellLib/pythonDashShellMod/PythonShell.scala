package typings
package pythonDashShellLib.pythonDashShellMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("python-shell", "PythonShell")
@js.native
class PythonShell protected ()
  extends eventsLib.eventsMod.EventEmitter {
  def this(scriptName: java.lang.String) = this()
  def this(scriptName: java.lang.String, options: InstanceOptions) = this()
  var defaultOptions: RunOptions = js.native
  def end(callback: js.Function1[/* message */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def send(message: java.lang.String): scala.Unit = js.native
  def send(message: js.Any): scala.Unit = js.native
}

