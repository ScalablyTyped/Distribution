package typings.rsocketDashCore.rSocketLeaseMod

import typings.rsocketDashFlowable.rsocketDashFlowableMod.Flowable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsocket-core/RSocketLease", "Leases")
@js.native
class Leases[T /* <: LeaseStats */] () extends js.Object {
  def receiver(receiver: js.Function1[/* flowable */ Flowable[Lease], Unit]): Leases[T] = js.native
  def sender(sender: js.Function1[/* t */ js.UndefOr[T], Flowable[Lease]]): Leases[T] = js.native
  def stats(stats: T): Leases[T] = js.native
}

