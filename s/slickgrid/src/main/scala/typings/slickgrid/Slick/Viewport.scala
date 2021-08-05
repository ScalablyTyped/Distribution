package typings.slickgrid.Slick

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Viewport extends StObject {
  
  var bottom: Double
  
  var leftPx: Double
  
  var rightPx: Double
  
  var top: Double
}
object Viewport {
  
  inline def apply(bottom: Double, leftPx: Double, rightPx: Double, top: Double): Viewport = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], leftPx = leftPx.asInstanceOf[js.Any], rightPx = rightPx.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Viewport]
  }
  
  extension [Self <: Viewport](x: Self) {
    
    inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setLeftPx(value: Double): Self = StObject.set(x, "leftPx", value.asInstanceOf[js.Any])
    
    inline def setRightPx(value: Double): Self = StObject.set(x, "rightPx", value.asInstanceOf[js.Any])
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
  }
}
