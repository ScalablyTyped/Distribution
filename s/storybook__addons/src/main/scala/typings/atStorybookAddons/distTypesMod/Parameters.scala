package typings.atStorybookAddons.distTypesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Parameters
  extends /* key */ StringDictionary[js.Any] {
  var fileName: js.UndefOr[String] = js.undefined
  var options: js.UndefOr[OptionsParameter] = js.undefined
}

object Parameters {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    fileName: String = null,
    options: OptionsParameter = null
  ): Parameters = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (fileName != null) __obj.updateDynamic("fileName")(fileName.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters]
  }
}

