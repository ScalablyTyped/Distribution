package typings.reactAutosuggest

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Record<react-autosuggest.react-autosuggest.ThemeKey, string | react.react.CSSProperties>> */
trait PartialRecordThemeKeystringCSSProperties extends js.Object {
  var container: js.UndefOr[String | CSSProperties] = js.undefined
  var containerOpen: js.UndefOr[String | CSSProperties] = js.undefined
  var input: js.UndefOr[String | CSSProperties] = js.undefined
  var inputFocused: js.UndefOr[String | CSSProperties] = js.undefined
  var inputOpen: js.UndefOr[String | CSSProperties] = js.undefined
  var sectionContainer: js.UndefOr[String | CSSProperties] = js.undefined
  var sectionContainerFirst: js.UndefOr[String | CSSProperties] = js.undefined
  var sectionTitle: js.UndefOr[String | CSSProperties] = js.undefined
  var suggestion: js.UndefOr[String | CSSProperties] = js.undefined
  var suggestionFirst: js.UndefOr[String | CSSProperties] = js.undefined
  var suggestionHighlighted: js.UndefOr[String | CSSProperties] = js.undefined
  var suggestionsContainer: js.UndefOr[String | CSSProperties] = js.undefined
  var suggestionsContainerOpen: js.UndefOr[String | CSSProperties] = js.undefined
  var suggestionsList: js.UndefOr[String | CSSProperties] = js.undefined
}

object PartialRecordThemeKeystringCSSProperties {
  @scala.inline
  def apply(
    container: String | CSSProperties = null,
    containerOpen: String | CSSProperties = null,
    input: String | CSSProperties = null,
    inputFocused: String | CSSProperties = null,
    inputOpen: String | CSSProperties = null,
    sectionContainer: String | CSSProperties = null,
    sectionContainerFirst: String | CSSProperties = null,
    sectionTitle: String | CSSProperties = null,
    suggestion: String | CSSProperties = null,
    suggestionFirst: String | CSSProperties = null,
    suggestionHighlighted: String | CSSProperties = null,
    suggestionsContainer: String | CSSProperties = null,
    suggestionsContainerOpen: String | CSSProperties = null,
    suggestionsList: String | CSSProperties = null
  ): PartialRecordThemeKeystringCSSProperties = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (containerOpen != null) __obj.updateDynamic("containerOpen")(containerOpen.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (inputFocused != null) __obj.updateDynamic("inputFocused")(inputFocused.asInstanceOf[js.Any])
    if (inputOpen != null) __obj.updateDynamic("inputOpen")(inputOpen.asInstanceOf[js.Any])
    if (sectionContainer != null) __obj.updateDynamic("sectionContainer")(sectionContainer.asInstanceOf[js.Any])
    if (sectionContainerFirst != null) __obj.updateDynamic("sectionContainerFirst")(sectionContainerFirst.asInstanceOf[js.Any])
    if (sectionTitle != null) __obj.updateDynamic("sectionTitle")(sectionTitle.asInstanceOf[js.Any])
    if (suggestion != null) __obj.updateDynamic("suggestion")(suggestion.asInstanceOf[js.Any])
    if (suggestionFirst != null) __obj.updateDynamic("suggestionFirst")(suggestionFirst.asInstanceOf[js.Any])
    if (suggestionHighlighted != null) __obj.updateDynamic("suggestionHighlighted")(suggestionHighlighted.asInstanceOf[js.Any])
    if (suggestionsContainer != null) __obj.updateDynamic("suggestionsContainer")(suggestionsContainer.asInstanceOf[js.Any])
    if (suggestionsContainerOpen != null) __obj.updateDynamic("suggestionsContainerOpen")(suggestionsContainerOpen.asInstanceOf[js.Any])
    if (suggestionsList != null) __obj.updateDynamic("suggestionsList")(suggestionsList.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialRecordThemeKeystringCSSProperties]
  }
}

