package typings.reactMarkdown.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisallowedTypesProp extends js.Object {
  
  val disallowedTypes: js.Array[NodeType] = js.native
}
object DisallowedTypesProp {
  
  @scala.inline
  def apply(disallowedTypes: js.Array[NodeType]): DisallowedTypesProp = {
    val __obj = js.Dynamic.literal(disallowedTypes = disallowedTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisallowedTypesProp]
  }
  
  @scala.inline
  implicit class DisallowedTypesPropOps[Self <: DisallowedTypesProp] (val x: Self) extends AnyVal {
    
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
    def setDisallowedTypesVarargs(value: NodeType*): Self = this.set("disallowedTypes", js.Array(value :_*))
    
    @scala.inline
    def setDisallowedTypes(value: js.Array[NodeType]): Self = this.set("disallowedTypes", value.asInstanceOf[js.Any])
  }
}
