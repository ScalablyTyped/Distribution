package typings.psTree

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ps-tree", JSImport.Namespace)
  @js.native
  def apply(pid: Double, callback: js.Function2[/* error */ Error, /* children */ js.Array[PS], Unit]): Unit = js.native
  
  @js.native
  trait PS extends StObject {
    
    var COMMAND: String = js.native
    
    var PID: String = js.native
    
    var PPID: String = js.native
    
    var STAT: String = js.native
  }
  object PS {
    
    @scala.inline
    def apply(COMMAND: String, PID: String, PPID: String, STAT: String): PS = {
      val __obj = js.Dynamic.literal(COMMAND = COMMAND.asInstanceOf[js.Any], PID = PID.asInstanceOf[js.Any], PPID = PPID.asInstanceOf[js.Any], STAT = STAT.asInstanceOf[js.Any])
      __obj.asInstanceOf[PS]
    }
    
    @scala.inline
    implicit class PSMutableBuilder[Self <: PS] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCOMMAND(value: String): Self = StObject.set(x, "COMMAND", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPID(value: String): Self = StObject.set(x, "PID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPPID(value: String): Self = StObject.set(x, "PPID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSTAT(value: String): Self = StObject.set(x, "STAT", value.asInstanceOf[js.Any])
    }
  }
}
