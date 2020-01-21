package typings.reactAutosuggest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  // types for functions - allowing reuse externally - e.g. as props and bound in the constructor
  type GetSectionSuggestions[TSuggestion, TSection] = js.Function1[/* section */ TSection, js.Array[TSuggestion]]
  type GetSuggestionValue[TSuggestion] = js.Function1[/* suggestion */ TSuggestion, java.lang.String]
  /**
    * Utilies types based on:
    * https://github.com/Microsoft/TypeScript/issues/12215#issuecomment-307871458
    */
  /** @internal */
  type Omit[T, K /* <: java.lang.String */] = typings.std.Pick[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: P} & {[ P in K ]: never} & {[x: string] : never, [x: number] : never}[keyof T] */ js.Any
  ]
  type OnSuggestionHighlighted = js.Function1[/* params */ typings.reactAutosuggest.mod.SuggestionHighlightedParams, scala.Unit]
  type OnSuggestionSelected[TSuggestion] = js.Function2[
    /* event */ typings.react.mod.FormEvent[js.Any], 
    /* data */ typings.reactAutosuggest.mod.SuggestionSelectedEventData[TSuggestion], 
    scala.Unit
  ]
  type OnSuggestionsClearRequested = js.Function0[scala.Unit]
  type RenderInputComponent[TSuggestion] = js.Function1[
    /* inputProps */ typings.reactAutosuggest.mod.InputProps[TSuggestion], 
    typings.react.mod.ReactNode
  ]
  type RenderSectionTitle = js.Function1[/* section */ js.Any, typings.react.mod.ReactNode]
  type RenderSuggestion[TSuggestion] = js.Function2[
    /* suggestion */ TSuggestion, 
    /* params */ typings.reactAutosuggest.mod.RenderSuggestionParams, 
    typings.react.mod.ReactNode
  ]
  type RenderSuggestionsContainer = js.Function1[
    /* params */ typings.reactAutosuggest.mod.RenderSuggestionsContainerParams, 
    typings.react.mod.ReactNode
  ]
  type ShouldRenderSuggestions = js.Function1[/* value */ java.lang.String, scala.Boolean]
  type SuggestionsFetchRequested = js.Function1[
    /* request */ typings.reactAutosuggest.mod.SuggestionsFetchRequestedParams, 
    scala.Unit
  ]
  type Theme = (typings.std.Record[java.lang.String, java.lang.String | typings.react.mod.CSSProperties]) | typings.reactAutosuggest.PartialRecordThemeKeystringCSSProperties
}
