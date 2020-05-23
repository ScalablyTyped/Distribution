package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeferredPermissionRequest extends js.Object {
  val id: Double
  val `type`: MSWebViewPermissionType
  val uri: java.lang.String
  def allow(): Unit
  def deny(): Unit
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
}

