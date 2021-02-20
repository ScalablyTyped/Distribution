package typings.reactVis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HexbinSeriesProps extends AbstractSeriesProps[ContourSeriesPoint] {
  
  var radius: js.UndefOr[Double] = js.native
  
  var sizeHexagonsWithCount: js.UndefOr[Boolean] = js.native
  
  var xOffset: js.UndefOr[Double] = js.native
  
  var yOffset: js.UndefOr[Double] = js.native
}
object HexbinSeriesProps {
  
  @scala.inline
  def apply(): HexbinSeriesProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HexbinSeriesProps]
  }
  
  @scala.inline
  implicit class HexbinSeriesPropsMutableBuilder[Self <: HexbinSeriesProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    @scala.inline
    def setSizeHexagonsWithCount(value: Boolean): Self = StObject.set(x, "sizeHexagonsWithCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeHexagonsWithCountUndefined: Self = StObject.set(x, "sizeHexagonsWithCount", js.undefined)
    
    @scala.inline
    def setXOffset(value: Double): Self = StObject.set(x, "xOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXOffsetUndefined: Self = StObject.set(x, "xOffset", js.undefined)
    
    @scala.inline
    def setYOffset(value: Double): Self = StObject.set(x, "yOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYOffsetUndefined: Self = StObject.set(x, "yOffset", js.undefined)
  }
}
