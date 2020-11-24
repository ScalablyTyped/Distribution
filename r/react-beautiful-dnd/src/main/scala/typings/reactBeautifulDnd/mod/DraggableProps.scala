package typings.reactBeautifulDnd.mod

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DraggableProps extends js.Object {
  
  var children: DraggableChildrenFn = js.native
  
  var disableInteractiveElementBlocking: js.UndefOr[Boolean] = js.native
  
  var draggableId: DraggableId = js.native
  
  var index: Double = js.native
  
  var isDragDisabled: js.UndefOr[Boolean] = js.native
  
  var shouldRespectForcePress: js.UndefOr[Boolean] = js.native
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
  implicit class DraggablePropsOps[Self <: DraggableProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChildren(
      value: (/* provided */ DraggableProvided, /* snapshot */ DraggableStateSnapshot, /* rubric */ DraggableRubric) => ReactElement
    ): Self = this.set("children", js.Any.fromFunction3(value))
    
    @scala.inline
    def setDraggableId(value: DraggableId): Self = this.set("draggableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableInteractiveElementBlocking(value: Boolean): Self = this.set("disableInteractiveElementBlocking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableInteractiveElementBlocking: Self = this.set("disableInteractiveElementBlocking", js.undefined)
    
    @scala.inline
    def setIsDragDisabled(value: Boolean): Self = this.set("isDragDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsDragDisabled: Self = this.set("isDragDisabled", js.undefined)
    
    @scala.inline
    def setShouldRespectForcePress(value: Boolean): Self = this.set("shouldRespectForcePress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShouldRespectForcePress: Self = this.set("shouldRespectForcePress", js.undefined)
  }
}
