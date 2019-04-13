package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddonTypeAppend extends js.Object {
  var addonType: reactstrapLib.reactstrapLibStrings.prepend | reactstrapLib.reactstrapLibStrings.append
  var className: js.UndefOr[java.lang.String] = js.undefined
  var cssModule: js.UndefOr[reactstrapLib.reactstrapMod.CSSModule] = js.undefined
  var tag: js.UndefOr[reactLib.reactMod.ReactType[_]] = js.undefined
}

object Anon_AddonTypeAppend {
  @scala.inline
  def apply(
    addonType: reactstrapLib.reactstrapLibStrings.prepend | reactstrapLib.reactstrapLibStrings.append,
    className: java.lang.String = null,
    cssModule: reactstrapLib.reactstrapMod.CSSModule = null,
    tag: reactLib.reactMod.ReactType[_] = null
  ): Anon_AddonTypeAppend = {
    val __obj = js.Dynamic.literal(addonType = addonType.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule)
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AddonTypeAppend]
  }
}

