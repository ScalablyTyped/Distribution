package typings.rxjs.internalCompatibilityMod

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.typesMod.Observer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal-compatibility", "AnonymousSubject")
@js.native
class AnonymousSubject[T] ()
  extends typings.rxjs.subjectMod.AnonymousSubject[T] {
  def this(destination: Observer[T]) = this()
  def this(destination: js.UndefOr[scala.Nothing], source: Observable[T]) = this()
  def this(destination: Observer[T], source: Observable[T]) = this()
}

