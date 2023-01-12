package typings.reactVis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContourSeriesProps
  extends StObject
     with AbstractSeriesProps[ContourSeriesPoint] {
  
  var bandwidth: js.UndefOr[Double] = js.undefined
  
  // default: 40
  var marginLeft: js.UndefOr[Double] = js.undefined
  
  var marginTop: js.UndefOr[Double] = js.undefined
}
object ContourSeriesProps {
  
  inline def apply(): ContourSeriesProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContourSeriesProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContourSeriesProps] (val x: Self) extends AnyVal {
    
    inline def setBandwidth(value: Double): Self = StObject.set(x, "bandwidth", value.asInstanceOf[js.Any])
    
    inline def setBandwidthUndefined: Self = StObject.set(x, "bandwidth", js.undefined)
    
    inline def setMarginLeft(value: Double): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
    
    inline def setMarginLeftUndefined: Self = StObject.set(x, "marginLeft", js.undefined)
    
    inline def setMarginTop(value: Double): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
    
    inline def setMarginTopUndefined: Self = StObject.set(x, "marginTop", js.undefined)
  }
}
