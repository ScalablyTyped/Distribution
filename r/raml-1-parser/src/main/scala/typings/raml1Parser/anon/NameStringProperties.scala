package typings.raml1Parser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NameStringProperties extends StObject {
  
  var name: java.lang.String
}
object NameStringProperties {
  
  inline def apply(name: java.lang.String): NameStringProperties = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameStringProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NameStringProperties] (val x: Self) extends AnyVal {
    
    inline def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
