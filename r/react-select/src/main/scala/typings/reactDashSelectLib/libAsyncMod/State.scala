package typings
package reactDashSelectLib.libAsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait State[OptionType] extends js.Object {
  var defaultOptions: js.UndefOr[reactDashSelectLib.libTypesMod.OptionsType[OptionType]] = js.undefined
  var inputValue: java.lang.String
  var isLoading: scala.Boolean
  var loadedInputValue: js.UndefOr[java.lang.String] = js.undefined
  var loadedOptions: reactDashSelectLib.libTypesMod.OptionsType[OptionType]
  var passEmptyOptions: scala.Boolean
}

