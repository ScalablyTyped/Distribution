package typings.semanticUiDimmer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dimmer.SemanticUI.Dimmer.SelectorSettings._Impl, 'dimmer'> */
@js.native
trait PickImpldimmer extends StObject {
  
  var dimmer: String = js.native
}
object PickImpldimmer {
  
  @scala.inline
  def apply(dimmer: String): PickImpldimmer = {
    val __obj = js.Dynamic.literal(dimmer = dimmer.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpldimmer]
  }
  
  @scala.inline
  implicit class PickImpldimmerMutableBuilder[Self <: PickImpldimmer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDimmer(value: String): Self = StObject.set(x, "dimmer", value.asInstanceOf[js.Any])
  }
}
