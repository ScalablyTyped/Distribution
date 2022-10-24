package typings.reactMdAutocomplete

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.reactMdAutocomplete.typesHighlightedResultMod.HighlightedResultProps
import typings.reactMdAutocomplete.typesTypesMod.AutoCompleteData
import typings.reactMdAutocomplete.typesTypesMod.AutoCompleteProps
import typings.reactMdAutocomplete.typesUseAutoCompleteMod.AutoCompleteOptions
import typings.reactMdAutocomplete.typesUseAutoCompleteMod.AutoCompleteReturnValue
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
  
  inline def HighlightedResult(param0: HighlightedResultProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("HighlightedResult")(param0.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  inline def isResultOf[T /* <: js.Object */](datum: AutoCompleteData): /* is T */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isResultOf")(datum.asInstanceOf[js.Any]).asInstanceOf[/* is T */ Boolean]
  
  inline def useAutoComplete(param0: AutoCompleteOptions): AutoCompleteReturnValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useAutoComplete")(param0.asInstanceOf[js.Any]).asInstanceOf[AutoCompleteReturnValue]
}
