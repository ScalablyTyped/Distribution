package typings.rxjs.internalObservableRaceMod

import typings.rxjs.internalOperatorMod.Operator
import typings.rxjs.internalSubscriberMod.Subscriber
import typings.rxjs.internalTypesMod.TeardownLogic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/observable/race", "RaceOperator")
@js.native
class RaceOperator[T] () extends Operator[T, T] {
  /* CompleteClass */
  override def call(subscriber: Subscriber[T], source: js.Any): TeardownLogic = js.native
}

