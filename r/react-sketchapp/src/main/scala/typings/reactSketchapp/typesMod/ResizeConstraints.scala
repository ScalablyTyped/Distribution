package typings.reactSketchapp.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResizeConstraints extends StObject {
  
  var bottom: Boolean = js.native
  
  var fixedHeight: Boolean = js.native
  
  var fixedWidth: Boolean = js.native
  
  var left: Boolean = js.native
  
  var right: Boolean = js.native
  
  var top: Boolean = js.native
}
object ResizeConstraints {
  
  @scala.inline
  def apply(
    bottom: Boolean,
    fixedHeight: Boolean,
    fixedWidth: Boolean,
    left: Boolean,
    right: Boolean,
    top: Boolean
  ): ResizeConstraints = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], fixedHeight = fixedHeight.asInstanceOf[js.Any], fixedWidth = fixedWidth.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResizeConstraints]
  }
  
  @scala.inline
  implicit class ResizeConstraintsMutableBuilder[Self <: ResizeConstraints] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBottom(value: Boolean): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedHeight(value: Boolean): Self = StObject.set(x, "fixedHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedWidth(value: Boolean): Self = StObject.set(x, "fixedWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft(value: Boolean): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRight(value: Boolean): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop(value: Boolean): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
  }
}
