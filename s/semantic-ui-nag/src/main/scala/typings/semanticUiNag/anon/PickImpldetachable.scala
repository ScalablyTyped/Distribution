package typings.semanticUiNag.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-nag.SemanticUI.NagSettings._Impl, 'detachable'> */
trait PickImpldetachable extends StObject {
  
  var detachable: Boolean
}
object PickImpldetachable {
  
  @scala.inline
  def apply(detachable: Boolean): PickImpldetachable = {
    val __obj = js.Dynamic.literal(detachable = detachable.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpldetachable]
  }
  
  @scala.inline
  implicit class PickImpldetachableMutableBuilder[Self <: PickImpldetachable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetachable(value: Boolean): Self = StObject.set(x, "detachable", value.asInstanceOf[js.Any])
  }
}
