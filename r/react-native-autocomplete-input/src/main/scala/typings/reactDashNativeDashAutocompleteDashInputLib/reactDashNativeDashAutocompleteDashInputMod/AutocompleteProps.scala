package typings
package reactDashNativeDashAutocompleteDashInputLib.reactDashNativeDashAutocompleteDashInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ trait AutocompleteProps[T] extends js.Object {
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
    * onStartShouldSetResponderCapture will be passed to the result list view container (onStartShouldSetResponderCapture).
    */
  var onStartShouldSetResponderCapture: js.UndefOr[
    js.Function1[
      /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent, 
      scala.Boolean
    ]
  ] = js.undefined
  /**
    * function
    * renderSeparator will be called to render the list separators which will be displayed between the list elements in the result view below the text input.
    */
  var renderSeparator: js.UndefOr[js.Any] = js.undefined
  /**
    * function
    * render custom TextInput. All props passed to this function.
    */
  var renderTextInput: js.UndefOr[
    js.Function1[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TextInputProperties */ /* props */ js.Any, 
      reactLib.reactMod.ReactNs.ReactNode
    ]
  ] = js.undefined
  /**
    * function
    * renderItem will be called to render the data objects which will be displayed in the result view below the text input.
    */
  def renderItem(item: T): reactLib.reactMod.ReactNs.ReactNode
}

object AutocompleteProps {
  @scala.inline
  def apply[T](
    data: js.Array[T],
    renderItem: js.Function1[T, reactLib.reactMod.ReactNs.ReactNode],
    containerStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    hideResults: js.UndefOr[scala.Boolean] = js.undefined,
    inputContainerStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    listContainerStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    listStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    onShowResult: js.Function1[/* showResults */ scala.Boolean, scala.Unit] = null,
    onStartShouldSetResponderCapture: js.Function1[
      /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent, 
      scala.Boolean
    ] = null,
    renderSeparator: js.Any = null,
    renderTextInput: js.Function1[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TextInputProperties */ /* props */ js.Any, 
      reactLib.reactMod.ReactNs.ReactNode
    ] = null
  ): AutocompleteProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("renderItem")(renderItem)
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(hideResults)) __obj.updateDynamic("hideResults")(hideResults)
    if (inputContainerStyle != null) __obj.updateDynamic("inputContainerStyle")(inputContainerStyle.asInstanceOf[js.Any])
    if (listContainerStyle != null) __obj.updateDynamic("listContainerStyle")(listContainerStyle.asInstanceOf[js.Any])
    if (listStyle != null) __obj.updateDynamic("listStyle")(listStyle.asInstanceOf[js.Any])
    if (onShowResult != null) __obj.updateDynamic("onShowResult")(onShowResult)
    if (onStartShouldSetResponderCapture != null) __obj.updateDynamic("onStartShouldSetResponderCapture")(onStartShouldSetResponderCapture)
    if (renderSeparator != null) __obj.updateDynamic("renderSeparator")(renderSeparator)
    if (renderTextInput != null) __obj.updateDynamic("renderTextInput")(renderTextInput)
    __obj.asInstanceOf[AutocompleteProps[T]]
  }
}

