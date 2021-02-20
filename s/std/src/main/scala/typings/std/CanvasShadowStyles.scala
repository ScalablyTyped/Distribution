package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanvasShadowStyles extends StObject {
  
  var shadowBlur: Double = js.native
  
  var shadowColor: java.lang.String = js.native
  
  var shadowOffsetX: Double = js.native
  
  var shadowOffsetY: Double = js.native
}
object CanvasShadowStyles {
  
  @scala.inline
  def apply(shadowBlur: Double, shadowColor: java.lang.String, shadowOffsetX: Double, shadowOffsetY: Double): CanvasShadowStyles = {
    val __obj = js.Dynamic.literal(shadowBlur = shadowBlur.asInstanceOf[js.Any], shadowColor = shadowColor.asInstanceOf[js.Any], shadowOffsetX = shadowOffsetX.asInstanceOf[js.Any], shadowOffsetY = shadowOffsetY.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasShadowStyles]
  }
  
  @scala.inline
  implicit class CanvasShadowStylesMutableBuilder[Self <: CanvasShadowStyles] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setShadowBlur(value: Double): Self = StObject.set(x, "shadowBlur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowColor(value: java.lang.String): Self = StObject.set(x, "shadowColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowOffsetX(value: Double): Self = StObject.set(x, "shadowOffsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowOffsetY(value: Double): Self = StObject.set(x, "shadowOffsetY", value.asInstanceOf[js.Any])
  }
}
