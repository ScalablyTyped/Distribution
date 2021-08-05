package typings.procfsStats.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnixSocket extends StObject {
  
  var Flags: String
  
  var Inode: String
  
  var Num: String
  
  var Path: String
  
  var Protocol: String
  
  var RefCount: String
  
  var St: String
  
  var Type: String
}
object UnixSocket {
  
  inline def apply(
    Flags: String,
    Inode: String,
    Num: String,
    Path: String,
    Protocol: String,
    RefCount: String,
    St: String,
    Type: String
  ): UnixSocket = {
    val __obj = js.Dynamic.literal(Flags = Flags.asInstanceOf[js.Any], Inode = Inode.asInstanceOf[js.Any], Num = Num.asInstanceOf[js.Any], Path = Path.asInstanceOf[js.Any], Protocol = Protocol.asInstanceOf[js.Any], RefCount = RefCount.asInstanceOf[js.Any], St = St.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnixSocket]
  }
  
  extension [Self <: UnixSocket](x: Self) {
    
    inline def setFlags(value: String): Self = StObject.set(x, "Flags", value.asInstanceOf[js.Any])
    
    inline def setInode(value: String): Self = StObject.set(x, "Inode", value.asInstanceOf[js.Any])
    
    inline def setNum(value: String): Self = StObject.set(x, "Num", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
    
    inline def setProtocol(value: String): Self = StObject.set(x, "Protocol", value.asInstanceOf[js.Any])
    
    inline def setRefCount(value: String): Self = StObject.set(x, "RefCount", value.asInstanceOf[js.Any])
    
    inline def setSt(value: String): Self = StObject.set(x, "St", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
