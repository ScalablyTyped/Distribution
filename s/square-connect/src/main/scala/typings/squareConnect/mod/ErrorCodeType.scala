package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.squareConnect.squareConnectStrings.INTERNAL_SERVER_ERROR
  - typings.squareConnect.squareConnectStrings.UNAUTHORIZED
  - typings.squareConnect.squareConnectStrings.ACCESS_TOKEN_EXPIRED
  - typings.squareConnect.squareConnectStrings.ACCESS_TOKEN_REVOKED
  - typings.squareConnect.squareConnectStrings.FORBIDDEN
  - typings.squareConnect.squareConnectStrings.INSUFFICIENT_SCOPES
  - typings.squareConnect.squareConnectStrings.APPLICATION_DISABLED
  - typings.squareConnect.squareConnectStrings.V1_APPLICATION
  - typings.squareConnect.squareConnectStrings.V1_ACCESS_TOKEN
  - typings.squareConnect.squareConnectStrings.CARD_PROCESSING_NOT_ENABLED
  - typings.squareConnect.squareConnectStrings.BAD_REQUEST
  - typings.squareConnect.squareConnectStrings.MISSING_REQUIRED_PARAMETER
  - typings.squareConnect.squareConnectStrings.INCORRECT_TYPE
  - typings.squareConnect.squareConnectStrings.INVALID_TIME
  - typings.squareConnect.squareConnectStrings.INVALID_TIME_RANGE
  - typings.squareConnect.squareConnectStrings.INVALID_VALUE
  - typings.squareConnect.squareConnectStrings.INVALID_CURSOR
  - typings.squareConnect.squareConnectStrings.UNKNOWN_QUERY_PARAMETER
  - typings.squareConnect.squareConnectStrings.CONFLICTING_PARAMETERS
  - typings.squareConnect.squareConnectStrings.EXPECTED_JSON_BODY
  - typings.squareConnect.squareConnectStrings.INVALID_SORT_ORDER
  - typings.squareConnect.squareConnectStrings.VALUE_REGEX_MISMATCH
  - typings.squareConnect.squareConnectStrings.VALUE_TOO_SHORT
  - typings.squareConnect.squareConnectStrings.VALUE_TOO_LONG
  - typings.squareConnect.squareConnectStrings.VALUE_TOO_LOW
  - typings.squareConnect.squareConnectStrings.VALUE_TOO_HIGH
  - typings.squareConnect.squareConnectStrings.VALUE_EMPTY
  - typings.squareConnect.squareConnectStrings.ARRAY_LENGTH_TOO_LONG
  - typings.squareConnect.squareConnectStrings.ARRAY_LENGTH_TOO_SHORT
  - typings.squareConnect.squareConnectStrings.ARRAY_EMPTY
  - typings.squareConnect.squareConnectStrings.EXPECTED_BOOLEAN
  - typings.squareConnect.squareConnectStrings.EXPECTED_INTEGER
  - typings.squareConnect.squareConnectStrings.EXPECTED_FLOAT
  - typings.squareConnect.squareConnectStrings.EXPECTED_STRING
  - typings.squareConnect.squareConnectStrings.EXPECTED_OBJECT
  - typings.squareConnect.squareConnectStrings.EXPECTED_ARRAY
  - typings.squareConnect.squareConnectStrings.EXPECTED_MAP
  - typings.squareConnect.squareConnectStrings.EXPECTED_BASE64_ENCODED_BYTE_ARRAY
  - typings.squareConnect.squareConnectStrings.INVALID_ARRAY_VALUE
  - typings.squareConnect.squareConnectStrings.INVALID_ENUM_VALUE
  - typings.squareConnect.squareConnectStrings.INVALID_CONTENT_TYPE
  - typings.squareConnect.squareConnectStrings.INVALID_FORM_VALUE
  - typings.squareConnect.squareConnectStrings.ONE_INSTRUMENT_EXPECTED
  - typings.squareConnect.squareConnectStrings.NO_FIELDS_SET
  - typings.squareConnect.squareConnectStrings.DEPRECATED_FIELD_SET
  - typings.squareConnect.squareConnectStrings.CARD_EXPIRED
  - typings.squareConnect.squareConnectStrings.INVALID_EXPIRATION
  - typings.squareConnect.squareConnectStrings.INVALID_EXPIRATION_YEAR
  - typings.squareConnect.squareConnectStrings.INVALID_EXPIRATION_DATE
  - typings.squareConnect.squareConnectStrings.UNSUPPORTED_CARD_BRAND
  - typings.squareConnect.squareConnectStrings.UNSUPPORTED_ENTRY_METHOD
  - typings.squareConnect.squareConnectStrings.INVALID_ENCRYPTED_CARD
  - typings.squareConnect.squareConnectStrings.INVALID_CARD
  - typings.squareConnect.squareConnectStrings.DELAYED_TRANSACTION_EXPIRED
  - typings.squareConnect.squareConnectStrings.DELAYED_TRANSACTION_CANCELED
  - typings.squareConnect.squareConnectStrings.DELAYED_TRANSACTION_CAPTURED
  - typings.squareConnect.squareConnectStrings.DELAYED_TRANSACTION_FAILED
  - typings.squareConnect.squareConnectStrings.CARD_TOKEN_EXPIRED
  - typings.squareConnect.squareConnectStrings.CARD_TOKEN_USED
  - typings.squareConnect.squareConnectStrings.AMOUNT_TOO_HIGH
  - typings.squareConnect.squareConnectStrings.UNSUPPORTED_INSTRUMENT_TYPE
  - typings.squareConnect.squareConnectStrings.REFUND_AMOUNT_INVALID
  - typings.squareConnect.squareConnectStrings.REFUND_ALREADY_PENDING
  - typings.squareConnect.squareConnectStrings.PAYMENT_NOT_REFUNDABLE
  - typings.squareConnect.squareConnectStrings.INVALID_CARD_DATA
  - typings.squareConnect.squareConnectStrings.LOCATION_MISMATCH
  - typings.squareConnect.squareConnectStrings.IDEMPOTENCY_KEY_REUSED
  - typings.squareConnect.squareConnectStrings.UNEXPECTED_VALUE
  - typings.squareConnect.squareConnectStrings.SANDBOX_NOT_SUPPORTED
  - typings.squareConnect.squareConnectStrings.INVALID_EMAIL_ADDRESS
  - typings.squareConnect.squareConnectStrings.INVALID_PHONE_NUMBER
  - typings.squareConnect.squareConnectStrings.CHECKOUT_EXPIRED
  - typings.squareConnect.squareConnectStrings.BAD_CERTIFICATE
  - typings.squareConnect.squareConnectStrings.INVALID_SQUARE_VERSION_FORMAT
  - typings.squareConnect.squareConnectStrings.API_VERSION_INCOMPATIBLE
  - typings.squareConnect.squareConnectStrings.CARD_DECLINED
  - typings.squareConnect.squareConnectStrings.VERIFY_CVV_FAILURE
  - typings.squareConnect.squareConnectStrings.VERIFY_AVS_FAILURE
  - typings.squareConnect.squareConnectStrings.CARD_DECLINED_CALL_ISSUER
  - typings.squareConnect.squareConnectStrings.NOT_FOUND
  - typings.squareConnect.squareConnectStrings.APPLE_PAYMENT_PROCESSING_CERTIFICATE_HASH_NOT_FOUND
  - typings.squareConnect.squareConnectStrings.METHOD_NOT_ALLOWED
  - typings.squareConnect.squareConnectStrings.NOT_ACCEPTABLE
  - typings.squareConnect.squareConnectStrings.REQUEST_TIMEOUT
  - typings.squareConnect.squareConnectStrings.CONFLICT
  - typings.squareConnect.squareConnectStrings.REQUEST_ENTITY_TOO_LARGE
  - typings.squareConnect.squareConnectStrings.UNSUPPORTED_MEDIA_TYPE
  - typings.squareConnect.squareConnectStrings.RATE_LIMITED
  - typings.squareConnect.squareConnectStrings.NOT_IMPLEMENTED
  - typings.squareConnect.squareConnectStrings.SERVICE_UNAVAILABLE
  - typings.squareConnect.squareConnectStrings.GATEWAY_TIMEOUT
