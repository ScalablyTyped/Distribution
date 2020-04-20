package typings.reactNativeFirebase.mod.RNFirebase.functions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
trait FunctionsErrorCode extends js.Object

object FunctionsErrorCode {
  @scala.inline
  def aborted: typings.reactNativeFirebase.reactNativeFirebaseStrings.aborted = "aborted".asInstanceOf[typings.reactNativeFirebase.reactNativeFirebaseStrings.aborted]
  @scala.inline
  def `already-exists`: typings.reactNativeFirebase.reactNativeFirebaseStrings.`already-exists` = "already-exists".asInstanceOf[typings.reactNativeFirebase.reactNativeFirebaseStrings.`already-exists`]
  @scala.inline
  def cancelled: typings.reactNativeFirebase.reactNativeFirebaseStrings.cancelled = "cancelled".asInstanceOf[typings.reactNativeFirebase.reactNativeFirebaseStrings.cancelled]
  @scala.inline
  def `data-loss`: typings.reactNativeFirebase.reactNativeFirebaseStrings.`data-loss` = "data-loss".asInstanceOf[typings.reactNativeFirebase.reactNativeFirebaseStrings.`data-loss`]
  @scala.inline
  def `deadline-exceeded`: typings.reactNativeFirebase.reactNativeFirebaseStrings.`deadline-exceeded` = "deadline-exceeded".asInstanceOf[typings.reactNativeFirebase.reactNativeFirebaseStrings.`deadline-exceeded`]
  @scala.inline
  def `failed-precondition`: typings.reactNativeFirebase.reactNativeFirebaseStrings.`failed-precondition` = "failed-precondition".asInstanceOf[typings.reactNativeFirebase.reactNativeFirebaseStrings.`failed-precondition`]
  @scala.inline
  def internal: typings.reactNativeFirebase.reactNativeFirebaseStrings.internal = "internal".asInstanceOf[typings.reactNativeFirebase.reactNativeFirebaseStrings.internal]
  @scala.inline
  def `invalid-argument`: typings.reactNativeFirebase.reactNativeFirebaseStrings.`invalid-argument` = "invalid-argument".asInstanceOf[typings.reactNativeFirebase.reactNativeFirebaseStrings.`invalid-argument`]
  @scala.inline
  def `not-found`: typings.reactNativeFirebase.reactNativeFirebaseStrings.`not-found` = "not-found".asInstanceOf[typings.reactNativeFirebase.reactNativeFirebaseStrings.`not-found`]
  @scala.inline
  def ok: typings.reactNativeFirebase.reactNativeFirebaseStrings.ok = "ok".asInstanceOf[typings.reactNativeFirebase.reactNativeFirebaseStrings.ok]
  @scala.inline
  def `out-of-range`: typings.reactNativeFirebase.reactNativeFirebaseStrings.`out-of-range` = "out-of-range".asInstanceOf[typings.reactNativeFirebase.reactNativeFirebaseStrings.`out-of-range`]
  @scala.inline
  def `permission-denied`: typings.reactNativeFirebase.reactNativeFirebaseStrings.`permission-denied` = "permission-denied".asInstanceOf[typings.reactNativeFirebase.reactNativeFirebaseStrings.`permission-denied`]
  @scala.inline
  def `resource-exhausted`: typings.reactNativeFirebase.reactNativeFirebaseStrings.`resource-exhausted` = "resource-exhausted".asInstanceOf[typings.reactNativeFirebase.reactNativeFirebaseStrings.`resource-exhausted`]
  @scala.inline
  def unauthenticated: typings.reactNativeFirebase.reactNativeFirebaseStrings.unauthenticated = "unauthenticated".asInstanceOf[typings.reactNativeFirebase.reactNativeFirebaseStrings.unauthenticated]
  @scala.inline
  def unavailable: typings.reactNativeFirebase.reactNativeFirebaseStrings.unavailable = "unavailable".asInstanceOf[typings.reactNativeFirebase.reactNativeFirebaseStrings.unavailable]
  @scala.inline
  def unimplemented: typings.reactNativeFirebase.reactNativeFirebaseStrings.unimplemented = "unimplemented".asInstanceOf[typings.reactNativeFirebase.reactNativeFirebaseStrings.unimplemented]
  @scala.inline
  def unknown: typings.reactNativeFirebase.reactNativeFirebaseStrings.unknown = "unknown".asInstanceOf[typings.reactNativeFirebase.reactNativeFirebaseStrings.unknown]
}

