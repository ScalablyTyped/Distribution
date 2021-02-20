package typings.reactMapGl.mod

import typings.reactMapGl.reactMapGlStrings.imperial
import typings.reactMapGl.reactMapGlStrings.metric
import typings.reactMapGl.reactMapGlStrings.nautical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScaleControlProps extends BaseControlProps {
  
  var maxWidth: js.UndefOr[Double] = js.native
  
  var unit: js.UndefOr[imperial | metric | nautical] = js.native
}
object ScaleControlProps {
  
  @scala.inline
  def apply(): ScaleControlProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScaleControlProps]
  }
  
  @scala.inline
  implicit class ScaleControlPropsMutableBuilder[Self <: ScaleControlProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    @scala.inline
    def setUnit(value: imperial | metric | nautical): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
  }
}
