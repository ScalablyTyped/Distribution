package typings.semanticUiRating.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-rating.SemanticUI.RatingSettings._Impl, 'fireOnInit'> */
trait PickImplfireOnInit extends StObject {
  
  var fireOnInit: Boolean
}
object PickImplfireOnInit {
  
  @scala.inline
  def apply(fireOnInit: Boolean): PickImplfireOnInit = {
    val __obj = js.Dynamic.literal(fireOnInit = fireOnInit.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplfireOnInit]
  }
  
  @scala.inline
  implicit class PickImplfireOnInitMutableBuilder[Self <: PickImplfireOnInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFireOnInit(value: Boolean): Self = StObject.set(x, "fireOnInit", value.asInstanceOf[js.Any])
  }
}
