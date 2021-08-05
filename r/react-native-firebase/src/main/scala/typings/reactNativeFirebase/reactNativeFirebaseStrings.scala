package typings.reactNativeFirebase

import typings.reactNativeFirebase.mod.RNFirebase.database.QueryEventType
import typings.reactNativeFirebase.mod.RNFirebase.firestore.Types.QueryDirection
import typings.reactNativeFirebase.mod.RNFirebase.firestore.Types.QueryOperator
import typings.reactNativeFirebase.mod.RNFirebase.functions.FunctionsErrorCode
import typings.reactNativeFirebase.mod.RNFirebase.notifications.Android.Category
import typings.reactNativeFirebase.mod.RNFirebase.perf.HttpMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactNativeFirebaseStrings {
  
  @js.native
  sealed trait default extends StObject
  inline def default: default = "default".asInstanceOf[default]
  
  @js.native
  sealed trait ASC
    extends StObject
       with QueryDirection
  inline def ASC: ASC = "ASC".asInstanceOf[ASC]
  
  @js.native
  sealed trait CONNECT
    extends StObject
       with HttpMethod
  inline def CONNECT: CONNECT = "CONNECT".asInstanceOf[CONNECT]
  
  @js.native
  sealed trait DELETE
    extends StObject
       with HttpMethod
  inline def DELETE: DELETE = "DELETE".asInstanceOf[DELETE]
  
  @js.native
  sealed trait DESC
    extends StObject
       with QueryDirection
  inline def DESC: DESC = "DESC".asInstanceOf[DESC]
  
  @js.native
  sealed trait EMAIL_SIGNIN extends StObject
  inline def EMAIL_SIGNIN: EMAIL_SIGNIN = "EMAIL_SIGNIN".asInstanceOf[EMAIL_SIGNIN]
  
  @js.native
  sealed trait ERROR extends StObject
  inline def ERROR: ERROR = "ERROR".asInstanceOf[ERROR]
  
  @js.native
  sealed trait Equalssign
    extends StObject
       with QueryOperator
  inline def Equalssign: Equalssign = "=".asInstanceOf[Equalssign]
  
  @js.native
  sealed trait EqualssignEqualssign
    extends StObject
       with QueryOperator
  inline def EqualssignEqualssign: EqualssignEqualssign = "==".asInstanceOf[EqualssignEqualssign]
  
  @js.native
  sealed trait GET
    extends StObject
       with HttpMethod
  inline def GET: GET = "GET".asInstanceOf[GET]
  
  @js.native
  sealed trait Greaterthansign
    extends StObject
       with QueryOperator
  inline def Greaterthansign: Greaterthansign = ">".asInstanceOf[Greaterthansign]
  
  @js.native
  sealed trait GreaterthansignEqualssign
    extends StObject
       with QueryOperator
  inline def GreaterthansignEqualssign: GreaterthansignEqualssign = ">=".asInstanceOf[GreaterthansignEqualssign]
  
  @js.native
  sealed trait HEAD
    extends StObject
       with HttpMethod
  inline def HEAD: HEAD = "HEAD".asInstanceOf[HEAD]
  
  @js.native
  sealed trait Lessthansign
    extends StObject
       with QueryOperator
  inline def Lessthansign: Lessthansign = "<".asInstanceOf[Lessthansign]
  
  @js.native
  sealed trait LessthansignEqualssign
    extends StObject
       with QueryOperator
  inline def LessthansignEqualssign: LessthansignEqualssign = "<=".asInstanceOf[LessthansignEqualssign]
  
  @js.native
  sealed trait OPTIONS
    extends StObject
       with HttpMethod
  inline def OPTIONS: OPTIONS = "OPTIONS".asInstanceOf[OPTIONS]
  
  @js.native
  sealed trait PASSWORD_RESET extends StObject
  inline def PASSWORD_RESET: PASSWORD_RESET = "PASSWORD_RESET".asInstanceOf[PASSWORD_RESET]
  
  @js.native
  sealed trait PATCH
    extends StObject
       with HttpMethod
  inline def PATCH: PATCH = "PATCH".asInstanceOf[PATCH]
  
  @js.native
  sealed trait POST
    extends StObject
       with HttpMethod
  inline def POST: POST = "POST".asInstanceOf[POST]
  
  @js.native
  sealed trait PUT
    extends StObject
       with HttpMethod
  inline def PUT: PUT = "PUT".asInstanceOf[PUT]
  
  @js.native
  sealed trait RECOVER_EMAIL extends StObject
  inline def RECOVER_EMAIL: RECOVER_EMAIL = "RECOVER_EMAIL".asInstanceOf[RECOVER_EMAIL]
  
  @js.native
  sealed trait SHORT extends StObject
  inline def SHORT: SHORT = "SHORT".asInstanceOf[SHORT]
  
  @js.native
  sealed trait TRACE
    extends StObject
       with HttpMethod
  inline def TRACE: TRACE = "TRACE".asInstanceOf[TRACE]
  
  @js.native
  sealed trait UNGUESSABLE extends StObject
  inline def UNGUESSABLE: UNGUESSABLE = "UNGUESSABLE".asInstanceOf[UNGUESSABLE]
  
  @js.native
  sealed trait VERIFY_EMAIL extends StObject
  inline def VERIFY_EMAIL: VERIFY_EMAIL = "VERIFY_EMAIL".asInstanceOf[VERIFY_EMAIL]
  
  @js.native
  sealed trait aborted
    extends StObject
       with FunctionsErrorCode
  inline def aborted: aborted = "aborted".asInstanceOf[aborted]
  
  @js.native
  sealed trait added extends StObject
  inline def added: added = "added".asInstanceOf[added]
  
  @js.native
  sealed trait alarm
    extends StObject
       with Category
  inline def alarm: alarm = "alarm".asInstanceOf[alarm]
  
  @js.native
  sealed trait `already-exists`
    extends StObject
       with FunctionsErrorCode
  inline def `already-exists`: `already-exists` = "already-exists".asInstanceOf[`already-exists`]
  
  @js.native
  sealed trait array extends StObject
  inline def array: array = "array".asInstanceOf[array]
  
  @js.native
  sealed trait `array-contains`
    extends StObject
       with QueryOperator
  inline def `array-contains`: `array-contains` = "array-contains".asInstanceOf[`array-contains`]
  
  @js.native
  sealed trait asc_
    extends StObject
       with QueryDirection
  inline def asc_ : asc_ = "asc".asInstanceOf[asc_]
  
  @js.native
  sealed trait boolean extends StObject
  inline def boolean: boolean = "boolean".asInstanceOf[boolean]
  
  @js.native
  sealed trait cache extends StObject
  inline def cache: cache = "cache".asInstanceOf[cache]
  
  @js.native
  sealed trait call
    extends StObject
       with Category
  inline def call: call = "call".asInstanceOf[call]
  
  @js.native
  sealed trait cancelled
    extends StObject
       with FunctionsErrorCode
  inline def cancelled: cancelled = "cancelled".asInstanceOf[cancelled]
  
  @js.native
  sealed trait child_added
    extends StObject
       with QueryEventType
  inline def child_added: child_added = "child_added".asInstanceOf[child_added]
  
  @js.native
  sealed trait child_changed
    extends StObject
       with QueryEventType
  inline def child_changed: child_changed = "child_changed".asInstanceOf[child_changed]
  
  @js.native
  sealed trait child_moved
    extends StObject
       with QueryEventType
  inline def child_moved: child_moved = "child_moved".asInstanceOf[child_moved]
  
  @js.native
  sealed trait child_removed
    extends StObject
       with QueryEventType
  inline def child_removed: child_removed = "child_removed".asInstanceOf[child_removed]
  
  @js.native
  sealed trait `data-loss`
    extends StObject
       with FunctionsErrorCode
  inline def `data-loss`: `data-loss` = "data-loss".asInstanceOf[`data-loss`]
  
  @js.native
  sealed trait date extends StObject
  inline def date: date = "date".asInstanceOf[date]
  
  @js.native
  sealed trait day extends StObject
  inline def day: day = "day".asInstanceOf[day]
  
  @js.native
  sealed trait `deadline-exceeded`
    extends StObject
       with FunctionsErrorCode
  inline def `deadline-exceeded`: `deadline-exceeded` = "deadline-exceeded".asInstanceOf[`deadline-exceeded`]
  
  @js.native
  sealed trait debug extends StObject
  inline def debug: debug = "debug".asInstanceOf[debug]
  
  @js.native
  sealed trait desc_
    extends StObject
       with QueryDirection
  inline def desc_ : desc_ = "desc".asInstanceOf[desc_]
  
  @js.native
  sealed trait documentid extends StObject
  inline def documentid: documentid = "documentid".asInstanceOf[documentid]
  
  @js.native
  sealed trait email
    extends StObject
       with Category
  inline def email: email = "email".asInstanceOf[email]
  
  @js.native
  sealed trait err
    extends StObject
       with Category
  inline def err: err = "err".asInstanceOf[err]
  
  @js.native
  sealed trait error_ extends StObject
  inline def error_ : error_ = "error".asInstanceOf[error_]
  
  @js.native
  sealed trait event
    extends StObject
       with Category
  inline def event: event = "event".asInstanceOf[event]
  
  @js.native
  sealed trait `failed-precondition`
    extends StObject
       with FunctionsErrorCode
  inline def `failed-precondition`: `failed-precondition` = "failed-precondition".asInstanceOf[`failed-precondition`]
  
  @js.native
  sealed trait fieldpath extends StObject
  inline def fieldpath: fieldpath = "fieldpath".asInstanceOf[fieldpath]
  
  @js.native
  sealed trait fieldvalue extends StObject
  inline def fieldvalue: fieldvalue = "fieldvalue".asInstanceOf[fieldvalue]
  
  @js.native
  sealed trait geopoint extends StObject
  inline def geopoint: geopoint = "geopoint".asInstanceOf[geopoint]
  
  @js.native
  sealed trait hour extends StObject
  inline def hour: hour = "hour".asInstanceOf[hour]
  
  @js.native
  sealed trait internal
    extends StObject
       with FunctionsErrorCode
  inline def internal: internal = "internal".asInstanceOf[internal]
  
  @js.native
  sealed trait `invalid-argument`
    extends StObject
       with FunctionsErrorCode
  inline def `invalid-argument`: `invalid-argument` = "invalid-argument".asInstanceOf[`invalid-argument`]
  
  @js.native
  sealed trait minute extends StObject
  inline def minute: minute = "minute".asInstanceOf[minute]
  
  @js.native
  sealed trait modified extends StObject
  inline def modified: modified = "modified".asInstanceOf[modified]
  
  @js.native
  sealed trait msg
    extends StObject
       with Category
  inline def msg: msg = "msg".asInstanceOf[msg]
  
  @js.native
  sealed trait `not-found`
    extends StObject
       with FunctionsErrorCode
  inline def `not-found`: `not-found` = "not-found".asInstanceOf[`not-found`]
  
  @js.native
  sealed trait `null` extends StObject
  inline def `null`: `null` = "null".asInstanceOf[`null`]
  
  @js.native
  sealed trait number extends StObject
  inline def number: number = "number".asInstanceOf[number]
  
  @js.native
  sealed trait `object` extends StObject
  inline def `object`: `object` = "object".asInstanceOf[`object`]
  
  @js.native
  sealed trait ok
    extends StObject
       with FunctionsErrorCode
  inline def ok: ok = "ok".asInstanceOf[ok]
  
  @js.native
  sealed trait `out-of-range`
    extends StObject
       with FunctionsErrorCode
  inline def `out-of-range`: `out-of-range` = "out-of-range".asInstanceOf[`out-of-range`]
  
  @js.native
  sealed trait `permission-denied`
    extends StObject
       with FunctionsErrorCode
  inline def `permission-denied`: `permission-denied` = "permission-denied".asInstanceOf[`permission-denied`]
  
  @js.native
  sealed trait progress
    extends StObject
       with Category
  inline def progress: progress = "progress".asInstanceOf[progress]
  
  @js.native
  sealed trait promo
    extends StObject
       with Category
  inline def promo: promo = "promo".asInstanceOf[promo]
  
  @js.native
  sealed trait recommendation
    extends StObject
       with Category
  inline def recommendation: recommendation = "recommendation".asInstanceOf[recommendation]
  
  @js.native
  sealed trait reference extends StObject
  inline def reference: reference = "reference".asInstanceOf[reference]
  
  @js.native
  sealed trait reminder
    extends StObject
       with Category
  inline def reminder: reminder = "reminder".asInstanceOf[reminder]
  
  @js.native
  sealed trait removed extends StObject
  inline def removed: removed = "removed".asInstanceOf[removed]
  
  @js.native
  sealed trait `resource-exhausted`
    extends StObject
       with FunctionsErrorCode
  inline def `resource-exhausted`: `resource-exhausted` = "resource-exhausted".asInstanceOf[`resource-exhausted`]
  
  @js.native
  sealed trait sent extends StObject
  inline def sent: sent = "sent".asInstanceOf[sent]
  
  @js.native
  sealed trait server extends StObject
  inline def server: server = "server".asInstanceOf[server]
  
  @js.native
  sealed trait service
    extends StObject
       with Category
  inline def service: service = "service".asInstanceOf[service]
  
  @js.native
  sealed trait silent extends StObject
  inline def silent: silent = "silent".asInstanceOf[silent]
  
  @js.native
  sealed trait social
    extends StObject
       with Category
  inline def social: social = "social".asInstanceOf[social]
  
  @js.native
  sealed trait status
    extends StObject
       with Category
  inline def status: status = "status".asInstanceOf[status]
  
  @js.native
  sealed trait string extends StObject
  inline def string: string = "string".asInstanceOf[string]
  
  @js.native
  sealed trait system
    extends StObject
       with Category
  inline def system: system = "system".asInstanceOf[system]
  
  @js.native
  sealed trait timeout extends StObject
  inline def timeout: timeout = "timeout".asInstanceOf[timeout]
  
  @js.native
  sealed trait transport
    extends StObject
       with Category
  inline def transport: transport = "transport".asInstanceOf[transport]
  
  @js.native
  sealed trait unauthenticated
    extends StObject
       with FunctionsErrorCode
  inline def unauthenticated: unauthenticated = "unauthenticated".asInstanceOf[unauthenticated]
  
  @js.native
  sealed trait unavailable
    extends StObject
       with FunctionsErrorCode
  inline def unavailable: unavailable = "unavailable".asInstanceOf[unavailable]
  
  @js.native
  sealed trait unimplemented
    extends StObject
       with FunctionsErrorCode
  inline def unimplemented: unimplemented = "unimplemented".asInstanceOf[unimplemented]
  
  @js.native
  sealed trait unknown
    extends StObject
       with FunctionsErrorCode
  inline def unknown: unknown = "unknown".asInstanceOf[unknown]
  
  @js.native
  sealed trait value
    extends StObject
       with QueryEventType
  inline def value: value = "value".asInstanceOf[value]
  
  @js.native
  sealed trait verified extends StObject
  inline def verified: verified = "verified".asInstanceOf[verified]
  
  @js.native
  sealed trait week extends StObject
  inline def week: week = "week".asInstanceOf[week]
}
