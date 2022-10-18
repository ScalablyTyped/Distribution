package typings.storybookComponents.`distTs3Dot9Modules@typesPrettierIndexMod`

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CursorOptions
  extends StObject
     with Options {
  
  /**
    * Specify where the cursor is.
    */
  var cursorOffset: Double
  
  @JSName("rangeEnd")
  var rangeEnd_CursorOptions: js.UndefOr[scala.Nothing] = js.undefined
  
  @JSName("rangeStart")
  var rangeStart_CursorOptions: js.UndefOr[scala.Nothing] = js.undefined
}
object CursorOptions {
  
  inline def apply(cursorOffset: Double): CursorOptions = {
    val __obj = js.Dynamic.literal(cursorOffset = cursorOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[CursorOptions]
  }
  
  extension [Self <: CursorOptions](x: Self) {
    
    inline def setCursorOffset(value: Double): Self = StObject.set(x, "cursorOffset", value.asInstanceOf[js.Any])
  }
}
