package typings
package reactDashSelectLib.libSelectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait State[OptionType] extends js.Object {
  var ariaLiveContext: java.lang.String
  var ariaLiveSelection: java.lang.String
  var focusedOption: OptionType | scala.Null
  var focusedValue: OptionType | scala.Null
  var inputIsHidden: scala.Boolean
  var isComposing: scala.Boolean
  var isFocused: scala.Boolean
  var menuOptions: MenuOptions[OptionType]
  var selectValue: reactDashSelectLib.libTypesMod.OptionsType[OptionType]
}

