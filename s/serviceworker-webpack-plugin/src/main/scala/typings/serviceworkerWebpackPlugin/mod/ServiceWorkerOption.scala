package typings.serviceworkerWebpackPlugin.mod

import typings.webpack.mod.Stats.ToJsonOutput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceWorkerOption extends js.Object {
  var assets: js.Array[String]
  var jsonStats: js.UndefOr[ToJsonOutput] = js.undefined
}

object ServiceWorkerOption {
  @scala.inline
  def apply(assets: js.Array[String], jsonStats: ToJsonOutput = null): ServiceWorkerOption = {
    val __obj = js.Dynamic.literal(assets = assets.asInstanceOf[js.Any])
    if (jsonStats != null) __obj.updateDynamic("jsonStats")(jsonStats.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceWorkerOption]
  }
}

