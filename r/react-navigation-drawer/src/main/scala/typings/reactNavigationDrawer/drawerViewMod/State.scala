package typings.reactNavigationDrawer.drawerViewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var drawerWidth: Double
  var loaded: js.Array[Double]
}

object State {
  @scala.inline
  def apply(drawerWidth: Double, loaded: js.Array[Double]): State = {
    val __obj = js.Dynamic.literal(drawerWidth = drawerWidth.asInstanceOf[js.Any], loaded = loaded.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
}

