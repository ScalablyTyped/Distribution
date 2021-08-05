package typings.reactMapGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinearInterpolatorProps extends StObject {
  
  var around: js.UndefOr[js.Array[Double]] = js.undefined
  
  var transitionProps: js.UndefOr[js.Array[String]] = js.undefined
}
object LinearInterpolatorProps {
  
  inline def apply(): LinearInterpolatorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinearInterpolatorProps]
  }
  
  extension [Self <: LinearInterpolatorProps](x: Self) {
    
    inline def setAround(value: js.Array[Double]): Self = StObject.set(x, "around", value.asInstanceOf[js.Any])
    
    inline def setAroundUndefined: Self = StObject.set(x, "around", js.undefined)
    
    inline def setAroundVarargs(value: Double*): Self = StObject.set(x, "around", js.Array(value :_*))
    
    inline def setTransitionProps(value: js.Array[String]): Self = StObject.set(x, "transitionProps", value.asInstanceOf[js.Any])
    
    inline def setTransitionPropsUndefined: Self = StObject.set(x, "transitionProps", js.undefined)
    
    inline def setTransitionPropsVarargs(value: String*): Self = StObject.set(x, "transitionProps", js.Array(value :_*))
  }
}
