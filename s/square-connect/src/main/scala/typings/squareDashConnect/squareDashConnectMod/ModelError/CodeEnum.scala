package typings.squareDashConnect.squareDashConnectMod.ModelError

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CodeEnum extends js.Object

@JSImport("square-connect", "ModelError.CodeEnum")
@js.native
object CodeEnum extends js.Object {
  @js.native
  sealed trait ACCESS_TOKEN_EXPIRED extends CodeEnum
  
  @js.native
  sealed trait ACCESS_TOKEN_REVOKED extends CodeEnum
  
  @js.native
  sealed trait AMOUNT_TOO_HIGH extends CodeEnum
  
  @js.native
  sealed trait API_VERSION_INCOMPATIBLE extends CodeEnum
  
  @js.native
  sealed trait APPLE_PAYMENT_PROCESSING_CERTIFICATE_HASH_NOT_FOUND extends CodeEnum
  
  @js.native
  sealed trait APPLICATION_DISABLED extends CodeEnum
  
  @js.native
  sealed trait ARRAY_EMPTY extends CodeEnum
  
  @js.native
  sealed trait ARRAY_LENGTH_TOO_LONG extends CodeEnum
  
  @js.native
  sealed trait ARRAY_LENGTH_TOO_SHORT extends CodeEnum
  
  @js.native
  sealed trait BAD_CERTIFICATE extends CodeEnum
  
  @js.native
  sealed trait BAD_REQUEST extends CodeEnum
  
  @js.native
  sealed trait CARD_DECLINED extends CodeEnum
  
  @js.native
  sealed trait CARD_DECLINED_CALL_ISSUER extends CodeEnum
  
  @js.native
  sealed trait CARD_EXPIRED extends CodeEnum
  
  @js.native
  sealed trait CARD_PROCESSING_NOT_ENABLED extends CodeEnum
  
  @js.native
  sealed trait CARD_TOKEN_EXPIRED extends CodeEnum
  
  @js.native
  sealed trait CARD_TOKEN_USED extends CodeEnum
  
  @js.native
  sealed trait CHECKOUT_EXPIRED extends CodeEnum
  
  @js.native
  sealed trait CONFLICT extends CodeEnum
  
  @js.native
  sealed trait CONFLICTING_PARAMETERS extends CodeEnum
  
  @js.native
  sealed trait DELAYED_TRANSACTION_CANCELED extends CodeEnum
  
  @js.native
  sealed trait DELAYED_TRANSACTION_CAPTURED extends CodeEnum
  
  @js.native
  sealed trait DELAYED_TRANSACTION_EXPIRED extends CodeEnum
  
  @js.native
  sealed trait DELAYED_TRANSACTION_FAILED extends CodeEnum
  
  @js.native
  sealed trait DEPRECATED_FIELD_SET extends CodeEnum
  
  @js.native
  sealed trait EXPECTED_ARRAY extends CodeEnum
  
  @js.native
  sealed trait EXPECTED_BASE64_ENCODED_BYTE_ARRAY extends CodeEnum
  
  @js.native
  sealed trait EXPECTED_BOOLEAN extends CodeEnum
  
  @js.native
  sealed trait EXPECTED_FLOAT extends CodeEnum
  
  @js.native
  sealed trait EXPECTED_INTEGER extends CodeEnum
  
  @js.native
  sealed trait EXPECTED_JSON_BODY extends CodeEnum
  
  @js.native
  sealed trait EXPECTED_MAP extends CodeEnum
  
  @js.native
  sealed trait EXPECTED_OBJECT extends CodeEnum
  
  @js.native
  sealed trait EXPECTED_STRING extends CodeEnum
  
  @js.native
  sealed trait FORBIDDEN extends CodeEnum
  
  @js.native
  sealed trait GATEWAY_TIMEOUT extends CodeEnum
  
  @js.native
  sealed trait IDEMPOTENCY_KEY_REUSED extends CodeEnum
  
  @js.native
  sealed trait INCORRECT_TYPE extends CodeEnum
  
  @js.native
  sealed trait INSUFFICIENT_SCOPES extends CodeEnum
  
  @js.native
  sealed trait INTERNAL_SERVER_ERROR extends CodeEnum
  
  @js.native
  sealed trait INVALID_ARRAY_VALUE extends CodeEnum
  
  @js.native
  sealed trait INVALID_CARD extends CodeEnum
  
