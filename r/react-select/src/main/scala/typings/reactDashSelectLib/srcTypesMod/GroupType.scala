package typings
package reactDashSelectLib.srcTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupType[OptionType]
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var options: OptionsType[OptionType]
}

object GroupType {
  @scala.inline
  def apply[OptionType](
    options: OptionsType[OptionType],
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): GroupType[OptionType] = {
    val __obj = js.Dynamic.literal(options = options)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[GroupType[OptionType]]
  }
}

