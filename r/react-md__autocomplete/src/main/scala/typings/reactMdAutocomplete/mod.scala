package typings.reactMdAutocomplete

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactElement
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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-md/autocomplete", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val AutoComplete: ForwardRefExoticComponent[AutoCompleteProps with RefAttributes[HTMLInputElement]] = js.native
  
  def DEFAULT_GET_RESULT_ID(id: String, index: Double): String = js.native
  
  def DEFAULT_GET_RESULT_LABEL(datum: AutoCompleteData, labelKey: String, _query: String): ReactNode = js.native
  
  def DEFAULT_GET_RESULT_VALUE(datum: AutoCompleteData, valueKey: String): String = js.native
  
  def isResultOf[T /* <: js.Object */](datum: AutoCompleteData): /* is T */ Boolean = js.native
  
  def useAutoComplete(
    hasSuggestionsIdDataPropValueDefaultValueFilterFilterOptionsFilterOnNoValueValueKeyGetResultIdGetResultValueOnBlurOnFocusOnClickOnChangeOnKeyDownForwardedRefOnAutoCompleteClearOnAutoCompleteAnchorXMarginYMarginVwMarginVhMarginTransformOriginListboxWidthListboxStylePreventOverlapDisableSwappingDisableVHBoundsCloseOnResizeCloseOnScrollDisableShowOnFocusIsListAutocompleteIsInlineAutocomplete: AutoCompleteOptions
  ): AutoCompleteReturnValue = js.native
  
  @js.native
  object HighlightedResult extends js.Object {
    
    def apply(hasIdStyleClassNameEnabledValueChildrenRepeatableIndex: HighlightedResultProps): ReactElement = js.native
    
    @js.native
    object propTypes extends js.Object {
      
      var children: js.Any = js.native
      
      var className: js.Any = js.native
      
      var enabled: js.Any = js.native
      
      var id: js.Any = js.native
      
      var index: js.Any = js.native
      
      var repeatable: js.Any = js.native
      
      var style: js.Any = js.native
      
      var value: js.Any = js.native
    }
  }
}
