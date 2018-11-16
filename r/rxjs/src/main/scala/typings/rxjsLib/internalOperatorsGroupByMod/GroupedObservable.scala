package typings
package rxjsLib.internalOperatorsGroupByMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/groupBy", "GroupedObservable")
@js.native
class GroupedObservable[K, T] protected ()
  extends rxjsLib.internalObservableMod.Observable[T] {
  /** @deprecated Do not construct this type. Internal use only */
  def this(key: K, groupSubject: rxjsLib.internalSubjectMod.Subject[T]) = this()
  /** @deprecated Do not construct this type. Internal use only */
  def this(key: K, groupSubject: rxjsLib.internalSubjectMod.Subject[T], refCountSubscription: RefCountSubscription) = this()
  var groupSubject: js.Any = js.native
  var key: K = js.native
  var refCountSubscription: js.UndefOr[js.Any] = js.native
}

