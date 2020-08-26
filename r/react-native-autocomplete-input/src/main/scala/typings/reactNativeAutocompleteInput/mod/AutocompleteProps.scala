package typings.reactNativeAutocompleteInput.mod

import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.reactNative.mod.FlatListProps
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextInputProperties
import typings.reactNative.mod.TextInputProps
import typings.reactNative.mod.ViewStyle
import typings.reactNativeAutocompleteInput.anon.Index
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutocompleteProps[T] extends TextInputProps {
  /**
    * style
    * These styles will be applied to the container which surrounds the autocomplete component.
    */
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  /**
    * array
    * An array with suggestion items to be rendered in renderItem({ item, index }). Any array with length > 0 will open the suggestion list and any array with length < 1 will hide the list.
    */
  var data: js.Array[T] = js.native
  /**
    * object
    * Props to pass on to the underlying FlatList.
    */
  var flatListProps: js.UndefOr[Partial[FlatListProps[T]]] = js.native
  /**
    * bool
    * Set to true to hide the suggestion list.
    */
  var hideResults: js.UndefOr[Boolean] = js.native
  /**
    * style
    * These styles will be applied to the container which surrounds the textInput component.
    */
  var inputContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  /**
    * function
    * keyExtractor will be called to get key for each item. It's up to you which string to return as a key.
    */
  var keyExtractor: js.UndefOr[js.Function2[/* item */ T, /* i */ Double, String]] = js.native
  /**
    * style
    * These styles will be applied to the container which surrounds the result list.
    */
  var listContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  /**
    * style
    * These style will be applied to the result list.
    */
  var listStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  /**
    * function
    * onShowResult will be called when the autocomplete suggestions appear or disappear.
    */
  var onShowResult: js.UndefOr[js.Function1[/* showResults */ Boolean, Unit]] = js.native
  /**
    * function
    * renderSeparator will be called to render the list separators which will be displayed between the list elements in the result view below the text input.
    */
  var renderSeparator: js.UndefOr[
    js.Function3[
      /* sectionID */ String | Double, 
      /* rowID */ String | Double, 
      /* adjacentRowHighlighted */ js.UndefOr[Boolean], 
      ReactElement
    ]
  ] = js.native
  /**
    * function
    * render custom TextInput. All props passed to this function.
    */
  var renderTextInput: js.UndefOr[js.Function1[/* props */ TextInputProperties, ReactNode]] = js.native
  /**
    * function
    * renderItem will be called to render the data objects which will be displayed in the result view below the text input.
    */
  def renderItem(itemWithIndex: Index[T]): ReactNode = js.native
}

object AutocompleteProps {
  @scala.inline
  def apply[T](data: js.Array[T], renderItem: Index[T] => ReactNode): AutocompleteProps[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], renderItem = js.Any.fromFunction1(renderItem))
    __obj.asInstanceOf[AutocompleteProps[T]]
  }
  @scala.inline
  implicit class AutocompletePropsOps[Self <: AutocompleteProps[_], T] (val x: Self with AutocompleteProps[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDataVarargs(value: T*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[T]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setRenderItem(value: Index[T] => ReactNode): Self = this.set("renderItem", js.Any.fromFunction1(value))
    @scala.inline
    def setContainerStyle(value: StyleProp[ViewStyle]): Self = this.set("containerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerStyle: Self = this.set("containerStyle", js.undefined)
    @scala.inline
    def setContainerStyleNull: Self = this.set("containerStyle", null)
    @scala.inline
    def setFlatListProps(value: Partial[FlatListProps[T]]): Self = this.set("flatListProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlatListProps: Self = this.set("flatListProps", js.undefined)
    @scala.inline
    def setHideResults(value: Boolean): Self = this.set("hideResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideResults: Self = this.set("hideResults", js.undefined)
    @scala.inline
    def setInputContainerStyle(value: StyleProp[ViewStyle]): Self = this.set("inputContainerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputContainerStyle: Self = this.set("inputContainerStyle", js.undefined)
    @scala.inline
    def setInputContainerStyleNull: Self = this.set("inputContainerStyle", null)
    @scala.inline
    def setKeyExtractor(value: (/* item */ T, /* i */ Double) => String): Self = this.set("keyExtractor", js.Any.fromFunction2(value))
    @scala.inline
    def deleteKeyExtractor: Self = this.set("keyExtractor", js.undefined)
    @scala.inline
    def setListContainerStyle(value: StyleProp[ViewStyle]): Self = this.set("listContainerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListContainerStyle: Self = this.set("listContainerStyle", js.undefined)
    @scala.inline
    def setListContainerStyleNull: Self = this.set("listContainerStyle", null)
    @scala.inline
    def setListStyle(value: StyleProp[ViewStyle]): Self = this.set("listStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListStyle: Self = this.set("listStyle", js.undefined)
    @scala.inline
    def setListStyleNull: Self = this.set("listStyle", null)
    @scala.inline
    def setOnShowResult(value: /* showResults */ Boolean => Unit): Self = this.set("onShowResult", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnShowResult: Self = this.set("onShowResult", js.undefined)
    @scala.inline
    def setRenderSeparator(
      value: (/* sectionID */ String | Double, /* rowID */ String | Double, /* adjacentRowHighlighted */ js.UndefOr[Boolean]) => ReactElement
    ): Self = this.set("renderSeparator", js.Any.fromFunction3(value))
    @scala.inline
    def deleteRenderSeparator: Self = this.set("renderSeparator", js.undefined)
    @scala.inline
    def setRenderTextInput(value: /* props */ TextInputProperties => ReactNode): Self = this.set("renderTextInput", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRenderTextInput: Self = this.set("renderTextInput", js.undefined)
  }
  
}

