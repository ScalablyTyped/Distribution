package typings.rsocketCore.rsocketleaseMod

import typings.rsocketFlowable.mod.Flowable
import typings.rsocketTypes.reactiveSocketTypesMod.LeaseFrame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsocket-core/RSocketLease", "RequesterLeaseHandler")
@js.native
class RequesterLeaseHandler protected ()
  extends LeaseHandler
     with Disposable {
  def this(leaseReceiver: js.Function1[/* flowable */ Flowable[Lease], Unit]) = this()
  def availability(): Double = js.native
  /* CompleteClass */
  override def dispose(): Unit = js.native
  /* CompleteClass */
  override def errorMessage(): String = js.native
  /* CompleteClass */
  override def isDisposed(): Boolean = js.native
  def receive(frame: LeaseFrame): Unit = js.native
  /* CompleteClass */
  override def use(): Boolean = js.native
}

