package typings
package rsocketDashFlowableLib.singleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsocket-flowable/Single", JSImport.Default)
@js.native
class default[T] protected () extends Single[T] {
  def this(source: Source[T]) = this()
}

/* static members */
@JSImport("rsocket-flowable/Single", JSImport.Default)
@js.native
object default extends js.Object {
  def error(error: stdLib.Error): rsocketDashFlowableLib.singleMod.Single[js.Object] = js.native
  def of[U](value: U): rsocketDashFlowableLib.singleMod.Single[U] = js.native
}

