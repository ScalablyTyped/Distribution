package typings.request

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Body extends js.Object {
  var body: String
  var `content-type`: js.UndefOr[String] = js.undefined
}

object Anon_Body {
  @scala.inline
  def apply(body: String, `content-type`: String = null): Anon_Body = {
    val __obj = js.Dynamic.literal(body = body)
    if (`content-type` != null) __obj.updateDynamic("content-type")(`content-type`)
    __obj.asInstanceOf[Anon_Body]
  }
}

