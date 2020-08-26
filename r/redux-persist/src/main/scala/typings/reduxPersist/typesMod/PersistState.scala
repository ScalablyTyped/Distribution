package typings.reduxPersist.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PersistState extends js.Object {
  var rehydrated: Boolean = js.native
  var version: Double = js.native
}

object PersistState {
  @scala.inline
  def apply(rehydrated: Boolean, version: Double): PersistState = {
    val __obj = js.Dynamic.literal(rehydrated = rehydrated.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersistState]
  }
  @scala.inline
  implicit class PersistStateOps[Self <: PersistState] (val x: Self) extends AnyVal {
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
    def setRehydrated(value: Boolean): Self = this.set("rehydrated", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
  }
  
}

