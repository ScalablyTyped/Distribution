package typings.squareDashConnect.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.squareDashConnect.squareDashConnectStrings.INTERNAL_SERVER_ERROR
  - typings.squareDashConnect.squareDashConnectStrings.UNAUTHORIZED
  - typings.squareDashConnect.squareDashConnectStrings.ACCESS_TOKEN_EXPIRED
  - typings.squareDashConnect.squareDashConnectStrings.ACCESS_TOKEN_REVOKED
  - typings.squareDashConnect.squareDashConnectStrings.FORBIDDEN
  - typings.squareDashConnect.squareDashConnectStrings.INSUFFICIENT_SCOPES
  - typings.squareDashConnect.squareDashConnectStrings.APPLICATION_DISABLED
  - typings.squareDashConnect.squareDashConnectStrings.V1_APPLICATION
  - typings.squareDashConnect.squareDashConnectStrings.V1_ACCESS_TOKEN
  - typings.squareDashConnect.squareDashConnectStrings.CARD_PROCESSING_NOT_ENABLED
  - typings.squareDashConnect.squareDashConnectStrings.BAD_REQUEST
  - typings.squareDashConnect.squareDashConnectStrings.MISSING_REQUIRED_PARAMETER
  - typings.squareDashConnect.squareDashConnectStrings.INCORRECT_TYPE
  - typings.squareDashConnect.squareDashConnectStrings.INVALID_TIME
  - typings.squareDashConnect.squareDashConnectStrings.INVALID_TIME_RANGE
  - typings.squareDashConnect.squareDashConnectStrings.INVALID_VALUE
  - typings.squareDashConnect.squareDashConnectStrings.INVALID_CURSOR
  - typings.squareDashConnect.squareDashConnectStrings.UNKNOWN_QUERY_PARAMETER
  - typings.squareDashConnect.squareDashConnectStrings.CONFLICTING_PARAMETERS
  - typings.squareDashConnect.squareDashConnectStrings.EXPECTED_JSON_BODY
  - typings.squareDashConnect.squareDashConnectStrings.INVALID_SORT_ORDER
  - typings.squareDashConnect.squareDashConnectStrings.VALUE_REGEX_MISMATCH
  - typings.squareDashConnect.squareDashConnectStrings.VALUE_TOO_SHORT
  - typings.squareDashConnect.squareDashConnectStrings.VALUE_TOO_LONG
  - typings.squareDashConnect.squareDashConnectStrings.VALUE_TOO_LOW
  - typings.squareDashConnect.squareDashConnectStrings.VALUE_TOO_HIGH
  - typings.squareDashConnect.squareDashConnectStrings.VALUE_EMPTY
  - typings.squareDashConnect.squareDashConnectStrings.ARRAY_LENGTH_TOO_LONG
  - typings.squareDashConnect.squareDashConnectStrings.ARRAY_LENGTH_TOO_SHORT
  - typings.squareDashConnect.squareDashConnectStrings.ARRAY_EMPTY
  - typings.squareDashConnect.squareDashConnectStrings.EXPECTED_BOOLEAN
  - typings.squareDashConnect.squareDashConnectStrings.EXPECTED_INTEGER
  - typings.squareDashConnect.squareDashConnectStrings.EXPECTED_FLOAT
  - typings.squareDashConnect.squareDashConnectStrings.EXPECTED_STRING
  - typings.squareDashConnect.squareDashConnectStrings.EXPECTED_OBJECT
  - typings.squareDashConnect.squareDashConnectStrings.EXPECTED_ARRAY
  - typings.squareDashConnect.squareDashConnectStrings.EXPECTED_MAP
  - typings.squareDashConnect.squareDashConnectStrings.EXPECTED_BASE64_ENCODED_BYTE_ARRAY
  - typings.squareDashConnect.squareDashConnectStrings.INVALID_ARRAY_VALUE
  - typings.squareDashConnect.squareDashConnectStrings.INVALID_ENUM_VALUE
  - typings.squareDashConnect.squareDashConnectStrings.INVALID_CONTENT_TYPE
  - typings.squareDashConnect.squareDashConnectStrings.INVALID_FORM_VALUE
  - typings.squareDashConnect.squareDashConnectStrings.ONE_INSTRUMENT_EXPECTED
  - typings.squareDashConnect.squareDashConnectStrings.NO_FIELDS_SET
  - typings.squareDashConnect.squareDashConnectStrings.DEPRECATED_FIELD_SET
  - typings.squareDashConnect.squareDashConnectStrings.CARD_EXPIRED
  - typings.squareDashConnect.squareDashConnectStrings.INVALID_EXPIRATION
  - typings.squareDashConnect.squareDashConnectStrings.INVALID_EXPIRATION_YEAR
  - typings.squareDashConnect.squareDashConnectStrings.INVALID_EXPIRATION_DATE
  - typings.squareDashConnect.squareDashConnectStrings.UNSUPPORTED_CARD_BRAND
  - typings.squareDashConnect.squareDashConnectStrings.UNSUPPORTED_ENTRY_METHOD
  - typings.squareDashConnect.squareDashConnectStrings.INVALID_ENCRYPTED_CARD
  - typings.squareDashConnect.squareDashConnectStrings.INVALID_CARD
  - typings.squareDashConnect.squareDashConnectStrings.DELAYED_TRANSACTION_EXPIRED
  - typings.squareDashConnect.squareDashConnectStrings.DELAYED_TRANSACTION_CANCELED
  - typings.squareDashConnect.squareDashConnectStrings.DELAYED_TRANSACTION_CAPTURED
  - typings.squareDashConnect.squareDashConnectStrings.DELAYED_TRANSACTION_FAILED
  - typings.squareDashConnect.squareDashConnectStrings.CARD_TOKEN_EXPIRED
  - typings.squareDashConnect.squareDashConnectStrings.CARD_TOKEN_USED
  - typings.squareDashConnect.squareDashConnectStrings.AMOUNT_TOO_HIGH
  - typings.squareDashConnect.squareDashConnectStrings.UNSUPPORTED_INSTRUMENT_TYPE
  - typings.squareDashConnect.squareDashConnectStrings.REFUND_AMOUNT_INVALID
  - typings.squareDashConnect.squareDashConnectStrings.REFUND_ALREADY_PENDING
  - typings.squareDashConnect.squareDashConnectStrings.PAYMENT_NOT_REFUNDABLE
  - typings.squareDashConnect.squareDashConnectStrings.INVALID_CARD_DATA
  - typings.squareDashConnect.squareDashConnectStrings.LOCATION_MISMATCH
  - typings.squareDashConnect.squareDashConnectStrings.IDEMPOTENCY_KEY_REUSED
  - typings.squareDashConnect.squareDashConnectStrings.UNEXPECTED_VALUE
  - typings.squareDashConnect.squareDashConnectStrings.SANDBOX_NOT_SUPPORTED
  - typings.squareDashConnect.squareDashConnectStrings.INVALID_EMAIL_ADDRESS
  - typings.squareDashConnect.squareDashConnectStrings.INVALID_PHONE_NUMBER
  - typings.squareDashConnect.squareDashConnectStrings.CHECKOUT_EXPIRED
  - typings.squareDashConnect.squareDashConnectStrings.BAD_CERTIFICATE
  - typings.squareDashConnect.squareDashConnectStrings.INVALID_SQUARE_VERSION_FORMAT
  - typings.squareDashConnect.squareDashConnectStrings.API_VERSION_INCOMPATIBLE
  - typings.squareDashConnect.squareDashConnectStrings.CARD_DECLINED
  - typings.squareDashConnect.squareDashConnectStrings.VERIFY_CVV_FAILURE
  - typings.squareDashConnect.squareDashConnectStrings.VERIFY_AVS_FAILURE
  - typings.squareDashConnect.squareDashConnectStrings.CARD_DECLINED_CALL_ISSUER
  - typings.squareDashConnect.squareDashConnectStrings.NOT_FOUND
  - typings.squareDashConnect.squareDashConnectStrings.APPLE_PAYMENT_PROCESSING_CERTIFICATE_HASH_NOT_FOUND
  - typings.squareDashConnect.squareDashConnectStrings.METHOD_NOT_ALLOWED
  - typings.squareDashConnect.squareDashConnectStrings.NOT_ACCEPTABLE
  - typings.squareDashConnect.squareDashConnectStrings.REQUEST_TIMEOUT
  - typings.squareDashConnect.squareDashConnectStrings.CONFLICT
  - typings.squareDashConnect.squareDashConnectStrings.REQUEST_ENTITY_TOO_LARGE
  - typings.squareDashConnect.squareDashConnectStrings.UNSUPPORTED_MEDIA_TYPE
  - typings.squareDashConnect.squareDashConnectStrings.RATE_LIMITED
  - typings.squareDashConnect.squareDashConnectStrings.NOT_IMPLEMENTED
  - typings.squareDashConnect.squareDashConnectStrings.SERVICE_UNAVAILABLE
  - typings.squareDashConnect.squareDashConnectStrings.GATEWAY_TIMEOUT
