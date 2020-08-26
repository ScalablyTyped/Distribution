package typings.reactMdStates.utilsMod

import typings.reactMdStates.reactMdStatesStrings.currentTarget
import typings.reactMdStates.reactMdStatesStrings.target
import typings.reactMdStates.typesMod.RippleEvent
import typings.std.HTMLElement
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@react-md/states/types/ripples/utils", "isBubbled")
@js.native
object isBubbled extends js.Object {
  def apply[E /* <: HTMLElement */](event: Pick[RippleEvent[E], currentTarget | target]): Boolean = js.native
}

