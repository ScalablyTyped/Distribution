package typings
package rxjsLib.internalObservableZipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/observable/zip", "ZipOperator")
@js.native
class ZipOperator[T, R] ()
  extends rxjsLib.internalOperatorMod.Operator[T, R] {
  def this(resultSelector: js.Function1[/* repeated */js.Any, R]) = this()
  /* CompleteClass */
  override def call(subscriber: rxjsLib.internalSubscriberMod.Subscriber[R], source: js.Any): rxjsLib.internalTypesMod.TeardownLogic = js.native
  def resultSelector(values: js.Any*): R = js.native
}

