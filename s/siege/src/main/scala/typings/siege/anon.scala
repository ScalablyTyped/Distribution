package typings.siege

import typings.siege.mod.Stringifiable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait C2mem extends StObject {
    
    var c2mem: js.UndefOr[String] = js.undefined
    
    var dot: js.UndefOr[String] = js.undefined
    
    var line: js.UndefOr[String] = js.undefined
  }
  object C2mem {
    
    inline def apply(): C2mem = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[C2mem]
    }
    
    extension [Self <: C2mem](x: Self) {
      
      inline def setC2mem(value: String): Self = StObject.set(x, "c2mem", value.asInstanceOf[js.Any])
      
      inline def setC2memUndefined: Self = StObject.set(x, "c2mem", js.undefined)
      
      inline def setDot(value: String): Self = StObject.set(x, "dot", value.asInstanceOf[js.Any])
      
      inline def setDotUndefined: Self = StObject.set(x, "dot", js.undefined)
      
      inline def setLine(value: String): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    }
  }
  
  trait Method extends StObject {
    
    var method: js.UndefOr[typings.siege.mod.Method] = js.undefined
    
    var path: String
    
    var query: js.UndefOr[Stringifiable] = js.undefined
  }
  object Method {
    
    inline def apply(path: String): Method = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Method]
    }
    
    extension [Self <: Method](x: Self) {
      
      inline def setMethod(value: typings.siege.mod.Method): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setQuery(value: Stringifiable): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    }
  }
}
