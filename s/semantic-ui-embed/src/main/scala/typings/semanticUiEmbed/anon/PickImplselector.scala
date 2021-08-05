package typings.semanticUiEmbed.anon

import typings.semanticUiEmbed.SemanticUI.Embed.SelectorSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-embed.SemanticUI.EmbedSettings._Impl, 'selector'> */
trait PickImplselector extends StObject {
  
  var selector: SelectorSettings
}
object PickImplselector {
  
  inline def apply(selector: SelectorSettings): PickImplselector = {
    val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplselector]
  }
  
  extension [Self <: PickImplselector](x: Self) {
    
    inline def setSelector(value: SelectorSettings): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
  }
}
