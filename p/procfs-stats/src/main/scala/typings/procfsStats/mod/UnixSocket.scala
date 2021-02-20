package typings.procfsStats.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnixSocket extends StObject {
  
  var Flags: String = js.native
  
  var Inode: String = js.native
  
  var Num: String = js.native
  
  var Path: String = js.native
  
  var Protocol: String = js.native
  
  var RefCount: String = js.native
  
  var St: String = js.native
  
  var Type: String = js.native
}
object UnixSocket {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class UnixSocketMutableBuilder[Self <: UnixSocket] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlags(value: String): Self = StObject.set(x, "Flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInode(value: String): Self = StObject.set(x, "Inode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNum(value: String): Self = StObject.set(x, "Num", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocol(value: String): Self = StObject.set(x, "Protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefCount(value: String): Self = StObject.set(x, "RefCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSt(value: String): Self = StObject.set(x, "St", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
