package typings.serverless.serverlessMod

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
    val __obj = js.Dynamic.literal()
    if (extraServicePath != null) __obj.updateDynamic("extraServicePath")(extraServicePath)
    if (function != null) __obj.updateDynamic("function")(function)
    if (!js.isUndefined(noDeploy)) __obj.updateDynamic("noDeploy")(noDeploy)
    if (region != null) __obj.updateDynamic("region")(region)
    if (stage != null) __obj.updateDynamic("stage")(stage)
    if (!js.isUndefined(watch)) __obj.updateDynamic("watch")(watch)
    __obj.asInstanceOf[Options]
  }
}

