package typings.reactCalendarTimeline.mod

import typings.reactCalendarTimeline.anon.ClassName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemRendererGetResizePropsReturnType extends StObject {
  
  var left: js.UndefOr[ClassName] = js.native
  
  var right: js.UndefOr[ClassName] = js.native
}
object ItemRendererGetResizePropsReturnType {
  
  @scala.inline
  def apply(): ItemRendererGetResizePropsReturnType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemRendererGetResizePropsReturnType]
  }
  
  @scala.inline
  implicit class ItemRendererGetResizePropsReturnTypeMutableBuilder[Self <: ItemRendererGetResizePropsReturnType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLeft(value: ClassName): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    @scala.inline
    def setRight(value: ClassName): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
  }
}
