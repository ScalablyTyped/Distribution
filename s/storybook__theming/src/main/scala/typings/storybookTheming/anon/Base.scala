package typings.storybookTheming.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Base extends StObject {
  
  var base: String
  
  var mono: String
}
object Base {
  
  inline def apply(base: String, mono: String): Base = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], mono = mono.asInstanceOf[js.Any])
    __obj.asInstanceOf[Base]
  }
  
  extension [Self <: Base](x: Self) {
    
    inline def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    inline def setMono(value: String): Self = StObject.set(x, "mono", value.asInstanceOf[js.Any])
  }
}
