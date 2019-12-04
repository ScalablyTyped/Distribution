package typings.rxDotWamp.rxDotWampMod

import typings.autobahn.autobahnMod.IError
import typings.autobahn.autobahnMod.ISubscription
import typings.rxDashCore.Rx.Observer
import typings.rxDashLite.Rx.IObservable
import typings.rxDashLiteDashAggregates.Rx.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPubSubSubject
  extends Observable[IWampEvent]
     with Observer[IWampEvent] {
  var errors: IObservable[IError] = js.native
  var observable: Observable[IWampEvent] = js.native
  var observer: Observer[IWampEvent] = js.native
  var opened: IObservable[ISubscription] = js.native
}

