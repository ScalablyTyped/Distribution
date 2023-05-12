package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//  interface Model3d {}
//  interface Model3dSource {}
trait Product
  extends StObject
     with Node
     with HasMetafields
     with OnlineStorePublishable
     with MetafieldParentResource
     with MetafieldReference {
  
  var availableForSale: Boolean
  
  var collections: js.Array[Collection]
  
  var compareAtPriceRange: ProductPriceRange
  
  var createdAt: DateTime
  
  var description: String
  
  var descriptionHtml: String
  
  var featuredImage: Image
  
  var handle: String
  
  var images: js.Array[Image]
  
  var isGiftCard: Boolean
  
  var media: js.Array[Media]
  
  var options: js.Array[ProductOption]
  
  var priceRange: ProductPriceRange
  
  var productType: String
  
  var publishedAt: DateTime
  
  var requiresSellingPlan: Boolean
  
  var sellingPlanGroups: js.Array[SellingPlanGroup]
  
  var seo: SEO
  
  var tags: js.Array[String]
  
  var title: String
  
  var totalInventory: js.UndefOr[Double] = js.undefined
  
  var updatedAt: DateTime
  
  var variantBySelectedOptions: js.UndefOr[ProductVariant] = js.undefined
  
  var variants: js.Array[ProductVariant]
  
  var vendor: String
}
object Product {
  
  inline def apply(
    availableForSale: Boolean,
    collections: js.Array[Collection],
    compareAtPriceRange: ProductPriceRange,
    createdAt: DateTime,
    description: String,
    descriptionHtml: String,
    featuredImage: Image,
    handle: String,
    id: ID,
    images: js.Array[Image],
    isGiftCard: Boolean,
    media: js.Array[Media],
    metafields: js.Array[Metafield],
    options: js.Array[ProductOption],
    priceRange: ProductPriceRange,
    productType: String,
    publishedAt: DateTime,
    requiresSellingPlan: Boolean,
    sellingPlanGroups: js.Array[SellingPlanGroup],
    seo: SEO,
    tags: js.Array[String],
    title: String,
    updatedAt: DateTime,
    variants: js.Array[ProductVariant],
    vendor: String
  ): Product = {
    val __obj = js.Dynamic.literal(availableForSale = availableForSale.asInstanceOf[js.Any], collections = collections.asInstanceOf[js.Any], compareAtPriceRange = compareAtPriceRange.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], descriptionHtml = descriptionHtml.asInstanceOf[js.Any], featuredImage = featuredImage.asInstanceOf[js.Any], handle = handle.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], isGiftCard = isGiftCard.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any], metafields = metafields.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], priceRange = priceRange.asInstanceOf[js.Any], productType = productType.asInstanceOf[js.Any], publishedAt = publishedAt.asInstanceOf[js.Any], requiresSellingPlan = requiresSellingPlan.asInstanceOf[js.Any], sellingPlanGroups = sellingPlanGroups.asInstanceOf[js.Any], seo = seo.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any], variants = variants.asInstanceOf[js.Any], vendor = vendor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Product]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Product] (val x: Self) extends AnyVal {
    
    inline def setAvailableForSale(value: Boolean): Self = StObject.set(x, "availableForSale", value.asInstanceOf[js.Any])
    
    inline def setCollections(value: js.Array[Collection]): Self = StObject.set(x, "collections", value.asInstanceOf[js.Any])
    
    inline def setCollectionsVarargs(value: Collection*): Self = StObject.set(x, "collections", js.Array(value*))
    
    inline def setCompareAtPriceRange(value: ProductPriceRange): Self = StObject.set(x, "compareAtPriceRange", value.asInstanceOf[js.Any])
    
    inline def setCreatedAt(value: DateTime): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionHtml(value: String): Self = StObject.set(x, "descriptionHtml", value.asInstanceOf[js.Any])
    
    inline def setFeaturedImage(value: Image): Self = StObject.set(x, "featuredImage", value.asInstanceOf[js.Any])
    
    inline def setHandle(value: String): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
    
    inline def setImages(value: js.Array[Image]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    inline def setImagesVarargs(value: Image*): Self = StObject.set(x, "images", js.Array(value*))
    
    inline def setIsGiftCard(value: Boolean): Self = StObject.set(x, "isGiftCard", value.asInstanceOf[js.Any])
    
    inline def setMedia(value: js.Array[Media]): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    inline def setMediaVarargs(value: Media*): Self = StObject.set(x, "media", js.Array(value*))
    
    inline def setOptions(value: js.Array[ProductOption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsVarargs(value: ProductOption*): Self = StObject.set(x, "options", js.Array(value*))
    
    inline def setPriceRange(value: ProductPriceRange): Self = StObject.set(x, "priceRange", value.asInstanceOf[js.Any])
    
    inline def setProductType(value: String): Self = StObject.set(x, "productType", value.asInstanceOf[js.Any])
    
    inline def setPublishedAt(value: DateTime): Self = StObject.set(x, "publishedAt", value.asInstanceOf[js.Any])
    
    inline def setRequiresSellingPlan(value: Boolean): Self = StObject.set(x, "requiresSellingPlan", value.asInstanceOf[js.Any])
    
    inline def setSellingPlanGroups(value: js.Array[SellingPlanGroup]): Self = StObject.set(x, "sellingPlanGroups", value.asInstanceOf[js.Any])
    
    inline def setSellingPlanGroupsVarargs(value: SellingPlanGroup*): Self = StObject.set(x, "sellingPlanGroups", js.Array(value*))
    
    inline def setSeo(value: SEO): Self = StObject.set(x, "seo", value.asInstanceOf[js.Any])
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTotalInventory(value: Double): Self = StObject.set(x, "totalInventory", value.asInstanceOf[js.Any])
    
    inline def setTotalInventoryUndefined: Self = StObject.set(x, "totalInventory", js.undefined)
    
    inline def setUpdatedAt(value: DateTime): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
    
    inline def setVariantBySelectedOptions(value: ProductVariant): Self = StObject.set(x, "variantBySelectedOptions", value.asInstanceOf[js.Any])
    
    inline def setVariantBySelectedOptionsUndefined: Self = StObject.set(x, "variantBySelectedOptions", js.undefined)
    
    inline def setVariants(value: js.Array[ProductVariant]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsVarargs(value: ProductVariant*): Self = StObject.set(x, "variants", js.Array(value*))
    
    inline def setVendor(value: String): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
  }
}
