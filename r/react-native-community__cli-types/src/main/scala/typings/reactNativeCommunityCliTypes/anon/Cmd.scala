package typings.reactNativeCommunityCliTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cmd extends StObject {
  
  var cmd: String
  
  var desc: String
}
object Cmd {
  
  inline def apply(cmd: String, desc: String): Cmd = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any], desc = desc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cmd]
  }
  
  extension [Self <: Cmd](x: Self) {
    
    inline def setCmd(value: String): Self = StObject.set(x, "cmd", value.asInstanceOf[js.Any])
    
    inline def setDesc(value: String): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
  }
}
