package typings.semanticUiShape.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-shape.SemanticUI.Shape.ErrorSettings._Impl, 'side'> */
trait PickImplside extends StObject {
  
  var side: String
}
object PickImplside {
  
  @scala.inline
  def apply(side: String): PickImplside = {
    val __obj = js.Dynamic.literal(side = side.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplside]
  }
  
  @scala.inline
  implicit class PickImplsideMutableBuilder[Self <: PickImplside] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSide(value: String): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
  }
}
