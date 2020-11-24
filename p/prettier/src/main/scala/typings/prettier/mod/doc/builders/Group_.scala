package typings.prettier.mod.doc.builders

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Group_ extends _Doc {
  
  var break: Boolean = js.native
  
  var contents: Doc = js.native
  
  var expandedStates: js.Array[Doc] = js.native
  
  var `type`: typings.prettier.prettierStrings.group = js.native
}
object Group_ {
  
  @scala.inline
  def apply(
    break: Boolean,
    contents: Doc,
    expandedStates: js.Array[Doc],
    `type`: typings.prettier.prettierStrings.group
  ): Group_ = {
    val __obj = js.Dynamic.literal(break = break.asInstanceOf[js.Any], contents = contents.asInstanceOf[js.Any], expandedStates = expandedStates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Group_]
  }
  
  @scala.inline
  implicit class Group_Ops[Self <: Group_] (val x: Self) extends AnyVal {
    
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
    def setBreak(value: Boolean): Self = this.set("break", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContents(value: Doc): Self = this.set("contents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandedStatesVarargs(value: Doc*): Self = this.set("expandedStates", js.Array(value :_*))
    
    @scala.inline
    def setExpandedStates(value: js.Array[Doc]): Self = this.set("expandedStates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.prettier.prettierStrings.group): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
