package typings.reactReconciler.mod

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FiberRoot
  extends StObject
     with BaseFiberRootProperties
     with ProfilingOnlyFiberRootProperties
object FiberRoot {
  
  inline def apply(
    containerInfo: js.Any,
    current: Fiber,
    didError: Boolean,
    earliestPendingTime: ExpirationTime,
    earliestSuspendedTime: ExpirationTime,
    expirationTime: ExpirationTime,
    hydrate: Boolean,
    interactionThreadID: Double,
    latestPendingTime: ExpirationTime,
    latestPingedTime: ExpirationTime,
    latestSuspendedTime: ExpirationTime,
    memoizedInteractions: Set[Interaction],
    nextExpirationTimeToWorkOn: ExpirationTime,
    pendingChildren: js.Any,
    pendingCommitExpirationTime: ExpirationTime,
    pendingInteractionMap: PendingInteractionMap,
    timeoutHandle: js.Any
  ): FiberRoot = {
    val __obj = js.Dynamic.literal(containerInfo = containerInfo.asInstanceOf[js.Any], current = current.asInstanceOf[js.Any], didError = didError.asInstanceOf[js.Any], earliestPendingTime = earliestPendingTime.asInstanceOf[js.Any], earliestSuspendedTime = earliestSuspendedTime.asInstanceOf[js.Any], expirationTime = expirationTime.asInstanceOf[js.Any], hydrate = hydrate.asInstanceOf[js.Any], interactionThreadID = interactionThreadID.asInstanceOf[js.Any], latestPendingTime = latestPendingTime.asInstanceOf[js.Any], latestPingedTime = latestPingedTime.asInstanceOf[js.Any], latestSuspendedTime = latestSuspendedTime.asInstanceOf[js.Any], memoizedInteractions = memoizedInteractions.asInstanceOf[js.Any], nextExpirationTimeToWorkOn = nextExpirationTimeToWorkOn.asInstanceOf[js.Any], pendingChildren = pendingChildren.asInstanceOf[js.Any], pendingCommitExpirationTime = pendingCommitExpirationTime.asInstanceOf[js.Any], pendingInteractionMap = pendingInteractionMap.asInstanceOf[js.Any], timeoutHandle = timeoutHandle.asInstanceOf[js.Any], context = null, finishedWork = null, firstBatch = null, nextScheduledRoot = null, pendingContext = null, pingCache = null)
    __obj.asInstanceOf[FiberRoot]
  }
}
