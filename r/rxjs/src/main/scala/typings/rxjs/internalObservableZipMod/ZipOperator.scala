package typings.rxjs.internalObservableZipMod

import typings.rxjs.internalOperatorMod.Operator
import typings.rxjs.internalSubscriberMod.Subscriber
import typings.rxjs.internalTypesMod.TeardownLogic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/observable/zip", "ZipOperator")
@js.native
class ZipOperator[T, R] () extends Operator[T, R] {
  def this(resultSelector: js.Function1[/* repeated */ js.Any, R]) = this()
  /* CompleteClass */
  override def call(subscriber: Subscriber[R], source: js.Any): TeardownLogic = js.native
  def resultSelector(values: js.Any*): R = js.native
}

