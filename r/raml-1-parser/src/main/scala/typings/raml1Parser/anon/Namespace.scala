package typings.raml1Parser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Namespace extends StObject {
  
  /**
    * If attribute is set to true, a type instance should be serialized
    * as an XML attribute. It can only be true for scalar types.
    */
  var attribute: js.UndefOr[scala.Boolean] = js.undefined
  
  /**
    * Allows to override the name of the XML element or
    * XML attribute in it's XML representation
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  
  /**
    * Allows to configure the name of the XML namespace
    */
  var namespace: js.UndefOr[java.lang.String] = js.undefined
  
  /**
    * Allows to configure the prefix which will be used
    * during serialization to XML
    */
  var prefix: js.UndefOr[java.lang.String] = js.undefined
  
  /**
    * If wrapped is set to true, a type instance should be wrapped
    * in its own XML element. It can not be true for scalar types and
    * it can not be true at the same moment when attribute is true
    */
  var wrapped: js.UndefOr[scala.Boolean] = js.undefined
}
object Namespace {
  
  inline def apply(): Namespace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Namespace]
  }
  
  extension [Self <: Namespace](x: Self) {
    
    inline def setAttribute(value: scala.Boolean): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    inline def setAttributeUndefined: Self = StObject.set(x, "attribute", js.undefined)
    
    inline def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNamespace(value: java.lang.String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    
    inline def setPrefix(value: java.lang.String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    inline def setWrapped(value: scala.Boolean): Self = StObject.set(x, "wrapped", value.asInstanceOf[js.Any])
    
    inline def setWrappedUndefined: Self = StObject.set(x, "wrapped", js.undefined)
  }
}
