package typings.reactMarkdown.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllowedTypesProp extends js.Object {
  
  val allowedTypes: js.UndefOr[js.Array[NodeType]] = js.native
}
object AllowedTypesProp {
  
  @scala.inline
  def apply(): AllowedTypesProp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowedTypesProp]
  }
  
  @scala.inline
  implicit class AllowedTypesPropOps[Self <: AllowedTypesProp] (val x: Self) extends AnyVal {
    
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
    def setAllowedTypesVarargs(value: NodeType*): Self = this.set("allowedTypes", js.Array(value :_*))
    
    @scala.inline
    def setAllowedTypes(value: js.Array[NodeType]): Self = this.set("allowedTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedTypes: Self = this.set("allowedTypes", js.undefined)
  }
}
