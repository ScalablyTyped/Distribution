package typings.storybookCoreServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropFilter extends StObject {
  
  def propFilter(prop: Any): Boolean
  
  var savePropValueAsString: Boolean
  
  var shouldExtractLiteralValuesFromEnum: Boolean
  
  var shouldRemoveUndefinedFromOptional: Boolean
}
object PropFilter {
  
  inline def apply(
    propFilter: Any => Boolean,
    savePropValueAsString: Boolean,
    shouldExtractLiteralValuesFromEnum: Boolean,
    shouldRemoveUndefinedFromOptional: Boolean
  ): PropFilter = {
    val __obj = js.Dynamic.literal(propFilter = js.Any.fromFunction1(propFilter), savePropValueAsString = savePropValueAsString.asInstanceOf[js.Any], shouldExtractLiteralValuesFromEnum = shouldExtractLiteralValuesFromEnum.asInstanceOf[js.Any], shouldRemoveUndefinedFromOptional = shouldRemoveUndefinedFromOptional.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PropFilter] (val x: Self) extends AnyVal {
    
    inline def setPropFilter(value: Any => Boolean): Self = StObject.set(x, "propFilter", js.Any.fromFunction1(value))
    
    inline def setSavePropValueAsString(value: Boolean): Self = StObject.set(x, "savePropValueAsString", value.asInstanceOf[js.Any])
    
    inline def setShouldExtractLiteralValuesFromEnum(value: Boolean): Self = StObject.set(x, "shouldExtractLiteralValuesFromEnum", value.asInstanceOf[js.Any])
    
    inline def setShouldRemoveUndefinedFromOptional(value: Boolean): Self = StObject.set(x, "shouldRemoveUndefinedFromOptional", value.asInstanceOf[js.Any])
  }
}
