package typings.rxjs.rxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/internal/Rx", "ConnectableObservable")
@js.native
class ConnectableObservable[T] protected ()
  extends typings.rxjs.connectableObservableMod.ConnectableObservable[T] {
  def this(
    source: typings.rxjs.internalObservableMod.Observable[T],
    subjectFactory: js.Function0[typings.rxjs.subjectMod.Subject[T]]
  ) = this()
}
