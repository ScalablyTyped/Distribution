package typings.reactNavigationStack

import typings.reactNavigationStack.vendorTypesMod.Layout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonScreen extends js.Object {
  /**
    * Layout of the whole screen.
    */
  var screen: Layout
}

object AnonScreen {
  @scala.inline
  def apply(screen: Layout): AnonScreen = {
    val __obj = js.Dynamic.literal(screen = screen.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonScreen]
  }
}

