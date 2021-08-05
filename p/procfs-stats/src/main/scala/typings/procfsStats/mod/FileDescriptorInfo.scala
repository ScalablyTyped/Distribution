package typings.procfsStats.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileDescriptorInfo extends StObject {
  
  var flags: String
  
  var pos: String
}
object FileDescriptorInfo {
  
  inline def apply(flags: String, pos: String): FileDescriptorInfo = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileDescriptorInfo]
  }
  
  extension [Self <: FileDescriptorInfo](x: Self) {
    
    inline def setFlags(value: String): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setPos(value: String): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
  }
}
