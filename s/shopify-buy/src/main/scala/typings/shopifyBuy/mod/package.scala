package typings.shopifyBuy.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * Primary entry point for building a new Client.
  */
/* static member */
inline def buildClient(config: Config): ShopifyBuy = ^.asInstanceOf[js.Dynamic].applyDynamic("buildClient")(config.asInstanceOf[js.Any]).asInstanceOf[ShopifyBuy]
inline def buildClient(config: Config, fetchFunction: FetchFunction): ShopifyBuy = (^.asInstanceOf[js.Dynamic].applyDynamic("buildClient")(config.asInstanceOf[js.Any], fetchFunction.asInstanceOf[js.Any])).asInstanceOf[ShopifyBuy]

/**
  * GraphQL
  */
// GraphQL Types - Scalars
type Color = String

// TODO: https://shopify.dev/api/storefront/unstable/enums/CountryCode
type CountryCode = String

// TODO: https://shopify.dev/api/storefront/unstable/enums/CurrencyCode
type CurrencyCode = String

type DateTime = String

// end GraphQL Types - Enums
// GraphQL Types - Unions
type DeliveryAddress = MailingAddress

// TODO: https://shopify.dev/api/storefront/unstable/enums/DiscountApplicationTargetSelection
type DiscountApplicationTargetSelection = String

// TODO: https://shopify.dev/api/storefront/unstable/enums/DiscountApplicationTargetType
type DiscountApplicationTargetType = String

type FetchFunction = js.Function2[/* url */ String, /* options */ FetchOptions, js.Promise[Any]]

// TODO: https://shopify.dev/api/storefront/unstable/enums/FilterType
type FilterType = String

/**
  * GraphQL client
  *
  * @see https://github.com/Shopify/js-buy-sdk/blob/master/src/graphql-client.js
  */
// TODO: implement from graphql-js-client
type GraphQLJSClient = Any

type ID = String

// TODO: https://shopify.dev/api/storefront/unstable/enums/ImageContentType
type ImageContentType = String

type JSON = Record[String, Any]

// TODO: https://shopify.dev/api/storefront/unstable/enums/LanguageCode
type LanguageCode = String

// TODO: https://shopify.dev/api/storefront/unstable/enums/LocationSortKeys
type LocationSortKeys = String

// TODO: https://shopify.dev/api/storefront/unstable/enums/MediaContentType
type MediaContentType = String

// TODO: https://shopify.dev/api/storefront/unstable/enums/MediaHost
type MediaHost = String

// TODO: https://shopify.dev/api/storefront/unstable/enums/MenuItemType
type MenuItemType = String

type Merchandise = ProductVariant

// TODO: https://shopify.dev/api/storefront/unstable/enums/OrderCancelReason
type OrderCancelReason = String

// TODO: https://shopify.dev/api/storefront/unstable/enums/OrderFinancialStatus
type OrderFinancialStatus = String

// TODO: https://shopify.dev/api/storefront/unstable/enums/OrderFulfillmentStatus
type OrderFulfillmentStatus = String

// TODO: https://shopify.dev/api/storefront/unstable/enums/OrderSortKeys
type OrderSortKeys = String

// TODO: https://shopify.dev/api/storefront/unstable/enums/PageSortKeys
type PageSortKeys = String

// TODO: https://shopify.dev/api/storefront/unstable/enums/PaymentTokenType
type PaymentTokenType = String

// TODO: https://shopify.dev/api/storefront/unstable/enums/ProductCollectionSortKeys
type ProductCollectionSortKeys = String

// TODO: https://shopify.dev/api/storefront/unstable/enums/ProductImageSortKeys
type ProductImageSortKeys = String

// TODO: https://shopify.dev/api/storefront/unstable/enums/ProductMediaSortKeys
type ProductMediaSortKeys = String

// TODO: https://shopify.dev/api/storefront/unstable/enums/ProductSortKeys
type ProductSortKeys = String

// TODO: https://shopify.dev/api/storefront/unstable/enums/ProductVariantSortKeys
type ProductVariantSortKeys = String

// TODO: https://shopify.dev/api/storefront/unstable/enums/SellingPlanCheckoutChargeType
type SellingPlanCheckoutChargeType = String

// TODO: https://shopify.dev/api/storefront/unstable/enums/TransactionKind
type TransactionKind = String

// TODO: https://shopify.dev/api/storefront/unstable/enums/TransactionStatus
type TransactionStatus = String

type URL = String

// TODO: https://shopify.dev/api/storefront/unstable/enums/UnitPriceMeasurementMeasuredType
type UnitPriceMeasurementMeasuredType = String

// TODO: https://shopify.dev/api/storefront/unstable/enums/UnitPriceMeasurementMeasuredUnit
type UnitPriceMeasurementMeasuredUnit = String

// TODO: https://shopify.dev/api/storefront/unstable/enums/UnitSystem
type UnitSystem = String

// TODO: https://shopify.dev/api/storefront/unstable/enums/WeightUnit
type WeightUnit = String
