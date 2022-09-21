package typings.std.Intl

import typings.std.Exclude
import typings.std.stdStrings.literal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object representing the relative time format in parts
  * that can be used for custom locale-aware formatting.
  *
  * [MDN](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/RelativeTimeFormat/formatToParts#Using_formatToParts).
  */
/* Rewritten from type alias, can be one of: 
  - typings.std.anon.Type
  - typings.std.anon.Unit
*/
trait RelativeTimeFormatPart extends StObject
object RelativeTimeFormatPart {
  
  inline def Type(value: String): typings.std.anon.Type = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("literal")
    __obj.asInstanceOf[typings.std.anon.Type]
  }
  
  inline def Unit(
    `type`: Exclude[NumberFormatPartTypes, literal],
    unit: RelativeTimeFormatUnitSingular,
    value: String
  ): typings.std.anon.Unit = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.std.anon.Unit]
  }
}
