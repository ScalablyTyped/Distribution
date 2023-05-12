package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.shopifyBuy.mod.Collection
  - typings.shopifyBuy.mod.ContentEntry
  - typings.shopifyBuy.mod.GenericFile
  - typings.shopifyBuy.mod.MediaImage
  - typings.shopifyBuy.mod.Page
  - typings.shopifyBuy.mod.Product
  - typings.shopifyBuy.mod.ProductVariant
  - typings.shopifyBuy.mod.Video
*/
trait MetafieldReference extends StObject
object MetafieldReference {
  
  inline def Collection(
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
  ): typings.shopifyBuy.mod.Collection = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], descriptionHtml = descriptionHtml.asInstanceOf[js.Any], handle = handle.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], metafields = metafields.asInstanceOf[js.Any], products = products.asInstanceOf[js.Any], seo = seo.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.shopifyBuy.mod.Collection]
  }
  
  inline def ContentEntry(handle: String, id: ID, `type`: String, updatedAt: DateTime): typings.shopifyBuy.mod.ContentEntry = {
    val __obj = js.Dynamic.literal(handle = handle.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.shopifyBuy.mod.ContentEntry]
  }
  
  inline def GenericFile(id: ID): typings.shopifyBuy.mod.GenericFile = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.shopifyBuy.mod.GenericFile]
  }
  
  inline def MediaImage(id: ID, image: Image, mediaContentType: MediaContentType): typings.shopifyBuy.mod.MediaImage = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], mediaContentType = mediaContentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.shopifyBuy.mod.MediaImage]
  }
  
  inline def Page(
    body: String,
    bodySummary: String,
    createdAt: DateTime,
    handle: String,
    id: ID,
    metafields: js.Array[Metafield],
    seo: SEO,
    title: String,
    updatedAt: DateTime
  ): typings.shopifyBuy.mod.Page = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], bodySummary = bodySummary.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], handle = handle.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], metafields = metafields.asInstanceOf[js.Any], seo = seo.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.shopifyBuy.mod.Page]
  }
  
  inline def Product(
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
  ): typings.shopifyBuy.mod.Product = {
    val __obj = js.Dynamic.literal(availableForSale = availableForSale.asInstanceOf[js.Any], collections = collections.asInstanceOf[js.Any], compareAtPriceRange = compareAtPriceRange.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], descriptionHtml = descriptionHtml.asInstanceOf[js.Any], featuredImage = featuredImage.asInstanceOf[js.Any], handle = handle.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], isGiftCard = isGiftCard.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any], metafields = metafields.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], priceRange = priceRange.asInstanceOf[js.Any], productType = productType.asInstanceOf[js.Any], publishedAt = publishedAt.asInstanceOf[js.Any], requiresSellingPlan = requiresSellingPlan.asInstanceOf[js.Any], sellingPlanGroups = sellingPlanGroups.asInstanceOf[js.Any], seo = seo.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any], variants = variants.asInstanceOf[js.Any], vendor = vendor.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.shopifyBuy.mod.Product]
  }
  
  inline def ProductVariant(
    availableForSale: Boolean,
    barcode: String,
    compareAtPrice: MoneyV2,
    currentlyNotInStock: Boolean,
    id: ID,
    image: Image,
    metafields: js.Array[Metafield],
    price: MoneyV2,
    product: Product,
    requiresShipping: Boolean,
    selectedOptions: js.Array[SelectedOption],
    sellingPlanAllocations: js.Array[SellingPlanAllocation],
    storeAvailability: js.Array[StoreAvailability],
    title: String
  ): typings.shopifyBuy.mod.ProductVariant = {
    val __obj = js.Dynamic.literal(availableForSale = availableForSale.asInstanceOf[js.Any], barcode = barcode.asInstanceOf[js.Any], compareAtPrice = compareAtPrice.asInstanceOf[js.Any], currentlyNotInStock = currentlyNotInStock.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], metafields = metafields.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], product = product.asInstanceOf[js.Any], requiresShipping = requiresShipping.asInstanceOf[js.Any], selectedOptions = selectedOptions.asInstanceOf[js.Any], sellingPlanAllocations = sellingPlanAllocations.asInstanceOf[js.Any], storeAvailability = storeAvailability.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.shopifyBuy.mod.ProductVariant]
  }
  
  inline def Video(id: ID, mediaContentType: MediaContentType, sources: js.Array[VideoSource]): typings.shopifyBuy.mod.Video = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], mediaContentType = mediaContentType.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.shopifyBuy.mod.Video]
  }
}
