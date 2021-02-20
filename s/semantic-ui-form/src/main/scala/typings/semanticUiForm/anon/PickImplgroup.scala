package typings.semanticUiForm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-form.SemanticUI.Form.SelectorSettings._Impl, 'group'> */
@js.native
trait PickImplgroup extends StObject {
  
  var group: String = js.native
}
object PickImplgroup {
  
  @scala.inline
  def apply(group: String): PickImplgroup = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplgroup]
  }
  
  @scala.inline
  implicit class PickImplgroupMutableBuilder[Self <: PickImplgroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
  }
}
