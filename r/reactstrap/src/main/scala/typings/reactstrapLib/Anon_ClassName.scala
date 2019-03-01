package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClassName extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var color: js.UndefOr[java.lang.String] = js.undefined
  var cssModule: js.UndefOr[reactstrapLib.reactstrapMod.CSSModule] = js.undefined
  var tag: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[_]] = js.undefined
  var transition: js.UndefOr[reactstrapLib.libFadeMod.FadeProps[js.Object]] = js.undefined
}

object Anon_ClassName {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    color: java.lang.String = null,
    cssModule: reactstrapLib.reactstrapMod.CSSModule = null,
    tag: reactLib.reactMod.ReactNs.ReactType[_] = null,
    transition: reactstrapLib.libFadeMod.FadeProps[js.Object] = null
  ): Anon_ClassName = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (color != null) __obj.updateDynamic("color")(color)
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule)
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (transition != null) __obj.updateDynamic("transition")(transition)
    __obj.asInstanceOf[Anon_ClassName]
  }
}

