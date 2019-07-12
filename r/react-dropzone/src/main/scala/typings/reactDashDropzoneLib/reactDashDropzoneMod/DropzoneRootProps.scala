package typings
package reactDashDropzoneLib.reactDashDropzoneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropzoneRootProps
  extends reactLib.reactMod.HTMLAttributes[stdLib.HTMLElement]
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var refKey: js.UndefOr[java.lang.String] = js.undefined
}

object DropzoneRootProps {
  @scala.inline
  def apply(
    HTMLAttributes: reactLib.reactMod.HTMLAttributes[stdLib.HTMLElement] = null,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    refKey: java.lang.String = null
  ): DropzoneRootProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (refKey != null) __obj.updateDynamic("refKey")(refKey)
    __obj.asInstanceOf[DropzoneRootProps]
  }
}

