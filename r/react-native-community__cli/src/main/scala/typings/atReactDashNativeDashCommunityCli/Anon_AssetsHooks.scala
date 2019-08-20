package typings.atReactDashNativeDashCommunityCli

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AssetsHooks extends js.Object {
  var assets: js.Array[String]
  var hooks: Record[String, String]
  var name: String
  var params: js.Array[_]
  var platforms: Anon_Android
  var root: String
}

object Anon_AssetsHooks {
  @scala.inline
  def apply(
    assets: js.Array[String],
    hooks: Record[String, String],
    name: String,
    params: js.Array[_],
    platforms: Anon_Android,
    root: String
  ): Anon_AssetsHooks = {
    val __obj = js.Dynamic.literal(assets = assets, hooks = hooks, name = name, params = params, platforms = platforms, root = root)
  
    __obj.asInstanceOf[Anon_AssetsHooks]
  }
}

