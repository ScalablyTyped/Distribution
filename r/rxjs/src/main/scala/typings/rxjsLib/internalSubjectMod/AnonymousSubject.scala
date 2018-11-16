package typings
package rxjsLib.internalSubjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/Subject", "AnonymousSubject")
@js.native
class AnonymousSubject[T] () extends Subject[T] {
  def this(destination: rxjsLib.internalTypesMod.Observer[T]) = this()
  def this(destination: rxjsLib.internalTypesMod.Observer[T], source: rxjsLib.internalObservableMod.Observable[T]) = this()
  var destination: js.UndefOr[rxjsLib.internalTypesMod.Observer[T]] = js.native
}

