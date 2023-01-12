package typings.reactNativeSvgCharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HorizontalLineProps extends StObject {
  
  var stroke: String
}
object HorizontalLineProps {
  
  inline def apply(stroke: String): HorizontalLineProps = {
    val __obj = js.Dynamic.literal(stroke = stroke.asInstanceOf[js.Any])
    __obj.asInstanceOf[HorizontalLineProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HorizontalLineProps] (val x: Self) extends AnyVal {
    
    inline def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
  }
}
