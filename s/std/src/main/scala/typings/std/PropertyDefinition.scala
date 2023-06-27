package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertyDefinition extends StObject {
  
  /* standard dom */
  var inherits: scala.Boolean
  
  /* standard dom */
  var initialValue: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard dom */
  var name: java.lang.String
  
  /* standard dom */
  var syntax: js.UndefOr[java.lang.String] = js.undefined
}
object PropertyDefinition {
  
  inline def apply(inherits: scala.Boolean, name: java.lang.String): PropertyDefinition = {
    val __obj = js.Dynamic.literal(inherits = inherits.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PropertyDefinition] (val x: Self) extends AnyVal {
    
    inline def setInherits(value: scala.Boolean): Self = StObject.set(x, "inherits", value.asInstanceOf[js.Any])
    
    inline def setInitialValue(value: java.lang.String): Self = StObject.set(x, "initialValue", value.asInstanceOf[js.Any])
    
    inline def setInitialValueUndefined: Self = StObject.set(x, "initialValue", js.undefined)
    
    inline def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSyntax(value: java.lang.String): Self = StObject.set(x, "syntax", value.asInstanceOf[js.Any])
    
    inline def setSyntaxUndefined: Self = StObject.set(x, "syntax", js.undefined)
  }
}
