package typings.semanticUiNag.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-nag.SemanticUI.NagSettings._Impl, 'persist'> */
@js.native
trait PickImplpersist extends StObject {
  
  var persist: Boolean = js.native
}
object PickImplpersist {
  
  @scala.inline
  def apply(persist: Boolean): PickImplpersist = {
    val __obj = js.Dynamic.literal(persist = persist.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplpersist]
  }
  
  @scala.inline
  implicit class PickImplpersistMutableBuilder[Self <: PickImplpersist] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPersist(value: Boolean): Self = StObject.set(x, "persist", value.asInstanceOf[js.Any])
  }
}
