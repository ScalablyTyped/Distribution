package typings.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DraggableDimension extends js.Object {
  
  // relative to the viewport when the drag started
  var client: BoxModel = js.native
  
  var descriptor: DraggableDescriptor = js.native
  
  // how much displacement the draggable causes
  // this is the size of the marginBox
  var displaceBy: Position = js.native
  
  // relative to the whole page
  var page: BoxModel = js.native
  
  // the placeholder for the draggable
  var placeholder: Placeholder = js.native
}
object DraggableDimension {
  
  @scala.inline
  def apply(
    client: BoxModel,
    descriptor: DraggableDescriptor,
    displaceBy: Position,
    page: BoxModel,
    placeholder: Placeholder
  ): DraggableDimension = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], descriptor = descriptor.asInstanceOf[js.Any], displaceBy = displaceBy.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any])
    __obj.asInstanceOf[DraggableDimension]
  }
  
  @scala.inline
  implicit class DraggableDimensionOps[Self <: DraggableDimension] (val x: Self) extends AnyVal {
    
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
    def setClient(value: BoxModel): Self = this.set("client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptor(value: DraggableDescriptor): Self = this.set("descriptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplaceBy(value: Position): Self = this.set("displaceBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPage(value: BoxModel): Self = this.set("page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholder(value: Placeholder): Self = this.set("placeholder", value.asInstanceOf[js.Any])
  }
}
