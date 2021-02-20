package typings.semanticUiForm.anon

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-form.SemanticUI.FormSettings._Impl, 'rules'> */
@js.native
trait PickImplrules extends StObject {
  
  var rules: StringDictionary[js.ThisFunction1[/* this */ HTMLElement, /* repeated */ js.Any, Boolean]] = js.native
}
object PickImplrules {
  
  @scala.inline
  def apply(rules: StringDictionary[js.ThisFunction1[/* this */ HTMLElement, /* repeated */ js.Any, Boolean]]): PickImplrules = {
    val __obj = js.Dynamic.literal(rules = rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplrules]
  }
  
  @scala.inline
  implicit class PickImplrulesMutableBuilder[Self <: PickImplrules] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRules(value: StringDictionary[js.ThisFunction1[/* this */ HTMLElement, /* repeated */ js.Any, Boolean]]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
  }
}
