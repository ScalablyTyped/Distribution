package typings.reactVis.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartLabelProps extends StObject {
  
  var className: js.UndefOr[String] = js.native
  
  var includeMargin: js.UndefOr[Boolean] = js.native
  
  var style: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var text: String = js.native
  
  var xPercent: Double = js.native
  
  var yPercent: Double = js.native
}
object ChartLabelProps {
  
  @scala.inline
  def apply(text: String, xPercent: Double, yPercent: Double): ChartLabelProps = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], xPercent = xPercent.asInstanceOf[js.Any], yPercent = yPercent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartLabelProps]
  }
  
  @scala.inline
  implicit class ChartLabelPropsMutableBuilder[Self <: ChartLabelProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setIncludeMargin(value: Boolean): Self = StObject.set(x, "includeMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeMarginUndefined: Self = StObject.set(x, "includeMargin", js.undefined)
    
    @scala.inline
    def setStyle(value: StringDictionary[js.Any]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXPercent(value: Double): Self = StObject.set(x, "xPercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYPercent(value: Double): Self = StObject.set(x, "yPercent", value.asInstanceOf[js.Any])
  }
}
