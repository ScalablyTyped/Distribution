package typings.semanticUiEmbed.anon

import typings.semanticUiEmbed.SemanticUI.Embed.ParametersSettings
import typings.semanticUiEmbed.semanticUiEmbedBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-embed.SemanticUI.EmbedSettings._Impl, 'parameters'> */
trait PickImplparameters extends StObject {
  
  var parameters: `false` | ParametersSettings
}
object PickImplparameters {
  
  inline def apply(parameters: `false` | ParametersSettings): PickImplparameters = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplparameters]
  }
  
  extension [Self <: PickImplparameters](x: Self) {
    
    inline def setParameters(value: `false` | ParametersSettings): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