  @js.native
  sealed trait INVALID_CARD_DATA extends CodeEnum
  
  @js.native
  sealed trait INVALID_CONTENT_TYPE extends CodeEnum
  
  @js.native
  sealed trait INVALID_CURSOR extends CodeEnum
  
  @js.native
  sealed trait INVALID_EMAIL_ADDRESS extends CodeEnum
  
  @js.native
  sealed trait INVALID_ENCRYPTED_CARD extends CodeEnum
  
  @js.native
  sealed trait INVALID_ENUM_VALUE extends CodeEnum
  
  @js.native
  sealed trait INVALID_EXPIRATION extends CodeEnum
  
  @js.native
  sealed trait INVALID_EXPIRATION_DATE extends CodeEnum
  
  @js.native
  sealed trait INVALID_EXPIRATION_YEAR extends CodeEnum
  
  @js.native
  sealed trait INVALID_FORM_VALUE extends CodeEnum
  
  @js.native
  sealed trait INVALID_PHONE_NUMBER extends CodeEnum
  
  @js.native
  sealed trait INVALID_SORT_ORDER extends CodeEnum
  
  @js.native
  sealed trait INVALID_SQUARE_VERSION_FORMAT extends CodeEnum
  
  @js.native
  sealed trait INVALID_TIME extends CodeEnum
  
  @js.native
  sealed trait INVALID_TIME_RANGE extends CodeEnum
  
  @js.native
  sealed trait INVALID_VALUE extends CodeEnum
  
  @js.native
  sealed trait LOCATION_MISMATCH extends CodeEnum
  
  @js.native
  sealed trait METHOD_NOT_ALLOWED extends CodeEnum
  
  @js.native
  sealed trait MISSING_REQUIRED_PARAMETER extends CodeEnum
  
  @js.native
  sealed trait NOT_ACCEPTABLE extends CodeEnum
  
  @js.native
  sealed trait NOT_FOUND extends CodeEnum
  
  @js.native
  sealed trait NOT_IMPLEMENTED extends CodeEnum
  
  @js.native
  sealed trait NO_FIELDS_SET extends CodeEnum
  
  @js.native
  sealed trait ONE_INSTRUMENT_EXPECTED extends CodeEnum
  
  @js.native
  sealed trait PAYMENT_NOT_REFUNDABLE extends CodeEnum
  
  @js.native
  sealed trait RATE_LIMITED extends CodeEnum
  
  @js.native
  sealed trait REFUND_ALREADY_PENDING extends CodeEnum
  
  @js.native
  sealed trait REFUND_AMOUNT_INVALID extends CodeEnum
  
  @js.native
  sealed trait REQUEST_ENTITY_TOO_LARGE extends CodeEnum
  
  @js.native
  sealed trait REQUEST_TIMEOUT extends CodeEnum
  
  @js.native
  sealed trait SANDBOX_NOT_SUPPORTED extends CodeEnum
  
  @js.native
  sealed trait SERVICE_UNAVAILABLE extends CodeEnum
  
  @js.native
  sealed trait UNAUTHORIZED extends CodeEnum
  
  @js.native
  sealed trait UNEXPECTED_VALUE extends CodeEnum
  
  @js.native
  sealed trait UNKNOWN_QUERY_PARAMETER extends CodeEnum
  
  @js.native
  sealed trait UNSUPPORTED_CARD_BRAND extends CodeEnum
  
  @js.native
  sealed trait UNSUPPORTED_ENTRY_METHOD extends CodeEnum
  
  @js.native
  sealed trait UNSUPPORTED_INSTRUMENT_TYPE extends CodeEnum
  
  @js.native
  sealed trait UNSUPPORTED_MEDIA_TYPE extends CodeEnum
  
  @js.native
  sealed trait V1_ACCESS_TOKEN extends CodeEnum
  
  @js.native
  sealed trait V1_APPLICATION extends CodeEnum
  
  @js.native
  sealed trait VALUE_EMPTY extends CodeEnum
  
  @js.native
  sealed trait VALUE_REGEX_MISMATCH extends CodeEnum
  
  @js.native
  sealed trait VALUE_TOO_HIGH extends CodeEnum
  
  @js.native
  sealed trait VALUE_TOO_LONG extends CodeEnum
  
  @js.native
  sealed trait VALUE_TOO_LOW extends CodeEnum
  
