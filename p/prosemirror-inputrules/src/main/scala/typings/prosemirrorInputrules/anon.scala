package typings.prosemirrorInputrules

import typings.prosemirrorInputrules.mod.InputRule
import typings.prosemirrorModel.mod.Schema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Rules[S /* <: Schema[_, _] */] extends StObject {
    
    var rules: js.Array[InputRule[S]] = js.native
  }
  object Rules {
    
    @scala.inline
    def apply[S /* <: Schema[_, _] */](rules: js.Array[InputRule[S]]): Rules[S] = {
      val __obj = js.Dynamic.literal(rules = rules.asInstanceOf[js.Any])
      __obj.asInstanceOf[Rules[S]]
    }
    
    @scala.inline
    implicit class RulesMutableBuilder[Self <: Rules[_], S /* <: Schema[_, _] */] (val x: Self with Rules[S]) extends AnyVal {
      
      @scala.inline
      def setRules(value: js.Array[InputRule[S]]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRulesVarargs(value: InputRule[S]*): Self = StObject.set(x, "rules", js.Array(value :_*))
    }
  }
}
