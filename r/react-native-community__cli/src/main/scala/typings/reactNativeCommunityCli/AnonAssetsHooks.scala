package typings.reactNativeCommunityCli

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAssetsHooks extends js.Object {
  var assets: js.Array[String]
  var hooks: Record[String, String]
  var name: String
  var params: js.Array[_]
  var platforms: AnonAndroid
  var root: String
}

object AnonAssetsHooks {
  @scala.inline
  def apply(
    assets: js.Array[String],
    hooks: Record[String, String],
    name: String,
    params: js.Array[_],
    platforms: AnonAndroid,
    root: String
  ): AnonAssetsHooks = {
    val __obj = js.Dynamic.literal(assets = assets.asInstanceOf[js.Any], hooks = hooks.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], platforms = platforms.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAssetsHooks]
  }
}

