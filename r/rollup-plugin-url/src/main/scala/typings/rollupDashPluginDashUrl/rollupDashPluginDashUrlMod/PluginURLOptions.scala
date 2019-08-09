package typings.rollupDashPluginDashUrl.rollupDashPluginDashUrlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginURLOptions extends js.Object {
  var destDist: js.UndefOr[String] = js.undefined
  var emitFile: js.UndefOr[Boolean] = js.undefined
  var exclude: js.UndefOr[js.Array[String]] = js.undefined
  var fileName: js.UndefOr[String] = js.undefined
  var include: js.UndefOr[js.Array[String]] = js.undefined
  var limit: js.UndefOr[Double] = js.undefined
  var publicPath: js.UndefOr[String] = js.undefined
  var sourceDir: js.UndefOr[String] = js.undefined
}

object PluginURLOptions {
  @scala.inline
  def apply(
    destDist: String = null,
    emitFile: js.UndefOr[Boolean] = js.undefined,
    exclude: js.Array[String] = null,
    fileName: String = null,
    include: js.Array[String] = null,
    limit: Int | Double = null,
    publicPath: String = null,
    sourceDir: String = null
  ): PluginURLOptions = {
    val __obj = js.Dynamic.literal()
    if (destDist != null) __obj.updateDynamic("destDist")(destDist)
    if (!js.isUndefined(emitFile)) __obj.updateDynamic("emitFile")(emitFile)
    if (exclude != null) __obj.updateDynamic("exclude")(exclude)
    if (fileName != null) __obj.updateDynamic("fileName")(fileName)
    if (include != null) __obj.updateDynamic("include")(include)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (publicPath != null) __obj.updateDynamic("publicPath")(publicPath)
    if (sourceDir != null) __obj.updateDynamic("sourceDir")(sourceDir)
    __obj.asInstanceOf[PluginURLOptions]
  }
}

