package typings.sparkpost.mod

import typings.sparkpost.anon.Href
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebhookLinks extends StObject {
  
  var links: js.Array[Href]
}
object WebhookLinks {
  
  @scala.inline
  def apply(links: js.Array[Href]): WebhookLinks = {
    val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookLinks]
  }
  
  @scala.inline
  implicit class WebhookLinksMutableBuilder[Self <: WebhookLinks] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLinks(value: js.Array[Href]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinksVarargs(value: Href*): Self = StObject.set(x, "links", js.Array(value :_*))
  }
}
