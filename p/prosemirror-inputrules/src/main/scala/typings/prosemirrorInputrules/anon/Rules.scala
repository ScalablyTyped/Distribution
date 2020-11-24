package typings.prosemirrorInputrules.anon

import typings.prosemirrorInputrules.mod.InputRule
import typings.prosemirrorModel.mod.Schema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Rules[S /* <: Schema[_, _] */] extends js.Object {
  
  var rules: js.Array[InputRule[S]] = js.native
}
object Rules {
  
  @scala.inline
  def apply[S /* <: Schema[_, _] */](rules: js.Array[InputRule[S]]): Rules[S] = {
    val __obj = js.Dynamic.literal(rules = rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rules[S]]
  }
  
  @scala.inline
  implicit class RulesOps[Self <: Rules[_], S /* <: Schema[_, _] */] (val x: Self with Rules[S]) extends AnyVal {
    
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
    def setRulesVarargs(value: InputRule[S]*): Self = this.set("rules", js.Array(value :_*))
    
    @scala.inline
    def setRules(value: js.Array[InputRule[S]]): Self = this.set("rules", value.asInstanceOf[js.Any])
  }
}
