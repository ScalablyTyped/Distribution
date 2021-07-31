package typings.reactBytesizeIcons.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BytesizeIconsProps
  extends StObject
     with BytesizeBaseIconsProps {
  
  var strokeLinecap: js.UndefOr[StrokeLinecap] = js.undefined
  
  var strokeLinejoin: js.UndefOr[StrokeLinejoin] = js.undefined
  
  var strokeWidth: js.UndefOr[String] = js.undefined
}
object BytesizeIconsProps {
  
  @scala.inline
  def apply(): BytesizeIconsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BytesizeIconsProps]
  }
  
  @scala.inline
  implicit class BytesizeIconsPropsMutableBuilder[Self <: BytesizeIconsProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStrokeLinecap(value: StrokeLinecap): Self = StObject.set(x, "strokeLinecap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeLinecapUndefined: Self = StObject.set(x, "strokeLinecap", js.undefined)
    
    @scala.inline
    def setStrokeLinejoin(value: StrokeLinejoin): Self = StObject.set(x, "strokeLinejoin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeLinejoinUndefined: Self = StObject.set(x, "strokeLinejoin", js.undefined)
    
    @scala.inline
    def setStrokeWidth(value: String): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
  }
}
