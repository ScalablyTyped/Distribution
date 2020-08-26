package typings.rxWamp.mod

import typings.autobahn.mod.IError
import typings.autobahn.mod.ISubscription
import typings.rx.Rx.IObservable
import typings.rx.Rx.Observable
import typings.rx.Rx.Observer
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

