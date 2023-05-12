package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Products
  */
trait Collection
  extends StObject
     with Node
     with HasMetafields
     with OnlineStorePublishable
     with MetafieldParentResource
     with MetafieldReference {
  
  var description: String
  
  var descriptionHtml: String
  
  var handle: String
  
  var image: Image
  
  var products: js.Array[Product]
  
  var seo: SEO
  
  var title: String
  
  var updatedAt: DateTime
}
object Collection {
  
  inline def apply(
    description: String,
    descriptionHtml: String,
    handle: String,
    id: ID,
    image: Image,
    metafields: js.Array[Metafield],
    products: js.Array[Product],
    seo: SEO,
    title: String,
    updatedAt: DateTime
  ): Collection = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], descriptionHtml = descriptionHtml.asInstanceOf[js.Any], handle = handle.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], metafields = metafields.asInstanceOf[js.Any], products = products.asInstanceOf[js.Any], seo = seo.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Collection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Collection] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionHtml(value: String): Self = StObject.set(x, "descriptionHtml", value.asInstanceOf[js.Any])
    
    inline def setHandle(value: String): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
    
    inline def setImage(value: Image): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setProducts(value: js.Array[Product]): Self = StObject.set(x, "products", value.asInstanceOf[js.Any])
    
    inline def setProductsVarargs(value: Product*): Self = StObject.set(x, "products", js.Array(value*))
    
    inline def setSeo(value: SEO): Self = StObject.set(x, "seo", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAt(value: DateTime): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
  }
}
