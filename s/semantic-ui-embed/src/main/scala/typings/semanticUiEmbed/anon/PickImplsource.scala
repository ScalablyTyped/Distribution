package typings.semanticUiEmbed.anon

import typings.semanticUiEmbed.semanticUiEmbedBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-embed.SemanticUI.EmbedSettings._Impl, 'source'> */
@js.native
trait PickImplsource extends StObject {
  
  var source: `false` | String = js.native
}
object PickImplsource {
  
  @scala.inline
  def apply(source: `false` | String): PickImplsource = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplsource]
  }
  
  @scala.inline
  implicit class PickImplsourceMutableBuilder[Self <: PickImplsource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: `false` | String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
