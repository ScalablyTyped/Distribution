package typings.rdflib.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelfClosing extends StObject {
  
  var selfClosing: String
}
object SelfClosing {
  
  inline def apply(selfClosing: String): SelfClosing = {
    val __obj = js.Dynamic.literal(selfClosing = selfClosing.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelfClosing]
  }
  
  extension [Self <: SelfClosing](x: Self) {
    
    inline def setSelfClosing(value: String): Self = StObject.set(x, "selfClosing", value.asInstanceOf[js.Any])
  }
}
