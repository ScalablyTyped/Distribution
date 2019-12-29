package typings.purifycssDashWebpack.purifycssDashWebpackMod

import typings.purifycssDashWebpack.Anon_Info
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PurifyOptions extends js.Object {
  var minimize: js.UndefOr[Boolean] = js.undefined
  var moduleExtensions: js.UndefOr[js.Array[String]] = js.undefined
  var paths: js.UndefOr[js.Object | js.Array[String]] = js.undefined
  var purifyOptions: js.UndefOr[Anon_Info] = js.undefined
  var styleExtensions: js.UndefOr[js.Array[String]] = js.undefined
  var verbose: js.UndefOr[Boolean] = js.undefined
}

object PurifyOptions {
  @scala.inline
  def apply(
    minimize: js.UndefOr[Boolean] = js.undefined,
    moduleExtensions: js.Array[String] = null,
    paths: js.Object | js.Array[String] = null,
    purifyOptions: Anon_Info = null,
    styleExtensions: js.Array[String] = null,
    verbose: js.UndefOr[Boolean] = js.undefined
  ): PurifyOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(minimize)) __obj.updateDynamic("minimize")(minimize.asInstanceOf[js.Any])
    if (moduleExtensions != null) __obj.updateDynamic("moduleExtensions")(moduleExtensions.asInstanceOf[js.Any])
    if (paths != null) __obj.updateDynamic("paths")(paths.asInstanceOf[js.Any])
    if (purifyOptions != null) __obj.updateDynamic("purifyOptions")(purifyOptions.asInstanceOf[js.Any])
    if (styleExtensions != null) __obj.updateDynamic("styleExtensions")(styleExtensions.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[PurifyOptions]
  }
}

