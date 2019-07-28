package typings.rsocketDashFlowable.flowableMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsocket-flowable/Flowable", JSImport.Default)
@js.native
class default[T] protected () extends Flowable[T] {
  def this(source: Source[T]) = this()
  def this(source: Source[T], max: Double) = this()
}

/* static members */
@JSImport("rsocket-flowable/Flowable", JSImport.Default)
@js.native
object default extends js.Object {
  def error(error: Error): Flowable[js.Object] = js.native
  def just[U](values: U*): Flowable[U] = js.native
  def never(): Flowable[js.Object] = js.native
}

