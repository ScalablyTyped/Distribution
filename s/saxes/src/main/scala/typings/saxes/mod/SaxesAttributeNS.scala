package typings.saxes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SaxesAttributeNS
  extends StObject
     with SaxesAttribute {
  
  /**
    * The attribute's local name. For instance ``a:b="c"`` would have ``"b"`` for
    * ``local``.
    */
  var local: String
  
  /**
    * The attribute's name. This is the combination of prefix and local name.
    * For instance ``a:b="c"`` would have ``a:b`` for name.
    */
  var name: String
  
  /**
    * The attribute's prefix. For instance ``a:b="c"`` would have ``"a"`` for
    * ``prefix``.
    */
  var prefix: String
  
  /** The namespace URI of this attribute. */
  var uri: String
  
  /** The attribute's value. */
  var value: String
}
object SaxesAttributeNS {
  
  inline def apply(local: String, name: String, prefix: String, uri: String, value: String): SaxesAttributeNS = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaxesAttributeNS]
  }
  
  extension [Self <: SaxesAttributeNS](x: Self) {
    
    inline def setLocal(value: String): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
