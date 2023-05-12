package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Page
  extends StObject
     with Node
     with HasMetafields
     with OnlineStorePublishable
     with MetafieldParentResource
     with MetafieldReference {
  
  var body: String
  
  var bodySummary: String
  
  var createdAt: DateTime
  
  var handle: String
  
  var seo: SEO
  
  var title: String
  
  var updatedAt: DateTime
}
object Page {
  
  inline def apply(
    body: String,
    bodySummary: String,
    createdAt: DateTime,
    handle: String,
    id: ID,
    metafields: js.Array[Metafield],
    seo: SEO,
    title: String,
    updatedAt: DateTime
  ): Page = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], bodySummary = bodySummary.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], handle = handle.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], metafields = metafields.asInstanceOf[js.Any], seo = seo.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Page]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Page] (val x: Self) extends AnyVal {
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodySummary(value: String): Self = StObject.set(x, "bodySummary", value.asInstanceOf[js.Any])
    
    inline def setCreatedAt(value: DateTime): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setHandle(value: String): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
    
    inline def setSeo(value: SEO): Self = StObject.set(x, "seo", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAt(value: DateTime): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
  }
}
