package typings.reactReconciler.mod

import typings.std.Map
import typings.std.Set
import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseFiberRootProperties extends StObject {
  
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
    timeoutHandle: js.Any
  ): BaseFiberRootProperties = {
    val __obj = js.Dynamic.literal(containerInfo = containerInfo.asInstanceOf[js.Any], current = current.asInstanceOf[js.Any], didError = didError.asInstanceOf[js.Any], earliestPendingTime = earliestPendingTime.asInstanceOf[js.Any], earliestSuspendedTime = earliestSuspendedTime.asInstanceOf[js.Any], expirationTime = expirationTime.asInstanceOf[js.Any], hydrate = hydrate.asInstanceOf[js.Any], latestPendingTime = latestPendingTime.asInstanceOf[js.Any], latestPingedTime = latestPingedTime.asInstanceOf[js.Any], latestSuspendedTime = latestSuspendedTime.asInstanceOf[js.Any], nextExpirationTimeToWorkOn = nextExpirationTimeToWorkOn.asInstanceOf[js.Any], pendingChildren = pendingChildren.asInstanceOf[js.Any], pendingCommitExpirationTime = pendingCommitExpirationTime.asInstanceOf[js.Any], timeoutHandle = timeoutHandle.asInstanceOf[js.Any], context = null, finishedWork = null, firstBatch = null, nextScheduledRoot = null, pendingContext = null, pingCache = null)
    __obj.asInstanceOf[BaseFiberRootProperties]
  }
  
  @scala.inline
  implicit class BaseFiberRootPropertiesMutableBuilder[Self <: BaseFiberRootProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainerInfo(value: js.Any): Self = StObject.set(x, "containerInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContext(value: js.Object): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextNull: Self = StObject.set(x, "context", null)
    
    @scala.inline
    def setCurrent(value: Fiber): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDidError(value: Boolean): Self = StObject.set(x, "didError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEarliestPendingTime(value: ExpirationTime): Self = StObject.set(x, "earliestPendingTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEarliestSuspendedTime(value: ExpirationTime): Self = StObject.set(x, "earliestSuspendedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationTime(value: ExpirationTime): Self = StObject.set(x, "expirationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinishedWork(value: Fiber): Self = StObject.set(x, "finishedWork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinishedWorkNull: Self = StObject.set(x, "finishedWork", null)
    
    @scala.inline
    def setFirstBatch(value: Batch): Self = StObject.set(x, "firstBatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstBatchNull: Self = StObject.set(x, "firstBatch", null)
    
    @scala.inline
    def setHydrate(value: Boolean): Self = StObject.set(x, "hydrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatestPendingTime(value: ExpirationTime): Self = StObject.set(x, "latestPendingTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatestPingedTime(value: ExpirationTime): Self = StObject.set(x, "latestPingedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatestSuspendedTime(value: ExpirationTime): Self = StObject.set(x, "latestSuspendedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextExpirationTimeToWorkOn(value: ExpirationTime): Self = StObject.set(x, "nextExpirationTimeToWorkOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextScheduledRoot(value: FiberRoot): Self = StObject.set(x, "nextScheduledRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextScheduledRootNull: Self = StObject.set(x, "nextScheduledRoot", null)
    
    @scala.inline
    def setPendingChildren(value: js.Any): Self = StObject.set(x, "pendingChildren", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingCommitExpirationTime(value: ExpirationTime): Self = StObject.set(x, "pendingCommitExpirationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingContext(value: js.Object): Self = StObject.set(x, "pendingContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingContextNull: Self = StObject.set(x, "pendingContext", null)
    
    @scala.inline
    def setPingCache(value: (WeakMap[Thenable, Set[ExpirationTime]]) | (Map[Thenable, Set[ExpirationTime]])): Self = StObject.set(x, "pingCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPingCacheNull: Self = StObject.set(x, "pingCache", null)
    
    @scala.inline
    def setTimeoutHandle(value: js.Any): Self = StObject.set(x, "timeoutHandle", value.asInstanceOf[js.Any])
  }
}
