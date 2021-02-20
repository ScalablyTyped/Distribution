package typings.semanticUiEmbed.anon

import typings.semanticUiEmbed.semanticUiEmbedBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-embed.SemanticUI.EmbedSettings._Impl, 'icon'> */
@js.native
trait PickImplicon extends StObject {
  
  var icon: `false` | String = js.native
}
object PickImplicon {
  
  @scala.inline
  def apply(icon: `false` | String): PickImplicon = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplicon]
  }
  
  @scala.inline
  implicit class PickImpliconMutableBuilder[Self <: PickImplicon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIcon(value: `false` | String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
  }
}
