package typings.siesta.Siesta.Test.Action

import typings.siesta.Siesta.Test.Action.Role.IHasTarget
import typings.siesta.Siesta.Test.IAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  */
@js.native
trait DoubleTap
  extends IAction
     with IHasTarget

object DoubleTap {
  @scala.inline
  def apply(): DoubleTap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DoubleTap]
  }
}

