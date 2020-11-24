package typings.reactInstantsearchCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Items extends js.Object {
  
  var currentRefinement: js.Array[String] = js.native
  
  var items: js.Array[Label] = js.native
}
object Items {
  
  @scala.inline
  def apply(currentRefinement: js.Array[String], items: js.Array[Label]): Items = {
    val __obj = js.Dynamic.literal(currentRefinement = currentRefinement.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[Items]
  }
  
  @scala.inline
  implicit class ItemsOps[Self <: Items] (val x: Self) extends AnyVal {
    
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
    def setCurrentRefinementVarargs(value: String*): Self = this.set("currentRefinement", js.Array(value :_*))
    
    @scala.inline
    def setCurrentRefinement(value: js.Array[String]): Self = this.set("currentRefinement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: Label*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[Label]): Self = this.set("items", value.asInstanceOf[js.Any])
  }
}
