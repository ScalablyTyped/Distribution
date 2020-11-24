package typings.reactMovable.typesMod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BeforeDragParams extends js.Object {
  
  var elements: js.Array[Element] = js.native
  
  var index: Double = js.native
}
object BeforeDragParams {
  
  @scala.inline
  def apply(elements: js.Array[Element], index: Double): BeforeDragParams = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeforeDragParams]
  }
  
  @scala.inline
  implicit class BeforeDragParamsOps[Self <: BeforeDragParams] (val x: Self) extends AnyVal {
    
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
    def setElementsVarargs(value: Element*): Self = this.set("elements", js.Array(value :_*))
    
    @scala.inline
    def setElements(value: js.Array[Element]): Self = this.set("elements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
  }
}
