package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PermissionRequest extends DeferredPermissionRequest {
  val state: MSWebViewPermissionState = js.native
  def defer(): Unit = js.native
}

object PermissionRequest {
  @scala.inline
  def apply(
    allow: () => Unit,
    defer: () => Unit,
    deny: () => Unit,
    id: Double,
    state: MSWebViewPermissionState,
    `type`: MSWebViewPermissionType,
    uri: java.lang.String
  ): PermissionRequest = {
    val __obj = js.Dynamic.literal(allow = js.Any.fromFunction0(allow), defer = js.Any.fromFunction0(defer), deny = js.Any.fromFunction0(deny), id = id.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermissionRequest]
  }
  @scala.inline
  implicit class PermissionRequestOps[Self <: PermissionRequest] (val x: Self) extends AnyVal {
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
    def setDefer(value: () => Unit): Self = this.set("defer", js.Any.fromFunction0(value))
    @scala.inline
    def setState(value: MSWebViewPermissionState): Self = this.set("state", value.asInstanceOf[js.Any])
  }
  
}

