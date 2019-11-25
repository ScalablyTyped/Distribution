package typings.serverless.serverlessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Package extends js.Object {
  var artifact: js.UndefOr[String] = js.undefined
  var exclude: js.Array[String]
  var include: js.Array[String]
  var individually: js.UndefOr[Boolean] = js.undefined
}

object Package {
  @scala.inline
  def apply(
    exclude: js.Array[String],
    include: js.Array[String],
    artifact: String = null,
    individually: js.UndefOr[Boolean] = js.undefined
  ): Package = {
    val __obj = js.Dynamic.literal(exclude = exclude.asInstanceOf[js.Any], include = include.asInstanceOf[js.Any])
    if (artifact != null) __obj.updateDynamic("artifact")(artifact.asInstanceOf[js.Any])
    if (!js.isUndefined(individually)) __obj.updateDynamic("individually")(individually.asInstanceOf[js.Any])
    __obj.asInstanceOf[Package]
  }
}

