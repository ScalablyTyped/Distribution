package typings.reactNativeSvg.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolylineProps extends CommonPathProps {
  
  var opacity: js.UndefOr[NumberProp] = js.native
  
  var points: js.UndefOr[String | js.Array[NumberProp]] = js.native
}
object PolylineProps {
  
  @scala.inline
  def apply(): PolylineProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolylineProps]
  }
  
  @scala.inline
  implicit class PolylinePropsMutableBuilder[Self <: PolylineProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOpacity(value: NumberProp): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setPoints(value: String | js.Array[NumberProp]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
    
    @scala.inline
    def setPointsVarargs(value: NumberProp*): Self = StObject.set(x, "points", js.Array(value :_*))
  }
}
