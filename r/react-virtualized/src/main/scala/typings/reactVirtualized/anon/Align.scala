package typings.reactVirtualized.anon

import typings.reactVirtualized.reactVirtualizedStrings.auto
import typings.reactVirtualized.reactVirtualizedStrings.center
import typings.reactVirtualized.reactVirtualizedStrings.end
import typings.reactVirtualized.reactVirtualizedStrings.start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Align extends StObject {
  
  var align: auto | start | end | center
  
  var cellIndex: Double
  
  var height: Double
  
  var scrollLeft: Double
  
  var scrollTop: Double
  
  var width: Double
}
object Align {
  
  @scala.inline
  def apply(
    align: auto | start | end | center,
    cellIndex: Double,
    height: Double,
    scrollLeft: Double,
    scrollTop: Double,
    width: Double
  ): Align = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], cellIndex = cellIndex.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], scrollLeft = scrollLeft.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Align]
  }
  
  @scala.inline
  implicit class AlignMutableBuilder[Self <: Align] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlign(value: auto | start | end | center): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellIndex(value: Double): Self = StObject.set(x, "cellIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollLeft(value: Double): Self = StObject.set(x, "scrollLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollTop(value: Double): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
