package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanvasRenderingContext2DSettings extends StObject {
  
  var alpha: js.UndefOr[scala.Boolean] = js.native
  
  var desynchronized: js.UndefOr[scala.Boolean] = js.native
}
object CanvasRenderingContext2DSettings {
  
  @scala.inline
  def apply(): CanvasRenderingContext2DSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanvasRenderingContext2DSettings]
  }
  
  @scala.inline
  implicit class CanvasRenderingContext2DSettingsMutableBuilder[Self <: CanvasRenderingContext2DSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlpha(value: scala.Boolean): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    @scala.inline
    def setDesynchronized(value: scala.Boolean): Self = StObject.set(x, "desynchronized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesynchronizedUndefined: Self = StObject.set(x, "desynchronized", js.undefined)
  }
}
