package typings.reactNativeSvg.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait R extends StObject {
  
  var cx: String
  
  var cy: String
  
  var r: String
}
object R {
  
  inline def apply(cx: String, cy: String, r: String): R = {
    val __obj = js.Dynamic.literal(cx = cx.asInstanceOf[js.Any], cy = cy.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
    __obj.asInstanceOf[R]
  }
  
  extension [Self <: R](x: Self) {
    
    inline def setCx(value: String): Self = StObject.set(x, "cx", value.asInstanceOf[js.Any])
    
    inline def setCy(value: String): Self = StObject.set(x, "cy", value.asInstanceOf[js.Any])
    
    inline def setR(value: String): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
