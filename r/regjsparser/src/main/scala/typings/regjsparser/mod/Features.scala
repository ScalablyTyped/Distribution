package typings.regjsparser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Features extends StObject {
  
  var lookbehind: js.UndefOr[Boolean] = js.undefined
  
  var modifiers: js.UndefOr[Boolean] = js.undefined
  
  var namedGroups: js.UndefOr[Boolean] = js.undefined
  
  var unicodePropertyEscape: js.UndefOr[Boolean] = js.undefined
  
  var unicodeSet: js.UndefOr[Boolean] = js.undefined
}
object Features {
  
  inline def apply(): Features = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Features]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Features] (val x: Self) extends AnyVal {
    
    inline def setLookbehind(value: Boolean): Self = StObject.set(x, "lookbehind", value.asInstanceOf[js.Any])
    
    inline def setLookbehindUndefined: Self = StObject.set(x, "lookbehind", js.undefined)
    
    inline def setModifiers(value: Boolean): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
    
    inline def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
    
    inline def setNamedGroups(value: Boolean): Self = StObject.set(x, "namedGroups", value.asInstanceOf[js.Any])
    
    inline def setNamedGroupsUndefined: Self = StObject.set(x, "namedGroups", js.undefined)
    
    inline def setUnicodePropertyEscape(value: Boolean): Self = StObject.set(x, "unicodePropertyEscape", value.asInstanceOf[js.Any])
    
    inline def setUnicodePropertyEscapeUndefined: Self = StObject.set(x, "unicodePropertyEscape", js.undefined)
    
    inline def setUnicodeSet(value: Boolean): Self = StObject.set(x, "unicodeSet", value.asInstanceOf[js.Any])
    
    inline def setUnicodeSetUndefined: Self = StObject.set(x, "unicodeSet", js.undefined)
  }
}
