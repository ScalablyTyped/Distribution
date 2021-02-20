package typings.semanticUiShape.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-shape.SemanticUI.Shape.SelectorSettings._Impl, 'sides'> */
@js.native
trait PickImplsides extends StObject {
  
  var sides: String = js.native
}
object PickImplsides {
  
  @scala.inline
  def apply(sides: String): PickImplsides = {
    val __obj = js.Dynamic.literal(sides = sides.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplsides]
  }
  
  @scala.inline
  implicit class PickImplsidesMutableBuilder[Self <: PickImplsides] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSides(value: String): Self = StObject.set(x, "sides", value.asInstanceOf[js.Any])
  }
}
