package typings.reactNativeWindows.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentLength extends StObject {
  
  var contentLength: Double
  
  var renderedRows: Double
  
  var totalRows: Double
  
  var visibleRows: Double
}
object ContentLength {
  
  inline def apply(contentLength: Double, renderedRows: Double, totalRows: Double, visibleRows: Double): ContentLength = {
    val __obj = js.Dynamic.literal(contentLength = contentLength.asInstanceOf[js.Any], renderedRows = renderedRows.asInstanceOf[js.Any], totalRows = totalRows.asInstanceOf[js.Any], visibleRows = visibleRows.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentLength]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentLength] (val x: Self) extends AnyVal {
    
    inline def setContentLength(value: Double): Self = StObject.set(x, "contentLength", value.asInstanceOf[js.Any])
    
    inline def setRenderedRows(value: Double): Self = StObject.set(x, "renderedRows", value.asInstanceOf[js.Any])
    
    inline def setTotalRows(value: Double): Self = StObject.set(x, "totalRows", value.asInstanceOf[js.Any])
    
    inline def setVisibleRows(value: Double): Self = StObject.set(x, "visibleRows", value.asInstanceOf[js.Any])
  }
}
