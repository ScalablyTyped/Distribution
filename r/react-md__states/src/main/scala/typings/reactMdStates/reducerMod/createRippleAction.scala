package typings.reactMdStates.reducerMod

import typings.reactMdStates.typesMod.RippleEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@react-md/states/types/ripples/reducer", "createRippleAction")
@js.native
object createRippleAction extends js.Object {
  def apply[E /* <: HTMLElement */](event: RippleEvent[E], disableSpacebarClick: Boolean): CreateAction[E] = js.native
}

