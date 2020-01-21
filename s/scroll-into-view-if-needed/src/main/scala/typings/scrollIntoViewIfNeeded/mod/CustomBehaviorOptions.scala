package typings.scrollIntoViewIfNeeded.mod

import typings.scrollIntoViewIfNeeded.typesMod.CustomScrollAction
import typings.scrollIntoViewIfNeeded.typesMod.CustomScrollBehaviorCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomBehaviorOptions[T]
  extends typings.scrollIntoViewIfNeeded.typesMod.Options {
  @JSName("behavior")
  var behavior_Original: CustomScrollBehaviorCallback[T] = js.native
  def behavior(actions: js.Array[CustomScrollAction]): T = js.native
}

