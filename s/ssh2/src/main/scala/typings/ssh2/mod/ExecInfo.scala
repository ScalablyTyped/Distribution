package typings.ssh2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExecInfo extends StObject {
  
  /** The command line to be executed. */
  var command: String = js.native
}
object ExecInfo {
  
  @scala.inline
  def apply(command: String): ExecInfo = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecInfo]
  }
  
  @scala.inline
  implicit class ExecInfoMutableBuilder[Self <: ExecInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
