package typings.reduxStateSync.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stamp extends js.Object {
  @JSName("$isSync")
  var $isSync: Boolean = js.native
  @JSName("$uuid")
  var $uuid: String = js.native
  @JSName("$wuid")
  var $wuid: String = js.native
}

object Stamp {
  @scala.inline
  def apply($isSync: Boolean, $uuid: String, $wuid: String): Stamp = {
    val __obj = js.Dynamic.literal($isSync = $isSync.asInstanceOf[js.Any], $uuid = $uuid.asInstanceOf[js.Any], $wuid = $wuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stamp]
  }
  @scala.inline
  implicit class StampOps[Self <: Stamp] (val x: Self) extends AnyVal {
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
    def set$isSync(value: Boolean): Self = this.set("$isSync", value.asInstanceOf[js.Any])
    @scala.inline
    def set$uuid(value: String): Self = this.set("$uuid", value.asInstanceOf[js.Any])
    @scala.inline
    def set$wuid(value: String): Self = this.set("$wuid", value.asInstanceOf[js.Any])
  }
  
}

