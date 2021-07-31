package typings.reactVis.mod

import typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreemapPoint
  extends StObject
     with AbstractSeriesPoint {
  
  var children: js.UndefOr[js.Array[TreemapPoint]] = js.undefined
  
  var color: js.UndefOr[String | Double] = js.undefined
  
  var opacity: js.UndefOr[Double] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
  
  var style: js.UndefOr[CSSProperties] = js.undefined
  
  var title: String
}
object TreemapPoint {
  
  @scala.inline
  def apply(title: String): TreemapPoint = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreemapPoint]
  }
  
  @scala.inline
  implicit class TreemapPointMutableBuilder[Self <: TreemapPoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: js.Array[TreemapPoint]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setChildrenVarargs(value: TreemapPoint*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setColor(value: String | Double): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
