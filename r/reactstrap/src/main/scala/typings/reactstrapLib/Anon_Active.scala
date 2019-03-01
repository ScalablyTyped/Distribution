package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Active
  extends // if a is passed as a string
// this could be href
/* others */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var active: js.UndefOr[scala.Boolean] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var cssModule: js.UndefOr[reactstrapLib.reactstrapMod.CSSModule] = js.undefined
  var tag: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[_]] = js.undefined
}

object Anon_Active {
  @scala.inline
  def apply(
    StringDictionary: // if a is passed as a string
  // this could be href
  /* others */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    active: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    cssModule: reactstrapLib.reactstrapMod.CSSModule = null,
    tag: reactLib.reactMod.ReactNs.ReactType[_] = null
  ): Anon_Active = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (className != null) __obj.updateDynamic("className")(className)
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule)
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Active]
  }
}

