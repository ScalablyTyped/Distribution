package typings.rxjs.internalCompatibilityMod

import typings.rxjs.groupByMod.RefCountSubscription
import typings.rxjs.subjectMod.Subject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal-compatibility", "GroupedObservable")
@js.native
class GroupedObservable[K, T] protected ()
  extends typings.rxjs.groupByMod.GroupedObservable[K, T] {
  /** @deprecated Do not construct this type. Internal use only */
  def this(key: K, groupSubject: Subject[T]) = this()
  def this(key: K, groupSubject: Subject[T], refCountSubscription: RefCountSubscription) = this()
}

