package typings.reactCalendarTimeline.mod

import typings.reactCalendarTimeline.anon.ClassName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemRendererGetResizePropsReturnType extends StObject {
  
  var left: js.UndefOr[ClassName] = js.undefined
  
  var right: js.UndefOr[ClassName] = js.undefined
}
object ItemRendererGetResizePropsReturnType {
  
  inline def apply(): ItemRendererGetResizePropsReturnType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemRendererGetResizePropsReturnType]
  }
  
  extension [Self <: ItemRendererGetResizePropsReturnType](x: Self) {
    
    inline def setLeft(value: ClassName): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setRight(value: ClassName): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
  }
}
