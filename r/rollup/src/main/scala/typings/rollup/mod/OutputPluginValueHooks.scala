package typings.rollup.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputPluginValueHooks extends js.Object {
  var banner: AddonHook = js.native
  var cacheKey: String = js.native
  var footer: AddonHook = js.native
  var intro: AddonHook = js.native
  var outro: AddonHook = js.native
}

object OutputPluginValueHooks {
  @scala.inline
  def apply(banner: AddonHook, cacheKey: String, footer: AddonHook, intro: AddonHook, outro: AddonHook): OutputPluginValueHooks = {
    val __obj = js.Dynamic.literal(banner = banner.asInstanceOf[js.Any], cacheKey = cacheKey.asInstanceOf[js.Any], footer = footer.asInstanceOf[js.Any], intro = intro.asInstanceOf[js.Any], outro = outro.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputPluginValueHooks]
  }
  @scala.inline
  implicit class OutputPluginValueHooksOps[Self <: OutputPluginValueHooks] (val x: Self) extends AnyVal {
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
    def setBanner(value: AddonHook): Self = this.set("banner", value.asInstanceOf[js.Any])
    @scala.inline
    def setCacheKey(value: String): Self = this.set("cacheKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setFooter(value: AddonHook): Self = this.set("footer", value.asInstanceOf[js.Any])
    @scala.inline
    def setIntro(value: AddonHook): Self = this.set("intro", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutro(value: AddonHook): Self = this.set("outro", value.asInstanceOf[js.Any])
  }
  
}

