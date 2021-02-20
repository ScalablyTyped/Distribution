package typings.semanticUiNag.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-nag.SemanticUI.NagSettings._Impl, 'expires'> */
@js.native
trait PickImplexpires extends StObject {
  
  var expires: Double = js.native
}
object PickImplexpires {
  
  @scala.inline
  def apply(expires: Double): PickImplexpires = {
    val __obj = js.Dynamic.literal(expires = expires.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplexpires]
  }
  
  @scala.inline
  implicit class PickImplexpiresMutableBuilder[Self <: PickImplexpires] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpires(value: Double): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
  }
}
