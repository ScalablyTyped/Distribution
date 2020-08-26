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
trait LongPress
  extends IAction
     with IHasTarget

object LongPress {
  @scala.inline
  def apply(): LongPress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LongPress]
  }
}

