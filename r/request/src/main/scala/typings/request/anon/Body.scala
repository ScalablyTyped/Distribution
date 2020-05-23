package typings.request.anon

import typings.request.mod.MultipartBody
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Body extends js.Object {
  var body: MultipartBody
  var `content-type`: js.UndefOr[String] = js.undefined
}

object Body {
  @scala.inline
  def apply(body: MultipartBody, `content-type`: String = null): Body = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    if (`content-type` != null) __obj.updateDynamic("content-type")(`content-type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Body]
  }
}

