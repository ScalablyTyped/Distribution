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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-md/autocomplete", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-md/autocomplete", "AutoComplete")
  @js.native
  val AutoComplete: ForwardRefExoticComponent[AutoCompleteProps & RefAttributes[HTMLInputElement]] = js.native
  
  inline def DEFAULT_GET_RESULT_ID(id: String, index: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("DEFAULT_GET_RESULT_ID")(id.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def DEFAULT_GET_RESULT_LABEL(datum: AutoCompleteData, labelKey: String, _query: String): ReactNode = (^.asInstanceOf[js.Dynamic].applyDynamic("DEFAULT_GET_RESULT_LABEL")(datum.asInstanceOf[js.Any], labelKey.asInstanceOf[js.Any], _query.asInstanceOf[js.Any])).asInstanceOf[ReactNode]
  
  inline def DEFAULT_GET_RESULT_VALUE(datum: AutoCompleteData, valueKey: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("DEFAULT_GET_RESULT_VALUE")(datum.asInstanceOf[js.Any], valueKey.asInstanceOf[js.Any])).asInstanceOf[String]
  
  object HighlightedResult {
    
    inline def apply(hasPropIdStyleClassNameEnabledValueChildrenRepeatableIndex: HighlightedResultProps): ReactElement = ^.asInstanceOf[js.Dynamic].apply(hasPropIdStyleClassNameEnabledValueChildrenRepeatableIndex.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
    
    @JSImport("@react-md/autocomplete", "HighlightedResult")
    @js.native
    val ^ : js.Any = js.native
    
    object propTypes {
      
      @JSImport("@react-md/autocomplete", "HighlightedResult.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@react-md/autocomplete", "HighlightedResult.propTypes.children")
      @js.native
      def children: js.Any = js.native
      inline def children_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/autocomplete", "HighlightedResult.propTypes.className")
      @js.native
      def className: js.Any = js.native
      inline def className_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/autocomplete", "HighlightedResult.propTypes.enabled")
      @js.native
      def enabled: js.Any = js.native
      inline def enabled_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enabled")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/autocomplete", "HighlightedResult.propTypes.id")
      @js.native
      def id: js.Any = js.native
      inline def id_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/autocomplete", "HighlightedResult.propTypes.index")
      @js.native
      def index: js.Any = js.native
      inline def index_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("index")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/autocomplete", "HighlightedResult.propTypes.repeatable")
      @js.native
      def repeatable: js.Any = js.native
      inline def repeatable_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("repeatable")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/autocomplete", "HighlightedResult.propTypes.style")
      @js.native
      def style: js.Any = js.native
      inline def style_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("style")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/autocomplete", "HighlightedResult.propTypes.value")
      @js.native
      def value: js.Any = js.native
      inline def value_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("value")(x.asInstanceOf[js.Any])
    }
  }
  
  inline def isResultOf[T /* <: js.Object */](datum: AutoCompleteData): /* is T */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isResultOf")(datum.asInstanceOf[js.Any]).asInstanceOf[/* is T */ Boolean]
  
  inline def useAutoComplete(
    hasSuggestionsIdDataPropValueDefaultValueFilterFnFilterOptionsFilterOnNoValueValueKeyGetResultIdGetResultValueOnBlurOnFocusOnClickOnChangeOnKeyDownForwardedRefOnAutoCompleteClearOnAutoCompleteAnchorXMarginYMarginVwMarginVhMarginTransformOriginListboxWidthListboxStylePreventOverlapDisableSwappingDisableVHBoundsCloseOnResizeCloseOnScrollPropDisableShowOnFocusIsListAutocompleteIsInlineAutocomplete: AutoCompleteOptions
  ): AutoCompleteReturnValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useAutoComplete")(hasSuggestionsIdDataPropValueDefaultValueFilterFnFilterOptionsFilterOnNoValueValueKeyGetResultIdGetResultValueOnBlurOnFocusOnClickOnChangeOnKeyDownForwardedRefOnAutoCompleteClearOnAutoCompleteAnchorXMarginYMarginVwMarginVhMarginTransformOriginListboxWidthListboxStylePreventOverlapDisableSwappingDisableVHBoundsCloseOnResizeCloseOnScrollPropDisableShowOnFocusIsListAutocompleteIsInlineAutocomplete.asInstanceOf[js.Any]).asInstanceOf[AutoCompleteReturnValue]
}
