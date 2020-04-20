package typings.rollup.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutputPluginValueHooks extends js.Object {
  var banner: AddonHook
  var cacheKey: String
  var footer: AddonHook
  var intro: AddonHook
  var outro: AddonHook
}

object OutputPluginValueHooks {
  @scala.inline
  def apply(banner: AddonHook, cacheKey: String, footer: AddonHook, intro: AddonHook, outro: AddonHook): OutputPluginValueHooks = {
    val __obj = js.Dynamic.literal(banner = banner.asInstanceOf[js.Any], cacheKey = cacheKey.asInstanceOf[js.Any], footer = footer.asInstanceOf[js.Any], intro = intro.asInstanceOf[js.Any], outro = outro.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputPluginValueHooks]
  }
}

