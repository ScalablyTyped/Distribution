package typings.snowflakeSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ErrorCode extends StObject
@JSImport("snowflake-sdk", "ErrorCode")
@js.native
object ErrorCode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ErrorCode & Double] = js.native
  
  // 405001
  @js.native
  sealed trait ERR_CONN_CONNECT_INVALID_CALLBACK
    extends StObject
       with ErrorCode
  /* 405001 */ val ERR_CONN_CONNECT_INVALID_CALLBACK: typings.snowflakeSdk.mod.ErrorCode.ERR_CONN_CONNECT_INVALID_CALLBACK & Double = js.native
  
  // sql state: 08002
  @js.native
  sealed trait ERR_CONN_CONNECT_STATUS_CONNECTED
    extends StObject
       with ErrorCode
  /* 405502 */ val ERR_CONN_CONNECT_STATUS_CONNECTED: typings.snowflakeSdk.mod.ErrorCode.ERR_CONN_CONNECT_STATUS_CONNECTED & Double = js.native
  
  // 405501
  @js.native
  sealed trait ERR_CONN_CONNECT_STATUS_CONNECTING
    extends StObject
       with ErrorCode
  /* 405501 */ val ERR_CONN_CONNECT_STATUS_CONNECTING: typings.snowflakeSdk.mod.ErrorCode.ERR_CONN_CONNECT_STATUS_CONNECTING & Double = js.native
  
  // sql state: 08002
  @js.native
  sealed trait ERR_CONN_CONNECT_STATUS_DISCONNECTED
    extends StObject
       with ErrorCode
  /* 405503 */ val ERR_CONN_CONNECT_STATUS_DISCONNECTED: typings.snowflakeSdk.mod.ErrorCode.ERR_CONN_CONNECT_STATUS_DISCONNECTED & Double = js.native
  
  @js.native
  sealed trait ERR_CONN_CREATE_INVALID_ACCESS_URL
    extends StObject
       with ErrorCode
  /* 404010 */ val ERR_CONN_CREATE_INVALID_ACCESS_URL: typings.snowflakeSdk.mod.ErrorCode.ERR_CONN_CREATE_INVALID_ACCESS_URL & Double = js.native
  
  @js.native
  sealed trait ERR_CONN_CREATE_INVALID_ACCOUNT
    extends StObject
       with ErrorCode
  /* 404008 */ val ERR_CONN_CREATE_INVALID_ACCOUNT: typings.snowflakeSdk.mod.ErrorCode.ERR_CONN_CREATE_INVALID_ACCOUNT & Double = js.native
  
  @js.native
  sealed trait ERR_CONN_CREATE_INVALID_APPLICATION
    extends StObject
       with ErrorCode
  /* 404031 */ val ERR_CONN_CREATE_INVALID_APPLICATION: typings.snowflakeSdk.mod.ErrorCode.ERR_CONN_CREATE_INVALID_APPLICATION & Double = js.native
  
  @js.native
  sealed trait ERR_CONN_CREATE_INVALID_DATABASE
    extends StObject
       with ErrorCode
  /* 404012 */ val ERR_CONN_CREATE_INVALID_DATABASE: typings.snowflakeSdk.mod.ErrorCode.ERR_CONN_CREATE_INVALID_DATABASE & Double = js.native
  
  @js.native
  sealed trait ERR_CONN_CREATE_INVALID_FETCH_AS_STRING
    extends StObject
       with ErrorCode
  /* 404020 */ val ERR_CONN_CREATE_INVALID_FETCH_AS_STRING: typings.snowflakeSdk.mod.ErrorCode.ERR_CONN_CREATE_INVALID_FETCH_AS_STRING & Double = js.native
  
  @js.native
  sealed trait ERR_CONN_CREATE_INVALID_FETCH_AS_STRING_VALUES
    extends StObject
       with ErrorCode
  /* 404021 */ val ERR_CONN_CREATE_INVALID_FETCH_AS_STRING_VALUES: typings.snowflakeSdk.mod.ErrorCode.ERR_CONN_CREATE_INVALID_FETCH_AS_STRING_VALUES & Double = js.native
  
  @js.native
  sealed trait ERR_CONN_CREATE_INVALID_KEEP_ALIVE
    extends StObject
       with ErrorCode
  /* 404023 */ val ERR_CONN_CREATE_INVALID_KEEP_ALIVE: typings.snowflakeSdk.mod.ErrorCode.ERR_CONN_CREATE_INVALID_KEEP_ALIVE & Double = js.native
  
  @js.native
  sealed trait ERR_CONN_CREATE_INVALID_KEEP_ALIVE_HEARTBEAT_FREQ
    extends StObject
       with ErrorCode
  /* 404024 */ val ERR_CONN_CREATE_INVALID_KEEP_ALIVE_HEARTBEAT_FREQ: typings.snowflakeSdk.mod.ErrorCode.ERR_CONN_CREATE_INVALID_KEEP_ALIVE_HEARTBEAT_FREQ & Double = js.native
  
  @js.native
  sealed trait ERR_CONN_CREATE_INVALID_OAUTH_TOKEN
    extends StObject
       with ErrorCode
  /* 404029 */ val ERR_CONN_CREATE_INVALID_OAUTH_TOKEN: typings.snowflakeSdk.mod.ErrorCode.ERR_CONN_CREATE_INVALID_OAUTH_TOKEN & Double = js.native
  
  @js.native
  sealed trait ERR_CONN_CREATE_INVALID_OPTIONS
    extends StObject
       with ErrorCode
  /* 404002 */ val ERR_CONN_CREATE_INVALID_OPTIONS: typings.snowflakeSdk.mod.ErrorCode.ERR_CONN_CREATE_INVALID_OPTIONS & Double = js.native
  
  @js.native
  sealed trait ERR_CONN_CREATE_INVALID_PASSWORD
    extends StObject
       with ErrorCode
  /* 404006 */ val ERR_CONN_CREATE_INVALID_PASSWORD: typings.snowflakeSdk.mod.ErrorCode.ERR_CONN_CREATE_INVALID_PASSWORD & Double = js.native
  
  @js.native
  sealed trait ERR_CONN_CREATE_INVALID_PRIVATE_KEY
    extends StObject
       with ErrorCode
  /* 404026 */ val ERR_CONN_CREATE_INVALID_PRIVATE_KEY: typings.snowflakeSdk.mod.ErrorCode.ERR_CONN_CREATE_INVALID_PRIVATE_KEY & Double = js.native
  
  @js.native
  sealed trait ERR_CONN_CREATE_INVALID_PRIVATE_KEY_PASS
    extends StObject
       with ErrorCode
  /* 404028 */ val ERR_CONN_CREATE_INVALID_PRIVATE_KEY_PASS: typings.snowflakeSdk.mod.ErrorCode.ERR_CONN_CREATE_INVALID_PRIVATE_KEY_PASS & Double = js.native
  
  @js.native
  sealed trait ERR_CONN_CREATE_INVALID_PRIVATE_KEY_PATH
    extends StObject
       with ErrorCode
  /* 404027 */ val ERR_CONN_CREATE_INVALID_PRIVATE_KEY_PATH: typings.snowflakeSdk.mod.ErrorCode.ERR_CONN_CREATE_INVALID_PRIVATE_KEY_PATH & Double = js.native
  
  @js.native
  sealed trait ERR_CONN_CREATE_INVALID_PROXY_HOST
    extends StObject
       with ErrorCode
  /* 404016 */ val ERR_CONN_CREATE_INVALID_PROXY_HOST: typings.snowflakeSdk.mod.ErrorCode.ERR_CONN_CREATE_INVALID_PROXY_HOST & Double = js.native
  
  @js.native
  sealed trait ERR_CONN_CREATE_INVALID_PROXY_PORT
    extends StObject
       with ErrorCode
  /* 404018 */ val ERR_CONN_CREATE_INVALID_PROXY_PORT: typings.snowflakeSdk.mod.ErrorCode.ERR_CONN_CREATE_INVALID_PROXY_PORT & Double = js.native
  
  @js.native
  sealed trait ERR_CONN_CREATE_INVALID_REGION
    extends StObject
       with ErrorCode
  /* 404022 */ val ERR_CONN_CREATE_INVALID_REGION: typings.snowflakeSdk.mod.ErrorCode.ERR_CONN_CREATE_INVALID_REGION & Double = js.native
  
  @js.native
  sealed trait ERR_CONN_CREATE_INVALID_ROLE
    extends StObject
       with ErrorCode
  /* 404014 */ val ERR_CONN_CREATE_INVALID_ROLE: typings.snowflakeSdk.mod.ErrorCode.ERR_CONN_CREATE_INVALID_ROLE & Double = js.native
  
  @js.native
  sealed trait ERR_CONN_CREATE_INVALID_SCHEMA
    extends StObject
       with ErrorCode
  /* 404013 */ val ERR_CONN_CREATE_INVALID_SCHEMA: typings.snowflakeSdk.mod.ErrorCode.ERR_CONN_CREATE_INVALID_SCHEMA & Double = js.native
  
  @js.native
  sealed trait ERR_CONN_CREATE_INVALID_STREAM_RESULT
    extends StObject
       with ErrorCode
  /* 404019 */ val ERR_CONN_CREATE_INVALID_STREAM_RESULT: typings.snowflakeSdk.mod.ErrorCode.ERR_CONN_CREATE_INVALID_STREAM_RESULT & Double = js.native
  
  @js.native
  sealed trait ERR_CONN_CREATE_INVALID_TREAT_INTEGER_AS_BIGINT
    extends StObject
       with ErrorCode
  /* 404025 */ val ERR_CONN_CREATE_INVALID_TREAT_INTEGER_AS_BIGINT: typings.snowflakeSdk.mod.ErrorCode.ERR_CONN_CREATE_INVALID_TREAT_INTEGER_AS_BIGINT & Double = js.native
  
  @js.native
  sealed trait ERR_CONN_CREATE_INVALID_USERNAME
    extends StObject
       with ErrorCode
  /* 404004 */ val ERR_CONN_CREATE_INVALID_USERNAME: typings.snowflakeSdk.mod.ErrorCode.ERR_CONN_CREATE_INVALID_USERNAME & Double = js.native
  
  @js.native
  sealed trait ERR_CONN_CREATE_INVALID_VALIDATE_DEFAULT_PARAMETERS
    extends StObject
       with ErrorCode
  /* 404030 */ val ERR_CONN_CREATE_INVALID_VALIDATE_DEFAULT_PARAMETERS: typings.snowflakeSdk.mod.ErrorCode.ERR_CONN_CREATE_INVALID_VALIDATE_DEFAULT_PARAMETERS & Double = js.native
  
  @js.native
  sealed trait ERR_CONN_CREATE_INVALID_WAREHOUSE
    extends StObject
       with ErrorCode
  /* 404011 */ val ERR_CONN_CREATE_INVALID_WAREHOUSE: typings.snowflakeSdk.mod.ErrorCode.ERR_CONN_CREATE_INVALID_WAREHOUSE & Double = js.native
  
  @js.native
  sealed trait ERR_CONN_CREATE_MISSING_ACCESS_URL
    extends StObject
       with ErrorCode
  /* 404009 */ val ERR_CONN_CREATE_MISSING_ACCESS_URL: typings.snowflakeSdk.mod.ErrorCode.ERR_CONN_CREATE_MISSING_ACCESS_URL & Double = js.native
  
  @js.native
  sealed trait ERR_CONN_CREATE_MISSING_ACCOUNT
    extends StObject
       with ErrorCode
  /* 404007 */ val ERR_CONN_CREATE_MISSING_ACCOUNT: typings.snowflakeSdk.mod.ErrorCode.ERR_CONN_CREATE_MISSING_ACCOUNT & Double = js.native
  
  // 404001
  @js.native
  sealed trait ERR_CONN_CREATE_MISSING_OPTIONS
    extends StObject
       with ErrorCode
  /* 404001 */ val ERR_CONN_CREATE_MISSING_OPTIONS: typings.snowflakeSdk.mod.ErrorCode.ERR_CONN_CREATE_MISSING_OPTIONS & Double = js.native
  
  @js.native
  sealed trait ERR_CONN_CREATE_MISSING_PASSWORD
    extends StObject
       with ErrorCode
  /* 404005 */ val ERR_CONN_CREATE_MISSING_PASSWORD: typings.snowflakeSdk.mod.ErrorCode.ERR_CONN_CREATE_MISSING_PASSWORD & Double = js.native
  
  @js.native
  sealed trait ERR_CONN_CREATE_MISSING_PROXY_HOST
    extends StObject
       with ErrorCode
  /* 404015 */ val ERR_CONN_CREATE_MISSING_PROXY_HOST: typings.snowflakeSdk.mod.ErrorCode.ERR_CONN_CREATE_MISSING_PROXY_HOST & Double = js.native
  
  @js.native
  sealed trait ERR_CONN_CREATE_MISSING_PROXY_PORT
    extends StObject
       with ErrorCode
  /* 404017 */ val ERR_CONN_CREATE_MISSING_PROXY_PORT: typings.snowflakeSdk.mod.ErrorCode.ERR_CONN_CREATE_MISSING_PROXY_PORT & Double = js.native
  
  @js.native
  sealed trait ERR_CONN_CREATE_MISSING_USERNAME
    extends StObject
       with ErrorCode
  /* 404003 */ val ERR_CONN_CREATE_MISSING_USERNAME: typings.snowflakeSdk.mod.ErrorCode.ERR_CONN_CREATE_MISSING_USERNAME & Double = js.native
  
  @js.native
  sealed trait ERR_CONN_DESERIALIZE_INVALID_CONFIG_FORM
    extends StObject
       with ErrorCode
  /* 408003 */ val ERR_CONN_DESERIALIZE_INVALID_CONFIG_FORM: typings.snowflakeSdk.mod.ErrorCode.ERR_CONN_DESERIALIZE_INVALID_CONFIG_FORM & Double = js.native
  
  @js.native
  sealed trait ERR_CONN_DESERIALIZE_INVALID_CONFIG_TYPE
    extends StObject
       with ErrorCode
  /* 408002 */ val ERR_CONN_DESERIALIZE_INVALID_CONFIG_TYPE: typings.snowflakeSdk.mod.ErrorCode.ERR_CONN_DESERIALIZE_INVALID_CONFIG_TYPE & Double = js.native
  
  // sql state: 08003
  // 408001
  @js.native
  sealed trait ERR_CONN_DESERIALIZE_MISSING_CONFIG
    extends StObject
       with ErrorCode
  /* 408001 */ val ERR_CONN_DESERIALIZE_MISSING_CONFIG: typings.snowflakeSdk.mod.ErrorCode.ERR_CONN_DESERIALIZE_MISSING_CONFIG & Double = js.native
  
  // sql state: 08002
  // 406001
  @js.native
  sealed trait ERR_CONN_DESTROY_INVALID_CALLBACK
    extends StObject
       with ErrorCode
  /* 406001 */ val ERR_CONN_DESTROY_INVALID_CALLBACK: typings.snowflakeSdk.mod.ErrorCode.ERR_CONN_DESTROY_INVALID_CALLBACK & Double = js.native
  
  @js.native
  sealed trait ERR_CONN_DESTROY_STATUS_DISCONNECTED
    extends StObject
       with ErrorCode
  /* 406502 */ val ERR_CONN_DESTROY_STATUS_DISCONNECTED: typings.snowflakeSdk.mod.ErrorCode.ERR_CONN_DESTROY_STATUS_DISCONNECTED & Double = js.native
  
  // 406501
  @js.native
  sealed trait ERR_CONN_DESTROY_STATUS_PRISTINE
    extends StObject
       with ErrorCode
  /* 406501 */ val ERR_CONN_DESTROY_STATUS_PRISTINE: typings.snowflakeSdk.mod.ErrorCode.ERR_CONN_DESTROY_STATUS_PRISTINE & Double = js.native
  
  @js.native
  sealed trait ERR_CONN_EXEC_STMT_INVALID_BINDS
    extends StObject
       with ErrorCode
  /* 409007 */ val ERR_CONN_EXEC_STMT_INVALID_BINDS: typings.snowflakeSdk.mod.ErrorCode.ERR_CONN_EXEC_STMT_INVALID_BINDS & Double = js.native
  
  @js.native
  sealed trait ERR_CONN_EXEC_STMT_INVALID_BIND_VALUES
    extends StObject
       with ErrorCode
  /* 409008 */ val ERR_CONN_EXEC_STMT_INVALID_BIND_VALUES: typings.snowflakeSdk.mod.ErrorCode.ERR_CONN_EXEC_STMT_INVALID_BIND_VALUES & Double = js.native
  
  @js.native
  sealed trait ERR_CONN_EXEC_STMT_INVALID_COMPLETE
    extends StObject
       with ErrorCode
  /* 409009 */ val ERR_CONN_EXEC_STMT_INVALID_COMPLETE: typings.snowflakeSdk.mod.ErrorCode.ERR_CONN_EXEC_STMT_INVALID_COMPLETE & Double = js.native
  
  @js.native
  sealed trait ERR_CONN_EXEC_STMT_INVALID_FETCH_AS_STRING
    extends StObject
       with ErrorCode
  /* 409011 */ val ERR_CONN_EXEC_STMT_INVALID_FETCH_AS_STRING: typings.snowflakeSdk.mod.ErrorCode.ERR_CONN_EXEC_STMT_INVALID_FETCH_AS_STRING & Double = js.native
  
  @js.native
  sealed trait ERR_CONN_EXEC_STMT_INVALID_FETCH_AS_STRING_VALUES
    extends StObject
       with ErrorCode
  /* 409012 */ val ERR_CONN_EXEC_STMT_INVALID_FETCH_AS_STRING_VALUES: typings.snowflakeSdk.mod.ErrorCode.ERR_CONN_EXEC_STMT_INVALID_FETCH_AS_STRING_VALUES & Double = js.native
  
  @js.native
  sealed trait ERR_CONN_EXEC_STMT_INVALID_INTERNAL
    extends StObject
       with ErrorCode
  /* 409005 */ val ERR_CONN_EXEC_STMT_INVALID_INTERNAL: typings.snowflakeSdk.mod.ErrorCode.ERR_CONN_EXEC_STMT_INVALID_INTERNAL & Double = js.native
  
  @js.native
  sealed trait ERR_CONN_EXEC_STMT_INVALID_OPTIONS
    extends StObject
       with ErrorCode
  /* 409002 */ val ERR_CONN_EXEC_STMT_INVALID_OPTIONS: typings.snowflakeSdk.mod.ErrorCode.ERR_CONN_EXEC_STMT_INVALID_OPTIONS & Double = js.native
  
  @js.native
  sealed trait ERR_CONN_EXEC_STMT_INVALID_PARAMETERS
    extends StObject
       with ErrorCode
  /* 409006 */ val ERR_CONN_EXEC_STMT_INVALID_PARAMETERS: typings.snowflakeSdk.mod.ErrorCode.ERR_CONN_EXEC_STMT_INVALID_PARAMETERS & Double = js.native
  
  @js.native
  sealed trait ERR_CONN_EXEC_STMT_INVALID_SQL_TEXT
    extends StObject
       with ErrorCode
  /* 409004 */ val ERR_CONN_EXEC_STMT_INVALID_SQL_TEXT: typings.snowflakeSdk.mod.ErrorCode.ERR_CONN_EXEC_STMT_INVALID_SQL_TEXT & Double = js.native
  
  @js.native
  sealed trait ERR_CONN_EXEC_STMT_INVALID_STREAM_RESULT
    extends StObject
       with ErrorCode
  /* 409010 */ val ERR_CONN_EXEC_STMT_INVALID_STREAM_RESULT: typings.snowflakeSdk.mod.ErrorCode.ERR_CONN_EXEC_STMT_INVALID_STREAM_RESULT & Double = js.native
  
  // 409001
  @js.native
  sealed trait ERR_CONN_EXEC_STMT_MISSING_OPTIONS
    extends StObject
       with ErrorCode
  /* 409001 */ val ERR_CONN_EXEC_STMT_MISSING_OPTIONS: typings.snowflakeSdk.mod.ErrorCode.ERR_CONN_EXEC_STMT_MISSING_OPTIONS & Double = js.native
  
  @js.native
  sealed trait ERR_CONN_EXEC_STMT_MISSING_SQL_TEXT
    extends StObject
       with ErrorCode
  /* 409003 */ val ERR_CONN_EXEC_STMT_MISSING_SQL_TEXT: typings.snowflakeSdk.mod.ErrorCode.ERR_CONN_EXEC_STMT_MISSING_SQL_TEXT & Double = js.native
  
  @js.native
  sealed trait ERR_CONN_FETCH_RESULT_INVALID_COMPLETE
    extends StObject
       with ErrorCode
  /* 410005 */ val ERR_CONN_FETCH_RESULT_INVALID_COMPLETE: typings.snowflakeSdk.mod.ErrorCode.ERR_CONN_FETCH_RESULT_INVALID_COMPLETE & Double = js.native
  
  @js.native
  sealed trait ERR_CONN_FETCH_RESULT_INVALID_FETCH_AS_STRING
    extends StObject
       with ErrorCode
  /* 410007 */ val ERR_CONN_FETCH_RESULT_INVALID_FETCH_AS_STRING: typings.snowflakeSdk.mod.ErrorCode.ERR_CONN_FETCH_RESULT_INVALID_FETCH_AS_STRING & Double = js.native
  
  @js.native
  sealed trait ERR_CONN_FETCH_RESULT_INVALID_FETCH_AS_STRING_VALUES
    extends StObject
       with ErrorCode
  /* 410008 */ val ERR_CONN_FETCH_RESULT_INVALID_FETCH_AS_STRING_VALUES: typings.snowflakeSdk.mod.ErrorCode.ERR_CONN_FETCH_RESULT_INVALID_FETCH_AS_STRING_VALUES & Double = js.native
  
  @js.native
  sealed trait ERR_CONN_FETCH_RESULT_INVALID_OPTIONS
    extends StObject
       with ErrorCode
  /* 410002 */ val ERR_CONN_FETCH_RESULT_INVALID_OPTIONS: typings.snowflakeSdk.mod.ErrorCode.ERR_CONN_FETCH_RESULT_INVALID_OPTIONS & Double = js.native
  
  @js.native
  sealed trait ERR_CONN_FETCH_RESULT_INVALID_STATEMENT_ID
    extends StObject
       with ErrorCode
  /* 410004 */ val ERR_CONN_FETCH_RESULT_INVALID_STATEMENT_ID: typings.snowflakeSdk.mod.ErrorCode.ERR_CONN_FETCH_RESULT_INVALID_STATEMENT_ID & Double = js.native
  
  @js.native
  sealed trait ERR_CONN_FETCH_RESULT_INVALID_STREAM_RESULT
    extends StObject
       with ErrorCode
  /* 410006 */ val ERR_CONN_FETCH_RESULT_INVALID_STREAM_RESULT: typings.snowflakeSdk.mod.ErrorCode.ERR_CONN_FETCH_RESULT_INVALID_STREAM_RESULT & Double = js.native
  
  // 410001
  @js.native
  sealed trait ERR_CONN_FETCH_RESULT_MISSING_OPTIONS
    extends StObject
       with ErrorCode
  /* 410001 */ val ERR_CONN_FETCH_RESULT_MISSING_OPTIONS: typings.snowflakeSdk.mod.ErrorCode.ERR_CONN_FETCH_RESULT_MISSING_OPTIONS & Double = js.native
  
  @js.native
  sealed trait ERR_CONN_FETCH_RESULT_MISSING_STATEMENT_ID
    extends StObject
       with ErrorCode
  /* 410003 */ val ERR_CONN_FETCH_RESULT_MISSING_STATEMENT_ID: typings.snowflakeSdk.mod.ErrorCode.ERR_CONN_FETCH_RESULT_MISSING_STATEMENT_ID & Double = js.native
  
  // sql state: 08003
  @js.native
  sealed trait ERR_CONN_REQUEST_STATUS_DISCONNECTED
    extends StObject
       with ErrorCode
  /* 407002 */ val ERR_CONN_REQUEST_STATUS_DISCONNECTED: typings.snowflakeSdk.mod.ErrorCode.ERR_CONN_REQUEST_STATUS_DISCONNECTED & Double = js.native
  
  // 407001
  @js.native
  sealed trait ERR_CONN_REQUEST_STATUS_PRISTINE
    extends StObject
       with ErrorCode
  /* 407001 */ val ERR_CONN_REQUEST_STATUS_PRISTINE: typings.snowflakeSdk.mod.ErrorCode.ERR_CONN_REQUEST_STATUS_PRISTINE & Double = js.native
  
  @js.native
  sealed trait ERR_GLOBAL_CONFIGURE_INVALID_INSECURE_CONNECT
    extends StObject
       with ErrorCode
  /* 403002 */ val ERR_GLOBAL_CONFIGURE_INVALID_INSECURE_CONNECT: typings.snowflakeSdk.mod.ErrorCode.ERR_GLOBAL_CONFIGURE_INVALID_INSECURE_CONNECT & Double = js.native
  
  // 403001
  @js.native
  sealed trait ERR_GLOBAL_CONFIGURE_INVALID_LOG_LEVEL
    extends StObject
       with ErrorCode
  /* 403001 */ val ERR_GLOBAL_CONFIGURE_INVALID_LOG_LEVEL: typings.snowflakeSdk.mod.ErrorCode.ERR_GLOBAL_CONFIGURE_INVALID_LOG_LEVEL & Double = js.native
  
  @js.native
  sealed trait ERR_GLOBAL_CONFIGURE_INVALID_OCSP_MODE
    extends StObject
       with ErrorCode
  /* 403003 */ val ERR_GLOBAL_CONFIGURE_INVALID_OCSP_MODE: typings.snowflakeSdk.mod.ErrorCode.ERR_GLOBAL_CONFIGURE_INVALID_OCSP_MODE & Double = js.native
  
  // 400001
  @js.native
  sealed trait ERR_INTERNAL_ASSERT_FAILED
    extends StObject
       with ErrorCode
  /* 400001 */ val ERR_INTERNAL_ASSERT_FAILED: typings.snowflakeSdk.mod.ErrorCode.ERR_INTERNAL_ASSERT_FAILED & Double = js.native
  
  // 402001
  @js.native
  sealed trait ERR_LARGE_RESULT_SET_NETWORK_COULD_NOT_CONNECT
    extends StObject
       with ErrorCode
  /* 402001 */ val ERR_LARGE_RESULT_SET_NETWORK_COULD_NOT_CONNECT: typings.snowflakeSdk.mod.ErrorCode.ERR_LARGE_RESULT_SET_NETWORK_COULD_NOT_CONNECT & Double = js.native
  
  @js.native
  sealed trait ERR_LARGE_RESULT_SET_RESPONSE_FAILURE
    extends StObject
       with ErrorCode
  /* 402002 */ val ERR_LARGE_RESULT_SET_RESPONSE_FAILURE: typings.snowflakeSdk.mod.ErrorCode.ERR_LARGE_RESULT_SET_RESPONSE_FAILURE & Double = js.native
  
  @js.native
  sealed trait ERR_OCSP_CACHE_EXPIRED
    extends StObject
       with ErrorCode
  /* 412009 */ val ERR_OCSP_CACHE_EXPIRED: typings.snowflakeSdk.mod.ErrorCode.ERR_OCSP_CACHE_EXPIRED & Double = js.native
  
  @js.native
  sealed trait ERR_OCSP_CACHE_SERVER_TIMEOUT
    extends StObject
       with ErrorCode
  /* 412013 */ val ERR_OCSP_CACHE_SERVER_TIMEOUT: typings.snowflakeSdk.mod.ErrorCode.ERR_OCSP_CACHE_SERVER_TIMEOUT & Double = js.native
  
  @js.native
  sealed trait ERR_OCSP_FAILED_OBTAIN_OCSP_RESPONSE
    extends StObject
       with ErrorCode
  /* 412014 */ val ERR_OCSP_FAILED_OBTAIN_OCSP_RESPONSE: typings.snowflakeSdk.mod.ErrorCode.ERR_OCSP_FAILED_OBTAIN_OCSP_RESPONSE & Double = js.native
  
  @js.native
  sealed trait ERR_OCSP_FAILED_PARSE_RESPONSE
    extends StObject
       with ErrorCode
  /* 412010 */ val ERR_OCSP_FAILED_PARSE_RESPONSE: typings.snowflakeSdk.mod.ErrorCode.ERR_OCSP_FAILED_PARSE_RESPONSE & Double = js.native
  
  @js.native
  sealed trait ERR_OCSP_INVALID_CERTIFICATE_VALIDITY
    extends StObject
       with ErrorCode
  /* 412011 */ val ERR_OCSP_INVALID_CERTIFICATE_VALIDITY: typings.snowflakeSdk.mod.ErrorCode.ERR_OCSP_INVALID_CERTIFICATE_VALIDITY & Double = js.native
  
  @js.native
  sealed trait ERR_OCSP_INVALID_SIGNATURE
    extends StObject
       with ErrorCode
  /* 412004 */ val ERR_OCSP_INVALID_SIGNATURE: typings.snowflakeSdk.mod.ErrorCode.ERR_OCSP_INVALID_SIGNATURE & Double = js.native
  
  @js.native
  sealed trait ERR_OCSP_INVALID_VALIDITY
    extends StObject
       with ErrorCode
  /* 412006 */ val ERR_OCSP_INVALID_VALIDITY: typings.snowflakeSdk.mod.ErrorCode.ERR_OCSP_INVALID_VALIDITY & Double = js.native
  
  @js.native
  sealed trait ERR_OCSP_NOT_TWO_ELEMENTS
    extends StObject
       with ErrorCode
  /* 412008 */ val ERR_OCSP_NOT_TWO_ELEMENTS: typings.snowflakeSdk.mod.ErrorCode.ERR_OCSP_NOT_TWO_ELEMENTS & Double = js.native
  
  @js.native
  sealed trait ERR_OCSP_NO_RESPONSE
    extends StObject
       with ErrorCode
  /* 412005 */ val ERR_OCSP_NO_RESPONSE: typings.snowflakeSdk.mod.ErrorCode.ERR_OCSP_NO_RESPONSE & Double = js.native
  
  @js.native
  sealed trait ERR_OCSP_NO_SIGNATURE_ALGORITHM
    extends StObject
       with ErrorCode
  /* 412003 */ val ERR_OCSP_NO_SIGNATURE_ALGORITHM: typings.snowflakeSdk.mod.ErrorCode.ERR_OCSP_NO_SIGNATURE_ALGORITHM & Double = js.native
  
  @js.native
  sealed trait ERR_OCSP_RESPONDER_TIMEOUT
    extends StObject
       with ErrorCode
  /* 412012 */ val ERR_OCSP_RESPONDER_TIMEOUT: typings.snowflakeSdk.mod.ErrorCode.ERR_OCSP_RESPONDER_TIMEOUT & Double = js.native
  
  // 412001
  @js.native
  sealed trait ERR_OCSP_REVOKED
    extends StObject
       with ErrorCode
  /* 412001 */ val ERR_OCSP_REVOKED: typings.snowflakeSdk.mod.ErrorCode.ERR_OCSP_REVOKED & Double = js.native
  
  @js.native
  sealed trait ERR_OCSP_UNKNOWN
    extends StObject
       with ErrorCode
  /* 412002 */ val ERR_OCSP_UNKNOWN: typings.snowflakeSdk.mod.ErrorCode.ERR_OCSP_UNKNOWN & Double = js.native
  
  @js.native
  sealed trait ERR_OCSP_UNKNOWN_STATE
    extends StObject
       with ErrorCode
  /* 412007 */ val ERR_OCSP_UNKNOWN_STATE: typings.snowflakeSdk.mod.ErrorCode.ERR_OCSP_UNKNOWN_STATE & Double = js.native
  
  // 401001
  @js.native
  sealed trait ERR_SF_NETWORK_COULD_NOT_CONNECT
    extends StObject
       with ErrorCode
  /* 401001 */ val ERR_SF_NETWORK_COULD_NOT_CONNECT: typings.snowflakeSdk.mod.ErrorCode.ERR_SF_NETWORK_COULD_NOT_CONNECT & Double = js.native
  
  @js.native
  sealed trait ERR_SF_RESPONSE_FAILURE
    extends StObject
       with ErrorCode
  /* 401002 */ val ERR_SF_RESPONSE_FAILURE: typings.snowflakeSdk.mod.ErrorCode.ERR_SF_RESPONSE_FAILURE & Double = js.native
  
  @js.native
  sealed trait ERR_SF_RESPONSE_INVALID_TOKEN
    extends StObject
       with ErrorCode
  /* 401004 */ val ERR_SF_RESPONSE_INVALID_TOKEN: typings.snowflakeSdk.mod.ErrorCode.ERR_SF_RESPONSE_INVALID_TOKEN & Double = js.native
  
  @js.native
  sealed trait ERR_SF_RESPONSE_NOT_JSON
    extends StObject
       with ErrorCode
  /* 401003 */ val ERR_SF_RESPONSE_NOT_JSON: typings.snowflakeSdk.mod.ErrorCode.ERR_SF_RESPONSE_NOT_JSON & Double = js.native
  
  @js.native
  sealed trait ERR_STMT_FETCH_ROWS_FETCHING_RESULT
    extends StObject
       with ErrorCode
  /* 450007 */ val ERR_STMT_FETCH_ROWS_FETCHING_RESULT: typings.snowflakeSdk.mod.ErrorCode.ERR_STMT_FETCH_ROWS_FETCHING_RESULT & Double = js.native
  
  @js.native
  sealed trait ERR_STMT_FETCH_ROWS_INVALID_EACH
    extends StObject
       with ErrorCode
  /* 450004 */ val ERR_STMT_FETCH_ROWS_INVALID_EACH: typings.snowflakeSdk.mod.ErrorCode.ERR_STMT_FETCH_ROWS_INVALID_EACH & Double = js.native
  
  @js.native
  sealed trait ERR_STMT_FETCH_ROWS_INVALID_END
    extends StObject
       with ErrorCode
  /* 450006 */ val ERR_STMT_FETCH_ROWS_INVALID_END: typings.snowflakeSdk.mod.ErrorCode.ERR_STMT_FETCH_ROWS_INVALID_END & Double = js.native
  
  @js.native
  sealed trait ERR_STMT_FETCH_ROWS_INVALID_OPTIONS
    extends StObject
       with ErrorCode
  /* 450002 */ val ERR_STMT_FETCH_ROWS_INVALID_OPTIONS: typings.snowflakeSdk.mod.ErrorCode.ERR_STMT_FETCH_ROWS_INVALID_OPTIONS & Double = js.native
  
  @js.native
  sealed trait ERR_STMT_FETCH_ROWS_MISSING_EACH
    extends StObject
       with ErrorCode
  /* 450003 */ val ERR_STMT_FETCH_ROWS_MISSING_EACH: typings.snowflakeSdk.mod.ErrorCode.ERR_STMT_FETCH_ROWS_MISSING_EACH & Double = js.native
  
  @js.native
  sealed trait ERR_STMT_FETCH_ROWS_MISSING_END
    extends StObject
       with ErrorCode
  /* 450005 */ val ERR_STMT_FETCH_ROWS_MISSING_END: typings.snowflakeSdk.mod.ErrorCode.ERR_STMT_FETCH_ROWS_MISSING_END & Double = js.native
  
  // 450001
  @js.native
  sealed trait ERR_STMT_FETCH_ROWS_MISSING_OPTIONS
    extends StObject
       with ErrorCode
  /* 450001 */ val ERR_STMT_FETCH_ROWS_MISSING_OPTIONS: typings.snowflakeSdk.mod.ErrorCode.ERR_STMT_FETCH_ROWS_MISSING_OPTIONS & Double = js.native
  
  @js.native
  sealed trait ERR_STMT_STREAM_ROWS_INVALID_END
    extends StObject
       with ErrorCode
  /* 411003 */ val ERR_STMT_STREAM_ROWS_INVALID_END: typings.snowflakeSdk.mod.ErrorCode.ERR_STMT_STREAM_ROWS_INVALID_END & Double = js.native
  
  @js.native
  sealed trait ERR_STMT_STREAM_ROWS_INVALID_FETCH_AS_STRING
    extends StObject
       with ErrorCode
  /* 411004 */ val ERR_STMT_STREAM_ROWS_INVALID_FETCH_AS_STRING: typings.snowflakeSdk.mod.ErrorCode.ERR_STMT_STREAM_ROWS_INVALID_FETCH_AS_STRING & Double = js.native
  
  @js.native
  sealed trait ERR_STMT_STREAM_ROWS_INVALID_FETCH_AS_STRING_VALUES
    extends StObject
       with ErrorCode
  /* 411005 */ val ERR_STMT_STREAM_ROWS_INVALID_FETCH_AS_STRING_VALUES: typings.snowflakeSdk.mod.ErrorCode.ERR_STMT_STREAM_ROWS_INVALID_FETCH_AS_STRING_VALUES & Double = js.native
  
  // 411001
  @js.native
  sealed trait ERR_STMT_STREAM_ROWS_INVALID_OPTIONS
    extends StObject
       with ErrorCode
  /* 411001 */ val ERR_STMT_STREAM_ROWS_INVALID_OPTIONS: typings.snowflakeSdk.mod.ErrorCode.ERR_STMT_STREAM_ROWS_INVALID_OPTIONS & Double = js.native
  
  @js.native
  sealed trait ERR_STMT_STREAM_ROWS_INVALID_START
    extends StObject
       with ErrorCode
  /* 411002 */ val ERR_STMT_STREAM_ROWS_INVALID_START: typings.snowflakeSdk.mod.ErrorCode.ERR_STMT_STREAM_ROWS_INVALID_START & Double = js.native
  
  @js.native
  sealed trait ERR_UNSUPPORTED_NODE_JS_VERSION
    extends StObject
       with ErrorCode
  /* 400002 */ val ERR_UNSUPPORTED_NODE_JS_VERSION: typings.snowflakeSdk.mod.ErrorCode.ERR_UNSUPPORTED_NODE_JS_VERSION & Double = js.native
}
