package typings.raml1Parser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Domain extends StObject {
  
  var domain: java.lang.String
  
  var name: java.lang.String
  
  var range: java.lang.String
}
object Domain {
  
  inline def apply(domain: java.lang.String, name: java.lang.String, range: java.lang.String): Domain = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Domain]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Domain] (val x: Self) extends AnyVal {
    
    inline def setDomain(value: java.lang.String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRange(value: java.lang.String): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
  }
}
