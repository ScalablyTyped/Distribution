package typings.reactNavigationDrawer.drawerViewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait State extends js.Object {
  var drawerWidth: Double = js.native
  var loaded: js.Array[Double] = js.native
}

object State {
  @scala.inline
  def apply(drawerWidth: Double, loaded: js.Array[Double]): State = {
    val __obj = js.Dynamic.literal(drawerWidth = drawerWidth.asInstanceOf[js.Any], loaded = loaded.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
  @scala.inline
  implicit class StateOps[Self <: State] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDrawerWidth(value: Double): Self = this.set("drawerWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoadedVarargs(value: Double*): Self = this.set("loaded", js.Array(value :_*))
    @scala.inline
    def setLoaded(value: js.Array[Double]): Self = this.set("loaded", value.asInstanceOf[js.Any])
  }
  
}

