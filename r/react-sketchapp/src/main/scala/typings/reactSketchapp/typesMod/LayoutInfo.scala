package typings.reactSketchapp.typesMod

import typings.reactSketchapp.reactSketchappStrings.ltr
import typings.reactSketchapp.reactSketchappStrings.rtl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LayoutInfo extends StObject {
  
  var bottom: Double = js.native
  
  var direction: js.UndefOr[ltr | rtl] = js.native
  
  var height: Double = js.native
  
  var left: Double = js.native
  
  var right: Double = js.native
  
  var top: Double = js.native
  
  var width: Double = js.native
}
object LayoutInfo {
  
  @scala.inline
  def apply(bottom: Double, height: Double, left: Double, right: Double, top: Double, width: Double): LayoutInfo = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutInfo]
  }
  
  @scala.inline
  implicit class LayoutInfoMutableBuilder[Self <: LayoutInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirection(value: ltr | rtl): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
