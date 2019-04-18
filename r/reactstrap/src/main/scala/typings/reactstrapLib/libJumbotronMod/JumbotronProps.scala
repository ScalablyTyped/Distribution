package typings
package reactstrapLib.libJumbotronMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JumbotronProps
  extends reactLib.reactMod.HTMLAttributes[stdLib.HTMLElement]
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var cssModule: js.UndefOr[reactstrapLib.reactstrapMod.CSSModule] = js.undefined
  var fluid: js.UndefOr[scala.Boolean] = js.undefined
  var tag: js.UndefOr[reactLib.reactMod.ReactType[_]] = js.undefined
}

object JumbotronProps {
  @scala.inline
  def apply(
    HTMLAttributes: reactLib.reactMod.HTMLAttributes[stdLib.HTMLElement] = null,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    className: java.lang.String = null,
    cssModule: reactstrapLib.reactstrapMod.CSSModule = null,
    fluid: js.UndefOr[scala.Boolean] = js.undefined,
    tag: reactLib.reactMod.ReactType[_] = null
  ): JumbotronProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className)
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule)
    if (!js.isUndefined(fluid)) __obj.updateDynamic("fluid")(fluid)
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[JumbotronProps]
  }
}

