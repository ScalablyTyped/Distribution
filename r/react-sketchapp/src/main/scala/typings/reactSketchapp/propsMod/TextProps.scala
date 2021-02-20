package typings.reactSketchapp.propsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextProps extends TextSpecificProps {
  
  var dx: js.UndefOr[NumberArrayProp] = js.native
  
  var dy: js.UndefOr[NumberArrayProp] = js.native
}
object TextProps {
  
  @scala.inline
  def apply(): TextProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextProps]
  }
  
  @scala.inline
  implicit class TextPropsMutableBuilder[Self <: TextProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDx(value: NumberArrayProp): Self = StObject.set(x, "dx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDxUndefined: Self = StObject.set(x, "dx", js.undefined)
    
    @scala.inline
    def setDxVarargs(value: NumberProp*): Self = StObject.set(x, "dx", js.Array(value :_*))
    
    @scala.inline
    def setDy(value: NumberArrayProp): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDyUndefined: Self = StObject.set(x, "dy", js.undefined)
    
    @scala.inline
    def setDyVarargs(value: NumberProp*): Self = StObject.set(x, "dy", js.Array(value :_*))
  }
}
