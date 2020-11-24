package typings.rsocketCore.rsocketleaseMod

import typings.rsocketFlowable.mod.Flowable
import typings.rsocketTypes.reactiveSocketTypesMod.LeaseFrame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rsocket-core/RSocketLease", "RequesterLeaseHandler")
@js.native
class RequesterLeaseHandler protected ()
  extends LeaseHandler
     with Disposable {
  def this(leaseReceiver: js.Function1[/* flowable */ Flowable[Lease], Unit]) = this()
  
  def availability(): Double = js.native
  
  def receive(frame: LeaseFrame): Unit = js.native
}
