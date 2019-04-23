package typings
package rxjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/observable/partition", JSImport.Namespace)
@js.native
object internalObservablePartitionMod extends js.Object {
  def partition[T](
    source: rxjsLib.internalTypesMod.ObservableInput[T],
    predicate: js.Function2[/* value */ T, /* index */ scala.Double, scala.Boolean]
  ): js.Tuple2[
    rxjsLib.internalObservableMod.Observable[T], 
    rxjsLib.internalObservableMod.Observable[T]
  ] = js.native
  def partition[T](
    source: rxjsLib.internalTypesMod.ObservableInput[T],
    predicate: js.Function2[/* value */ T, /* index */ scala.Double, scala.Boolean],
    thisArg: js.Any
  ): js.Tuple2[
    rxjsLib.internalObservableMod.Observable[T], 
    rxjsLib.internalObservableMod.Observable[T]
  ] = js.native
}

