package typings.reactNavigationStack.anon

import typings.reactNavigationStack.vendorTypesMod.Layout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Screen extends js.Object {
  /**
    * Layout of the whole screen.
    */
  var screen: Layout
}

object Screen {
  @scala.inline
  def apply(screen: Layout): Screen = {
    val __obj = js.Dynamic.literal(screen = screen.asInstanceOf[js.Any])
    __obj.asInstanceOf[Screen]
  }
}

