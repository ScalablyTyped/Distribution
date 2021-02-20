package typings.semanticUiPopup.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-popup.SemanticUI.PopupSettings._Impl, 'lastResort'> */
@js.native
trait PickImpllastResort extends StObject {
  
  var lastResort: Boolean | String = js.native
}
object PickImpllastResort {
  
  @scala.inline
  def apply(lastResort: Boolean | String): PickImpllastResort = {
    val __obj = js.Dynamic.literal(lastResort = lastResort.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpllastResort]
  }
  
  @scala.inline
  implicit class PickImpllastResortMutableBuilder[Self <: PickImpllastResort] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLastResort(value: Boolean | String): Self = StObject.set(x, "lastResort", value.asInstanceOf[js.Any])
  }
}
