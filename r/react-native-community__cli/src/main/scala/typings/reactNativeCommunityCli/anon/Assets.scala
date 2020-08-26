package typings.reactNativeCommunityCli.anon

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Assets extends js.Object {
  var assets: js.Array[String] = js.native
  var hooks: Record[String, String] = js.native
  var name: String = js.native
  var params: js.Array[_] = js.native
  var platforms: Dictkey = js.native
  var root: String = js.native
}

object Assets {
  @scala.inline
  def apply(
    assets: js.Array[String],
    hooks: Record[String, String],
    name: String,
    params: js.Array[_],
    platforms: Dictkey,
    root: String
  ): Assets = {
    val __obj = js.Dynamic.literal(assets = assets.asInstanceOf[js.Any], hooks = hooks.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], platforms = platforms.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[Assets]
  }
  @scala.inline
  implicit class AssetsOps[Self <: Assets] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAssetsVarargs(value: String*): Self = this.set("assets", js.Array(value :_*))
    @scala.inline
    def setAssets(value: js.Array[String]): Self = this.set("assets", value.asInstanceOf[js.Any])
    @scala.inline
    def setHooks(value: Record[String, String]): Self = this.set("hooks", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setParamsVarargs(value: js.Any*): Self = this.set("params", js.Array(value :_*))
    @scala.inline
    def setParams(value: js.Array[_]): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlatforms(value: Dictkey): Self = this.set("platforms", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
  }
  
}

