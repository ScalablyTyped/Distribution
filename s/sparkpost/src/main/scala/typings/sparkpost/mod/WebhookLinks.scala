package typings.sparkpost.mod

import typings.sparkpost.anon.Href
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebhookLinks extends StObject {
  
  var links: js.Array[Href]
}
object WebhookLinks {
  
  inline def apply(links: js.Array[Href]): WebhookLinks = {
    val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookLinks]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebhookLinks] (val x: Self) extends AnyVal {
    
    inline def setLinks(value: js.Array[Href]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setLinksVarargs(value: Href*): Self = StObject.set(x, "links", js.Array(value*))
  }
}
