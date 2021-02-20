package typings.semanticUiPopup.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-popup.SemanticUI.Popup.MetadataSettings._Impl, 'variation'> */
@js.native
trait PickImplvariation extends StObject {
  
  var variation: String = js.native
}
object PickImplvariation {
  
  @scala.inline
  def apply(variation: String): PickImplvariation = {
    val __obj = js.Dynamic.literal(variation = variation.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplvariation]
  }
  
  @scala.inline
  implicit class PickImplvariationMutableBuilder[Self <: PickImplvariation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVariation(value: String): Self = StObject.set(x, "variation", value.asInstanceOf[js.Any])
  }
}
