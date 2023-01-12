package typings.rdflib.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalName extends StObject {
  
  var localName: String
  
  var namespaceURI: String
}
object LocalName {
  
  inline def apply(localName: String, namespaceURI: String): LocalName = {
    val __obj = js.Dynamic.literal(localName = localName.asInstanceOf[js.Any], namespaceURI = namespaceURI.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LocalName] (val x: Self) extends AnyVal {
    
    inline def setLocalName(value: String): Self = StObject.set(x, "localName", value.asInstanceOf[js.Any])
    
    inline def setNamespaceURI(value: String): Self = StObject.set(x, "namespaceURI", value.asInstanceOf[js.Any])
  }
}
