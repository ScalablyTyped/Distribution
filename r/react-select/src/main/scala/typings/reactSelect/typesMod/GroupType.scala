package typings.reactSelect.typesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupType[OptionType /* <: OptionTypeBase */]
  extends /* key */ StringDictionary[js.Any] {
  var options: OptionsType[OptionType]
}

object GroupType {
  @scala.inline
  def apply[OptionType](options: OptionsType[OptionType], StringDictionary: /* name */ StringDictionary[js.Any] = null): GroupType[OptionType] = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[GroupType[OptionType]]
  }
}

