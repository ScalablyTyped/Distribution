package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeferredPermissionRequest extends js.Object {
  val id: Double = js.native
  val `type`: MSWebViewPermissionType = js.native
  val uri: java.lang.String = js.native
  def allow(): Unit = js.native
  def deny(): Unit = js.native
}

object DeferredPermissionRequest {
  @scala.inline
  def apply(
    allow: () => Unit,
    deny: () => Unit,
    id: Double,
    `type`: MSWebViewPermissionType,
    uri: java.lang.String
  ): DeferredPermissionRequest = {
    val __obj = js.Dynamic.literal(allow = js.Any.fromFunction0(allow), deny = js.Any.fromFunction0(deny), id = id.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeferredPermissionRequest]
  }
  @scala.inline
  implicit class DeferredPermissionRequestOps[Self <: DeferredPermissionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllow(value: () => Unit): Self = this.set("allow", js.Any.fromFunction0(value))
    @scala.inline
    def setDeny(value: () => Unit): Self = this.set("deny", js.Any.fromFunction0(value))
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: MSWebViewPermissionType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setUri(value: java.lang.String): Self = this.set("uri", value.asInstanceOf[js.Any])
  }
  
}

