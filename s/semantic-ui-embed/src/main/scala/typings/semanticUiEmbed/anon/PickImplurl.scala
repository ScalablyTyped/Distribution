package typings.semanticUiEmbed.anon

import typings.semanticUiEmbed.semanticUiEmbedBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-embed.SemanticUI.EmbedSettings._Impl, 'url'> */
trait PickImplurl extends StObject {
  
  var url: `false` | String
}
object PickImplurl {
  
  inline def apply(url: `false` | String): PickImplurl = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplurl]
  }
  
  extension [Self <: PickImplurl](x: Self) {
    
    inline def setUrl(value: `false` | String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
