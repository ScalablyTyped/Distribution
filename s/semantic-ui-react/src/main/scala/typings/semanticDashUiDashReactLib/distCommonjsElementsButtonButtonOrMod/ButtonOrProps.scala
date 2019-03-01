package typings
package semanticDashUiDashReactLib.distCommonjsElementsButtonButtonOrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonOrProps
  extends StrictButtonOrProps
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any]

object ButtonOrProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    as: js.Any = null,
    className: java.lang.String = null,
    text: scala.Double | java.lang.String = null
  ): ButtonOrProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (as != null) __obj.updateDynamic("as")(as)
    if (className != null) __obj.updateDynamic("className")(className)
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonOrProps]
  }
}

