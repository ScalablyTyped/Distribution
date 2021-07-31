package typings.semanticUiNag.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-nag.SemanticUI.NagSettings._Impl, 'key'> */
trait PickImplkey extends StObject {
  
  var key: js.Any
}
object PickImplkey {
  
  @scala.inline
  def apply(key: js.Any): PickImplkey = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplkey]
  }
  
  @scala.inline
  implicit class PickImplkeyMutableBuilder[Self <: PickImplkey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: js.Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
