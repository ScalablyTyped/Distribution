package typings.redisClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommandsClientINFOMod {
  
  @JSImport("@redis/client/dist/lib/commands/CLIENT_INFO", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def transformArguments(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")().asInstanceOf[js.Array[String]]
  
  inline def transformReply(reply: String): ClientInfoReply = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")(reply.asInstanceOf[js.Any]).asInstanceOf[ClientInfoReply]
  
  trait ClientInfoReply extends StObject {
    
    var addr: String
    
    var age: Double
    
    var argvMem: Double
    
    var cmd: String
    
    var db: Double
    
    var events: String
    
    var fd: Double
    
    var flags: String
    
    var id: Double
    
    var idle: Double
    
    var laddr: String
    
    var multi: Double
    
    var name: String
    
    var obl: Double
    
    var oll: Double
    
    var omem: Double
    
    var psub: Double
    
    var qbuf: Double
    
    var qbufFree: Double
    
    var redir: Double
    
    var sub: Double
    
    var totMem: Double
    
    var user: String
  }
  object ClientInfoReply {
    
    inline def apply(
      addr: String,
      age: Double,
      argvMem: Double,
      cmd: String,
      db: Double,
      events: String,
      fd: Double,
      flags: String,
      id: Double,
      idle: Double,
      laddr: String,
      multi: Double,
      name: String,
      obl: Double,
      oll: Double,
      omem: Double,
      psub: Double,
      qbuf: Double,
      qbufFree: Double,
      redir: Double,
      sub: Double,
      totMem: Double,
      user: String
    ): ClientInfoReply = {
      val __obj = js.Dynamic.literal(addr = addr.asInstanceOf[js.Any], age = age.asInstanceOf[js.Any], argvMem = argvMem.asInstanceOf[js.Any], cmd = cmd.asInstanceOf[js.Any], db = db.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], fd = fd.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], idle = idle.asInstanceOf[js.Any], laddr = laddr.asInstanceOf[js.Any], multi = multi.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], obl = obl.asInstanceOf[js.Any], oll = oll.asInstanceOf[js.Any], omem = omem.asInstanceOf[js.Any], psub = psub.asInstanceOf[js.Any], qbuf = qbuf.asInstanceOf[js.Any], qbufFree = qbufFree.asInstanceOf[js.Any], redir = redir.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any], totMem = totMem.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientInfoReply]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ClientInfoReply] (val x: Self) extends AnyVal {
      
      inline def setAddr(value: String): Self = StObject.set(x, "addr", value.asInstanceOf[js.Any])
      
      inline def setAge(value: Double): Self = StObject.set(x, "age", value.asInstanceOf[js.Any])
      
      inline def setArgvMem(value: Double): Self = StObject.set(x, "argvMem", value.asInstanceOf[js.Any])
      
      inline def setCmd(value: String): Self = StObject.set(x, "cmd", value.asInstanceOf[js.Any])
      
      inline def setDb(value: Double): Self = StObject.set(x, "db", value.asInstanceOf[js.Any])
      
      inline def setEvents(value: String): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setFd(value: Double): Self = StObject.set(x, "fd", value.asInstanceOf[js.Any])
      
      inline def setFlags(value: String): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdle(value: Double): Self = StObject.set(x, "idle", value.asInstanceOf[js.Any])
      
      inline def setLaddr(value: String): Self = StObject.set(x, "laddr", value.asInstanceOf[js.Any])
      
      inline def setMulti(value: Double): Self = StObject.set(x, "multi", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setObl(value: Double): Self = StObject.set(x, "obl", value.asInstanceOf[js.Any])
      
      inline def setOll(value: Double): Self = StObject.set(x, "oll", value.asInstanceOf[js.Any])
      
      inline def setOmem(value: Double): Self = StObject.set(x, "omem", value.asInstanceOf[js.Any])
      
      inline def setPsub(value: Double): Self = StObject.set(x, "psub", value.asInstanceOf[js.Any])
      
      inline def setQbuf(value: Double): Self = StObject.set(x, "qbuf", value.asInstanceOf[js.Any])
      
      inline def setQbufFree(value: Double): Self = StObject.set(x, "qbufFree", value.asInstanceOf[js.Any])
      
      inline def setRedir(value: Double): Self = StObject.set(x, "redir", value.asInstanceOf[js.Any])
      
      inline def setSub(value: Double): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
      
      inline def setTotMem(value: Double): Self = StObject.set(x, "totMem", value.asInstanceOf[js.Any])
      
      inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
}
