package typings.scrollIntoViewIfNeeded.mod

import typings.scrollIntoViewIfNeeded.typesMod.CustomScrollAction
import typings.scrollIntoViewIfNeeded.typesMod.CustomScrollBehaviorCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomBehaviorOptions[T]
  extends typings.scrollIntoViewIfNeeded.typesMod.Options {
  
  def behavior(actions: js.Array[CustomScrollAction]): T = js.native
  @JSName("behavior")
  var behavior_Original: CustomScrollBehaviorCallback[T] = js.native
}
