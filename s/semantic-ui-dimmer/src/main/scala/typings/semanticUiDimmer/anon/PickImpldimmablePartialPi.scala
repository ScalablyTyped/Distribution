package typings.semanticUiDimmer.anon

import typings.semanticUiDimmer.SemanticUI.Dimmer.SelectorSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dimmer.SemanticUI.Dimmer.SelectorSettings._Impl, 'dimmable'> & std.Partial<std.Pick<semantic-ui-dimmer.SemanticUI.Dimmer.SelectorSettings._Impl, keyof semantic-ui-dimmer.SemanticUI.Dimmer.SelectorSettings._Impl>> */
trait PickImpldimmablePartialPi
  extends StObject
     with Param {
  
  var content: js.UndefOr[String] = js.undefined
  
  var dimmable: String
  
  var dimmer: js.UndefOr[String] = js.undefined
}
object PickImpldimmablePartialPi {
  
  inline def apply(dimmable: String): PickImpldimmablePartialPi = {
    val __obj = js.Dynamic.literal(dimmable = dimmable.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpldimmablePartialPi]
  }
  
  extension [Self <: PickImpldimmablePartialPi](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setDimmable(value: String): Self = StObject.set(x, "dimmable", value.asInstanceOf[js.Any])
    
    inline def setDimmer(value: String): Self = StObject.set(x, "dimmer", value.asInstanceOf[js.Any])
    
    inline def setDimmerUndefined: Self = StObject.set(x, "dimmer", js.undefined)
  }
}
