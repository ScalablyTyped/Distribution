package typings.scheduler.tracingMod

import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Subscriber extends js.Object {
  
  /**
    * All scheduled async work for an interaction has finished.
    */
  def onInteractionScheduledWorkCompleted(interaction: Interaction): Unit = js.native
  
  /**
    * A new interaction has been created via the trace() method.
    */
  def onInteractionTraced(interaction: Interaction): Unit = js.native
  
  /**
    * A batch of scheduled work has been canceled.
    * Work is done by a "thread" which is identified by a unique ID.
    */
  def onWorkCanceled(interactions: Set[Interaction], threadID: Double): Unit = js.native
  
  /**
    * New async work has been scheduled for a set of interactions.
    * When this work is later run, onWorkStarted/onWorkStopped will be called.
    * A batch of async/yieldy work may be scheduled multiple times before completing.
    * In that case, onWorkScheduled may be called more than once before onWorkStopped.
    * Work is scheduled by a "thread" which is identified by a unique ID.
    */
  def onWorkScheduled(interactions: Set[Interaction], threadID: Double): Unit = js.native
  
  /**
    * A batch of work has started for a set of interactions.
    * When this work is complete, onWorkStopped will be called.
    * Work is not always completed synchronously; yielding may occur in between.
    * A batch of async/yieldy work may also be re-started before completing.
    * In that case, onWorkStarted may be called more than once before onWorkStopped.
    * Work is done by a "thread" which is identified by a unique ID.
    */
  def onWorkStarted(interactions: Set[Interaction], threadID: Double): Unit = js.native
  
  /**
    * A batch of work has completed for a set of interactions.
    * Work is done by a "thread" which is identified by a unique ID.
    */
  def onWorkStopped(interactions: Set[Interaction], threadID: Double): Unit = js.native
}
object Subscriber {
  
  @scala.inline
  def apply(
    onInteractionScheduledWorkCompleted: Interaction => Unit,
    onInteractionTraced: Interaction => Unit,
    onWorkCanceled: (Set[Interaction], Double) => Unit,
    onWorkScheduled: (Set[Interaction], Double) => Unit,
    onWorkStarted: (Set[Interaction], Double) => Unit,
    onWorkStopped: (Set[Interaction], Double) => Unit
  ): Subscriber = {
    val __obj = js.Dynamic.literal(onInteractionScheduledWorkCompleted = js.Any.fromFunction1(onInteractionScheduledWorkCompleted), onInteractionTraced = js.Any.fromFunction1(onInteractionTraced), onWorkCanceled = js.Any.fromFunction2(onWorkCanceled), onWorkScheduled = js.Any.fromFunction2(onWorkScheduled), onWorkStarted = js.Any.fromFunction2(onWorkStarted), onWorkStopped = js.Any.fromFunction2(onWorkStopped))
    __obj.asInstanceOf[Subscriber]
  }
  
  @scala.inline
  implicit class SubscriberOps[Self <: Subscriber] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOnInteractionScheduledWorkCompleted(value: Interaction => Unit): Self = this.set("onInteractionScheduledWorkCompleted", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnInteractionTraced(value: Interaction => Unit): Self = this.set("onInteractionTraced", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnWorkCanceled(value: (Set[Interaction], Double) => Unit): Self = this.set("onWorkCanceled", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnWorkScheduled(value: (Set[Interaction], Double) => Unit): Self = this.set("onWorkScheduled", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnWorkStarted(value: (Set[Interaction], Double) => Unit): Self = this.set("onWorkStarted", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnWorkStopped(value: (Set[Interaction], Double) => Unit): Self = this.set("onWorkStopped", js.Any.fromFunction2(value))
  }
}
