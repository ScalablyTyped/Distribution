package typings
package rxjsLib.internalObservableRaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/observable/race", "RaceOperator")
@js.native
class RaceOperator[T] ()
  extends rxjsLib.internalOperatorMod.Operator[T, T] {
  /* CompleteClass */
  override def call(subscriber: rxjsLib.internalSubscriberMod.Subscriber[T], source: js.Any): rxjsLib.internalTypesMod.TeardownLogic = js.native
}

