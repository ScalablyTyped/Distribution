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
    sealed trait API_ERROR
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CategoryEnum
    
    @js.native
    sealed trait AUTHENTICATION_ERROR
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CategoryEnum
    
    @js.native
    sealed trait INVALID_REQUEST_ERROR
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CategoryEnum
    
    @js.native
    sealed trait PAYMENT_METHOD_ERROR
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CategoryEnum
    
    @js.native
    sealed trait RATE_LIMIT_ERROR
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CategoryEnum
    
    @js.native
    sealed trait REFUND_ERROR
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CategoryEnum
    
    /* "API_ERROR" */ val API_ERROR: API_ERROR with java.lang.String = js.native
    /* "AUTHENTICATION_ERROR" */ val AUTHENTICATION_ERROR: AUTHENTICATION_ERROR with java.lang.String = js.native
    /* "INVALID_REQUEST_ERROR" */ val INVALID_REQUEST_ERROR: INVALID_REQUEST_ERROR with java.lang.String = js.native
    /* "PAYMENT_METHOD_ERROR" */ val PAYMENT_METHOD_ERROR: PAYMENT_METHOD_ERROR with java.lang.String = js.native
    /* "RATE_LIMIT_ERROR" */ val RATE_LIMIT_ERROR: RATE_LIMIT_ERROR with java.lang.String = js.native
    /* "REFUND_ERROR" */ val REFUND_ERROR: REFUND_ERROR with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CategoryEnum with java.lang.String
      ] = js.native
  }
  
  @js.native
  object CodeEnum extends js.Object {
    @js.native
    sealed trait ACCESS_TOKEN_EXPIRED
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait ACCESS_TOKEN_REVOKED
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait AMOUNT_TOO_HIGH
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait API_VERSION_INCOMPATIBLE
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait APPLE_PAYMENT_PROCESSING_CERTIFICATE_HASH_NOT_FOUND
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait APPLICATION_DISABLED
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait ARRAY_EMPTY
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait ARRAY_LENGTH_TOO_LONG
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait ARRAY_LENGTH_TOO_SHORT
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait BAD_CERTIFICATE
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait BAD_REQUEST
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait CARD_DECLINED
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait CARD_DECLINED_CALL_ISSUER
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait CARD_EXPIRED
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait CARD_PROCESSING_NOT_ENABLED
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait CARD_TOKEN_EXPIRED
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait CARD_TOKEN_USED
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait CHECKOUT_EXPIRED
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait CONFLICT
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait CONFLICTING_PARAMETERS
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait DELAYED_TRANSACTION_CANCELED
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait DELAYED_TRANSACTION_CAPTURED
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait DELAYED_TRANSACTION_EXPIRED
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait DELAYED_TRANSACTION_FAILED
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait DEPRECATED_FIELD_SET
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait EXPECTED_ARRAY
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait EXPECTED_BASE64_ENCODED_BYTE_ARRAY
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait EXPECTED_BOOLEAN
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait EXPECTED_FLOAT
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait EXPECTED_INTEGER
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait EXPECTED_JSON_BODY
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait EXPECTED_MAP
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait EXPECTED_OBJECT
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait EXPECTED_STRING
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait FORBIDDEN
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait GATEWAY_TIMEOUT
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait IDEMPOTENCY_KEY_REUSED
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait INCORRECT_TYPE
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait INSUFFICIENT_SCOPES
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait INTERNAL_SERVER_ERROR
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait INVALID_ARRAY_VALUE
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait INVALID_CARD
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait INVALID_CARD_DATA
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait INVALID_CONTENT_TYPE
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait INVALID_CURSOR
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait INVALID_EMAIL_ADDRESS
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait INVALID_ENCRYPTED_CARD
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait INVALID_ENUM_VALUE
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait INVALID_EXPIRATION
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait INVALID_EXPIRATION_DATE
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait INVALID_EXPIRATION_YEAR
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait INVALID_FORM_VALUE
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait INVALID_PHONE_NUMBER
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait INVALID_SORT_ORDER
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait INVALID_SQUARE_VERSION_FORMAT
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait INVALID_TIME
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait INVALID_TIME_RANGE
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait INVALID_VALUE
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait LOCATION_MISMATCH
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait METHOD_NOT_ALLOWED
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait MISSING_REQUIRED_PARAMETER
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait NOT_ACCEPTABLE
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait NOT_FOUND
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait NOT_IMPLEMENTED
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait NO_FIELDS_SET
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait ONE_INSTRUMENT_EXPECTED
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait PAYMENT_NOT_REFUNDABLE
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait RATE_LIMITED
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait REFUND_ALREADY_PENDING
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait REFUND_AMOUNT_INVALID
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait REQUEST_ENTITY_TOO_LARGE
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait REQUEST_TIMEOUT
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait SANDBOX_NOT_SUPPORTED
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait SERVICE_UNAVAILABLE
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait UNAUTHORIZED
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait UNEXPECTED_VALUE
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait UNKNOWN_QUERY_PARAMETER
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait UNSUPPORTED_CARD_BRAND
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait UNSUPPORTED_ENTRY_METHOD
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait UNSUPPORTED_INSTRUMENT_TYPE
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait UNSUPPORTED_MEDIA_TYPE
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait V1_ACCESS_TOKEN
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait V1_APPLICATION
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait VALUE_EMPTY
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait VALUE_REGEX_MISMATCH
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait VALUE_TOO_HIGH
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait VALUE_TOO_LONG
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait VALUE_TOO_LOW
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait VALUE_TOO_SHORT
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait VERIFY_AVS_FAILURE
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    @js.native
    sealed trait VERIFY_CVV_FAILURE
      extends squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum
    
    /* "ACCESS_TOKEN_EXPIRED" */ val ACCESS_TOKEN_EXPIRED: ACCESS_TOKEN_EXPIRED with java.lang.String = js.native
    /* "ACCESS_TOKEN_REVOKED" */ val ACCESS_TOKEN_REVOKED: ACCESS_TOKEN_REVOKED with java.lang.String = js.native
    /* "AMOUNT_TOO_HIGH" */ val AMOUNT_TOO_HIGH: AMOUNT_TOO_HIGH with java.lang.String = js.native
    /* "API_VERSION_INCOMPATIBLE" */ val API_VERSION_INCOMPATIBLE: API_VERSION_INCOMPATIBLE with java.lang.String = js.native
    /* "APPLE_PAYMENT_PROCESSING_CERTIFICATE_HASH_NOT_FOUND" */ val APPLE_PAYMENT_PROCESSING_CERTIFICATE_HASH_NOT_FOUND: APPLE_PAYMENT_PROCESSING_CERTIFICATE_HASH_NOT_FOUND with java.lang.String = js.native
    /* "APPLICATION_DISABLED" */ val APPLICATION_DISABLED: APPLICATION_DISABLED with java.lang.String = js.native
    /* "ARRAY_EMPTY" */ val ARRAY_EMPTY: ARRAY_EMPTY with java.lang.String = js.native
    /* "ARRAY_LENGTH_TOO_LONG" */ val ARRAY_LENGTH_TOO_LONG: ARRAY_LENGTH_TOO_LONG with java.lang.String = js.native
    /* "ARRAY_LENGTH_TOO_SHORT" */ val ARRAY_LENGTH_TOO_SHORT: ARRAY_LENGTH_TOO_SHORT with java.lang.String = js.native
    /* "BAD_CERTIFICATE" */ val BAD_CERTIFICATE: BAD_CERTIFICATE with java.lang.String = js.native
    /* "BAD_REQUEST" */ val BAD_REQUEST: BAD_REQUEST with java.lang.String = js.native
    /* "CARD_DECLINED" */ val CARD_DECLINED: CARD_DECLINED with java.lang.String = js.native
    /* "CARD_DECLINED_CALL_ISSUER" */ val CARD_DECLINED_CALL_ISSUER: CARD_DECLINED_CALL_ISSUER with java.lang.String = js.native
    /* "CARD_EXPIRED" */ val CARD_EXPIRED: CARD_EXPIRED with java.lang.String = js.native
    /* "CARD_PROCESSING_NOT_ENABLED" */ val CARD_PROCESSING_NOT_ENABLED: CARD_PROCESSING_NOT_ENABLED with java.lang.String = js.native
    /* "CARD_TOKEN_EXPIRED" */ val CARD_TOKEN_EXPIRED: CARD_TOKEN_EXPIRED with java.lang.String = js.native
    /* "CARD_TOKEN_USED" */ val CARD_TOKEN_USED: CARD_TOKEN_USED with java.lang.String = js.native
    /* "CHECKOUT_EXPIRED" */ val CHECKOUT_EXPIRED: CHECKOUT_EXPIRED with java.lang.String = js.native
    /* "CONFLICT" */ val CONFLICT: CONFLICT with java.lang.String = js.native
    /* "CONFLICTING_PARAMETERS" */ val CONFLICTING_PARAMETERS: CONFLICTING_PARAMETERS with java.lang.String = js.native
    /* "DELAYED_TRANSACTION_CANCELED" */ val DELAYED_TRANSACTION_CANCELED: DELAYED_TRANSACTION_CANCELED with java.lang.String = js.native
    /* "DELAYED_TRANSACTION_CAPTURED" */ val DELAYED_TRANSACTION_CAPTURED: DELAYED_TRANSACTION_CAPTURED with java.lang.String = js.native
    /* "DELAYED_TRANSACTION_EXPIRED" */ val DELAYED_TRANSACTION_EXPIRED: DELAYED_TRANSACTION_EXPIRED with java.lang.String = js.native
    /* "DELAYED_TRANSACTION_FAILED" */ val DELAYED_TRANSACTION_FAILED: DELAYED_TRANSACTION_FAILED with java.lang.String = js.native
    /* "DEPRECATED_FIELD_SET" */ val DEPRECATED_FIELD_SET: DEPRECATED_FIELD_SET with java.lang.String = js.native
    /* "EXPECTED_ARRAY" */ val EXPECTED_ARRAY: EXPECTED_ARRAY with java.lang.String = js.native
    /* "EXPECTED_BASE64_ENCODED_BYTE_ARRAY" */ val EXPECTED_BASE64_ENCODED_BYTE_ARRAY: EXPECTED_BASE64_ENCODED_BYTE_ARRAY with java.lang.String = js.native
    /* "EXPECTED_BOOLEAN" */ val EXPECTED_BOOLEAN: EXPECTED_BOOLEAN with java.lang.String = js.native
    /* "EXPECTED_FLOAT" */ val EXPECTED_FLOAT: EXPECTED_FLOAT with java.lang.String = js.native
    /* "EXPECTED_INTEGER" */ val EXPECTED_INTEGER: EXPECTED_INTEGER with java.lang.String = js.native
    /* "EXPECTED_JSON_BODY" */ val EXPECTED_JSON_BODY: EXPECTED_JSON_BODY with java.lang.String = js.native
    /* "EXPECTED_MAP" */ val EXPECTED_MAP: EXPECTED_MAP with java.lang.String = js.native
    /* "EXPECTED_OBJECT" */ val EXPECTED_OBJECT: EXPECTED_OBJECT with java.lang.String = js.native
    /* "EXPECTED_STRING" */ val EXPECTED_STRING: EXPECTED_STRING with java.lang.String = js.native
    /* "FORBIDDEN" */ val FORBIDDEN: FORBIDDEN with java.lang.String = js.native
    /* "GATEWAY_TIMEOUT" */ val GATEWAY_TIMEOUT: GATEWAY_TIMEOUT with java.lang.String = js.native
    /* "IDEMPOTENCY_KEY_REUSED" */ val IDEMPOTENCY_KEY_REUSED: IDEMPOTENCY_KEY_REUSED with java.lang.String = js.native
    /* "INCORRECT_TYPE" */ val INCORRECT_TYPE: INCORRECT_TYPE with java.lang.String = js.native
    /* "INSUFFICIENT_SCOPES" */ val INSUFFICIENT_SCOPES: INSUFFICIENT_SCOPES with java.lang.String = js.native
    /* "INTERNAL_SERVER_ERROR" */ val INTERNAL_SERVER_ERROR: INTERNAL_SERVER_ERROR with java.lang.String = js.native
    /* "INVALID_ARRAY_VALUE" */ val INVALID_ARRAY_VALUE: INVALID_ARRAY_VALUE with java.lang.String = js.native
    /* "INVALID_CARD" */ val INVALID_CARD: INVALID_CARD with java.lang.String = js.native
    /* "INVALID_CARD_DATA" */ val INVALID_CARD_DATA: INVALID_CARD_DATA with java.lang.String = js.native
    /* "INVALID_CONTENT_TYPE" */ val INVALID_CONTENT_TYPE: INVALID_CONTENT_TYPE with java.lang.String = js.native
    /* "INVALID_CURSOR" */ val INVALID_CURSOR: INVALID_CURSOR with java.lang.String = js.native
    /* "INVALID_EMAIL_ADDRESS" */ val INVALID_EMAIL_ADDRESS: INVALID_EMAIL_ADDRESS with java.lang.String = js.native
    /* "INVALID_ENCRYPTED_CARD" */ val INVALID_ENCRYPTED_CARD: INVALID_ENCRYPTED_CARD with java.lang.String = js.native
    /* "INVALID_ENUM_VALUE" */ val INVALID_ENUM_VALUE: INVALID_ENUM_VALUE with java.lang.String = js.native
    /* "INVALID_EXPIRATION" */ val INVALID_EXPIRATION: INVALID_EXPIRATION with java.lang.String = js.native
    /* "INVALID_EXPIRATION_DATE" */ val INVALID_EXPIRATION_DATE: INVALID_EXPIRATION_DATE with java.lang.String = js.native
    /* "INVALID_EXPIRATION_YEAR" */ val INVALID_EXPIRATION_YEAR: INVALID_EXPIRATION_YEAR with java.lang.String = js.native
    /* "INVALID_FORM_VALUE" */ val INVALID_FORM_VALUE: INVALID_FORM_VALUE with java.lang.String = js.native
    /* "INVALID_PHONE_NUMBER" */ val INVALID_PHONE_NUMBER: INVALID_PHONE_NUMBER with java.lang.String = js.native
    /* "INVALID_SORT_ORDER" */ val INVALID_SORT_ORDER: INVALID_SORT_ORDER with java.lang.String = js.native
    /* "INVALID_SQUARE_VERSION_FORMAT" */ val INVALID_SQUARE_VERSION_FORMAT: INVALID_SQUARE_VERSION_FORMAT with java.lang.String = js.native
    /* "INVALID_TIME" */ val INVALID_TIME: INVALID_TIME with java.lang.String = js.native
    /* "INVALID_TIME_RANGE" */ val INVALID_TIME_RANGE: INVALID_TIME_RANGE with java.lang.String = js.native
    /* "INVALID_VALUE" */ val INVALID_VALUE: INVALID_VALUE with java.lang.String = js.native
    /* "LOCATION_MISMATCH" */ val LOCATION_MISMATCH: LOCATION_MISMATCH with java.lang.String = js.native
    /* "METHOD_NOT_ALLOWED" */ val METHOD_NOT_ALLOWED: METHOD_NOT_ALLOWED with java.lang.String = js.native
    /* "MISSING_REQUIRED_PARAMETER" */ val MISSING_REQUIRED_PARAMETER: MISSING_REQUIRED_PARAMETER with java.lang.String = js.native
    /* "NOT_ACCEPTABLE" */ val NOT_ACCEPTABLE: NOT_ACCEPTABLE with java.lang.String = js.native
    /* "NOT_FOUND" */ val NOT_FOUND: NOT_FOUND with java.lang.String = js.native
    /* "NOT_IMPLEMENTED" */ val NOT_IMPLEMENTED: NOT_IMPLEMENTED with java.lang.String = js.native
    /* "NO_FIELDS_SET" */ val NO_FIELDS_SET: NO_FIELDS_SET with java.lang.String = js.native
    /* "ONE_INSTRUMENT_EXPECTED" */ val ONE_INSTRUMENT_EXPECTED: ONE_INSTRUMENT_EXPECTED with java.lang.String = js.native
    /* "PAYMENT_NOT_REFUNDABLE" */ val PAYMENT_NOT_REFUNDABLE: PAYMENT_NOT_REFUNDABLE with java.lang.String = js.native
    /* "RATE_LIMITED" */ val RATE_LIMITED: RATE_LIMITED with java.lang.String = js.native
    /* "REFUND_ALREADY_PENDING" */ val REFUND_ALREADY_PENDING: REFUND_ALREADY_PENDING with java.lang.String = js.native
    /* "REFUND_AMOUNT_INVALID" */ val REFUND_AMOUNT_INVALID: REFUND_AMOUNT_INVALID with java.lang.String = js.native
    /* "REQUEST_ENTITY_TOO_LARGE" */ val REQUEST_ENTITY_TOO_LARGE: REQUEST_ENTITY_TOO_LARGE with java.lang.String = js.native
    /* "REQUEST_TIMEOUT" */ val REQUEST_TIMEOUT: REQUEST_TIMEOUT with java.lang.String = js.native
    /* "SANDBOX_NOT_SUPPORTED" */ val SANDBOX_NOT_SUPPORTED: SANDBOX_NOT_SUPPORTED with java.lang.String = js.native
    /* "SERVICE_UNAVAILABLE" */ val SERVICE_UNAVAILABLE: SERVICE_UNAVAILABLE with java.lang.String = js.native
    /* "UNAUTHORIZED" */ val UNAUTHORIZED: UNAUTHORIZED with java.lang.String = js.native
    /* "UNEXPECTED_VALUE" */ val UNEXPECTED_VALUE: UNEXPECTED_VALUE with java.lang.String = js.native
    /* "UNKNOWN_QUERY_PARAMETER" */ val UNKNOWN_QUERY_PARAMETER: UNKNOWN_QUERY_PARAMETER with java.lang.String = js.native
    /* "UNSUPPORTED_CARD_BRAND" */ val UNSUPPORTED_CARD_BRAND: UNSUPPORTED_CARD_BRAND with java.lang.String = js.native
    /* "UNSUPPORTED_ENTRY_METHOD" */ val UNSUPPORTED_ENTRY_METHOD: UNSUPPORTED_ENTRY_METHOD with java.lang.String = js.native
    /* "UNSUPPORTED_INSTRUMENT_TYPE" */ val UNSUPPORTED_INSTRUMENT_TYPE: UNSUPPORTED_INSTRUMENT_TYPE with java.lang.String = js.native
    /* "UNSUPPORTED_MEDIA_TYPE" */ val UNSUPPORTED_MEDIA_TYPE: UNSUPPORTED_MEDIA_TYPE with java.lang.String = js.native
    /* "V1_ACCESS_TOKEN" */ val V1_ACCESS_TOKEN: V1_ACCESS_TOKEN with java.lang.String = js.native
    /* "V1_APPLICATION" */ val V1_APPLICATION: V1_APPLICATION with java.lang.String = js.native
    /* "VALUE_EMPTY" */ val VALUE_EMPTY: VALUE_EMPTY with java.lang.String = js.native
    /* "VALUE_REGEX_MISMATCH" */ val VALUE_REGEX_MISMATCH: VALUE_REGEX_MISMATCH with java.lang.String = js.native
    /* "VALUE_TOO_HIGH" */ val VALUE_TOO_HIGH: VALUE_TOO_HIGH with java.lang.String = js.native
    /* "VALUE_TOO_LONG" */ val VALUE_TOO_LONG: VALUE_TOO_LONG with java.lang.String = js.native
    /* "VALUE_TOO_LOW" */ val VALUE_TOO_LOW: VALUE_TOO_LOW with java.lang.String = js.native
    /* "VALUE_TOO_SHORT" */ val VALUE_TOO_SHORT: VALUE_TOO_SHORT with java.lang.String = js.native
    /* "VERIFY_AVS_FAILURE" */ val VERIFY_AVS_FAILURE: VERIFY_AVS_FAILURE with java.lang.String = js.native
    /* "VERIFY_CVV_FAILURE" */ val VERIFY_CVV_FAILURE: VERIFY_CVV_FAILURE with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum with java.lang.String
      ] = js.native
  }
  
}

