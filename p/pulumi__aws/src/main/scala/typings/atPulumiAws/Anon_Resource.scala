package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Resource extends js.Object {
  var resource: js.UndefOr[String] = js.undefined
  var `type`: String
}

object Anon_Resource {
  @scala.inline
  def apply(`type`: String, resource: String = null): Anon_Resource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (resource != null) __obj.updateDynamic("resource")(resource)
    __obj.asInstanceOf[Anon_Resource]
  }
}

