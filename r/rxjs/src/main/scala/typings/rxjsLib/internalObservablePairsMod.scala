package typings
package rxjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/observable/pairs", JSImport.Namespace)
@js.native
object internalObservablePairsMod extends js.Object {
  def dispatch[T](`this`: rxjsLib.internalTypesMod.SchedulerAction[_], state: rxjsLib.Anon_Subscriber[T]): scala.Unit = js.native
  def pairs[T](obj: js.Object): rxjsLib.internalObservableMod.Observable[js.Tuple2[java.lang.String, T]] = js.native
  def pairs[T](obj: js.Object, scheduler: rxjsLib.internalTypesMod.SchedulerLike): rxjsLib.internalObservableMod.Observable[js.Tuple2[java.lang.String, T]] = js.native
}

