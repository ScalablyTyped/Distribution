package typings.rxjs.internalSubjectMod

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.internalTypesMod.Observer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/Subject", "AnonymousSubject")
@js.native
class AnonymousSubject[T] () extends Subject[T] {
  def this(destination: Observer[T]) = this()
  def this(destination: Observer[T], source: Observable[T]) = this()
  var destination: js.UndefOr[Observer[T]] = js.native
}

