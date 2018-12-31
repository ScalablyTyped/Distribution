package typings
package rxjsLib.rxjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs", "GroupedObservable")
@js.native
class GroupedObservable[K, T] protected ()
  extends rxjsLib.internalOperatorsGroupByMod.GroupedObservable[K, T] {
  /** @deprecated Do not construct this type. Internal use only */
  def this(key: K, groupSubject: rxjsLib.internalSubjectMod.Subject[T]) = this()
  def this(key: K, groupSubject: rxjsLib.internalSubjectMod.Subject[T], refCountSubscription: rxjsLib.internalOperatorsGroupByMod.RefCountSubscription) = this()
}

