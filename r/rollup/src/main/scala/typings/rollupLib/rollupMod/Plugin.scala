package typings
package rollupLib.rollupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof rollup.rollup.PluginHooks ]:? rollup.rollup.PluginHooks[P]} */ trait Plugin extends js.Object {
  var banner: js.UndefOr[AddonHook] = js.undefined
  var cacheKey: js.UndefOr[java.lang.String] = js.undefined
  var footer: js.UndefOr[AddonHook] = js.undefined
  var intro: js.UndefOr[AddonHook] = js.undefined
  var name: java.lang.String
  var outro: js.UndefOr[AddonHook] = js.undefined
}

object Plugin {
  @scala.inline
  def apply(
    name: java.lang.String,
    banner: AddonHook = null,
    cacheKey: java.lang.String = null,
    footer: AddonHook = null,
    intro: AddonHook = null,
    outro: AddonHook = null
  ): Plugin = {
    val __obj = js.Dynamic.literal(name = name)
    if (banner != null) __obj.updateDynamic("banner")(banner.asInstanceOf[js.Any])
    if (cacheKey != null) __obj.updateDynamic("cacheKey")(cacheKey)
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (intro != null) __obj.updateDynamic("intro")(intro.asInstanceOf[js.Any])
    if (outro != null) __obj.updateDynamic("outro")(outro.asInstanceOf[js.Any])
    __obj.asInstanceOf[Plugin]
  }
}

