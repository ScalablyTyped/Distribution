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
trait Type
  extends IAction
     with IHasTarget

object Type {
  @scala.inline
  def apply(): Type = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Type]
  }
}

