package typings.storybookCoreCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropFilter extends StObject {
  
  def propFilter(prop: Any): Boolean
  
  var shouldExtractLiteralValuesFromEnum: Boolean
  
  var shouldRemoveUndefinedFromOptional: Boolean
}
object PropFilter {
  
  inline def apply(
    propFilter: Any => Boolean,
    shouldExtractLiteralValuesFromEnum: Boolean,
    shouldRemoveUndefinedFromOptional: Boolean
  ): PropFilter = {
    val __obj = js.Dynamic.literal(propFilter = js.Any.fromFunction1(propFilter), shouldExtractLiteralValuesFromEnum = shouldExtractLiteralValuesFromEnum.asInstanceOf[js.Any], shouldRemoveUndefinedFromOptional = shouldRemoveUndefinedFromOptional.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropFilter]
  }
  
  extension [Self <: PropFilter](x: Self) {
    
    inline def setPropFilter(value: Any => Boolean): Self = StObject.set(x, "propFilter", js.Any.fromFunction1(value))
    
    inline def setShouldExtractLiteralValuesFromEnum(value: Boolean): Self = StObject.set(x, "shouldExtractLiteralValuesFromEnum", value.asInstanceOf[js.Any])
    
    inline def setShouldRemoveUndefinedFromOptional(value: Boolean): Self = StObject.set(x, "shouldRemoveUndefinedFromOptional", value.asInstanceOf[js.Any])
  }
}
