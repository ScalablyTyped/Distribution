package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Parameters extends js.Object {
  var parameters: js.UndefOr[js.Array[Anon_ParameterName]] = js.undefined
  var `type`: String
}

object Anon_Parameters {
  @scala.inline
  def apply(`type`: String, parameters: js.Array[Anon_ParameterName] = null): Anon_Parameters = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (parameters != null) __obj.updateDynamic("parameters")(parameters)
    __obj.asInstanceOf[Anon_Parameters]
  }
}

