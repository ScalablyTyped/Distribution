package typings.rxjs.rxMod

import typings.rxjs.typesMod.Observer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/Rx", "AnonymousSubject")
@js.native
class AnonymousSubject[T] ()
  extends typings.rxjs.subjectMod.AnonymousSubject[T] {
  def this(destination: Observer[T]) = this()
  def this(destination: Observer[T], source: typings.rxjs.internalObservableMod.Observable[T]) = this()
}

