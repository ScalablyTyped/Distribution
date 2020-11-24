package typings.reactAutosuggest

import typings.reactAutosuggest.mod.FetchRequestedReasons
import typings.reactAutosuggest.mod.ShouldRenderReasons
import typings.reactAutosuggest.mod.ThemeKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactAutosuggestStrings {
  
  @scala.inline
  def click: click = "click".asInstanceOf[click]
  
  @scala.inline
  def container: container = "container".asInstanceOf[container]
  
  @scala.inline
  def containerOpen: containerOpen = "containerOpen".asInstanceOf[containerOpen]
  
  @scala.inline
  def down: down = "down".asInstanceOf[down]
  
  @scala.inline
  def enter: enter = "enter".asInstanceOf[enter]
  
  @scala.inline
  def escape: escape = "escape".asInstanceOf[escape]
  
  @scala.inline
  def `escape-pressed`: `escape-pressed` = "escape-pressed".asInstanceOf[`escape-pressed`]
  
  @scala.inline
  def input: input = "input".asInstanceOf[input]
  
  @scala.inline
  def `input-blurred`: `input-blurred` = "input-blurred".asInstanceOf[`input-blurred`]
  
  @scala.inline
  def `input-changed`: `input-changed` = "input-changed".asInstanceOf[`input-changed`]
  
  @scala.inline
  def `input-focused`: `input-focused` = "input-focused".asInstanceOf[`input-focused`]
  
  @scala.inline
  def inputFocused: inputFocused = "inputFocused".asInstanceOf[inputFocused]
  
  @scala.inline
  def inputOpen: inputOpen = "inputOpen".asInstanceOf[inputOpen]
  
  @scala.inline
  def render: render = "render".asInstanceOf[render]
  
  @scala.inline
  def sectionContainer: sectionContainer = "sectionContainer".asInstanceOf[sectionContainer]
  
  @scala.inline
  def sectionContainerFirst: sectionContainerFirst = "sectionContainerFirst".asInstanceOf[sectionContainerFirst]
  
  @scala.inline
  def sectionTitle: sectionTitle = "sectionTitle".asInstanceOf[sectionTitle]
  
  @scala.inline
  def suggestion: suggestion = "suggestion".asInstanceOf[suggestion]
  
  @scala.inline
  def `suggestion-selected`: `suggestion-selected` = "suggestion-selected".asInstanceOf[`suggestion-selected`]
  
  @scala.inline
  def suggestionFirst: suggestionFirst = "suggestionFirst".asInstanceOf[suggestionFirst]
  
  @scala.inline
  def suggestionHighlighted: suggestionHighlighted = "suggestionHighlighted".asInstanceOf[suggestionHighlighted]
  
  @scala.inline
  def `suggestions-revealed`: `suggestions-revealed` = "suggestions-revealed".asInstanceOf[`suggestions-revealed`]
  
  @scala.inline
  def `suggestions-updated`: `suggestions-updated` = "suggestions-updated".asInstanceOf[`suggestions-updated`]
  
  @scala.inline
  def suggestionsContainer: suggestionsContainer = "suggestionsContainer".asInstanceOf[suggestionsContainer]
  
  @scala.inline
  def suggestionsContainerOpen: suggestionsContainerOpen = "suggestionsContainerOpen".asInstanceOf[suggestionsContainerOpen]
  
  @scala.inline
  def suggestionsList: suggestionsList = "suggestionsList".asInstanceOf[suggestionsList]
  
  @scala.inline
  def `type`: `type` = "type".asInstanceOf[`type`]
  
  @scala.inline
  def up: up = "up".asInstanceOf[up]
  
  @js.native
  sealed trait click extends js.Object
  
  @js.native
  sealed trait container extends ThemeKey
  
  @js.native
  sealed trait containerOpen extends ThemeKey
  
  @js.native
  sealed trait down extends js.Object
  
  @js.native
  sealed trait enter extends js.Object
  
  @js.native
  sealed trait escape extends js.Object
  
  @js.native
  sealed trait `escape-pressed`
    extends FetchRequestedReasons
       with ShouldRenderReasons
  
  @js.native
  sealed trait input extends ThemeKey
  
  @js.native
  sealed trait `input-blurred` extends ShouldRenderReasons
  
  @js.native
  sealed trait `input-changed`
    extends FetchRequestedReasons
       with ShouldRenderReasons
  
  @js.native
  sealed trait `input-focused`
    extends FetchRequestedReasons
       with ShouldRenderReasons
  
  @js.native
  sealed trait inputFocused extends ThemeKey
  
  @js.native
  sealed trait inputOpen extends ThemeKey
  
  @js.native
  sealed trait render extends ShouldRenderReasons
  
  @js.native
  sealed trait sectionContainer extends ThemeKey
  
  @js.native
  sealed trait sectionContainerFirst extends ThemeKey
  
  @js.native
  sealed trait sectionTitle extends ThemeKey
  
  @js.native
  sealed trait suggestion extends ThemeKey
  
  @js.native
  sealed trait `suggestion-selected` extends FetchRequestedReasons
  
  @js.native
  sealed trait suggestionFirst extends ThemeKey
  
  @js.native
  sealed trait suggestionHighlighted extends ThemeKey
  
  @js.native
  sealed trait `suggestions-revealed`
    extends FetchRequestedReasons
       with ShouldRenderReasons
  
  @js.native
  sealed trait `suggestions-updated` extends ShouldRenderReasons
  
  @js.native
  sealed trait suggestionsContainer extends ThemeKey
  
  @js.native
  sealed trait suggestionsContainerOpen extends ThemeKey
  
  @js.native
  sealed trait suggestionsList extends ThemeKey
  
  @js.native
  sealed trait `type` extends js.Object
  
  @js.native
  sealed trait up extends js.Object
}
