package typings
package serverlessLib.serverlessMod.ServerlessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var extraServicePath: js.UndefOr[java.lang.String] = js.undefined
  var function: js.UndefOr[java.lang.String] = js.undefined
  var noDeploy: js.UndefOr[scala.Boolean] = js.undefined
  var region: java.lang.String | scala.Null
  var stage: java.lang.String | scala.Null
  var watch: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    extraServicePath: java.lang.String = null,
    function: java.lang.String = null,
    noDeploy: js.UndefOr[scala.Boolean] = js.undefined,
    region: java.lang.String = null,
    stage: java.lang.String = null,
    watch: js.UndefOr[scala.Boolean] = js.undefined
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

