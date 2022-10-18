package typings.snyk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Patched extends StObject {
  
  var patched: String
}
object Patched {
  
  inline def apply(patched: String): Patched = {
    val __obj = js.Dynamic.literal(patched = patched.asInstanceOf[js.Any])
    __obj.asInstanceOf[Patched]
  }
  
  extension [Self <: Patched](x: Self) {
    
    inline def setPatched(value: String): Self = StObject.set(x, "patched", value.asInstanceOf[js.Any])
  }
}
