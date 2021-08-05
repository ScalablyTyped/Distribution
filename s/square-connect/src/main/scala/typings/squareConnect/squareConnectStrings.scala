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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object squareConnectStrings {
  
  @js.native
  sealed trait ACCESS_TOKEN_EXPIRED
    extends StObject
       with ErrorCodeType
  inline def ACCESS_TOKEN_EXPIRED: ACCESS_TOKEN_EXPIRED = "ACCESS_TOKEN_EXPIRED".asInstanceOf[ACCESS_TOKEN_EXPIRED]
  
  @js.native
  sealed trait ACCESS_TOKEN_REVOKED
    extends StObject
       with ErrorCodeType
  inline def ACCESS_TOKEN_REVOKED: ACCESS_TOKEN_REVOKED = "ACCESS_TOKEN_REVOKED".asInstanceOf[ACCESS_TOKEN_REVOKED]
  
  @js.native
  sealed trait ACTIVE
    extends StObject
       with ActivityStatusType
  inline def ACTIVE: ACTIVE = "ACTIVE".asInstanceOf[ACTIVE]
  
  @js.native
  sealed trait AD
    extends StObject
       with CountryType
  inline def AD: AD = "AD".asInstanceOf[AD]
  
  @js.native
  sealed trait ADDITIVE
    extends StObject
       with TaxType
  inline def ADDITIVE: ADDITIVE = "ADDITIVE".asInstanceOf[ADDITIVE]
  
  @js.native
  sealed trait ADJUSTMENT
    extends StObject
       with InventoryType
  inline def ADJUSTMENT: ADJUSTMENT = "ADJUSTMENT".asInstanceOf[ADJUSTMENT]
  
  @js.native
  sealed trait AE
    extends StObject
       with CountryType
  inline def AE: AE = "AE".asInstanceOf[AE]
  
  @js.native
  sealed trait AED
    extends StObject
       with CurrencyType
  inline def AED: AED = "AED".asInstanceOf[AED]
  
  @js.native
  sealed trait AF
    extends StObject
       with CountryType
  inline def AF: AF = "AF".asInstanceOf[AF]
  
  @js.native
  sealed trait AFN
    extends StObject
       with CurrencyType
  inline def AFN: AFN = "AFN".asInstanceOf[AFN]
  
  @js.native
  sealed trait AG
    extends StObject
       with CountryType
  inline def AG: AG = "AG".asInstanceOf[AG]
  
  @js.native
  sealed trait AI
    extends StObject
       with CountryType
  inline def AI: AI = "AI".asInstanceOf[AI]
  
  @js.native
  sealed trait AL
    extends StObject
       with CountryType
  inline def AL: AL = "AL".asInstanceOf[AL]
  
  @js.native
  sealed trait ALL
    extends StObject
       with CurrencyType
  inline def ALL: ALL = "ALL".asInstanceOf[ALL]
  
  @js.native
  sealed trait AM
    extends StObject
       with CountryType
  inline def AM: AM = "AM".asInstanceOf[AM]
  
  @js.native
  sealed trait AMD
    extends StObject
       with CurrencyType
  inline def AMD: AMD = "AMD".asInstanceOf[AMD]
  
  @js.native
  sealed trait AMERICAN_EXPRESS
    extends StObject
       with CardBrandType
  inline def AMERICAN_EXPRESS: AMERICAN_EXPRESS = "AMERICAN_EXPRESS".asInstanceOf[AMERICAN_EXPRESS]
  
  @js.native
  sealed trait AMOUNT_TOO_HIGH
    extends StObject
       with ErrorCodeType
  inline def AMOUNT_TOO_HIGH: AMOUNT_TOO_HIGH = "AMOUNT_TOO_HIGH".asInstanceOf[AMOUNT_TOO_HIGH]
  
  @js.native
  sealed trait ANG
    extends StObject
       with CurrencyType
  inline def ANG: ANG = "ANG".asInstanceOf[ANG]
  
  @js.native
  sealed trait AO
    extends StObject
       with CountryType
  inline def AO: AO = "AO".asInstanceOf[AO]
  
  @js.native
  sealed trait AOA
    extends StObject
       with CurrencyType
  inline def AOA: AOA = "AOA".asInstanceOf[AOA]
  
  @js.native
  sealed trait API_ERROR
    extends StObject
       with ErrorCategoryType
  inline def API_ERROR: API_ERROR = "API_ERROR".asInstanceOf[API_ERROR]
  
  @js.native
  sealed trait API_VERSION_INCOMPATIBLE
    extends StObject
       with ErrorCodeType
  inline def API_VERSION_INCOMPATIBLE: API_VERSION_INCOMPATIBLE = "API_VERSION_INCOMPATIBLE".asInstanceOf[API_VERSION_INCOMPATIBLE]
  
  @js.native
  sealed trait APPLE_PAYMENT_PROCESSING_CERTIFICATE_HASH_NOT_FOUND
    extends StObject
       with ErrorCodeType
  inline def APPLE_PAYMENT_PROCESSING_CERTIFICATE_HASH_NOT_FOUND: APPLE_PAYMENT_PROCESSING_CERTIFICATE_HASH_NOT_FOUND = "APPLE_PAYMENT_PROCESSING_CERTIFICATE_HASH_NOT_FOUND".asInstanceOf[APPLE_PAYMENT_PROCESSING_CERTIFICATE_HASH_NOT_FOUND]
  
  @js.native
  sealed trait APPLICATION_DISABLED
    extends StObject
       with ErrorCodeType
  inline def APPLICATION_DISABLED: APPLICATION_DISABLED = "APPLICATION_DISABLED".asInstanceOf[APPLICATION_DISABLED]
  
  @js.native
  sealed trait APPOINTMENTS
    extends StObject
       with CustomerSourceType
       with ProductSourceType
  inline def APPOINTMENTS: APPOINTMENTS = "APPOINTMENTS".asInstanceOf[APPOINTMENTS]
  
  @js.native
  sealed trait APPOINTMENTS_SERVICE extends StObject
  inline def APPOINTMENTS_SERVICE: APPOINTMENTS_SERVICE = "APPOINTMENTS_SERVICE".asInstanceOf[APPOINTMENTS_SERVICE]
  
  @js.native
  sealed trait APPROVED extends StObject
  inline def APPROVED: APPROVED = "APPROVED".asInstanceOf[APPROVED]
  
  @js.native
  sealed trait AQ
    extends StObject
       with CountryType
  inline def AQ: AQ = "AQ".asInstanceOf[AQ]
  
  @js.native
  sealed trait AR
    extends StObject
       with CountryType
  inline def AR: AR = "AR".asInstanceOf[AR]
  
  @js.native
  sealed trait ARRAY_EMPTY
    extends StObject
       with ErrorCodeType
  inline def ARRAY_EMPTY: ARRAY_EMPTY = "ARRAY_EMPTY".asInstanceOf[ARRAY_EMPTY]
  
  @js.native
  sealed trait ARRAY_LENGTH_TOO_LONG
    extends StObject
       with ErrorCodeType
  inline def ARRAY_LENGTH_TOO_LONG: ARRAY_LENGTH_TOO_LONG = "ARRAY_LENGTH_TOO_LONG".asInstanceOf[ARRAY_LENGTH_TOO_LONG]
  
  @js.native
  sealed trait ARRAY_LENGTH_TOO_SHORT
    extends StObject
       with ErrorCodeType
  inline def ARRAY_LENGTH_TOO_SHORT: ARRAY_LENGTH_TOO_SHORT = "ARRAY_LENGTH_TOO_SHORT".asInstanceOf[ARRAY_LENGTH_TOO_SHORT]
  
  @js.native
  sealed trait ARS
    extends StObject
       with CurrencyType
  inline def ARS: ARS = "ARS".asInstanceOf[ARS]
  
  @js.native
  sealed trait AS
    extends StObject
       with CountryType
  inline def AS: AS = "AS".asInstanceOf[AS]
  
  @js.native
  sealed trait ASAP extends StObject
  inline def ASAP: ASAP = "ASAP".asInstanceOf[ASAP]
  
  @js.native
  sealed trait ASC
    extends StObject
       with SortOrderType
  inline def ASC: ASC = "ASC".asInstanceOf[ASC]
  
  @js.native
  sealed trait AT
    extends StObject
       with CountryType
  inline def AT: AT = "AT".asInstanceOf[AT]
  
  @js.native
  sealed trait AU
    extends StObject
       with CountryType
  inline def AU: AU = "AU".asInstanceOf[AU]
  
  @js.native
  sealed trait AUD
    extends StObject
       with CurrencyType
  inline def AUD: AUD = "AUD".asInstanceOf[AUD]
  
  @js.native
  sealed trait AUTHENTICATION_ERROR
    extends StObject
       with ErrorCategoryType
  inline def AUTHENTICATION_ERROR: AUTHENTICATION_ERROR = "AUTHENTICATION_ERROR".asInstanceOf[AUTHENTICATION_ERROR]
  
  @js.native
  sealed trait AUTHORIZED extends StObject
  inline def AUTHORIZED: AUTHORIZED = "AUTHORIZED".asInstanceOf[AUTHORIZED]
  
  @js.native
  sealed trait AW
    extends StObject
       with CountryType
  inline def AW: AW = "AW".asInstanceOf[AW]
  
  @js.native
  sealed trait AWG
    extends StObject
       with CurrencyType
  inline def AWG: AWG = "AWG".asInstanceOf[AWG]
  
  @js.native
  sealed trait AX
    extends StObject
       with CountryType
  inline def AX: AX = "AX".asInstanceOf[AX]
  
  @js.native
  sealed trait AZ
    extends StObject
       with CountryType
  inline def AZ: AZ = "AZ".asInstanceOf[AZ]
  
  @js.native
  sealed trait AZN
    extends StObject
       with CurrencyType
  inline def AZN: AZN = "AZN".asInstanceOf[AZN]
  
  @js.native
  sealed trait BA
    extends StObject
       with CountryType
  inline def BA: BA = "BA".asInstanceOf[BA]
  
  @js.native
  sealed trait BAD_CERTIFICATE
    extends StObject
       with ErrorCodeType
  inline def BAD_CERTIFICATE: BAD_CERTIFICATE = "BAD_CERTIFICATE".asInstanceOf[BAD_CERTIFICATE]
  
  @js.native
  sealed trait BAD_REQUEST
    extends StObject
       with ErrorCodeType
  inline def BAD_REQUEST: BAD_REQUEST = "BAD_REQUEST".asInstanceOf[BAD_REQUEST]
  
  @js.native
  sealed trait BAM
    extends StObject
       with CurrencyType
  inline def BAM: BAM = "BAM".asInstanceOf[BAM]
  
  @js.native
  sealed trait BB
    extends StObject
       with CountryType
  inline def BB: BB = "BB".asInstanceOf[BB]
  
  @js.native
  sealed trait BBD
    extends StObject
       with CurrencyType
  inline def BBD: BBD = "BBD".asInstanceOf[BBD]
  
  @js.native
  sealed trait BD
    extends StObject
       with CountryType
  inline def BD: BD = "BD".asInstanceOf[BD]
  
  @js.native
  sealed trait BDT
    extends StObject
       with CurrencyType
  inline def BDT: BDT = "BDT".asInstanceOf[BDT]
  
  @js.native
  sealed trait BE
    extends StObject
       with CountryType
  inline def BE: BE = "BE".asInstanceOf[BE]
  
  @js.native
  sealed trait BF
    extends StObject
       with CountryType
  inline def BF: BF = "BF".asInstanceOf[BF]
  
  @js.native
  sealed trait BG
    extends StObject
       with CountryType
  inline def BG: BG = "BG".asInstanceOf[BG]
  
  @js.native
  sealed trait BGN
    extends StObject
       with CurrencyType
  inline def BGN: BGN = "BGN".asInstanceOf[BGN]
  
  @js.native
  sealed trait BH
    extends StObject
       with CountryType
  inline def BH: BH = "BH".asInstanceOf[BH]
  
  @js.native
  sealed trait BHD
    extends StObject
       with CurrencyType
  inline def BHD: BHD = "BHD".asInstanceOf[BHD]
  
  @js.native
  sealed trait BI
    extends StObject
       with CountryType
  inline def BI: BI = "BI".asInstanceOf[BI]
  
  @js.native
  sealed trait BIF
    extends StObject
       with CurrencyType
  inline def BIF: BIF = "BIF".asInstanceOf[BIF]
  
  @js.native
  sealed trait BILLING
    extends StObject
       with ProductSourceType
  inline def BILLING: BILLING = "BILLING".asInstanceOf[BILLING]
  
  @js.native
  sealed trait BJ
    extends StObject
       with CountryType
  inline def BJ: BJ = "BJ".asInstanceOf[BJ]
  
  @js.native
  sealed trait BL
    extends StObject
       with CountryType
  inline def BL: BL = "BL".asInstanceOf[BL]
  
  @js.native
  sealed trait BM
    extends StObject
       with CountryType
  inline def BM: BM = "BM".asInstanceOf[BM]
  
  @js.native
  sealed trait BMD
    extends StObject
       with CurrencyType
  inline def BMD: BMD = "BMD".asInstanceOf[BMD]
  
  @js.native
  sealed trait BN
    extends StObject
       with CountryType
  inline def BN: BN = "BN".asInstanceOf[BN]
  
  @js.native
  sealed trait BND
    extends StObject
       with CurrencyType
  inline def BND: BND = "BND".asInstanceOf[BND]
  
  @js.native
  sealed trait BO
    extends StObject
       with CountryType
  inline def BO: BO = "BO".asInstanceOf[BO]
  
  @js.native
  sealed trait BOB
    extends StObject
       with CurrencyType
  inline def BOB: BOB = "BOB".asInstanceOf[BOB]
  
  @js.native
  sealed trait BOV
    extends StObject
       with CurrencyType
  inline def BOV: BOV = "BOV".asInstanceOf[BOV]
  
  @js.native
  sealed trait BQ
    extends StObject
       with CountryType
  inline def BQ: BQ = "BQ".asInstanceOf[BQ]
  
  @js.native
  sealed trait BR
    extends StObject
       with CountryType
  inline def BR: BR = "BR".asInstanceOf[BR]
  
  @js.native
  sealed trait BRL
    extends StObject
       with CurrencyType
  inline def BRL: BRL = "BRL".asInstanceOf[BRL]
  
  @js.native
  sealed trait BS
    extends StObject
       with CountryType
  inline def BS: BS = "BS".asInstanceOf[BS]
  
  @js.native
  sealed trait BSD
    extends StObject
       with CurrencyType
  inline def BSD: BSD = "BSD".asInstanceOf[BSD]
  
  @js.native
  sealed trait BT
    extends StObject
       with CountryType
  inline def BT: BT = "BT".asInstanceOf[BT]
  
  @js.native
  sealed trait BTC
    extends StObject
       with CurrencyType
  inline def BTC: BTC = "BTC".asInstanceOf[BTC]
  
  @js.native
  sealed trait BTN
    extends StObject
       with CurrencyType
  inline def BTN: BTN = "BTN".asInstanceOf[BTN]
  
  @js.native
  sealed trait BV
    extends StObject
       with CountryType
  inline def BV: BV = "BV".asInstanceOf[BV]
  
  @js.native
  sealed trait BW
    extends StObject
       with CountryType
  inline def BW: BW = "BW".asInstanceOf[BW]
  
  @js.native
  sealed trait BWP
    extends StObject
       with CurrencyType
  inline def BWP: BWP = "BWP".asInstanceOf[BWP]
  
  @js.native
  sealed trait BY
    extends StObject
       with CountryType
  inline def BY: BY = "BY".asInstanceOf[BY]
  
  @js.native
  sealed trait BYR
    extends StObject
       with CurrencyType
  inline def BYR: BYR = "BYR".asInstanceOf[BYR]
  
  @js.native
  sealed trait BZ
    extends StObject
       with CountryType
  inline def BZ: BZ = "BZ".asInstanceOf[BZ]
  
  @js.native
  sealed trait BZD
    extends StObject
       with CurrencyType
  inline def BZD: BZD = "BZD".asInstanceOf[BZD]
  
  @js.native
  sealed trait CA
    extends StObject
       with CountryType
  inline def CA: CA = "CA".asInstanceOf[CA]
  
  @js.native
  sealed trait CAD
    extends StObject
       with CurrencyType
  inline def CAD: CAD = "CAD".asInstanceOf[CAD]
  
  @js.native
  sealed trait CANCELED
    extends StObject
       with FulfillmentStateType
       with OrderStateType
  inline def CANCELED: CANCELED = "CANCELED".asInstanceOf[CANCELED]
  
  @js.native
  sealed trait CAPTURED extends StObject
  inline def CAPTURED: CAPTURED = "CAPTURED".asInstanceOf[CAPTURED]
  
  @js.native
  sealed trait CARD extends StObject
  inline def CARD: CARD = "CARD".asInstanceOf[CARD]
  
  @js.native
  sealed trait CARD_DECLINED
    extends StObject
       with ErrorCodeType
  inline def CARD_DECLINED: CARD_DECLINED = "CARD_DECLINED".asInstanceOf[CARD_DECLINED]
  
  @js.native
  sealed trait CARD_DECLINED_CALL_ISSUER
    extends StObject
       with ErrorCodeType
  inline def CARD_DECLINED_CALL_ISSUER: CARD_DECLINED_CALL_ISSUER = "CARD_DECLINED_CALL_ISSUER".asInstanceOf[CARD_DECLINED_CALL_ISSUER]
  
  @js.native
  sealed trait CARD_EXPIRED
    extends StObject
       with ErrorCodeType
  inline def CARD_EXPIRED: CARD_EXPIRED = "CARD_EXPIRED".asInstanceOf[CARD_EXPIRED]
  
  @js.native
  sealed trait CARD_PROCESSING_NOT_ENABLED
    extends StObject
       with ErrorCodeType
  inline def CARD_PROCESSING_NOT_ENABLED: CARD_PROCESSING_NOT_ENABLED = "CARD_PROCESSING_NOT_ENABLED".asInstanceOf[CARD_PROCESSING_NOT_ENABLED]
  
  @js.native
  sealed trait CARD_TOKEN_EXPIRED
    extends StObject
       with ErrorCodeType
  inline def CARD_TOKEN_EXPIRED: CARD_TOKEN_EXPIRED = "CARD_TOKEN_EXPIRED".asInstanceOf[CARD_TOKEN_EXPIRED]
  
  @js.native
  sealed trait CARD_TOKEN_USED
    extends StObject
       with ErrorCodeType
  inline def CARD_TOKEN_USED: CARD_TOKEN_USED = "CARD_TOKEN_USED".asInstanceOf[CARD_TOKEN_USED]
  
  @js.native
  sealed trait CASH extends StObject
  inline def CASH: CASH = "CASH".asInstanceOf[CASH]
  
  @js.native
  sealed trait CATEGORY
    extends StObject
       with ObjectType
  inline def CATEGORY: CATEGORY = "CATEGORY".asInstanceOf[CATEGORY]
  
  @js.native
  sealed trait CC
    extends StObject
       with CountryType
  inline def CC: CC = "CC".asInstanceOf[CC]
  
  @js.native
  sealed trait CD
    extends StObject
       with CountryType
  inline def CD: CD = "CD".asInstanceOf[CD]
  
  @js.native
  sealed trait CDF
    extends StObject
       with CurrencyType
  inline def CDF: CDF = "CDF".asInstanceOf[CDF]
  
  @js.native
  sealed trait CF
    extends StObject
       with CountryType
  inline def CF: CF = "CF".asInstanceOf[CF]
  
  @js.native
  sealed trait CG
    extends StObject
       with CountryType
  inline def CG: CG = "CG".asInstanceOf[CG]
  
  @js.native
  sealed trait CH
    extends StObject
       with CountryType
  inline def CH: CH = "CH".asInstanceOf[CH]
  
  @js.native
  sealed trait CHE
    extends StObject
       with CurrencyType
  inline def CHE: CHE = "CHE".asInstanceOf[CHE]
  
  @js.native
  sealed trait CHECKOUT_EXPIRED
    extends StObject
       with ErrorCodeType
  inline def CHECKOUT_EXPIRED: CHECKOUT_EXPIRED = "CHECKOUT_EXPIRED".asInstanceOf[CHECKOUT_EXPIRED]
  
  @js.native
  sealed trait CHF
    extends StObject
       with CurrencyType
  inline def CHF: CHF = "CHF".asInstanceOf[CHF]
  
  @js.native
  sealed trait CHINA_UNIONPAY
    extends StObject
       with CardBrandType
  inline def CHINA_UNIONPAY: CHINA_UNIONPAY = "CHINA_UNIONPAY".asInstanceOf[CHINA_UNIONPAY]
  
  @js.native
  sealed trait CHW
    extends StObject
       with CurrencyType
  inline def CHW: CHW = "CHW".asInstanceOf[CHW]
  
  @js.native
  sealed trait CI
    extends StObject
       with CountryType
  inline def CI: CI = "CI".asInstanceOf[CI]
  
  @js.native
  sealed trait CK
    extends StObject
       with CountryType
  inline def CK: CK = "CK".asInstanceOf[CK]
  
  @js.native
  sealed trait CL
    extends StObject
       with CountryType
  inline def CL: CL = "CL".asInstanceOf[CL]
  
  @js.native
  sealed trait CLF
    extends StObject
       with CurrencyType
  inline def CLF: CLF = "CLF".asInstanceOf[CLF]
  
  @js.native
  sealed trait CLOSED extends StObject
  inline def CLOSED: CLOSED = "CLOSED".asInstanceOf[CLOSED]
  
  @js.native
  sealed trait CLOSED_AT extends StObject
  inline def CLOSED_AT: CLOSED_AT = "CLOSED_AT".asInstanceOf[CLOSED_AT]
  
  @js.native
  sealed trait CLP
    extends StObject
       with CurrencyType
  inline def CLP: CLP = "CLP".asInstanceOf[CLP]
  
  @js.native
  sealed trait CM
    extends StObject
       with CountryType
  inline def CM: CM = "CM".asInstanceOf[CM]
  
  @js.native
  sealed trait CN
    extends StObject
       with CountryType
  inline def CN: CN = "CN".asInstanceOf[CN]
  
  @js.native
  sealed trait CNY
    extends StObject
       with CurrencyType
  inline def CNY: CNY = "CNY".asInstanceOf[CNY]
  
  @js.native
  sealed trait CO
    extends StObject
       with CountryType
  inline def CO: CO = "CO".asInstanceOf[CO]
  
  @js.native
  sealed trait COMPLETED
    extends StObject
       with FulfillmentStateType
       with OrderStateType
  inline def COMPLETED: COMPLETED = "COMPLETED".asInstanceOf[COMPLETED]
  
  @js.native
  sealed trait CONFLICT
    extends StObject
       with ErrorCodeType
  inline def CONFLICT: CONFLICT = "CONFLICT".asInstanceOf[CONFLICT]
  
  @js.native
  sealed trait CONFLICTING_PARAMETERS
    extends StObject
       with ErrorCodeType
  inline def CONFLICTING_PARAMETERS: CONFLICTING_PARAMETERS = "CONFLICTING_PARAMETERS".asInstanceOf[CONFLICTING_PARAMETERS]
  
  @js.native
  sealed trait CONTACTLESS extends StObject
  inline def CONTACTLESS: CONTACTLESS = "CONTACTLESS".asInstanceOf[CONTACTLESS]
  
  @js.native
  sealed trait COP
    extends StObject
       with CurrencyType
  inline def COP: COP = "COP".asInstanceOf[COP]
  
  @js.native
  sealed trait COU
    extends StObject
       with CurrencyType
  inline def COU: COU = "COU".asInstanceOf[COU]
  
  @js.native
  sealed trait COUPON
    extends StObject
       with CustomerSourceType
  inline def COUPON: COUPON = "COUPON".asInstanceOf[COUPON]
  
  @js.native
  sealed trait CR
    extends StObject
       with CountryType
  inline def CR: CR = "CR".asInstanceOf[CR]
  
  @js.native
  sealed trait CRC
    extends StObject
       with CurrencyType
  inline def CRC: CRC = "CRC".asInstanceOf[CRC]
  
  @js.native
  sealed trait CREATED_AT extends StObject
  inline def CREATED_AT: CREATED_AT = "CREATED_AT".asInstanceOf[CREATED_AT]
  
  @js.native
  sealed trait CU
    extends StObject
       with CountryType
  inline def CU: CU = "CU".asInstanceOf[CU]
  
  @js.native
  sealed trait CUC
    extends StObject
       with CurrencyType
  inline def CUC: CUC = "CUC".asInstanceOf[CUC]
  
  @js.native
  sealed trait CUP
    extends StObject
       with CurrencyType
  inline def CUP: CUP = "CUP".asInstanceOf[CUP]
  
  @js.native
  sealed trait CUSTOM
    extends StObject
       with InventoryStateType
  inline def CUSTOM: CUSTOM = "CUSTOM".asInstanceOf[CUSTOM]
  
  @js.native
  sealed trait CV
    extends StObject
       with CountryType
  inline def CV: CV = "CV".asInstanceOf[CV]
  
  @js.native
  sealed trait CVE
    extends StObject
       with CurrencyType
  inline def CVE: CVE = "CVE".asInstanceOf[CVE]
  
  @js.native
  sealed trait CW
    extends StObject
       with CountryType
  inline def CW: CW = "CW".asInstanceOf[CW]
  
  @js.native
  sealed trait CX
    extends StObject
       with CountryType
  inline def CX: CX = "CX".asInstanceOf[CX]
  
  @js.native
  sealed trait CY
    extends StObject
       with CountryType
  inline def CY: CY = "CY".asInstanceOf[CY]
  
  @js.native
  sealed trait CZ
    extends StObject
       with CountryType
  inline def CZ: CZ = "CZ".asInstanceOf[CZ]
  
  @js.native
  sealed trait CZK
    extends StObject
       with CurrencyType
  inline def CZK: CZK = "CZK".asInstanceOf[CZK]
  
  @js.native
  sealed trait DASHBOARD
    extends StObject
       with ProductSourceType
  inline def DASHBOARD: DASHBOARD = "DASHBOARD".asInstanceOf[DASHBOARD]
  
  @js.native
  sealed trait DE
    extends StObject
       with CountryType
  inline def DE: DE = "DE".asInstanceOf[DE]
  
  @js.native
  sealed trait DELAYED_TRANSACTION_CANCELED
    extends StObject
       with ErrorCodeType
  inline def DELAYED_TRANSACTION_CANCELED: DELAYED_TRANSACTION_CANCELED = "DELAYED_TRANSACTION_CANCELED".asInstanceOf[DELAYED_TRANSACTION_CANCELED]
  
  @js.native
  sealed trait DELAYED_TRANSACTION_CAPTURED
    extends StObject
       with ErrorCodeType
  inline def DELAYED_TRANSACTION_CAPTURED: DELAYED_TRANSACTION_CAPTURED = "DELAYED_TRANSACTION_CAPTURED".asInstanceOf[DELAYED_TRANSACTION_CAPTURED]
  
  @js.native
  sealed trait DELAYED_TRANSACTION_EXPIRED
    extends StObject
       with ErrorCodeType
  inline def DELAYED_TRANSACTION_EXPIRED: DELAYED_TRANSACTION_EXPIRED = "DELAYED_TRANSACTION_EXPIRED".asInstanceOf[DELAYED_TRANSACTION_EXPIRED]
  
  @js.native
  sealed trait DELAYED_TRANSACTION_FAILED
    extends StObject
       with ErrorCodeType
  inline def DELAYED_TRANSACTION_FAILED: DELAYED_TRANSACTION_FAILED = "DELAYED_TRANSACTION_FAILED".asInstanceOf[DELAYED_TRANSACTION_FAILED]
  
  @js.native
  sealed trait DELETION_RECOVERY
    extends StObject
       with CustomerSourceType
  inline def DELETION_RECOVERY: DELETION_RECOVERY = "DELETION_RECOVERY".asInstanceOf[DELETION_RECOVERY]
  
  @js.native
  sealed trait DEPRECATED_FIELD_SET
    extends StObject
       with ErrorCodeType
  inline def DEPRECATED_FIELD_SET: DEPRECATED_FIELD_SET = "DEPRECATED_FIELD_SET".asInstanceOf[DEPRECATED_FIELD_SET]
  
  @js.native
  sealed trait DESC
    extends StObject
       with SortOrderType
  inline def DESC: DESC = "DESC".asInstanceOf[DESC]
  
  @js.native
  sealed trait DIRECTORY
    extends StObject
       with CustomerSourceType
  inline def DIRECTORY: DIRECTORY = "DIRECTORY".asInstanceOf[DIRECTORY]
  
  @js.native
  sealed trait DISCOUNT
    extends StObject
       with ObjectType
  inline def DISCOUNT: DISCOUNT = "DISCOUNT".asInstanceOf[DISCOUNT]
  
  @js.native
  sealed trait DISCOVER
    extends StObject
       with CardBrandType
  inline def DISCOVER: DISCOVER = "DISCOVER".asInstanceOf[DISCOVER]
  
  @js.native
  sealed trait DISCOVER_DINERS
    extends StObject
       with CardBrandType
  inline def DISCOVER_DINERS: DISCOVER_DINERS = "DISCOVER_DINERS".asInstanceOf[DISCOVER_DINERS]
  
  @js.native
  sealed trait DJ
    extends StObject
       with CountryType
  inline def DJ: DJ = "DJ".asInstanceOf[DJ]
  
  @js.native
  sealed trait DJF
    extends StObject
       with CurrencyType
  inline def DJF: DJF = "DJF".asInstanceOf[DJF]
  
  @js.native
  sealed trait DK
    extends StObject
       with CountryType
  inline def DK: DK = "DK".asInstanceOf[DK]
  
  @js.native
  sealed trait DKK
    extends StObject
       with CurrencyType
  inline def DKK: DKK = "DKK".asInstanceOf[DKK]
  
  @js.native
  sealed trait DM
    extends StObject
       with CountryType
  inline def DM: DM = "DM".asInstanceOf[DM]
  
  @js.native
  sealed trait DO
    extends StObject
       with CountryType
  inline def DO: DO = "DO".asInstanceOf[DO]
  
  @js.native
  sealed trait DOP
    extends StObject
       with CurrencyType
  inline def DOP: DOP = "DOP".asInstanceOf[DOP]
  
  @js.native
  sealed trait DZ
    extends StObject
       with CountryType
  inline def DZ: DZ = "DZ".asInstanceOf[DZ]
  
  @js.native
  sealed trait DZD
    extends StObject
       with CurrencyType
  inline def DZD: DZD = "DZD".asInstanceOf[DZD]
  
  @js.native
  sealed trait EC
    extends StObject
       with CountryType
  inline def EC: EC = "EC".asInstanceOf[EC]
  
  @js.native
  sealed trait EE
    extends StObject
       with CountryType
  inline def EE: EE = "EE".asInstanceOf[EE]
  
  @js.native
  sealed trait EG
    extends StObject
       with CountryType
  inline def EG: EG = "EG".asInstanceOf[EG]
  
  @js.native
  sealed trait EGIFTING
    extends StObject
       with CustomerSourceType
  inline def EGIFTING: EGIFTING = "EGIFTING".asInstanceOf[EGIFTING]
  
  @js.native
  sealed trait EGP
    extends StObject
       with CurrencyType
  inline def EGP: EGP = "EGP".asInstanceOf[EGP]
  
  @js.native
  sealed trait EH
    extends StObject
       with CountryType
  inline def EH: EH = "EH".asInstanceOf[EH]
  
  @js.native
  sealed trait EMAIL_COLLECTION
    extends StObject
       with CustomerSourceType
  inline def EMAIL_COLLECTION: EMAIL_COLLECTION = "EMAIL_COLLECTION".asInstanceOf[EMAIL_COLLECTION]
  
  @js.native
  sealed trait EMV extends StObject
  inline def EMV: EMV = "EMV".asInstanceOf[EMV]
  
  @js.native
  sealed trait END_AT extends StObject
  inline def END_AT: END_AT = "END_AT".asInstanceOf[END_AT]
  
  @js.native
  sealed trait ER
    extends StObject
       with CountryType
  inline def ER: ER = "ER".asInstanceOf[ER]
  
  @js.native
  sealed trait ERN
    extends StObject
       with CurrencyType
  inline def ERN: ERN = "ERN".asInstanceOf[ERN]
  
  @js.native
  sealed trait ES
    extends StObject
       with CountryType
  inline def ES: ES = "ES".asInstanceOf[ES]
  
  @js.native
  sealed trait ET
    extends StObject
       with CountryType
  inline def ET: ET = "ET".asInstanceOf[ET]
  
  @js.native
  sealed trait ETB
    extends StObject
       with CurrencyType
  inline def ETB: ETB = "ETB".asInstanceOf[ETB]
  
  @js.native
  sealed trait EUR
    extends StObject
       with CurrencyType
  inline def EUR: EUR = "EUR".asInstanceOf[EUR]
  
  @js.native
  sealed trait EXCLUDE extends StObject
  inline def EXCLUDE: EXCLUDE = "EXCLUDE".asInstanceOf[EXCLUDE]
  
  @js.native
  sealed trait EXPECTED_ARRAY
    extends StObject
       with ErrorCodeType
  inline def EXPECTED_ARRAY: EXPECTED_ARRAY = "EXPECTED_ARRAY".asInstanceOf[EXPECTED_ARRAY]
  
  @js.native
  sealed trait EXPECTED_BASE64_ENCODED_BYTE_ARRAY
    extends StObject
       with ErrorCodeType
  inline def EXPECTED_BASE64_ENCODED_BYTE_ARRAY: EXPECTED_BASE64_ENCODED_BYTE_ARRAY = "EXPECTED_BASE64_ENCODED_BYTE_ARRAY".asInstanceOf[EXPECTED_BASE64_ENCODED_BYTE_ARRAY]
  
  @js.native
  sealed trait EXPECTED_BOOLEAN
    extends StObject
       with ErrorCodeType
  inline def EXPECTED_BOOLEAN: EXPECTED_BOOLEAN = "EXPECTED_BOOLEAN".asInstanceOf[EXPECTED_BOOLEAN]
  
  @js.native
  sealed trait EXPECTED_FLOAT
    extends StObject
       with ErrorCodeType
  inline def EXPECTED_FLOAT: EXPECTED_FLOAT = "EXPECTED_FLOAT".asInstanceOf[EXPECTED_FLOAT]
  
  @js.native
  sealed trait EXPECTED_INTEGER
    extends StObject
       with ErrorCodeType
  inline def EXPECTED_INTEGER: EXPECTED_INTEGER = "EXPECTED_INTEGER".asInstanceOf[EXPECTED_INTEGER]
  
  @js.native
  sealed trait EXPECTED_JSON_BODY
    extends StObject
       with ErrorCodeType
  inline def EXPECTED_JSON_BODY: EXPECTED_JSON_BODY = "EXPECTED_JSON_BODY".asInstanceOf[EXPECTED_JSON_BODY]
  
  @js.native
  sealed trait EXPECTED_MAP
    extends StObject
       with ErrorCodeType
  inline def EXPECTED_MAP: EXPECTED_MAP = "EXPECTED_MAP".asInstanceOf[EXPECTED_MAP]
  
  @js.native
  sealed trait EXPECTED_OBJECT
    extends StObject
       with ErrorCodeType
  inline def EXPECTED_OBJECT: EXPECTED_OBJECT = "EXPECTED_OBJECT".asInstanceOf[EXPECTED_OBJECT]
  
  @js.native
  sealed trait EXPECTED_STRING
    extends StObject
       with ErrorCodeType
  inline def EXPECTED_STRING: EXPECTED_STRING = "EXPECTED_STRING".asInstanceOf[EXPECTED_STRING]
  
  @js.native
  sealed trait EXTERNAL_API
    extends StObject
       with ProductSourceType
  inline def EXTERNAL_API: EXTERNAL_API = "EXTERNAL_API".asInstanceOf[EXTERNAL_API]
  
  @js.native
  sealed trait FAILED
    extends StObject
       with FulfillmentStateType
  inline def FAILED: FAILED = "FAILED".asInstanceOf[FAILED]
  
  @js.native
  sealed trait FAILURE extends StObject
  inline def FAILURE: FAILURE = "FAILURE".asInstanceOf[FAILURE]
  
  @js.native
  sealed trait FEEDBACK
    extends StObject
       with CustomerSourceType
  inline def FEEDBACK: FEEDBACK = "FEEDBACK".asInstanceOf[FEEDBACK]
  
  @js.native
  sealed trait FI
    extends StObject
       with CountryType
  inline def FI: FI = "FI".asInstanceOf[FI]
  
  @js.native
  sealed trait FIXED_AMOUNT
    extends StObject
       with DiscountType
  inline def FIXED_AMOUNT: FIXED_AMOUNT = "FIXED_AMOUNT".asInstanceOf[FIXED_AMOUNT]
  
  @js.native
  sealed trait FIXED_PERCENTAGE
    extends StObject
       with DiscountType
  inline def FIXED_PERCENTAGE: FIXED_PERCENTAGE = "FIXED_PERCENTAGE".asInstanceOf[FIXED_PERCENTAGE]
  
  @js.native
  sealed trait FIXED_PRICING
    extends StObject
       with PricingType
  inline def FIXED_PRICING: FIXED_PRICING = "FIXED_PRICING".asInstanceOf[FIXED_PRICING]
  
  @js.native
  sealed trait FJ
    extends StObject
       with CountryType
  inline def FJ: FJ = "FJ".asInstanceOf[FJ]
  
  @js.native
  sealed trait FJD
    extends StObject
       with CurrencyType
  inline def FJD: FJD = "FJD".asInstanceOf[FJD]
  
  @js.native
  sealed trait FK
    extends StObject
       with CountryType
  inline def FK: FK = "FK".asInstanceOf[FK]
  
  @js.native
  sealed trait FKP
    extends StObject
       with CurrencyType
  inline def FKP: FKP = "FKP".asInstanceOf[FKP]
  
  @js.native
  sealed trait FM
    extends StObject
       with CountryType
  inline def FM: FM = "FM".asInstanceOf[FM]
  
  @js.native
  sealed trait FO
    extends StObject
       with CountryType
  inline def FO: FO = "FO".asInstanceOf[FO]
  
  @js.native
  sealed trait FORBIDDEN
    extends StObject
       with ErrorCodeType
  inline def FORBIDDEN: FORBIDDEN = "FORBIDDEN".asInstanceOf[FORBIDDEN]
  
  @js.native
  sealed trait FR
    extends StObject
       with CountryType
  inline def FR: FR = "FR".asInstanceOf[FR]
  
  @js.native
  sealed trait FRI
    extends StObject
       with DayOfWeekType
  inline def FRI: FRI = "FRI".asInstanceOf[FRI]
  
  @js.native
  sealed trait GA
    extends StObject
       with CountryType
  inline def GA: GA = "GA".asInstanceOf[GA]
  
  @js.native
  sealed trait GATEWAY_TIMEOUT
    extends StObject
       with ErrorCodeType
  inline def GATEWAY_TIMEOUT: GATEWAY_TIMEOUT = "GATEWAY_TIMEOUT".asInstanceOf[GATEWAY_TIMEOUT]
  
  @js.native
  sealed trait GB
    extends StObject
       with CountryType
  inline def GB: GB = "GB".asInstanceOf[GB]
  
  @js.native
  sealed trait GBP
    extends StObject
       with CurrencyType
  inline def GBP: GBP = "GBP".asInstanceOf[GBP]
  
  @js.native
  sealed trait GD
    extends StObject
       with CountryType
  inline def GD: GD = "GD".asInstanceOf[GD]
  
  @js.native
  sealed trait GE
    extends StObject
       with CountryType
  inline def GE: GE = "GE".asInstanceOf[GE]
  
  @js.native
  sealed trait GEL
    extends StObject
       with CurrencyType
  inline def GEL: GEL = "GEL".asInstanceOf[GEL]
  
  @js.native
  sealed trait GENERIC_CUP
    extends StObject
       with VolumeUnitType
  inline def GENERIC_CUP: GENERIC_CUP = "GENERIC_CUP".asInstanceOf[GENERIC_CUP]
  
  @js.native
  sealed trait GENERIC_FLUID_OUNCE
    extends StObject
       with VolumeUnitType
  inline def GENERIC_FLUID_OUNCE: GENERIC_FLUID_OUNCE = "GENERIC_FLUID_OUNCE".asInstanceOf[GENERIC_FLUID_OUNCE]
  
  @js.native
  sealed trait GENERIC_GALLON
    extends StObject
       with VolumeUnitType
  inline def GENERIC_GALLON: GENERIC_GALLON = "GENERIC_GALLON".asInstanceOf[GENERIC_GALLON]
  
  @js.native
  sealed trait GENERIC_PINT
    extends StObject
       with VolumeUnitType
  inline def GENERIC_PINT: GENERIC_PINT = "GENERIC_PINT".asInstanceOf[GENERIC_PINT]
  
  @js.native
  sealed trait GENERIC_QUART
    extends StObject
       with VolumeUnitType
  inline def GENERIC_QUART: GENERIC_QUART = "GENERIC_QUART".asInstanceOf[GENERIC_QUART]
  
  @js.native
  sealed trait GENERIC_SHOT
    extends StObject
       with VolumeUnitType
  inline def GENERIC_SHOT: GENERIC_SHOT = "GENERIC_SHOT".asInstanceOf[GENERIC_SHOT]
  
  @js.native
  sealed trait GF
    extends StObject
       with CountryType
  inline def GF: GF = "GF".asInstanceOf[GF]
  
  @js.native
  sealed trait GG
    extends StObject
       with CountryType
  inline def GG: GG = "GG".asInstanceOf[GG]
  
  @js.native
  sealed trait GH
    extends StObject
       with CountryType
  inline def GH: GH = "GH".asInstanceOf[GH]
  
  @js.native
  sealed trait GHS
    extends StObject
       with CurrencyType
  inline def GHS: GHS = "GHS".asInstanceOf[GHS]
  
  @js.native
  sealed trait GI
    extends StObject
       with CountryType
  inline def GI: GI = "GI".asInstanceOf[GI]
  
  @js.native
  sealed trait GIFT_CARD extends StObject
  inline def GIFT_CARD: GIFT_CARD = "GIFT_CARD".asInstanceOf[GIFT_CARD]
  
  @js.native
  sealed trait GIP
    extends StObject
       with CurrencyType
  inline def GIP: GIP = "GIP".asInstanceOf[GIP]
  
  @js.native
  sealed trait GL
    extends StObject
       with CountryType
  inline def GL: GL = "GL".asInstanceOf[GL]
  
  @js.native
  sealed trait GM
    extends StObject
       with CountryType
  inline def GM: GM = "GM".asInstanceOf[GM]
  
  @js.native
  sealed trait GMD
    extends StObject
       with CurrencyType
  inline def GMD: GMD = "GMD".asInstanceOf[GMD]
  
  @js.native
  sealed trait GN
    extends StObject
       with CountryType
  inline def GN: GN = "GN".asInstanceOf[GN]
  
  @js.native
  sealed trait GNF
    extends StObject
       with CurrencyType
  inline def GNF: GNF = "GNF".asInstanceOf[GNF]
  
  @js.native
  sealed trait GP
    extends StObject
       with CountryType
  inline def GP: GP = "GP".asInstanceOf[GP]
  
  @js.native
  sealed trait GQ
    extends StObject
       with CountryType
  inline def GQ: GQ = "GQ".asInstanceOf[GQ]
  
  @js.native
  sealed trait GR
    extends StObject
       with CountryType
  inline def GR: GR = "GR".asInstanceOf[GR]
  
  @js.native
  sealed trait GS
    extends StObject
       with CountryType
  inline def GS: GS = "GS".asInstanceOf[GS]
  
  @js.native
  sealed trait GT
    extends StObject
       with CountryType
  inline def GT: GT = "GT".asInstanceOf[GT]
  
  @js.native
  sealed trait GTQ
    extends StObject
       with CurrencyType
  inline def GTQ: GTQ = "GTQ".asInstanceOf[GTQ]
  
  @js.native
  sealed trait GU
    extends StObject
       with CountryType
  inline def GU: GU = "GU".asInstanceOf[GU]
  
  @js.native
  sealed trait GW
    extends StObject
       with CountryType
  inline def GW: GW = "GW".asInstanceOf[GW]
  
  @js.native
  sealed trait GY
    extends StObject
       with CountryType
  inline def GY: GY = "GY".asInstanceOf[GY]
  
  @js.native
  sealed trait GYD
    extends StObject
       with CurrencyType
  inline def GYD: GYD = "GYD".asInstanceOf[GYD]
  
  @js.native
  sealed trait HK
    extends StObject
       with CountryType
  inline def HK: HK = "HK".asInstanceOf[HK]
  
  @js.native
  sealed trait HKD
    extends StObject
       with CurrencyType
  inline def HKD: HKD = "HKD".asInstanceOf[HKD]
  
  @js.native
  sealed trait HM
    extends StObject
       with CountryType
  inline def HM: HM = "HM".asInstanceOf[HM]
  
  @js.native
  sealed trait HN
    extends StObject
       with CountryType
  inline def HN: HN = "HN".asInstanceOf[HN]
  
  @js.native
  sealed trait HNL
    extends StObject
       with CurrencyType
  inline def HNL: HNL = "HNL".asInstanceOf[HNL]
  
  @js.native
  sealed trait HR
    extends StObject
       with CountryType
  inline def HR: HR = "HR".asInstanceOf[HR]
  
  @js.native
  sealed trait HRK
    extends StObject
       with CurrencyType
  inline def HRK: HRK = "HRK".asInstanceOf[HRK]
  
  @js.native
  sealed trait HT
    extends StObject
       with CountryType
  inline def HT: HT = "HT".asInstanceOf[HT]
  
  @js.native
  sealed trait HTG
    extends StObject
       with CurrencyType
  inline def HTG: HTG = "HTG".asInstanceOf[HTG]
  
  @js.native
  sealed trait HU
    extends StObject
       with CountryType
  inline def HU: HU = "HU".asInstanceOf[HU]
  
  @js.native
  sealed trait HUF
    extends StObject
       with CurrencyType
  inline def HUF: HUF = "HUF".asInstanceOf[HUF]
  
  @js.native
  sealed trait ID
    extends StObject
       with CountryType
  inline def ID: ID = "ID".asInstanceOf[ID]
  
  @js.native
  sealed trait IDEMPOTENCY_KEY_REUSED
    extends StObject
       with ErrorCodeType
  inline def IDEMPOTENCY_KEY_REUSED: IDEMPOTENCY_KEY_REUSED = "IDEMPOTENCY_KEY_REUSED".asInstanceOf[IDEMPOTENCY_KEY_REUSED]
  
  @js.native
  sealed trait IDR
    extends StObject
       with CurrencyType
  inline def IDR: IDR = "IDR".asInstanceOf[IDR]
  
  @js.native
  sealed trait IE
    extends StObject
       with CountryType
  inline def IE: IE = "IE".asInstanceOf[IE]
  
  @js.native
  sealed trait IL
    extends StObject
       with CountryType
  inline def IL: IL = "IL".asInstanceOf[IL]
  
  @js.native
  sealed trait ILS
    extends StObject
       with CurrencyType
  inline def ILS: ILS = "ILS".asInstanceOf[ILS]
  
  @js.native
  sealed trait IM
    extends StObject
       with CountryType
  inline def IM: IM = "IM".asInstanceOf[IM]
  
  @js.native
  sealed trait IMAGE
    extends StObject
       with ObjectType
  inline def IMAGE: IMAGE = "IMAGE".asInstanceOf[IMAGE]
  
  @js.native
  sealed trait IMPERIAL_ACRE
    extends StObject
       with AreaUnitType
  inline def IMPERIAL_ACRE: IMPERIAL_ACRE = "IMPERIAL_ACRE".asInstanceOf[IMPERIAL_ACRE]
  
  @js.native
  sealed trait IMPERIAL_CUBIC_FOOT
    extends StObject
       with VolumeUnitType
  inline def IMPERIAL_CUBIC_FOOT: IMPERIAL_CUBIC_FOOT = "IMPERIAL_CUBIC_FOOT".asInstanceOf[IMPERIAL_CUBIC_FOOT]
  
  @js.native
  sealed trait IMPERIAL_CUBIC_INCH
    extends StObject
       with VolumeUnitType
  inline def IMPERIAL_CUBIC_INCH: IMPERIAL_CUBIC_INCH = "IMPERIAL_CUBIC_INCH".asInstanceOf[IMPERIAL_CUBIC_INCH]
  
  @js.native
  sealed trait IMPERIAL_CUBIC_YARD
    extends StObject
       with VolumeUnitType
  inline def IMPERIAL_CUBIC_YARD: IMPERIAL_CUBIC_YARD = "IMPERIAL_CUBIC_YARD".asInstanceOf[IMPERIAL_CUBIC_YARD]
  
  @js.native
  sealed trait IMPERIAL_FOOT
    extends StObject
       with LengthUnitType
  inline def IMPERIAL_FOOT: IMPERIAL_FOOT = "IMPERIAL_FOOT".asInstanceOf[IMPERIAL_FOOT]
  
  @js.native
  sealed trait IMPERIAL_INCH
    extends StObject
       with LengthUnitType
  inline def IMPERIAL_INCH: IMPERIAL_INCH = "IMPERIAL_INCH".asInstanceOf[IMPERIAL_INCH]
  
  @js.native
  sealed trait IMPERIAL_MILE
    extends StObject
       with LengthUnitType
  inline def IMPERIAL_MILE: IMPERIAL_MILE = "IMPERIAL_MILE".asInstanceOf[IMPERIAL_MILE]
  
  @js.native
  sealed trait IMPERIAL_POUND
    extends StObject
       with WeightUnitType
  inline def IMPERIAL_POUND: IMPERIAL_POUND = "IMPERIAL_POUND".asInstanceOf[IMPERIAL_POUND]
  
  @js.native
  sealed trait IMPERIAL_SQUARE_FOOT
    extends StObject
       with AreaUnitType
  inline def IMPERIAL_SQUARE_FOOT: IMPERIAL_SQUARE_FOOT = "IMPERIAL_SQUARE_FOOT".asInstanceOf[IMPERIAL_SQUARE_FOOT]
  
  @js.native
  sealed trait IMPERIAL_SQUARE_INCH
    extends StObject
       with AreaUnitType
  inline def IMPERIAL_SQUARE_INCH: IMPERIAL_SQUARE_INCH = "IMPERIAL_SQUARE_INCH".asInstanceOf[IMPERIAL_SQUARE_INCH]
  
  @js.native
  sealed trait IMPERIAL_SQUARE_MILE
    extends StObject
       with AreaUnitType
  inline def IMPERIAL_SQUARE_MILE: IMPERIAL_SQUARE_MILE = "IMPERIAL_SQUARE_MILE".asInstanceOf[IMPERIAL_SQUARE_MILE]
  
  @js.native
  sealed trait IMPERIAL_SQUARE_YARD
    extends StObject
       with AreaUnitType
  inline def IMPERIAL_SQUARE_YARD: IMPERIAL_SQUARE_YARD = "IMPERIAL_SQUARE_YARD".asInstanceOf[IMPERIAL_SQUARE_YARD]
  
  @js.native
  sealed trait IMPERIAL_STONE
    extends StObject
       with WeightUnitType
  inline def IMPERIAL_STONE: IMPERIAL_STONE = "IMPERIAL_STONE".asInstanceOf[IMPERIAL_STONE]
  
  @js.native
  sealed trait IMPERIAL_WEIGHT_OUNCE
    extends StObject
       with WeightUnitType
  inline def IMPERIAL_WEIGHT_OUNCE: IMPERIAL_WEIGHT_OUNCE = "IMPERIAL_WEIGHT_OUNCE".asInstanceOf[IMPERIAL_WEIGHT_OUNCE]
  
  @js.native
  sealed trait IMPERIAL_YARD
    extends StObject
       with LengthUnitType
  inline def IMPERIAL_YARD: IMPERIAL_YARD = "IMPERIAL_YARD".asInstanceOf[IMPERIAL_YARD]
  
  @js.native
  sealed trait IMPORT
    extends StObject
       with CustomerSourceType
  inline def IMPORT: IMPORT = "IMPORT".asInstanceOf[IMPORT]
  
  @js.native
  sealed trait IN
    extends StObject
       with CountryType
  inline def IN: IN = "IN".asInstanceOf[IN]
  
  @js.native
  sealed trait INACTIVE
    extends StObject
       with ActivityStatusType
  inline def INACTIVE: INACTIVE = "INACTIVE".asInstanceOf[INACTIVE]
  
  @js.native
  sealed trait INCLUDE extends StObject
  inline def INCLUDE: INCLUDE = "INCLUDE".asInstanceOf[INCLUDE]
  
  @js.native
  sealed trait INCLUSIVE
    extends StObject
       with TaxType
  inline def INCLUSIVE: INCLUSIVE = "INCLUSIVE".asInstanceOf[INCLUSIVE]
  
  @js.native
  sealed trait INCORRECT_TYPE
    extends StObject
       with ErrorCodeType
  inline def INCORRECT_TYPE: INCORRECT_TYPE = "INCORRECT_TYPE".asInstanceOf[INCORRECT_TYPE]
  
  @js.native
  sealed trait INR
    extends StObject
       with CurrencyType
  inline def INR: INR = "INR".asInstanceOf[INR]
  
  @js.native
  sealed trait INSTANT_PROFILE
    extends StObject
       with CustomerSourceType
  inline def INSTANT_PROFILE: INSTANT_PROFILE = "INSTANT_PROFILE".asInstanceOf[INSTANT_PROFILE]
  
  @js.native
  sealed trait INSUFFICIENT_SCOPES
    extends StObject
       with ErrorCodeType
  inline def INSUFFICIENT_SCOPES: INSUFFICIENT_SCOPES = "INSUFFICIENT_SCOPES".asInstanceOf[INSUFFICIENT_SCOPES]
  
  @js.native
  sealed trait INTERNAL_SERVER_ERROR
    extends StObject
       with ErrorCodeType
  inline def INTERNAL_SERVER_ERROR: INTERNAL_SERVER_ERROR = "INTERNAL_SERVER_ERROR".asInstanceOf[INTERNAL_SERVER_ERROR]
  
  @js.native
  sealed trait INTERSECTION extends StObject
  inline def INTERSECTION: INTERSECTION = "INTERSECTION".asInstanceOf[INTERSECTION]
  
  @js.native
  sealed trait INVALID_ARRAY_VALUE
    extends StObject
       with ErrorCodeType
  inline def INVALID_ARRAY_VALUE: INVALID_ARRAY_VALUE = "INVALID_ARRAY_VALUE".asInstanceOf[INVALID_ARRAY_VALUE]
  
  @js.native
  sealed trait INVALID_CARD
    extends StObject
       with ErrorCodeType
  inline def INVALID_CARD: INVALID_CARD = "INVALID_CARD".asInstanceOf[INVALID_CARD]
  
  @js.native
  sealed trait INVALID_CARD_DATA
    extends StObject
       with ErrorCodeType
  inline def INVALID_CARD_DATA: INVALID_CARD_DATA = "INVALID_CARD_DATA".asInstanceOf[INVALID_CARD_DATA]
  
  @js.native
  sealed trait INVALID_CONTENT_TYPE
    extends StObject
       with ErrorCodeType
  inline def INVALID_CONTENT_TYPE: INVALID_CONTENT_TYPE = "INVALID_CONTENT_TYPE".asInstanceOf[INVALID_CONTENT_TYPE]
  
  @js.native
  sealed trait INVALID_CURSOR
    extends StObject
       with ErrorCodeType
  inline def INVALID_CURSOR: INVALID_CURSOR = "INVALID_CURSOR".asInstanceOf[INVALID_CURSOR]
  
  @js.native
  sealed trait INVALID_EMAIL_ADDRESS
    extends StObject
       with ErrorCodeType
  inline def INVALID_EMAIL_ADDRESS: INVALID_EMAIL_ADDRESS = "INVALID_EMAIL_ADDRESS".asInstanceOf[INVALID_EMAIL_ADDRESS]
  
  @js.native
  sealed trait INVALID_ENCRYPTED_CARD
    extends StObject
       with ErrorCodeType
  inline def INVALID_ENCRYPTED_CARD: INVALID_ENCRYPTED_CARD = "INVALID_ENCRYPTED_CARD".asInstanceOf[INVALID_ENCRYPTED_CARD]
  
  @js.native
  sealed trait INVALID_ENUM_VALUE
    extends StObject
       with ErrorCodeType
  inline def INVALID_ENUM_VALUE: INVALID_ENUM_VALUE = "INVALID_ENUM_VALUE".asInstanceOf[INVALID_ENUM_VALUE]
  
  @js.native
  sealed trait INVALID_EXPIRATION
    extends StObject
       with ErrorCodeType
  inline def INVALID_EXPIRATION: INVALID_EXPIRATION = "INVALID_EXPIRATION".asInstanceOf[INVALID_EXPIRATION]
  
  @js.native
  sealed trait INVALID_EXPIRATION_DATE
    extends StObject
       with ErrorCodeType
  inline def INVALID_EXPIRATION_DATE: INVALID_EXPIRATION_DATE = "INVALID_EXPIRATION_DATE".asInstanceOf[INVALID_EXPIRATION_DATE]
  
  @js.native
  sealed trait INVALID_EXPIRATION_YEAR
    extends StObject
       with ErrorCodeType
  inline def INVALID_EXPIRATION_YEAR: INVALID_EXPIRATION_YEAR = "INVALID_EXPIRATION_YEAR".asInstanceOf[INVALID_EXPIRATION_YEAR]
  
  @js.native
  sealed trait INVALID_FORM_VALUE
    extends StObject
       with ErrorCodeType
  inline def INVALID_FORM_VALUE: INVALID_FORM_VALUE = "INVALID_FORM_VALUE".asInstanceOf[INVALID_FORM_VALUE]
  
  @js.native
  sealed trait INVALID_PHONE_NUMBER
    extends StObject
       with ErrorCodeType
  inline def INVALID_PHONE_NUMBER: INVALID_PHONE_NUMBER = "INVALID_PHONE_NUMBER".asInstanceOf[INVALID_PHONE_NUMBER]
  
  @js.native
  sealed trait INVALID_REQUEST_ERROR
    extends StObject
       with ErrorCategoryType
  inline def INVALID_REQUEST_ERROR: INVALID_REQUEST_ERROR = "INVALID_REQUEST_ERROR".asInstanceOf[INVALID_REQUEST_ERROR]
  
  @js.native
  sealed trait INVALID_SORT_ORDER
    extends StObject
       with ErrorCodeType
  inline def INVALID_SORT_ORDER: INVALID_SORT_ORDER = "INVALID_SORT_ORDER".asInstanceOf[INVALID_SORT_ORDER]
  
  @js.native
  sealed trait INVALID_SQUARE_VERSION_FORMAT
    extends StObject
       with ErrorCodeType
  inline def INVALID_SQUARE_VERSION_FORMAT: INVALID_SQUARE_VERSION_FORMAT = "INVALID_SQUARE_VERSION_FORMAT".asInstanceOf[INVALID_SQUARE_VERSION_FORMAT]
  
  @js.native
  sealed trait INVALID_TIME
    extends StObject
       with ErrorCodeType
  inline def INVALID_TIME: INVALID_TIME = "INVALID_TIME".asInstanceOf[INVALID_TIME]
  
  @js.native
  sealed trait INVALID_TIME_RANGE
    extends StObject
       with ErrorCodeType
  inline def INVALID_TIME_RANGE: INVALID_TIME_RANGE = "INVALID_TIME_RANGE".asInstanceOf[INVALID_TIME_RANGE]
  
  @js.native
  sealed trait INVALID_VALUE
    extends StObject
       with ErrorCodeType
  inline def INVALID_VALUE: INVALID_VALUE = "INVALID_VALUE".asInstanceOf[INVALID_VALUE]
  
  @js.native
  sealed trait INVOICES
    extends StObject
       with CustomerSourceType
       with ProductSourceType
  inline def INVOICES: INVOICES = "INVOICES".asInstanceOf[INVOICES]
  
  @js.native
  sealed trait IN_STOCK
    extends StObject
       with InventoryStateType
  inline def IN_STOCK: IN_STOCK = "IN_STOCK".asInstanceOf[IN_STOCK]
  
  @js.native
  sealed trait IN_TRANSIT_TO
    extends StObject
       with InventoryStateType
  inline def IN_TRANSIT_TO: IN_TRANSIT_TO = "IN_TRANSIT_TO".asInstanceOf[IN_TRANSIT_TO]
  
  @js.native
  sealed trait IO
    extends StObject
       with CountryType
  inline def IO: IO = "IO".asInstanceOf[IO]
  
  @js.native
  sealed trait IQ
    extends StObject
       with CountryType
  inline def IQ: IQ = "IQ".asInstanceOf[IQ]
  
  @js.native
  sealed trait IQD
    extends StObject
       with CurrencyType
  inline def IQD: IQD = "IQD".asInstanceOf[IQD]
  
  @js.native
  sealed trait IR
    extends StObject
       with CountryType
  inline def IR: IR = "IR".asInstanceOf[IR]
  
  @js.native
  sealed trait IRR
    extends StObject
       with CurrencyType
  inline def IRR: IRR = "IRR".asInstanceOf[IRR]
  
  @js.native
  sealed trait IS
    extends StObject
       with CountryType
  inline def IS: IS = "IS".asInstanceOf[IS]
  
  @js.native
  sealed trait ISK
    extends StObject
       with CurrencyType
  inline def ISK: ISK = "ISK".asInstanceOf[ISK]
  
  @js.native
  sealed trait IT
    extends StObject
       with CountryType
  inline def IT: IT = "IT".asInstanceOf[IT]
  
  @js.native
  sealed trait ITEM
    extends StObject
       with ObjectType
  inline def ITEM: ITEM = "ITEM".asInstanceOf[ITEM]
  
  @js.native
  sealed trait ITEM_LIBRARY_IMPORT
    extends StObject
       with ProductSourceType
  inline def ITEM_LIBRARY_IMPORT: ITEM_LIBRARY_IMPORT = "ITEM_LIBRARY_IMPORT".asInstanceOf[ITEM_LIBRARY_IMPORT]
  
  @js.native
  sealed trait ITEM_VARIATION
    extends StObject
       with ObjectType
  inline def ITEM_VARIATION: ITEM_VARIATION = "ITEM_VARIATION".asInstanceOf[ITEM_VARIATION]
  
  @js.native
  sealed trait JCB
    extends StObject
       with CardBrandType
  inline def JCB: JCB = "JCB".asInstanceOf[JCB]
  
  @js.native
  sealed trait JE
    extends StObject
       with CountryType
  inline def JE: JE = "JE".asInstanceOf[JE]
  
  @js.native
  sealed trait JM
    extends StObject
       with CountryType
  inline def JM: JM = "JM".asInstanceOf[JM]
  
  @js.native
  sealed trait JMD
    extends StObject
       with CurrencyType
  inline def JMD: JMD = "JMD".asInstanceOf[JMD]
  
  @js.native
  sealed trait JO
    extends StObject
       with CountryType
  inline def JO: JO = "JO".asInstanceOf[JO]
  
  @js.native
  sealed trait JOD
    extends StObject
       with CurrencyType
  inline def JOD: JOD = "JOD".asInstanceOf[JOD]
  
  @js.native
  sealed trait JP
    extends StObject
       with CountryType
  inline def JP: JP = "JP".asInstanceOf[JP]
  
  @js.native
  sealed trait JPY
    extends StObject
       with CurrencyType
  inline def JPY: JPY = "JPY".asInstanceOf[JPY]
  
  @js.native
  sealed trait KE
    extends StObject
       with CountryType
  inline def KE: KE = "KE".asInstanceOf[KE]
  
  @js.native
  sealed trait KES
    extends StObject
       with CurrencyType
  inline def KES: KES = "KES".asInstanceOf[KES]
  
  @js.native
  sealed trait KEYED extends StObject
  inline def KEYED: KEYED = "KEYED".asInstanceOf[KEYED]
  
  @js.native
  sealed trait KG
    extends StObject
       with CountryType
  inline def KG: KG = "KG".asInstanceOf[KG]
  
  @js.native
  sealed trait KGS
    extends StObject
       with CurrencyType
  inline def KGS: KGS = "KGS".asInstanceOf[KGS]
  
  @js.native
  sealed trait KH
    extends StObject
       with CountryType
  inline def KH: KH = "KH".asInstanceOf[KH]
  
  @js.native
  sealed trait KHR
    extends StObject
       with CurrencyType
  inline def KHR: KHR = "KHR".asInstanceOf[KHR]
  
  @js.native
  sealed trait KI
    extends StObject
       with CountryType
  inline def KI: KI = "KI".asInstanceOf[KI]
  
  @js.native
  sealed trait KM
    extends StObject
       with CountryType
  inline def KM: KM = "KM".asInstanceOf[KM]
  
  @js.native
  sealed trait KMF
    extends StObject
       with CurrencyType
  inline def KMF: KMF = "KMF".asInstanceOf[KMF]
  
  @js.native
  sealed trait KN
    extends StObject
       with CountryType
  inline def KN: KN = "KN".asInstanceOf[KN]
  
  @js.native
  sealed trait KP
    extends StObject
       with CountryType
  inline def KP: KP = "KP".asInstanceOf[KP]
  
  @js.native
  sealed trait KPW
    extends StObject
       with CurrencyType
  inline def KPW: KPW = "KPW".asInstanceOf[KPW]
  
  @js.native
  sealed trait KR
    extends StObject
       with CountryType
  inline def KR: KR = "KR".asInstanceOf[KR]
  
  @js.native
  sealed trait KRW
    extends StObject
       with CurrencyType
  inline def KRW: KRW = "KRW".asInstanceOf[KRW]
  
  @js.native
  sealed trait KW
    extends StObject
       with CountryType
  inline def KW: KW = "KW".asInstanceOf[KW]
  
  @js.native
  sealed trait KWD
    extends StObject
       with CurrencyType
  inline def KWD: KWD = "KWD".asInstanceOf[KWD]
  
  @js.native
  sealed trait KY
    extends StObject
       with CountryType
  inline def KY: KY = "KY".asInstanceOf[KY]
  
  @js.native
  sealed trait KYD
    extends StObject
       with CurrencyType
  inline def KYD: KYD = "KYD".asInstanceOf[KYD]
  
  @js.native
  sealed trait KZ
    extends StObject
       with CountryType
  inline def KZ: KZ = "KZ".asInstanceOf[KZ]
  
  @js.native
  sealed trait KZT
    extends StObject
       with CurrencyType
  inline def KZT: KZT = "KZT".asInstanceOf[KZT]
  
  @js.native
  sealed trait LA
    extends StObject
       with CountryType
  inline def LA: LA = "LA".asInstanceOf[LA]
  
  @js.native
  sealed trait LAK
    extends StObject
       with CurrencyType
  inline def LAK: LAK = "LAK".asInstanceOf[LAK]
  
  @js.native
  sealed trait LB
    extends StObject
       with CountryType
  inline def LB: LB = "LB".asInstanceOf[LB]
  
  @js.native
  sealed trait LBP
    extends StObject
       with CurrencyType
  inline def LBP: LBP = "LBP".asInstanceOf[LBP]
  
  @js.native
  sealed trait LC
    extends StObject
       with CountryType
  inline def LC: LC = "LC".asInstanceOf[LC]
  
  @js.native
  sealed trait LI
    extends StObject
       with CountryType
  inline def LI: LI = "LI".asInstanceOf[LI]
  
  @js.native
  sealed trait LINE_ITEM
    extends StObject
       with DiscountApplicationScopeType
       with TaxApplicationScopeType
  inline def LINE_ITEM: LINE_ITEM = "LINE_ITEM".asInstanceOf[LINE_ITEM]
  
  @js.native
  sealed trait LK
    extends StObject
       with CountryType
  inline def LK: LK = "LK".asInstanceOf[LK]
  
  @js.native
  sealed trait LKR
    extends StObject
       with CurrencyType
  inline def LKR: LKR = "LKR".asInstanceOf[LKR]
  
  @js.native
  sealed trait LOCATION_MISMATCH
    extends StObject
       with ErrorCodeType
  inline def LOCATION_MISMATCH: LOCATION_MISMATCH = "LOCATION_MISMATCH".asInstanceOf[LOCATION_MISMATCH]
  
  @js.native
  sealed trait LOW_QUANTITY extends StObject
  inline def LOW_QUANTITY: LOW_QUANTITY = "LOW_QUANTITY".asInstanceOf[LOW_QUANTITY]
  
  @js.native
  sealed trait LOYALTY
    extends StObject
       with CustomerSourceType
  inline def LOYALTY: LOYALTY = "LOYALTY".asInstanceOf[LOYALTY]
  
  @js.native
  sealed trait LR
    extends StObject
       with CountryType
  inline def LR: LR = "LR".asInstanceOf[LR]
  
  @js.native
  sealed trait LRD
    extends StObject
       with CurrencyType
  inline def LRD: LRD = "LRD".asInstanceOf[LRD]
  
  @js.native
  sealed trait LS
    extends StObject
       with CountryType
  inline def LS: LS = "LS".asInstanceOf[LS]
  
  @js.native
  sealed trait LSL
    extends StObject
       with CurrencyType
  inline def LSL: LSL = "LSL".asInstanceOf[LSL]
  
  @js.native
  sealed trait LT
    extends StObject
       with CountryType
  inline def LT: LT = "LT".asInstanceOf[LT]
  
  @js.native
  sealed trait LTL
    extends StObject
       with CurrencyType
  inline def LTL: LTL = "LTL".asInstanceOf[LTL]
  
  @js.native
  sealed trait LU
    extends StObject
       with CountryType
  inline def LU: LU = "LU".asInstanceOf[LU]
  
  @js.native
  sealed trait LV
    extends StObject
       with CountryType
  inline def LV: LV = "LV".asInstanceOf[LV]
  
  @js.native
  sealed trait LVL
    extends StObject
       with CurrencyType
  inline def LVL: LVL = "LVL".asInstanceOf[LVL]
  
  @js.native
  sealed trait LY
    extends StObject
       with CountryType
  inline def LY: LY = "LY".asInstanceOf[LY]
  
  @js.native
  sealed trait LYD
    extends StObject
       with CurrencyType
  inline def LYD: LYD = "LYD".asInstanceOf[LYD]
  
  @js.native
  sealed trait MA
    extends StObject
       with CountryType
  inline def MA: MA = "MA".asInstanceOf[MA]
  
  @js.native
  sealed trait MAD
    extends StObject
       with CurrencyType
  inline def MAD: MAD = "MAD".asInstanceOf[MAD]
  
  @js.native
  sealed trait MARKETING
    extends StObject
       with CustomerSourceType
  inline def MARKETING: MARKETING = "MARKETING".asInstanceOf[MARKETING]
  
  @js.native
  sealed trait MASTERCARD
    extends StObject
       with CardBrandType
  inline def MASTERCARD: MASTERCARD = "MASTERCARD".asInstanceOf[MASTERCARD]
  
  @js.native
  sealed trait MC
    extends StObject
       with CountryType
  inline def MC: MC = "MC".asInstanceOf[MC]
  
  @js.native
  sealed trait MD
    extends StObject
       with CountryType
  inline def MD: MD = "MD".asInstanceOf[MD]
  
  @js.native
  sealed trait MDL
    extends StObject
       with CurrencyType
  inline def MDL: MDL = "MDL".asInstanceOf[MDL]
  
  @js.native
  sealed trait ME
    extends StObject
       with CountryType
  inline def ME: ME = "ME".asInstanceOf[ME]
  
  @js.native
  sealed trait MERGE
    extends StObject
       with CustomerSourceType
  inline def MERGE: MERGE = "MERGE".asInstanceOf[MERGE]
  
  @js.native
  sealed trait METHOD_NOT_ALLOWED
    extends StObject
       with ErrorCodeType
  inline def METHOD_NOT_ALLOWED: METHOD_NOT_ALLOWED = "METHOD_NOT_ALLOWED".asInstanceOf[METHOD_NOT_ALLOWED]
  
  @js.native
  sealed trait METRIC_CENTIMETER
    extends StObject
       with LengthUnitType
  inline def METRIC_CENTIMETER: METRIC_CENTIMETER = "METRIC_CENTIMETER".asInstanceOf[METRIC_CENTIMETER]
  
  @js.native
  sealed trait METRIC_GRAM
    extends StObject
       with WeightUnitType
  inline def METRIC_GRAM: METRIC_GRAM = "METRIC_GRAM".asInstanceOf[METRIC_GRAM]
  
  @js.native
  sealed trait METRIC_KILOGRAM
    extends StObject
       with WeightUnitType
  inline def METRIC_KILOGRAM: METRIC_KILOGRAM = "METRIC_KILOGRAM".asInstanceOf[METRIC_KILOGRAM]
  
  @js.native
  sealed trait METRIC_KILOMETER
    extends StObject
       with LengthUnitType
  inline def METRIC_KILOMETER: METRIC_KILOMETER = "METRIC_KILOMETER".asInstanceOf[METRIC_KILOMETER]
  
  @js.native
  sealed trait METRIC_LITER
    extends StObject
       with VolumeUnitType
  inline def METRIC_LITER: METRIC_LITER = "METRIC_LITER".asInstanceOf[METRIC_LITER]
  
  @js.native
  sealed trait METRIC_METER
    extends StObject
       with LengthUnitType
  inline def METRIC_METER: METRIC_METER = "METRIC_METER".asInstanceOf[METRIC_METER]
  
  @js.native
  sealed trait METRIC_MILLIGRAM
    extends StObject
       with WeightUnitType
  inline def METRIC_MILLIGRAM: METRIC_MILLIGRAM = "METRIC_MILLIGRAM".asInstanceOf[METRIC_MILLIGRAM]
  
  @js.native
  sealed trait METRIC_MILLILITER
    extends StObject
       with VolumeUnitType
  inline def METRIC_MILLILITER: METRIC_MILLILITER = "METRIC_MILLILITER".asInstanceOf[METRIC_MILLILITER]
  
  @js.native
  sealed trait METRIC_MILLIMETER
    extends StObject
       with LengthUnitType
  inline def METRIC_MILLIMETER: METRIC_MILLIMETER = "METRIC_MILLIMETER".asInstanceOf[METRIC_MILLIMETER]
  
  @js.native
  sealed trait METRIC_SQUARE_CENTIMETER
    extends StObject
       with AreaUnitType
  inline def METRIC_SQUARE_CENTIMETER: METRIC_SQUARE_CENTIMETER = "METRIC_SQUARE_CENTIMETER".asInstanceOf[METRIC_SQUARE_CENTIMETER]
  
  @js.native
  sealed trait METRIC_SQUARE_KILOMETER
    extends StObject
       with AreaUnitType
  inline def METRIC_SQUARE_KILOMETER: METRIC_SQUARE_KILOMETER = "METRIC_SQUARE_KILOMETER".asInstanceOf[METRIC_SQUARE_KILOMETER]
  
  @js.native
  sealed trait METRIC_SQUARE_METER
    extends StObject
       with AreaUnitType
  inline def METRIC_SQUARE_METER: METRIC_SQUARE_METER = "METRIC_SQUARE_METER".asInstanceOf[METRIC_SQUARE_METER]
  
  @js.native
  sealed trait MF
    extends StObject
       with CountryType
  inline def MF: MF = "MF".asInstanceOf[MF]
  
  @js.native
  sealed trait MG
    extends StObject
       with CountryType
  inline def MG: MG = "MG".asInstanceOf[MG]
  
  @js.native
  sealed trait MGA
    extends StObject
       with CurrencyType
  inline def MGA: MGA = "MGA".asInstanceOf[MGA]
  
  @js.native
  sealed trait MH
    extends StObject
       with CountryType
  inline def MH: MH = "MH".asInstanceOf[MH]
  
  @js.native
  sealed trait MISSING_REQUIRED_PARAMETER
    extends StObject
       with ErrorCodeType
  inline def MISSING_REQUIRED_PARAMETER: MISSING_REQUIRED_PARAMETER = "MISSING_REQUIRED_PARAMETER".asInstanceOf[MISSING_REQUIRED_PARAMETER]
  
  @js.native
  sealed trait MK
    extends StObject
       with CountryType
  inline def MK: MK = "MK".asInstanceOf[MK]
  
  @js.native
  sealed trait MKD
    extends StObject
       with CurrencyType
  inline def MKD: MKD = "MKD".asInstanceOf[MKD]
  
  @js.native
  sealed trait ML
    extends StObject
       with CountryType
  inline def ML: ML = "ML".asInstanceOf[ML]
  
  @js.native
  sealed trait MM
    extends StObject
       with CountryType
  inline def MM: MM = "MM".asInstanceOf[MM]
  
  @js.native
  sealed trait MMK
    extends StObject
       with CurrencyType
  inline def MMK: MMK = "MMK".asInstanceOf[MMK]
  
  @js.native
  sealed trait MN
    extends StObject
       with CountryType
  inline def MN: MN = "MN".asInstanceOf[MN]
  
  @js.native
  sealed trait MNT
    extends StObject
       with CurrencyType
  inline def MNT: MNT = "MNT".asInstanceOf[MNT]
  
  @js.native
  sealed trait MO
    extends StObject
       with CountryType
  inline def MO: MO = "MO".asInstanceOf[MO]
  
  @js.native
  sealed trait MOBILE extends StObject
  inline def MOBILE: MOBILE = "MOBILE".asInstanceOf[MOBILE]
  
  @js.native
  sealed trait MODIFIER
    extends StObject
       with ObjectType
  inline def MODIFIER: MODIFIER = "MODIFIER".asInstanceOf[MODIFIER]
  
  @js.native
  sealed trait MODIFIER_LIST
    extends StObject
       with ObjectType
  inline def MODIFIER_LIST: MODIFIER_LIST = "MODIFIER_LIST".asInstanceOf[MODIFIER_LIST]
  
  @js.native
  sealed trait MON
    extends StObject
       with DayOfWeekType
  inline def MON: MON = "MON".asInstanceOf[MON]
  
  @js.native
  sealed trait MOP
    extends StObject
       with CurrencyType
  inline def MOP: MOP = "MOP".asInstanceOf[MOP]
  
  @js.native
  sealed trait MP
    extends StObject
       with CountryType
  inline def MP: MP = "MP".asInstanceOf[MP]
  
  @js.native
  sealed trait MQ
    extends StObject
       with CountryType
  inline def MQ: MQ = "MQ".asInstanceOf[MQ]
  
  @js.native
  sealed trait MR
    extends StObject
       with CountryType
  inline def MR: MR = "MR".asInstanceOf[MR]
  
  @js.native
  sealed trait MRO
    extends StObject
       with CurrencyType
  inline def MRO: MRO = "MRO".asInstanceOf[MRO]
  
  @js.native
  sealed trait MS
    extends StObject
       with CountryType
  inline def MS: MS = "MS".asInstanceOf[MS]
  
  @js.native
  sealed trait MT
    extends StObject
       with CountryType
  inline def MT: MT = "MT".asInstanceOf[MT]
  
  @js.native
  sealed trait MU
    extends StObject
       with CountryType
  inline def MU: MU = "MU".asInstanceOf[MU]
  
  @js.native
  sealed trait MUR
    extends StObject
       with CurrencyType
  inline def MUR: MUR = "MUR".asInstanceOf[MUR]
  
  @js.native
  sealed trait MV
    extends StObject
       with CountryType
  inline def MV: MV = "MV".asInstanceOf[MV]
  
  @js.native
  sealed trait MVR
    extends StObject
       with CurrencyType
  inline def MVR: MVR = "MVR".asInstanceOf[MVR]
  
  @js.native
  sealed trait MW
    extends StObject
       with CountryType
  inline def MW: MW = "MW".asInstanceOf[MW]
  
  @js.native
  sealed trait MWK
    extends StObject
       with CurrencyType
  inline def MWK: MWK = "MWK".asInstanceOf[MWK]
  
  @js.native
  sealed trait MX
    extends StObject
       with CountryType
  inline def MX: MX = "MX".asInstanceOf[MX]
  
  @js.native
  sealed trait MXN
    extends StObject
       with CurrencyType
  inline def MXN: MXN = "MXN".asInstanceOf[MXN]
  
  @js.native
  sealed trait MXV
    extends StObject
       with CurrencyType
  inline def MXV: MXV = "MXV".asInstanceOf[MXV]
  
  @js.native
  sealed trait MY
    extends StObject
       with CountryType
  inline def MY: MY = "MY".asInstanceOf[MY]
  
  @js.native
  sealed trait MYR
    extends StObject
       with CurrencyType
  inline def MYR: MYR = "MYR".asInstanceOf[MYR]
  
  @js.native
  sealed trait MZ
    extends StObject
       with CountryType
  inline def MZ: MZ = "MZ".asInstanceOf[MZ]
  
  @js.native
  sealed trait MZN
    extends StObject
       with CurrencyType
  inline def MZN: MZN = "MZN".asInstanceOf[MZN]
  
  @js.native
  sealed trait NA
    extends StObject
       with CountryType
  inline def NA: NA = "NA".asInstanceOf[NA]
  
  @js.native
  sealed trait NAD
    extends StObject
       with CurrencyType
  inline def NAD: NAD = "NAD".asInstanceOf[NAD]
  
  @js.native
  sealed trait NC
    extends StObject
       with CountryType
  inline def NC: NC = "NC".asInstanceOf[NC]
  
  @js.native
  sealed trait NE
    extends StObject
       with CountryType
  inline def NE: NE = "NE".asInstanceOf[NE]
  
  @js.native
  sealed trait NF
    extends StObject
       with CountryType
  inline def NF: NF = "NF".asInstanceOf[NF]
  
  @js.native
  sealed trait NG
    extends StObject
       with CountryType
  inline def NG: NG = "NG".asInstanceOf[NG]
  
  @js.native
  sealed trait NGN
    extends StObject
       with CurrencyType
  inline def NGN: NGN = "NGN".asInstanceOf[NGN]
  
  @js.native
  sealed trait NI
    extends StObject
       with CountryType
  inline def NI: NI = "NI".asInstanceOf[NI]
  
  @js.native
  sealed trait NIO
    extends StObject
       with CurrencyType
  inline def NIO: NIO = "NIO".asInstanceOf[NIO]
  
  @js.native
  sealed trait NL
    extends StObject
       with CountryType
  inline def NL: NL = "NL".asInstanceOf[NL]
  
  @js.native
  sealed trait NO
    extends StObject
       with CountryType
  inline def NO: NO = "NO".asInstanceOf[NO]
  
  @js.native
  sealed trait NOK
    extends StObject
       with CurrencyType
  inline def NOK: NOK = "NOK".asInstanceOf[NOK]
  
  @js.native
  sealed trait NONE
    extends StObject
       with InventoryStateType
  inline def NONE: NONE = "NONE".asInstanceOf[NONE]
  
  @js.native
  sealed trait NOT_ACCEPTABLE
    extends StObject
       with ErrorCodeType
  inline def NOT_ACCEPTABLE: NOT_ACCEPTABLE = "NOT_ACCEPTABLE".asInstanceOf[NOT_ACCEPTABLE]
  
  @js.native
  sealed trait NOT_FOUND
    extends StObject
       with ErrorCodeType
  inline def NOT_FOUND: NOT_FOUND = "NOT_FOUND".asInstanceOf[NOT_FOUND]
  
  @js.native
  sealed trait NOT_IMPLEMENTED
    extends StObject
       with ErrorCodeType
  inline def NOT_IMPLEMENTED: NOT_IMPLEMENTED = "NOT_IMPLEMENTED".asInstanceOf[NOT_IMPLEMENTED]
  
  @js.native
  sealed trait NO_FIELDS_SET
    extends StObject
       with ErrorCodeType
  inline def NO_FIELDS_SET: NO_FIELDS_SET = "NO_FIELDS_SET".asInstanceOf[NO_FIELDS_SET]
  
  @js.native
  sealed trait NO_SALE extends StObject
  inline def NO_SALE: NO_SALE = "NO_SALE".asInstanceOf[NO_SALE]
  
  @js.native
  sealed trait NP
    extends StObject
       with CountryType
  inline def NP: NP = "NP".asInstanceOf[NP]
  
  @js.native
  sealed trait NPR
    extends StObject
       with CurrencyType
  inline def NPR: NPR = "NPR".asInstanceOf[NPR]
  
  @js.native
  sealed trait NR
    extends StObject
       with CountryType
  inline def NR: NR = "NR".asInstanceOf[NR]
  
  @js.native
  sealed trait NU
    extends StObject
       with CountryType
  inline def NU: NU = "NU".asInstanceOf[NU]
  
  @js.native
  sealed trait NZ
    extends StObject
       with CountryType
  inline def NZ: NZ = "NZ".asInstanceOf[NZ]
  
  @js.native
  sealed trait NZD
    extends StObject
       with CurrencyType
  inline def NZD: NZD = "NZD".asInstanceOf[NZD]
  
  @js.native
  sealed trait OM
    extends StObject
       with CountryType
  inline def OM: OM = "OM".asInstanceOf[OM]
  
  @js.native
  sealed trait OMR
    extends StObject
       with CurrencyType
  inline def OMR: OMR = "OMR".asInstanceOf[OMR]
  
  @js.native
  sealed trait ONE_INSTRUMENT_EXPECTED
    extends StObject
       with ErrorCodeType
  inline def ONE_INSTRUMENT_EXPECTED: ONE_INSTRUMENT_EXPECTED = "ONE_INSTRUMENT_EXPECTED".asInstanceOf[ONE_INSTRUMENT_EXPECTED]
  
  @js.native
  sealed trait ONLINE_STORE
    extends StObject
       with CustomerSourceType
       with ProductSourceType
  inline def ONLINE_STORE: ONLINE_STORE = "ONLINE_STORE".asInstanceOf[ONLINE_STORE]
  
  @js.native
  sealed trait ON_FILE extends StObject
  inline def ON_FILE: ON_FILE = "ON_FILE".asInstanceOf[ON_FILE]
  
  @js.native
  sealed trait OPEN
    extends StObject
       with OrderStateType
  inline def OPEN: OPEN = "OPEN".asInstanceOf[OPEN]
  
  @js.native
  sealed trait ORDER
    extends StObject
       with DiscountApplicationScopeType
       with TaxApplicationScopeType
  inline def ORDER: ORDER = "ORDER".asInstanceOf[ORDER]
  
  @js.native
  sealed trait ORDERED_FROM_VENDOR
    extends StObject
       with InventoryStateType
  inline def ORDERED_FROM_VENDOR: ORDERED_FROM_VENDOR = "ORDERED_FROM_VENDOR".asInstanceOf[ORDERED_FROM_VENDOR]
  
  @js.native
  sealed trait OTHER
    extends StObject
       with CustomerSourceType
       with ProductSourceType
  inline def OTHER: OTHER = "OTHER".asInstanceOf[OTHER]
  
  @js.native
  sealed trait OTHER_BRAND
    extends StObject
       with CardBrandType
  inline def OTHER_BRAND: OTHER_BRAND = "OTHER_BRAND".asInstanceOf[OTHER_BRAND]
  
  @js.native
  sealed trait OTHER_DISCOUNT_SCOPE
    extends StObject
       with DiscountApplicationScopeType
  inline def OTHER_DISCOUNT_SCOPE: OTHER_DISCOUNT_SCOPE = "OTHER_DISCOUNT_SCOPE".asInstanceOf[OTHER_DISCOUNT_SCOPE]
  
  @js.native
  sealed trait OTHER_TAX_SCOPE
    extends StObject
       with TaxApplicationScopeType
  inline def OTHER_TAX_SCOPE: OTHER_TAX_SCOPE = "OTHER_TAX_SCOPE".asInstanceOf[OTHER_TAX_SCOPE]
  
  @js.native
  sealed trait PA
    extends StObject
       with CountryType
  inline def PA: PA = "PA".asInstanceOf[PA]
  
  @js.native
  sealed trait PAB
    extends StObject
       with CurrencyType
  inline def PAB: PAB = "PAB".asInstanceOf[PAB]
  
  @js.native
  sealed trait PAYMENT_METHOD_ERROR
    extends StObject
       with ErrorCategoryType
  inline def PAYMENT_METHOD_ERROR: PAYMENT_METHOD_ERROR = "PAYMENT_METHOD_ERROR".asInstanceOf[PAYMENT_METHOD_ERROR]
  
  @js.native
  sealed trait PAYMENT_NOT_REFUNDABLE
    extends StObject
       with ErrorCodeType
  inline def PAYMENT_NOT_REFUNDABLE: PAYMENT_NOT_REFUNDABLE = "PAYMENT_NOT_REFUNDABLE".asInstanceOf[PAYMENT_NOT_REFUNDABLE]
  
  @js.native
  sealed trait PAYROLL
    extends StObject
       with ProductSourceType
  inline def PAYROLL: PAYROLL = "PAYROLL".asInstanceOf[PAYROLL]
  
  @js.native
  sealed trait PE
    extends StObject
       with CountryType
  inline def PE: PE = "PE".asInstanceOf[PE]
  
  @js.native
  sealed trait PEN
    extends StObject
       with CurrencyType
  inline def PEN: PEN = "PEN".asInstanceOf[PEN]
  
  @js.native
  sealed trait PENDING extends StObject
  inline def PENDING: PENDING = "PENDING".asInstanceOf[PENDING]
  
  @js.native
  sealed trait PF
    extends StObject
       with CountryType
  inline def PF: PF = "PF".asInstanceOf[PF]
  
  @js.native
  sealed trait PG
    extends StObject
       with CountryType
  inline def PG: PG = "PG".asInstanceOf[PG]
  
  @js.native
  sealed trait PGK
    extends StObject
       with CurrencyType
  inline def PGK: PGK = "PGK".asInstanceOf[PGK]
  
  @js.native
  sealed trait PH
    extends StObject
       with CountryType
  inline def PH: PH = "PH".asInstanceOf[PH]
  
  @js.native
  sealed trait PHP
    extends StObject
       with CurrencyType
  inline def PHP: PHP = "PHP".asInstanceOf[PHP]
  
  @js.native
  sealed trait PHYSICAL extends StObject
  inline def PHYSICAL: PHYSICAL = "PHYSICAL".asInstanceOf[PHYSICAL]
  
  @js.native
  sealed trait PHYSICAL_COUNT
    extends StObject
       with InventoryType
  inline def PHYSICAL_COUNT: PHYSICAL_COUNT = "PHYSICAL_COUNT".asInstanceOf[PHYSICAL_COUNT]
  
  @js.native
  sealed trait PICKUP
    extends StObject
       with FulfillmentType
  inline def PICKUP: PICKUP = "PICKUP".asInstanceOf[PICKUP]
  
  @js.native
  sealed trait PK
    extends StObject
       with CountryType
  inline def PK: PK = "PK".asInstanceOf[PK]
  
  @js.native
  sealed trait PKR
    extends StObject
       with CurrencyType
  inline def PKR: PKR = "PKR".asInstanceOf[PKR]
  
  @js.native
  sealed trait PL
    extends StObject
       with CountryType
  inline def PL: PL = "PL".asInstanceOf[PL]
  
  @js.native
  sealed trait PLN
    extends StObject
       with CurrencyType
  inline def PLN: PLN = "PLN".asInstanceOf[PLN]
  
  @js.native
  sealed trait PM
    extends StObject
       with CountryType
  inline def PM: PM = "PM".asInstanceOf[PM]
  
  @js.native
  sealed trait PN
    extends StObject
       with CountryType
  inline def PN: PN = "PN".asInstanceOf[PN]
  
  @js.native
  sealed trait PR
    extends StObject
       with CountryType
  inline def PR: PR = "PR".asInstanceOf[PR]
  
  @js.native
  sealed trait PREPARED
    extends StObject
       with FulfillmentStateType
  inline def PREPARED: PREPARED = "PREPARED".asInstanceOf[PREPARED]
  
  @js.native
  sealed trait PROPOSED
    extends StObject
       with FulfillmentStateType
  inline def PROPOSED: PROPOSED = "PROPOSED".asInstanceOf[PROPOSED]
  
  @js.native
  sealed trait PS
    extends StObject
       with CountryType
  inline def PS: PS = "PS".asInstanceOf[PS]
  
  @js.native
  sealed trait PT
    extends StObject
       with CountryType
  inline def PT: PT = "PT".asInstanceOf[PT]
  
  @js.native
  sealed trait PW
    extends StObject
       with CountryType
  inline def PW: PW = "PW".asInstanceOf[PW]
  
  @js.native
  sealed trait PY
    extends StObject
       with CountryType
  inline def PY: PY = "PY".asInstanceOf[PY]
  
  @js.native
  sealed trait PYG
    extends StObject
       with CurrencyType
  inline def PYG: PYG = "PYG".asInstanceOf[PYG]
  
  @js.native
  sealed trait QA
    extends StObject
       with CountryType
  inline def QA: QA = "QA".asInstanceOf[QA]
  
  @js.native
  sealed trait QAR
    extends StObject
       with CurrencyType
  inline def QAR: QAR = "QAR".asInstanceOf[QAR]
  
  @js.native
  sealed trait RATE_LIMITED
    extends StObject
       with ErrorCodeType
  inline def RATE_LIMITED: RATE_LIMITED = "RATE_LIMITED".asInstanceOf[RATE_LIMITED]
  
  @js.native
  sealed trait RATE_LIMIT_ERROR
    extends StObject
       with ErrorCategoryType
  inline def RATE_LIMIT_ERROR: RATE_LIMIT_ERROR = "RATE_LIMIT_ERROR".asInstanceOf[RATE_LIMIT_ERROR]
  
  @js.native
  sealed trait RE
    extends StObject
       with CountryType
  inline def RE: RE = "RE".asInstanceOf[RE]
  
  @js.native
  sealed trait RECEIVED_FROM_VENDOR
    extends StObject
       with InventoryStateType
  inline def RECEIVED_FROM_VENDOR: RECEIVED_FROM_VENDOR = "RECEIVED_FROM_VENDOR".asInstanceOf[RECEIVED_FROM_VENDOR]
  
  @js.native
  sealed trait REFUND_ALREADY_PENDING
    extends StObject
       with ErrorCodeType
  inline def REFUND_ALREADY_PENDING: REFUND_ALREADY_PENDING = "REFUND_ALREADY_PENDING".asInstanceOf[REFUND_ALREADY_PENDING]
  
  @js.native
  sealed trait REFUND_AMOUNT_INVALID
    extends StObject
       with ErrorCodeType
  inline def REFUND_AMOUNT_INVALID: REFUND_AMOUNT_INVALID = "REFUND_AMOUNT_INVALID".asInstanceOf[REFUND_AMOUNT_INVALID]
  
  @js.native
  sealed trait REFUND_ERROR
    extends StObject
       with ErrorCategoryType
  inline def REFUND_ERROR: REFUND_ERROR = "REFUND_ERROR".asInstanceOf[REFUND_ERROR]
  
  @js.native
  sealed trait REGISTER extends StObject
  inline def REGISTER: REGISTER = "REGISTER".asInstanceOf[REGISTER]
  
  @js.native
  sealed trait REGULAR extends StObject
  inline def REGULAR: REGULAR = "REGULAR".asInstanceOf[REGULAR]
  
  @js.native
  sealed trait REJECTED extends StObject
  inline def REJECTED: REJECTED = "REJECTED".asInstanceOf[REJECTED]
  
  @js.native
  sealed trait REQUEST_ENTITY_TOO_LARGE
    extends StObject
       with ErrorCodeType
  inline def REQUEST_ENTITY_TOO_LARGE: REQUEST_ENTITY_TOO_LARGE = "REQUEST_ENTITY_TOO_LARGE".asInstanceOf[REQUEST_ENTITY_TOO_LARGE]
  
  @js.native
  sealed trait REQUEST_TIMEOUT
    extends StObject
       with ErrorCodeType
  inline def REQUEST_TIMEOUT: REQUEST_TIMEOUT = "REQUEST_TIMEOUT".asInstanceOf[REQUEST_TIMEOUT]
  
  @js.native
  sealed trait RESERVED
    extends StObject
       with FulfillmentStateType
  inline def RESERVED: RESERVED = "RESERVED".asInstanceOf[RESERVED]
  
  @js.native
  sealed trait RESERVED_FOR_SALE
    extends StObject
       with InventoryStateType
  inline def RESERVED_FOR_SALE: RESERVED_FOR_SALE = "RESERVED_FOR_SALE".asInstanceOf[RESERVED_FOR_SALE]
  
  @js.native
  sealed trait RESTAURANT_ITEM extends StObject
  inline def RESTAURANT_ITEM: RESTAURANT_ITEM = "RESTAURANT_ITEM".asInstanceOf[RESTAURANT_ITEM]
  
  @js.native
  sealed trait RETAIL_ITEM extends StObject
  inline def RETAIL_ITEM: RETAIL_ITEM = "RETAIL_ITEM".asInstanceOf[RETAIL_ITEM]
  
  @js.native
  sealed trait RETURNED_BY_CUSTOMER
    extends StObject
       with InventoryStateType
  inline def RETURNED_BY_CUSTOMER: RETURNED_BY_CUSTOMER = "RETURNED_BY_CUSTOMER".asInstanceOf[RETURNED_BY_CUSTOMER]
  
  @js.native
  sealed trait RO
    extends StObject
       with CountryType
  inline def RO: RO = "RO".asInstanceOf[RO]
  
  @js.native
  sealed trait RON
    extends StObject
       with CurrencyType
  inline def RON: RON = "RON".asInstanceOf[RON]
  
  @js.native
  sealed trait RS
    extends StObject
       with CountryType
  inline def RS: RS = "RS".asInstanceOf[RS]
  
  @js.native
  sealed trait RSD
    extends StObject
       with CurrencyType
  inline def RSD: RSD = "RSD".asInstanceOf[RSD]
  
  @js.native
  sealed trait RU
    extends StObject
       with CountryType
  inline def RU: RU = "RU".asInstanceOf[RU]
  
  @js.native
  sealed trait RUB
    extends StObject
       with CurrencyType
  inline def RUB: RUB = "RUB".asInstanceOf[RUB]
  
  @js.native
  sealed trait RW
    extends StObject
       with CountryType
  inline def RW: RW = "RW".asInstanceOf[RW]
  
  @js.native
  sealed trait RWF
    extends StObject
       with CurrencyType
  inline def RWF: RWF = "RWF".asInstanceOf[RWF]
  
  @js.native
  sealed trait SA
    extends StObject
       with CountryType
  inline def SA: SA = "SA".asInstanceOf[SA]
  
  @js.native
  sealed trait SANDBOX_NOT_SUPPORTED
    extends StObject
       with ErrorCodeType
  inline def SANDBOX_NOT_SUPPORTED: SANDBOX_NOT_SUPPORTED = "SANDBOX_NOT_SUPPORTED".asInstanceOf[SANDBOX_NOT_SUPPORTED]
  
  @js.native
  sealed trait SAR
    extends StObject
       with CurrencyType
  inline def SAR: SAR = "SAR".asInstanceOf[SAR]
  
  @js.native
  sealed trait SAT
    extends StObject
       with DayOfWeekType
  inline def SAT: SAT = "SAT".asInstanceOf[SAT]
  
  @js.native
  sealed trait SB
    extends StObject
       with CountryType
  inline def SB: SB = "SB".asInstanceOf[SB]
  
  @js.native
  sealed trait SBD
    extends StObject
       with CurrencyType
  inline def SBD: SBD = "SBD".asInstanceOf[SBD]
  
  @js.native
  sealed trait SC
    extends StObject
       with CountryType
  inline def SC: SC = "SC".asInstanceOf[SC]
  
  @js.native
  sealed trait SCHEDULED extends StObject
  inline def SCHEDULED: SCHEDULED = "SCHEDULED".asInstanceOf[SCHEDULED]
  
  @js.native
  sealed trait SCR
    extends StObject
       with CurrencyType
  inline def SCR: SCR = "SCR".asInstanceOf[SCR]
  
  @js.native
  sealed trait SD
    extends StObject
       with CountryType
  inline def SD: SD = "SD".asInstanceOf[SD]
  
  @js.native
  sealed trait SDG
    extends StObject
       with CurrencyType
  inline def SDG: SDG = "SDG".asInstanceOf[SDG]
  
  @js.native
  sealed trait SE
    extends StObject
       with CountryType
  inline def SE: SE = "SE".asInstanceOf[SE]
  
  @js.native
  sealed trait SEK
    extends StObject
       with CurrencyType
  inline def SEK: SEK = "SEK".asInstanceOf[SEK]
  
  @js.native
  sealed trait SERVICE_UNAVAILABLE
    extends StObject
       with ErrorCodeType
  inline def SERVICE_UNAVAILABLE: SERVICE_UNAVAILABLE = "SERVICE_UNAVAILABLE".asInstanceOf[SERVICE_UNAVAILABLE]
  
  @js.native
  sealed trait SG
    extends StObject
       with CountryType
  inline def SG: SG = "SG".asInstanceOf[SG]
  
  @js.native
  sealed trait SGD
    extends StObject
       with CurrencyType
  inline def SGD: SGD = "SGD".asInstanceOf[SGD]
  
  @js.native
  sealed trait SH
    extends StObject
       with CountryType
  inline def SH: SH = "SH".asInstanceOf[SH]
  
  @js.native
  sealed trait SHIPMENT
    extends StObject
       with FulfillmentType
  inline def SHIPMENT: SHIPMENT = "SHIPMENT".asInstanceOf[SHIPMENT]
  
  @js.native
  sealed trait SHP
    extends StObject
       with CurrencyType
  inline def SHP: SHP = "SHP".asInstanceOf[SHP]
  
  @js.native
  sealed trait SI
    extends StObject
       with CountryType
  inline def SI: SI = "SI".asInstanceOf[SI]
  
  @js.native
  sealed trait SJ
    extends StObject
       with CountryType
  inline def SJ: SJ = "SJ".asInstanceOf[SJ]
  
  @js.native
  sealed trait SK
    extends StObject
       with CountryType
  inline def SK: SK = "SK".asInstanceOf[SK]
  
  @js.native
  sealed trait SL
    extends StObject
       with CountryType
  inline def SL: SL = "SL".asInstanceOf[SL]
  
  @js.native
  sealed trait SLL
    extends StObject
       with CurrencyType
  inline def SLL: SLL = "SLL".asInstanceOf[SLL]
  
  @js.native
  sealed trait SM
    extends StObject
       with CountryType
  inline def SM: SM = "SM".asInstanceOf[SM]
  
  @js.native
  sealed trait SN
    extends StObject
       with CountryType
  inline def SN: SN = "SN".asInstanceOf[SN]
  
  @js.native
  sealed trait SO
    extends StObject
       with CountryType
  inline def SO: SO = "SO".asInstanceOf[SO]
  
  @js.native
  sealed trait SOLD
    extends StObject
       with InventoryStateType
  inline def SOLD: SOLD = "SOLD".asInstanceOf[SOLD]
  
  @js.native
  sealed trait SOLD_ONLINE
    extends StObject
       with InventoryStateType
  inline def SOLD_ONLINE: SOLD_ONLINE = "SOLD_ONLINE".asInstanceOf[SOLD_ONLINE]
  
  @js.native
  sealed trait SOS
    extends StObject
       with CurrencyType
  inline def SOS: SOS = "SOS".asInstanceOf[SOS]
  
  @js.native
  sealed trait SQUARE_GIFT_CARD
    extends StObject
       with CardBrandType
  inline def SQUARE_GIFT_CARD: SQUARE_GIFT_CARD = "SQUARE_GIFT_CARD".asInstanceOf[SQUARE_GIFT_CARD]
  
  @js.native
  sealed trait SQUARE_POS
    extends StObject
       with ProductSourceType
  inline def SQUARE_POS: SQUARE_POS = "SQUARE_POS".asInstanceOf[SQUARE_POS]
  
  @js.native
  sealed trait SR
    extends StObject
       with CountryType
  inline def SR: SR = "SR".asInstanceOf[SR]
  
  @js.native
  sealed trait SRD
    extends StObject
       with CurrencyType
  inline def SRD: SRD = "SRD".asInstanceOf[SRD]
  
  @js.native
  sealed trait SS
    extends StObject
       with CountryType
  inline def SS: SS = "SS".asInstanceOf[SS]
  
  @js.native
  sealed trait SSP
    extends StObject
       with CurrencyType
  inline def SSP: SSP = "SSP".asInstanceOf[SSP]
  
  @js.native
  sealed trait ST
    extends StObject
       with CountryType
  inline def ST: ST = "ST".asInstanceOf[ST]
  
  @js.native
  sealed trait START_AT extends StObject
  inline def START_AT: START_AT = "START_AT".asInstanceOf[START_AT]
  
  @js.native
  sealed trait STD
    extends StObject
       with CurrencyType
  inline def STD: STD = "STD".asInstanceOf[STD]
  
  @js.native
  sealed trait SUCCESS extends StObject
  inline def SUCCESS: SUCCESS = "SUCCESS".asInstanceOf[SUCCESS]
  
  @js.native
  sealed trait SUN
    extends StObject
       with DayOfWeekType
  inline def SUN: SUN = "SUN".asInstanceOf[SUN]
  
  @js.native
  sealed trait SV
    extends StObject
       with CountryType
  inline def SV: SV = "SV".asInstanceOf[SV]
  
  @js.native
  sealed trait SVC
    extends StObject
       with CurrencyType
  inline def SVC: SVC = "SVC".asInstanceOf[SVC]
  
  @js.native
  sealed trait SWIPED extends StObject
  inline def SWIPED: SWIPED = "SWIPED".asInstanceOf[SWIPED]
  
  @js.native
  sealed trait SX
    extends StObject
       with CountryType
  inline def SX: SX = "SX".asInstanceOf[SX]
  
  @js.native
  sealed trait SY
    extends StObject
       with CountryType
  inline def SY: SY = "SY".asInstanceOf[SY]
  
  @js.native
  sealed trait SYP
    extends StObject
       with CurrencyType
  inline def SYP: SYP = "SYP".asInstanceOf[SYP]
  
  @js.native
  sealed trait SZ
    extends StObject
       with CountryType
  inline def SZ: SZ = "SZ".asInstanceOf[SZ]
  
  @js.native
  sealed trait SZL
    extends StObject
       with CurrencyType
  inline def SZL: SZL = "SZL".asInstanceOf[SZL]
  
  @js.native
  sealed trait TAX
    extends StObject
       with ObjectType
  inline def TAX: TAX = "TAX".asInstanceOf[TAX]
  
  @js.native
  sealed trait TAX_SUBTOTAL_PHASE extends StObject
  inline def TAX_SUBTOTAL_PHASE: TAX_SUBTOTAL_PHASE = "TAX_SUBTOTAL_PHASE".asInstanceOf[TAX_SUBTOTAL_PHASE]
  
  @js.native
  sealed trait TAX_TOTAL_PHASE extends StObject
  inline def TAX_TOTAL_PHASE: TAX_TOTAL_PHASE = "TAX_TOTAL_PHASE".asInstanceOf[TAX_TOTAL_PHASE]
  
  @js.native
  sealed trait TC
    extends StObject
       with CountryType
  inline def TC: TC = "TC".asInstanceOf[TC]
  
  @js.native
  sealed trait TD
    extends StObject
       with CountryType
  inline def TD: TD = "TD".asInstanceOf[TD]
  
  @js.native
  sealed trait TERMINAL
    extends StObject
       with CustomerSourceType
  inline def TERMINAL: TERMINAL = "TERMINAL".asInstanceOf[TERMINAL]
  
  @js.native
  sealed trait TF
    extends StObject
       with CountryType
  inline def TF: TF = "TF".asInstanceOf[TF]
  
  @js.native
  sealed trait TG
    extends StObject
       with CountryType
  inline def TG: TG = "TG".asInstanceOf[TG]
  
  @js.native
  sealed trait TH
    extends StObject
       with CountryType
  inline def TH: TH = "TH".asInstanceOf[TH]
  
  @js.native
  sealed trait THB
    extends StObject
       with CurrencyType
  inline def THB: THB = "THB".asInstanceOf[THB]
  
  @js.native
  sealed trait THIRD_PARTY
    extends StObject
       with CustomerSourceType
  inline def THIRD_PARTY: THIRD_PARTY = "THIRD_PARTY".asInstanceOf[THIRD_PARTY]
  
  @js.native
  sealed trait THIRD_PARTY_CARD extends StObject
  inline def THIRD_PARTY_CARD: THIRD_PARTY_CARD = "THIRD_PARTY_CARD".asInstanceOf[THIRD_PARTY_CARD]
  
  @js.native
  sealed trait THIRD_PARTY_IMPORT
    extends StObject
       with CustomerSourceType
  inline def THIRD_PARTY_IMPORT: THIRD_PARTY_IMPORT = "THIRD_PARTY_IMPORT".asInstanceOf[THIRD_PARTY_IMPORT]
  
  @js.native
  sealed trait THU
    extends StObject
       with DayOfWeekType
  inline def THU: THU = "THU".asInstanceOf[THU]
  
  @js.native
  sealed trait TJ
    extends StObject
       with CountryType
  inline def TJ: TJ = "TJ".asInstanceOf[TJ]
  
  @js.native
  sealed trait TJS
    extends StObject
       with CurrencyType
  inline def TJS: TJS = "TJS".asInstanceOf[TJS]
  
  @js.native
  sealed trait TK
    extends StObject
       with CountryType
  inline def TK: TK = "TK".asInstanceOf[TK]
  
  @js.native
  sealed trait TL
    extends StObject
       with CountryType
  inline def TL: TL = "TL".asInstanceOf[TL]
  
  @js.native
  sealed trait TM
    extends StObject
       with CountryType
  inline def TM: TM = "TM".asInstanceOf[TM]
  
  @js.native
  sealed trait TMT
    extends StObject
       with CurrencyType
  inline def TMT: TMT = "TMT".asInstanceOf[TMT]
  
  @js.native
  sealed trait TN
    extends StObject
       with CountryType
  inline def TN: TN = "TN".asInstanceOf[TN]
  
  @js.native
  sealed trait TND
    extends StObject
       with CurrencyType
  inline def TND: TND = "TND".asInstanceOf[TND]
  
  @js.native
  sealed trait TO
    extends StObject
       with CountryType
  inline def TO: TO = "TO".asInstanceOf[TO]
  
  @js.native
  sealed trait TOP
    extends StObject
       with CurrencyType
  inline def TOP: TOP = "TOP".asInstanceOf[TOP]
  
  @js.native
  sealed trait TR
    extends StObject
       with CountryType
  inline def TR: TR = "TR".asInstanceOf[TR]
  
  @js.native
  sealed trait TRANSFER
    extends StObject
       with InventoryType
  inline def TRANSFER: TRANSFER = "TRANSFER".asInstanceOf[TRANSFER]
  
  @js.native
  sealed trait TRY
    extends StObject
       with CurrencyType
  inline def TRY: TRY = "TRY".asInstanceOf[TRY]
  
  @js.native
  sealed trait TT
    extends StObject
       with CountryType
  inline def TT: TT = "TT".asInstanceOf[TT]
  
  @js.native
  sealed trait TTD
    extends StObject
       with CurrencyType
  inline def TTD: TTD = "TTD".asInstanceOf[TTD]
  
  @js.native
  sealed trait TUE
    extends StObject
       with DayOfWeekType
  inline def TUE: TUE = "TUE".asInstanceOf[TUE]
  
  @js.native
  sealed trait TV
    extends StObject
       with CountryType
  inline def TV: TV = "TV".asInstanceOf[TV]
  
  @js.native
  sealed trait TW
    extends StObject
       with CountryType
  inline def TW: TW = "TW".asInstanceOf[TW]
  
  @js.native
  sealed trait TWD
    extends StObject
       with CurrencyType
  inline def TWD: TWD = "TWD".asInstanceOf[TWD]
  
  @js.native
  sealed trait TZ
    extends StObject
       with CountryType
  inline def TZ: TZ = "TZ".asInstanceOf[TZ]
  
  @js.native
  sealed trait TZS
    extends StObject
       with CurrencyType
  inline def TZS: TZS = "TZS".asInstanceOf[TZS]
  
  @js.native
  sealed trait UA
    extends StObject
       with CountryType
  inline def UA: UA = "UA".asInstanceOf[UA]
  
  @js.native
  sealed trait UAH
    extends StObject
       with CurrencyType
  inline def UAH: UAH = "UAH".asInstanceOf[UAH]
  
  @js.native
  sealed trait UG
    extends StObject
       with CountryType
  inline def UG: UG = "UG".asInstanceOf[UG]
  
  @js.native
  sealed trait UGX
    extends StObject
       with CurrencyType
  inline def UGX: UGX = "UGX".asInstanceOf[UGX]
  
  @js.native
  sealed trait UM
    extends StObject
       with CountryType
  inline def UM: UM = "UM".asInstanceOf[UM]
  
  @js.native
  sealed trait UNAUTHORIZED
    extends StObject
       with ErrorCodeType
  inline def UNAUTHORIZED: UNAUTHORIZED = "UNAUTHORIZED".asInstanceOf[UNAUTHORIZED]
  
  @js.native
  sealed trait UNEXPECTED_VALUE
    extends StObject
       with ErrorCodeType
  inline def UNEXPECTED_VALUE: UNEXPECTED_VALUE = "UNEXPECTED_VALUE".asInstanceOf[UNEXPECTED_VALUE]
  
  @js.native
  sealed trait UNKNOWN extends StObject
  inline def UNKNOWN: UNKNOWN = "UNKNOWN".asInstanceOf[UNKNOWN]
  
  @js.native
  sealed trait UNKNOWN_CURRENCY
    extends StObject
       with CurrencyType
  inline def UNKNOWN_CURRENCY: UNKNOWN_CURRENCY = "UNKNOWN_CURRENCY".asInstanceOf[UNKNOWN_CURRENCY]
  
  @js.native
  sealed trait UNKNOWN_DISCOUNT
    extends StObject
       with DiscountType
  inline def UNKNOWN_DISCOUNT: UNKNOWN_DISCOUNT = "UNKNOWN_DISCOUNT".asInstanceOf[UNKNOWN_DISCOUNT]
  
  @js.native
  sealed trait UNKNOWN_QUERY_PARAMETER
    extends StObject
       with ErrorCodeType
  inline def UNKNOWN_QUERY_PARAMETER: UNKNOWN_QUERY_PARAMETER = "UNKNOWN_QUERY_PARAMETER".asInstanceOf[UNKNOWN_QUERY_PARAMETER]
  
  @js.native
  sealed trait UNKNOWN_TAX
    extends StObject
       with TaxType
  inline def UNKNOWN_TAX: UNKNOWN_TAX = "UNKNOWN_TAX".asInstanceOf[UNKNOWN_TAX]
  
  @js.native
  sealed trait UNLINKED_RETURN
    extends StObject
       with InventoryStateType
  inline def UNLINKED_RETURN: UNLINKED_RETURN = "UNLINKED_RETURN".asInstanceOf[UNLINKED_RETURN]
  
  @js.native
  sealed trait UNMERGE_RECOVERY
    extends StObject
       with CustomerSourceType
  inline def UNMERGE_RECOVERY: UNMERGE_RECOVERY = "UNMERGE_RECOVERY".asInstanceOf[UNMERGE_RECOVERY]
  
  @js.native
  sealed trait UNSUPPORTED_CARD_BRAND
    extends StObject
       with ErrorCodeType
  inline def UNSUPPORTED_CARD_BRAND: UNSUPPORTED_CARD_BRAND = "UNSUPPORTED_CARD_BRAND".asInstanceOf[UNSUPPORTED_CARD_BRAND]
  
  @js.native
  sealed trait UNSUPPORTED_ENTRY_METHOD
    extends StObject
       with ErrorCodeType
  inline def UNSUPPORTED_ENTRY_METHOD: UNSUPPORTED_ENTRY_METHOD = "UNSUPPORTED_ENTRY_METHOD".asInstanceOf[UNSUPPORTED_ENTRY_METHOD]
  
  @js.native
  sealed trait UNSUPPORTED_INSTRUMENT_TYPE
    extends StObject
       with ErrorCodeType
  inline def UNSUPPORTED_INSTRUMENT_TYPE: UNSUPPORTED_INSTRUMENT_TYPE = "UNSUPPORTED_INSTRUMENT_TYPE".asInstanceOf[UNSUPPORTED_INSTRUMENT_TYPE]
  
  @js.native
  sealed trait UNSUPPORTED_MEDIA_TYPE
    extends StObject
       with ErrorCodeType
  inline def UNSUPPORTED_MEDIA_TYPE: UNSUPPORTED_MEDIA_TYPE = "UNSUPPORTED_MEDIA_TYPE".asInstanceOf[UNSUPPORTED_MEDIA_TYPE]
  
  @js.native
  sealed trait UPDATED_AT extends StObject
  inline def UPDATED_AT: UPDATED_AT = "UPDATED_AT".asInstanceOf[UPDATED_AT]
  
  @js.native
  sealed trait US
    extends StObject
       with CountryType
  inline def US: US = "US".asInstanceOf[US]
  
  @js.native
  sealed trait USD
    extends StObject
       with CurrencyType
  inline def USD: USD = "USD".asInstanceOf[USD]
  
  @js.native
  sealed trait USN
    extends StObject
       with CurrencyType
  inline def USN: USN = "USN".asInstanceOf[USN]
  
  @js.native
  sealed trait USS
    extends StObject
       with CurrencyType
  inline def USS: USS = "USS".asInstanceOf[USS]
  
  @js.native
  sealed trait UY
    extends StObject
       with CountryType
  inline def UY: UY = "UY".asInstanceOf[UY]
  
  @js.native
  sealed trait UYI
    extends StObject
       with CurrencyType
  inline def UYI: UYI = "UYI".asInstanceOf[UYI]
  
  @js.native
  sealed trait UYU
    extends StObject
       with CurrencyType
  inline def UYU: UYU = "UYU".asInstanceOf[UYU]
  
  @js.native
  sealed trait UZ
    extends StObject
       with CountryType
  inline def UZ: UZ = "UZ".asInstanceOf[UZ]
  
  @js.native
  sealed trait UZS
    extends StObject
       with CurrencyType
  inline def UZS: UZS = "UZS".asInstanceOf[UZS]
  
  @js.native
  sealed trait V1_ACCESS_TOKEN
    extends StObject
       with ErrorCodeType
  inline def V1_ACCESS_TOKEN: V1_ACCESS_TOKEN = "V1_ACCESS_TOKEN".asInstanceOf[V1_ACCESS_TOKEN]
  
  @js.native
  sealed trait V1_APPLICATION
    extends StObject
       with ErrorCodeType
  inline def V1_APPLICATION: V1_APPLICATION = "V1_APPLICATION".asInstanceOf[V1_APPLICATION]
  
  @js.native
  sealed trait VA
    extends StObject
       with CountryType
  inline def VA: VA = "VA".asInstanceOf[VA]
  
  @js.native
  sealed trait VALUE_EMPTY
    extends StObject
       with ErrorCodeType
  inline def VALUE_EMPTY: VALUE_EMPTY = "VALUE_EMPTY".asInstanceOf[VALUE_EMPTY]
  
  @js.native
  sealed trait VALUE_REGEX_MISMATCH
    extends StObject
       with ErrorCodeType
  inline def VALUE_REGEX_MISMATCH: VALUE_REGEX_MISMATCH = "VALUE_REGEX_MISMATCH".asInstanceOf[VALUE_REGEX_MISMATCH]
  
  @js.native
  sealed trait VALUE_TOO_HIGH
    extends StObject
       with ErrorCodeType
  inline def VALUE_TOO_HIGH: VALUE_TOO_HIGH = "VALUE_TOO_HIGH".asInstanceOf[VALUE_TOO_HIGH]
  
  @js.native
  sealed trait VALUE_TOO_LONG
    extends StObject
       with ErrorCodeType
  inline def VALUE_TOO_LONG: VALUE_TOO_LONG = "VALUE_TOO_LONG".asInstanceOf[VALUE_TOO_LONG]
  
  @js.native
  sealed trait VALUE_TOO_LOW
    extends StObject
       with ErrorCodeType
  inline def VALUE_TOO_LOW: VALUE_TOO_LOW = "VALUE_TOO_LOW".asInstanceOf[VALUE_TOO_LOW]
  
  @js.native
  sealed trait VALUE_TOO_SHORT
    extends StObject
       with ErrorCodeType
  inline def VALUE_TOO_SHORT: VALUE_TOO_SHORT = "VALUE_TOO_SHORT".asInstanceOf[VALUE_TOO_SHORT]
  
  @js.native
  sealed trait VARIABLE_AMOUNT
    extends StObject
       with DiscountType
  inline def VARIABLE_AMOUNT: VARIABLE_AMOUNT = "VARIABLE_AMOUNT".asInstanceOf[VARIABLE_AMOUNT]
  
  @js.native
  sealed trait VARIABLE_PERCENTAGE
    extends StObject
       with DiscountType
  inline def VARIABLE_PERCENTAGE: VARIABLE_PERCENTAGE = "VARIABLE_PERCENTAGE".asInstanceOf[VARIABLE_PERCENTAGE]
  
  @js.native
  sealed trait VARIABLE_PRICING
    extends StObject
       with PricingType
  inline def VARIABLE_PRICING: VARIABLE_PRICING = "VARIABLE_PRICING".asInstanceOf[VARIABLE_PRICING]
  
  @js.native
  sealed trait VC
    extends StObject
       with CountryType
  inline def VC: VC = "VC".asInstanceOf[VC]
  
  @js.native
  sealed trait VE
    extends StObject
       with CountryType
  inline def VE: VE = "VE".asInstanceOf[VE]
  
  @js.native
  sealed trait VEF
    extends StObject
       with CurrencyType
  inline def VEF: VEF = "VEF".asInstanceOf[VEF]
  
  @js.native
  sealed trait VERIFIED extends StObject
  inline def VERIFIED: VERIFIED = "VERIFIED".asInstanceOf[VERIFIED]
  
  @js.native
  sealed trait VERIFY_AVS_FAILURE
    extends StObject
       with ErrorCodeType
  inline def VERIFY_AVS_FAILURE: VERIFY_AVS_FAILURE = "VERIFY_AVS_FAILURE".asInstanceOf[VERIFY_AVS_FAILURE]
  
  @js.native
  sealed trait VERIFY_CVV_FAILURE
    extends StObject
       with ErrorCodeType
  inline def VERIFY_CVV_FAILURE: VERIFY_CVV_FAILURE = "VERIFY_CVV_FAILURE".asInstanceOf[VERIFY_CVV_FAILURE]
  
  @js.native
  sealed trait VG
    extends StObject
       with CountryType
  inline def VG: VG = "VG".asInstanceOf[VG]
  
  @js.native
  sealed trait VI
    extends StObject
       with CountryType
  inline def VI: VI = "VI".asInstanceOf[VI]
  
  @js.native
  sealed trait VISA
    extends StObject
       with CardBrandType
  inline def VISA: VISA = "VISA".asInstanceOf[VISA]
  
  @js.native
  sealed trait VN
    extends StObject
       with CountryType
  inline def VN: VN = "VN".asInstanceOf[VN]
  
  @js.native
  sealed trait VND
    extends StObject
       with CurrencyType
  inline def VND: VND = "VND".asInstanceOf[VND]
  
  @js.native
  sealed trait VOIDED extends StObject
  inline def VOIDED: VOIDED = "VOIDED".asInstanceOf[VOIDED]
  
  @js.native
  sealed trait VU
    extends StObject
       with CountryType
  inline def VU: VU = "VU".asInstanceOf[VU]
  
  @js.native
  sealed trait VUV
    extends StObject
       with CurrencyType
  inline def VUV: VUV = "VUV".asInstanceOf[VUV]
  
  @js.native
  sealed trait WASTE
    extends StObject
       with InventoryStateType
  inline def WASTE: WASTE = "WASTE".asInstanceOf[WASTE]
  
  @js.native
  sealed trait WED
    extends StObject
       with DayOfWeekType
  inline def WED: WED = "WED".asInstanceOf[WED]
  
  @js.native
  sealed trait WF
    extends StObject
       with CountryType
  inline def WF: WF = "WF".asInstanceOf[WF]
  
  @js.native
  sealed trait WS
    extends StObject
       with CountryType
  inline def WS: WS = "WS".asInstanceOf[WS]
  
  @js.native
  sealed trait WST
    extends StObject
       with CurrencyType
  inline def WST: WST = "WST".asInstanceOf[WST]
  
  @js.native
  sealed trait XAF
    extends StObject
       with CurrencyType
  inline def XAF: XAF = "XAF".asInstanceOf[XAF]
  
  @js.native
  sealed trait XAG
    extends StObject
       with CurrencyType
  inline def XAG: XAG = "XAG".asInstanceOf[XAG]
  
  @js.native
  sealed trait XAU
    extends StObject
       with CurrencyType
  inline def XAU: XAU = "XAU".asInstanceOf[XAU]
  
  @js.native
  sealed trait XBA
    extends StObject
       with CurrencyType
  inline def XBA: XBA = "XBA".asInstanceOf[XBA]
  
  @js.native
  sealed trait XBB
    extends StObject
       with CurrencyType
  inline def XBB: XBB = "XBB".asInstanceOf[XBB]
  
  @js.native
  sealed trait XBC
    extends StObject
       with CurrencyType
  inline def XBC: XBC = "XBC".asInstanceOf[XBC]
  
  @js.native
  sealed trait XBD
    extends StObject
       with CurrencyType
  inline def XBD: XBD = "XBD".asInstanceOf[XBD]
  
  @js.native
  sealed trait XCD
    extends StObject
       with CurrencyType
  inline def XCD: XCD = "XCD".asInstanceOf[XCD]
  
  @js.native
  sealed trait XDR
    extends StObject
       with CurrencyType
  inline def XDR: XDR = "XDR".asInstanceOf[XDR]
  
  @js.native
  sealed trait XOF
    extends StObject
       with CurrencyType
  inline def XOF: XOF = "XOF".asInstanceOf[XOF]
  
  @js.native
  sealed trait XPD
    extends StObject
       with CurrencyType
  inline def XPD: XPD = "XPD".asInstanceOf[XPD]
  
  @js.native
  sealed trait XPF
    extends StObject
       with CurrencyType
  inline def XPF: XPF = "XPF".asInstanceOf[XPF]
  
  @js.native
  sealed trait XPT
    extends StObject
       with CurrencyType
  inline def XPT: XPT = "XPT".asInstanceOf[XPT]
  
  @js.native
  sealed trait XTS
    extends StObject
       with CurrencyType
  inline def XTS: XTS = "XTS".asInstanceOf[XTS]
  
  @js.native
  sealed trait XXX
    extends StObject
       with CurrencyType
  inline def XXX: XXX = "XXX".asInstanceOf[XXX]
  
  @js.native
  sealed trait YE
    extends StObject
       with CountryType
  inline def YE: YE = "YE".asInstanceOf[YE]
  
  @js.native
  sealed trait YER
    extends StObject
       with CurrencyType
  inline def YER: YER = "YER".asInstanceOf[YER]
  
  @js.native
  sealed trait YT
    extends StObject
       with CountryType
  inline def YT: YT = "YT".asInstanceOf[YT]
  
  @js.native
  sealed trait ZA
    extends StObject
       with CountryType
  inline def ZA: ZA = "ZA".asInstanceOf[ZA]
  
  @js.native
  sealed trait ZAR
    extends StObject
       with CurrencyType
  inline def ZAR: ZAR = "ZAR".asInstanceOf[ZAR]
  
  @js.native
  sealed trait ZM
    extends StObject
       with CountryType
  inline def ZM: ZM = "ZM".asInstanceOf[ZM]
  
  @js.native
  sealed trait ZMK
    extends StObject
       with CurrencyType
  inline def ZMK: ZMK = "ZMK".asInstanceOf[ZMK]
  
  @js.native
  sealed trait ZMW
    extends StObject
       with CurrencyType
  inline def ZMW: ZMW = "ZMW".asInstanceOf[ZMW]
  
  @js.native
  sealed trait ZW
    extends StObject
       with CountryType
  inline def ZW: ZW = "ZW".asInstanceOf[ZW]
  
  @js.native
  sealed trait ZZ
    extends StObject
       with CountryType
  inline def ZZ: ZZ = "ZZ".asInstanceOf[ZZ]
}
