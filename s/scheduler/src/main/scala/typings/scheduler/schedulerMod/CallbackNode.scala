package typings.scheduler.schedulerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CallbackNode extends js.Object {
  @JSName("callback")
  var callback_Original: FrameCallbackType = js.native
  var expirationTime: Double = js.native
  var next: CallbackNode | Null = js.native
  var prev: CallbackNode | Null = js.native
  var priorityLevel: Double = js.native
  def callback(): (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias scheduler.scheduler.FrameCallbackType */ js.Object) | Unit = js.native
}

