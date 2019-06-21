package typings
package rsocketDashFlowableLib.rsocketDashFlowableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsocket-flowable", "Single")
@js.native
class Single[T] protected ()
  extends rsocketDashFlowableLib.singleMod.default[T] {
  def this(source: rsocketDashFlowableLib.singleMod.Source[T]) = this()
}

/* static members */
@JSImport("rsocket-flowable", "Single")
@js.native
object Single extends js.Object {
  def error(error: stdLib.Error): rsocketDashFlowableLib.singleMod.Single[js.Object] = js.native
  def of[U](value: U): rsocketDashFlowableLib.singleMod.Single[U] = js.native
}

