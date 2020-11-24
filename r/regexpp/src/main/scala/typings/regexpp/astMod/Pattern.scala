package typings.regexpp.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pattern
  extends BranchNode
     with NodeBase {
  
  var alternatives: js.Array[Alternative] = js.native
  
  @JSName("parent")
  var parent_Pattern: RegExpLiteral | Null = js.native
  
  @JSName("type")
  var type_Pattern: typings.regexpp.regexppStrings.Pattern = js.native
}
object Pattern {
  
  @scala.inline
  def apply(
    alternatives: js.Array[Alternative],
    end: Double,
    raw: String,
    start: Double,
    `type`: typings.regexpp.regexppStrings.Pattern
  ): Pattern = {
    val __obj = js.Dynamic.literal(alternatives = alternatives.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pattern]
  }
  
  @scala.inline
  implicit class PatternOps[Self <: Pattern] (val x: Self) extends AnyVal {
    
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
    def setAlternativesVarargs(value: Alternative*): Self = this.set("alternatives", js.Array(value :_*))
    
    @scala.inline
    def setAlternatives(value: js.Array[Alternative]): Self = this.set("alternatives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.regexpp.regexppStrings.Pattern): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: RegExpLiteral): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentNull: Self = this.set("parent", null)
  }
}
