package typings.pulumiPulumi.anon

import typings.pulumiPulumi.outputMod.Inputs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Init extends js.Object {
  def init(): js.Promise[Inputs]
}

object Init {
  @scala.inline
  def apply(init: () => js.Promise[Inputs]): Init = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction0(init))
    __obj.asInstanceOf[Init]
  }
}

