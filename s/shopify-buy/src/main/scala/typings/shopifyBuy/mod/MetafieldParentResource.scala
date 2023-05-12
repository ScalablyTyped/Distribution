package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.shopifyBuy.mod.Article
  - typings.shopifyBuy.mod.Blog
  - typings.shopifyBuy.mod.Collection
  - typings.shopifyBuy.mod.ContentEntry
  - typings.shopifyBuy.mod.Customer
  - typings.shopifyBuy.mod.Order
  - typings.shopifyBuy.mod.Page
  - typings.shopifyBuy.mod.Product
  - typings.shopifyBuy.mod.ProductVariant
  - typings.shopifyBuy.mod.Shop
*/
trait MetafieldParentResource extends StObject
object MetafieldParentResource {
  
  inline def Article(
    author: ArticleAuthor,
    blog: Blog,
    comments: js.Array[Comment],
    content: String,
    contentHtml: String,
    handle: String,
    id: ID,
    metafields: js.Array[Metafield],
    publishedAt: DateTime,
    tags: js.Array[String],
    title: js.Array[String]
  ): typings.shopifyBuy.mod.Article = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], blog = blog.asInstanceOf[js.Any], comments = comments.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], contentHtml = contentHtml.asInstanceOf[js.Any], handle = handle.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], metafields = metafields.asInstanceOf[js.Any], publishedAt = publishedAt.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.shopifyBuy.mod.Article]
  }
  
  inline def Blog(
    articles: js.Array[Article],
    authors: js.Array[ArticleAuthor],
    handle: String,
    id: ID,
    metafields: js.Array[Metafield],
    title: String
  ): typings.shopifyBuy.mod.Blog = {
    val __obj = js.Dynamic.literal(articles = articles.asInstanceOf[js.Any], authors = authors.asInstanceOf[js.Any], handle = handle.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], metafields = metafields.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.shopifyBuy.mod.Blog]
  }
  
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
  
  inline def Customer(
    acceptsMarketing: Boolean,
    addresses: js.Array[MailingAddress],
    createdAt: DateTime,
    displayName: String,
    id: ID,
    metafields: js.Array[Metafield],
    numberOfOrders: Double,
    orders: js.Array[Order],
    tags: js.Array[String],
    updatedAt: DateTime
  ): typings.shopifyBuy.mod.Customer = {
    val __obj = js.Dynamic.literal(acceptsMarketing = acceptsMarketing.asInstanceOf[js.Any], addresses = addresses.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], metafields = metafields.asInstanceOf[js.Any], numberOfOrders = numberOfOrders.asInstanceOf[js.Any], orders = orders.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.shopifyBuy.mod.Customer]
  }
  
  inline def Order(
    currencyCode: CurrencyCode,
    currentSubtotalPrice: MoneyV2,
    currentTotalPrice: MoneyV2,
    currentTotalTax: MoneyV2,
    customAttributes: js.Array[Attribute],
    discountApplications: js.Array[DiscountAllocation],
    edited: Boolean,
    fulfillmentStatus: OrderFulfillmentStatus,
    id: ID,
    lineItems: js.Array[OrderLineItem],
    metafields: js.Array[Metafield],
    name: String,
    orderNumber: Double,
    originalTotalPrice: MoneyV2,
    processedAt: DateTime,
    shippingDiscountAllocations: js.Array[DiscountAllocation],
    statusUrl: URL,
    totalPrice: MoneyV2,
    totalPriceV2: MoneyV2,
    totalRefunded: MoneyV2,
    totalRefundedV2: MoneyV2,
    totalShippingPrice: MoneyV2,
    totalShippingPriceV2: MoneyV2
  ): typings.shopifyBuy.mod.Order = {
    val __obj = js.Dynamic.literal(currencyCode = currencyCode.asInstanceOf[js.Any], currentSubtotalPrice = currentSubtotalPrice.asInstanceOf[js.Any], currentTotalPrice = currentTotalPrice.asInstanceOf[js.Any], currentTotalTax = currentTotalTax.asInstanceOf[js.Any], customAttributes = customAttributes.asInstanceOf[js.Any], discountApplications = discountApplications.asInstanceOf[js.Any], edited = edited.asInstanceOf[js.Any], fulfillmentStatus = fulfillmentStatus.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lineItems = lineItems.asInstanceOf[js.Any], metafields = metafields.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], orderNumber = orderNumber.asInstanceOf[js.Any], originalTotalPrice = originalTotalPrice.asInstanceOf[js.Any], processedAt = processedAt.asInstanceOf[js.Any], shippingDiscountAllocations = shippingDiscountAllocations.asInstanceOf[js.Any], statusUrl = statusUrl.asInstanceOf[js.Any], totalPrice = totalPrice.asInstanceOf[js.Any], totalPriceV2 = totalPriceV2.asInstanceOf[js.Any], totalRefunded = totalRefunded.asInstanceOf[js.Any], totalRefundedV2 = totalRefundedV2.asInstanceOf[js.Any], totalShippingPrice = totalShippingPrice.asInstanceOf[js.Any], totalShippingPriceV2 = totalShippingPriceV2.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.shopifyBuy.mod.Order]
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
  
  inline def Shop(
    id: ID,
    metafields: js.Array[Metafield],
    moneyFormat: String,
    name: String,
    paymentSettings: PaymentSettings,
    primaryDomain: Domain,
    shipsToCountries: CountryCode
  ): typings.shopifyBuy.mod.Shop = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], metafields = metafields.asInstanceOf[js.Any], moneyFormat = moneyFormat.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], paymentSettings = paymentSettings.asInstanceOf[js.Any], primaryDomain = primaryDomain.asInstanceOf[js.Any], shipsToCountries = shipsToCountries.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.shopifyBuy.mod.Shop]
  }
}
