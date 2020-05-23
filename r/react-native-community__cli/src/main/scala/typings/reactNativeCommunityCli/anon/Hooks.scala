package typings.reactNativeCommunityCli.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hooks extends js.Object {
  var assets: js.Array[String]
  var hooks: typings.reactNativeCommunityCli.mod.Hooks
  var params: js.Array[_]
  var platforms: Android
}

object Hooks {
  @scala.inline
  def apply(
    assets: js.Array[String],
    hooks: typings.reactNativeCommunityCli.mod.Hooks,
    params: js.Array[_],
    platforms: Android
  ): Hooks = {
    val __obj = js.Dynamic.literal(assets = assets.asInstanceOf[js.Any], hooks = hooks.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], platforms = platforms.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hooks]
  }
}

