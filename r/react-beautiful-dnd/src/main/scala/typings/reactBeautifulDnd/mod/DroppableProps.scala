package typings.reactBeautifulDnd.mod

import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DroppableProps extends StObject {
  
  def children(provided: DroppableProvided, snapshot: DroppableStateSnapshot): ReactElement
  
  var direction: js.UndefOr[Direction] = js.undefined
  
  var droppableId: DroppableId
  
  var getContainerForClone: js.UndefOr[js.Function0[ReactElement]] = js.undefined
  
  var ignoreContainerClipping: js.UndefOr[Boolean] = js.undefined
  
  var isCombineEnabled: js.UndefOr[Boolean] = js.undefined
  
  var isDropDisabled: js.UndefOr[Boolean] = js.undefined
  
  var mode: js.UndefOr[DroppableMode] = js.undefined
  
  var renderClone: js.UndefOr[DraggableChildrenFn] = js.undefined
  
  var `type`: js.UndefOr[TypeId] = js.undefined
}
object DroppableProps {
  
  @scala.inline
  def apply(children: (DroppableProvided, DroppableStateSnapshot) => ReactElement, droppableId: DroppableId): DroppableProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction2(children), droppableId = droppableId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DroppableProps]
  }
  
  @scala.inline
  implicit class DroppablePropsMutableBuilder[Self <: DroppableProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: (DroppableProvided, DroppableStateSnapshot) => ReactElement): Self = StObject.set(x, "children", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDirection(value: Direction): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setDroppableId(value: DroppableId): Self = StObject.set(x, "droppableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetContainerForClone(value: () => ReactElement): Self = StObject.set(x, "getContainerForClone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetContainerForCloneUndefined: Self = StObject.set(x, "getContainerForClone", js.undefined)
    
    @scala.inline
    def setIgnoreContainerClipping(value: Boolean): Self = StObject.set(x, "ignoreContainerClipping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreContainerClippingUndefined: Self = StObject.set(x, "ignoreContainerClipping", js.undefined)
    
    @scala.inline
    def setIsCombineEnabled(value: Boolean): Self = StObject.set(x, "isCombineEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCombineEnabledUndefined: Self = StObject.set(x, "isCombineEnabled", js.undefined)
    
    @scala.inline
    def setIsDropDisabled(value: Boolean): Self = StObject.set(x, "isDropDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDropDisabledUndefined: Self = StObject.set(x, "isDropDisabled", js.undefined)
    
    @scala.inline
    def setMode(value: DroppableMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setRenderClone(
      value: (/* provided */ DraggableProvided, /* snapshot */ DraggableStateSnapshot, /* rubric */ DraggableRubric) => ReactElement
    ): Self = StObject.set(x, "renderClone", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRenderCloneUndefined: Self = StObject.set(x, "renderClone", js.undefined)
    
    @scala.inline
    def setType(value: TypeId): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
