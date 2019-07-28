package typings.rxjsDashCompat.rxjsDashCompatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat", "ConnectableObservable")
@js.native
class ConnectableObservable[T] protected ()
  extends typings.rxjs.rxjsMod.ConnectableObservable[T] {
  def this(
    source: typings.rxjs.internalObservableMod.Observable[T],
    subjectFactory: js.Function0[typings.rxjs.internalSubjectMod.Subject[T]]
  ) = this()
}

