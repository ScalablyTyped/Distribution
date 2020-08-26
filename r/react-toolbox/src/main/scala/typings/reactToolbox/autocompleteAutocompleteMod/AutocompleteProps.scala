package typings.reactToolbox.autocompleteAutocompleteMod

import org.scalablytyped.runtime.StringDictionary
import typings.reactToolbox.inputInputMod.InputProps
import typings.reactToolbox.inputInputMod.InputTheme
import typings.reactToolbox.reactToolboxStrings.above
import typings.reactToolbox.reactToolboxStrings.anywhere
import typings.reactToolbox.reactToolboxStrings.auto
import typings.reactToolbox.reactToolboxStrings.below
import typings.reactToolbox.reactToolboxStrings.disabled
import typings.reactToolbox.reactToolboxStrings.down
import typings.reactToolbox.reactToolboxStrings.none
import typings.reactToolbox.reactToolboxStrings.start
import typings.reactToolbox.reactToolboxStrings.up
import typings.reactToolbox.reactToolboxStrings.word
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutocompleteProps
  extends InputProps
     with /**
  * Additional properties passed to inner Input component.
  */
/* key */ StringDictionary[js.Any] {
  /**
    * Determines if user can create a new option with the current typed value.
    * @default false
    */
  var allowCreate: js.UndefOr[Boolean] = js.native
  /**
    * Determines the opening direction. It can be auto, up or down.
    * @default auto
    */
  var direction: js.UndefOr[auto | up | down] = js.native
  /**
    * Whether component should keep focus after value change.
    * @default false
    */
  var keepFocusOnChange: js.UndefOr[Boolean] = js.native
  /**
    * If true, component can hold multiple values.
    * @default true
    */
  var multiple: js.UndefOr[Boolean] = js.native
  /**
    * Callback function that is fired when the components's query value changes.
    */
  var onQueryChange: js.UndefOr[js.Function] = js.native
  /**
    * Determines if the selected list is shown above or below input. It can be above or below.
    * @default above
    */
  var selectedPosition: js.UndefOr[above | below | none] = js.native
  /**
    * Determines if the selected list is shown if the `value` keys don't exist in the source. Only works if passing the `value` prop as an Object.
    * @default false
    */
  var showSelectedWhenNotInSource: js.UndefOr[Boolean] = js.native
  /**
    * If true, the list of suggestions will not be filtered when a value is selected.
    * @default false
    */
  var showSuggestionsWhenValueIsSet: js.UndefOr[Boolean] = js.native
  /**
    * Object of key/values or array representing all items suggested.
    */
  var source: js.UndefOr[js.Any] = js.native
  /**
    * Determines how suggestions are supplied.
    * @default start
    */
  var suggestionMatch: js.UndefOr[disabled | start | anywhere | word] = js.native
  /**
    * Classnames object defining the component style.
    */
  @JSName("theme")
  var theme_AutocompleteProps: js.UndefOr[AutocompleteTheme with InputTheme] = js.native
}

object AutocompleteProps {
  @scala.inline
  def apply(): AutocompleteProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutocompleteProps]
  }
  @scala.inline
  implicit class AutocompletePropsOps[Self <: AutocompleteProps] (val x: Self) extends AnyVal {
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
    def setAllowCreate(value: Boolean): Self = this.set("allowCreate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowCreate: Self = this.set("allowCreate", js.undefined)
    @scala.inline
    def setDirection(value: auto | up | down): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setKeepFocusOnChange(value: Boolean): Self = this.set("keepFocusOnChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepFocusOnChange: Self = this.set("keepFocusOnChange", js.undefined)
    @scala.inline
    def setMultiple(value: Boolean): Self = this.set("multiple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiple: Self = this.set("multiple", js.undefined)
    @scala.inline
    def setOnQueryChange(value: js.Function): Self = this.set("onQueryChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnQueryChange: Self = this.set("onQueryChange", js.undefined)
    @scala.inline
    def setSelectedPosition(value: above | below | none): Self = this.set("selectedPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedPosition: Self = this.set("selectedPosition", js.undefined)
    @scala.inline
    def setShowSelectedWhenNotInSource(value: Boolean): Self = this.set("showSelectedWhenNotInSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowSelectedWhenNotInSource: Self = this.set("showSelectedWhenNotInSource", js.undefined)
    @scala.inline
    def setShowSuggestionsWhenValueIsSet(value: Boolean): Self = this.set("showSuggestionsWhenValueIsSet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowSuggestionsWhenValueIsSet: Self = this.set("showSuggestionsWhenValueIsSet", js.undefined)
    @scala.inline
    def setSource(value: js.Any): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    @scala.inline
    def setSuggestionMatch(value: disabled | start | anywhere | word): Self = this.set("suggestionMatch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuggestionMatch: Self = this.set("suggestionMatch", js.undefined)
    @scala.inline
    def setTheme(value: AutocompleteTheme with InputTheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}

