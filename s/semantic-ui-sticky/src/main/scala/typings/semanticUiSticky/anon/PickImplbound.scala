package typings.semanticUiSticky.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-sticky.SemanticUI.Sticky.ClassNameSettings._Impl, 'bound'> */
@js.native
trait PickImplbound extends StObject {
  
  var bound: String = js.native
}
object PickImplbound {
  
  @scala.inline
  def apply(bound: String): PickImplbound = {
    val __obj = js.Dynamic.literal(bound = bound.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplbound]
  }
  
  @scala.inline
  implicit class PickImplboundMutableBuilder[Self <: PickImplbound] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBound(value: String): Self = StObject.set(x, "bound", value.asInstanceOf[js.Any])
  }
}
