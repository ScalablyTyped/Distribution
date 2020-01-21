package typings.rxCoreBinding.Rx

import org.scalablytyped.runtime.Instantiable0
import typings.rxCore.Rx.Observer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubjectStatic
  extends Instantiable0[Subject[js.Object]] {
  def create[T](): ISubject[T] = js.native
  def create[T](observer: Observer[T]): ISubject[T] = js.native
  def create[T](observer: Observer[T], observable: Observable[T]): ISubject[T] = js.native
}

