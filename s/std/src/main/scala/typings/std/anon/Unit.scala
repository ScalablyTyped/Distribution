package typings.std.anon

import typings.std.Exclude
import typings.std.Intl.NumberFormatPartTypes
import typings.std.Intl.RelativeTimeFormatUnitSingular
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Unit extends StObject {
  
  /* standard es2020.intl */
  var `type`: Exclude[NumberFormatPartTypes, "literal"]
  
  /* standard es2020.intl */
  var unit: RelativeTimeFormatUnitSingular
  
  /* standard es2020.intl */
  var value: String
}
object Unit {
  
  inline def apply(
    `type`: Exclude[NumberFormatPartTypes, "literal"],
    unit: RelativeTimeFormatUnitSingular,
    value: String
  ): Unit = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Unit]
  }
  
  extension [Self <: Unit](x: Self) {
    
    inline def setType(value: Exclude[NumberFormatPartTypes, "literal"]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUnit(value: RelativeTimeFormatUnitSingular): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
