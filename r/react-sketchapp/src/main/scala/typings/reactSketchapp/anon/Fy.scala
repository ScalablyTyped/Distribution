package typings.reactSketchapp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fy extends StObject {
  
  var cx: String
  
  var cy: String
  
  var fx: String
  
  var fy: String
  
  var r: String
}
object Fy {
  
  inline def apply(cx: String, cy: String, fx: String, fy: String, r: String): Fy = {
    val __obj = js.Dynamic.literal(cx = cx.asInstanceOf[js.Any], cy = cy.asInstanceOf[js.Any], fx = fx.asInstanceOf[js.Any], fy = fy.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fy]
  }
  
  extension [Self <: Fy](x: Self) {
    
    inline def setCx(value: String): Self = StObject.set(x, "cx", value.asInstanceOf[js.Any])
    
    inline def setCy(value: String): Self = StObject.set(x, "cy", value.asInstanceOf[js.Any])
    
    inline def setFx(value: String): Self = StObject.set(x, "fx", value.asInstanceOf[js.Any])
    
    inline def setFy(value: String): Self = StObject.set(x, "fy", value.asInstanceOf[js.Any])
    
    inline def setR(value: String): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
