package typings.storybookComponents.`distTs3Dot9Modules@typesPrettierIndexMod`

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CursorResult extends StObject {
  
  var cursorOffset: Double
  
  var formatted: String
}
object CursorResult {
  
  inline def apply(cursorOffset: Double, formatted: String): CursorResult = {
    val __obj = js.Dynamic.literal(cursorOffset = cursorOffset.asInstanceOf[js.Any], formatted = formatted.asInstanceOf[js.Any])
    __obj.asInstanceOf[CursorResult]
  }
  
  extension [Self <: CursorResult](x: Self) {
    
    inline def setCursorOffset(value: Double): Self = StObject.set(x, "cursorOffset", value.asInstanceOf[js.Any])
    
    inline def setFormatted(value: String): Self = StObject.set(x, "formatted", value.asInstanceOf[js.Any])
  }
}
