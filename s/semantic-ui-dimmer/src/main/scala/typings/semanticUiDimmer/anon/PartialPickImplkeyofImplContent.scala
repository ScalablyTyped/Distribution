package typings.semanticUiDimmer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<semantic-ui-dimmer.SemanticUI.Dimmer.SelectorSettings._Impl, keyof semantic-ui-dimmer.SemanticUI.Dimmer.SelectorSettings._Impl>> */
trait PartialPickImplkeyofImplContent extends StObject {
  
  var content: js.UndefOr[String] = js.undefined
  
  var dimmable: js.UndefOr[String] = js.undefined
  
  var dimmer: js.UndefOr[String] = js.undefined
}
object PartialPickImplkeyofImplContent {
  
  inline def apply(): PartialPickImplkeyofImplContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplContent]
  }
  
  extension [Self <: PartialPickImplkeyofImplContent](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setDimmable(value: String): Self = StObject.set(x, "dimmable", value.asInstanceOf[js.Any])
    
    inline def setDimmableUndefined: Self = StObject.set(x, "dimmable", js.undefined)
    
    inline def setDimmer(value: String): Self = StObject.set(x, "dimmer", value.asInstanceOf[js.Any])
    
    inline def setDimmerUndefined: Self = StObject.set(x, "dimmer", js.undefined)
  }
}
