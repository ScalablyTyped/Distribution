package typings.reactDashNativeDashAutocompleteDashInput.reactDashNativeDashAutocompleteDashInputMod

import typings.react.reactMod.ReactNode
import typings.reactDashNative.reactDashNativeMod.FlatListProps
import typings.reactDashNative.reactDashNativeMod.GestureResponderEvent
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import typings.reactDashNativeDashAutocompleteDashInput.Anon_Index
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ trait AutocompleteProps[T] extends js.Object {
  /**
    * style
    * These styles will be applied to the container which surrounds the autocomplete component.
    */
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  /**
    * array
    * An array with suggestion items to be rendered in renderItem({ item, index }). Any array with length > 0 will open the suggestion list and any array with length < 1 will hide the list.
    */
  var data: js.Array[T]
  /**
    * object
    * Props to pass on to the underlying FlatList.
    */
  var flatListProps: js.UndefOr[Partial[FlatListProps[T]]] = js.undefined
  /**
    * bool
    * Set to true to hide the suggestion list.
    */
  var hideResults: js.UndefOr[Boolean] = js.undefined
  /**
    * style
    * These styles will be applied to the container which surrounds the textInput component.
    */
  var inputContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  /**
    * function
    * keyExtractor will be called to get key for each item. It's up to you which string to return as a key.
    */
  var keyExtractor: js.UndefOr[js.Function2[/* item */ T, /* i */ Double, String]] = js.undefined
  /**
    * style
    * These styles will be applied to the container which surrounds the result list.
    */
  var listContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  /**
    * style
    * These style will be applied to the result list.
    */
  var listStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  /**
    * function
    * onShowResult will be called when the autocomplete suggestions appear or disappear.
    */
  var onShowResult: js.UndefOr[js.Function1[/* showResults */ Boolean, Unit]] = js.undefined
  /**
    * function
    * onStartShouldSetResponderCapture will be passed to the result list view container (onStartShouldSetResponderCapture).
    */
  var onStartShouldSetResponderCapture: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.undefined
  /**
    * function
    * renderSeparator will be called to render the list separators which will be displayed between the list elements in the result view below the text input.
    */
  var renderSeparator: js.UndefOr[
    /* import warning: ImportType.apply Failed type conversion: any['renderSeparator'] */ js.Any
  ] = js.undefined
  /**
    * function
    * render custom TextInput. All props passed to this function.
    */
  var renderTextInput: js.UndefOr[
    js.Function1[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TextInputProperties */ /* props */ js.Any, 
      ReactNode
    ]
  ] = js.undefined
  /**
    * function
    * renderItem will be called to render the data objects which will be displayed in the result view below the text input.
    */
  def renderItem(itemWithIndex: Anon_Index[T]): ReactNode
}

object AutocompleteProps {
  @scala.inline
  def apply[T](
    data: js.Array[T],
    renderItem: Anon_Index[T] => ReactNode,
    containerStyle: StyleProp[ViewStyle] = null,
    flatListProps: Partial[FlatListProps[T]] = null,
    hideResults: js.UndefOr[Boolean] = js.undefined,
    inputContainerStyle: StyleProp[ViewStyle] = null,
    keyExtractor: (/* item */ T, /* i */ Double) => String = null,
    listContainerStyle: StyleProp[ViewStyle] = null,
    listStyle: StyleProp[ViewStyle] = null,
    onShowResult: /* showResults */ Boolean => Unit = null,
    onStartShouldSetResponderCapture: /* event */ GestureResponderEvent => Boolean = null,
    renderSeparator: /* import warning: ImportType.apply Failed type conversion: any['renderSeparator'] */ js.Any = null,
    renderTextInput: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TextInputProperties */ /* props */ js.Any => ReactNode = null
  ): AutocompleteProps[T] = {
    val __obj = js.Dynamic.literal(data = data, renderItem = js.Any.fromFunction1(renderItem))
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (flatListProps != null) __obj.updateDynamic("flatListProps")(flatListProps)
    if (!js.isUndefined(hideResults)) __obj.updateDynamic("hideResults")(hideResults)
    if (inputContainerStyle != null) __obj.updateDynamic("inputContainerStyle")(inputContainerStyle.asInstanceOf[js.Any])
    if (keyExtractor != null) __obj.updateDynamic("keyExtractor")(js.Any.fromFunction2(keyExtractor))
    if (listContainerStyle != null) __obj.updateDynamic("listContainerStyle")(listContainerStyle.asInstanceOf[js.Any])
    if (listStyle != null) __obj.updateDynamic("listStyle")(listStyle.asInstanceOf[js.Any])
    if (onShowResult != null) __obj.updateDynamic("onShowResult")(js.Any.fromFunction1(onShowResult))
    if (onStartShouldSetResponderCapture != null) __obj.updateDynamic("onStartShouldSetResponderCapture")(js.Any.fromFunction1(onStartShouldSetResponderCapture))
    if (renderSeparator != null) __obj.updateDynamic("renderSeparator")(renderSeparator)
    if (renderTextInput != null) __obj.updateDynamic("renderTextInput")(js.Any.fromFunction1(renderTextInput))
    __obj.asInstanceOf[AutocompleteProps[T]]
  }
}

