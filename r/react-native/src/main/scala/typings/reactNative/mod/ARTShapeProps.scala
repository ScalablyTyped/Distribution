package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ARTShapeProps
  extends StObject
     with ARTRenderableMixin {
  
  var d: String
  
  var height: js.UndefOr[Double] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object ARTShapeProps {
  
  @scala.inline
  def apply(d: String): ARTShapeProps = {
    val __obj = js.Dynamic.literal(d = d.asInstanceOf[js.Any])
    __obj.asInstanceOf[ARTShapeProps]
  }
  
  @scala.inline
  implicit class ARTShapePropsMutableBuilder[Self <: ARTShapeProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setD(value: String): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
