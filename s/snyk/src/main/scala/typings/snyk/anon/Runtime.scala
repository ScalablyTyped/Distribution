package typings.snyk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Runtime extends StObject {
  
  var name: String
  
  var runtime: js.UndefOr[String] = js.undefined
}
object Runtime {
  
  inline def apply(name: String): Runtime = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Runtime]
  }
  
  extension [Self <: Runtime](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRuntime(value: String): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    
    inline def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
  }
}
