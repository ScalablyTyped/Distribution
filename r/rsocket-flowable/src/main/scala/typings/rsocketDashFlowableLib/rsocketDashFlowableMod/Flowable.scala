package typings
package rsocketDashFlowableLib.rsocketDashFlowableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsocket-flowable", "Flowable")
@js.native
class Flowable[T] protected ()
  extends rsocketDashFlowableLib.flowableMod.default[T] {
  def this(source: rsocketDashFlowableLib.flowableMod.Source[T]) = this()
  def this(source: rsocketDashFlowableLib.flowableMod.Source[T], max: scala.Double) = this()
}

/* static members */
@JSImport("rsocket-flowable", "Flowable")
@js.native
object Flowable extends js.Object {
  def error(error: stdLib.Error): rsocketDashFlowableLib.flowableMod.Flowable[js.Object] = js.native
  def just[U](values: U*): rsocketDashFlowableLib.flowableMod.Flowable[U] = js.native
  def never(): rsocketDashFlowableLib.flowableMod.Flowable[js.Object] = js.native
}

