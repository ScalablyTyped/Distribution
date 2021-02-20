package typings.semanticUiEmbed.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-embed.SemanticUI.Embed.MetadataSettings._Impl, 'url'> */
@js.native
trait PickImplurlUrl extends StObject {
  
  var url: String = js.native
}
object PickImplurlUrl {
  
  @scala.inline
  def apply(url: String): PickImplurlUrl = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplurlUrl]
  }
  
  @scala.inline
  implicit class PickImplurlUrlMutableBuilder[Self <: PickImplurlUrl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
