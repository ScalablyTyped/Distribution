package typings.reactNativeCommunityCli

import typings.reactNativeCommunityCli.mod.Hooks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAssetsHooksParams extends js.Object {
  var assets: js.Array[String]
  var hooks: Hooks
  var params: js.Array[_]
  var platforms: AnonAndroidIosKey
}

object AnonAssetsHooksParams {
  @scala.inline
  def apply(assets: js.Array[String], hooks: Hooks, params: js.Array[_], platforms: AnonAndroidIosKey): AnonAssetsHooksParams = {
    val __obj = js.Dynamic.literal(assets = assets.asInstanceOf[js.Any], hooks = hooks.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], platforms = platforms.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAssetsHooksParams]
  }
}

