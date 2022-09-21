package typings.reactNativeCommunityCliDoctor.anon

import typings.reactNativeCommunityCliDoctor.typesMod.AvailableInformation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CPU extends StObject {
  
  var CPU: String
  
  var Memory: String
  
  var OS: String
  
  var Shell: AvailableInformation
}
object CPU {
  
  inline def apply(CPU: String, Memory: String, OS: String, Shell: AvailableInformation): CPU = {
    val __obj = js.Dynamic.literal(CPU = CPU.asInstanceOf[js.Any], Memory = Memory.asInstanceOf[js.Any], OS = OS.asInstanceOf[js.Any], Shell = Shell.asInstanceOf[js.Any])
    __obj.asInstanceOf[CPU]
  }
  
  extension [Self <: CPU](x: Self) {
    
    inline def setCPU(value: String): Self = StObject.set(x, "CPU", value.asInstanceOf[js.Any])
    
    inline def setMemory(value: String): Self = StObject.set(x, "Memory", value.asInstanceOf[js.Any])
    
    inline def setOS(value: String): Self = StObject.set(x, "OS", value.asInstanceOf[js.Any])
    
    inline def setShell(value: AvailableInformation): Self = StObject.set(x, "Shell", value.asInstanceOf[js.Any])
  }
}
