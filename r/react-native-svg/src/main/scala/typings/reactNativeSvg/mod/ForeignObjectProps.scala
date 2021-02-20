package typings.reactNativeSvg.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForeignObjectProps extends StObject {
  
  var height: js.UndefOr[NumberProp] = js.native
  
  var width: js.UndefOr[NumberProp] = js.native
  
  var x: js.UndefOr[NumberProp] = js.native
  
  var y: js.UndefOr[NumberProp] = js.native
}
object ForeignObjectProps {
  
  @scala.inline
  def apply(): ForeignObjectProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ForeignObjectProps]
  }
  
  @scala.inline
  implicit class ForeignObjectPropsMutableBuilder[Self <: ForeignObjectProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: NumberProp): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setWidth(value: NumberProp): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setX(value: NumberProp): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: NumberProp): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
