package typings.reactDocgenTypescript.parserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentDoc extends js.Object {
  
  var description: String = js.native
  
  var displayName: String = js.native
  
  var methods: js.Array[Method] = js.native
  
  var props: Props = js.native
}
object ComponentDoc {
  
  @scala.inline
  def apply(description: String, displayName: String, methods: js.Array[Method], props: Props): ComponentDoc = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], methods = methods.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentDoc]
  }
  
  @scala.inline
  implicit class ComponentDocOps[Self <: ComponentDoc] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodsVarargs(value: Method*): Self = this.set("methods", js.Array(value :_*))
    
    @scala.inline
    def setMethods(value: js.Array[Method]): Self = this.set("methods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProps(value: Props): Self = this.set("props", value.asInstanceOf[js.Any])
  }
}
