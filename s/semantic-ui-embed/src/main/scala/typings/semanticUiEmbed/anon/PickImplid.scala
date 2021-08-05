package typings.semanticUiEmbed.anon

import typings.semanticUiEmbed.semanticUiEmbedBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-embed.SemanticUI.EmbedSettings._Impl, 'id'> */
trait PickImplid extends StObject {
  
  var id: `false` | String
}
object PickImplid {
  
  inline def apply(id: `false` | String): PickImplid = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplid]
  }
  
  extension [Self <: PickImplid](x: Self) {
    
    inline def setId(value: `false` | String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
