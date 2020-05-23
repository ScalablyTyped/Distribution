package typings.reactReconciler.mod

import typings.std.Map
import typings.std.Set
import typings.std.WeakMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseFiberRootProperties extends js.Object {
  // Any additional information from the host associated with this root.
  var containerInfo: js.Any
  // Top context object, used by renderSubtreeIntoContainer
  var context: js.Object | Null
  // The currently active root fiber. This is the mutable root of the tree.
  var current: Fiber
  // If an error is thrown, and there are no more updates in the queue, we try
  // rendering from the root one more time, synchronously, before handling
  // the error.
  var didError: Boolean
  // The earliest and latest priority levels that are not known to be suspended.
  var earliestPendingTime: ExpirationTime
  // The following priority levels are used to distinguish between 1)
  // uncommitted work, 2) uncommitted work that is suspended, and 3) uncommitted
  // work that may be unsuspended. We choose not to track each individual
  // pending level, trading granularity for performance.
  //
  // The earliest and latest priority levels that are suspended from committing.
  var earliestSuspendedTime: ExpirationTime
  var expirationTime: ExpirationTime
  // A finished work-in-progress HostRoot that's ready to be committed.
  var finishedWork: Fiber | Null
  // List of top-level batches. This list indicates whether a commit should be
  // deferred. Also contains completion callbacks.
  // TODO: Lift this into the renderer
  var firstBatch: Batch | Null
  // Determines if we should attempt to hydrate on the initial mount
  val hydrate: Boolean
  var latestPendingTime: ExpirationTime
  // The latest priority level that was pinged by a resolved promise and can
  // be retried.
  var latestPingedTime: ExpirationTime
  var latestSuspendedTime: ExpirationTime
  // Remaining expiration time on this root.
  // TODO: Lift this into the renderer
  var nextExpirationTimeToWorkOn: ExpirationTime
  // Linked-list of roots
  var nextScheduledRoot: FiberRoot | Null
  // Used only by persistent updates.
  var pendingChildren: js.Any
  var pendingCommitExpirationTime: ExpirationTime
  var pendingContext: js.Object | Null
  var pingCache: (WeakMap[Thenable, Set[ExpirationTime]]) | (Map[Thenable, Set[ExpirationTime]]) | Null
  // Timeout handle returned by setTimeout. Used to cancel a pending timeout, if
  // it's superseded by a new one.
  var timeoutHandle: js.Any
}

object BaseFiberRootProperties {
  @scala.inline
  def apply(
    containerInfo: js.Any,
    current: Fiber,
    didError: Boolean,
    earliestPendingTime: ExpirationTime,
    earliestSuspendedTime: ExpirationTime,
    expirationTime: ExpirationTime,
    hydrate: Boolean,
    latestPendingTime: ExpirationTime,
    latestPingedTime: ExpirationTime,
    latestSuspendedTime: ExpirationTime,
    nextExpirationTimeToWorkOn: ExpirationTime,
    pendingChildren: js.Any,
    pendingCommitExpirationTime: ExpirationTime,
    timeoutHandle: js.Any,
    context: js.Object = null,
    finishedWork: Fiber = null,
    firstBatch: Batch = null,
    nextScheduledRoot: FiberRoot = null,
    pendingContext: js.Object = null,
    pingCache: (WeakMap[Thenable, Set[ExpirationTime]]) | (Map[Thenable, Set[ExpirationTime]]) = null
  ): BaseFiberRootProperties = {
    val __obj = js.Dynamic.literal(containerInfo = containerInfo.asInstanceOf[js.Any], current = current.asInstanceOf[js.Any], didError = didError.asInstanceOf[js.Any], earliestPendingTime = earliestPendingTime.asInstanceOf[js.Any], earliestSuspendedTime = earliestSuspendedTime.asInstanceOf[js.Any], expirationTime = expirationTime.asInstanceOf[js.Any], hydrate = hydrate.asInstanceOf[js.Any], latestPendingTime = latestPendingTime.asInstanceOf[js.Any], latestPingedTime = latestPingedTime.asInstanceOf[js.Any], latestSuspendedTime = latestSuspendedTime.asInstanceOf[js.Any], nextExpirationTimeToWorkOn = nextExpirationTimeToWorkOn.asInstanceOf[js.Any], pendingChildren = pendingChildren.asInstanceOf[js.Any], pendingCommitExpirationTime = pendingCommitExpirationTime.asInstanceOf[js.Any], timeoutHandle = timeoutHandle.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], finishedWork = finishedWork.asInstanceOf[js.Any], firstBatch = firstBatch.asInstanceOf[js.Any], nextScheduledRoot = nextScheduledRoot.asInstanceOf[js.Any], pendingContext = pendingContext.asInstanceOf[js.Any], pingCache = pingCache.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseFiberRootProperties]
  }
}

