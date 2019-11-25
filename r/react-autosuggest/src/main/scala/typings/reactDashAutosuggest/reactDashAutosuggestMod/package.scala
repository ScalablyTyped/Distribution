package typings.reactDashAutosuggest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashAutosuggestMod {
  import typings.react.reactMod.CSSProperties
  import typings.react.reactMod.FormEvent
  import typings.react.reactMod.ReactNode
  import typings.std.Partial
  import typings.std.Pick
  import typings.std.Record

  // types for functions - allowing reuse externally - e.g. as props and bound in the constructor
  type GetSectionSuggestions[TSuggestion, TSection] = js.Function1[/* section */ TSection, js.Array[TSuggestion]]
  type GetSuggestionValue[TSuggestion] = js.Function1[/* suggestion */ TSuggestion, String]
  /**
    * Utilies types based on:
    * https://github.com/Microsoft/TypeScript/issues/12215#issuecomment-307871458
    */
  /** @internal */
  type Omit[T, K /* <: String */] = Pick[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: P} & {[ P in K ]: never} & {[x: string] : never, [x: number] : never}[keyof T] */ js.Any
  ]
  type OnSuggestionHighlighted = js.Function1[/* params */ SuggestionHighlightedParams, Unit]
  type OnSuggestionSelected[TSuggestion] = js.Function2[
    /* event */ FormEvent[js.Any], 
    /* data */ SuggestionSelectedEventData[TSuggestion], 
    Unit
  ]
  type OnSuggestionsClearRequested = js.Function0[Unit]
  type RenderInputComponent[TSuggestion] = js.Function1[/* inputProps */ InputProps[TSuggestion], ReactNode]
  type RenderSectionTitle = js.Function1[/* section */ js.Any, ReactNode]
  type RenderSuggestion[TSuggestion] = js.Function2[/* suggestion */ TSuggestion, /* params */ RenderSuggestionParams, ReactNode]
  type RenderSuggestionsContainer = js.Function1[/* params */ RenderSuggestionsContainerParams, ReactNode]
  type ShouldRenderSuggestions = js.Function1[/* value */ String, Boolean]
  type SuggestionsFetchRequested = js.Function1[/* request */ SuggestionsFetchRequestedParams, Unit]
  type Theme = (Record[String, String | CSSProperties]) | (Partial[Record[ThemeKey, String | CSSProperties]])
}
