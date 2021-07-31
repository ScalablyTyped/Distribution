package typings.reactNativeSvg.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineProps
  extends StObject
     with CommonPathProps {
  
  var opacity: js.UndefOr[NumberProp] = js.undefined
  
  var x1: js.UndefOr[NumberProp] = js.undefined
  
  var x2: js.UndefOr[NumberProp] = js.undefined
  
  var y1: js.UndefOr[NumberProp] = js.undefined
  
  var y2: js.UndefOr[NumberProp] = js.undefined
}
object LineProps {
  
  @scala.inline
  def apply(): LineProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineProps]
  }
  
  @scala.inline
  implicit class LinePropsMutableBuilder[Self <: LineProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOpacity(value: NumberProp): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setX1(value: NumberProp): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX1Undefined: Self = StObject.set(x, "x1", js.undefined)
    
    @scala.inline
    def setX2(value: NumberProp): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX2Undefined: Self = StObject.set(x, "x2", js.undefined)
    
    @scala.inline
    def setY1(value: NumberProp): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY1Undefined: Self = StObject.set(x, "y1", js.undefined)
    
    @scala.inline
    def setY2(value: NumberProp): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY2Undefined: Self = StObject.set(x, "y2", js.undefined)
  }
}
