package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Method extends js.Object {
  var method: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var statusCode: js.UndefOr[String] = js.undefined
  var `type`: String
}

object Anon_Method {
  @scala.inline
  def apply(
    `type`: String,
    method: String = null,
    name: String = null,
    path: String = null,
    statusCode: String = null
  ): Anon_Method = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (method != null) __obj.updateDynamic("method")(method)
    if (name != null) __obj.updateDynamic("name")(name)
    if (path != null) __obj.updateDynamic("path")(path)
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode)
    __obj.asInstanceOf[Anon_Method]
  }
}

