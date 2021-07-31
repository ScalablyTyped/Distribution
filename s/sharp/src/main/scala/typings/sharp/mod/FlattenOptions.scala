package typings.sharp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlattenOptions extends StObject {
  
  /** background colour, parsed by the color module, defaults to black. (optional, default {r:0,g:0,b:0}) */
  var background: js.UndefOr[Color] = js.undefined
}
object FlattenOptions {
  
  @scala.inline
  def apply(): FlattenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlattenOptions]
  }
  
  @scala.inline
  implicit class FlattenOptionsMutableBuilder[Self <: FlattenOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackground(value: Color): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
  }
}
