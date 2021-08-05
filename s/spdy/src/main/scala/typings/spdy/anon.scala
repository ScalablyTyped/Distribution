package typings.spdy

import typings.spdy.mod.server.Protocol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AutoSpdy31 extends StObject {
    
    var autoSpdy31: js.UndefOr[Boolean] = js.undefined
    
    var windowSize: js.UndefOr[Double] = js.undefined
  }
  object AutoSpdy31 {
    
    inline def apply(): AutoSpdy31 = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutoSpdy31]
    }
    
    extension [Self <: AutoSpdy31](x: Self) {
      
      inline def setAutoSpdy31(value: Boolean): Self = StObject.set(x, "autoSpdy31", value.asInstanceOf[js.Any])
      
      inline def setAutoSpdy31Undefined: Self = StObject.set(x, "autoSpdy31", js.undefined)
      
      inline def setWindowSize(value: Double): Self = StObject.set(x, "windowSize", value.asInstanceOf[js.Any])
      
      inline def setWindowSizeUndefined: Self = StObject.set(x, "windowSize", js.undefined)
    }
  }
  
  trait Connection extends StObject {
    
    var connection: js.UndefOr[AutoSpdy31] = js.undefined
    
    var plain: js.UndefOr[Boolean] = js.undefined
    
    var protocols: js.UndefOr[js.Array[Protocol]] = js.undefined
    
    var `x-forwarded-for`: js.UndefOr[Boolean] = js.undefined
  }
  object Connection {
    
    inline def apply(): Connection = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Connection]
    }
    
    extension [Self <: Connection](x: Self) {
      
      inline def setConnection(value: AutoSpdy31): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
      
      inline def setConnectionUndefined: Self = StObject.set(x, "connection", js.undefined)
      
      inline def setPlain(value: Boolean): Self = StObject.set(x, "plain", value.asInstanceOf[js.Any])
      
      inline def setPlainUndefined: Self = StObject.set(x, "plain", js.undefined)
      
      inline def setProtocols(value: js.Array[Protocol]): Self = StObject.set(x, "protocols", value.asInstanceOf[js.Any])
      
      inline def setProtocolsUndefined: Self = StObject.set(x, "protocols", js.undefined)
      
      inline def setProtocolsVarargs(value: Protocol*): Self = StObject.set(x, "protocols", js.Array(value :_*))
      
      inline def `setX-forwarded-for`(value: Boolean): Self = StObject.set(x, "x-forwarded-for", value.asInstanceOf[js.Any])
      
      inline def `setX-forwarded-forUndefined`: Self = StObject.set(x, "x-forwarded-for", js.undefined)
    }
  }
  
  trait Plain extends StObject {
    
    var plain: js.UndefOr[Boolean] = js.undefined
    
    var protocol: js.UndefOr[String] = js.undefined
    
    var protocols: js.UndefOr[js.Array[String]] = js.undefined
    
    var ssl: js.UndefOr[Boolean] = js.undefined
    
    var `x-forwarded-for`: js.UndefOr[String] = js.undefined
  }
  object Plain {
    
    inline def apply(): Plain = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Plain]
    }
    
    extension [Self <: Plain](x: Self) {
      
      inline def setPlain(value: Boolean): Self = StObject.set(x, "plain", value.asInstanceOf[js.Any])
      
      inline def setPlainUndefined: Self = StObject.set(x, "plain", js.undefined)
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      inline def setProtocols(value: js.Array[String]): Self = StObject.set(x, "protocols", value.asInstanceOf[js.Any])
      
      inline def setProtocolsUndefined: Self = StObject.set(x, "protocols", js.undefined)
      
      inline def setProtocolsVarargs(value: String*): Self = StObject.set(x, "protocols", js.Array(value :_*))
      
      inline def setSsl(value: Boolean): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
      
      inline def setSslUndefined: Self = StObject.set(x, "ssl", js.undefined)
      
      inline def `setX-forwarded-for`(value: String): Self = StObject.set(x, "x-forwarded-for", value.asInstanceOf[js.Any])
      
      inline def `setX-forwarded-forUndefined`: Self = StObject.set(x, "x-forwarded-for", js.undefined)
    }
  }
}
