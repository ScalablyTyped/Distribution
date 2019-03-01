package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClassNameColorCssModuleSize extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var color: js.UndefOr[java.lang.String] = js.undefined
  var cssModule: js.UndefOr[reactstrapLib.reactstrapMod.CSSModule] = js.undefined
  var size: js.UndefOr[js.Any] = js.undefined
  var tag: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[_]] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_ClassNameColorCssModuleSize {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    color: java.lang.String = null,
    cssModule: reactstrapLib.reactstrapMod.CSSModule = null,
    size: js.Any = null,
    tag: reactLib.reactMod.ReactNs.ReactType[_] = null,
    `type`: java.lang.String = null
  ): Anon_ClassNameColorCssModuleSize = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (color != null) __obj.updateDynamic("color")(color)
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule)
    if (size != null) __obj.updateDynamic("size")(size)
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_ClassNameColorCssModuleSize]
  }
}

