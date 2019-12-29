package typings.atPulumiPulumi

import typings.atPulumiPulumi.outputMod.Inputs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Init extends js.Object {
  def init(): js.Promise[Inputs]
}

object Anon_Init {
  @scala.inline
  def apply(init: () => js.Promise[Inputs]): Anon_Init = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction0(init))
  
    __obj.asInstanceOf[Anon_Init]
  }
}

