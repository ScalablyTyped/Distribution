package typings.raygun.raygunBatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("raygun/build/raygun.batch", "prepareBatch")
@js.native
object prepareBatch extends js.Object {
  def apply(messageQueue: js.Array[MessageAndCallback]): PreparedBatch = js.native
}

