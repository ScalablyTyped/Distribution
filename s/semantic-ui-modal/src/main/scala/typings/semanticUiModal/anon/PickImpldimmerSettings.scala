package typings.semanticUiModal.anon

import typings.semanticUiDimmer.SemanticUI.DimmerSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-modal.SemanticUI.ModalSettings._Impl, 'dimmerSettings'> */
trait PickImpldimmerSettings extends StObject {
  
  var dimmerSettings: DimmerSettings
}
object PickImpldimmerSettings {
  
  inline def apply(dimmerSettings: DimmerSettings): PickImpldimmerSettings = {
    val __obj = js.Dynamic.literal(dimmerSettings = dimmerSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpldimmerSettings]
  }
  
  extension [Self <: PickImpldimmerSettings](x: Self) {
    
    inline def setDimmerSettings(value: DimmerSettings): Self = StObject.set(x, "dimmerSettings", value.asInstanceOf[js.Any])
  }
}