*/
trait ErrorCodeType extends js.Object

object ErrorCodeType {
  @scala.inline
  def ACCESS_TOKEN_EXPIRED: typings.squareDashConnect.squareDashConnectStrings.ACCESS_TOKEN_EXPIRED = this.cast("ACCESS_TOKEN_EXPIRED")
  @scala.inline
  def ACCESS_TOKEN_REVOKED: typings.squareDashConnect.squareDashConnectStrings.ACCESS_TOKEN_REVOKED = this.cast("ACCESS_TOKEN_REVOKED")
  @scala.inline
  def AMOUNT_TOO_HIGH: typings.squareDashConnect.squareDashConnectStrings.AMOUNT_TOO_HIGH = this.cast("AMOUNT_TOO_HIGH")
  @scala.inline
  def API_VERSION_INCOMPATIBLE: typings.squareDashConnect.squareDashConnectStrings.API_VERSION_INCOMPATIBLE = this.cast("API_VERSION_INCOMPATIBLE")
  @scala.inline
  def APPLE_PAYMENT_PROCESSING_CERTIFICATE_HASH_NOT_FOUND: typings.squareDashConnect.squareDashConnectStrings.APPLE_PAYMENT_PROCESSING_CERTIFICATE_HASH_NOT_FOUND = this.cast("APPLE_PAYMENT_PROCESSING_CERTIFICATE_HASH_NOT_FOUND")
  @scala.inline
  def APPLICATION_DISABLED: typings.squareDashConnect.squareDashConnectStrings.APPLICATION_DISABLED = this.cast("APPLICATION_DISABLED")
  @scala.inline
  def ARRAY_EMPTY: typings.squareDashConnect.squareDashConnectStrings.ARRAY_EMPTY = this.cast("ARRAY_EMPTY")
  @scala.inline
  def ARRAY_LENGTH_TOO_LONG: typings.squareDashConnect.squareDashConnectStrings.ARRAY_LENGTH_TOO_LONG = this.cast("ARRAY_LENGTH_TOO_LONG")
  @scala.inline
  def ARRAY_LENGTH_TOO_SHORT: typings.squareDashConnect.squareDashConnectStrings.ARRAY_LENGTH_TOO_SHORT = this.cast("ARRAY_LENGTH_TOO_SHORT")
  @scala.inline
  def BAD_CERTIFICATE: typings.squareDashConnect.squareDashConnectStrings.BAD_CERTIFICATE = this.cast("BAD_CERTIFICATE")
  @scala.inline
  def BAD_REQUEST: typings.squareDashConnect.squareDashConnectStrings.BAD_REQUEST = this.cast("BAD_REQUEST")
  @scala.inline
  def CARD_DECLINED: typings.squareDashConnect.squareDashConnectStrings.CARD_DECLINED = this.cast("CARD_DECLINED")
  @scala.inline
  def CARD_DECLINED_CALL_ISSUER: typings.squareDashConnect.squareDashConnectStrings.CARD_DECLINED_CALL_ISSUER = this.cast("CARD_DECLINED_CALL_ISSUER")
  @scala.inline
  def CARD_EXPIRED: typings.squareDashConnect.squareDashConnectStrings.CARD_EXPIRED = this.cast("CARD_EXPIRED")
  @scala.inline
  def CARD_PROCESSING_NOT_ENABLED: typings.squareDashConnect.squareDashConnectStrings.CARD_PROCESSING_NOT_ENABLED = this.cast("CARD_PROCESSING_NOT_ENABLED")
  @scala.inline
  def CARD_TOKEN_EXPIRED: typings.squareDashConnect.squareDashConnectStrings.CARD_TOKEN_EXPIRED = this.cast("CARD_TOKEN_EXPIRED")
  @scala.inline
  def CARD_TOKEN_USED: typings.squareDashConnect.squareDashConnectStrings.CARD_TOKEN_USED = this.cast("CARD_TOKEN_USED")
  @scala.inline
  def CHECKOUT_EXPIRED: typings.squareDashConnect.squareDashConnectStrings.CHECKOUT_EXPIRED = this.cast("CHECKOUT_EXPIRED")
  @scala.inline
  def CONFLICT: typings.squareDashConnect.squareDashConnectStrings.CONFLICT = this.cast("CONFLICT")
  @scala.inline
  def CONFLICTING_PARAMETERS: typings.squareDashConnect.squareDashConnectStrings.CONFLICTING_PARAMETERS = this.cast("CONFLICTING_PARAMETERS")
  @scala.inline
  def DELAYED_TRANSACTION_CANCELED: typings.squareDashConnect.squareDashConnectStrings.DELAYED_TRANSACTION_CANCELED = this.cast("DELAYED_TRANSACTION_CANCELED")
  @scala.inline
  def DELAYED_TRANSACTION_CAPTURED: typings.squareDashConnect.squareDashConnectStrings.DELAYED_TRANSACTION_CAPTURED = this.cast("DELAYED_TRANSACTION_CAPTURED")
  @scala.inline
  def DELAYED_TRANSACTION_EXPIRED: typings.squareDashConnect.squareDashConnectStrings.DELAYED_TRANSACTION_EXPIRED = this.cast("DELAYED_TRANSACTION_EXPIRED")
  @scala.inline
  def DELAYED_TRANSACTION_FAILED: typings.squareDashConnect.squareDashConnectStrings.DELAYED_TRANSACTION_FAILED = this.cast("DELAYED_TRANSACTION_FAILED")
  @scala.inline
  def DEPRECATED_FIELD_SET: typings.squareDashConnect.squareDashConnectStrings.DEPRECATED_FIELD_SET = this.cast("DEPRECATED_FIELD_SET")
  @scala.inline
  def EXPECTED_ARRAY: typings.squareDashConnect.squareDashConnectStrings.EXPECTED_ARRAY = this.cast("EXPECTED_ARRAY")
  @scala.inline
  def EXPECTED_BASE64_ENCODED_BYTE_ARRAY: typings.squareDashConnect.squareDashConnectStrings.EXPECTED_BASE64_ENCODED_BYTE_ARRAY = this.cast("EXPECTED_BASE64_ENCODED_BYTE_ARRAY")
  @scala.inline
  def EXPECTED_BOOLEAN: typings.squareDashConnect.squareDashConnectStrings.EXPECTED_BOOLEAN = this.cast("EXPECTED_BOOLEAN")
  @scala.inline
  def EXPECTED_FLOAT: typings.squareDashConnect.squareDashConnectStrings.EXPECTED_FLOAT = this.cast("EXPECTED_FLOAT")
  @scala.inline
  def EXPECTED_INTEGER: typings.squareDashConnect.squareDashConnectStrings.EXPECTED_INTEGER = this.cast("EXPECTED_INTEGER")
  @scala.inline
  def EXPECTED_JSON_BODY: typings.squareDashConnect.squareDashConnectStrings.EXPECTED_JSON_BODY = this.cast("EXPECTED_JSON_BODY")
  @scala.inline
  def EXPECTED_MAP: typings.squareDashConnect.squareDashConnectStrings.EXPECTED_MAP = this.cast("EXPECTED_MAP")
  @scala.inline
  def EXPECTED_OBJECT: typings.squareDashConnect.squareDashConnectStrings.EXPECTED_OBJECT = this.cast("EXPECTED_OBJECT")
  @scala.inline
  def EXPECTED_STRING: typings.squareDashConnect.squareDashConnectStrings.EXPECTED_STRING = this.cast("EXPECTED_STRING")
  @scala.inline
  def FORBIDDEN: typings.squareDashConnect.squareDashConnectStrings.FORBIDDEN = this.cast("FORBIDDEN")
  @scala.inline
  def GATEWAY_TIMEOUT: typings.squareDashConnect.squareDashConnectStrings.GATEWAY_TIMEOUT = this.cast("GATEWAY_TIMEOUT")
  @scala.inline
  def IDEMPOTENCY_KEY_REUSED: typings.squareDashConnect.squareDashConnectStrings.IDEMPOTENCY_KEY_REUSED = this.cast("IDEMPOTENCY_KEY_REUSED")
  @scala.inline
  def INCORRECT_TYPE: typings.squareDashConnect.squareDashConnectStrings.INCORRECT_TYPE = this.cast("INCORRECT_TYPE")
  @scala.inline
  def INSUFFICIENT_SCOPES: typings.squareDashConnect.squareDashConnectStrings.INSUFFICIENT_SCOPES = this.cast("INSUFFICIENT_SCOPES")
  @scala.inline
  def INTERNAL_SERVER_ERROR: typings.squareDashConnect.squareDashConnectStrings.INTERNAL_SERVER_ERROR = this.cast("INTERNAL_SERVER_ERROR")
  @scala.inline
  def INVALID_ARRAY_VALUE: typings.squareDashConnect.squareDashConnectStrings.INVALID_ARRAY_VALUE = this.cast("INVALID_ARRAY_VALUE")
  @scala.inline
  def INVALID_CARD: typings.squareDashConnect.squareDashConnectStrings.INVALID_CARD = this.cast("INVALID_CARD")
  @scala.inline
  def INVALID_CARD_DATA: typings.squareDashConnect.squareDashConnectStrings.INVALID_CARD_DATA = this.cast("INVALID_CARD_DATA")
  @scala.inline
  def INVALID_CONTENT_TYPE: typings.squareDashConnect.squareDashConnectStrings.INVALID_CONTENT_TYPE = this.cast("INVALID_CONTENT_TYPE")
  @scala.inline
  def INVALID_CURSOR: typings.squareDashConnect.squareDashConnectStrings.INVALID_CURSOR = this.cast("INVALID_CURSOR")
  @scala.inline
  def INVALID_EMAIL_ADDRESS: typings.squareDashConnect.squareDashConnectStrings.INVALID_EMAIL_ADDRESS = this.cast("INVALID_EMAIL_ADDRESS")
  @scala.inline
  def INVALID_ENCRYPTED_CARD: typings.squareDashConnect.squareDashConnectStrings.INVALID_ENCRYPTED_CARD = this.cast("INVALID_ENCRYPTED_CARD")
  @scala.inline
  def INVALID_ENUM_VALUE: typings.squareDashConnect.squareDashConnectStrings.INVALID_ENUM_VALUE = this.cast("INVALID_ENUM_VALUE")
  @scala.inline
  def INVALID_EXPIRATION: typings.squareDashConnect.squareDashConnectStrings.INVALID_EXPIRATION = this.cast("INVALID_EXPIRATION")
  @scala.inline
  def INVALID_EXPIRATION_DATE: typings.squareDashConnect.squareDashConnectStrings.INVALID_EXPIRATION_DATE = this.cast("INVALID_EXPIRATION_DATE")
  @scala.inline
  def INVALID_EXPIRATION_YEAR: typings.squareDashConnect.squareDashConnectStrings.INVALID_EXPIRATION_YEAR = this.cast("INVALID_EXPIRATION_YEAR")
  @scala.inline
  def INVALID_FORM_VALUE: typings.squareDashConnect.squareDashConnectStrings.INVALID_FORM_VALUE = this.cast("INVALID_FORM_VALUE")
  @scala.inline
  def INVALID_PHONE_NUMBER: typings.squareDashConnect.squareDashConnectStrings.INVALID_PHONE_NUMBER = this.cast("INVALID_PHONE_NUMBER")
  @scala.inline
  def INVALID_SORT_ORDER: typings.squareDashConnect.squareDashConnectStrings.INVALID_SORT_ORDER = this.cast("INVALID_SORT_ORDER")
  @scala.inline
  def INVALID_SQUARE_VERSION_FORMAT: typings.squareDashConnect.squareDashConnectStrings.INVALID_SQUARE_VERSION_FORMAT = this.cast("INVALID_SQUARE_VERSION_FORMAT")
  @scala.inline
  def INVALID_TIME: typings.squareDashConnect.squareDashConnectStrings.INVALID_TIME = this.cast("INVALID_TIME")
  @scala.inline
  def INVALID_TIME_RANGE: typings.squareDashConnect.squareDashConnectStrings.INVALID_TIME_RANGE = this.cast("INVALID_TIME_RANGE")
  @scala.inline
  def INVALID_VALUE: typings.squareDashConnect.squareDashConnectStrings.INVALID_VALUE = this.cast("INVALID_VALUE")
  @scala.inline
  def LOCATION_MISMATCH: typings.squareDashConnect.squareDashConnectStrings.LOCATION_MISMATCH = this.cast("LOCATION_MISMATCH")
  @scala.inline
  def METHOD_NOT_ALLOWED: typings.squareDashConnect.squareDashConnectStrings.METHOD_NOT_ALLOWED = this.cast("METHOD_NOT_ALLOWED")
  @scala.inline
  def MISSING_REQUIRED_PARAMETER: typings.squareDashConnect.squareDashConnectStrings.MISSING_REQUIRED_PARAMETER = this.cast("MISSING_REQUIRED_PARAMETER")
  @scala.inline
  def NOT_ACCEPTABLE: typings.squareDashConnect.squareDashConnectStrings.NOT_ACCEPTABLE = this.cast("NOT_ACCEPTABLE")
  @scala.inline
  def NOT_FOUND: typings.squareDashConnect.squareDashConnectStrings.NOT_FOUND = this.cast("NOT_FOUND")
  @scala.inline
  def NOT_IMPLEMENTED: typings.squareDashConnect.squareDashConnectStrings.NOT_IMPLEMENTED = this.cast("NOT_IMPLEMENTED")
  @scala.inline
  def NO_FIELDS_SET: typings.squareDashConnect.squareDashConnectStrings.NO_FIELDS_SET = this.cast("NO_FIELDS_SET")
  @scala.inline
  def ONE_INSTRUMENT_EXPECTED: typings.squareDashConnect.squareDashConnectStrings.ONE_INSTRUMENT_EXPECTED = this.cast("ONE_INSTRUMENT_EXPECTED")
  @scala.inline
  def PAYMENT_NOT_REFUNDABLE: typings.squareDashConnect.squareDashConnectStrings.PAYMENT_NOT_REFUNDABLE = this.cast("PAYMENT_NOT_REFUNDABLE")
  @scala.inline
  def RATE_LIMITED: typings.squareDashConnect.squareDashConnectStrings.RATE_LIMITED = this.cast("RATE_LIMITED")
  @scala.inline
  def REFUND_ALREADY_PENDING: typings.squareDashConnect.squareDashConnectStrings.REFUND_ALREADY_PENDING = this.cast("REFUND_ALREADY_PENDING")
  @scala.inline
  def REFUND_AMOUNT_INVALID: typings.squareDashConnect.squareDashConnectStrings.REFUND_AMOUNT_INVALID = this.cast("REFUND_AMOUNT_INVALID")
  @scala.inline
  def REQUEST_ENTITY_TOO_LARGE: typings.squareDashConnect.squareDashConnectStrings.REQUEST_ENTITY_TOO_LARGE = this.cast("REQUEST_ENTITY_TOO_LARGE")
  @scala.inline
  def REQUEST_TIMEOUT: typings.squareDashConnect.squareDashConnectStrings.REQUEST_TIMEOUT = this.cast("REQUEST_TIMEOUT")
  @scala.inline
  def SANDBOX_NOT_SUPPORTED: typings.squareDashConnect.squareDashConnectStrings.SANDBOX_NOT_SUPPORTED = this.cast("SANDBOX_NOT_SUPPORTED")
  @scala.inline
  def SERVICE_UNAVAILABLE: typings.squareDashConnect.squareDashConnectStrings.SERVICE_UNAVAILABLE = this.cast("SERVICE_UNAVAILABLE")
  @scala.inline
  def UNAUTHORIZED: typings.squareDashConnect.squareDashConnectStrings.UNAUTHORIZED = this.cast("UNAUTHORIZED")
  @scala.inline
  def UNEXPECTED_VALUE: typings.squareDashConnect.squareDashConnectStrings.UNEXPECTED_VALUE = this.cast("UNEXPECTED_VALUE")
  @scala.inline
  def UNKNOWN_QUERY_PARAMETER: typings.squareDashConnect.squareDashConnectStrings.UNKNOWN_QUERY_PARAMETER = this.cast("UNKNOWN_QUERY_PARAMETER")
  @scala.inline
  def UNSUPPORTED_CARD_BRAND: typings.squareDashConnect.squareDashConnectStrings.UNSUPPORTED_CARD_BRAND = this.cast("UNSUPPORTED_CARD_BRAND")
  @scala.inline
  def UNSUPPORTED_ENTRY_METHOD: typings.squareDashConnect.squareDashConnectStrings.UNSUPPORTED_ENTRY_METHOD = this.cast("UNSUPPORTED_ENTRY_METHOD")
  @scala.inline
  def UNSUPPORTED_INSTRUMENT_TYPE: typings.squareDashConnect.squareDashConnectStrings.UNSUPPORTED_INSTRUMENT_TYPE = this.cast("UNSUPPORTED_INSTRUMENT_TYPE")
  @scala.inline
  def UNSUPPORTED_MEDIA_TYPE: typings.squareDashConnect.squareDashConnectStrings.UNSUPPORTED_MEDIA_TYPE = this.cast("UNSUPPORTED_MEDIA_TYPE")
  @scala.inline
  def V1_ACCESS_TOKEN: typings.squareDashConnect.squareDashConnectStrings.V1_ACCESS_TOKEN = this.cast("V1_ACCESS_TOKEN")
  @scala.inline
  def V1_APPLICATION: typings.squareDashConnect.squareDashConnectStrings.V1_APPLICATION = this.cast("V1_APPLICATION")
  @scala.inline
  def VALUE_EMPTY: typings.squareDashConnect.squareDashConnectStrings.VALUE_EMPTY = this.cast("VALUE_EMPTY")
  @scala.inline
  def VALUE_REGEX_MISMATCH: typings.squareDashConnect.squareDashConnectStrings.VALUE_REGEX_MISMATCH = this.cast("VALUE_REGEX_MISMATCH")
  @scala.inline
  def VALUE_TOO_HIGH: typings.squareDashConnect.squareDashConnectStrings.VALUE_TOO_HIGH = this.cast("VALUE_TOO_HIGH")
  @scala.inline
  def VALUE_TOO_LONG: typings.squareDashConnect.squareDashConnectStrings.VALUE_TOO_LONG = this.cast("VALUE_TOO_LONG")
  @scala.inline
  def VALUE_TOO_LOW: typings.squareDashConnect.squareDashConnectStrings.VALUE_TOO_LOW = this.cast("VALUE_TOO_LOW")
  @scala.inline
  def VALUE_TOO_SHORT: typings.squareDashConnect.squareDashConnectStrings.VALUE_TOO_SHORT = this.cast("VALUE_TOO_SHORT")
  @scala.inline
  def VERIFY_AVS_FAILURE: typings.squareDashConnect.squareDashConnectStrings.VERIFY_AVS_FAILURE = this.cast("VERIFY_AVS_FAILURE")
  @scala.inline
  def VERIFY_CVV_FAILURE: typings.squareDashConnect.squareDashConnectStrings.VERIFY_CVV_FAILURE = this.cast("VERIFY_CVV_FAILURE")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

