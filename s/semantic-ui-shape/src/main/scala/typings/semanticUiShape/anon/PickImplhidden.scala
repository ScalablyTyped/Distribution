package typings.semanticUiShape.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-shape.SemanticUI.Shape.ClassNameSettings._Impl, 'hidden'> */
@js.native
trait PickImplhidden extends StObject {
  
  var hidden: String = js.native
}
object PickImplhidden {
  
  @scala.inline
  def apply(hidden: String): PickImplhidden = {
    val __obj = js.Dynamic.literal(hidden = hidden.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplhidden]
  }
  
  @scala.inline
  implicit class PickImplhiddenMutableBuilder[Self <: PickImplhidden] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHidden(value: String): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
  }
}
