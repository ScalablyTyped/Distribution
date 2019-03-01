package typings
package reactDashModalLib.reactDashModalMod.ReactModalNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Styles extends js.Object {
  var content: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var overlay: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
}

object Styles {
  @scala.inline
  def apply(
    content: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    overlay: org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Styles = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content)
    if (overlay != null) __obj.updateDynamic("overlay")(overlay)
    __obj.asInstanceOf[Styles]
  }
}

