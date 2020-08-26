package typings.reactNativeCommunityCli.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hooks extends js.Object {
  var assets: js.Array[String] = js.native
  var hooks: typings.reactNativeCommunityCli.mod.Hooks = js.native
  var params: js.Array[_] = js.native
  var platforms: Android = js.native
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
  @scala.inline
  implicit class HooksOps[Self <: Hooks] (val x: Self) extends AnyVal {
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
    def setHooks(value: typings.reactNativeCommunityCli.mod.Hooks): Self = this.set("hooks", value.asInstanceOf[js.Any])
    @scala.inline
    def setParamsVarargs(value: js.Any*): Self = this.set("params", js.Array(value :_*))
    @scala.inline
    def setParams(value: js.Array[_]): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlatforms(value: Android): Self = this.set("platforms", value.asInstanceOf[js.Any])
  }
  
}

