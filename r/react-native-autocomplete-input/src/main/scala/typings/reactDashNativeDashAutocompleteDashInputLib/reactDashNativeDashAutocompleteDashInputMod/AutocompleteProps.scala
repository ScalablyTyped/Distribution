package typings
package reactDashNativeDashAutocompleteDashInputLib.reactDashNativeDashAutocompleteDashInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AutocompleteProps[T]
  extends reactDashNativeLib.reactDashNativeMod.TextInputProps {
  /**
       * style
       * These styles will be applied to the container which surrounds the autocomplete component.
       */
  var containerStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  /**
       * array
       * An array with suggestion items to be rendered in renderItem(item). Any array with length > 0 will open the suggestion list and any array with length < 1 will hide the list.
       */
  var data: js.Array[T]
  /**
       * bool
       * Set to true to hide the suggestion list.
       */
  var hideResults: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * style
       * These styles will be applied to the container which surrounds the textInput component.
       */
  var inputContainerStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  /**
       * style
       * These styles will be applied to the container which surrounds the result list.
       */
  var listContainerStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  /**
       * style
       * These style will be applied to the result list.
       */
  var listStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  /**
       * function
       * onShowResult will be called when the autocomplete suggestions appear or disappear.
       */
  var onShowResult: js.UndefOr[js.Function1[/* showResults */ scala.Boolean, scala.Unit]] = js.undefined
  /**
       * function
       * renderSeparator will be called to render the list separators which will be displayed between the list elements in the result view below the text input.
       */
  var renderSeparator: js.UndefOr[
    js.Function3[
      /* sectionID */ java.lang.String | scala.Double, 
      /* rowID */ java.lang.String | scala.Double, 
      /* adjacentRowHighlighted */ js.UndefOr[scala.Boolean], 
      reactLib.reactMod.ReactNs.ReactElement[_]
    ]
  ] = js.undefined
  /**
       * function
       * render custom TextInput. All props passed to this function.
       */
  var renderTextInput: js.UndefOr[
    js.Function1[
      /* props */ reactDashNativeLib.reactDashNativeMod.TextInputProperties, 
      reactLib.reactMod.ReactNs.ReactNode
    ]
  ] = js.undefined
  /**
       * function
       * renderItem will be called to render the data objects which will be displayed in the result view below the text input.
       */
  def renderItem(item: T): reactLib.reactMod.ReactNs.ReactNode
}

