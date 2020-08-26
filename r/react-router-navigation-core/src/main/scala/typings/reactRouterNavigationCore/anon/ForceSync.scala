package typings.reactRouterNavigationCore.anon

import typings.reactRouterNavigationCore.reactRouterNavigationCoreBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ForceSync extends js.Object {
  var forceSync: `false` = js.native
}

object ForceSync {
  @scala.inline
  def apply(forceSync: `false`): ForceSync = {
    val __obj = js.Dynamic.literal(forceSync = forceSync.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForceSync]
  }
  @scala.inline
  implicit class ForceSyncOps[Self <: ForceSync] (val x: Self) extends AnyVal {
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
    def setForceSync(value: `false`): Self = this.set("forceSync", value.asInstanceOf[js.Any])
  }
  
}

