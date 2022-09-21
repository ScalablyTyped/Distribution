package typings.reactSketchapp.anon

import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fx extends StObject {
  
  var children: Requireable[ReactNodeLike]
  
  var cx: Validator[String | Double]
  
  var cy: Validator[String | Double]
  
  var fx: Validator[String | Double]
  
  var fy: Validator[String | Double]
  
  var gradientUnits: Requireable[String]
  
  var id: Validator[String]
  
  var r: Requireable[String | Double]
  
  var rx: Requireable[String | Double]
  
  var ry: Requireable[String | Double]
}
object Fx {
  
  inline def apply(
    children: Requireable[ReactNodeLike],
    cx: Validator[String | Double],
    cy: Validator[String | Double],
    fx: Validator[String | Double],
    fy: Validator[String | Double],
    gradientUnits: Requireable[String],
    id: Validator[String],
    r: Requireable[String | Double],
    rx: Requireable[String | Double],
    ry: Requireable[String | Double]
  ): Fx = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], cx = cx.asInstanceOf[js.Any], cy = cy.asInstanceOf[js.Any], fx = fx.asInstanceOf[js.Any], fy = fy.asInstanceOf[js.Any], gradientUnits = gradientUnits.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], rx = rx.asInstanceOf[js.Any], ry = ry.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fx]
  }
  
  extension [Self <: Fx](x: Self) {
    
    inline def setChildren(value: Requireable[ReactNodeLike]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setCx(value: Validator[String | Double]): Self = StObject.set(x, "cx", value.asInstanceOf[js.Any])
    
    inline def setCy(value: Validator[String | Double]): Self = StObject.set(x, "cy", value.asInstanceOf[js.Any])
    
    inline def setFx(value: Validator[String | Double]): Self = StObject.set(x, "fx", value.asInstanceOf[js.Any])
    
    inline def setFy(value: Validator[String | Double]): Self = StObject.set(x, "fy", value.asInstanceOf[js.Any])
    
    inline def setGradientUnits(value: Requireable[String]): Self = StObject.set(x, "gradientUnits", value.asInstanceOf[js.Any])
    
    inline def setId(value: Validator[String]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setR(value: Requireable[String | Double]): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    
    inline def setRx(value: Requireable[String | Double]): Self = StObject.set(x, "rx", value.asInstanceOf[js.Any])
    
    inline def setRy(value: Requireable[String | Double]): Self = StObject.set(x, "ry", value.asInstanceOf[js.Any])
  }
}
