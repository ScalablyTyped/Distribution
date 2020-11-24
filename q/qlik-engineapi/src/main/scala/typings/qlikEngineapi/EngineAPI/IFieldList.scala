package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * FieldListObject...
  */
@js.native
trait IFieldList extends js.Object {
  
  /**
    * NxFieldDescription[]
    */
  var qItems: js.Array[INxFieldDescription] = js.native
}
object IFieldList {
  
  @scala.inline
  def apply(qItems: js.Array[INxFieldDescription]): IFieldList = {
    val __obj = js.Dynamic.literal(qItems = qItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFieldList]
  }
  
  @scala.inline
  implicit class IFieldListOps[Self <: IFieldList] (val x: Self) extends AnyVal {
    
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
    def setQItemsVarargs(value: INxFieldDescription*): Self = this.set("qItems", js.Array(value :_*))
    
    @scala.inline
    def setQItems(value: js.Array[INxFieldDescription]): Self = this.set("qItems", value.asInstanceOf[js.Any])
  }
}
