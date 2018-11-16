package typings
package reactDashSelectLib.libCreatableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CreatableProps[OptionType] extends js.Object {
  /* Allow options to be created while the `isLoading` prop is true. Useful to
       prevent the "create new ..." option being displayed while async results are
       still being loaded. */
  var allowCreateWhileLoading: js.UndefOr[scala.Boolean] = js.undefined
  /* Sets the position of the createOption element in your options list. Defaults to 'last' */
  var createOptionPosition: js.UndefOr[
    reactDashSelectLib.reactDashSelectLibStrings.first | reactDashSelectLib.reactDashSelectLibStrings.last
  ] = js.undefined
  /* Gets the label for the "create new ..." option in the menu. Is given the
       current input value. */
  var formatCreateLabel: js.UndefOr[
    js.Function1[/* inputValue */ java.lang.String, reactLib.reactMod.ReactNs.ReactNode]
  ] = js.undefined
  /* Returns the data for the new option when it is created. Used to display the
       value, and is passed to `onChange`. */
  var getNewOptionData: js.UndefOr[
    js.Function2[
      /* inputValue */ java.lang.String, 
      /* optionLabel */ reactLib.reactMod.ReactNs.ReactNode, 
      OptionType
    ]
  ] = js.undefined
  /* Determines whether the "create new ..." option should be displayed based on
       the current input value, select value and options array. */
  var isValidNewOption: js.UndefOr[
    js.Function3[
      /* inputValue */ java.lang.String, 
      /* value */ reactDashSelectLib.libTypesMod.ValueType[OptionType], 
      /* options */ reactDashSelectLib.libTypesMod.OptionsType[OptionType], 
      scala.Boolean
    ]
  ] = js.undefined
  /* If provided, this will be called with the input value when a new option is
       created, and `onChange` will **not** be called. Use this when you need more
       control over what happens when new options are created. */
  var onCreateOption: js.UndefOr[js.Function1[/* inputValue */ java.lang.String, scala.Unit]] = js.undefined
}

