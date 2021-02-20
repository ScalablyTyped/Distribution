package typings.semanticUiDimmer.anon

import typings.semanticUiDimmer.semanticUiDimmerBooleans.`false`
import typings.semanticUiDimmer.semanticUiDimmerStrings.click
import typings.semanticUiDimmer.semanticUiDimmerStrings.hover
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dimmer.SemanticUI.DimmerSettings._Impl, 'on'> */
@js.native
trait PickImplon extends StObject {
  
  var on: `false` | hover | click = js.native
}
object PickImplon {
  
  @scala.inline
  def apply(on: `false` | hover | click): PickImplon = {
    val __obj = js.Dynamic.literal(on = on.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplon]
  }
  
  @scala.inline
  implicit class PickImplonMutableBuilder[Self <: PickImplon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOn(value: `false` | hover | click): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
  }
}
