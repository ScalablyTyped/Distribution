package typings.reactMdAutocomplete

import typings.react.mod.FC
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.reactMdAutocomplete.highlightedResultMod.HighlightedResultProps
import typings.reactMdAutocomplete.typesMod.AutoCompleteData
import typings.reactMdAutocomplete.typesMod.AutoCompleteProps
import typings.reactMdAutocomplete.useAutoCompleteMod.AutoCompleteOptions
import typings.reactMdAutocomplete.useAutoCompleteMod.AutoCompleteReturnValue
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@react-md/autocomplete", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /**
    * An AutoComplete is an accessible combobox widget that allows for real-time
    * suggestions as the user types.
    */
  val AutoComplete: ForwardRefExoticComponent[AutoCompleteProps with RefAttributes[HTMLInputElement]] = js.native
  /**
    * The `HighlightedResult` component can be used to bold specific letters
    * within the `children` if the `children` is a string.
    */
  val HighlightedResult: FC[HighlightedResultProps] = js.native
  def DEFAULT_GET_RESULT_ID(id: String, index: Double): String = js.native
  def DEFAULT_GET_RESULT_LABEL(datum: AutoCompleteData, labelKey: String, _query: String): ReactNode = js.native
  def DEFAULT_GET_RESULT_VALUE(datum: AutoCompleteData, valueKey: String): String = js.native
  def isResultOf[T /* <: js.Object */](datum: AutoCompleteData): /* is T */ Boolean = js.native
  def useAutoComplete(
    hasSuggestionsIdDataPropValueDefaultValueFilterFilterOptionsFilterOnNoValueValueKeyGetResultIdGetResultValueOnBlurOnFocusOnClickOnChangeOnKeyDownForwardedRefOnAutoCompleteClearOnAutoCompleteAnchorXMarginYMarginVwMarginVhMarginTransformOriginListboxWidthListboxStylePreventOverlapDisableSwappingDisableVHBoundsCloseOnResizeCloseOnScrollDisableShowOnFocusIsListAutocompleteIsInlineAutocomplete: AutoCompleteOptions
  ): AutoCompleteReturnValue = js.native
}