*/
trait ErrorCodeType extends js.Object

object ErrorCodeType {
  @scala.inline
  def ACCESS_TOKEN_EXPIRED: typings.squareConnect.squareConnectStrings.ACCESS_TOKEN_EXPIRED = this.cast("ACCESS_TOKEN_EXPIRED")
  @scala.inline
  def ACCESS_TOKEN_REVOKED: typings.squareConnect.squareConnectStrings.ACCESS_TOKEN_REVOKED = this.cast("ACCESS_TOKEN_REVOKED")
  @scala.inline
  def AMOUNT_TOO_HIGH: typings.squareConnect.squareConnectStrings.AMOUNT_TOO_HIGH = this.cast("AMOUNT_TOO_HIGH")
  @scala.inline
  def API_VERSION_INCOMPATIBLE: typings.squareConnect.squareConnectStrings.API_VERSION_INCOMPATIBLE = this.cast("API_VERSION_INCOMPATIBLE")
  @scala.inline
  def APPLE_PAYMENT_PROCESSING_CERTIFICATE_HASH_NOT_FOUND: typings.squareConnect.squareConnectStrings.APPLE_PAYMENT_PROCESSING_CERTIFICATE_HASH_NOT_FOUND = this.cast("APPLE_PAYMENT_PROCESSING_CERTIFICATE_HASH_NOT_FOUND")
  @scala.inline
  def APPLICATION_DISABLED: typings.squareConnect.squareConnectStrings.APPLICATION_DISABLED = this.cast("APPLICATION_DISABLED")
  @scala.inline
  def ARRAY_EMPTY: typings.squareConnect.squareConnectStrings.ARRAY_EMPTY = this.cast("ARRAY_EMPTY")
  @scala.inline
  def ARRAY_LENGTH_TOO_LONG: typings.squareConnect.squareConnectStrings.ARRAY_LENGTH_TOO_LONG = this.cast("ARRAY_LENGTH_TOO_LONG")
  @scala.inline
  def ARRAY_LENGTH_TOO_SHORT: typings.squareConnect.squareConnectStrings.ARRAY_LENGTH_TOO_SHORT = this.cast("ARRAY_LENGTH_TOO_SHORT")
  @scala.inline
  def BAD_CERTIFICATE: typings.squareConnect.squareConnectStrings.BAD_CERTIFICATE = this.cast("BAD_CERTIFICATE")
  @scala.inline
  def BAD_REQUEST: typings.squareConnect.squareConnectStrings.BAD_REQUEST = this.cast("BAD_REQUEST")
  @scala.inline
  def CARD_DECLINED: typings.squareConnect.squareConnectStrings.CARD_DECLINED = this.cast("CARD_DECLINED")
  @scala.inline
  def CARD_DECLINED_CALL_ISSUER: typings.squareConnect.squareConnectStrings.CARD_DECLINED_CALL_ISSUER = this.cast("CARD_DECLINED_CALL_ISSUER")
  @scala.inline
  def CARD_EXPIRED: typings.squareConnect.squareConnectStrings.CARD_EXPIRED = this.cast("CARD_EXPIRED")
  @scala.inline
  def CARD_PROCESSING_NOT_ENABLED: typings.squareConnect.squareConnectStrings.CARD_PROCESSING_NOT_ENABLED = this.cast("CARD_PROCESSING_NOT_ENABLED")
  @scala.inline
  def CARD_TOKEN_EXPIRED: typings.squareConnect.squareConnectStrings.CARD_TOKEN_EXPIRED = this.cast("CARD_TOKEN_EXPIRED")
  @scala.inline
  def CARD_TOKEN_USED: typings.squareConnect.squareConnectStrings.CARD_TOKEN_USED = this.cast("CARD_TOKEN_USED")
  @scala.inline
  def CHECKOUT_EXPIRED: typings.squareConnect.squareConnectStrings.CHECKOUT_EXPIRED = this.cast("CHECKOUT_EXPIRED")
  @scala.inline
  def CONFLICT: typings.squareConnect.squareConnectStrings.CONFLICT = this.cast("CONFLICT")
  @scala.inline
  def CONFLICTING_PARAMETERS: typings.squareConnect.squareConnectStrings.CONFLICTING_PARAMETERS = this.cast("CONFLICTING_PARAMETERS")
  @scala.inline
  def DELAYED_TRANSACTION_CANCELED: typings.squareConnect.squareConnectStrings.DELAYED_TRANSACTION_CANCELED = this.cast("DELAYED_TRANSACTION_CANCELED")
  @scala.inline
  def DELAYED_TRANSACTION_CAPTURED: typings.squareConnect.squareConnectStrings.DELAYED_TRANSACTION_CAPTURED = this.cast("DELAYED_TRANSACTION_CAPTURED")
  @scala.inline
  def DELAYED_TRANSACTION_EXPIRED: typings.squareConnect.squareConnectStrings.DELAYED_TRANSACTION_EXPIRED = this.cast("DELAYED_TRANSACTION_EXPIRED")
  @scala.inline
  def DELAYED_TRANSACTION_FAILED: typings.squareConnect.squareConnectStrings.DELAYED_TRANSACTION_FAILED = this.cast("DELAYED_TRANSACTION_FAILED")
  @scala.inline
  def DEPRECATED_FIELD_SET: typings.squareConnect.squareConnectStrings.DEPRECATED_FIELD_SET = this.cast("DEPRECATED_FIELD_SET")
  @scala.inline
  def EXPECTED_ARRAY: typings.squareConnect.squareConnectStrings.EXPECTED_ARRAY = this.cast("EXPECTED_ARRAY")
  @scala.inline
  def EXPECTED_BASE64_ENCODED_BYTE_ARRAY: typings.squareConnect.squareConnectStrings.EXPECTED_BASE64_ENCODED_BYTE_ARRAY = this.cast("EXPECTED_BASE64_ENCODED_BYTE_ARRAY")
  @scala.inline
  def EXPECTED_BOOLEAN: typings.squareConnect.squareConnectStrings.EXPECTED_BOOLEAN = this.cast("EXPECTED_BOOLEAN")
  @scala.inline
  def EXPECTED_FLOAT: typings.squareConnect.squareConnectStrings.EXPECTED_FLOAT = this.cast("EXPECTED_FLOAT")
  @scala.inline
  def EXPECTED_INTEGER: typings.squareConnect.squareConnectStrings.EXPECTED_INTEGER = this.cast("EXPECTED_INTEGER")
  @scala.inline
  def EXPECTED_JSON_BODY: typings.squareConnect.squareConnectStrings.EXPECTED_JSON_BODY = this.cast("EXPECTED_JSON_BODY")
  @scala.inline
  def EXPECTED_MAP: typings.squareConnect.squareConnectStrings.EXPECTED_MAP = this.cast("EXPECTED_MAP")
  @scala.inline
  def EXPECTED_OBJECT: typings.squareConnect.squareConnectStrings.EXPECTED_OBJECT = this.cast("EXPECTED_OBJECT")
  @scala.inline
  def EXPECTED_STRING: typings.squareConnect.squareConnectStrings.EXPECTED_STRING = this.cast("EXPECTED_STRING")
  @scala.inline
  def FORBIDDEN: typings.squareConnect.squareConnectStrings.FORBIDDEN = this.cast("FORBIDDEN")
  @scala.inline
  def GATEWAY_TIMEOUT: typings.squareConnect.squareConnectStrings.GATEWAY_TIMEOUT = this.cast("GATEWAY_TIMEOUT")
  @scala.inline
  def IDEMPOTENCY_KEY_REUSED: typings.squareConnect.squareConnectStrings.IDEMPOTENCY_KEY_REUSED = this.cast("IDEMPOTENCY_KEY_REUSED")
  @scala.inline
  def INCORRECT_TYPE: typings.squareConnect.squareConnectStrings.INCORRECT_TYPE = this.cast("INCORRECT_TYPE")
  @scala.inline
  def INSUFFICIENT_SCOPES: typings.squareConnect.squareConnectStrings.INSUFFICIENT_SCOPES = this.cast("INSUFFICIENT_SCOPES")
  @scala.inline
  def INTERNAL_SERVER_ERROR: typings.squareConnect.squareConnectStrings.INTERNAL_SERVER_ERROR = this.cast("INTERNAL_SERVER_ERROR")
  @scala.inline
  def INVALID_ARRAY_VALUE: typings.squareConnect.squareConnectStrings.INVALID_ARRAY_VALUE = this.cast("INVALID_ARRAY_VALUE")
  @scala.inline
  def INVALID_CARD: typings.squareConnect.squareConnectStrings.INVALID_CARD = this.cast("INVALID_CARD")
  @scala.inline
  def INVALID_CARD_DATA: typings.squareConnect.squareConnectStrings.INVALID_CARD_DATA = this.cast("INVALID_CARD_DATA")
  @scala.inline
  def INVALID_CONTENT_TYPE: typings.squareConnect.squareConnectStrings.INVALID_CONTENT_TYPE = this.cast("INVALID_CONTENT_TYPE")
  @scala.inline
  def INVALID_CURSOR: typings.squareConnect.squareConnectStrings.INVALID_CURSOR = this.cast("INVALID_CURSOR")
  @scala.inline
  def INVALID_EMAIL_ADDRESS: typings.squareConnect.squareConnectStrings.INVALID_EMAIL_ADDRESS = this.cast("INVALID_EMAIL_ADDRESS")
  @scala.inline
  def INVALID_ENCRYPTED_CARD: typings.squareConnect.squareConnectStrings.INVALID_ENCRYPTED_CARD = this.cast("INVALID_ENCRYPTED_CARD")
  @scala.inline
  def INVALID_ENUM_VALUE: typings.squareConnect.squareConnectStrings.INVALID_ENUM_VALUE = this.cast("INVALID_ENUM_VALUE")
  @scala.inline
  def INVALID_EXPIRATION: typings.squareConnect.squareConnectStrings.INVALID_EXPIRATION = this.cast("INVALID_EXPIRATION")
  @scala.inline
  def INVALID_EXPIRATION_DATE: typings.squareConnect.squareConnectStrings.INVALID_EXPIRATION_DATE = this.cast("INVALID_EXPIRATION_DATE")
  @scala.inline
  def INVALID_EXPIRATION_YEAR: typings.squareConnect.squareConnectStrings.INVALID_EXPIRATION_YEAR = this.cast("INVALID_EXPIRATION_YEAR")
  @scala.inline
  def INVALID_FORM_VALUE: typings.squareConnect.squareConnectStrings.INVALID_FORM_VALUE = this.cast("INVALID_FORM_VALUE")
  @scala.inline
  def INVALID_PHONE_NUMBER: typings.squareConnect.squareConnectStrings.INVALID_PHONE_NUMBER = this.cast("INVALID_PHONE_NUMBER")
  @scala.inline
  def INVALID_SORT_ORDER: typings.squareConnect.squareConnectStrings.INVALID_SORT_ORDER = this.cast("INVALID_SORT_ORDER")
  @scala.inline
  def INVALID_SQUARE_VERSION_FORMAT: typings.squareConnect.squareConnectStrings.INVALID_SQUARE_VERSION_FORMAT = this.cast("INVALID_SQUARE_VERSION_FORMAT")
  @scala.inline
  def INVALID_TIME: typings.squareConnect.squareConnectStrings.INVALID_TIME = this.cast("INVALID_TIME")
  @scala.inline
  def INVALID_TIME_RANGE: typings.squareConnect.squareConnectStrings.INVALID_TIME_RANGE = this.cast("INVALID_TIME_RANGE")
  @scala.inline
  def INVALID_VALUE: typings.squareConnect.squareConnectStrings.INVALID_VALUE = this.cast("INVALID_VALUE")
  @scala.inline
  def LOCATION_MISMATCH: typings.squareConnect.squareConnectStrings.LOCATION_MISMATCH = this.cast("LOCATION_MISMATCH")
  @scala.inline
  def METHOD_NOT_ALLOWED: typings.squareConnect.squareConnectStrings.METHOD_NOT_ALLOWED = this.cast("METHOD_NOT_ALLOWED")
  @scala.inline
  def MISSING_REQUIRED_PARAMETER: typings.squareConnect.squareConnectStrings.MISSING_REQUIRED_PARAMETER = this.cast("MISSING_REQUIRED_PARAMETER")
  @scala.inline
  def NOT_ACCEPTABLE: typings.squareConnect.squareConnectStrings.NOT_ACCEPTABLE = this.cast("NOT_ACCEPTABLE")
  @scala.inline
  def NOT_FOUND: typings.squareConnect.squareConnectStrings.NOT_FOUND = this.cast("NOT_FOUND")
  @scala.inline
  def NOT_IMPLEMENTED: typings.squareConnect.squareConnectStrings.NOT_IMPLEMENTED = this.cast("NOT_IMPLEMENTED")
  @scala.inline
  def NO_FIELDS_SET: typings.squareConnect.squareConnectStrings.NO_FIELDS_SET = this.cast("NO_FIELDS_SET")
  @scala.inline
  def ONE_INSTRUMENT_EXPECTED: typings.squareConnect.squareConnectStrings.ONE_INSTRUMENT_EXPECTED = this.cast("ONE_INSTRUMENT_EXPECTED")
  @scala.inline
  def PAYMENT_NOT_REFUNDABLE: typings.squareConnect.squareConnectStrings.PAYMENT_NOT_REFUNDABLE = this.cast("PAYMENT_NOT_REFUNDABLE")
  @scala.inline
  def RATE_LIMITED: typings.squareConnect.squareConnectStrings.RATE_LIMITED = this.cast("RATE_LIMITED")
  @scala.inline
  def REFUND_ALREADY_PENDING: typings.squareConnect.squareConnectStrings.REFUND_ALREADY_PENDING = this.cast("REFUND_ALREADY_PENDING")
  @scala.inline
  def REFUND_AMOUNT_INVALID: typings.squareConnect.squareConnectStrings.REFUND_AMOUNT_INVALID = this.cast("REFUND_AMOUNT_INVALID")
  @scala.inline
  def REQUEST_ENTITY_TOO_LARGE: typings.squareConnect.squareConnectStrings.REQUEST_ENTITY_TOO_LARGE = this.cast("REQUEST_ENTITY_TOO_LARGE")
  @scala.inline
  def REQUEST_TIMEOUT: typings.squareConnect.squareConnectStrings.REQUEST_TIMEOUT = this.cast("REQUEST_TIMEOUT")
  @scala.inline
  def SANDBOX_NOT_SUPPORTED: typings.squareConnect.squareConnectStrings.SANDBOX_NOT_SUPPORTED = this.cast("SANDBOX_NOT_SUPPORTED")
  @scala.inline
  def SERVICE_UNAVAILABLE: typings.squareConnect.squareConnectStrings.SERVICE_UNAVAILABLE = this.cast("SERVICE_UNAVAILABLE")
  @scala.inline
  def UNAUTHORIZED: typings.squareConnect.squareConnectStrings.UNAUTHORIZED = this.cast("UNAUTHORIZED")
  @scala.inline
  def UNEXPECTED_VALUE: typings.squareConnect.squareConnectStrings.UNEXPECTED_VALUE = this.cast("UNEXPECTED_VALUE")
  @scala.inline
  def UNKNOWN_QUERY_PARAMETER: typings.squareConnect.squareConnectStrings.UNKNOWN_QUERY_PARAMETER = this.cast("UNKNOWN_QUERY_PARAMETER")
  @scala.inline
  def UNSUPPORTED_CARD_BRAND: typings.squareConnect.squareConnectStrings.UNSUPPORTED_CARD_BRAND = this.cast("UNSUPPORTED_CARD_BRAND")
  @scala.inline
  def UNSUPPORTED_ENTRY_METHOD: typings.squareConnect.squareConnectStrings.UNSUPPORTED_ENTRY_METHOD = this.cast("UNSUPPORTED_ENTRY_METHOD")
  @scala.inline
  def UNSUPPORTED_INSTRUMENT_TYPE: typings.squareConnect.squareConnectStrings.UNSUPPORTED_INSTRUMENT_TYPE = this.cast("UNSUPPORTED_INSTRUMENT_TYPE")
  @scala.inline
  def UNSUPPORTED_MEDIA_TYPE: typings.squareConnect.squareConnectStrings.UNSUPPORTED_MEDIA_TYPE = this.cast("UNSUPPORTED_MEDIA_TYPE")
  @scala.inline
  def V1_ACCESS_TOKEN: typings.squareConnect.squareConnectStrings.V1_ACCESS_TOKEN = this.cast("V1_ACCESS_TOKEN")
  @scala.inline
  def V1_APPLICATION: typings.squareConnect.squareConnectStrings.V1_APPLICATION = this.cast("V1_APPLICATION")
  @scala.inline
  def VALUE_EMPTY: typings.squareConnect.squareConnectStrings.VALUE_EMPTY = this.cast("VALUE_EMPTY")
  @scala.inline
  def VALUE_REGEX_MISMATCH: typings.squareConnect.squareConnectStrings.VALUE_REGEX_MISMATCH = this.cast("VALUE_REGEX_MISMATCH")
  @scala.inline
  def VALUE_TOO_HIGH: typings.squareConnect.squareConnectStrings.VALUE_TOO_HIGH = this.cast("VALUE_TOO_HIGH")
  @scala.inline
  def VALUE_TOO_LONG: typings.squareConnect.squareConnectStrings.VALUE_TOO_LONG = this.cast("VALUE_TOO_LONG")
  @scala.inline
  def VALUE_TOO_LOW: typings.squareConnect.squareConnectStrings.VALUE_TOO_LOW = this.cast("VALUE_TOO_LOW")
  @scala.inline
  def VALUE_TOO_SHORT: typings.squareConnect.squareConnectStrings.VALUE_TOO_SHORT = this.cast("VALUE_TOO_SHORT")
  @scala.inline
  def VERIFY_AVS_FAILURE: typings.squareConnect.squareConnectStrings.VERIFY_AVS_FAILURE = this.cast("VERIFY_AVS_FAILURE")
  @scala.inline
  def VERIFY_CVV_FAILURE: typings.squareConnect.squareConnectStrings.VERIFY_CVV_FAILURE = this.cast("VERIFY_CVV_FAILURE")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

