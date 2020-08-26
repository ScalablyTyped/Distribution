package typings.reactNavigationDrawer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lazy extends js.Object {
  var `lazy`: Boolean = js.native
}

object Lazy {
  @scala.inline
  def apply(`lazy`: Boolean): Lazy = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("lazy")(`lazy`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lazy]
  }
  @scala.inline
  implicit class LazyOps[Self <: Lazy] (val x: Self) extends AnyVal {
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
    def setLazy(value: Boolean): Self = this.set("lazy", value.asInstanceOf[js.Any])
  }
  
}

