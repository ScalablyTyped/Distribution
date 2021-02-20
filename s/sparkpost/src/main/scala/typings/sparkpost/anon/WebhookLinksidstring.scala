package typings.sparkpost.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined sparkpost.sparkpost.WebhookLinks & {  id :string} */
@js.native
trait WebhookLinksidstring extends StObject {
  
  var id: String = js.native
  
  var links: js.Array[Href] = js.native
}
object WebhookLinksidstring {
  
  @scala.inline
  def apply(id: String, links: js.Array[Href]): WebhookLinksidstring = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookLinksidstring]
  }
  
  @scala.inline
  implicit class WebhookLinksidstringMutableBuilder[Self <: WebhookLinksidstring] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinks(value: js.Array[Href]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinksVarargs(value: Href*): Self = StObject.set(x, "links", js.Array(value :_*))
  }
}
