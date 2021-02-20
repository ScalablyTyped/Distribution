package typings.semanticUiNag.anon

import typings.semanticUiNag.SemanticUI.Nag.ClassNameSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-nag.SemanticUI.NagSettings._Impl, 'className'> */
@js.native
trait PickImplclassName extends StObject {
  
  var className: ClassNameSettings = js.native
}
object PickImplclassName {
  
  @scala.inline
  def apply(className: ClassNameSettings): PickImplclassName = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplclassName]
  }
  
  @scala.inline
  implicit class PickImplclassNameMutableBuilder[Self <: PickImplclassName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: ClassNameSettings): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
  }
}