  @js.native
  sealed trait VALUE_TOO_SHORT extends CodeEnum
  
  @js.native
  sealed trait VERIFY_AVS_FAILURE extends CodeEnum
  
  @js.native
  sealed trait VERIFY_CVV_FAILURE extends CodeEnum
  
  /* "ACCESS_TOKEN_EXPIRED" */ val ACCESS_TOKEN_EXPIRED: typings.squareDashConnect.squareDashConnectMod.ModelError.CodeEnum.ACCESS_TOKEN_EXPIRED with String = js.native
  /* "ACCESS_TOKEN_REVOKED" */ val ACCESS_TOKEN_REVOKED: typings.squareDashConnect.squareDashConnectMod.ModelError.CodeEnum.ACCESS_TOKEN_REVOKED with String = js.native
  /* "AMOUNT_TOO_HIGH" */ val AMOUNT_TOO_HIGH: typings.squareDashConnect.squareDashConnectMod.ModelError.CodeEnum.AMOUNT_TOO_HIGH with String = js.native
  /* "API_VERSION_INCOMPATIBLE" */ val API_VERSION_INCOMPATIBLE: typings.squareDashConnect.squareDashConnectMod.ModelError.CodeEnum.API_VERSION_INCOMPATIBLE with String = js.native
  /* "APPLE_PAYMENT_PROCESSING_CERTIFICATE_HASH_NOT_FOUND" */ val APPLE_PAYMENT_PROCESSING_CERTIFICATE_HASH_NOT_FOUND: typings.squareDashConnect.squareDashConnectMod.ModelError.CodeEnum.APPLE_PAYMENT_PROCESSING_CERTIFICATE_HASH_NOT_FOUND with String = js.native
  /* "APPLICATION_DISABLED" */ val APPLICATION_DISABLED: typings.squareDashConnect.squareDashConnectMod.ModelError.CodeEnum.APPLICATION_DISABLED with String = js.native
  /* "ARRAY_EMPTY" */ val ARRAY_EMPTY: typings.squareDashConnect.squareDashConnectMod.ModelError.CodeEnum.ARRAY_EMPTY with String = js.native
  /* "ARRAY_LENGTH_TOO_LONG" */ val ARRAY_LENGTH_TOO_LONG: typings.squareDashConnect.squareDashConnectMod.ModelError.CodeEnum.ARRAY_LENGTH_TOO_LONG with String = js.native
  /* "ARRAY_LENGTH_TOO_SHORT" */ val ARRAY_LENGTH_TOO_SHORT: typings.squareDashConnect.squareDashConnectMod.ModelError.CodeEnum.ARRAY_LENGTH_TOO_SHORT with String = js.native
  /* "BAD_CERTIFICATE" */ val BAD_CERTIFICATE: typings.squareDashConnect.squareDashConnectMod.ModelError.CodeEnum.BAD_CERTIFICATE with String = js.native
  /* "BAD_REQUEST" */ val BAD_REQUEST: typings.squareDashConnect.squareDashConnectMod.ModelError.CodeEnum.BAD_REQUEST with String = js.native
  /* "CARD_DECLINED" */ val CARD_DECLINED: typings.squareDashConnect.squareDashConnectMod.ModelError.CodeEnum.CARD_DECLINED with String = js.native
  /* "CARD_DECLINED_CALL_ISSUER" */ val CARD_DECLINED_CALL_ISSUER: typings.squareDashConnect.squareDashConnectMod.ModelError.CodeEnum.CARD_DECLINED_CALL_ISSUER with String = js.native
  /* "CARD_EXPIRED" */ val CARD_EXPIRED: typings.squareDashConnect.squareDashConnectMod.ModelError.CodeEnum.CARD_EXPIRED with String = js.native
  /* "CARD_PROCESSING_NOT_ENABLED" */ val CARD_PROCESSING_NOT_ENABLED: typings.squareDashConnect.squareDashConnectMod.ModelError.CodeEnum.CARD_PROCESSING_NOT_ENABLED with String = js.native
  /* "CARD_TOKEN_EXPIRED" */ val CARD_TOKEN_EXPIRED: typings.squareDashConnect.squareDashConnectMod.ModelError.CodeEnum.CARD_TOKEN_EXPIRED with String = js.native
  /* "CARD_TOKEN_USED" */ val CARD_TOKEN_USED: typings.squareDashConnect.squareDashConnectMod.ModelError.CodeEnum.CARD_TOKEN_USED with String = js.native
  /* "CHECKOUT_EXPIRED" */ val CHECKOUT_EXPIRED: typings.squareDashConnect.squareDashConnectMod.ModelError.CodeEnum.CHECKOUT_EXPIRED with String = js.native
  /* "CONFLICT" */ val CONFLICT: typings.squareDashConnect.squareDashConnectMod.ModelError.CodeEnum.CONFLICT with String = js.native
  /* "CONFLICTING_PARAMETERS" */ val CONFLICTING_PARAMETERS: typings.squareDashConnect.squareDashConnectMod.ModelError.CodeEnum.CONFLICTING_PARAMETERS with String = js.native
  /* "DELAYED_TRANSACTION_CANCELED" */ val DELAYED_TRANSACTION_CANCELED: typings.squareDashConnect.squareDashConnectMod.ModelError.CodeEnum.DELAYED_TRANSACTION_CANCELED with String = js.native
  /* "DELAYED_TRANSACTION_CAPTURED" */ val DELAYED_TRANSACTION_CAPTURED: typings.squareDashConnect.squareDashConnectMod.ModelError.CodeEnum.DELAYED_TRANSACTION_CAPTURED with String = js.native
  /* "DELAYED_TRANSACTION_EXPIRED" */ val DELAYED_TRANSACTION_EXPIRED: typings.squareDashConnect.squareDashConnectMod.ModelError.CodeEnum.DELAYED_TRANSACTION_EXPIRED with String = js.native
  /* "DELAYED_TRANSACTION_FAILED" */ val DELAYED_TRANSACTION_FAILED: typings.squareDashConnect.squareDashConnectMod.ModelError.CodeEnum.DELAYED_TRANSACTION_FAILED with String = js.native
  /* "DEPRECATED_FIELD_SET" */ val DEPRECATED_FIELD_SET: typings.squareDashConnect.squareDashConnectMod.ModelError.CodeEnum.DEPRECATED_FIELD_SET with String = js.native
  /* "EXPECTED_ARRAY" */ val EXPECTED_ARRAY: typings.squareDashConnect.squareDashConnectMod.ModelError.CodeEnum.EXPECTED_ARRAY with String = js.native
  /* "EXPECTED_BASE64_ENCODED_BYTE_ARRAY" */ val EXPECTED_BASE64_ENCODED_BYTE_ARRAY: typings.squareDashConnect.squareDashConnectMod.ModelError.CodeEnum.EXPECTED_BASE64_ENCODED_BYTE_ARRAY with String = js.native
  /* "EXPECTED_BOOLEAN" */ val EXPECTED_BOOLEAN: typings.squareDashConnect.squareDashConnectMod.ModelError.CodeEnum.EXPECTED_BOOLEAN with String = js.native
  /* "EXPECTED_FLOAT" */ val EXPECTED_FLOAT: typings.squareDashConnect.squareDashConnectMod.ModelError.CodeEnum.EXPECTED_FLOAT with String = js.native
  /* "EXPECTED_INTEGER" */ val EXPECTED_INTEGER: typings.squareDashConnect.squareDashConnectMod.ModelError.CodeEnum.EXPECTED_INTEGER with String = js.native
  /* "EXPECTED_JSON_BODY" */ val EXPECTED_JSON_BODY: typings.squareDashConnect.squareDashConnectMod.ModelError.CodeEnum.EXPECTED_JSON_BODY with String = js.native
  /* "EXPECTED_MAP" */ val EXPECTED_MAP: typings.squareDashConnect.squareDashConnectMod.ModelError.CodeEnum.EXPECTED_MAP with String = js.native
  /* "EXPECTED_OBJECT" */ val EXPECTED_OBJECT: typings.squareDashConnect.squareDashConnectMod.ModelError.CodeEnum.EXPECTED_OBJECT with String = js.native
  /* "EXPECTED_STRING" */ val EXPECTED_STRING: typings.squareDashConnect.squareDashConnectMod.ModelError.CodeEnum.EXPECTED_STRING with String = js.native
  /* "FORBIDDEN" */ val FORBIDDEN: typings.squareDashConnect.squareDashConnectMod.ModelError.CodeEnum.FORBIDDEN with String = js.native
  /* "GATEWAY_TIMEOUT" */ val GATEWAY_TIMEOUT: typings.squareDashConnect.squareDashConnectMod.ModelError.CodeEnum.GATEWAY_TIMEOUT with String = js.native
  /* "IDEMPOTENCY_KEY_REUSED" */ val IDEMPOTENCY_KEY_REUSED: typings.squareDashConnect.squareDashConnectMod.ModelError.CodeEnum.IDEMPOTENCY_KEY_REUSED with String = js.native
  /* "INCORRECT_TYPE" */ val INCORRECT_TYPE: typings.squareDashConnect.squareDashConnectMod.ModelError.CodeEnum.INCORRECT_TYPE with String = js.native
  /* "INSUFFICIENT_SCOPES" */ val INSUFFICIENT_SCOPES: typings.squareDashConnect.squareDashConnectMod.ModelError.CodeEnum.INSUFFICIENT_SCOPES with String = js.native
  /* "INTERNAL_SERVER_ERROR" */ val INTERNAL_SERVER_ERROR: typings.squareDashConnect.squareDashConnectMod.ModelError.CodeEnum.INTERNAL_SERVER_ERROR with String = js.native
  /* "INVALID_ARRAY_VALUE" */ val INVALID_ARRAY_VALUE: typings.squareDashConnect.squareDashConnectMod.ModelError.CodeEnum.INVALID_ARRAY_VALUE with String = js.native
  /* "INVALID_CARD" */ val INVALID_CARD: typings.squareDashConnect.squareDashConnectMod.ModelError.CodeEnum.INVALID_CARD with String = js.native
  /* "INVALID_CARD_DATA" */ val INVALID_CARD_DATA: typings.squareDashConnect.squareDashConnectMod.ModelError.CodeEnum.INVALID_CARD_DATA with String = js.native
  /* "INVALID_CONTENT_TYPE" */ val INVALID_CONTENT_TYPE: typings.squareDashConnect.squareDashConnectMod.ModelError.CodeEnum.INVALID_CONTENT_TYPE with String = js.native
  /* "INVALID_CURSOR" */ val INVALID_CURSOR: typings.squareDashConnect.squareDashConnectMod.ModelError.CodeEnum.INVALID_CURSOR with String = js.native
  /* "INVALID_EMAIL_ADDRESS" */ val INVALID_EMAIL_ADDRESS: typings.squareDashConnect.squareDashConnectMod.ModelError.CodeEnum.INVALID_EMAIL_ADDRESS with String = js.native
  /* "INVALID_ENCRYPTED_CARD" */ val INVALID_ENCRYPTED_CARD: typings.squareDashConnect.squareDashConnectMod.ModelError.CodeEnum.INVALID_ENCRYPTED_CARD with String = js.native
  /* "INVALID_ENUM_VALUE" */ val INVALID_ENUM_VALUE: typings.squareDashConnect.squareDashConnectMod.ModelError.CodeEnum.INVALID_ENUM_VALUE with String = js.native
  /* "INVALID_EXPIRATION" */ val INVALID_EXPIRATION: typings.squareDashConnect.squareDashConnectMod.ModelError.CodeEnum.INVALID_EXPIRATION with String = js.native
  /* "INVALID_EXPIRATION_DATE" */ val INVALID_EXPIRATION_DATE: typings.squareDashConnect.squareDashConnectMod.ModelError.CodeEnum.INVALID_EXPIRATION_DATE with String = js.native
  /* "INVALID_EXPIRATION_YEAR" */ val INVALID_EXPIRATION_YEAR: typings.squareDashConnect.squareDashConnectMod.ModelError.CodeEnum.INVALID_EXPIRATION_YEAR with String = js.native
  /* "INVALID_FORM_VALUE" */ val INVALID_FORM_VALUE: typings.squareDashConnect.squareDashConnectMod.ModelError.CodeEnum.INVALID_FORM_VALUE with String = js.native
  /* "INVALID_PHONE_NUMBER" */ val INVALID_PHONE_NUMBER: typings.squareDashConnect.squareDashConnectMod.ModelError.CodeEnum.INVALID_PHONE_NUMBER with String = js.native
  /* "INVALID_SORT_ORDER" */ val INVALID_SORT_ORDER: typings.squareDashConnect.squareDashConnectMod.ModelError.CodeEnum.INVALID_SORT_ORDER with String = js.native
  /* "INVALID_SQUARE_VERSION_FORMAT" */ val INVALID_SQUARE_VERSION_FORMAT: typings.squareDashConnect.squareDashConnectMod.ModelError.CodeEnum.INVALID_SQUARE_VERSION_FORMAT with String = js.native
  /* "INVALID_TIME" */ val INVALID_TIME: typings.squareDashConnect.squareDashConnectMod.ModelError.CodeEnum.INVALID_TIME with String = js.native
  /* "INVALID_TIME_RANGE" */ val INVALID_TIME_RANGE: typings.squareDashConnect.squareDashConnectMod.ModelError.CodeEnum.INVALID_TIME_RANGE with String = js.native
  /* "INVALID_VALUE" */ val INVALID_VALUE: typings.squareDashConnect.squareDashConnectMod.ModelError.CodeEnum.INVALID_VALUE with String = js.native
  /* "LOCATION_MISMATCH" */ val LOCATION_MISMATCH: typings.squareDashConnect.squareDashConnectMod.ModelError.CodeEnum.LOCATION_MISMATCH with String = js.native
  /* "METHOD_NOT_ALLOWED" */ val METHOD_NOT_ALLOWED: typings.squareDashConnect.squareDashConnectMod.ModelError.CodeEnum.METHOD_NOT_ALLOWED with String = js.native
  /* "MISSING_REQUIRED_PARAMETER" */ val MISSING_REQUIRED_PARAMETER: typings.squareDashConnect.squareDashConnectMod.ModelError.CodeEnum.MISSING_REQUIRED_PARAMETER with String = js.native
  /* "NOT_ACCEPTABLE" */ val NOT_ACCEPTABLE: typings.squareDashConnect.squareDashConnectMod.ModelError.CodeEnum.NOT_ACCEPTABLE with String = js.native
  /* "NOT_FOUND" */ val NOT_FOUND: typings.squareDashConnect.squareDashConnectMod.ModelError.CodeEnum.NOT_FOUND with String = js.native
  /* "NOT_IMPLEMENTED" */ val NOT_IMPLEMENTED: typings.squareDashConnect.squareDashConnectMod.ModelError.CodeEnum.NOT_IMPLEMENTED with String = js.native
  /* "NO_FIELDS_SET" */ val NO_FIELDS_SET: typings.squareDashConnect.squareDashConnectMod.ModelError.CodeEnum.NO_FIELDS_SET with String = js.native
  /* "ONE_INSTRUMENT_EXPECTED" */ val ONE_INSTRUMENT_EXPECTED: typings.squareDashConnect.squareDashConnectMod.ModelError.CodeEnum.ONE_INSTRUMENT_EXPECTED with String = js.native
  /* "PAYMENT_NOT_REFUNDABLE" */ val PAYMENT_NOT_REFUNDABLE: typings.squareDashConnect.squareDashConnectMod.ModelError.CodeEnum.PAYMENT_NOT_REFUNDABLE with String = js.native
  /* "RATE_LIMITED" */ val RATE_LIMITED: typings.squareDashConnect.squareDashConnectMod.ModelError.CodeEnum.RATE_LIMITED with String = js.native
  /* "REFUND_ALREADY_PENDING" */ val REFUND_ALREADY_PENDING: typings.squareDashConnect.squareDashConnectMod.ModelError.CodeEnum.REFUND_ALREADY_PENDING with String = js.native
  /* "REFUND_AMOUNT_INVALID" */ val REFUND_AMOUNT_INVALID: typings.squareDashConnect.squareDashConnectMod.ModelError.CodeEnum.REFUND_AMOUNT_INVALID with String = js.native
  /* "REQUEST_ENTITY_TOO_LARGE" */ val REQUEST_ENTITY_TOO_LARGE: typings.squareDashConnect.squareDashConnectMod.ModelError.CodeEnum.REQUEST_ENTITY_TOO_LARGE with String = js.native
  /* "REQUEST_TIMEOUT" */ val REQUEST_TIMEOUT: typings.squareDashConnect.squareDashConnectMod.ModelError.CodeEnum.REQUEST_TIMEOUT with String = js.native
  /* "SANDBOX_NOT_SUPPORTED" */ val SANDBOX_NOT_SUPPORTED: typings.squareDashConnect.squareDashConnectMod.ModelError.CodeEnum.SANDBOX_NOT_SUPPORTED with String = js.native
  /* "SERVICE_UNAVAILABLE" */ val SERVICE_UNAVAILABLE: typings.squareDashConnect.squareDashConnectMod.ModelError.CodeEnum.SERVICE_UNAVAILABLE with String = js.native
  /* "UNAUTHORIZED" */ val UNAUTHORIZED: typings.squareDashConnect.squareDashConnectMod.ModelError.CodeEnum.UNAUTHORIZED with String = js.native
  /* "UNEXPECTED_VALUE" */ val UNEXPECTED_VALUE: typings.squareDashConnect.squareDashConnectMod.ModelError.CodeEnum.UNEXPECTED_VALUE with String = js.native
  /* "UNKNOWN_QUERY_PARAMETER" */ val UNKNOWN_QUERY_PARAMETER: typings.squareDashConnect.squareDashConnectMod.ModelError.CodeEnum.UNKNOWN_QUERY_PARAMETER with String = js.native
  /* "UNSUPPORTED_CARD_BRAND" */ val UNSUPPORTED_CARD_BRAND: typings.squareDashConnect.squareDashConnectMod.ModelError.CodeEnum.UNSUPPORTED_CARD_BRAND with String = js.native
  /* "UNSUPPORTED_ENTRY_METHOD" */ val UNSUPPORTED_ENTRY_METHOD: typings.squareDashConnect.squareDashConnectMod.ModelError.CodeEnum.UNSUPPORTED_ENTRY_METHOD with String = js.native
  /* "UNSUPPORTED_INSTRUMENT_TYPE" */ val UNSUPPORTED_INSTRUMENT_TYPE: typings.squareDashConnect.squareDashConnectMod.ModelError.CodeEnum.UNSUPPORTED_INSTRUMENT_TYPE with String = js.native
  /* "UNSUPPORTED_MEDIA_TYPE" */ val UNSUPPORTED_MEDIA_TYPE: typings.squareDashConnect.squareDashConnectMod.ModelError.CodeEnum.UNSUPPORTED_MEDIA_TYPE with String = js.native
  /* "V1_ACCESS_TOKEN" */ val V1_ACCESS_TOKEN: typings.squareDashConnect.squareDashConnectMod.ModelError.CodeEnum.V1_ACCESS_TOKEN with String = js.native
  /* "V1_APPLICATION" */ val V1_APPLICATION: typings.squareDashConnect.squareDashConnectMod.ModelError.CodeEnum.V1_APPLICATION with String = js.native
  /* "VALUE_EMPTY" */ val VALUE_EMPTY: typings.squareDashConnect.squareDashConnectMod.ModelError.CodeEnum.VALUE_EMPTY with String = js.native
  /* "VALUE_REGEX_MISMATCH" */ val VALUE_REGEX_MISMATCH: typings.squareDashConnect.squareDashConnectMod.ModelError.CodeEnum.VALUE_REGEX_MISMATCH with String = js.native
  /* "VALUE_TOO_HIGH" */ val VALUE_TOO_HIGH: typings.squareDashConnect.squareDashConnectMod.ModelError.CodeEnum.VALUE_TOO_HIGH with String = js.native
  /* "VALUE_TOO_LONG" */ val VALUE_TOO_LONG: typings.squareDashConnect.squareDashConnectMod.ModelError.CodeEnum.VALUE_TOO_LONG with String = js.native
  /* "VALUE_TOO_LOW" */ val VALUE_TOO_LOW: typings.squareDashConnect.squareDashConnectMod.ModelError.CodeEnum.VALUE_TOO_LOW with String = js.native
  /* "VALUE_TOO_SHORT" */ val VALUE_TOO_SHORT: typings.squareDashConnect.squareDashConnectMod.ModelError.CodeEnum.VALUE_TOO_SHORT with String = js.native
  /* "VERIFY_AVS_FAILURE" */ val VERIFY_AVS_FAILURE: typings.squareDashConnect.squareDashConnectMod.ModelError.CodeEnum.VERIFY_AVS_FAILURE with String = js.native
  /* "VERIFY_CVV_FAILURE" */ val VERIFY_CVV_FAILURE: typings.squareDashConnect.squareDashConnectMod.ModelError.CodeEnum.VERIFY_CVV_FAILURE with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CodeEnum with String] = js.native
}

