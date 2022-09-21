package typings.steamUser.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServersRecord extends StObject {
  
  var servers: Record[String, String]
}
object ServersRecord {
  
  inline def apply(servers: Record[String, String]): ServersRecord = {
    val __obj = js.Dynamic.literal(servers = servers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServersRecord]
  }
  
  extension [Self <: ServersRecord](x: Self) {
    
    inline def setServers(value: Record[String, String]): Self = StObject.set(x, "servers", value.asInstanceOf[js.Any])
  }
}
