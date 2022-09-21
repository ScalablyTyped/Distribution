package typings.sentryNode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerName extends StObject {
  
  var serverName: js.UndefOr[Boolean] = js.undefined
  
  var version: js.UndefOr[Boolean] = js.undefined
}
object ServerName {
  
  inline def apply(): ServerName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerName]
  }
  
  extension [Self <: ServerName](x: Self) {
    
    inline def setServerName(value: Boolean): Self = StObject.set(x, "serverName", value.asInstanceOf[js.Any])
    
    inline def setServerNameUndefined: Self = StObject.set(x, "serverName", js.undefined)
    
    inline def setVersion(value: Boolean): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
