package typings.request

import typings.request.requestMod.MultipartBody
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Body extends js.Object {
  var body: MultipartBody
  var `content-type`: js.UndefOr[String] = js.undefined
}

object Anon_Body {
  @scala.inline
  def apply(body: MultipartBody, `content-type`: String = null): Anon_Body = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    if (`content-type` != null) __obj.updateDynamic("content-type")(`content-type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Body]
  }
}

