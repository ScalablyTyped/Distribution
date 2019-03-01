package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Method extends js.Object {
  var method: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var statusCode: js.UndefOr[java.lang.String] = js.undefined
  var `type`: java.lang.String
}

object Anon_Method {
  @scala.inline
  def apply(
    `type`: java.lang.String,
    method: java.lang.String = null,
    name: java.lang.String = null,
    path: java.lang.String = null,
    statusCode: java.lang.String = null
  ): Anon_Method = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (method != null) __obj.updateDynamic("method")(method)
    if (name != null) __obj.updateDynamic("name")(name)
    if (path != null) __obj.updateDynamic("path")(path)
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode)
    __obj.asInstanceOf[Anon_Method]
  }
}

