package typings.rsocketDashFlowable.rsocketDashFlowableMod

import typings.rsocketDashFlowable.singleMod.Source
import typings.rsocketDashFlowable.singleMod.default
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsocket-flowable", "Single")
@js.native
class Single[T] protected () extends default[T] {
  def this(source: Source[T]) = this()
}

/* static members */
@JSImport("rsocket-flowable", "Single")
@js.native
object Single extends js.Object {
  def error(error: Error): typings.rsocketDashFlowable.singleMod.Single[js.Object] = js.native
  def of[U](value: U): typings.rsocketDashFlowable.singleMod.Single[U] = js.native
}

