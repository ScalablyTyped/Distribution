package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "ModelError")
@js.native
object ModelErrorNs extends js.Object {
  @js.native
  sealed trait CategoryEnum extends js.Object
  
  @js.native
  sealed trait CodeEnum extends js.Object
  
  @js.native
  object CategoryEnum extends js.Object {
    @js.native
    sealed trait APIERROR
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CategoryEnum
    
    @js.native
    sealed trait AUTHENTICATIONERROR
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CategoryEnum
    
    @js.native
    sealed trait INVALIDREQUESTERROR
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CategoryEnum
    
    @js.native
    sealed trait PAYMENTMETHODERROR
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CategoryEnum
    
    @js.native
    sealed trait RATELIMITERROR
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CategoryEnum
    
    @js.native
    sealed trait REFUNDERROR
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CategoryEnum
    
    /* "API_ERROR" */ val APIERROR: APIERROR with java.lang.String = js.native
    /* "AUTHENTICATION_ERROR" */ val AUTHENTICATIONERROR: AUTHENTICATIONERROR with java.lang.String = js.native
    /* "INVALID_REQUEST_ERROR" */ val INVALIDREQUESTERROR: INVALIDREQUESTERROR with java.lang.String = js.native
    /* "PAYMENT_METHOD_ERROR" */ val PAYMENTMETHODERROR: PAYMENTMETHODERROR with java.lang.String = js.native
    /* "RATE_LIMIT_ERROR" */ val RATELIMITERROR: RATELIMITERROR with java.lang.String = js.native
    /* "REFUND_ERROR" */ val REFUNDERROR: REFUNDERROR with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CategoryEnum with java.lang.String
      ] = js.native
  }
  
  @js.native
  object CodeEnum extends js.Object {
    @js.native
    sealed trait ACCESSTOKENEXPIRED
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait ACCESSTOKENREVOKED
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait AMOUNTTOOHIGH
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait APPLEPAYMENTPROCESSINGCERTIFICATEHASHNOTFOUND
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait APPLICATIONDISABLED
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait ARRAYEMPTY
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait ARRAYLENGTHTOOLONG
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait ARRAYLENGTHTOOSHORT
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait BADCERTIFICATE
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait BADREQUEST
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait CARDDECLINED
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait CARDDECLINEDCALLISSUER
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait CARDEXPIRED
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait CARDPROCESSINGNOTENABLED
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait CARDTOKENEXPIRED
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait CARDTOKENUSED
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait CHECKOUTEXPIRED
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait CONFLICT
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait CONFLICTINGPARAMETERS
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait DELAYEDTRANSACTIONCANCELED
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait DELAYEDTRANSACTIONCAPTURED
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait DELAYEDTRANSACTIONEXPIRED
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait DELAYEDTRANSACTIONFAILED
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait DEPRECATEDFIELDSET
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait EXPECTEDARRAY
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait EXPECTEDBASE64ENCODEDBYTEARRAY
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait EXPECTEDBOOLEAN
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait EXPECTEDFLOAT
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait EXPECTEDINTEGER
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait EXPECTEDJSONBODY
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait EXPECTEDMAP
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait EXPECTEDOBJECT
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait EXPECTEDSTRING
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait FORBIDDEN
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait GATEWAYTIMEOUT
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait IDEMPOTENCYKEYREUSED
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait INCORRECTTYPE
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait INSUFFICIENTSCOPES
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait INTERNALSERVERERROR
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait INVALIDARRAYVALUE
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait INVALIDCARD
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait INVALIDCARDDATA
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait INVALIDCONTENTTYPE
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait INVALIDCURSOR
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait INVALIDEMAILADDRESS
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait INVALIDENCRYPTEDCARD
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait INVALIDENUMVALUE
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait INVALIDEXPIRATION
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait INVALIDEXPIRATIONDATE
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait INVALIDEXPIRATIONYEAR
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait INVALIDFORMVALUE
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait INVALIDPHONENUMBER
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait INVALIDSORTORDER
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait INVALIDTIME
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait INVALIDTIMERANGE
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait INVALIDVALUE
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait LOCATIONMISMATCH
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait METHODNOTALLOWED
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait MISSINGREQUIREDPARAMETER
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait NOFIELDSSET
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait NOTACCEPTABLE
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait NOTFOUND
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait NOTIMPLEMENTED
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait ONEINSTRUMENTEXPECTED
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait PAYMENTNOTREFUNDABLE
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait RATELIMITED
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait REFUNDALREADYPENDING
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait REFUNDAMOUNTINVALID
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait REQUESTENTITYTOOLARGE
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait REQUESTTIMEOUT
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait SANDBOXNOTSUPPORTED
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait SERVICEUNAVAILABLE
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait UNAUTHORIZED
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait UNEXPECTEDVALUE
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait UNKNOWNQUERYPARAMETER
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait UNSUPPORTEDCARDBRAND
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait UNSUPPORTEDENTRYMETHOD
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait UNSUPPORTEDINSTRUMENTTYPE
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait UNSUPPORTEDMEDIATYPE
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait V1ACCESSTOKEN
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait V1APPLICATION
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait VALUEEMPTY
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait VALUEREGEXMISMATCH
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait VALUETOOHIGH
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait VALUETOOLONG
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait VALUETOOLOW
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait VALUETOOSHORT
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait VERIFYAVSFAILURE
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait VERIFYCVVFAILURE
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    /* "ACCESS_TOKEN_EXPIRED" */ val ACCESSTOKENEXPIRED: ACCESSTOKENEXPIRED with java.lang.String = js.native
    /* "ACCESS_TOKEN_REVOKED" */ val ACCESSTOKENREVOKED: ACCESSTOKENREVOKED with java.lang.String = js.native
    /* "AMOUNT_TOO_HIGH" */ val AMOUNTTOOHIGH: AMOUNTTOOHIGH with java.lang.String = js.native
    /* "APPLE_PAYMENT_PROCESSING_CERTIFICATE_HASH_NOT_FOUND" */ val APPLEPAYMENTPROCESSINGCERTIFICATEHASHNOTFOUND: APPLEPAYMENTPROCESSINGCERTIFICATEHASHNOTFOUND with java.lang.String = js.native
    /* "APPLICATION_DISABLED" */ val APPLICATIONDISABLED: APPLICATIONDISABLED with java.lang.String = js.native
    /* "ARRAY_EMPTY" */ val ARRAYEMPTY: ARRAYEMPTY with java.lang.String = js.native
    /* "ARRAY_LENGTH_TOO_LONG" */ val ARRAYLENGTHTOOLONG: ARRAYLENGTHTOOLONG with java.lang.String = js.native
    /* "ARRAY_LENGTH_TOO_SHORT" */ val ARRAYLENGTHTOOSHORT: ARRAYLENGTHTOOSHORT with java.lang.String = js.native
    /* "BAD_CERTIFICATE" */ val BADCERTIFICATE: BADCERTIFICATE with java.lang.String = js.native
    /* "BAD_REQUEST" */ val BADREQUEST: BADREQUEST with java.lang.String = js.native
    /* "CARD_DECLINED" */ val CARDDECLINED: CARDDECLINED with java.lang.String = js.native
    /* "CARD_DECLINED_CALL_ISSUER" */ val CARDDECLINEDCALLISSUER: CARDDECLINEDCALLISSUER with java.lang.String = js.native
    /* "CARD_EXPIRED" */ val CARDEXPIRED: CARDEXPIRED with java.lang.String = js.native
    /* "CARD_PROCESSING_NOT_ENABLED" */ val CARDPROCESSINGNOTENABLED: CARDPROCESSINGNOTENABLED with java.lang.String = js.native
    /* "CARD_TOKEN_EXPIRED" */ val CARDTOKENEXPIRED: CARDTOKENEXPIRED with java.lang.String = js.native
    /* "CARD_TOKEN_USED" */ val CARDTOKENUSED: CARDTOKENUSED with java.lang.String = js.native
    /* "CHECKOUT_EXPIRED" */ val CHECKOUTEXPIRED: CHECKOUTEXPIRED with java.lang.String = js.native
    /* "CONFLICT" */ val CONFLICT: CONFLICT with java.lang.String = js.native
    /* "CONFLICTING_PARAMETERS" */ val CONFLICTINGPARAMETERS: CONFLICTINGPARAMETERS with java.lang.String = js.native
    /* "DELAYED_TRANSACTION_CANCELED" */ val DELAYEDTRANSACTIONCANCELED: DELAYEDTRANSACTIONCANCELED with java.lang.String = js.native
    /* "DELAYED_TRANSACTION_CAPTURED" */ val DELAYEDTRANSACTIONCAPTURED: DELAYEDTRANSACTIONCAPTURED with java.lang.String = js.native
    /* "DELAYED_TRANSACTION_EXPIRED" */ val DELAYEDTRANSACTIONEXPIRED: DELAYEDTRANSACTIONEXPIRED with java.lang.String = js.native
    /* "DELAYED_TRANSACTION_FAILED" */ val DELAYEDTRANSACTIONFAILED: DELAYEDTRANSACTIONFAILED with java.lang.String = js.native
    /* "DEPRECATED_FIELD_SET" */ val DEPRECATEDFIELDSET: DEPRECATEDFIELDSET with java.lang.String = js.native
    /* "EXPECTED_ARRAY" */ val EXPECTEDARRAY: EXPECTEDARRAY with java.lang.String = js.native
    /* "EXPECTED_BASE64_ENCODED_BYTE_ARRAY" */ val EXPECTEDBASE64ENCODEDBYTEARRAY: EXPECTEDBASE64ENCODEDBYTEARRAY with java.lang.String = js.native
    /* "EXPECTED_BOOLEAN" */ val EXPECTEDBOOLEAN: EXPECTEDBOOLEAN with java.lang.String = js.native
    /* "EXPECTED_FLOAT" */ val EXPECTEDFLOAT: EXPECTEDFLOAT with java.lang.String = js.native
    /* "EXPECTED_INTEGER" */ val EXPECTEDINTEGER: EXPECTEDINTEGER with java.lang.String = js.native
    /* "EXPECTED_JSON_BODY" */ val EXPECTEDJSONBODY: EXPECTEDJSONBODY with java.lang.String = js.native
    /* "EXPECTED_MAP" */ val EXPECTEDMAP: EXPECTEDMAP with java.lang.String = js.native
    /* "EXPECTED_OBJECT" */ val EXPECTEDOBJECT: EXPECTEDOBJECT with java.lang.String = js.native
    /* "EXPECTED_STRING" */ val EXPECTEDSTRING: EXPECTEDSTRING with java.lang.String = js.native
    /* "FORBIDDEN" */ val FORBIDDEN: FORBIDDEN with java.lang.String = js.native
    /* "GATEWAY_TIMEOUT" */ val GATEWAYTIMEOUT: GATEWAYTIMEOUT with java.lang.String = js.native
    /* "IDEMPOTENCY_KEY_REUSED" */ val IDEMPOTENCYKEYREUSED: IDEMPOTENCYKEYREUSED with java.lang.String = js.native
    /* "INCORRECT_TYPE" */ val INCORRECTTYPE: INCORRECTTYPE with java.lang.String = js.native
    /* "INSUFFICIENT_SCOPES" */ val INSUFFICIENTSCOPES: INSUFFICIENTSCOPES with java.lang.String = js.native
    /* "INTERNAL_SERVER_ERROR" */ val INTERNALSERVERERROR: INTERNALSERVERERROR with java.lang.String = js.native
    /* "INVALID_ARRAY_VALUE" */ val INVALIDARRAYVALUE: INVALIDARRAYVALUE with java.lang.String = js.native
    /* "INVALID_CARD" */ val INVALIDCARD: INVALIDCARD with java.lang.String = js.native
    /* "INVALID_CARD_DATA" */ val INVALIDCARDDATA: INVALIDCARDDATA with java.lang.String = js.native
    /* "INVALID_CONTENT_TYPE" */ val INVALIDCONTENTTYPE: INVALIDCONTENTTYPE with java.lang.String = js.native
    /* "INVALID_CURSOR" */ val INVALIDCURSOR: INVALIDCURSOR with java.lang.String = js.native
    /* "INVALID_EMAIL_ADDRESS" */ val INVALIDEMAILADDRESS: INVALIDEMAILADDRESS with java.lang.String = js.native
    /* "INVALID_ENCRYPTED_CARD" */ val INVALIDENCRYPTEDCARD: INVALIDENCRYPTEDCARD with java.lang.String = js.native
    /* "INVALID_ENUM_VALUE" */ val INVALIDENUMVALUE: INVALIDENUMVALUE with java.lang.String = js.native
    /* "INVALID_EXPIRATION" */ val INVALIDEXPIRATION: INVALIDEXPIRATION with java.lang.String = js.native
    /* "INVALID_EXPIRATION_DATE" */ val INVALIDEXPIRATIONDATE: INVALIDEXPIRATIONDATE with java.lang.String = js.native
    /* "INVALID_EXPIRATION_YEAR" */ val INVALIDEXPIRATIONYEAR: INVALIDEXPIRATIONYEAR with java.lang.String = js.native
    /* "INVALID_FORM_VALUE" */ val INVALIDFORMVALUE: INVALIDFORMVALUE with java.lang.String = js.native
    /* "INVALID_PHONE_NUMBER" */ val INVALIDPHONENUMBER: INVALIDPHONENUMBER with java.lang.String = js.native
    /* "INVALID_SORT_ORDER" */ val INVALIDSORTORDER: INVALIDSORTORDER with java.lang.String = js.native
    /* "INVALID_TIME" */ val INVALIDTIME: INVALIDTIME with java.lang.String = js.native
    /* "INVALID_TIME_RANGE" */ val INVALIDTIMERANGE: INVALIDTIMERANGE with java.lang.String = js.native
    /* "INVALID_VALUE" */ val INVALIDVALUE: INVALIDVALUE with java.lang.String = js.native
    /* "LOCATION_MISMATCH" */ val LOCATIONMISMATCH: LOCATIONMISMATCH with java.lang.String = js.native
    /* "METHOD_NOT_ALLOWED" */ val METHODNOTALLOWED: METHODNOTALLOWED with java.lang.String = js.native
    /* "MISSING_REQUIRED_PARAMETER" */ val MISSINGREQUIREDPARAMETER: MISSINGREQUIREDPARAMETER with java.lang.String = js.native
    /* "NO_FIELDS_SET" */ val NOFIELDSSET: NOFIELDSSET with java.lang.String = js.native
    /* "NOT_ACCEPTABLE" */ val NOTACCEPTABLE: NOTACCEPTABLE with java.lang.String = js.native
    /* "NOT_FOUND" */ val NOTFOUND: NOTFOUND with java.lang.String = js.native
    /* "NOT_IMPLEMENTED" */ val NOTIMPLEMENTED: NOTIMPLEMENTED with java.lang.String = js.native
    /* "ONE_INSTRUMENT_EXPECTED" */ val ONEINSTRUMENTEXPECTED: ONEINSTRUMENTEXPECTED with java.lang.String = js.native
    /* "PAYMENT_NOT_REFUNDABLE" */ val PAYMENTNOTREFUNDABLE: PAYMENTNOTREFUNDABLE with java.lang.String = js.native
    /* "RATE_LIMITED" */ val RATELIMITED: RATELIMITED with java.lang.String = js.native
    /* "REFUND_ALREADY_PENDING" */ val REFUNDALREADYPENDING: REFUNDALREADYPENDING with java.lang.String = js.native
    /* "REFUND_AMOUNT_INVALID" */ val REFUNDAMOUNTINVALID: REFUNDAMOUNTINVALID with java.lang.String = js.native
    /* "REQUEST_ENTITY_TOO_LARGE" */ val REQUESTENTITYTOOLARGE: REQUESTENTITYTOOLARGE with java.lang.String = js.native
    /* "REQUEST_TIMEOUT" */ val REQUESTTIMEOUT: REQUESTTIMEOUT with java.lang.String = js.native
    /* "SANDBOX_NOT_SUPPORTED" */ val SANDBOXNOTSUPPORTED: SANDBOXNOTSUPPORTED with java.lang.String = js.native
    /* "SERVICE_UNAVAILABLE" */ val SERVICEUNAVAILABLE: SERVICEUNAVAILABLE with java.lang.String = js.native
    /* "UNAUTHORIZED" */ val UNAUTHORIZED: UNAUTHORIZED with java.lang.String = js.native
    /* "UNEXPECTED_VALUE" */ val UNEXPECTEDVALUE: UNEXPECTEDVALUE with java.lang.String = js.native
    /* "UNKNOWN_QUERY_PARAMETER" */ val UNKNOWNQUERYPARAMETER: UNKNOWNQUERYPARAMETER with java.lang.String = js.native
    /* "UNSUPPORTED_CARD_BRAND" */ val UNSUPPORTEDCARDBRAND: UNSUPPORTEDCARDBRAND with java.lang.String = js.native
    /* "UNSUPPORTED_ENTRY_METHOD" */ val UNSUPPORTEDENTRYMETHOD: UNSUPPORTEDENTRYMETHOD with java.lang.String = js.native
    /* "UNSUPPORTED_INSTRUMENT_TYPE" */ val UNSUPPORTEDINSTRUMENTTYPE: UNSUPPORTEDINSTRUMENTTYPE with java.lang.String = js.native
    /* "UNSUPPORTED_MEDIA_TYPE" */ val UNSUPPORTEDMEDIATYPE: UNSUPPORTEDMEDIATYPE with java.lang.String = js.native
    /* "V1_ACCESS_TOKEN" */ val V1ACCESSTOKEN: V1ACCESSTOKEN with java.lang.String = js.native
    /* "V1_APPLICATION" */ val V1APPLICATION: V1APPLICATION with java.lang.String = js.native
    /* "VALUE_EMPTY" */ val VALUEEMPTY: VALUEEMPTY with java.lang.String = js.native
    /* "VALUE_REGEX_MISMATCH" */ val VALUEREGEXMISMATCH: VALUEREGEXMISMATCH with java.lang.String = js.native
    /* "VALUE_TOO_HIGH" */ val VALUETOOHIGH: VALUETOOHIGH with java.lang.String = js.native
    /* "VALUE_TOO_LONG" */ val VALUETOOLONG: VALUETOOLONG with java.lang.String = js.native
    /* "VALUE_TOO_LOW" */ val VALUETOOLOW: VALUETOOLOW with java.lang.String = js.native
    /* "VALUE_TOO_SHORT" */ val VALUETOOSHORT: VALUETOOSHORT with java.lang.String = js.native
    /* "VERIFY_AVS_FAILURE" */ val VERIFYAVSFAILURE: VERIFYAVSFAILURE with java.lang.String = js.native
    /* "VERIFY_CVV_FAILURE" */ val VERIFYCVVFAILURE: VERIFYCVVFAILURE with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum with java.lang.String
      ] = js.native
  }
  
}

