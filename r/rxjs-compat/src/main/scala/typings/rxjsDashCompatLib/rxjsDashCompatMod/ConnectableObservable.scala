package typings
package rxjsDashCompatLib.rxjsDashCompatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat", "ConnectableObservable")
@js.native
class ConnectableObservable[T] protected ()
  extends rxjsLib.rxjsMod.ConnectableObservable[T] {
  def this(source: rxjsLib.internalObservableMod.Observable[T], subjectFactory: js.Function0[rxjsLib.internalSubjectMod.Subject[T]]) = this()
}

