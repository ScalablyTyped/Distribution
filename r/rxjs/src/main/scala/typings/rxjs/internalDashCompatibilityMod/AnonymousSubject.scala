package typings.rxjs.internalDashCompatibilityMod

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.internalTypesMod.Observer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal-compatibility", "AnonymousSubject")
@js.native
class AnonymousSubject[T] ()
  extends typings.rxjs.internalSubjectMod.AnonymousSubject[T] {
  def this(destination: Observer[T]) = this()
  def this(destination: Observer[T], source: Observable[T]) = this()
}

