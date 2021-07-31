package typings.reactBeautifulDnd.mod

import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DraggableProps extends StObject {
  
  var children: DraggableChildrenFn
  
  var disableInteractiveElementBlocking: js.UndefOr[Boolean] = js.undefined
  
  var draggableId: DraggableId
  
  var index: Double
  
  var isDragDisabled: js.UndefOr[Boolean] = js.undefined
  
  var shouldRespectForcePress: js.UndefOr[Boolean] = js.undefined
}
object DraggableProps {
  
  @scala.inline
  def apply(
    children: (/* provided */ DraggableProvided, /* snapshot */ DraggableStateSnapshot, /* rubric */ DraggableRubric) => ReactElement,
    draggableId: DraggableId,
    index: Double
  ): DraggableProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction3(children), draggableId = draggableId.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[DraggableProps]
  }
  
  @scala.inline
  implicit class DraggablePropsMutableBuilder[Self <: DraggableProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(
      value: (/* provided */ DraggableProvided, /* snapshot */ DraggableStateSnapshot, /* rubric */ DraggableRubric) => ReactElement
    ): Self = StObject.set(x, "children", js.Any.fromFunction3(value))
    
    @scala.inline
    def setDisableInteractiveElementBlocking(value: Boolean): Self = StObject.set(x, "disableInteractiveElementBlocking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableInteractiveElementBlockingUndefined: Self = StObject.set(x, "disableInteractiveElementBlocking", js.undefined)
    
    @scala.inline
    def setDraggableId(value: DraggableId): Self = StObject.set(x, "draggableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDragDisabled(value: Boolean): Self = StObject.set(x, "isDragDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDragDisabledUndefined: Self = StObject.set(x, "isDragDisabled", js.undefined)
    
    @scala.inline
    def setShouldRespectForcePress(value: Boolean): Self = StObject.set(x, "shouldRespectForcePress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShouldRespectForcePressUndefined: Self = StObject.set(x, "shouldRespectForcePress", js.undefined)
  }
}
