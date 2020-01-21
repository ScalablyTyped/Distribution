package typings.rsocketCore.rsocketleaseMod

import typings.rsocketFlowable.mod.Flowable
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsocket-core/RSocketLease", "ResponderLeaseHandler")
@js.native
class ResponderLeaseHandler protected () extends LeaseHandler {
  def this(leaseSender: js.Function1[/* leaseStats */ js.UndefOr[LeaseStats], Flowable[Lease]]) = this()
  def this(
    leaseSender: js.Function1[/* leaseStats */ js.UndefOr[LeaseStats], Flowable[Lease]],
    stats: LeaseStats
  ) = this()
  def this(
    leaseSender: js.Function1[/* leaseStats */ js.UndefOr[LeaseStats], Flowable[Lease]],
    stats: LeaseStats,
    errorConsumer: js.Function1[/* e */ Error, Unit]
  ) = this()
  /* CompleteClass */
  override def errorMessage(): String = js.native
  def send(send: js.Function1[/* lease */ Lease, Unit]): Disposable = js.native
  /* CompleteClass */
  override def use(): Boolean = js.native
}

