package typings.sparqljs.mod

import typings.sparqljs.sparqljsStrings.group
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupPattern
  extends BlockPattern
     with _Expression {
  
  var patterns: js.Array[Pattern] = js.native
  
  var `type`: group = js.native
}
object GroupPattern {
  
  @scala.inline
  def apply(patterns: js.Array[Pattern], `type`: group): GroupPattern = {
    val __obj = js.Dynamic.literal(patterns = patterns.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupPattern]
  }
  
  @scala.inline
  implicit class GroupPatternOps[Self <: GroupPattern] (val x: Self) extends AnyVal {
    
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
    def setPatternsVarargs(value: Pattern*): Self = this.set("patterns", js.Array(value :_*))
    
    @scala.inline
    def setPatterns(value: js.Array[Pattern]): Self = this.set("patterns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: group): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
