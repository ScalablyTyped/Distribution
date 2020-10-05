package typings.rxjs.mod

import typings.rxjs.groupByMod.RefCountSubscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs", "GroupedObservable")
@js.native
class GroupedObservable[K, T] protected ()
  extends typings.rxjs.groupByMod.GroupedObservable[K, T] {
  /** @deprecated Do not construct this type. Internal use only */
  def this(key: K, groupSubject: typings.rxjs.subjectMod.Subject[T]) = this()
  def this(
    key: K,
    groupSubject: typings.rxjs.subjectMod.Subject[T],
    refCountSubscription: RefCountSubscription
  ) = this()
}

