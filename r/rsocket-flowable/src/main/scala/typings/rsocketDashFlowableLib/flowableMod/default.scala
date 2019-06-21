package typings
package rsocketDashFlowableLib.flowableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsocket-flowable/Flowable", JSImport.Default)
@js.native
class default[T] protected () extends Flowable[T] {
  def this(source: Source[T]) = this()
  def this(source: Source[T], max: scala.Double) = this()
}

/* static members */
@JSImport("rsocket-flowable/Flowable", JSImport.Default)
@js.native
object default extends js.Object {
  def error(error: stdLib.Error): rsocketDashFlowableLib.flowableMod.Flowable[js.Object] = js.native
  def just[U](values: U*): rsocketDashFlowableLib.flowableMod.Flowable[U] = js.native
  def never(): rsocketDashFlowableLib.flowableMod.Flowable[js.Object] = js.native
}

