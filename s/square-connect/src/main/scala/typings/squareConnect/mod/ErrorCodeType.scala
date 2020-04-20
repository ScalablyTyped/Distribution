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
  def ACCESS_TOKEN_EXPIRED: typings.squareConnect.squareConnectStrings.ACCESS_TOKEN_EXPIRED = "ACCESS_TOKEN_EXPIRED".asInstanceOf[typings.squareConnect.squareConnectStrings.ACCESS_TOKEN_EXPIRED]
  @scala.inline
  def ACCESS_TOKEN_REVOKED: typings.squareConnect.squareConnectStrings.ACCESS_TOKEN_REVOKED = "ACCESS_TOKEN_REVOKED".asInstanceOf[typings.squareConnect.squareConnectStrings.ACCESS_TOKEN_REVOKED]
  @scala.inline
  def AMOUNT_TOO_HIGH: typings.squareConnect.squareConnectStrings.AMOUNT_TOO_HIGH = "AMOUNT_TOO_HIGH".asInstanceOf[typings.squareConnect.squareConnectStrings.AMOUNT_TOO_HIGH]
  @scala.inline
  def API_VERSION_INCOMPATIBLE: typings.squareConnect.squareConnectStrings.API_VERSION_INCOMPATIBLE = "API_VERSION_INCOMPATIBLE".asInstanceOf[typings.squareConnect.squareConnectStrings.API_VERSION_INCOMPATIBLE]
  @scala.inline
  def APPLE_PAYMENT_PROCESSING_CERTIFICATE_HASH_NOT_FOUND: typings.squareConnect.squareConnectStrings.APPLE_PAYMENT_PROCESSING_CERTIFICATE_HASH_NOT_FOUND = "APPLE_PAYMENT_PROCESSING_CERTIFICATE_HASH_NOT_FOUND".asInstanceOf[typings.squareConnect.squareConnectStrings.APPLE_PAYMENT_PROCESSING_CERTIFICATE_HASH_NOT_FOUND]
  @scala.inline
  def APPLICATION_DISABLED: typings.squareConnect.squareConnectStrings.APPLICATION_DISABLED = "APPLICATION_DISABLED".asInstanceOf[typings.squareConnect.squareConnectStrings.APPLICATION_DISABLED]
  @scala.inline
  def ARRAY_EMPTY: typings.squareConnect.squareConnectStrings.ARRAY_EMPTY = "ARRAY_EMPTY".asInstanceOf[typings.squareConnect.squareConnectStrings.ARRAY_EMPTY]
  @scala.inline
  def ARRAY_LENGTH_TOO_LONG: typings.squareConnect.squareConnectStrings.ARRAY_LENGTH_TOO_LONG = "ARRAY_LENGTH_TOO_LONG".asInstanceOf[typings.squareConnect.squareConnectStrings.ARRAY_LENGTH_TOO_LONG]
  @scala.inline
  def ARRAY_LENGTH_TOO_SHORT: typings.squareConnect.squareConnectStrings.ARRAY_LENGTH_TOO_SHORT = "ARRAY_LENGTH_TOO_SHORT".asInstanceOf[typings.squareConnect.squareConnectStrings.ARRAY_LENGTH_TOO_SHORT]
  @scala.inline
  def BAD_CERTIFICATE: typings.squareConnect.squareConnectStrings.BAD_CERTIFICATE = "BAD_CERTIFICATE".asInstanceOf[typings.squareConnect.squareConnectStrings.BAD_CERTIFICATE]
  @scala.inline
  def BAD_REQUEST: typings.squareConnect.squareConnectStrings.BAD_REQUEST = "BAD_REQUEST".asInstanceOf[typings.squareConnect.squareConnectStrings.BAD_REQUEST]
  @scala.inline
  def CARD_DECLINED: typings.squareConnect.squareConnectStrings.CARD_DECLINED = "CARD_DECLINED".asInstanceOf[typings.squareConnect.squareConnectStrings.CARD_DECLINED]
  @scala.inline
  def CARD_DECLINED_CALL_ISSUER: typings.squareConnect.squareConnectStrings.CARD_DECLINED_CALL_ISSUER = "CARD_DECLINED_CALL_ISSUER".asInstanceOf[typings.squareConnect.squareConnectStrings.CARD_DECLINED_CALL_ISSUER]
  @scala.inline
  def CARD_EXPIRED: typings.squareConnect.squareConnectStrings.CARD_EXPIRED = "CARD_EXPIRED".asInstanceOf[typings.squareConnect.squareConnectStrings.CARD_EXPIRED]
  @scala.inline
  def CARD_PROCESSING_NOT_ENABLED: typings.squareConnect.squareConnectStrings.CARD_PROCESSING_NOT_ENABLED = "CARD_PROCESSING_NOT_ENABLED".asInstanceOf[typings.squareConnect.squareConnectStrings.CARD_PROCESSING_NOT_ENABLED]
  @scala.inline
  def CARD_TOKEN_EXPIRED: typings.squareConnect.squareConnectStrings.CARD_TOKEN_EXPIRED = "CARD_TOKEN_EXPIRED".asInstanceOf[typings.squareConnect.squareConnectStrings.CARD_TOKEN_EXPIRED]
  @scala.inline
  def CARD_TOKEN_USED: typings.squareConnect.squareConnectStrings.CARD_TOKEN_USED = "CARD_TOKEN_USED".asInstanceOf[typings.squareConnect.squareConnectStrings.CARD_TOKEN_USED]
  @scala.inline
  def CHECKOUT_EXPIRED: typings.squareConnect.squareConnectStrings.CHECKOUT_EXPIRED = "CHECKOUT_EXPIRED".asInstanceOf[typings.squareConnect.squareConnectStrings.CHECKOUT_EXPIRED]
  @scala.inline
  def CONFLICT: typings.squareConnect.squareConnectStrings.CONFLICT = "CONFLICT".asInstanceOf[typings.squareConnect.squareConnectStrings.CONFLICT]
  @scala.inline
  def CONFLICTING_PARAMETERS: typings.squareConnect.squareConnectStrings.CONFLICTING_PARAMETERS = "CONFLICTING_PARAMETERS".asInstanceOf[typings.squareConnect.squareConnectStrings.CONFLICTING_PARAMETERS]
  @scala.inline
  def DELAYED_TRANSACTION_CANCELED: typings.squareConnect.squareConnectStrings.DELAYED_TRANSACTION_CANCELED = "DELAYED_TRANSACTION_CANCELED".asInstanceOf[typings.squareConnect.squareConnectStrings.DELAYED_TRANSACTION_CANCELED]
  @scala.inline
  def DELAYED_TRANSACTION_CAPTURED: typings.squareConnect.squareConnectStrings.DELAYED_TRANSACTION_CAPTURED = "DELAYED_TRANSACTION_CAPTURED".asInstanceOf[typings.squareConnect.squareConnectStrings.DELAYED_TRANSACTION_CAPTURED]
  @scala.inline
  def DELAYED_TRANSACTION_EXPIRED: typings.squareConnect.squareConnectStrings.DELAYED_TRANSACTION_EXPIRED = "DELAYED_TRANSACTION_EXPIRED".asInstanceOf[typings.squareConnect.squareConnectStrings.DELAYED_TRANSACTION_EXPIRED]
  @scala.inline
  def DELAYED_TRANSACTION_FAILED: typings.squareConnect.squareConnectStrings.DELAYED_TRANSACTION_FAILED = "DELAYED_TRANSACTION_FAILED".asInstanceOf[typings.squareConnect.squareConnectStrings.DELAYED_TRANSACTION_FAILED]
  @scala.inline
  def DEPRECATED_FIELD_SET: typings.squareConnect.squareConnectStrings.DEPRECATED_FIELD_SET = "DEPRECATED_FIELD_SET".asInstanceOf[typings.squareConnect.squareConnectStrings.DEPRECATED_FIELD_SET]
  @scala.inline
  def EXPECTED_ARRAY: typings.squareConnect.squareConnectStrings.EXPECTED_ARRAY = "EXPECTED_ARRAY".asInstanceOf[typings.squareConnect.squareConnectStrings.EXPECTED_ARRAY]
  @scala.inline
  def EXPECTED_BASE64_ENCODED_BYTE_ARRAY: typings.squareConnect.squareConnectStrings.EXPECTED_BASE64_ENCODED_BYTE_ARRAY = "EXPECTED_BASE64_ENCODED_BYTE_ARRAY".asInstanceOf[typings.squareConnect.squareConnectStrings.EXPECTED_BASE64_ENCODED_BYTE_ARRAY]
  @scala.inline
  def EXPECTED_BOOLEAN: typings.squareConnect.squareConnectStrings.EXPECTED_BOOLEAN = "EXPECTED_BOOLEAN".asInstanceOf[typings.squareConnect.squareConnectStrings.EXPECTED_BOOLEAN]
  @scala.inline
  def EXPECTED_FLOAT: typings.squareConnect.squareConnectStrings.EXPECTED_FLOAT = "EXPECTED_FLOAT".asInstanceOf[typings.squareConnect.squareConnectStrings.EXPECTED_FLOAT]
  @scala.inline
  def EXPECTED_INTEGER: typings.squareConnect.squareConnectStrings.EXPECTED_INTEGER = "EXPECTED_INTEGER".asInstanceOf[typings.squareConnect.squareConnectStrings.EXPECTED_INTEGER]
  @scala.inline
  def EXPECTED_JSON_BODY: typings.squareConnect.squareConnectStrings.EXPECTED_JSON_BODY = "EXPECTED_JSON_BODY".asInstanceOf[typings.squareConnect.squareConnectStrings.EXPECTED_JSON_BODY]
  @scala.inline
  def EXPECTED_MAP: typings.squareConnect.squareConnectStrings.EXPECTED_MAP = "EXPECTED_MAP".asInstanceOf[typings.squareConnect.squareConnectStrings.EXPECTED_MAP]
  @scala.inline
  def EXPECTED_OBJECT: typings.squareConnect.squareConnectStrings.EXPECTED_OBJECT = "EXPECTED_OBJECT".asInstanceOf[typings.squareConnect.squareConnectStrings.EXPECTED_OBJECT]
  @scala.inline
  def EXPECTED_STRING: typings.squareConnect.squareConnectStrings.EXPECTED_STRING = "EXPECTED_STRING".asInstanceOf[typings.squareConnect.squareConnectStrings.EXPECTED_STRING]
  @scala.inline
  def FORBIDDEN: typings.squareConnect.squareConnectStrings.FORBIDDEN = "FORBIDDEN".asInstanceOf[typings.squareConnect.squareConnectStrings.FORBIDDEN]
  @scala.inline
  def GATEWAY_TIMEOUT: typings.squareConnect.squareConnectStrings.GATEWAY_TIMEOUT = "GATEWAY_TIMEOUT".asInstanceOf[typings.squareConnect.squareConnectStrings.GATEWAY_TIMEOUT]
  @scala.inline
  def IDEMPOTENCY_KEY_REUSED: typings.squareConnect.squareConnectStrings.IDEMPOTENCY_KEY_REUSED = "IDEMPOTENCY_KEY_REUSED".asInstanceOf[typings.squareConnect.squareConnectStrings.IDEMPOTENCY_KEY_REUSED]
  @scala.inline
  def INCORRECT_TYPE: typings.squareConnect.squareConnectStrings.INCORRECT_TYPE = "INCORRECT_TYPE".asInstanceOf[typings.squareConnect.squareConnectStrings.INCORRECT_TYPE]
  @scala.inline
  def INSUFFICIENT_SCOPES: typings.squareConnect.squareConnectStrings.INSUFFICIENT_SCOPES = "INSUFFICIENT_SCOPES".asInstanceOf[typings.squareConnect.squareConnectStrings.INSUFFICIENT_SCOPES]
  @scala.inline
  def INTERNAL_SERVER_ERROR: typings.squareConnect.squareConnectStrings.INTERNAL_SERVER_ERROR = "INTERNAL_SERVER_ERROR".asInstanceOf[typings.squareConnect.squareConnectStrings.INTERNAL_SERVER_ERROR]
  @scala.inline
  def INVALID_ARRAY_VALUE: typings.squareConnect.squareConnectStrings.INVALID_ARRAY_VALUE = "INVALID_ARRAY_VALUE".asInstanceOf[typings.squareConnect.squareConnectStrings.INVALID_ARRAY_VALUE]
  @scala.inline
  def INVALID_CARD: typings.squareConnect.squareConnectStrings.INVALID_CARD = "INVALID_CARD".asInstanceOf[typings.squareConnect.squareConnectStrings.INVALID_CARD]
  @scala.inline
  def INVALID_CARD_DATA: typings.squareConnect.squareConnectStrings.INVALID_CARD_DATA = "INVALID_CARD_DATA".asInstanceOf[typings.squareConnect.squareConnectStrings.INVALID_CARD_DATA]
  @scala.inline
  def INVALID_CONTENT_TYPE: typings.squareConnect.squareConnectStrings.INVALID_CONTENT_TYPE = "INVALID_CONTENT_TYPE".asInstanceOf[typings.squareConnect.squareConnectStrings.INVALID_CONTENT_TYPE]
  @scala.inline
  def INVALID_CURSOR: typings.squareConnect.squareConnectStrings.INVALID_CURSOR = "INVALID_CURSOR".asInstanceOf[typings.squareConnect.squareConnectStrings.INVALID_CURSOR]
  @scala.inline
  def INVALID_EMAIL_ADDRESS: typings.squareConnect.squareConnectStrings.INVALID_EMAIL_ADDRESS = "INVALID_EMAIL_ADDRESS".asInstanceOf[typings.squareConnect.squareConnectStrings.INVALID_EMAIL_ADDRESS]
  @scala.inline
  def INVALID_ENCRYPTED_CARD: typings.squareConnect.squareConnectStrings.INVALID_ENCRYPTED_CARD = "INVALID_ENCRYPTED_CARD".asInstanceOf[typings.squareConnect.squareConnectStrings.INVALID_ENCRYPTED_CARD]
  @scala.inline
  def INVALID_ENUM_VALUE: typings.squareConnect.squareConnectStrings.INVALID_ENUM_VALUE = "INVALID_ENUM_VALUE".asInstanceOf[typings.squareConnect.squareConnectStrings.INVALID_ENUM_VALUE]
  @scala.inline
  def INVALID_EXPIRATION: typings.squareConnect.squareConnectStrings.INVALID_EXPIRATION = "INVALID_EXPIRATION".asInstanceOf[typings.squareConnect.squareConnectStrings.INVALID_EXPIRATION]
  @scala.inline
  def INVALID_EXPIRATION_DATE: typings.squareConnect.squareConnectStrings.INVALID_EXPIRATION_DATE = "INVALID_EXPIRATION_DATE".asInstanceOf[typings.squareConnect.squareConnectStrings.INVALID_EXPIRATION_DATE]
  @scala.inline
  def INVALID_EXPIRATION_YEAR: typings.squareConnect.squareConnectStrings.INVALID_EXPIRATION_YEAR = "INVALID_EXPIRATION_YEAR".asInstanceOf[typings.squareConnect.squareConnectStrings.INVALID_EXPIRATION_YEAR]
  @scala.inline
  def INVALID_FORM_VALUE: typings.squareConnect.squareConnectStrings.INVALID_FORM_VALUE = "INVALID_FORM_VALUE".asInstanceOf[typings.squareConnect.squareConnectStrings.INVALID_FORM_VALUE]
  @scala.inline
  def INVALID_PHONE_NUMBER: typings.squareConnect.squareConnectStrings.INVALID_PHONE_NUMBER = "INVALID_PHONE_NUMBER".asInstanceOf[typings.squareConnect.squareConnectStrings.INVALID_PHONE_NUMBER]
  @scala.inline
  def INVALID_SORT_ORDER: typings.squareConnect.squareConnectStrings.INVALID_SORT_ORDER = "INVALID_SORT_ORDER".asInstanceOf[typings.squareConnect.squareConnectStrings.INVALID_SORT_ORDER]
  @scala.inline
  def INVALID_SQUARE_VERSION_FORMAT: typings.squareConnect.squareConnectStrings.INVALID_SQUARE_VERSION_FORMAT = "INVALID_SQUARE_VERSION_FORMAT".asInstanceOf[typings.squareConnect.squareConnectStrings.INVALID_SQUARE_VERSION_FORMAT]
  @scala.inline
  def INVALID_TIME: typings.squareConnect.squareConnectStrings.INVALID_TIME = "INVALID_TIME".asInstanceOf[typings.squareConnect.squareConnectStrings.INVALID_TIME]
  @scala.inline
  def INVALID_TIME_RANGE: typings.squareConnect.squareConnectStrings.INVALID_TIME_RANGE = "INVALID_TIME_RANGE".asInstanceOf[typings.squareConnect.squareConnectStrings.INVALID_TIME_RANGE]
  @scala.inline
  def INVALID_VALUE: typings.squareConnect.squareConnectStrings.INVALID_VALUE = "INVALID_VALUE".asInstanceOf[typings.squareConnect.squareConnectStrings.INVALID_VALUE]
  @scala.inline
  def LOCATION_MISMATCH: typings.squareConnect.squareConnectStrings.LOCATION_MISMATCH = "LOCATION_MISMATCH".asInstanceOf[typings.squareConnect.squareConnectStrings.LOCATION_MISMATCH]
  @scala.inline
  def METHOD_NOT_ALLOWED: typings.squareConnect.squareConnectStrings.METHOD_NOT_ALLOWED = "METHOD_NOT_ALLOWED".asInstanceOf[typings.squareConnect.squareConnectStrings.METHOD_NOT_ALLOWED]
  @scala.inline
  def MISSING_REQUIRED_PARAMETER: typings.squareConnect.squareConnectStrings.MISSING_REQUIRED_PARAMETER = "MISSING_REQUIRED_PARAMETER".asInstanceOf[typings.squareConnect.squareConnectStrings.MISSING_REQUIRED_PARAMETER]
  @scala.inline
  def NOT_ACCEPTABLE: typings.squareConnect.squareConnectStrings.NOT_ACCEPTABLE = "NOT_ACCEPTABLE".asInstanceOf[typings.squareConnect.squareConnectStrings.NOT_ACCEPTABLE]
  @scala.inline
  def NOT_FOUND: typings.squareConnect.squareConnectStrings.NOT_FOUND = "NOT_FOUND".asInstanceOf[typings.squareConnect.squareConnectStrings.NOT_FOUND]
  @scala.inline
  def NOT_IMPLEMENTED: typings.squareConnect.squareConnectStrings.NOT_IMPLEMENTED = "NOT_IMPLEMENTED".asInstanceOf[typings.squareConnect.squareConnectStrings.NOT_IMPLEMENTED]
  @scala.inline
  def NO_FIELDS_SET: typings.squareConnect.squareConnectStrings.NO_FIELDS_SET = "NO_FIELDS_SET".asInstanceOf[typings.squareConnect.squareConnectStrings.NO_FIELDS_SET]
  @scala.inline
  def ONE_INSTRUMENT_EXPECTED: typings.squareConnect.squareConnectStrings.ONE_INSTRUMENT_EXPECTED = "ONE_INSTRUMENT_EXPECTED".asInstanceOf[typings.squareConnect.squareConnectStrings.ONE_INSTRUMENT_EXPECTED]
  @scala.inline
  def PAYMENT_NOT_REFUNDABLE: typings.squareConnect.squareConnectStrings.PAYMENT_NOT_REFUNDABLE = "PAYMENT_NOT_REFUNDABLE".asInstanceOf[typings.squareConnect.squareConnectStrings.PAYMENT_NOT_REFUNDABLE]
  @scala.inline
  def RATE_LIMITED: typings.squareConnect.squareConnectStrings.RATE_LIMITED = "RATE_LIMITED".asInstanceOf[typings.squareConnect.squareConnectStrings.RATE_LIMITED]
  @scala.inline
  def REFUND_ALREADY_PENDING: typings.squareConnect.squareConnectStrings.REFUND_ALREADY_PENDING = "REFUND_ALREADY_PENDING".asInstanceOf[typings.squareConnect.squareConnectStrings.REFUND_ALREADY_PENDING]
  @scala.inline
  def REFUND_AMOUNT_INVALID: typings.squareConnect.squareConnectStrings.REFUND_AMOUNT_INVALID = "REFUND_AMOUNT_INVALID".asInstanceOf[typings.squareConnect.squareConnectStrings.REFUND_AMOUNT_INVALID]
  @scala.inline
  def REQUEST_ENTITY_TOO_LARGE: typings.squareConnect.squareConnectStrings.REQUEST_ENTITY_TOO_LARGE = "REQUEST_ENTITY_TOO_LARGE".asInstanceOf[typings.squareConnect.squareConnectStrings.REQUEST_ENTITY_TOO_LARGE]
  @scala.inline
  def REQUEST_TIMEOUT: typings.squareConnect.squareConnectStrings.REQUEST_TIMEOUT = "REQUEST_TIMEOUT".asInstanceOf[typings.squareConnect.squareConnectStrings.REQUEST_TIMEOUT]
  @scala.inline
  def SANDBOX_NOT_SUPPORTED: typings.squareConnect.squareConnectStrings.SANDBOX_NOT_SUPPORTED = "SANDBOX_NOT_SUPPORTED".asInstanceOf[typings.squareConnect.squareConnectStrings.SANDBOX_NOT_SUPPORTED]
  @scala.inline
  def SERVICE_UNAVAILABLE: typings.squareConnect.squareConnectStrings.SERVICE_UNAVAILABLE = "SERVICE_UNAVAILABLE".asInstanceOf[typings.squareConnect.squareConnectStrings.SERVICE_UNAVAILABLE]
  @scala.inline
  def UNAUTHORIZED: typings.squareConnect.squareConnectStrings.UNAUTHORIZED = "UNAUTHORIZED".asInstanceOf[typings.squareConnect.squareConnectStrings.UNAUTHORIZED]
  @scala.inline
  def UNEXPECTED_VALUE: typings.squareConnect.squareConnectStrings.UNEXPECTED_VALUE = "UNEXPECTED_VALUE".asInstanceOf[typings.squareConnect.squareConnectStrings.UNEXPECTED_VALUE]
  @scala.inline
  def UNKNOWN_QUERY_PARAMETER: typings.squareConnect.squareConnectStrings.UNKNOWN_QUERY_PARAMETER = "UNKNOWN_QUERY_PARAMETER".asInstanceOf[typings.squareConnect.squareConnectStrings.UNKNOWN_QUERY_PARAMETER]
  @scala.inline
  def UNSUPPORTED_CARD_BRAND: typings.squareConnect.squareConnectStrings.UNSUPPORTED_CARD_BRAND = "UNSUPPORTED_CARD_BRAND".asInstanceOf[typings.squareConnect.squareConnectStrings.UNSUPPORTED_CARD_BRAND]
  @scala.inline
  def UNSUPPORTED_ENTRY_METHOD: typings.squareConnect.squareConnectStrings.UNSUPPORTED_ENTRY_METHOD = "UNSUPPORTED_ENTRY_METHOD".asInstanceOf[typings.squareConnect.squareConnectStrings.UNSUPPORTED_ENTRY_METHOD]
  @scala.inline
  def UNSUPPORTED_INSTRUMENT_TYPE: typings.squareConnect.squareConnectStrings.UNSUPPORTED_INSTRUMENT_TYPE = "UNSUPPORTED_INSTRUMENT_TYPE".asInstanceOf[typings.squareConnect.squareConnectStrings.UNSUPPORTED_INSTRUMENT_TYPE]
  @scala.inline
  def UNSUPPORTED_MEDIA_TYPE: typings.squareConnect.squareConnectStrings.UNSUPPORTED_MEDIA_TYPE = "UNSUPPORTED_MEDIA_TYPE".asInstanceOf[typings.squareConnect.squareConnectStrings.UNSUPPORTED_MEDIA_TYPE]
  @scala.inline
  def V1_ACCESS_TOKEN: typings.squareConnect.squareConnectStrings.V1_ACCESS_TOKEN = "V1_ACCESS_TOKEN".asInstanceOf[typings.squareConnect.squareConnectStrings.V1_ACCESS_TOKEN]
  @scala.inline
  def V1_APPLICATION: typings.squareConnect.squareConnectStrings.V1_APPLICATION = "V1_APPLICATION".asInstanceOf[typings.squareConnect.squareConnectStrings.V1_APPLICATION]
  @scala.inline
  def VALUE_EMPTY: typings.squareConnect.squareConnectStrings.VALUE_EMPTY = "VALUE_EMPTY".asInstanceOf[typings.squareConnect.squareConnectStrings.VALUE_EMPTY]
  @scala.inline
  def VALUE_REGEX_MISMATCH: typings.squareConnect.squareConnectStrings.VALUE_REGEX_MISMATCH = "VALUE_REGEX_MISMATCH".asInstanceOf[typings.squareConnect.squareConnectStrings.VALUE_REGEX_MISMATCH]
  @scala.inline
  def VALUE_TOO_HIGH: typings.squareConnect.squareConnectStrings.VALUE_TOO_HIGH = "VALUE_TOO_HIGH".asInstanceOf[typings.squareConnect.squareConnectStrings.VALUE_TOO_HIGH]
  @scala.inline
  def VALUE_TOO_LONG: typings.squareConnect.squareConnectStrings.VALUE_TOO_LONG = "VALUE_TOO_LONG".asInstanceOf[typings.squareConnect.squareConnectStrings.VALUE_TOO_LONG]
  @scala.inline
  def VALUE_TOO_LOW: typings.squareConnect.squareConnectStrings.VALUE_TOO_LOW = "VALUE_TOO_LOW".asInstanceOf[typings.squareConnect.squareConnectStrings.VALUE_TOO_LOW]
  @scala.inline
  def VALUE_TOO_SHORT: typings.squareConnect.squareConnectStrings.VALUE_TOO_SHORT = "VALUE_TOO_SHORT".asInstanceOf[typings.squareConnect.squareConnectStrings.VALUE_TOO_SHORT]
  @scala.inline
  def VERIFY_AVS_FAILURE: typings.squareConnect.squareConnectStrings.VERIFY_AVS_FAILURE = "VERIFY_AVS_FAILURE".asInstanceOf[typings.squareConnect.squareConnectStrings.VERIFY_AVS_FAILURE]
  @scala.inline
  def VERIFY_CVV_FAILURE: typings.squareConnect.squareConnectStrings.VERIFY_CVV_FAILURE = "VERIFY_CVV_FAILURE".asInstanceOf[typings.squareConnect.squareConnectStrings.VERIFY_CVV_FAILURE]
}

