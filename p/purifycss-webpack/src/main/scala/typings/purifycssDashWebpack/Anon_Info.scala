package typings.purifycssDashWebpack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Info extends js.Object {
  var info: js.UndefOr[Boolean] = js.undefined
  var minify: js.UndefOr[Boolean] = js.undefined
  var output: js.UndefOr[String | Boolean] = js.undefined
  var rejected: js.UndefOr[Boolean] = js.undefined
  var whitelist: js.UndefOr[js.Array[String]] = js.undefined
}

object Anon_Info {
  @scala.inline
  def apply(
    info: js.UndefOr[Boolean] = js.undefined,
    minify: js.UndefOr[Boolean] = js.undefined,
    output: String | Boolean = null,
    rejected: js.UndefOr[Boolean] = js.undefined,
    whitelist: js.Array[String] = null
  ): Anon_Info = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(info)) __obj.updateDynamic("info")(info.asInstanceOf[js.Any])
    if (!js.isUndefined(minify)) __obj.updateDynamic("minify")(minify.asInstanceOf[js.Any])
    if (output != null) __obj.updateDynamic("output")(output.asInstanceOf[js.Any])
    if (!js.isUndefined(rejected)) __obj.updateDynamic("rejected")(rejected.asInstanceOf[js.Any])
    if (whitelist != null) __obj.updateDynamic("whitelist")(whitelist.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Info]
  }
}

