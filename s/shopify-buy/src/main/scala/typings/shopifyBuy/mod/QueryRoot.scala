package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryRoot extends StObject {
  
  var blog: js.UndefOr[Blog] = js.undefined
  
  /**
    * @deprecated
    */
  var blogByHandle: js.UndefOr[Blog] = js.undefined
  
  var cart: js.UndefOr[Cart] = js.undefined
  
  var collection: js.UndefOr[Collection] = js.undefined
  
  /**
    * @deprecated
    */
  var collectionByHandle: js.UndefOr[Collection] = js.undefined
  
  var contentEntry: js.UndefOr[ContentEntry] = js.undefined
  
  var customer: js.UndefOr[Customer] = js.undefined
  
  var localization: Localization
  
  var menu: js.UndefOr[Menu] = js.undefined
  
  var node: js.UndefOr[Node] = js.undefined
  
  var nodes: js.Array[Node]
  
  var page: js.UndefOr[Page] = js.undefined
  
  /**
    * @deprecated
    */
  var pageByHandle: js.UndefOr[Page] = js.undefined
  
  var product: js.UndefOr[Product] = js.undefined
  
  /**
    * @deprecated
    */
  var productByHandle: js.UndefOr[Product] = js.undefined
  
  var productRecommendations: js.UndefOr[js.Array[Product]] = js.undefined
  
  var publicApiVersions: js.Array[ApiVersion]
  
  var shop: Shop
}
object QueryRoot {
  
  inline def apply(
    localization: Localization,
    nodes: js.Array[Node],
    publicApiVersions: js.Array[ApiVersion],
    shop: Shop
  ): QueryRoot = {
    val __obj = js.Dynamic.literal(localization = localization.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], publicApiVersions = publicApiVersions.asInstanceOf[js.Any], shop = shop.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryRoot]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryRoot] (val x: Self) extends AnyVal {
    
    inline def setBlog(value: Blog): Self = StObject.set(x, "blog", value.asInstanceOf[js.Any])
    
    inline def setBlogByHandle(value: Blog): Self = StObject.set(x, "blogByHandle", value.asInstanceOf[js.Any])
    
    inline def setBlogByHandleUndefined: Self = StObject.set(x, "blogByHandle", js.undefined)
    
    inline def setBlogUndefined: Self = StObject.set(x, "blog", js.undefined)
    
    inline def setCart(value: Cart): Self = StObject.set(x, "cart", value.asInstanceOf[js.Any])
    
    inline def setCartUndefined: Self = StObject.set(x, "cart", js.undefined)
    
    inline def setCollection(value: Collection): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
    
    inline def setCollectionByHandle(value: Collection): Self = StObject.set(x, "collectionByHandle", value.asInstanceOf[js.Any])
    
    inline def setCollectionByHandleUndefined: Self = StObject.set(x, "collectionByHandle", js.undefined)
    
    inline def setCollectionUndefined: Self = StObject.set(x, "collection", js.undefined)
    
    inline def setContentEntry(value: ContentEntry): Self = StObject.set(x, "contentEntry", value.asInstanceOf[js.Any])
    
    inline def setContentEntryUndefined: Self = StObject.set(x, "contentEntry", js.undefined)
    
    inline def setCustomer(value: Customer): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
    
    inline def setCustomerUndefined: Self = StObject.set(x, "customer", js.undefined)
    
    inline def setLocalization(value: Localization): Self = StObject.set(x, "localization", value.asInstanceOf[js.Any])
    
    inline def setMenu(value: Menu): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
    
    inline def setMenuUndefined: Self = StObject.set(x, "menu", js.undefined)
    
    inline def setNode(value: Node): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
    
    inline def setNodes(value: js.Array[Node]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesVarargs(value: Node*): Self = StObject.set(x, "nodes", js.Array(value*))
    
    inline def setPage(value: Page): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageByHandle(value: Page): Self = StObject.set(x, "pageByHandle", value.asInstanceOf[js.Any])
    
    inline def setPageByHandleUndefined: Self = StObject.set(x, "pageByHandle", js.undefined)
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setProduct(value: Product): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    inline def setProductByHandle(value: Product): Self = StObject.set(x, "productByHandle", value.asInstanceOf[js.Any])
    
    inline def setProductByHandleUndefined: Self = StObject.set(x, "productByHandle", js.undefined)
    
    inline def setProductRecommendations(value: js.Array[Product]): Self = StObject.set(x, "productRecommendations", value.asInstanceOf[js.Any])
    
    inline def setProductRecommendationsUndefined: Self = StObject.set(x, "productRecommendations", js.undefined)
    
    inline def setProductRecommendationsVarargs(value: Product*): Self = StObject.set(x, "productRecommendations", js.Array(value*))
    
    inline def setProductUndefined: Self = StObject.set(x, "product", js.undefined)
    
    inline def setPublicApiVersions(value: js.Array[ApiVersion]): Self = StObject.set(x, "publicApiVersions", value.asInstanceOf[js.Any])
    
    inline def setPublicApiVersionsVarargs(value: ApiVersion*): Self = StObject.set(x, "publicApiVersions", js.Array(value*))
    
    inline def setShop(value: Shop): Self = StObject.set(x, "shop", value.asInstanceOf[js.Any])
  }
}
