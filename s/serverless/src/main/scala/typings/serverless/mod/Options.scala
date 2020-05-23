package typings.serverless.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var extraServicePath: js.UndefOr[String] = js.undefined
  var function: js.UndefOr[String] = js.undefined
  var noDeploy: js.UndefOr[Boolean] = js.undefined
  var region: String | Null
  var stage: String | Null
  var watch: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    extraServicePath: String = null,
    function: String = null,
    noDeploy: js.UndefOr[Boolean] = js.undefined,
    region: String = null,
    stage: String = null,
    watch: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal(region = region.asInstanceOf[js.Any], stage = stage.asInstanceOf[js.Any])
    if (extraServicePath != null) __obj.updateDynamic("extraServicePath")(extraServicePath.asInstanceOf[js.Any])
    if (function != null) __obj.updateDynamic("function")(function.asInstanceOf[js.Any])
    if (!js.isUndefined(noDeploy)) __obj.updateDynamic("noDeploy")(noDeploy.get.asInstanceOf[js.Any])
    if (!js.isUndefined(watch)) __obj.updateDynamic("watch")(watch.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

