package typings.shopifyBuy.ShopifyBuy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Collection extends StObject {
  
  var body_html: String
  
  var handle: String
  
  var id: String
  
  var image: Image
  
  var metafields: js.Array[Any]
  
  var published: Boolean
  
  var published_at: String
  
  var published_scope: String
  
  var sort_order: String
  
  var template_suffix: String
  
  var title: String
  
  var updated_at: String
}
object Collection {
  
  inline def apply(
    body_html: String,
    handle: String,
    id: String,
    image: Image,
    metafields: js.Array[Any],
    published: Boolean,
    published_at: String,
    published_scope: String,
    sort_order: String,
    template_suffix: String,
    title: String,
    updated_at: String
  ): Collection = {
    val __obj = js.Dynamic.literal(body_html = body_html.asInstanceOf[js.Any], handle = handle.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], metafields = metafields.asInstanceOf[js.Any], published = published.asInstanceOf[js.Any], published_at = published_at.asInstanceOf[js.Any], published_scope = published_scope.asInstanceOf[js.Any], sort_order = sort_order.asInstanceOf[js.Any], template_suffix = template_suffix.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any])
    __obj.asInstanceOf[Collection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Collection] (val x: Self) extends AnyVal {
    
    inline def setBody_html(value: String): Self = StObject.set(x, "body_html", value.asInstanceOf[js.Any])
    
    inline def setHandle(value: String): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setImage(value: Image): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setMetafields(value: js.Array[Any]): Self = StObject.set(x, "metafields", value.asInstanceOf[js.Any])
    
    inline def setMetafieldsVarargs(value: Any*): Self = StObject.set(x, "metafields", js.Array(value*))
    
    inline def setPublished(value: Boolean): Self = StObject.set(x, "published", value.asInstanceOf[js.Any])
    
    inline def setPublished_at(value: String): Self = StObject.set(x, "published_at", value.asInstanceOf[js.Any])
    
    inline def setPublished_scope(value: String): Self = StObject.set(x, "published_scope", value.asInstanceOf[js.Any])
    
    inline def setSort_order(value: String): Self = StObject.set(x, "sort_order", value.asInstanceOf[js.Any])
    
    inline def setTemplate_suffix(value: String): Self = StObject.set(x, "template_suffix", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
  }
}
