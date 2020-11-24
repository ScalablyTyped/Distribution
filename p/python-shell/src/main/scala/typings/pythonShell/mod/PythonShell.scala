package typings.pythonShell.mod

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("python-shell", "PythonShell")
@js.native
class PythonShell protected () extends EventEmitter {
  def this(scriptName: String) = this()
  def this(scriptName: String, options: InstanceOptions) = this()
  
  var defaultOptions: RunOptions = js.native
  
  def end(callback: js.Function1[/* message */ String, Unit]): Unit = js.native
  
  def send(message: String): Unit = js.native
  def send(message: js.Any): Unit = js.native
}
