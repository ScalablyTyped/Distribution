package typings.smithyTypes

import typings.smithyTypes.distTypesMiddlewareMod.Priority
import typings.smithyTypes.distTypesMiddlewareMod.Relation
import typings.smithyTypes.distTypesMiddlewareMod.Step
import typings.smithyTypes.distTypesRetryMod.ExponentialBackoffJitterType
import typings.smithyTypes.distTypesRetryMod.RetryErrorType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object smithyTypesStrings {
  
  @js.native
  sealed trait Boolean extends StObject
  inline def Boolean: Boolean = "Boolean".asInstanceOf[Boolean]
  
  @js.native
  sealed trait CLIENT_ERROR
    extends StObject
       with RetryErrorType
  inline def CLIENT_ERROR: CLIENT_ERROR = "CLIENT_ERROR".asInstanceOf[CLIENT_ERROR]
  
  @js.native
  sealed trait DECORRELATED
    extends StObject
       with ExponentialBackoffJitterType
  inline def DECORRELATED: DECORRELATED = "DECORRELATED".asInstanceOf[DECORRELATED]
  
  @js.native
  sealed trait DEFAULT
    extends StObject
       with ExponentialBackoffJitterType
  inline def DEFAULT: DEFAULT = "DEFAULT".asInstanceOf[DEFAULT]
  
  @js.native
  sealed trait FULL
    extends StObject
       with ExponentialBackoffJitterType
  inline def FULL: FULL = "FULL".asInstanceOf[FULL]
  
  @js.native
  sealed trait NONE
    extends StObject
       with ExponentialBackoffJitterType
  inline def NONE: NONE = "NONE".asInstanceOf[NONE]
  
  @js.native
  sealed trait SERVER_ERROR
    extends StObject
       with RetryErrorType
  inline def SERVER_ERROR: SERVER_ERROR = "SERVER_ERROR".asInstanceOf[SERVER_ERROR]
  
  @js.native
  sealed trait String extends StObject
  inline def String: String = "String".asInstanceOf[String]
  
  @js.native
  sealed trait THROTTLING
    extends StObject
       with RetryErrorType
  inline def THROTTLING: THROTTLING = "THROTTLING".asInstanceOf[THROTTLING]
  
  @js.native
  sealed trait TRANSIENT
    extends StObject
       with RetryErrorType
  inline def TRANSIENT: TRANSIENT = "TRANSIENT".asInstanceOf[TRANSIENT]
  
  @js.native
  sealed trait after
    extends StObject
       with Relation
  inline def after: after = "after".asInstanceOf[after]
  
  @js.native
  sealed trait ascii extends StObject
  inline def ascii: ascii = "ascii".asInstanceOf[ascii]
  
  @js.native
  sealed trait before
    extends StObject
       with Relation
  inline def before: before = "before".asInstanceOf[before]
  
  @js.native
  sealed trait binary extends StObject
  inline def binary: binary = "binary".asInstanceOf[binary]
  
  @js.native
  sealed trait boolean_ extends StObject
  inline def boolean_ : boolean_ = "boolean".asInstanceOf[boolean_]
  
  @js.native
  sealed trait build
    extends StObject
       with Step
  inline def build: build = "build".asInstanceOf[build]
  
  @js.native
  sealed trait byte extends StObject
  inline def byte: byte = "byte".asInstanceOf[byte]
  
  @js.native
  sealed trait client extends StObject
  inline def client: client = "client".asInstanceOf[client]
  
  @js.native
  sealed trait deserialize
    extends StObject
       with Step
  inline def deserialize: deserialize = "deserialize".asInstanceOf[deserialize]
  
  @js.native
  sealed trait endpoint extends StObject
  inline def endpoint: endpoint = "endpoint".asInstanceOf[endpoint]
  
  @js.native
  sealed trait error extends StObject
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait finalizeRequest
    extends StObject
       with Step
  inline def finalizeRequest: finalizeRequest = "finalizeRequest".asInstanceOf[finalizeRequest]
  
  @js.native
  sealed trait high
    extends StObject
       with Priority
  inline def high: high = "high".asInstanceOf[high]
  
  @js.native
  sealed trait initialize
    extends StObject
       with Step
  inline def initialize: initialize = "initialize".asInstanceOf[initialize]
  
  @js.native
  sealed trait integer extends StObject
  inline def integer: integer = "integer".asInstanceOf[integer]
  
  @js.native
  sealed trait latin1 extends StObject
  inline def latin1: latin1 = "latin1".asInstanceOf[latin1]
  
  @js.native
  sealed trait long extends StObject
  inline def long: long = "long".asInstanceOf[long]
  
  @js.native
  sealed trait low
    extends StObject
       with Priority
  inline def low: low = "low".asInstanceOf[low]
  
  @js.native
  sealed trait normal
    extends StObject
       with Priority
  inline def normal: normal = "normal".asInstanceOf[normal]
  
  @js.native
  sealed trait serialize
    extends StObject
       with Step
  inline def serialize: serialize = "serialize".asInstanceOf[serialize]
  
  @js.native
  sealed trait server extends StObject
  inline def server: server = "server".asInstanceOf[server]
  
  @js.native
  sealed trait short extends StObject
  inline def short: short = "short".asInstanceOf[short]
  
  @js.native
  sealed trait sigv4 extends StObject
  inline def sigv4: sigv4 = "sigv4".asInstanceOf[sigv4]
  
  @js.native
  sealed trait sigv4a extends StObject
  inline def sigv4a: sigv4a = "sigv4a".asInstanceOf[sigv4a]
  
  @js.native
  sealed trait string_ extends StObject
  inline def string_ : string_ = "string".asInstanceOf[string_]
  
  @js.native
  sealed trait timestamp extends StObject
  inline def timestamp: timestamp = "timestamp".asInstanceOf[timestamp]
  
  @js.native
  sealed trait tree extends StObject
  inline def tree: tree = "tree".asInstanceOf[tree]
  
  @js.native
  sealed trait utf8 extends StObject
  inline def utf8: utf8 = "utf8".asInstanceOf[utf8]
  
  @js.native
  sealed trait uuid extends StObject
  inline def uuid: uuid = "uuid".asInstanceOf[uuid]
}
