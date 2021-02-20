package typings.reactNativeSvg.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EllipseProps extends CommonPathProps {
  
  var cx: js.UndefOr[NumberProp] = js.native
  
  var cy: js.UndefOr[NumberProp] = js.native
  
  var opacity: js.UndefOr[NumberProp] = js.native
  
  var rx: js.UndefOr[NumberProp] = js.native
  
  var ry: js.UndefOr[NumberProp] = js.native
}
object EllipseProps {
  
  @scala.inline
  def apply(): EllipseProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EllipseProps]
  }
  
  @scala.inline
  implicit class EllipsePropsMutableBuilder[Self <: EllipseProps] (val x: Self) extends AnyVal {
    
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
    def setRx(value: NumberProp): Self = StObject.set(x, "rx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRxUndefined: Self = StObject.set(x, "rx", js.undefined)
    
    @scala.inline
    def setRy(value: NumberProp): Self = StObject.set(x, "ry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRyUndefined: Self = StObject.set(x, "ry", js.undefined)
  }
}
