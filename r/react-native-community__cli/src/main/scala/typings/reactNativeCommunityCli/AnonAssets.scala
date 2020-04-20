package typings.reactNativeCommunityCli

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAssets extends js.Object {
  var assets: js.Array[String]
  var hooks: Record[String, String]
  var name: String
  var params: js.Array[_]
  var platforms: AnonDictkey
  var root: String
}

object AnonAssets {
  @scala.inline
  def apply(
    assets: js.Array[String],
    hooks: Record[String, String],
    name: String,
    params: js.Array[_],
    platforms: AnonDictkey,
    root: String
  ): AnonAssets = {
    val __obj = js.Dynamic.literal(assets = assets.asInstanceOf[js.Any], hooks = hooks.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], platforms = platforms.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAssets]
  }
}

