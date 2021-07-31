package typings.reactNativeSvg.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CircleProps
  extends StObject
     with CommonPathProps {
  
  var cx: js.UndefOr[NumberProp] = js.undefined
  
  var cy: js.UndefOr[NumberProp] = js.undefined
  
  var opacity: js.UndefOr[NumberProp] = js.undefined
  
  var r: js.UndefOr[NumberProp] = js.undefined
}
object CircleProps {
  
  @scala.inline
  def apply(): CircleProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CircleProps]
  }
  
  @scala.inline
  implicit class CirclePropsMutableBuilder[Self <: CircleProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCx(value: NumberProp): Self = StObject.set(x, "cx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCxUndefined: Self = StObject.set(x, "cx", js.undefined)
    
    @scala.inline
    def setCy(value: NumberProp): Self = StObject.set(x, "cy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCyUndefined: Self = StObject.set(x, "cy", js.undefined)
    
    @scala.inline
    def setOpacity(value: NumberProp): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setR(value: NumberProp): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRUndefined: Self = StObject.set(x, "r", js.undefined)
  }
}
