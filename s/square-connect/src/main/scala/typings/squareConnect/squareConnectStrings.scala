package typings.squareConnect

import typings.squareConnect.mod.ActivityStatusType
import typings.squareConnect.mod.AreaUnitType
import typings.squareConnect.mod.CardBrandType
import typings.squareConnect.mod.CountryType
import typings.squareConnect.mod.CurrencyType
import typings.squareConnect.mod.CustomerSourceType
import typings.squareConnect.mod.DayOfWeekType
import typings.squareConnect.mod.DiscountApplicationScopeType
import typings.squareConnect.mod.DiscountType
import typings.squareConnect.mod.ErrorCategoryType
import typings.squareConnect.mod.ErrorCodeType
import typings.squareConnect.mod.FulfillmentStateType
import typings.squareConnect.mod.FulfillmentType
import typings.squareConnect.mod.InventoryStateType
import typings.squareConnect.mod.InventoryType
import typings.squareConnect.mod.LengthUnitType
import typings.squareConnect.mod.ObjectType
import typings.squareConnect.mod.OrderStateType
import typings.squareConnect.mod.PricingType
import typings.squareConnect.mod.ProductSourceType
import typings.squareConnect.mod.SortOrderType
import typings.squareConnect.mod.TaxApplicationScopeType
import typings.squareConnect.mod.TaxType
import typings.squareConnect.mod.VolumeUnitType
import typings.squareConnect.mod.WeightUnitType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object squareConnectStrings {
  @js.native
  sealed trait ACCESS_TOKEN_EXPIRED extends ErrorCodeType
  
  @js.native
  sealed trait ACCESS_TOKEN_REVOKED extends ErrorCodeType
  
  @js.native
  sealed trait ACTIVE extends ActivityStatusType
  
  @js.native
  sealed trait AD extends CountryType
  
  @js.native
  sealed trait ADDITIVE extends TaxType
  
  @js.native
  sealed trait ADJUSTMENT extends InventoryType
  
  @js.native
  sealed trait AE extends CountryType
  
  @js.native
  sealed trait AED extends CurrencyType
  
  @js.native
  sealed trait AF extends CountryType
  
  @js.native
  sealed trait AFN extends CurrencyType
  
  @js.native
  sealed trait AG extends CountryType
  
  @js.native
  sealed trait AI extends CountryType
  
  @js.native
  sealed trait AL extends CountryType
  
  @js.native
  sealed trait ALL extends CurrencyType
  
  @js.native
  sealed trait AM extends CountryType
  
  @js.native
  sealed trait AMD extends CurrencyType
  
  @js.native
  sealed trait AMERICAN_EXPRESS extends CardBrandType
  
  @js.native
  sealed trait AMOUNT_TOO_HIGH extends ErrorCodeType
  
  @js.native
  sealed trait ANG extends CurrencyType
  
  @js.native
  sealed trait AO extends CountryType
  
  @js.native
  sealed trait AOA extends CurrencyType
  
  @js.native
  sealed trait API_ERROR extends ErrorCategoryType
  
  @js.native
  sealed trait API_VERSION_INCOMPATIBLE extends ErrorCodeType
  
  @js.native
  sealed trait APPLE_PAYMENT_PROCESSING_CERTIFICATE_HASH_NOT_FOUND extends ErrorCodeType
  
  @js.native
  sealed trait APPLICATION_DISABLED extends ErrorCodeType
  
  @js.native
  sealed trait APPOINTMENTS
    extends CustomerSourceType
       with ProductSourceType
  
  @js.native
  sealed trait APPOINTMENTS_SERVICE extends js.Object
  
  @js.native
  sealed trait APPROVED extends js.Object
  
  @js.native
  sealed trait AQ extends CountryType
  
  @js.native
  sealed trait AR extends CountryType
  
  @js.native
  sealed trait ARRAY_EMPTY extends ErrorCodeType
  
  @js.native
  sealed trait ARRAY_LENGTH_TOO_LONG extends ErrorCodeType
  
  @js.native
  sealed trait ARRAY_LENGTH_TOO_SHORT extends ErrorCodeType
  
  @js.native
  sealed trait ARS extends CurrencyType
  
  @js.native
  sealed trait AS extends CountryType
  
  @js.native
  sealed trait ASAP extends js.Object
  
  @js.native
  sealed trait ASC extends SortOrderType
  
  @js.native
  sealed trait AT extends CountryType
  
  @js.native
  sealed trait AU extends CountryType
  
  @js.native
  sealed trait AUD extends CurrencyType
  
  @js.native
  sealed trait AUTHENTICATION_ERROR extends ErrorCategoryType
  
  @js.native
  sealed trait AUTHORIZED extends js.Object
  
  @js.native
  sealed trait AW extends CountryType
  
  @js.native
  sealed trait AWG extends CurrencyType
  
  @js.native
  sealed trait AX extends CountryType
  
  @js.native
  sealed trait AZ extends CountryType
  
  @js.native
  sealed trait AZN extends CurrencyType
  
  @js.native
  sealed trait BA extends CountryType
  
  @js.native
  sealed trait BAD_CERTIFICATE extends ErrorCodeType
  
  @js.native
  sealed trait BAD_REQUEST extends ErrorCodeType
  
  @js.native
  sealed trait BAM extends CurrencyType
  
  @js.native
  sealed trait BB extends CountryType
  
  @js.native
  sealed trait BBD extends CurrencyType
  
  @js.native
  sealed trait BD extends CountryType
  
  @js.native
  sealed trait BDT extends CurrencyType
  
  @js.native
  sealed trait BE extends CountryType
  
  @js.native
  sealed trait BF extends CountryType
  
  @js.native
  sealed trait BG extends CountryType
  
  @js.native
  sealed trait BGN extends CurrencyType
  
  @js.native
  sealed trait BH extends CountryType
  
  @js.native
  sealed trait BHD extends CurrencyType
  
  @js.native
  sealed trait BI extends CountryType
  
  @js.native
  sealed trait BIF extends CurrencyType
  
  @js.native
  sealed trait BILLING extends ProductSourceType
  
  @js.native
  sealed trait BJ extends CountryType
  
  @js.native
  sealed trait BL extends CountryType
  
  @js.native
  sealed trait BM extends CountryType
  
  @js.native
  sealed trait BMD extends CurrencyType
  
  @js.native
  sealed trait BN extends CountryType
  
  @js.native
  sealed trait BND extends CurrencyType
  
  @js.native
  sealed trait BO extends CountryType
  
  @js.native
  sealed trait BOB extends CurrencyType
  
  @js.native
  sealed trait BOV extends CurrencyType
  
  @js.native
  sealed trait BQ extends CountryType
  
  @js.native
  sealed trait BR extends CountryType
  
  @js.native
  sealed trait BRL extends CurrencyType
  
  @js.native
  sealed trait BS extends CountryType
  
  @js.native
  sealed trait BSD extends CurrencyType
  
  @js.native
  sealed trait BT extends CountryType
  
  @js.native
  sealed trait BTC extends CurrencyType
  
  @js.native
  sealed trait BTN extends CurrencyType
  
  @js.native
  sealed trait BV extends CountryType
  
  @js.native
  sealed trait BW extends CountryType
  
  @js.native
  sealed trait BWP extends CurrencyType
  
  @js.native
  sealed trait BY extends CountryType
  
  @js.native
  sealed trait BYR extends CurrencyType
  
  @js.native
  sealed trait BZ extends CountryType
  
  @js.native
  sealed trait BZD extends CurrencyType
  
  @js.native
  sealed trait CA extends CountryType
  
  @js.native
  sealed trait CAD extends CurrencyType
  
  @js.native
  sealed trait CANCELED
    extends FulfillmentStateType
       with OrderStateType
  
  @js.native
  sealed trait CAPTURED extends js.Object
  
  @js.native
  sealed trait CARD extends js.Object
  
  @js.native
  sealed trait CARD_DECLINED extends ErrorCodeType
  
  @js.native
  sealed trait CARD_DECLINED_CALL_ISSUER extends ErrorCodeType
  
  @js.native
  sealed trait CARD_EXPIRED extends ErrorCodeType
  
  @js.native
  sealed trait CARD_PROCESSING_NOT_ENABLED extends ErrorCodeType
  
  @js.native
  sealed trait CARD_TOKEN_EXPIRED extends ErrorCodeType
  
  @js.native
  sealed trait CARD_TOKEN_USED extends ErrorCodeType
  
  @js.native
  sealed trait CASH extends js.Object
  
  @js.native
  sealed trait CATEGORY extends ObjectType
  
  @js.native
  sealed trait CC extends CountryType
  
  @js.native
  sealed trait CD extends CountryType
  
  @js.native
  sealed trait CDF extends CurrencyType
  
  @js.native
  sealed trait CF extends CountryType
  
  @js.native
  sealed trait CG extends CountryType
  
  @js.native
  sealed trait CH extends CountryType
  
  @js.native
  sealed trait CHE extends CurrencyType
  
  @js.native
  sealed trait CHECKOUT_EXPIRED extends ErrorCodeType
  
  @js.native
  sealed trait CHF extends CurrencyType
  
  @js.native
  sealed trait CHINA_UNIONPAY extends CardBrandType
  
  @js.native
  sealed trait CHW extends CurrencyType
  
  @js.native
  sealed trait CI extends CountryType
  
  @js.native
  sealed trait CK extends CountryType
  
  @js.native
  sealed trait CL extends CountryType
  
  @js.native
  sealed trait CLF extends CurrencyType
  
  @js.native
  sealed trait CLOSED extends js.Object
  
  @js.native
  sealed trait CLOSED_AT extends js.Object
  
  @js.native
  sealed trait CLP extends CurrencyType
  
  @js.native
  sealed trait CM extends CountryType
  
  @js.native
  sealed trait CN extends CountryType
  
  @js.native
  sealed trait CNY extends CurrencyType
  
  @js.native
  sealed trait CO extends CountryType
  
  @js.native
  sealed trait COMPLETED
    extends FulfillmentStateType
       with OrderStateType
  
  @js.native
  sealed trait CONFLICT extends ErrorCodeType
  
  @js.native
  sealed trait CONFLICTING_PARAMETERS extends ErrorCodeType
  
  @js.native
  sealed trait CONTACTLESS extends js.Object
  
  @js.native
  sealed trait COP extends CurrencyType
  
  @js.native
  sealed trait COU extends CurrencyType
  
  @js.native
  sealed trait COUPON extends CustomerSourceType
  
  @js.native
  sealed trait CR extends CountryType
  
  @js.native
  sealed trait CRC extends CurrencyType
  
  @js.native
  sealed trait CREATED_AT extends js.Object
  
  @js.native
  sealed trait CU extends CountryType
  
  @js.native
  sealed trait CUC extends CurrencyType
  
  @js.native
  sealed trait CUP extends CurrencyType
  
  @js.native
  sealed trait CUSTOM extends InventoryStateType
  
  @js.native
  sealed trait CV extends CountryType
  
  @js.native
  sealed trait CVE extends CurrencyType
  
  @js.native
  sealed trait CW extends CountryType
  
  @js.native
  sealed trait CX extends CountryType
  
  @js.native
  sealed trait CY extends CountryType
  
  @js.native
  sealed trait CZ extends CountryType
  
  @js.native
  sealed trait CZK extends CurrencyType
  
  @js.native
  sealed trait DASHBOARD extends ProductSourceType
  
  @js.native
  sealed trait DE extends CountryType
  
  @js.native
  sealed trait DELAYED_TRANSACTION_CANCELED extends ErrorCodeType
  
  @js.native
  sealed trait DELAYED_TRANSACTION_CAPTURED extends ErrorCodeType
  
  @js.native
  sealed trait DELAYED_TRANSACTION_EXPIRED extends ErrorCodeType
  
  @js.native
  sealed trait DELAYED_TRANSACTION_FAILED extends ErrorCodeType
  
  @js.native
  sealed trait DELETION_RECOVERY extends CustomerSourceType
  
  @js.native
  sealed trait DEPRECATED_FIELD_SET extends ErrorCodeType
  
  @js.native
  sealed trait DESC extends SortOrderType
  
  @js.native
  sealed trait DIRECTORY extends CustomerSourceType
  
  @js.native
  sealed trait DISCOUNT extends ObjectType
  
  @js.native
  sealed trait DISCOVER extends CardBrandType
  
  @js.native
  sealed trait DISCOVER_DINERS extends CardBrandType
  
  @js.native
  sealed trait DJ extends CountryType
  
  @js.native
  sealed trait DJF extends CurrencyType
  
  @js.native
  sealed trait DK extends CountryType
  
  @js.native
  sealed trait DKK extends CurrencyType
  
  @js.native
  sealed trait DM extends CountryType
  
  @js.native
  sealed trait DO extends CountryType
  
  @js.native
  sealed trait DOP extends CurrencyType
  
  @js.native
  sealed trait DZ extends CountryType
  
  @js.native
  sealed trait DZD extends CurrencyType
  
  @js.native
  sealed trait EC extends CountryType
  
  @js.native
  sealed trait EE extends CountryType
  
  @js.native
  sealed trait EG extends CountryType
  
  @js.native
  sealed trait EGIFTING extends CustomerSourceType
  
  @js.native
  sealed trait EGP extends CurrencyType
  
  @js.native
  sealed trait EH extends CountryType
  
  @js.native
  sealed trait EMAIL_COLLECTION extends CustomerSourceType
  
  @js.native
  sealed trait EMV extends js.Object
  
  @js.native
  sealed trait END_AT extends js.Object
  
  @js.native
  sealed trait ER extends CountryType
  
  @js.native
  sealed trait ERN extends CurrencyType
  
  @js.native
  sealed trait ES extends CountryType
  
  @js.native
  sealed trait ET extends CountryType
  
  @js.native
  sealed trait ETB extends CurrencyType
  
  @js.native
  sealed trait EUR extends CurrencyType
  
  @js.native
  sealed trait EXCLUDE extends js.Object
  
  @js.native
  sealed trait EXPECTED_ARRAY extends ErrorCodeType
  
  @js.native
  sealed trait EXPECTED_BASE64_ENCODED_BYTE_ARRAY extends ErrorCodeType
  
  @js.native
  sealed trait EXPECTED_BOOLEAN extends ErrorCodeType
  
  @js.native
  sealed trait EXPECTED_FLOAT extends ErrorCodeType
  
  @js.native
  sealed trait EXPECTED_INTEGER extends ErrorCodeType
  
  @js.native
  sealed trait EXPECTED_JSON_BODY extends ErrorCodeType
  
  @js.native
  sealed trait EXPECTED_MAP extends ErrorCodeType
  
  @js.native
  sealed trait EXPECTED_OBJECT extends ErrorCodeType
  
  @js.native
  sealed trait EXPECTED_STRING extends ErrorCodeType
  
  @js.native
  sealed trait EXTERNAL_API extends ProductSourceType
  
  @js.native
  sealed trait FAILED extends FulfillmentStateType
  
  @js.native
  sealed trait FAILURE extends js.Object
  
  @js.native
  sealed trait FEEDBACK extends CustomerSourceType
  
  @js.native
  sealed trait FI extends CountryType
  
  @js.native
  sealed trait FIXED_AMOUNT extends DiscountType
  
  @js.native
  sealed trait FIXED_PERCENTAGE extends DiscountType
  
  @js.native
  sealed trait FIXED_PRICING extends PricingType
  
  @js.native
  sealed trait FJ extends CountryType
  
  @js.native
  sealed trait FJD extends CurrencyType
  
  @js.native
  sealed trait FK extends CountryType
  
  @js.native
  sealed trait FKP extends CurrencyType
  
  @js.native
  sealed trait FM extends CountryType
  
  @js.native
  sealed trait FO extends CountryType
  
  @js.native
  sealed trait FORBIDDEN extends ErrorCodeType
  
  @js.native
  sealed trait FR extends CountryType
  
  @js.native
  sealed trait FRI extends DayOfWeekType
  
  @js.native
  sealed trait GA extends CountryType
  
  @js.native
  sealed trait GATEWAY_TIMEOUT extends ErrorCodeType
  
  @js.native
  sealed trait GB extends CountryType
  
  @js.native
  sealed trait GBP extends CurrencyType
  
  @js.native
  sealed trait GD extends CountryType
  
  @js.native
  sealed trait GE extends CountryType
  
  @js.native
  sealed trait GEL extends CurrencyType
  
  @js.native
  sealed trait GENERIC_CUP extends VolumeUnitType
  
  @js.native
  sealed trait GENERIC_FLUID_OUNCE extends VolumeUnitType
  
  @js.native
  sealed trait GENERIC_GALLON extends VolumeUnitType
  
  @js.native
  sealed trait GENERIC_PINT extends VolumeUnitType
  
  @js.native
  sealed trait GENERIC_QUART extends VolumeUnitType
  
  @js.native
  sealed trait GENERIC_SHOT extends VolumeUnitType
  
  @js.native
  sealed trait GF extends CountryType
  
  @js.native
  sealed trait GG extends CountryType
  
  @js.native
  sealed trait GH extends CountryType
  
  @js.native
  sealed trait GHS extends CurrencyType
  
  @js.native
  sealed trait GI extends CountryType
  
  @js.native
  sealed trait GIFT_CARD extends js.Object
  
  @js.native
  sealed trait GIP extends CurrencyType
  
  @js.native
  sealed trait GL extends CountryType
  
  @js.native
  sealed trait GM extends CountryType
  
  @js.native
  sealed trait GMD extends CurrencyType
  
  @js.native
  sealed trait GN extends CountryType
  
  @js.native
  sealed trait GNF extends CurrencyType
  
  @js.native
  sealed trait GP extends CountryType
  
  @js.native
  sealed trait GQ extends CountryType
  
  @js.native
  sealed trait GR extends CountryType
  
  @js.native
  sealed trait GS extends CountryType
  
  @js.native
  sealed trait GT extends CountryType
  
  @js.native
  sealed trait GTQ extends CurrencyType
  
  @js.native
  sealed trait GU extends CountryType
  
  @js.native
  sealed trait GW extends CountryType
  
  @js.native
  sealed trait GY extends CountryType
  
  @js.native
  sealed trait GYD extends CurrencyType
  
  @js.native
  sealed trait HK extends CountryType
  
  @js.native
  sealed trait HKD extends CurrencyType
  
  @js.native
  sealed trait HM extends CountryType
  
  @js.native
  sealed trait HN extends CountryType
  
  @js.native
  sealed trait HNL extends CurrencyType
  
  @js.native
  sealed trait HR extends CountryType
  
  @js.native
  sealed trait HRK extends CurrencyType
  
  @js.native
  sealed trait HT extends CountryType
  
  @js.native
  sealed trait HTG extends CurrencyType
  
  @js.native
  sealed trait HU extends CountryType
  
  @js.native
  sealed trait HUF extends CurrencyType
  
  @js.native
  sealed trait ID extends CountryType
  
  @js.native
  sealed trait IDEMPOTENCY_KEY_REUSED extends ErrorCodeType
  
  @js.native
  sealed trait IDR extends CurrencyType
  
  @js.native
  sealed trait IE extends CountryType
  
  @js.native
  sealed trait IL extends CountryType
  
  @js.native
  sealed trait ILS extends CurrencyType
  
  @js.native
  sealed trait IM extends CountryType
  
  @js.native
  sealed trait IMAGE extends ObjectType
  
  @js.native
  sealed trait IMPERIAL_ACRE extends AreaUnitType
  
  @js.native
  sealed trait IMPERIAL_CUBIC_FOOT extends VolumeUnitType
  
  @js.native
  sealed trait IMPERIAL_CUBIC_INCH extends VolumeUnitType
  
  @js.native
  sealed trait IMPERIAL_CUBIC_YARD extends VolumeUnitType
  
  @js.native
  sealed trait IMPERIAL_FOOT extends LengthUnitType
  
  @js.native
  sealed trait IMPERIAL_INCH extends LengthUnitType
  
  @js.native
  sealed trait IMPERIAL_MILE extends LengthUnitType
  
  @js.native
  sealed trait IMPERIAL_POUND extends WeightUnitType
  
  @js.native
  sealed trait IMPERIAL_SQUARE_FOOT extends AreaUnitType
  
  @js.native
  sealed trait IMPERIAL_SQUARE_INCH extends AreaUnitType
  
  @js.native
  sealed trait IMPERIAL_SQUARE_MILE extends AreaUnitType
  
  @js.native
  sealed trait IMPERIAL_SQUARE_YARD extends AreaUnitType
  
  @js.native
  sealed trait IMPERIAL_STONE extends WeightUnitType
  
  @js.native
  sealed trait IMPERIAL_WEIGHT_OUNCE extends WeightUnitType
  
  @js.native
  sealed trait IMPERIAL_YARD extends LengthUnitType
  
  @js.native
  sealed trait IMPORT extends CustomerSourceType
  
  @js.native
  sealed trait IN extends CountryType
  
  @js.native
  sealed trait INACTIVE extends ActivityStatusType
  
  @js.native
  sealed trait INCLUDE extends js.Object
  
  @js.native
  sealed trait INCLUSIVE extends TaxType
  
  @js.native
  sealed trait INCORRECT_TYPE extends ErrorCodeType
  
  @js.native
  sealed trait INR extends CurrencyType
  
  @js.native
  sealed trait INSTANT_PROFILE extends CustomerSourceType
  
  @js.native
  sealed trait INSUFFICIENT_SCOPES extends ErrorCodeType
  
  @js.native
  sealed trait INTERNAL_SERVER_ERROR extends ErrorCodeType
  
  @js.native
  sealed trait INTERSECTION extends js.Object
  
  @js.native
  sealed trait INVALID_ARRAY_VALUE extends ErrorCodeType
  
  @js.native
  sealed trait INVALID_CARD extends ErrorCodeType
  
  @js.native
  sealed trait INVALID_CARD_DATA extends ErrorCodeType
  
  @js.native
  sealed trait INVALID_CONTENT_TYPE extends ErrorCodeType
  
  @js.native
  sealed trait INVALID_CURSOR extends ErrorCodeType
  
  @js.native
  sealed trait INVALID_EMAIL_ADDRESS extends ErrorCodeType
  
  @js.native
  sealed trait INVALID_ENCRYPTED_CARD extends ErrorCodeType
  
  @js.native
  sealed trait INVALID_ENUM_VALUE extends ErrorCodeType
  
  @js.native
  sealed trait INVALID_EXPIRATION extends ErrorCodeType
  
  @js.native
  sealed trait INVALID_EXPIRATION_DATE extends ErrorCodeType
  
  @js.native
  sealed trait INVALID_EXPIRATION_YEAR extends ErrorCodeType
  
  @js.native
  sealed trait INVALID_FORM_VALUE extends ErrorCodeType
  
  @js.native
  sealed trait INVALID_PHONE_NUMBER extends ErrorCodeType
  
  @js.native
  sealed trait INVALID_REQUEST_ERROR extends ErrorCategoryType
  
  @js.native
  sealed trait INVALID_SORT_ORDER extends ErrorCodeType
  
  @js.native
  sealed trait INVALID_SQUARE_VERSION_FORMAT extends ErrorCodeType
  
  @js.native
  sealed trait INVALID_TIME extends ErrorCodeType
  
  @js.native
  sealed trait INVALID_TIME_RANGE extends ErrorCodeType
  
  @js.native
  sealed trait INVALID_VALUE extends ErrorCodeType
  
  @js.native
  sealed trait INVOICES
    extends CustomerSourceType
       with ProductSourceType
  
  @js.native
  sealed trait IN_STOCK extends InventoryStateType
  
  @js.native
  sealed trait IN_TRANSIT_TO extends InventoryStateType
  
  @js.native
  sealed trait IO extends CountryType
  
  @js.native
  sealed trait IQ extends CountryType
  
  @js.native
  sealed trait IQD extends CurrencyType
  
  @js.native
  sealed trait IR extends CountryType
  
  @js.native
  sealed trait IRR extends CurrencyType
  
  @js.native
  sealed trait IS extends CountryType
  
  @js.native
  sealed trait ISK extends CurrencyType
  
  @js.native
  sealed trait IT extends CountryType
  
  @js.native
  sealed trait ITEM extends ObjectType
  
  @js.native
  sealed trait ITEM_LIBRARY_IMPORT extends ProductSourceType
  
  @js.native
  sealed trait ITEM_VARIATION extends ObjectType
  
  @js.native
  sealed trait JCB extends CardBrandType
  
  @js.native
  sealed trait JE extends CountryType
  
  @js.native
  sealed trait JM extends CountryType
  
  @js.native
  sealed trait JMD extends CurrencyType
  
  @js.native
  sealed trait JO extends CountryType
  
  @js.native
  sealed trait JOD extends CurrencyType
  
  @js.native
  sealed trait JP extends CountryType
  
  @js.native
  sealed trait JPY extends CurrencyType
  
  @js.native
  sealed trait KE extends CountryType
  
  @js.native
  sealed trait KES extends CurrencyType
  
  @js.native
  sealed trait KEYED extends js.Object
  
  @js.native
  sealed trait KG extends CountryType
  
  @js.native
  sealed trait KGS extends CurrencyType
  
  @js.native
  sealed trait KH extends CountryType
  
  @js.native
  sealed trait KHR extends CurrencyType
  
  @js.native
  sealed trait KI extends CountryType
  
  @js.native
  sealed trait KM extends CountryType
  
  @js.native
  sealed trait KMF extends CurrencyType
  
  @js.native
  sealed trait KN extends CountryType
  
  @js.native
  sealed trait KP extends CountryType
  
  @js.native
  sealed trait KPW extends CurrencyType
  
  @js.native
  sealed trait KR extends CountryType
  
  @js.native
  sealed trait KRW extends CurrencyType
  
  @js.native
  sealed trait KW extends CountryType
  
  @js.native
  sealed trait KWD extends CurrencyType
  
  @js.native
  sealed trait KY extends CountryType
  
  @js.native
  sealed trait KYD extends CurrencyType
  
  @js.native
  sealed trait KZ extends CountryType
  
  @js.native
  sealed trait KZT extends CurrencyType
  
  @js.native
  sealed trait LA extends CountryType
  
  @js.native
  sealed trait LAK extends CurrencyType
  
  @js.native
  sealed trait LB extends CountryType
  
  @js.native
  sealed trait LBP extends CurrencyType
  
  @js.native
  sealed trait LC extends CountryType
  
  @js.native
  sealed trait LI extends CountryType
  
  @js.native
  sealed trait LINE_ITEM
    extends DiscountApplicationScopeType
       with TaxApplicationScopeType
  
  @js.native
  sealed trait LK extends CountryType
  
  @js.native
  sealed trait LKR extends CurrencyType
  
  @js.native
  sealed trait LOCATION_MISMATCH extends ErrorCodeType
  
  @js.native
  sealed trait LOW_QUANTITY extends js.Object
  
  @js.native
  sealed trait LOYALTY extends CustomerSourceType
  
  @js.native
  sealed trait LR extends CountryType
  
  @js.native
  sealed trait LRD extends CurrencyType
  
  @js.native
  sealed trait LS extends CountryType
  
  @js.native
  sealed trait LSL extends CurrencyType
  
  @js.native
  sealed trait LT extends CountryType
  
  @js.native
  sealed trait LTL extends CurrencyType
  
  @js.native
  sealed trait LU extends CountryType
  
  @js.native
  sealed trait LV extends CountryType
  
  @js.native
  sealed trait LVL extends CurrencyType
  
  @js.native
  sealed trait LY extends CountryType
  
  @js.native
  sealed trait LYD extends CurrencyType
  
  @js.native
  sealed trait MA extends CountryType
  
  @js.native
  sealed trait MAD extends CurrencyType
  
  @js.native
  sealed trait MARKETING extends CustomerSourceType
  
  @js.native
  sealed trait MASTERCARD extends CardBrandType
  
  @js.native
  sealed trait MC extends CountryType
  
  @js.native
  sealed trait MD extends CountryType
  
  @js.native
  sealed trait MDL extends CurrencyType
  
  @js.native
  sealed trait ME extends CountryType
  
  @js.native
  sealed trait MERGE extends CustomerSourceType
  
  @js.native
  sealed trait METHOD_NOT_ALLOWED extends ErrorCodeType
  
  @js.native
  sealed trait METRIC_CENTIMETER extends LengthUnitType
  
  @js.native
  sealed trait METRIC_GRAM extends WeightUnitType
  
  @js.native
  sealed trait METRIC_KILOGRAM extends WeightUnitType
  
  @js.native
  sealed trait METRIC_KILOMETER extends LengthUnitType
  
  @js.native
  sealed trait METRIC_LITER extends VolumeUnitType
  
  @js.native
  sealed trait METRIC_METER extends LengthUnitType
  
  @js.native
  sealed trait METRIC_MILLIGRAM extends WeightUnitType
  
  @js.native
  sealed trait METRIC_MILLILITER extends VolumeUnitType
  
  @js.native
  sealed trait METRIC_MILLIMETER extends LengthUnitType
  
  @js.native
  sealed trait METRIC_SQUARE_CENTIMETER extends AreaUnitType
  
  @js.native
  sealed trait METRIC_SQUARE_KILOMETER extends AreaUnitType
  
  @js.native
  sealed trait METRIC_SQUARE_METER extends AreaUnitType
  
  @js.native
  sealed trait MF extends CountryType
  
  @js.native
  sealed trait MG extends CountryType
  
  @js.native
  sealed trait MGA extends CurrencyType
  
  @js.native
  sealed trait MH extends CountryType
  
  @js.native
  sealed trait MISSING_REQUIRED_PARAMETER extends ErrorCodeType
  
  @js.native
  sealed trait MK extends CountryType
  
  @js.native
  sealed trait MKD extends CurrencyType
  
  @js.native
  sealed trait ML extends CountryType
  
  @js.native
  sealed trait MM extends CountryType
  
  @js.native
  sealed trait MMK extends CurrencyType
  
  @js.native
  sealed trait MN extends CountryType
  
  @js.native
  sealed trait MNT extends CurrencyType
  
  @js.native
  sealed trait MO extends CountryType
  
  @js.native
  sealed trait MOBILE extends js.Object
  
  @js.native
  sealed trait MODIFIER extends ObjectType
  
  @js.native
  sealed trait MODIFIER_LIST extends ObjectType
  
  @js.native
  sealed trait MON extends DayOfWeekType
  
  @js.native
  sealed trait MOP extends CurrencyType
  
  @js.native
  sealed trait MP extends CountryType
  
  @js.native
  sealed trait MQ extends CountryType
  
  @js.native
  sealed trait MR extends CountryType
  
  @js.native
  sealed trait MRO extends CurrencyType
  
  @js.native
  sealed trait MS extends CountryType
  
  @js.native
  sealed trait MT extends CountryType
  
  @js.native
  sealed trait MU extends CountryType
  
  @js.native
  sealed trait MULTIPLE extends js.Object
  
  @js.native
  sealed trait MUR extends CurrencyType
  
  @js.native
  sealed trait MV extends CountryType
  
  @js.native
  sealed trait MVR extends CurrencyType
  
  @js.native
  sealed trait MW extends CountryType
  
  @js.native
  sealed trait MWK extends CurrencyType
  
  @js.native
  sealed trait MX extends CountryType
  
  @js.native
  sealed trait MXN extends CurrencyType
  
  @js.native
  sealed trait MXV extends CurrencyType
  
  @js.native
  sealed trait MY extends CountryType
  
  @js.native
  sealed trait MYR extends CurrencyType
  
  @js.native
  sealed trait MZ extends CountryType
  
  @js.native
  sealed trait MZN extends CurrencyType
  
  @js.native
  sealed trait NA extends CountryType
  
  @js.native
  sealed trait NAD extends CurrencyType
  
  @js.native
  sealed trait NC extends CountryType
  
  @js.native
  sealed trait NE extends CountryType
  
  @js.native
  sealed trait NF extends CountryType
  
  @js.native
  sealed trait NG extends CountryType
  
  @js.native
  sealed trait NGN extends CurrencyType
  
  @js.native
  sealed trait NI extends CountryType
  
  @js.native
  sealed trait NIO extends CurrencyType
  
  @js.native
  sealed trait NL extends CountryType
  
  @js.native
  sealed trait NO extends CountryType
  
  @js.native
  sealed trait NOK extends CurrencyType
  
  @js.native
  sealed trait NONE extends InventoryStateType
  
  @js.native
  sealed trait NOT_ACCEPTABLE extends ErrorCodeType
  
  @js.native
  sealed trait NOT_FOUND extends ErrorCodeType
  
  @js.native
  sealed trait NOT_IMPLEMENTED extends ErrorCodeType
  
  @js.native
  sealed trait NO_FIELDS_SET extends ErrorCodeType
  
  @js.native
  sealed trait NO_SALE extends js.Object
  
  @js.native
  sealed trait NP extends CountryType
  
  @js.native
  sealed trait NPR extends CurrencyType
  
  @js.native
  sealed trait NR extends CountryType
  
  @js.native
  sealed trait NU extends CountryType
  
  @js.native
  sealed trait NZ extends CountryType
  
  @js.native
  sealed trait NZD extends CurrencyType
  
  @js.native
  sealed trait OM extends CountryType
  
  @js.native
  sealed trait OMR extends CurrencyType
  
  @js.native
  sealed trait ONE_INSTRUMENT_EXPECTED extends ErrorCodeType
  
  @js.native
  sealed trait ONLINE_STORE
    extends CustomerSourceType
       with ProductSourceType
  
  @js.native
  sealed trait ON_FILE extends js.Object
  
  @js.native
  sealed trait OPEN extends OrderStateType
  
  @js.native
  sealed trait ORDER
    extends DiscountApplicationScopeType
       with TaxApplicationScopeType
  
  @js.native
  sealed trait ORDERED_FROM_VENDOR extends InventoryStateType
  
  @js.native
  sealed trait OTHER
    extends CustomerSourceType
       with ProductSourceType
  
  @js.native
  sealed trait OTHER_BRAND extends CardBrandType
  
  @js.native
  sealed trait OTHER_DISCOUNT_SCOPE extends DiscountApplicationScopeType
  
  @js.native
  sealed trait OTHER_TAX_SCOPE extends TaxApplicationScopeType
  
  @js.native
  sealed trait PA extends CountryType
  
  @js.native
  sealed trait PAB extends CurrencyType
  
  @js.native
  sealed trait PAYMENT_METHOD_ERROR extends ErrorCategoryType
  
  @js.native
  sealed trait PAYMENT_NOT_REFUNDABLE extends ErrorCodeType
  
  @js.native
  sealed trait PAYROLL extends ProductSourceType
  
  @js.native
  sealed trait PE extends CountryType
  
  @js.native
  sealed trait PEN extends CurrencyType
  
  @js.native
  sealed trait PENDING extends js.Object
  
  @js.native
  sealed trait PF extends CountryType
  
  @js.native
  sealed trait PG extends CountryType
  
  @js.native
  sealed trait PGK extends CurrencyType
  
  @js.native
  sealed trait PH extends CountryType
  
  @js.native
  sealed trait PHP extends CurrencyType
  
  @js.native
  sealed trait PHYSICAL extends js.Object
  
  @js.native
  sealed trait PHYSICAL_COUNT extends InventoryType
  
  @js.native
  sealed trait PICKUP extends FulfillmentType
  
  @js.native
  sealed trait PK extends CountryType
  
  @js.native
  sealed trait PKR extends CurrencyType
  
  @js.native
  sealed trait PL extends CountryType
  
  @js.native
  sealed trait PLN extends CurrencyType
  
  @js.native
  sealed trait PM extends CountryType
  
  @js.native
  sealed trait PN extends CountryType
  
  @js.native
  sealed trait PR extends CountryType
  
  @js.native
  sealed trait PREPARED extends FulfillmentStateType
  
  @js.native
  sealed trait PROPOSED extends FulfillmentStateType
  
  @js.native
  sealed trait PS extends CountryType
  
  @js.native
  sealed trait PT extends CountryType
  
  @js.native
  sealed trait PW extends CountryType
  
  @js.native
  sealed trait PY extends CountryType
  
  @js.native
  sealed trait PYG extends CurrencyType
  
  @js.native
  sealed trait QA extends CountryType
  
  @js.native
  sealed trait QAR extends CurrencyType
  
  @js.native
  sealed trait RATE_LIMITED extends ErrorCodeType
  
  @js.native
  sealed trait RATE_LIMIT_ERROR extends ErrorCategoryType
  
  @js.native
  sealed trait RE extends CountryType
  
  @js.native
  sealed trait RECEIVED_FROM_VENDOR extends InventoryStateType
  
  @js.native
  sealed trait REFUND_ALREADY_PENDING extends ErrorCodeType
  
  @js.native
  sealed trait REFUND_AMOUNT_INVALID extends ErrorCodeType
  
  @js.native
  sealed trait REFUND_ERROR extends ErrorCategoryType
  
  @js.native
  sealed trait REGISTER extends js.Object
  
  @js.native
  sealed trait REGULAR extends js.Object
  
  @js.native
  sealed trait REJECTED extends js.Object
  
  @js.native
  sealed trait REQUEST_ENTITY_TOO_LARGE extends ErrorCodeType
  
  @js.native
  sealed trait REQUEST_TIMEOUT extends ErrorCodeType
  
  @js.native
  sealed trait RESERVED extends FulfillmentStateType
  
  @js.native
  sealed trait RESERVED_FOR_SALE extends InventoryStateType
  
  @js.native
  sealed trait RESTAURANT_ITEM extends js.Object
  
  @js.native
  sealed trait RETAIL_ITEM extends js.Object
  
  @js.native
  sealed trait RETURNED_BY_CUSTOMER extends InventoryStateType
  
  @js.native
  sealed trait RO extends CountryType
  
  @js.native
  sealed trait RON extends CurrencyType
  
  @js.native
  sealed trait RS extends CountryType
  
  @js.native
  sealed trait RSD extends CurrencyType
  
  @js.native
  sealed trait RU extends CountryType
  
  @js.native
  sealed trait RUB extends CurrencyType
  
  @js.native
  sealed trait RW extends CountryType
  
  @js.native
  sealed trait RWF extends CurrencyType
  
  @js.native
  sealed trait SA extends CountryType
  
  @js.native
  sealed trait SANDBOX_NOT_SUPPORTED extends ErrorCodeType
  
  @js.native
  sealed trait SAR extends CurrencyType
  
  @js.native
  sealed trait SAT extends DayOfWeekType
  
  @js.native
  sealed trait SB extends CountryType
  
  @js.native
  sealed trait SBD extends CurrencyType
  
  @js.native
  sealed trait SC extends CountryType
  
  @js.native
  sealed trait SCHEDULED extends js.Object
  
  @js.native
  sealed trait SCR extends CurrencyType
  
  @js.native
  sealed trait SD extends CountryType
  
  @js.native
  sealed trait SDG extends CurrencyType
  
  @js.native
  sealed trait SE extends CountryType
  
  @js.native
  sealed trait SEK extends CurrencyType
  
  @js.native
  sealed trait SERVICE_UNAVAILABLE extends ErrorCodeType
  
  @js.native
  sealed trait SG extends CountryType
  
  @js.native
  sealed trait SGD extends CurrencyType
  
  @js.native
  sealed trait SH extends CountryType
  
  @js.native
  sealed trait SHIPMENT extends FulfillmentType
  
  @js.native
  sealed trait SHP extends CurrencyType
  
  @js.native
  sealed trait SI extends CountryType
  
  @js.native
  sealed trait SINGLE extends js.Object
  
  @js.native
  sealed trait SJ extends CountryType
  
  @js.native
  sealed trait SK extends CountryType
  
  @js.native
  sealed trait SL extends CountryType
  
  @js.native
  sealed trait SLL extends CurrencyType
  
  @js.native
  sealed trait SM extends CountryType
  
  @js.native
  sealed trait SN extends CountryType
  
  @js.native
  sealed trait SO extends CountryType
  
  @js.native
  sealed trait SOLD extends InventoryStateType
  
  @js.native
  sealed trait SOLD_ONLINE extends InventoryStateType
  
  @js.native
  sealed trait SOS extends CurrencyType
  
  @js.native
  sealed trait SQUARE_GIFT_CARD extends CardBrandType
  
  @js.native
  sealed trait SQUARE_POS extends ProductSourceType
  
  @js.native
  sealed trait SR extends CountryType
  
  @js.native
  sealed trait SRD extends CurrencyType
  
  @js.native
  sealed trait SS extends CountryType
  
  @js.native
  sealed trait SSP extends CurrencyType
  
  @js.native
  sealed trait ST extends CountryType
  
  @js.native
  sealed trait START_AT extends js.Object
  
  @js.native
  sealed trait STD extends CurrencyType
  
  @js.native
  sealed trait SUCCESS extends js.Object
  
  @js.native
  sealed trait SUN extends DayOfWeekType
  
  @js.native
  sealed trait SV extends CountryType
  
  @js.native
  sealed trait SVC extends CurrencyType
  
  @js.native
  sealed trait SWIPED extends js.Object
  
  @js.native
  sealed trait SX extends CountryType
  
  @js.native
  sealed trait SY extends CountryType
  
  @js.native
  sealed trait SYP extends CurrencyType
  
  @js.native
  sealed trait SZ extends CountryType
  
  @js.native
  sealed trait SZL extends CurrencyType
  
  @js.native
  sealed trait TAX extends ObjectType
  
  @js.native
  sealed trait TAX_SUBTOTAL_PHASE extends js.Object
  
  @js.native
  sealed trait TAX_TOTAL_PHASE extends js.Object
  
  @js.native
  sealed trait TC extends CountryType
  
  @js.native
  sealed trait TD extends CountryType
  
  @js.native
  sealed trait TERMINAL extends CustomerSourceType
  
  @js.native
  sealed trait TF extends CountryType
  
  @js.native
  sealed trait TG extends CountryType
  
  @js.native
  sealed trait TH extends CountryType
  
  @js.native
  sealed trait THB extends CurrencyType
  
  @js.native
  sealed trait THIRD_PARTY extends CustomerSourceType
  
  @js.native
  sealed trait THIRD_PARTY_CARD extends js.Object
  
  @js.native
  sealed trait THIRD_PARTY_IMPORT extends CustomerSourceType
  
  @js.native
  sealed trait THU extends DayOfWeekType
  
  @js.native
  sealed trait TJ extends CountryType
  
  @js.native
  sealed trait TJS extends CurrencyType
  
  @js.native
  sealed trait TK extends CountryType
  
  @js.native
  sealed trait TL extends CountryType
  
  @js.native
  sealed trait TM extends CountryType
  
  @js.native
  sealed trait TMT extends CurrencyType
  
  @js.native
  sealed trait TN extends CountryType
  
  @js.native
  sealed trait TND extends CurrencyType
  
  @js.native
  sealed trait TO extends CountryType
  
  @js.native
  sealed trait TOP extends CurrencyType
  
  @js.native
  sealed trait TR extends CountryType
  
  @js.native
  sealed trait TRANSFER extends InventoryType
  
  @js.native
  sealed trait TRY extends CurrencyType
  
  @js.native
  sealed trait TT extends CountryType
  
  @js.native
  sealed trait TTD extends CurrencyType
  
  @js.native
  sealed trait TUE extends DayOfWeekType
  
  @js.native
  sealed trait TV extends CountryType
  
  @js.native
  sealed trait TW extends CountryType
  
  @js.native
  sealed trait TWD extends CurrencyType
  
  @js.native
  sealed trait TZ extends CountryType
  
  @js.native
  sealed trait TZS extends CurrencyType
  
  @js.native
  sealed trait UA extends CountryType
  
  @js.native
  sealed trait UAH extends CurrencyType
  
  @js.native
  sealed trait UG extends CountryType
  
  @js.native
  sealed trait UGX extends CurrencyType
  
  @js.native
  sealed trait UM extends CountryType
  
  @js.native
  sealed trait UNAUTHORIZED extends ErrorCodeType
  
  @js.native
  sealed trait UNEXPECTED_VALUE extends ErrorCodeType
  
  @js.native
  sealed trait UNKNOWN extends js.Object
  
  @js.native
  sealed trait UNKNOWN_CURRENCY extends CurrencyType
  
  @js.native
  sealed trait UNKNOWN_DISCOUNT extends DiscountType
  
  @js.native
  sealed trait UNKNOWN_QUERY_PARAMETER extends ErrorCodeType
  
  @js.native
  sealed trait UNKNOWN_TAX extends TaxType
  
  @js.native
  sealed trait UNLINKED_RETURN extends InventoryStateType
  
  @js.native
  sealed trait UNMERGE_RECOVERY extends CustomerSourceType
  
  @js.native
  sealed trait UNSUPPORTED_CARD_BRAND extends ErrorCodeType
  
  @js.native
  sealed trait UNSUPPORTED_ENTRY_METHOD extends ErrorCodeType
  
  @js.native
  sealed trait UNSUPPORTED_INSTRUMENT_TYPE extends ErrorCodeType
  
  @js.native
  sealed trait UNSUPPORTED_MEDIA_TYPE extends ErrorCodeType
  
  @js.native
  sealed trait UPDATED_AT extends js.Object
  
  @js.native
  sealed trait US extends CountryType
  
  @js.native
  sealed trait USD extends CurrencyType
  
  @js.native
  sealed trait USN extends CurrencyType
  
  @js.native
  sealed trait USS extends CurrencyType
  
  @js.native
  sealed trait UY extends CountryType
  
  @js.native
  sealed trait UYI extends CurrencyType
  
  @js.native
  sealed trait UYU extends CurrencyType
  
  @js.native
  sealed trait UZ extends CountryType
  
  @js.native
  sealed trait UZS extends CurrencyType
  
  @js.native
  sealed trait V1_ACCESS_TOKEN extends ErrorCodeType
  
  @js.native
  sealed trait V1_APPLICATION extends ErrorCodeType
  
  @js.native
  sealed trait VA extends CountryType
  
  @js.native
  sealed trait VALUE_EMPTY extends ErrorCodeType
  
  @js.native
  sealed trait VALUE_REGEX_MISMATCH extends ErrorCodeType
  
  @js.native
  sealed trait VALUE_TOO_HIGH extends ErrorCodeType
  
  @js.native
  sealed trait VALUE_TOO_LONG extends ErrorCodeType
  
  @js.native
  sealed trait VALUE_TOO_LOW extends ErrorCodeType
  
  @js.native
  sealed trait VALUE_TOO_SHORT extends ErrorCodeType
  
  @js.native
  sealed trait VARIABLE_AMOUNT extends DiscountType
  
  @js.native
  sealed trait VARIABLE_PERCENTAGE extends DiscountType
  
  @js.native
  sealed trait VARIABLE_PRICING extends PricingType
  
  @js.native
  sealed trait VC extends CountryType
  
  @js.native
  sealed trait VE extends CountryType
  
  @js.native
  sealed trait VEF extends CurrencyType
  
  @js.native
  sealed trait VERIFIED extends js.Object
  
  @js.native
  sealed trait VERIFY_AVS_FAILURE extends ErrorCodeType
  
  @js.native
  sealed trait VERIFY_CVV_FAILURE extends ErrorCodeType
  
  @js.native
  sealed trait VG extends CountryType
  
  @js.native
  sealed trait VI extends CountryType
  
  @js.native
  sealed trait VISA extends CardBrandType
  
  @js.native
  sealed trait VN extends CountryType
  
  @js.native
  sealed trait VND extends CurrencyType
  
  @js.native
  sealed trait VOIDED extends js.Object
  
  @js.native
  sealed trait VU extends CountryType
  
  @js.native
  sealed trait VUV extends CurrencyType
  
  @js.native
  sealed trait WASTE extends InventoryStateType
  
  @js.native
  sealed trait WED extends DayOfWeekType
  
  @js.native
  sealed trait WF extends CountryType
  
  @js.native
  sealed trait WS extends CountryType
  
  @js.native
  sealed trait WST extends CurrencyType
  
  @js.native
  sealed trait XAF extends CurrencyType
  
  @js.native
  sealed trait XAG extends CurrencyType
  
  @js.native
  sealed trait XAU extends CurrencyType
  
  @js.native
  sealed trait XBA extends CurrencyType
  
  @js.native
  sealed trait XBB extends CurrencyType
  
  @js.native
  sealed trait XBC extends CurrencyType
  
  @js.native
  sealed trait XBD extends CurrencyType
  
  @js.native
  sealed trait XCD extends CurrencyType
  
  @js.native
  sealed trait XDR extends CurrencyType
  
  @js.native
  sealed trait XOF extends CurrencyType
  
  @js.native
  sealed trait XPD extends CurrencyType
  
  @js.native
  sealed trait XPF extends CurrencyType
  
  @js.native
  sealed trait XPT extends CurrencyType
  
  @js.native
  sealed trait XTS extends CurrencyType
  
  @js.native
  sealed trait XXX extends CurrencyType
  
  @js.native
  sealed trait YE extends CountryType
  
  @js.native
  sealed trait YER extends CurrencyType
  
  @js.native
  sealed trait YT extends CountryType
  
  @js.native
  sealed trait ZA extends CountryType
  
  @js.native
  sealed trait ZAR extends CurrencyType
  
  @js.native
  sealed trait ZM extends CountryType
  
  @js.native
  sealed trait ZMK extends CurrencyType
  
  @js.native
  sealed trait ZMW extends CurrencyType
  
  @js.native
  sealed trait ZW extends CountryType
  
  @js.native
  sealed trait ZZ extends CountryType
  
  @scala.inline
  def ACCESS_TOKEN_EXPIRED: ACCESS_TOKEN_EXPIRED = "ACCESS_TOKEN_EXPIRED".asInstanceOf[ACCESS_TOKEN_EXPIRED]
  @scala.inline
  def ACCESS_TOKEN_REVOKED: ACCESS_TOKEN_REVOKED = "ACCESS_TOKEN_REVOKED".asInstanceOf[ACCESS_TOKEN_REVOKED]
  @scala.inline
  def ACTIVE: ACTIVE = "ACTIVE".asInstanceOf[ACTIVE]
  @scala.inline
  def AD: AD = "AD".asInstanceOf[AD]
  @scala.inline
  def ADDITIVE: ADDITIVE = "ADDITIVE".asInstanceOf[ADDITIVE]
  @scala.inline
  def ADJUSTMENT: ADJUSTMENT = "ADJUSTMENT".asInstanceOf[ADJUSTMENT]
  @scala.inline
  def AE: AE = "AE".asInstanceOf[AE]
  @scala.inline
  def AED: AED = "AED".asInstanceOf[AED]
  @scala.inline
  def AF: AF = "AF".asInstanceOf[AF]
  @scala.inline
  def AFN: AFN = "AFN".asInstanceOf[AFN]
  @scala.inline
  def AG: AG = "AG".asInstanceOf[AG]
  @scala.inline
  def AI: AI = "AI".asInstanceOf[AI]
  @scala.inline
  def AL: AL = "AL".asInstanceOf[AL]
  @scala.inline
  def ALL: ALL = "ALL".asInstanceOf[ALL]
  @scala.inline
  def AM: AM = "AM".asInstanceOf[AM]
  @scala.inline
  def AMD: AMD = "AMD".asInstanceOf[AMD]
  @scala.inline
  def AMERICAN_EXPRESS: AMERICAN_EXPRESS = "AMERICAN_EXPRESS".asInstanceOf[AMERICAN_EXPRESS]
  @scala.inline
  def AMOUNT_TOO_HIGH: AMOUNT_TOO_HIGH = "AMOUNT_TOO_HIGH".asInstanceOf[AMOUNT_TOO_HIGH]
  @scala.inline
  def ANG: ANG = "ANG".asInstanceOf[ANG]
  @scala.inline
  def AO: AO = "AO".asInstanceOf[AO]
  @scala.inline
  def AOA: AOA = "AOA".asInstanceOf[AOA]
  @scala.inline
  def API_ERROR: API_ERROR = "API_ERROR".asInstanceOf[API_ERROR]
  @scala.inline
  def API_VERSION_INCOMPATIBLE: API_VERSION_INCOMPATIBLE = "API_VERSION_INCOMPATIBLE".asInstanceOf[API_VERSION_INCOMPATIBLE]
  @scala.inline
  def APPLE_PAYMENT_PROCESSING_CERTIFICATE_HASH_NOT_FOUND: APPLE_PAYMENT_PROCESSING_CERTIFICATE_HASH_NOT_FOUND = "APPLE_PAYMENT_PROCESSING_CERTIFICATE_HASH_NOT_FOUND".asInstanceOf[APPLE_PAYMENT_PROCESSING_CERTIFICATE_HASH_NOT_FOUND]
  @scala.inline
  def APPLICATION_DISABLED: APPLICATION_DISABLED = "APPLICATION_DISABLED".asInstanceOf[APPLICATION_DISABLED]
  @scala.inline
  def APPOINTMENTS: APPOINTMENTS = "APPOINTMENTS".asInstanceOf[APPOINTMENTS]
  @scala.inline
  def APPOINTMENTS_SERVICE: APPOINTMENTS_SERVICE = "APPOINTMENTS_SERVICE".asInstanceOf[APPOINTMENTS_SERVICE]
  @scala.inline
  def APPROVED: APPROVED = "APPROVED".asInstanceOf[APPROVED]
  @scala.inline
  def AQ: AQ = "AQ".asInstanceOf[AQ]
  @scala.inline
  def AR: AR = "AR".asInstanceOf[AR]
  @scala.inline
  def ARRAY_EMPTY: ARRAY_EMPTY = "ARRAY_EMPTY".asInstanceOf[ARRAY_EMPTY]
  @scala.inline
  def ARRAY_LENGTH_TOO_LONG: ARRAY_LENGTH_TOO_LONG = "ARRAY_LENGTH_TOO_LONG".asInstanceOf[ARRAY_LENGTH_TOO_LONG]
  @scala.inline
  def ARRAY_LENGTH_TOO_SHORT: ARRAY_LENGTH_TOO_SHORT = "ARRAY_LENGTH_TOO_SHORT".asInstanceOf[ARRAY_LENGTH_TOO_SHORT]
  @scala.inline
  def ARS: ARS = "ARS".asInstanceOf[ARS]
  @scala.inline
  def AS: AS = "AS".asInstanceOf[AS]
  @scala.inline
  def ASAP: ASAP = "ASAP".asInstanceOf[ASAP]
  @scala.inline
  def ASC: ASC = "ASC".asInstanceOf[ASC]
  @scala.inline
  def AT: AT = "AT".asInstanceOf[AT]
  @scala.inline
  def AU: AU = "AU".asInstanceOf[AU]
  @scala.inline
  def AUD: AUD = "AUD".asInstanceOf[AUD]
  @scala.inline
  def AUTHENTICATION_ERROR: AUTHENTICATION_ERROR = "AUTHENTICATION_ERROR".asInstanceOf[AUTHENTICATION_ERROR]
  @scala.inline
  def AUTHORIZED: AUTHORIZED = "AUTHORIZED".asInstanceOf[AUTHORIZED]
  @scala.inline
  def AW: AW = "AW".asInstanceOf[AW]
  @scala.inline
  def AWG: AWG = "AWG".asInstanceOf[AWG]
  @scala.inline
  def AX: AX = "AX".asInstanceOf[AX]
  @scala.inline
  def AZ: AZ = "AZ".asInstanceOf[AZ]
  @scala.inline
  def AZN: AZN = "AZN".asInstanceOf[AZN]
  @scala.inline
  def BA: BA = "BA".asInstanceOf[BA]
  @scala.inline
  def BAD_CERTIFICATE: BAD_CERTIFICATE = "BAD_CERTIFICATE".asInstanceOf[BAD_CERTIFICATE]
  @scala.inline
  def BAD_REQUEST: BAD_REQUEST = "BAD_REQUEST".asInstanceOf[BAD_REQUEST]
  @scala.inline
  def BAM: BAM = "BAM".asInstanceOf[BAM]
  @scala.inline
  def BB: BB = "BB".asInstanceOf[BB]
  @scala.inline
  def BBD: BBD = "BBD".asInstanceOf[BBD]
  @scala.inline
  def BD: BD = "BD".asInstanceOf[BD]
  @scala.inline
  def BDT: BDT = "BDT".asInstanceOf[BDT]
  @scala.inline
  def BE: BE = "BE".asInstanceOf[BE]
  @scala.inline
  def BF: BF = "BF".asInstanceOf[BF]
  @scala.inline
  def BG: BG = "BG".asInstanceOf[BG]
  @scala.inline
  def BGN: BGN = "BGN".asInstanceOf[BGN]
  @scala.inline
  def BH: BH = "BH".asInstanceOf[BH]
  @scala.inline
  def BHD: BHD = "BHD".asInstanceOf[BHD]
  @scala.inline
  def BI: BI = "BI".asInstanceOf[BI]
  @scala.inline
  def BIF: BIF = "BIF".asInstanceOf[BIF]
  @scala.inline
  def BILLING: BILLING = "BILLING".asInstanceOf[BILLING]
  @scala.inline
  def BJ: BJ = "BJ".asInstanceOf[BJ]
  @scala.inline
  def BL: BL = "BL".asInstanceOf[BL]
  @scala.inline
  def BM: BM = "BM".asInstanceOf[BM]
  @scala.inline
  def BMD: BMD = "BMD".asInstanceOf[BMD]
  @scala.inline
  def BN: BN = "BN".asInstanceOf[BN]
  @scala.inline
  def BND: BND = "BND".asInstanceOf[BND]
  @scala.inline
  def BO: BO = "BO".asInstanceOf[BO]
  @scala.inline
  def BOB: BOB = "BOB".asInstanceOf[BOB]
  @scala.inline
  def BOV: BOV = "BOV".asInstanceOf[BOV]
  @scala.inline
  def BQ: BQ = "BQ".asInstanceOf[BQ]
  @scala.inline
  def BR: BR = "BR".asInstanceOf[BR]
  @scala.inline
  def BRL: BRL = "BRL".asInstanceOf[BRL]
  @scala.inline
  def BS: BS = "BS".asInstanceOf[BS]
  @scala.inline
  def BSD: BSD = "BSD".asInstanceOf[BSD]
  @scala.inline
  def BT: BT = "BT".asInstanceOf[BT]
  @scala.inline
  def BTC: BTC = "BTC".asInstanceOf[BTC]
  @scala.inline
  def BTN: BTN = "BTN".asInstanceOf[BTN]
  @scala.inline
  def BV: BV = "BV".asInstanceOf[BV]
  @scala.inline
  def BW: BW = "BW".asInstanceOf[BW]
  @scala.inline
  def BWP: BWP = "BWP".asInstanceOf[BWP]
  @scala.inline
  def BY: BY = "BY".asInstanceOf[BY]
  @scala.inline
  def BYR: BYR = "BYR".asInstanceOf[BYR]
  @scala.inline
  def BZ: BZ = "BZ".asInstanceOf[BZ]
  @scala.inline
  def BZD: BZD = "BZD".asInstanceOf[BZD]
  @scala.inline
  def CA: CA = "CA".asInstanceOf[CA]
  @scala.inline
  def CAD: CAD = "CAD".asInstanceOf[CAD]
  @scala.inline
  def CANCELED: CANCELED = "CANCELED".asInstanceOf[CANCELED]
  @scala.inline
  def CAPTURED: CAPTURED = "CAPTURED".asInstanceOf[CAPTURED]
  @scala.inline
  def CARD: CARD = "CARD".asInstanceOf[CARD]
  @scala.inline
  def CARD_DECLINED: CARD_DECLINED = "CARD_DECLINED".asInstanceOf[CARD_DECLINED]
  @scala.inline
  def CARD_DECLINED_CALL_ISSUER: CARD_DECLINED_CALL_ISSUER = "CARD_DECLINED_CALL_ISSUER".asInstanceOf[CARD_DECLINED_CALL_ISSUER]
  @scala.inline
  def CARD_EXPIRED: CARD_EXPIRED = "CARD_EXPIRED".asInstanceOf[CARD_EXPIRED]
  @scala.inline
  def CARD_PROCESSING_NOT_ENABLED: CARD_PROCESSING_NOT_ENABLED = "CARD_PROCESSING_NOT_ENABLED".asInstanceOf[CARD_PROCESSING_NOT_ENABLED]
  @scala.inline
  def CARD_TOKEN_EXPIRED: CARD_TOKEN_EXPIRED = "CARD_TOKEN_EXPIRED".asInstanceOf[CARD_TOKEN_EXPIRED]
  @scala.inline
  def CARD_TOKEN_USED: CARD_TOKEN_USED = "CARD_TOKEN_USED".asInstanceOf[CARD_TOKEN_USED]
  @scala.inline
  def CASH: CASH = "CASH".asInstanceOf[CASH]
  @scala.inline
  def CATEGORY: CATEGORY = "CATEGORY".asInstanceOf[CATEGORY]
  @scala.inline
  def CC: CC = "CC".asInstanceOf[CC]
  @scala.inline
  def CD: CD = "CD".asInstanceOf[CD]
  @scala.inline
  def CDF: CDF = "CDF".asInstanceOf[CDF]
  @scala.inline
  def CF: CF = "CF".asInstanceOf[CF]
  @scala.inline
  def CG: CG = "CG".asInstanceOf[CG]
  @scala.inline
  def CH: CH = "CH".asInstanceOf[CH]
  @scala.inline
  def CHE: CHE = "CHE".asInstanceOf[CHE]
  @scala.inline
  def CHECKOUT_EXPIRED: CHECKOUT_EXPIRED = "CHECKOUT_EXPIRED".asInstanceOf[CHECKOUT_EXPIRED]
  @scala.inline
  def CHF: CHF = "CHF".asInstanceOf[CHF]
  @scala.inline
  def CHINA_UNIONPAY: CHINA_UNIONPAY = "CHINA_UNIONPAY".asInstanceOf[CHINA_UNIONPAY]
  @scala.inline
  def CHW: CHW = "CHW".asInstanceOf[CHW]
  @scala.inline
  def CI: CI = "CI".asInstanceOf[CI]
  @scala.inline
  def CK: CK = "CK".asInstanceOf[CK]
  @scala.inline
  def CL: CL = "CL".asInstanceOf[CL]
  @scala.inline
  def CLF: CLF = "CLF".asInstanceOf[CLF]
  @scala.inline
  def CLOSED: CLOSED = "CLOSED".asInstanceOf[CLOSED]
  @scala.inline
  def CLOSED_AT: CLOSED_AT = "CLOSED_AT".asInstanceOf[CLOSED_AT]
  @scala.inline
  def CLP: CLP = "CLP".asInstanceOf[CLP]
  @scala.inline
  def CM: CM = "CM".asInstanceOf[CM]
  @scala.inline
  def CN: CN = "CN".asInstanceOf[CN]
  @scala.inline
  def CNY: CNY = "CNY".asInstanceOf[CNY]
  @scala.inline
  def CO: CO = "CO".asInstanceOf[CO]
  @scala.inline
  def COMPLETED: COMPLETED = "COMPLETED".asInstanceOf[COMPLETED]
  @scala.inline
  def CONFLICT: CONFLICT = "CONFLICT".asInstanceOf[CONFLICT]
  @scala.inline
  def CONFLICTING_PARAMETERS: CONFLICTING_PARAMETERS = "CONFLICTING_PARAMETERS".asInstanceOf[CONFLICTING_PARAMETERS]
  @scala.inline
  def CONTACTLESS: CONTACTLESS = "CONTACTLESS".asInstanceOf[CONTACTLESS]
  @scala.inline
  def COP: COP = "COP".asInstanceOf[COP]
  @scala.inline
  def COU: COU = "COU".asInstanceOf[COU]
  @scala.inline
  def COUPON: COUPON = "COUPON".asInstanceOf[COUPON]
  @scala.inline
  def CR: CR = "CR".asInstanceOf[CR]
  @scala.inline
  def CRC: CRC = "CRC".asInstanceOf[CRC]
  @scala.inline
  def CREATED_AT: CREATED_AT = "CREATED_AT".asInstanceOf[CREATED_AT]
  @scala.inline
  def CU: CU = "CU".asInstanceOf[CU]
  @scala.inline
  def CUC: CUC = "CUC".asInstanceOf[CUC]
  @scala.inline
  def CUP: CUP = "CUP".asInstanceOf[CUP]
  @scala.inline
  def CUSTOM: CUSTOM = "CUSTOM".asInstanceOf[CUSTOM]
  @scala.inline
  def CV: CV = "CV".asInstanceOf[CV]
  @scala.inline
  def CVE: CVE = "CVE".asInstanceOf[CVE]
  @scala.inline
  def CW: CW = "CW".asInstanceOf[CW]
  @scala.inline
  def CX: CX = "CX".asInstanceOf[CX]
  @scala.inline
  def CY: CY = "CY".asInstanceOf[CY]
  @scala.inline
  def CZ: CZ = "CZ".asInstanceOf[CZ]
  @scala.inline
  def CZK: CZK = "CZK".asInstanceOf[CZK]
  @scala.inline
  def DASHBOARD: DASHBOARD = "DASHBOARD".asInstanceOf[DASHBOARD]
  @scala.inline
  def DE: DE = "DE".asInstanceOf[DE]
  @scala.inline
  def DELAYED_TRANSACTION_CANCELED: DELAYED_TRANSACTION_CANCELED = "DELAYED_TRANSACTION_CANCELED".asInstanceOf[DELAYED_TRANSACTION_CANCELED]
  @scala.inline
  def DELAYED_TRANSACTION_CAPTURED: DELAYED_TRANSACTION_CAPTURED = "DELAYED_TRANSACTION_CAPTURED".asInstanceOf[DELAYED_TRANSACTION_CAPTURED]
  @scala.inline
  def DELAYED_TRANSACTION_EXPIRED: DELAYED_TRANSACTION_EXPIRED = "DELAYED_TRANSACTION_EXPIRED".asInstanceOf[DELAYED_TRANSACTION_EXPIRED]
  @scala.inline
  def DELAYED_TRANSACTION_FAILED: DELAYED_TRANSACTION_FAILED = "DELAYED_TRANSACTION_FAILED".asInstanceOf[DELAYED_TRANSACTION_FAILED]
  @scala.inline
  def DELETION_RECOVERY: DELETION_RECOVERY = "DELETION_RECOVERY".asInstanceOf[DELETION_RECOVERY]
  @scala.inline
  def DEPRECATED_FIELD_SET: DEPRECATED_FIELD_SET = "DEPRECATED_FIELD_SET".asInstanceOf[DEPRECATED_FIELD_SET]
  @scala.inline
  def DESC: DESC = "DESC".asInstanceOf[DESC]
  @scala.inline
  def DIRECTORY: DIRECTORY = "DIRECTORY".asInstanceOf[DIRECTORY]
  @scala.inline
  def DISCOUNT: DISCOUNT = "DISCOUNT".asInstanceOf[DISCOUNT]
  @scala.inline
  def DISCOVER: DISCOVER = "DISCOVER".asInstanceOf[DISCOVER]
  @scala.inline
  def DISCOVER_DINERS: DISCOVER_DINERS = "DISCOVER_DINERS".asInstanceOf[DISCOVER_DINERS]
  @scala.inline
  def DJ: DJ = "DJ".asInstanceOf[DJ]
  @scala.inline
  def DJF: DJF = "DJF".asInstanceOf[DJF]
  @scala.inline
  def DK: DK = "DK".asInstanceOf[DK]
  @scala.inline
  def DKK: DKK = "DKK".asInstanceOf[DKK]
  @scala.inline
  def DM: DM = "DM".asInstanceOf[DM]
  @scala.inline
  def DO: DO = "DO".asInstanceOf[DO]
  @scala.inline
  def DOP: DOP = "DOP".asInstanceOf[DOP]
  @scala.inline
  def DZ: DZ = "DZ".asInstanceOf[DZ]
  @scala.inline
  def DZD: DZD = "DZD".asInstanceOf[DZD]
  @scala.inline
  def EC: EC = "EC".asInstanceOf[EC]
  @scala.inline
  def EE: EE = "EE".asInstanceOf[EE]
  @scala.inline
  def EG: EG = "EG".asInstanceOf[EG]
  @scala.inline
  def EGIFTING: EGIFTING = "EGIFTING".asInstanceOf[EGIFTING]
  @scala.inline
  def EGP: EGP = "EGP".asInstanceOf[EGP]
  @scala.inline
  def EH: EH = "EH".asInstanceOf[EH]
  @scala.inline
  def EMAIL_COLLECTION: EMAIL_COLLECTION = "EMAIL_COLLECTION".asInstanceOf[EMAIL_COLLECTION]
  @scala.inline
  def EMV: EMV = "EMV".asInstanceOf[EMV]
  @scala.inline
  def END_AT: END_AT = "END_AT".asInstanceOf[END_AT]
  @scala.inline
  def ER: ER = "ER".asInstanceOf[ER]
  @scala.inline
  def ERN: ERN = "ERN".asInstanceOf[ERN]
  @scala.inline
  def ES: ES = "ES".asInstanceOf[ES]
  @scala.inline
  def ET: ET = "ET".asInstanceOf[ET]
  @scala.inline
  def ETB: ETB = "ETB".asInstanceOf[ETB]
  @scala.inline
  def EUR: EUR = "EUR".asInstanceOf[EUR]
  @scala.inline
  def EXCLUDE: EXCLUDE = "EXCLUDE".asInstanceOf[EXCLUDE]
  @scala.inline
  def EXPECTED_ARRAY: EXPECTED_ARRAY = "EXPECTED_ARRAY".asInstanceOf[EXPECTED_ARRAY]
  @scala.inline
  def EXPECTED_BASE64_ENCODED_BYTE_ARRAY: EXPECTED_BASE64_ENCODED_BYTE_ARRAY = "EXPECTED_BASE64_ENCODED_BYTE_ARRAY".asInstanceOf[EXPECTED_BASE64_ENCODED_BYTE_ARRAY]
  @scala.inline
  def EXPECTED_BOOLEAN: EXPECTED_BOOLEAN = "EXPECTED_BOOLEAN".asInstanceOf[EXPECTED_BOOLEAN]
  @scala.inline
  def EXPECTED_FLOAT: EXPECTED_FLOAT = "EXPECTED_FLOAT".asInstanceOf[EXPECTED_FLOAT]
  @scala.inline
  def EXPECTED_INTEGER: EXPECTED_INTEGER = "EXPECTED_INTEGER".asInstanceOf[EXPECTED_INTEGER]
  @scala.inline
  def EXPECTED_JSON_BODY: EXPECTED_JSON_BODY = "EXPECTED_JSON_BODY".asInstanceOf[EXPECTED_JSON_BODY]
  @scala.inline
  def EXPECTED_MAP: EXPECTED_MAP = "EXPECTED_MAP".asInstanceOf[EXPECTED_MAP]
  @scala.inline
  def EXPECTED_OBJECT: EXPECTED_OBJECT = "EXPECTED_OBJECT".asInstanceOf[EXPECTED_OBJECT]
  @scala.inline
  def EXPECTED_STRING: EXPECTED_STRING = "EXPECTED_STRING".asInstanceOf[EXPECTED_STRING]
  @scala.inline
  def EXTERNAL_API: EXTERNAL_API = "EXTERNAL_API".asInstanceOf[EXTERNAL_API]
  @scala.inline
  def FAILED: FAILED = "FAILED".asInstanceOf[FAILED]
  @scala.inline
  def FAILURE: FAILURE = "FAILURE".asInstanceOf[FAILURE]
  @scala.inline
  def FEEDBACK: FEEDBACK = "FEEDBACK".asInstanceOf[FEEDBACK]
  @scala.inline
  def FI: FI = "FI".asInstanceOf[FI]
  @scala.inline
  def FIXED_AMOUNT: FIXED_AMOUNT = "FIXED_AMOUNT".asInstanceOf[FIXED_AMOUNT]
  @scala.inline
  def FIXED_PERCENTAGE: FIXED_PERCENTAGE = "FIXED_PERCENTAGE".asInstanceOf[FIXED_PERCENTAGE]
  @scala.inline
  def FIXED_PRICING: FIXED_PRICING = "FIXED_PRICING".asInstanceOf[FIXED_PRICING]
  @scala.inline
  def FJ: FJ = "FJ".asInstanceOf[FJ]
  @scala.inline
  def FJD: FJD = "FJD".asInstanceOf[FJD]
  @scala.inline
  def FK: FK = "FK".asInstanceOf[FK]
  @scala.inline
  def FKP: FKP = "FKP".asInstanceOf[FKP]
  @scala.inline
  def FM: FM = "FM".asInstanceOf[FM]
  @scala.inline
  def FO: FO = "FO".asInstanceOf[FO]
  @scala.inline
  def FORBIDDEN: FORBIDDEN = "FORBIDDEN".asInstanceOf[FORBIDDEN]
  @scala.inline
  def FR: FR = "FR".asInstanceOf[FR]
  @scala.inline
  def FRI: FRI = "FRI".asInstanceOf[FRI]
  @scala.inline
  def GA: GA = "GA".asInstanceOf[GA]
  @scala.inline
  def GATEWAY_TIMEOUT: GATEWAY_TIMEOUT = "GATEWAY_TIMEOUT".asInstanceOf[GATEWAY_TIMEOUT]
  @scala.inline
  def GB: GB = "GB".asInstanceOf[GB]
  @scala.inline
  def GBP: GBP = "GBP".asInstanceOf[GBP]
  @scala.inline
  def GD: GD = "GD".asInstanceOf[GD]
  @scala.inline
  def GE: GE = "GE".asInstanceOf[GE]
  @scala.inline
  def GEL: GEL = "GEL".asInstanceOf[GEL]
  @scala.inline
  def GENERIC_CUP: GENERIC_CUP = "GENERIC_CUP".asInstanceOf[GENERIC_CUP]
  @scala.inline
  def GENERIC_FLUID_OUNCE: GENERIC_FLUID_OUNCE = "GENERIC_FLUID_OUNCE".asInstanceOf[GENERIC_FLUID_OUNCE]
  @scala.inline
  def GENERIC_GALLON: GENERIC_GALLON = "GENERIC_GALLON".asInstanceOf[GENERIC_GALLON]
  @scala.inline
  def GENERIC_PINT: GENERIC_PINT = "GENERIC_PINT".asInstanceOf[GENERIC_PINT]
  @scala.inline
  def GENERIC_QUART: GENERIC_QUART = "GENERIC_QUART".asInstanceOf[GENERIC_QUART]
  @scala.inline
  def GENERIC_SHOT: GENERIC_SHOT = "GENERIC_SHOT".asInstanceOf[GENERIC_SHOT]
  @scala.inline
  def GF: GF = "GF".asInstanceOf[GF]
  @scala.inline
  def GG: GG = "GG".asInstanceOf[GG]
  @scala.inline
  def GH: GH = "GH".asInstanceOf[GH]
  @scala.inline
  def GHS: GHS = "GHS".asInstanceOf[GHS]
  @scala.inline
  def GI: GI = "GI".asInstanceOf[GI]
  @scala.inline
  def GIFT_CARD: GIFT_CARD = "GIFT_CARD".asInstanceOf[GIFT_CARD]
  @scala.inline
  def GIP: GIP = "GIP".asInstanceOf[GIP]
  @scala.inline
  def GL: GL = "GL".asInstanceOf[GL]
  @scala.inline
  def GM: GM = "GM".asInstanceOf[GM]
  @scala.inline
  def GMD: GMD = "GMD".asInstanceOf[GMD]
  @scala.inline
  def GN: GN = "GN".asInstanceOf[GN]
  @scala.inline
  def GNF: GNF = "GNF".asInstanceOf[GNF]
  @scala.inline
  def GP: GP = "GP".asInstanceOf[GP]
  @scala.inline
  def GQ: GQ = "GQ".asInstanceOf[GQ]
  @scala.inline
  def GR: GR = "GR".asInstanceOf[GR]
  @scala.inline
  def GS: GS = "GS".asInstanceOf[GS]
  @scala.inline
  def GT: GT = "GT".asInstanceOf[GT]
  @scala.inline
  def GTQ: GTQ = "GTQ".asInstanceOf[GTQ]
  @scala.inline
  def GU: GU = "GU".asInstanceOf[GU]
  @scala.inline
  def GW: GW = "GW".asInstanceOf[GW]
  @scala.inline
  def GY: GY = "GY".asInstanceOf[GY]
  @scala.inline
  def GYD: GYD = "GYD".asInstanceOf[GYD]
  @scala.inline
  def HK: HK = "HK".asInstanceOf[HK]
  @scala.inline
  def HKD: HKD = "HKD".asInstanceOf[HKD]
  @scala.inline
  def HM: HM = "HM".asInstanceOf[HM]
  @scala.inline
  def HN: HN = "HN".asInstanceOf[HN]
  @scala.inline
  def HNL: HNL = "HNL".asInstanceOf[HNL]
  @scala.inline
  def HR: HR = "HR".asInstanceOf[HR]
  @scala.inline
  def HRK: HRK = "HRK".asInstanceOf[HRK]
  @scala.inline
  def HT: HT = "HT".asInstanceOf[HT]
  @scala.inline
  def HTG: HTG = "HTG".asInstanceOf[HTG]
  @scala.inline
  def HU: HU = "HU".asInstanceOf[HU]
  @scala.inline
  def HUF: HUF = "HUF".asInstanceOf[HUF]
  @scala.inline
  def ID: ID = "ID".asInstanceOf[ID]
  @scala.inline
  def IDEMPOTENCY_KEY_REUSED: IDEMPOTENCY_KEY_REUSED = "IDEMPOTENCY_KEY_REUSED".asInstanceOf[IDEMPOTENCY_KEY_REUSED]
  @scala.inline
  def IDR: IDR = "IDR".asInstanceOf[IDR]
  @scala.inline
  def IE: IE = "IE".asInstanceOf[IE]
  @scala.inline
  def IL: IL = "IL".asInstanceOf[IL]
  @scala.inline
  def ILS: ILS = "ILS".asInstanceOf[ILS]
  @scala.inline
  def IM: IM = "IM".asInstanceOf[IM]
  @scala.inline
  def IMAGE: IMAGE = "IMAGE".asInstanceOf[IMAGE]
  @scala.inline
  def IMPERIAL_ACRE: IMPERIAL_ACRE = "IMPERIAL_ACRE".asInstanceOf[IMPERIAL_ACRE]
  @scala.inline
  def IMPERIAL_CUBIC_FOOT: IMPERIAL_CUBIC_FOOT = "IMPERIAL_CUBIC_FOOT".asInstanceOf[IMPERIAL_CUBIC_FOOT]
  @scala.inline
  def IMPERIAL_CUBIC_INCH: IMPERIAL_CUBIC_INCH = "IMPERIAL_CUBIC_INCH".asInstanceOf[IMPERIAL_CUBIC_INCH]
  @scala.inline
  def IMPERIAL_CUBIC_YARD: IMPERIAL_CUBIC_YARD = "IMPERIAL_CUBIC_YARD".asInstanceOf[IMPERIAL_CUBIC_YARD]
  @scala.inline
  def IMPERIAL_FOOT: IMPERIAL_FOOT = "IMPERIAL_FOOT".asInstanceOf[IMPERIAL_FOOT]
  @scala.inline
  def IMPERIAL_INCH: IMPERIAL_INCH = "IMPERIAL_INCH".asInstanceOf[IMPERIAL_INCH]
  @scala.inline
  def IMPERIAL_MILE: IMPERIAL_MILE = "IMPERIAL_MILE".asInstanceOf[IMPERIAL_MILE]
  @scala.inline
  def IMPERIAL_POUND: IMPERIAL_POUND = "IMPERIAL_POUND".asInstanceOf[IMPERIAL_POUND]
  @scala.inline
  def IMPERIAL_SQUARE_FOOT: IMPERIAL_SQUARE_FOOT = "IMPERIAL_SQUARE_FOOT".asInstanceOf[IMPERIAL_SQUARE_FOOT]
  @scala.inline
  def IMPERIAL_SQUARE_INCH: IMPERIAL_SQUARE_INCH = "IMPERIAL_SQUARE_INCH".asInstanceOf[IMPERIAL_SQUARE_INCH]
  @scala.inline
  def IMPERIAL_SQUARE_MILE: IMPERIAL_SQUARE_MILE = "IMPERIAL_SQUARE_MILE".asInstanceOf[IMPERIAL_SQUARE_MILE]
  @scala.inline
  def IMPERIAL_SQUARE_YARD: IMPERIAL_SQUARE_YARD = "IMPERIAL_SQUARE_YARD".asInstanceOf[IMPERIAL_SQUARE_YARD]
  @scala.inline
  def IMPERIAL_STONE: IMPERIAL_STONE = "IMPERIAL_STONE".asInstanceOf[IMPERIAL_STONE]
  @scala.inline
  def IMPERIAL_WEIGHT_OUNCE: IMPERIAL_WEIGHT_OUNCE = "IMPERIAL_WEIGHT_OUNCE".asInstanceOf[IMPERIAL_WEIGHT_OUNCE]
  @scala.inline
  def IMPERIAL_YARD: IMPERIAL_YARD = "IMPERIAL_YARD".asInstanceOf[IMPERIAL_YARD]
  @scala.inline
  def IMPORT: IMPORT = "IMPORT".asInstanceOf[IMPORT]
  @scala.inline
  def IN: IN = "IN".asInstanceOf[IN]
  @scala.inline
  def INACTIVE: INACTIVE = "INACTIVE".asInstanceOf[INACTIVE]
  @scala.inline
  def INCLUDE: INCLUDE = "INCLUDE".asInstanceOf[INCLUDE]
  @scala.inline
  def INCLUSIVE: INCLUSIVE = "INCLUSIVE".asInstanceOf[INCLUSIVE]
  @scala.inline
  def INCORRECT_TYPE: INCORRECT_TYPE = "INCORRECT_TYPE".asInstanceOf[INCORRECT_TYPE]
  @scala.inline
  def INR: INR = "INR".asInstanceOf[INR]
  @scala.inline
  def INSTANT_PROFILE: INSTANT_PROFILE = "INSTANT_PROFILE".asInstanceOf[INSTANT_PROFILE]
  @scala.inline
  def INSUFFICIENT_SCOPES: INSUFFICIENT_SCOPES = "INSUFFICIENT_SCOPES".asInstanceOf[INSUFFICIENT_SCOPES]
  @scala.inline
  def INTERNAL_SERVER_ERROR: INTERNAL_SERVER_ERROR = "INTERNAL_SERVER_ERROR".asInstanceOf[INTERNAL_SERVER_ERROR]
  @scala.inline
  def INTERSECTION: INTERSECTION = "INTERSECTION".asInstanceOf[INTERSECTION]
  @scala.inline
  def INVALID_ARRAY_VALUE: INVALID_ARRAY_VALUE = "INVALID_ARRAY_VALUE".asInstanceOf[INVALID_ARRAY_VALUE]
  @scala.inline
  def INVALID_CARD: INVALID_CARD = "INVALID_CARD".asInstanceOf[INVALID_CARD]
  @scala.inline
  def INVALID_CARD_DATA: INVALID_CARD_DATA = "INVALID_CARD_DATA".asInstanceOf[INVALID_CARD_DATA]
  @scala.inline
  def INVALID_CONTENT_TYPE: INVALID_CONTENT_TYPE = "INVALID_CONTENT_TYPE".asInstanceOf[INVALID_CONTENT_TYPE]
  @scala.inline
  def INVALID_CURSOR: INVALID_CURSOR = "INVALID_CURSOR".asInstanceOf[INVALID_CURSOR]
  @scala.inline
  def INVALID_EMAIL_ADDRESS: INVALID_EMAIL_ADDRESS = "INVALID_EMAIL_ADDRESS".asInstanceOf[INVALID_EMAIL_ADDRESS]
  @scala.inline
  def INVALID_ENCRYPTED_CARD: INVALID_ENCRYPTED_CARD = "INVALID_ENCRYPTED_CARD".asInstanceOf[INVALID_ENCRYPTED_CARD]
  @scala.inline
  def INVALID_ENUM_VALUE: INVALID_ENUM_VALUE = "INVALID_ENUM_VALUE".asInstanceOf[INVALID_ENUM_VALUE]
  @scala.inline
  def INVALID_EXPIRATION: INVALID_EXPIRATION = "INVALID_EXPIRATION".asInstanceOf[INVALID_EXPIRATION]
  @scala.inline
  def INVALID_EXPIRATION_DATE: INVALID_EXPIRATION_DATE = "INVALID_EXPIRATION_DATE".asInstanceOf[INVALID_EXPIRATION_DATE]
  @scala.inline
  def INVALID_EXPIRATION_YEAR: INVALID_EXPIRATION_YEAR = "INVALID_EXPIRATION_YEAR".asInstanceOf[INVALID_EXPIRATION_YEAR]
  @scala.inline
  def INVALID_FORM_VALUE: INVALID_FORM_VALUE = "INVALID_FORM_VALUE".asInstanceOf[INVALID_FORM_VALUE]
  @scala.inline
  def INVALID_PHONE_NUMBER: INVALID_PHONE_NUMBER = "INVALID_PHONE_NUMBER".asInstanceOf[INVALID_PHONE_NUMBER]
  @scala.inline
  def INVALID_REQUEST_ERROR: INVALID_REQUEST_ERROR = "INVALID_REQUEST_ERROR".asInstanceOf[INVALID_REQUEST_ERROR]
  @scala.inline
  def INVALID_SORT_ORDER: INVALID_SORT_ORDER = "INVALID_SORT_ORDER".asInstanceOf[INVALID_SORT_ORDER]
  @scala.inline
  def INVALID_SQUARE_VERSION_FORMAT: INVALID_SQUARE_VERSION_FORMAT = "INVALID_SQUARE_VERSION_FORMAT".asInstanceOf[INVALID_SQUARE_VERSION_FORMAT]
  @scala.inline
  def INVALID_TIME: INVALID_TIME = "INVALID_TIME".asInstanceOf[INVALID_TIME]
  @scala.inline
  def INVALID_TIME_RANGE: INVALID_TIME_RANGE = "INVALID_TIME_RANGE".asInstanceOf[INVALID_TIME_RANGE]
  @scala.inline
  def INVALID_VALUE: INVALID_VALUE = "INVALID_VALUE".asInstanceOf[INVALID_VALUE]
  @scala.inline
  def INVOICES: INVOICES = "INVOICES".asInstanceOf[INVOICES]
  @scala.inline
  def IN_STOCK: IN_STOCK = "IN_STOCK".asInstanceOf[IN_STOCK]
  @scala.inline
  def IN_TRANSIT_TO: IN_TRANSIT_TO = "IN_TRANSIT_TO".asInstanceOf[IN_TRANSIT_TO]
  @scala.inline
  def IO: IO = "IO".asInstanceOf[IO]
  @scala.inline
  def IQ: IQ = "IQ".asInstanceOf[IQ]
  @scala.inline
  def IQD: IQD = "IQD".asInstanceOf[IQD]
  @scala.inline
  def IR: IR = "IR".asInstanceOf[IR]
  @scala.inline
  def IRR: IRR = "IRR".asInstanceOf[IRR]
  @scala.inline
  def IS: IS = "IS".asInstanceOf[IS]
  @scala.inline
  def ISK: ISK = "ISK".asInstanceOf[ISK]
  @scala.inline
  def IT: IT = "IT".asInstanceOf[IT]
  @scala.inline
  def ITEM: ITEM = "ITEM".asInstanceOf[ITEM]
  @scala.inline
  def ITEM_LIBRARY_IMPORT: ITEM_LIBRARY_IMPORT = "ITEM_LIBRARY_IMPORT".asInstanceOf[ITEM_LIBRARY_IMPORT]
  @scala.inline
  def ITEM_VARIATION: ITEM_VARIATION = "ITEM_VARIATION".asInstanceOf[ITEM_VARIATION]
  @scala.inline
  def JCB: JCB = "JCB".asInstanceOf[JCB]
  @scala.inline
  def JE: JE = "JE".asInstanceOf[JE]
  @scala.inline
  def JM: JM = "JM".asInstanceOf[JM]
  @scala.inline
  def JMD: JMD = "JMD".asInstanceOf[JMD]
  @scala.inline
  def JO: JO = "JO".asInstanceOf[JO]
  @scala.inline
  def JOD: JOD = "JOD".asInstanceOf[JOD]
  @scala.inline
  def JP: JP = "JP".asInstanceOf[JP]
  @scala.inline
  def JPY: JPY = "JPY".asInstanceOf[JPY]
  @scala.inline
  def KE: KE = "KE".asInstanceOf[KE]
  @scala.inline
  def KES: KES = "KES".asInstanceOf[KES]
  @scala.inline
  def KEYED: KEYED = "KEYED".asInstanceOf[KEYED]
  @scala.inline
  def KG: KG = "KG".asInstanceOf[KG]
  @scala.inline
  def KGS: KGS = "KGS".asInstanceOf[KGS]
  @scala.inline
  def KH: KH = "KH".asInstanceOf[KH]
  @scala.inline
  def KHR: KHR = "KHR".asInstanceOf[KHR]
  @scala.inline
  def KI: KI = "KI".asInstanceOf[KI]
  @scala.inline
  def KM: KM = "KM".asInstanceOf[KM]
  @scala.inline
  def KMF: KMF = "KMF".asInstanceOf[KMF]
  @scala.inline
  def KN: KN = "KN".asInstanceOf[KN]
  @scala.inline
  def KP: KP = "KP".asInstanceOf[KP]
  @scala.inline
  def KPW: KPW = "KPW".asInstanceOf[KPW]
  @scala.inline
  def KR: KR = "KR".asInstanceOf[KR]
  @scala.inline
  def KRW: KRW = "KRW".asInstanceOf[KRW]
  @scala.inline
  def KW: KW = "KW".asInstanceOf[KW]
  @scala.inline
  def KWD: KWD = "KWD".asInstanceOf[KWD]
  @scala.inline
  def KY: KY = "KY".asInstanceOf[KY]
  @scala.inline
  def KYD: KYD = "KYD".asInstanceOf[KYD]
  @scala.inline
  def KZ: KZ = "KZ".asInstanceOf[KZ]
  @scala.inline
  def KZT: KZT = "KZT".asInstanceOf[KZT]
  @scala.inline
  def LA: LA = "LA".asInstanceOf[LA]
  @scala.inline
  def LAK: LAK = "LAK".asInstanceOf[LAK]
  @scala.inline
  def LB: LB = "LB".asInstanceOf[LB]
  @scala.inline
  def LBP: LBP = "LBP".asInstanceOf[LBP]
  @scala.inline
  def LC: LC = "LC".asInstanceOf[LC]
  @scala.inline
  def LI: LI = "LI".asInstanceOf[LI]
  @scala.inline
  def LINE_ITEM: LINE_ITEM = "LINE_ITEM".asInstanceOf[LINE_ITEM]
  @scala.inline
  def LK: LK = "LK".asInstanceOf[LK]
  @scala.inline
  def LKR: LKR = "LKR".asInstanceOf[LKR]
  @scala.inline
  def LOCATION_MISMATCH: LOCATION_MISMATCH = "LOCATION_MISMATCH".asInstanceOf[LOCATION_MISMATCH]
  @scala.inline
  def LOW_QUANTITY: LOW_QUANTITY = "LOW_QUANTITY".asInstanceOf[LOW_QUANTITY]
  @scala.inline
  def LOYALTY: LOYALTY = "LOYALTY".asInstanceOf[LOYALTY]
  @scala.inline
  def LR: LR = "LR".asInstanceOf[LR]
  @scala.inline
  def LRD: LRD = "LRD".asInstanceOf[LRD]
  @scala.inline
  def LS: LS = "LS".asInstanceOf[LS]
  @scala.inline
  def LSL: LSL = "LSL".asInstanceOf[LSL]
  @scala.inline
  def LT: LT = "LT".asInstanceOf[LT]
  @scala.inline
  def LTL: LTL = "LTL".asInstanceOf[LTL]
  @scala.inline
  def LU: LU = "LU".asInstanceOf[LU]
  @scala.inline
  def LV: LV = "LV".asInstanceOf[LV]
  @scala.inline
  def LVL: LVL = "LVL".asInstanceOf[LVL]
  @scala.inline
  def LY: LY = "LY".asInstanceOf[LY]
  @scala.inline
  def LYD: LYD = "LYD".asInstanceOf[LYD]
  @scala.inline
  def MA: MA = "MA".asInstanceOf[MA]
  @scala.inline
  def MAD: MAD = "MAD".asInstanceOf[MAD]
  @scala.inline
  def MARKETING: MARKETING = "MARKETING".asInstanceOf[MARKETING]
  @scala.inline
  def MASTERCARD: MASTERCARD = "MASTERCARD".asInstanceOf[MASTERCARD]
  @scala.inline
  def MC: MC = "MC".asInstanceOf[MC]
  @scala.inline
  def MD: MD = "MD".asInstanceOf[MD]
  @scala.inline
  def MDL: MDL = "MDL".asInstanceOf[MDL]
  @scala.inline
  def ME: ME = "ME".asInstanceOf[ME]
  @scala.inline
  def MERGE: MERGE = "MERGE".asInstanceOf[MERGE]
  @scala.inline
  def METHOD_NOT_ALLOWED: METHOD_NOT_ALLOWED = "METHOD_NOT_ALLOWED".asInstanceOf[METHOD_NOT_ALLOWED]
  @scala.inline
  def METRIC_CENTIMETER: METRIC_CENTIMETER = "METRIC_CENTIMETER".asInstanceOf[METRIC_CENTIMETER]
  @scala.inline
  def METRIC_GRAM: METRIC_GRAM = "METRIC_GRAM".asInstanceOf[METRIC_GRAM]
  @scala.inline
  def METRIC_KILOGRAM: METRIC_KILOGRAM = "METRIC_KILOGRAM".asInstanceOf[METRIC_KILOGRAM]
  @scala.inline
  def METRIC_KILOMETER: METRIC_KILOMETER = "METRIC_KILOMETER".asInstanceOf[METRIC_KILOMETER]
  @scala.inline
  def METRIC_LITER: METRIC_LITER = "METRIC_LITER".asInstanceOf[METRIC_LITER]
  @scala.inline
  def METRIC_METER: METRIC_METER = "METRIC_METER".asInstanceOf[METRIC_METER]
  @scala.inline
  def METRIC_MILLIGRAM: METRIC_MILLIGRAM = "METRIC_MILLIGRAM".asInstanceOf[METRIC_MILLIGRAM]
  @scala.inline
  def METRIC_MILLILITER: METRIC_MILLILITER = "METRIC_MILLILITER".asInstanceOf[METRIC_MILLILITER]
  @scala.inline
  def METRIC_MILLIMETER: METRIC_MILLIMETER = "METRIC_MILLIMETER".asInstanceOf[METRIC_MILLIMETER]
  @scala.inline
  def METRIC_SQUARE_CENTIMETER: METRIC_SQUARE_CENTIMETER = "METRIC_SQUARE_CENTIMETER".asInstanceOf[METRIC_SQUARE_CENTIMETER]
  @scala.inline
  def METRIC_SQUARE_KILOMETER: METRIC_SQUARE_KILOMETER = "METRIC_SQUARE_KILOMETER".asInstanceOf[METRIC_SQUARE_KILOMETER]
  @scala.inline
  def METRIC_SQUARE_METER: METRIC_SQUARE_METER = "METRIC_SQUARE_METER".asInstanceOf[METRIC_SQUARE_METER]
  @scala.inline
  def MF: MF = "MF".asInstanceOf[MF]
  @scala.inline
  def MG: MG = "MG".asInstanceOf[MG]
  @scala.inline
  def MGA: MGA = "MGA".asInstanceOf[MGA]
  @scala.inline
  def MH: MH = "MH".asInstanceOf[MH]
  @scala.inline
  def MISSING_REQUIRED_PARAMETER: MISSING_REQUIRED_PARAMETER = "MISSING_REQUIRED_PARAMETER".asInstanceOf[MISSING_REQUIRED_PARAMETER]
  @scala.inline
  def MK: MK = "MK".asInstanceOf[MK]
  @scala.inline
  def MKD: MKD = "MKD".asInstanceOf[MKD]
  @scala.inline
  def ML: ML = "ML".asInstanceOf[ML]
  @scala.inline
  def MM: MM = "MM".asInstanceOf[MM]
  @scala.inline
  def MMK: MMK = "MMK".asInstanceOf[MMK]
  @scala.inline
  def MN: MN = "MN".asInstanceOf[MN]
  @scala.inline
  def MNT: MNT = "MNT".asInstanceOf[MNT]
  @scala.inline
  def MO: MO = "MO".asInstanceOf[MO]
  @scala.inline
  def MOBILE: MOBILE = "MOBILE".asInstanceOf[MOBILE]
  @scala.inline
  def MODIFIER: MODIFIER = "MODIFIER".asInstanceOf[MODIFIER]
  @scala.inline
  def MODIFIER_LIST: MODIFIER_LIST = "MODIFIER_LIST".asInstanceOf[MODIFIER_LIST]
  @scala.inline
  def MON: MON = "MON".asInstanceOf[MON]
  @scala.inline
  def MOP: MOP = "MOP".asInstanceOf[MOP]
  @scala.inline
  def MP: MP = "MP".asInstanceOf[MP]
  @scala.inline
  def MQ: MQ = "MQ".asInstanceOf[MQ]
  @scala.inline
  def MR: MR = "MR".asInstanceOf[MR]
  @scala.inline
  def MRO: MRO = "MRO".asInstanceOf[MRO]
  @scala.inline
  def MS: MS = "MS".asInstanceOf[MS]
  @scala.inline
  def MT: MT = "MT".asInstanceOf[MT]
  @scala.inline
  def MU: MU = "MU".asInstanceOf[MU]
  @scala.inline
  def MULTIPLE: MULTIPLE = "MULTIPLE".asInstanceOf[MULTIPLE]
  @scala.inline
  def MUR: MUR = "MUR".asInstanceOf[MUR]
  @scala.inline
  def MV: MV = "MV".asInstanceOf[MV]
  @scala.inline
  def MVR: MVR = "MVR".asInstanceOf[MVR]
  @scala.inline
  def MW: MW = "MW".asInstanceOf[MW]
  @scala.inline
  def MWK: MWK = "MWK".asInstanceOf[MWK]
  @scala.inline
  def MX: MX = "MX".asInstanceOf[MX]
  @scala.inline
  def MXN: MXN = "MXN".asInstanceOf[MXN]
  @scala.inline
  def MXV: MXV = "MXV".asInstanceOf[MXV]
  @scala.inline
  def MY: MY = "MY".asInstanceOf[MY]
  @scala.inline
  def MYR: MYR = "MYR".asInstanceOf[MYR]
  @scala.inline
  def MZ: MZ = "MZ".asInstanceOf[MZ]
  @scala.inline
  def MZN: MZN = "MZN".asInstanceOf[MZN]
  @scala.inline
  def NA: NA = "NA".asInstanceOf[NA]
  @scala.inline
  def NAD: NAD = "NAD".asInstanceOf[NAD]
  @scala.inline
  def NC: NC = "NC".asInstanceOf[NC]
  @scala.inline
  def NE: NE = "NE".asInstanceOf[NE]
  @scala.inline
  def NF: NF = "NF".asInstanceOf[NF]
  @scala.inline
  def NG: NG = "NG".asInstanceOf[NG]
  @scala.inline
  def NGN: NGN = "NGN".asInstanceOf[NGN]
  @scala.inline
  def NI: NI = "NI".asInstanceOf[NI]
  @scala.inline
  def NIO: NIO = "NIO".asInstanceOf[NIO]
  @scala.inline
  def NL: NL = "NL".asInstanceOf[NL]
  @scala.inline
  def NO: NO = "NO".asInstanceOf[NO]
  @scala.inline
  def NOK: NOK = "NOK".asInstanceOf[NOK]
  @scala.inline
  def NONE: NONE = "NONE".asInstanceOf[NONE]
  @scala.inline
  def NOT_ACCEPTABLE: NOT_ACCEPTABLE = "NOT_ACCEPTABLE".asInstanceOf[NOT_ACCEPTABLE]
  @scala.inline
  def NOT_FOUND: NOT_FOUND = "NOT_FOUND".asInstanceOf[NOT_FOUND]
  @scala.inline
  def NOT_IMPLEMENTED: NOT_IMPLEMENTED = "NOT_IMPLEMENTED".asInstanceOf[NOT_IMPLEMENTED]
  @scala.inline
  def NO_FIELDS_SET: NO_FIELDS_SET = "NO_FIELDS_SET".asInstanceOf[NO_FIELDS_SET]
  @scala.inline
  def NO_SALE: NO_SALE = "NO_SALE".asInstanceOf[NO_SALE]
  @scala.inline
  def NP: NP = "NP".asInstanceOf[NP]
  @scala.inline
  def NPR: NPR = "NPR".asInstanceOf[NPR]
  @scala.inline
  def NR: NR = "NR".asInstanceOf[NR]
  @scala.inline
  def NU: NU = "NU".asInstanceOf[NU]
  @scala.inline
  def NZ: NZ = "NZ".asInstanceOf[NZ]
  @scala.inline
  def NZD: NZD = "NZD".asInstanceOf[NZD]
  @scala.inline
  def OM: OM = "OM".asInstanceOf[OM]
  @scala.inline
  def OMR: OMR = "OMR".asInstanceOf[OMR]
  @scala.inline
  def ONE_INSTRUMENT_EXPECTED: ONE_INSTRUMENT_EXPECTED = "ONE_INSTRUMENT_EXPECTED".asInstanceOf[ONE_INSTRUMENT_EXPECTED]
  @scala.inline
  def ONLINE_STORE: ONLINE_STORE = "ONLINE_STORE".asInstanceOf[ONLINE_STORE]
  @scala.inline
  def ON_FILE: ON_FILE = "ON_FILE".asInstanceOf[ON_FILE]
  @scala.inline
  def OPEN: OPEN = "OPEN".asInstanceOf[OPEN]
  @scala.inline
  def ORDER: ORDER = "ORDER".asInstanceOf[ORDER]
  @scala.inline
  def ORDERED_FROM_VENDOR: ORDERED_FROM_VENDOR = "ORDERED_FROM_VENDOR".asInstanceOf[ORDERED_FROM_VENDOR]
  @scala.inline
  def OTHER: OTHER = "OTHER".asInstanceOf[OTHER]
  @scala.inline
  def OTHER_BRAND: OTHER_BRAND = "OTHER_BRAND".asInstanceOf[OTHER_BRAND]
  @scala.inline
  def OTHER_DISCOUNT_SCOPE: OTHER_DISCOUNT_SCOPE = "OTHER_DISCOUNT_SCOPE".asInstanceOf[OTHER_DISCOUNT_SCOPE]
  @scala.inline
  def OTHER_TAX_SCOPE: OTHER_TAX_SCOPE = "OTHER_TAX_SCOPE".asInstanceOf[OTHER_TAX_SCOPE]
  @scala.inline
  def PA: PA = "PA".asInstanceOf[PA]
  @scala.inline
  def PAB: PAB = "PAB".asInstanceOf[PAB]
  @scala.inline
  def PAYMENT_METHOD_ERROR: PAYMENT_METHOD_ERROR = "PAYMENT_METHOD_ERROR".asInstanceOf[PAYMENT_METHOD_ERROR]
  @scala.inline
  def PAYMENT_NOT_REFUNDABLE: PAYMENT_NOT_REFUNDABLE = "PAYMENT_NOT_REFUNDABLE".asInstanceOf[PAYMENT_NOT_REFUNDABLE]
  @scala.inline
  def PAYROLL: PAYROLL = "PAYROLL".asInstanceOf[PAYROLL]
  @scala.inline
  def PE: PE = "PE".asInstanceOf[PE]
  @scala.inline
  def PEN: PEN = "PEN".asInstanceOf[PEN]
  @scala.inline
  def PENDING: PENDING = "PENDING".asInstanceOf[PENDING]
  @scala.inline
  def PF: PF = "PF".asInstanceOf[PF]
  @scala.inline
  def PG: PG = "PG".asInstanceOf[PG]
  @scala.inline
  def PGK: PGK = "PGK".asInstanceOf[PGK]
  @scala.inline
  def PH: PH = "PH".asInstanceOf[PH]
  @scala.inline
  def PHP: PHP = "PHP".asInstanceOf[PHP]
  @scala.inline
  def PHYSICAL: PHYSICAL = "PHYSICAL".asInstanceOf[PHYSICAL]
  @scala.inline
  def PHYSICAL_COUNT: PHYSICAL_COUNT = "PHYSICAL_COUNT".asInstanceOf[PHYSICAL_COUNT]
  @scala.inline
  def PICKUP: PICKUP = "PICKUP".asInstanceOf[PICKUP]
  @scala.inline
  def PK: PK = "PK".asInstanceOf[PK]
  @scala.inline
  def PKR: PKR = "PKR".asInstanceOf[PKR]
  @scala.inline
  def PL: PL = "PL".asInstanceOf[PL]
  @scala.inline
  def PLN: PLN = "PLN".asInstanceOf[PLN]
  @scala.inline
  def PM: PM = "PM".asInstanceOf[PM]
  @scala.inline
  def PN: PN = "PN".asInstanceOf[PN]
  @scala.inline
  def PR: PR = "PR".asInstanceOf[PR]
  @scala.inline
  def PREPARED: PREPARED = "PREPARED".asInstanceOf[PREPARED]
  @scala.inline
  def PROPOSED: PROPOSED = "PROPOSED".asInstanceOf[PROPOSED]
  @scala.inline
  def PS: PS = "PS".asInstanceOf[PS]
  @scala.inline
  def PT: PT = "PT".asInstanceOf[PT]
  @scala.inline
  def PW: PW = "PW".asInstanceOf[PW]
  @scala.inline
  def PY: PY = "PY".asInstanceOf[PY]
  @scala.inline
  def PYG: PYG = "PYG".asInstanceOf[PYG]
  @scala.inline
  def QA: QA = "QA".asInstanceOf[QA]
  @scala.inline
  def QAR: QAR = "QAR".asInstanceOf[QAR]
  @scala.inline
  def RATE_LIMITED: RATE_LIMITED = "RATE_LIMITED".asInstanceOf[RATE_LIMITED]
  @scala.inline
  def RATE_LIMIT_ERROR: RATE_LIMIT_ERROR = "RATE_LIMIT_ERROR".asInstanceOf[RATE_LIMIT_ERROR]
  @scala.inline
  def RE: RE = "RE".asInstanceOf[RE]
  @scala.inline
  def RECEIVED_FROM_VENDOR: RECEIVED_FROM_VENDOR = "RECEIVED_FROM_VENDOR".asInstanceOf[RECEIVED_FROM_VENDOR]
  @scala.inline
  def REFUND_ALREADY_PENDING: REFUND_ALREADY_PENDING = "REFUND_ALREADY_PENDING".asInstanceOf[REFUND_ALREADY_PENDING]
  @scala.inline
  def REFUND_AMOUNT_INVALID: REFUND_AMOUNT_INVALID = "REFUND_AMOUNT_INVALID".asInstanceOf[REFUND_AMOUNT_INVALID]
  @scala.inline
  def REFUND_ERROR: REFUND_ERROR = "REFUND_ERROR".asInstanceOf[REFUND_ERROR]
  @scala.inline
  def REGISTER: REGISTER = "REGISTER".asInstanceOf[REGISTER]
  @scala.inline
  def REGULAR: REGULAR = "REGULAR".asInstanceOf[REGULAR]
  @scala.inline
  def REJECTED: REJECTED = "REJECTED".asInstanceOf[REJECTED]
  @scala.inline
  def REQUEST_ENTITY_TOO_LARGE: REQUEST_ENTITY_TOO_LARGE = "REQUEST_ENTITY_TOO_LARGE".asInstanceOf[REQUEST_ENTITY_TOO_LARGE]
  @scala.inline
  def REQUEST_TIMEOUT: REQUEST_TIMEOUT = "REQUEST_TIMEOUT".asInstanceOf[REQUEST_TIMEOUT]
  @scala.inline
  def RESERVED: RESERVED = "RESERVED".asInstanceOf[RESERVED]
  @scala.inline
  def RESERVED_FOR_SALE: RESERVED_FOR_SALE = "RESERVED_FOR_SALE".asInstanceOf[RESERVED_FOR_SALE]
  @scala.inline
  def RESTAURANT_ITEM: RESTAURANT_ITEM = "RESTAURANT_ITEM".asInstanceOf[RESTAURANT_ITEM]
  @scala.inline
  def RETAIL_ITEM: RETAIL_ITEM = "RETAIL_ITEM".asInstanceOf[RETAIL_ITEM]
  @scala.inline
  def RETURNED_BY_CUSTOMER: RETURNED_BY_CUSTOMER = "RETURNED_BY_CUSTOMER".asInstanceOf[RETURNED_BY_CUSTOMER]
  @scala.inline
  def RO: RO = "RO".asInstanceOf[RO]
  @scala.inline
  def RON: RON = "RON".asInstanceOf[RON]
  @scala.inline
  def RS: RS = "RS".asInstanceOf[RS]
  @scala.inline
  def RSD: RSD = "RSD".asInstanceOf[RSD]
  @scala.inline
  def RU: RU = "RU".asInstanceOf[RU]
  @scala.inline
  def RUB: RUB = "RUB".asInstanceOf[RUB]
  @scala.inline
  def RW: RW = "RW".asInstanceOf[RW]
  @scala.inline
  def RWF: RWF = "RWF".asInstanceOf[RWF]
  @scala.inline
  def SA: SA = "SA".asInstanceOf[SA]
  @scala.inline
  def SANDBOX_NOT_SUPPORTED: SANDBOX_NOT_SUPPORTED = "SANDBOX_NOT_SUPPORTED".asInstanceOf[SANDBOX_NOT_SUPPORTED]
  @scala.inline
  def SAR: SAR = "SAR".asInstanceOf[SAR]
  @scala.inline
  def SAT: SAT = "SAT".asInstanceOf[SAT]
  @scala.inline
  def SB: SB = "SB".asInstanceOf[SB]
  @scala.inline
  def SBD: SBD = "SBD".asInstanceOf[SBD]
  @scala.inline
  def SC: SC = "SC".asInstanceOf[SC]
  @scala.inline
  def SCHEDULED: SCHEDULED = "SCHEDULED".asInstanceOf[SCHEDULED]
  @scala.inline
  def SCR: SCR = "SCR".asInstanceOf[SCR]
  @scala.inline
  def SD: SD = "SD".asInstanceOf[SD]
  @scala.inline
  def SDG: SDG = "SDG".asInstanceOf[SDG]
  @scala.inline
  def SE: SE = "SE".asInstanceOf[SE]
  @scala.inline
  def SEK: SEK = "SEK".asInstanceOf[SEK]
  @scala.inline
  def SERVICE_UNAVAILABLE: SERVICE_UNAVAILABLE = "SERVICE_UNAVAILABLE".asInstanceOf[SERVICE_UNAVAILABLE]
  @scala.inline
  def SG: SG = "SG".asInstanceOf[SG]
  @scala.inline
  def SGD: SGD = "SGD".asInstanceOf[SGD]
  @scala.inline
  def SH: SH = "SH".asInstanceOf[SH]
  @scala.inline
  def SHIPMENT: SHIPMENT = "SHIPMENT".asInstanceOf[SHIPMENT]
  @scala.inline
  def SHP: SHP = "SHP".asInstanceOf[SHP]
  @scala.inline
  def SI: SI = "SI".asInstanceOf[SI]
  @scala.inline
  def SINGLE: SINGLE = "SINGLE".asInstanceOf[SINGLE]
  @scala.inline
  def SJ: SJ = "SJ".asInstanceOf[SJ]
  @scala.inline
  def SK: SK = "SK".asInstanceOf[SK]
  @scala.inline
  def SL: SL = "SL".asInstanceOf[SL]
  @scala.inline
  def SLL: SLL = "SLL".asInstanceOf[SLL]
  @scala.inline
  def SM: SM = "SM".asInstanceOf[SM]
  @scala.inline
  def SN: SN = "SN".asInstanceOf[SN]
  @scala.inline
  def SO: SO = "SO".asInstanceOf[SO]
  @scala.inline
  def SOLD: SOLD = "SOLD".asInstanceOf[SOLD]
  @scala.inline
  def SOLD_ONLINE: SOLD_ONLINE = "SOLD_ONLINE".asInstanceOf[SOLD_ONLINE]
  @scala.inline
  def SOS: SOS = "SOS".asInstanceOf[SOS]
  @scala.inline
  def SQUARE_GIFT_CARD: SQUARE_GIFT_CARD = "SQUARE_GIFT_CARD".asInstanceOf[SQUARE_GIFT_CARD]
  @scala.inline
  def SQUARE_POS: SQUARE_POS = "SQUARE_POS".asInstanceOf[SQUARE_POS]
  @scala.inline
  def SR: SR = "SR".asInstanceOf[SR]
  @scala.inline
  def SRD: SRD = "SRD".asInstanceOf[SRD]
  @scala.inline
  def SS: SS = "SS".asInstanceOf[SS]
  @scala.inline
  def SSP: SSP = "SSP".asInstanceOf[SSP]
  @scala.inline
  def ST: ST = "ST".asInstanceOf[ST]
  @scala.inline
  def START_AT: START_AT = "START_AT".asInstanceOf[START_AT]
  @scala.inline
  def STD: STD = "STD".asInstanceOf[STD]
  @scala.inline
  def SUCCESS: SUCCESS = "SUCCESS".asInstanceOf[SUCCESS]
  @scala.inline
  def SUN: SUN = "SUN".asInstanceOf[SUN]
  @scala.inline
  def SV: SV = "SV".asInstanceOf[SV]
  @scala.inline
  def SVC: SVC = "SVC".asInstanceOf[SVC]
  @scala.inline
  def SWIPED: SWIPED = "SWIPED".asInstanceOf[SWIPED]
  @scala.inline
  def SX: SX = "SX".asInstanceOf[SX]
  @scala.inline
  def SY: SY = "SY".asInstanceOf[SY]
  @scala.inline
  def SYP: SYP = "SYP".asInstanceOf[SYP]
  @scala.inline
  def SZ: SZ = "SZ".asInstanceOf[SZ]
  @scala.inline
  def SZL: SZL = "SZL".asInstanceOf[SZL]
  @scala.inline
  def TAX: TAX = "TAX".asInstanceOf[TAX]
  @scala.inline
  def TAX_SUBTOTAL_PHASE: TAX_SUBTOTAL_PHASE = "TAX_SUBTOTAL_PHASE".asInstanceOf[TAX_SUBTOTAL_PHASE]
  @scala.inline
  def TAX_TOTAL_PHASE: TAX_TOTAL_PHASE = "TAX_TOTAL_PHASE".asInstanceOf[TAX_TOTAL_PHASE]
  @scala.inline
  def TC: TC = "TC".asInstanceOf[TC]
  @scala.inline
  def TD: TD = "TD".asInstanceOf[TD]
  @scala.inline
  def TERMINAL: TERMINAL = "TERMINAL".asInstanceOf[TERMINAL]
  @scala.inline
  def TF: TF = "TF".asInstanceOf[TF]
  @scala.inline
  def TG: TG = "TG".asInstanceOf[TG]
  @scala.inline
  def TH: TH = "TH".asInstanceOf[TH]
  @scala.inline
  def THB: THB = "THB".asInstanceOf[THB]
  @scala.inline
  def THIRD_PARTY: THIRD_PARTY = "THIRD_PARTY".asInstanceOf[THIRD_PARTY]
  @scala.inline
  def THIRD_PARTY_CARD: THIRD_PARTY_CARD = "THIRD_PARTY_CARD".asInstanceOf[THIRD_PARTY_CARD]
  @scala.inline
  def THIRD_PARTY_IMPORT: THIRD_PARTY_IMPORT = "THIRD_PARTY_IMPORT".asInstanceOf[THIRD_PARTY_IMPORT]
  @scala.inline
  def THU: THU = "THU".asInstanceOf[THU]
  @scala.inline
  def TJ: TJ = "TJ".asInstanceOf[TJ]
  @scala.inline
  def TJS: TJS = "TJS".asInstanceOf[TJS]
  @scala.inline
  def TK: TK = "TK".asInstanceOf[TK]
  @scala.inline
  def TL: TL = "TL".asInstanceOf[TL]
  @scala.inline
  def TM: TM = "TM".asInstanceOf[TM]
  @scala.inline
  def TMT: TMT = "TMT".asInstanceOf[TMT]
  @scala.inline
  def TN: TN = "TN".asInstanceOf[TN]
  @scala.inline
  def TND: TND = "TND".asInstanceOf[TND]
  @scala.inline
  def TO: TO = "TO".asInstanceOf[TO]
  @scala.inline
  def TOP: TOP = "TOP".asInstanceOf[TOP]
  @scala.inline
  def TR: TR = "TR".asInstanceOf[TR]
  @scala.inline
  def TRANSFER: TRANSFER = "TRANSFER".asInstanceOf[TRANSFER]
  @scala.inline
  def TRY: TRY = "TRY".asInstanceOf[TRY]
  @scala.inline
  def TT: TT = "TT".asInstanceOf[TT]
  @scala.inline
  def TTD: TTD = "TTD".asInstanceOf[TTD]
  @scala.inline
  def TUE: TUE = "TUE".asInstanceOf[TUE]
  @scala.inline
  def TV: TV = "TV".asInstanceOf[TV]
  @scala.inline
  def TW: TW = "TW".asInstanceOf[TW]
  @scala.inline
  def TWD: TWD = "TWD".asInstanceOf[TWD]
  @scala.inline
  def TZ: TZ = "TZ".asInstanceOf[TZ]
  @scala.inline
  def TZS: TZS = "TZS".asInstanceOf[TZS]
  @scala.inline
  def UA: UA = "UA".asInstanceOf[UA]
  @scala.inline
  def UAH: UAH = "UAH".asInstanceOf[UAH]
  @scala.inline
  def UG: UG = "UG".asInstanceOf[UG]
  @scala.inline
  def UGX: UGX = "UGX".asInstanceOf[UGX]
  @scala.inline
  def UM: UM = "UM".asInstanceOf[UM]
  @scala.inline
  def UNAUTHORIZED: UNAUTHORIZED = "UNAUTHORIZED".asInstanceOf[UNAUTHORIZED]
  @scala.inline
  def UNEXPECTED_VALUE: UNEXPECTED_VALUE = "UNEXPECTED_VALUE".asInstanceOf[UNEXPECTED_VALUE]
  @scala.inline
  def UNKNOWN: UNKNOWN = "UNKNOWN".asInstanceOf[UNKNOWN]
  @scala.inline
  def UNKNOWN_CURRENCY: UNKNOWN_CURRENCY = "UNKNOWN_CURRENCY".asInstanceOf[UNKNOWN_CURRENCY]
  @scala.inline
  def UNKNOWN_DISCOUNT: UNKNOWN_DISCOUNT = "UNKNOWN_DISCOUNT".asInstanceOf[UNKNOWN_DISCOUNT]
  @scala.inline
  def UNKNOWN_QUERY_PARAMETER: UNKNOWN_QUERY_PARAMETER = "UNKNOWN_QUERY_PARAMETER".asInstanceOf[UNKNOWN_QUERY_PARAMETER]
  @scala.inline
  def UNKNOWN_TAX: UNKNOWN_TAX = "UNKNOWN_TAX".asInstanceOf[UNKNOWN_TAX]
  @scala.inline
  def UNLINKED_RETURN: UNLINKED_RETURN = "UNLINKED_RETURN".asInstanceOf[UNLINKED_RETURN]
  @scala.inline
  def UNMERGE_RECOVERY: UNMERGE_RECOVERY = "UNMERGE_RECOVERY".asInstanceOf[UNMERGE_RECOVERY]
  @scala.inline
  def UNSUPPORTED_CARD_BRAND: UNSUPPORTED_CARD_BRAND = "UNSUPPORTED_CARD_BRAND".asInstanceOf[UNSUPPORTED_CARD_BRAND]
  @scala.inline
  def UNSUPPORTED_ENTRY_METHOD: UNSUPPORTED_ENTRY_METHOD = "UNSUPPORTED_ENTRY_METHOD".asInstanceOf[UNSUPPORTED_ENTRY_METHOD]
  @scala.inline
  def UNSUPPORTED_INSTRUMENT_TYPE: UNSUPPORTED_INSTRUMENT_TYPE = "UNSUPPORTED_INSTRUMENT_TYPE".asInstanceOf[UNSUPPORTED_INSTRUMENT_TYPE]
  @scala.inline
  def UNSUPPORTED_MEDIA_TYPE: UNSUPPORTED_MEDIA_TYPE = "UNSUPPORTED_MEDIA_TYPE".asInstanceOf[UNSUPPORTED_MEDIA_TYPE]
  @scala.inline
  def UPDATED_AT: UPDATED_AT = "UPDATED_AT".asInstanceOf[UPDATED_AT]
  @scala.inline
  def US: US = "US".asInstanceOf[US]
  @scala.inline
  def USD: USD = "USD".asInstanceOf[USD]
  @scala.inline
  def USN: USN = "USN".asInstanceOf[USN]
  @scala.inline
  def USS: USS = "USS".asInstanceOf[USS]
  @scala.inline
  def UY: UY = "UY".asInstanceOf[UY]
  @scala.inline
  def UYI: UYI = "UYI".asInstanceOf[UYI]
  @scala.inline
  def UYU: UYU = "UYU".asInstanceOf[UYU]
  @scala.inline
  def UZ: UZ = "UZ".asInstanceOf[UZ]
  @scala.inline
  def UZS: UZS = "UZS".asInstanceOf[UZS]
  @scala.inline
  def V1_ACCESS_TOKEN: V1_ACCESS_TOKEN = "V1_ACCESS_TOKEN".asInstanceOf[V1_ACCESS_TOKEN]
  @scala.inline
  def V1_APPLICATION: V1_APPLICATION = "V1_APPLICATION".asInstanceOf[V1_APPLICATION]
  @scala.inline
  def VA: VA = "VA".asInstanceOf[VA]
  @scala.inline
  def VALUE_EMPTY: VALUE_EMPTY = "VALUE_EMPTY".asInstanceOf[VALUE_EMPTY]
  @scala.inline
  def VALUE_REGEX_MISMATCH: VALUE_REGEX_MISMATCH = "VALUE_REGEX_MISMATCH".asInstanceOf[VALUE_REGEX_MISMATCH]
  @scala.inline
  def VALUE_TOO_HIGH: VALUE_TOO_HIGH = "VALUE_TOO_HIGH".asInstanceOf[VALUE_TOO_HIGH]
  @scala.inline
  def VALUE_TOO_LONG: VALUE_TOO_LONG = "VALUE_TOO_LONG".asInstanceOf[VALUE_TOO_LONG]
  @scala.inline
  def VALUE_TOO_LOW: VALUE_TOO_LOW = "VALUE_TOO_LOW".asInstanceOf[VALUE_TOO_LOW]
  @scala.inline
  def VALUE_TOO_SHORT: VALUE_TOO_SHORT = "VALUE_TOO_SHORT".asInstanceOf[VALUE_TOO_SHORT]
  @scala.inline
  def VARIABLE_AMOUNT: VARIABLE_AMOUNT = "VARIABLE_AMOUNT".asInstanceOf[VARIABLE_AMOUNT]
  @scala.inline
  def VARIABLE_PERCENTAGE: VARIABLE_PERCENTAGE = "VARIABLE_PERCENTAGE".asInstanceOf[VARIABLE_PERCENTAGE]
  @scala.inline
  def VARIABLE_PRICING: VARIABLE_PRICING = "VARIABLE_PRICING".asInstanceOf[VARIABLE_PRICING]
  @scala.inline
  def VC: VC = "VC".asInstanceOf[VC]
  @scala.inline
  def VE: VE = "VE".asInstanceOf[VE]
  @scala.inline
  def VEF: VEF = "VEF".asInstanceOf[VEF]
  @scala.inline
  def VERIFIED: VERIFIED = "VERIFIED".asInstanceOf[VERIFIED]
  @scala.inline
  def VERIFY_AVS_FAILURE: VERIFY_AVS_FAILURE = "VERIFY_AVS_FAILURE".asInstanceOf[VERIFY_AVS_FAILURE]
  @scala.inline
  def VERIFY_CVV_FAILURE: VERIFY_CVV_FAILURE = "VERIFY_CVV_FAILURE".asInstanceOf[VERIFY_CVV_FAILURE]
  @scala.inline
  def VG: VG = "VG".asInstanceOf[VG]
  @scala.inline
  def VI: VI = "VI".asInstanceOf[VI]
  @scala.inline
  def VISA: VISA = "VISA".asInstanceOf[VISA]
  @scala.inline
  def VN: VN = "VN".asInstanceOf[VN]
  @scala.inline
  def VND: VND = "VND".asInstanceOf[VND]
  @scala.inline
  def VOIDED: VOIDED = "VOIDED".asInstanceOf[VOIDED]
  @scala.inline
  def VU: VU = "VU".asInstanceOf[VU]
  @scala.inline
  def VUV: VUV = "VUV".asInstanceOf[VUV]
  @scala.inline
  def WASTE: WASTE = "WASTE".asInstanceOf[WASTE]
  @scala.inline
  def WED: WED = "WED".asInstanceOf[WED]
  @scala.inline
  def WF: WF = "WF".asInstanceOf[WF]
  @scala.inline
  def WS: WS = "WS".asInstanceOf[WS]
  @scala.inline
  def WST: WST = "WST".asInstanceOf[WST]
  @scala.inline
  def XAF: XAF = "XAF".asInstanceOf[XAF]
  @scala.inline
  def XAG: XAG = "XAG".asInstanceOf[XAG]
  @scala.inline
  def XAU: XAU = "XAU".asInstanceOf[XAU]
  @scala.inline
  def XBA: XBA = "XBA".asInstanceOf[XBA]
  @scala.inline
  def XBB: XBB = "XBB".asInstanceOf[XBB]
  @scala.inline
  def XBC: XBC = "XBC".asInstanceOf[XBC]
  @scala.inline
  def XBD: XBD = "XBD".asInstanceOf[XBD]
  @scala.inline
  def XCD: XCD = "XCD".asInstanceOf[XCD]
  @scala.inline
  def XDR: XDR = "XDR".asInstanceOf[XDR]
  @scala.inline
  def XOF: XOF = "XOF".asInstanceOf[XOF]
  @scala.inline
  def XPD: XPD = "XPD".asInstanceOf[XPD]
  @scala.inline
  def XPF: XPF = "XPF".asInstanceOf[XPF]
  @scala.inline
  def XPT: XPT = "XPT".asInstanceOf[XPT]
  @scala.inline
  def XTS: XTS = "XTS".asInstanceOf[XTS]
  @scala.inline
  def XXX: XXX = "XXX".asInstanceOf[XXX]
  @scala.inline
  def YE: YE = "YE".asInstanceOf[YE]
  @scala.inline
  def YER: YER = "YER".asInstanceOf[YER]
  @scala.inline
  def YT: YT = "YT".asInstanceOf[YT]
  @scala.inline
  def ZA: ZA = "ZA".asInstanceOf[ZA]
  @scala.inline
  def ZAR: ZAR = "ZAR".asInstanceOf[ZAR]
  @scala.inline
  def ZM: ZM = "ZM".asInstanceOf[ZM]
  @scala.inline
  def ZMK: ZMK = "ZMK".asInstanceOf[ZMK]
  @scala.inline
  def ZMW: ZMW = "ZMW".asInstanceOf[ZMW]
  @scala.inline
  def ZW: ZW = "ZW".asInstanceOf[ZW]
  @scala.inline
  def ZZ: ZZ = "ZZ".asInstanceOf[ZZ]
}

