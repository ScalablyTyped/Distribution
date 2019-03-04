package typings
package serverlessLib.serverlessMod.ServerlessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Package extends js.Object {
  var artifact: js.UndefOr[java.lang.String] = js.undefined
  var exclude: js.Array[java.lang.String]
  var include: js.Array[java.lang.String]
  var individually: js.UndefOr[scala.Boolean] = js.undefined
}

object Package {
  @scala.inline
  def apply(
    exclude: js.Array[java.lang.String],
    include: js.Array[java.lang.String],
    artifact: java.lang.String = null,
    individually: js.UndefOr[scala.Boolean] = js.undefined
  ): Package = {
    val __obj = js.Dynamic.literal(exclude = exclude, include = include)
    if (artifact != null) __obj.updateDynamic("artifact")(artifact)
    if (!js.isUndefined(individually)) __obj.updateDynamic("individually")(individually)
    __obj.asInstanceOf[Package]
  }
}

