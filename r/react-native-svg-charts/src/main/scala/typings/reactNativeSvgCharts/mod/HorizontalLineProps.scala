package typings.reactNativeSvgCharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HorizontalLineProps extends StObject {
  
  var stroke: String = js.native
}
object HorizontalLineProps {
  
  @scala.inline
  def apply(stroke: String): HorizontalLineProps = {
    val __obj = js.Dynamic.literal(stroke = stroke.asInstanceOf[js.Any])
    __obj.asInstanceOf[HorizontalLineProps]
  }
  
  @scala.inline
  implicit class HorizontalLinePropsMutableBuilder[Self <: HorizontalLineProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
  }
}
