package typings.rxjs.rxjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs", "ConnectableObservable")
@js.native
class ConnectableObservable[T] protected ()
  extends typings.rxjs.internalObservableConnectableObservableMod.ConnectableObservable[T] {
  def this(
    source: typings.rxjs.internalObservableMod.Observable[T],
    subjectFactory: js.Function0[typings.rxjs.internalSubjectMod.Subject[T]]
  ) = this()
}

