package typings.reactNativeFirebase.mod.RNFirebase

import org.scalablytyped.runtime.StringDictionary
import typings.reactNativeFirebase.mod.App
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Source: https://github.com/firebase/firebase-js-sdk/blob/master/packages/functions-types/index.d.ts
object functions {
  
  /**
    * `FirebaseFunctions` represents a Functions app, and is the entry point for
    * all Functions operations.
    */
  trait Functions
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    /**
      * Gets an `HttpsCallable` instance that refers to the function with the given
      * name.
      *
      * @param name The name of the https callable function.
      * @return The `HttpsCallable` instance.
      */
    def httpsCallable[Params, Result](name: String): HttpsCallable[Params, Result]
    
    /**
      * Changes this instance to point to a Cloud Functions emulator running
      * locally.
      *
      * See https://firebase.google.com/docs/functions/local-emulator
      *
      * @param origin the origin string of the local emulator started via firebase tools
      * "http://10.0.0.8:1337".
      */
    def useFunctionsEmulator(origin: String): js.Promise[Null]
  }
  object Functions {
    
    inline def apply(httpsCallable: String => HttpsCallable[Any, Any], useFunctionsEmulator: String => js.Promise[Null]): Functions = {
      val __obj = js.Dynamic.literal(httpsCallable = js.Any.fromFunction1(httpsCallable), useFunctionsEmulator = js.Any.fromFunction1(useFunctionsEmulator))
      __obj.asInstanceOf[Functions]
    }
    
    extension [Self <: Functions](x: Self) {
      
      inline def setHttpsCallable(value: String => HttpsCallable[Any, Any]): Self = StObject.set(x, "httpsCallable", js.Any.fromFunction1(value))
      
      inline def setUseFunctionsEmulator(value: String => js.Promise[Null]): Self = StObject.set(x, "useFunctionsEmulator", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * The set of Firebase Functions status codes. The codes are the same at the
    * ones exposed by gRPC here:
    * https://github.com/grpc/grpc/blob/master/doc/statuscodes.md
    *
    * Possible values:
    * - 'cancelled': The operation was cancelled (typically by the caller).
    * - 'unknown': Unknown error or an error from a different error domain.
    * - 'invalid-argument': Client specified an invalid argument. Note that this
    *   differs from 'failed-precondition'. 'invalid-argument' indicates
    *   arguments that are problematic regardless of the state of the system
    *   (e.g. an invalid field name).
    * - 'deadline-exceeded': Deadline expired before operation could complete.
    *   For operations that change the state of the system, this error may be
    *   returned even if the operation has completed successfully. For example,
    *   a successful response from a server could have been delayed long enough
    *   for the deadline to expire.
    * - 'not-found': Some requested document was not found.
    * - 'already-exists': Some document that we attempted to create already
    *   exists.
    * - 'permission-denied': The caller does not have permission to execute the
    *   specified operation.
    * - 'resource-exhausted': Some resource has been exhausted, perhaps a
    *   per-user quota, or perhaps the entire file system is out of space.
    * - 'failed-precondition': Operation was rejected because the system is not
    *   in a state required for the operation's execution.
    * - 'aborted': The operation was aborted, typically due to a concurrency
    *   issue like transaction aborts, etc.
    * - 'out-of-range': Operation was attempted past the valid range.
    * - 'unimplemented': Operation is not implemented or not supported/enabled.
    * - 'internal': Internal errors. Means some invariants expected by
    *   underlying system has been broken. If you see one of these errors,
    *   something is very broken.
    * - 'unavailable': The service is currently unavailable. This is most likely
    *   a transient condition and may be corrected by retrying with a backoff.
    * - 'data-loss': Unrecoverable data loss or corruption.
    * - 'unauthenticated': The request does not have valid authentication
    *   credentials for the operation.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativeFirebase.reactNativeFirebaseStrings.ok
    - typings.reactNativeFirebase.reactNativeFirebaseStrings.cancelled
    - typings.reactNativeFirebase.reactNativeFirebaseStrings.unknown
    - typings.reactNativeFirebase.reactNativeFirebaseStrings.`invalid-argument`
    - typings.reactNativeFirebase.reactNativeFirebaseStrings.`deadline-exceeded`
    - typings.reactNativeFirebase.reactNativeFirebaseStrings.`not-found`
    - typings.reactNativeFirebase.reactNativeFirebaseStrings.`already-exists`
    - typings.reactNativeFirebase.reactNativeFirebaseStrings.`permission-denied`
    - typings.reactNativeFirebase.reactNativeFirebaseStrings.`resource-exhausted`
    - typings.reactNativeFirebase.reactNativeFirebaseStrings.`failed-precondition`
    - typings.reactNativeFirebase.reactNativeFirebaseStrings.aborted
    - typings.reactNativeFirebase.reactNativeFirebaseStrings.`out-of-range`
    - typings.reactNativeFirebase.reactNativeFirebaseStrings.unimplemented
    - typings.reactNativeFirebase.reactNativeFirebaseStrings.internal
    - typings.reactNativeFirebase.reactNativeFirebaseStrings.unavailable
    - typings.reactNativeFirebase.reactNativeFirebaseStrings.`data-loss`
    - typings.reactNativeFirebase.reactNativeFirebaseStrings.unauthenticated
  */
  trait FunctionsErrorCode extends StObject
  object FunctionsErrorCode {
    
    inline def aborted: typings.reactNativeFirebase.reactNativeFirebaseStrings.aborted = "aborted".asInstanceOf[typings.reactNativeFirebase.reactNativeFirebaseStrings.aborted]
    
    inline def `already-exists`: typings.reactNativeFirebase.reactNativeFirebaseStrings.`already-exists` = "already-exists".asInstanceOf[typings.reactNativeFirebase.reactNativeFirebaseStrings.`already-exists`]
    
    inline def cancelled: typings.reactNativeFirebase.reactNativeFirebaseStrings.cancelled = "cancelled".asInstanceOf[typings.reactNativeFirebase.reactNativeFirebaseStrings.cancelled]
    
    inline def `data-loss`: typings.reactNativeFirebase.reactNativeFirebaseStrings.`data-loss` = "data-loss".asInstanceOf[typings.reactNativeFirebase.reactNativeFirebaseStrings.`data-loss`]
    
    inline def `deadline-exceeded`: typings.reactNativeFirebase.reactNativeFirebaseStrings.`deadline-exceeded` = "deadline-exceeded".asInstanceOf[typings.reactNativeFirebase.reactNativeFirebaseStrings.`deadline-exceeded`]
    
    inline def `failed-precondition`: typings.reactNativeFirebase.reactNativeFirebaseStrings.`failed-precondition` = "failed-precondition".asInstanceOf[typings.reactNativeFirebase.reactNativeFirebaseStrings.`failed-precondition`]
    
    inline def internal: typings.reactNativeFirebase.reactNativeFirebaseStrings.internal = "internal".asInstanceOf[typings.reactNativeFirebase.reactNativeFirebaseStrings.internal]
    
    inline def `invalid-argument`: typings.reactNativeFirebase.reactNativeFirebaseStrings.`invalid-argument` = "invalid-argument".asInstanceOf[typings.reactNativeFirebase.reactNativeFirebaseStrings.`invalid-argument`]
    
    inline def `not-found`: typings.reactNativeFirebase.reactNativeFirebaseStrings.`not-found` = "not-found".asInstanceOf[typings.reactNativeFirebase.reactNativeFirebaseStrings.`not-found`]
    
    inline def ok: typings.reactNativeFirebase.reactNativeFirebaseStrings.ok = "ok".asInstanceOf[typings.reactNativeFirebase.reactNativeFirebaseStrings.ok]
    
    inline def `out-of-range`: typings.reactNativeFirebase.reactNativeFirebaseStrings.`out-of-range` = "out-of-range".asInstanceOf[typings.reactNativeFirebase.reactNativeFirebaseStrings.`out-of-range`]
    
    inline def `permission-denied`: typings.reactNativeFirebase.reactNativeFirebaseStrings.`permission-denied` = "permission-denied".asInstanceOf[typings.reactNativeFirebase.reactNativeFirebaseStrings.`permission-denied`]
    
    inline def `resource-exhausted`: typings.reactNativeFirebase.reactNativeFirebaseStrings.`resource-exhausted` = "resource-exhausted".asInstanceOf[typings.reactNativeFirebase.reactNativeFirebaseStrings.`resource-exhausted`]
    
    inline def unauthenticated: typings.reactNativeFirebase.reactNativeFirebaseStrings.unauthenticated = "unauthenticated".asInstanceOf[typings.reactNativeFirebase.reactNativeFirebaseStrings.unauthenticated]
    
    inline def unavailable: typings.reactNativeFirebase.reactNativeFirebaseStrings.unavailable = "unavailable".asInstanceOf[typings.reactNativeFirebase.reactNativeFirebaseStrings.unavailable]
    
    inline def unimplemented: typings.reactNativeFirebase.reactNativeFirebaseStrings.unimplemented = "unimplemented".asInstanceOf[typings.reactNativeFirebase.reactNativeFirebaseStrings.unimplemented]
    
    inline def unknown: typings.reactNativeFirebase.reactNativeFirebaseStrings.unknown = "unknown".asInstanceOf[typings.reactNativeFirebase.reactNativeFirebaseStrings.unknown]
  }
  
  /**
    * firebase.functions.X
    */
  @js.native
  trait FunctionsStatics extends StObject {
    
    /**
      * constructor overload:
      * See https://github.com/invertase/react-native-firebase-docs/blob/master/docs/functions/reference/functions.md
      */
    def apply(): Functions = js.native
    def apply(appOrRegion: String): Functions = js.native
    def apply(appOrRegion: String, region: String): Functions = js.native
    def apply(appOrRegion: Unit, region: String): Functions = js.native
    def apply(appOrRegion: App): Functions = js.native
    def apply(appOrRegion: App, region: String): Functions = js.native
    
    /**
      * Uppercased + underscored variables of @FunctionsErrorCode
      */
    var HttpsErrorCode: typings.reactNativeFirebase.mod.RNFirebase.functions.HttpsErrorCode = js.native
  }
  
  /**
    * An HttpsCallable is a reference to a "callable" http trigger in
    * Google Cloud Functions.
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    Params extends void ? (): std.Promise<react-native-firebase.react-native-firebase.RNFirebase.functions.HttpsCallableResult<Result>> : (data : Params): std.Promise<react-native-firebase.react-native-firebase.RNFirebase.functions.HttpsCallableResult<Result>>
    }}}
    */
  type HttpsCallable[Params, Result] = js.Function0[js.Promise[HttpsCallableResult[Result]]]
  
  /**
    * An HttpsCallableResult wraps a single result from a function call.
    */
  trait HttpsCallableResult[R] extends StObject {
    
    val data: R
  }
  object HttpsCallableResult {
    
    inline def apply[R](data: R): HttpsCallableResult[R] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[HttpsCallableResult[R]]
    }
    
    extension [Self <: HttpsCallableResult[?], R](x: Self & HttpsCallableResult[R]) {
      
      inline def setData(value: R): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
  
  trait HttpsError
    extends StObject
       with Error {
    
    /**
      * A standard error code that will be returned to the client. This also
      * determines the HTTP status code of the response, as defined in code.proto.
      */
    val code: FunctionsErrorCode
    
    /**
      * Extra data to be converted to JSON and included in the error response.
      */
    val details: js.UndefOr[Any] = js.undefined
  }
  object HttpsError {
    
    inline def apply(code: FunctionsErrorCode, message: String, name: String): HttpsError = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[HttpsError]
    }
    
    extension [Self <: HttpsError](x: Self) {
      
      inline def setCode(value: FunctionsErrorCode): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setDetails(value: Any): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    }
  }
  
  type HttpsErrorCode = StringDictionary[FunctionsErrorCode]
}
