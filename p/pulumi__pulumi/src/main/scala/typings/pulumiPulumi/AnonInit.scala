package typings.pulumiPulumi

import typings.pulumiPulumi.outputMod.Inputs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInit extends js.Object {
  def init(): js.Promise[Inputs]
}

object AnonInit {
  @scala.inline
  def apply(init: () => js.Promise[Inputs]): AnonInit = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction0(init))
  
    __obj.asInstanceOf[AnonInit]
  }
}

