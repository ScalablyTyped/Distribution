package typings.semanticUiShape.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-shape.SemanticUI.Shape.ClassNameSettings._Impl, 'animating'> */
@js.native
trait PickImplanimating extends StObject {
  
  var animating: String = js.native
}
object PickImplanimating {
  
  @scala.inline
  def apply(animating: String): PickImplanimating = {
    val __obj = js.Dynamic.literal(animating = animating.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplanimating]
  }
  
  @scala.inline
  implicit class PickImplanimatingMutableBuilder[Self <: PickImplanimating] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimating(value: String): Self = StObject.set(x, "animating", value.asInstanceOf[js.Any])
  }
}
