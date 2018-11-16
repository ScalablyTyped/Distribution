package typings
package rxjsLib.rxjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs", "ConnectableObservable")
@js.native
class ConnectableObservable[T] protected ()
  extends rxjsLib.internalObservableConnectableObservableMod.ConnectableObservable[T] {
  def this(source: rxjsLib.internalObservableMod.Observable[T], subjectFactory: js.Function0[rxjsLib.internalSubjectMod.Subject[T]]) = this()
}

