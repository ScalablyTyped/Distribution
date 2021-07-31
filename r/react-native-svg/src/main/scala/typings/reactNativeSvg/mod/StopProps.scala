package typings.reactNativeSvg.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopProps extends StObject {
  
  var offset: js.UndefOr[NumberProp] = js.undefined
  
  var stopColor: js.UndefOr[Color] = js.undefined
  
  var stopOpacity: js.UndefOr[NumberProp] = js.undefined
}
object StopProps {
  
  @scala.inline
  def apply(): StopProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopProps]
  }
  
  @scala.inline
  implicit class StopPropsMutableBuilder[Self <: StopProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOffset(value: NumberProp): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setStopColor(value: Color): Self = StObject.set(x, "stopColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopColorUndefined: Self = StObject.set(x, "stopColor", js.undefined)
    
    @scala.inline
    def setStopColorVarargs(value: Double*): Self = StObject.set(x, "stopColor", js.Array(value :_*))
    
    @scala.inline
    def setStopOpacity(value: NumberProp): Self = StObject.set(x, "stopOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopOpacityUndefined: Self = StObject.set(x, "stopOpacity", js.undefined)
  }
}
