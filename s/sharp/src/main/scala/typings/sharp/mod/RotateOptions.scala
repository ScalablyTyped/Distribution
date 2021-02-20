package typings.sharp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RotateOptions extends StObject {
  
  /** parsed by the color module to extract values for red, green, blue and alpha. (optional, default "#000000") */
  var background: js.UndefOr[Color] = js.native
}
object RotateOptions {
  
  @scala.inline
  def apply(): RotateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RotateOptions]
  }
  
  @scala.inline
  implicit class RotateOptionsMutableBuilder[Self <: RotateOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackground(value: Color): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
  }
}
