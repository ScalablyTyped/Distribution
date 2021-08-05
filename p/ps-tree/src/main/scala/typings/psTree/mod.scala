package typings.psTree

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(pid: Double, callback: js.Function2[/* error */ Error, /* children */ js.Array[PS], Unit]): Unit = (^.asInstanceOf[js.Dynamic].apply(pid.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("ps-tree", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait PS extends StObject {
    
    var COMMAND: String
    
    var PID: String
    
    var PPID: String
    
    var STAT: String
  }
  object PS {
    
    inline def apply(COMMAND: String, PID: String, PPID: String, STAT: String): PS = {
      val __obj = js.Dynamic.literal(COMMAND = COMMAND.asInstanceOf[js.Any], PID = PID.asInstanceOf[js.Any], PPID = PPID.asInstanceOf[js.Any], STAT = STAT.asInstanceOf[js.Any])
      __obj.asInstanceOf[PS]
    }
    
    extension [Self <: PS](x: Self) {
      
      inline def setCOMMAND(value: String): Self = StObject.set(x, "COMMAND", value.asInstanceOf[js.Any])
      
      inline def setPID(value: String): Self = StObject.set(x, "PID", value.asInstanceOf[js.Any])
      
      inline def setPPID(value: String): Self = StObject.set(x, "PPID", value.asInstanceOf[js.Any])
      
      inline def setSTAT(value: String): Self = StObject.set(x, "STAT", value.asInstanceOf[js.Any])
    }
  }
}
