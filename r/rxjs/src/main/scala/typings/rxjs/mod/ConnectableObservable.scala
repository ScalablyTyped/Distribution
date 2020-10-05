package typings.rxjs.mod

import typings.rxjs.internalObservableMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs", "ConnectableObservable")
@js.native
class ConnectableObservable[T] protected ()
  extends typings.rxjs.connectableObservableMod.ConnectableObservable[T] {
  def this(source: Observable[T], subjectFactory: js.Function0[typings.rxjs.subjectMod.Subject[T]]) = this()
}

