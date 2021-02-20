package typings.semanticUiForm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-form.SemanticUI.FormSettings._Impl, 'namespace'> */
@js.native
trait PickImplnamespace extends StObject {
  
  var namespace: String = js.native
}
object PickImplnamespace {
  
  @scala.inline
  def apply(namespace: String): PickImplnamespace = {
    val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplnamespace]
  }
  
  @scala.inline
  implicit class PickImplnamespaceMutableBuilder[Self <: PickImplnamespace] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
  }
}
