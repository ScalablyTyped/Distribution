package typings.reactDocgenTypescript.parserMod

import typings.reactDocgenTypescript.anon.Description
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Method extends js.Object {
  
  var description: String = js.native
  
  var docblock: String = js.native
  
  var modifiers: js.Array[String] = js.native
  
  var name: String = js.native
  
  var params: js.Array[MethodParameter] = js.native
  
  var returns: js.UndefOr[Description | Null] = js.native
}
object Method {
  
  @scala.inline
  def apply(
    description: String,
    docblock: String,
    modifiers: js.Array[String],
    name: String,
    params: js.Array[MethodParameter]
  ): Method = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], docblock = docblock.asInstanceOf[js.Any], modifiers = modifiers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[Method]
  }
  
  @scala.inline
  implicit class MethodOps[Self <: Method] (val x: Self) extends AnyVal {
    
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
    def setDocblock(value: String): Self = this.set("docblock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiersVarargs(value: String*): Self = this.set("modifiers", js.Array(value :_*))
    
    @scala.inline
    def setModifiers(value: js.Array[String]): Self = this.set("modifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsVarargs(value: MethodParameter*): Self = this.set("params", js.Array(value :_*))
    
    @scala.inline
    def setParams(value: js.Array[MethodParameter]): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturns(value: Description): Self = this.set("returns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturns: Self = this.set("returns", js.undefined)
    
    @scala.inline
    def setReturnsNull: Self = this.set("returns", null)
  }
}
