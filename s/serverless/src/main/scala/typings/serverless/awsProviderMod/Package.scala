package typings.serverless.awsProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Package extends js.Object {
  var artifact: js.UndefOr[String] = js.undefined
  var exclude: js.UndefOr[js.Array[String]] = js.undefined
  var excludeDevDependencies: js.UndefOr[Boolean] = js.undefined
  var include: js.UndefOr[js.Array[String]] = js.undefined
  var individually: js.UndefOr[Boolean] = js.undefined
}

object Package {
  @scala.inline
  def apply(
    artifact: String = null,
    exclude: js.Array[String] = null,
    excludeDevDependencies: js.UndefOr[Boolean] = js.undefined,
    include: js.Array[String] = null,
    individually: js.UndefOr[Boolean] = js.undefined
  ): Package = {
    val __obj = js.Dynamic.literal()
    if (artifact != null) __obj.updateDynamic("artifact")(artifact.asInstanceOf[js.Any])
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (!js.isUndefined(excludeDevDependencies)) __obj.updateDynamic("excludeDevDependencies")(excludeDevDependencies.get.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (!js.isUndefined(individually)) __obj.updateDynamic("individually")(individually.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Package]
  }
}

