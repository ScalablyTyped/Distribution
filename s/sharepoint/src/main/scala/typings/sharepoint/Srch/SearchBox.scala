package typings.sharepoint.Srch

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the search box control */
@JSGlobal("Srch.SearchBox")
@js.native
class SearchBox protected () extends ClientControl {
  def this(elem: Element) = this()
  def activate(
    prompt: String,
    searchBoxInputId: String,
    searchBoxContainerId: String,
    navigationButtonId: String,
    suggestionsListId: String,
    navigationListId: String,
    searchBoxLinkId: String,
    searchBoxProgressClass: String,
    searchBoxPromptClass: String
  ): Unit = js.native
  def activateDefaultNavigationBehavior(): Unit = js.native
  def activateDefaultQuerySuggestionBehavior(): Unit = js.native
  def add_batchQueryIssuing(value: js.Any): Unit = js.native
  def add_batchResultReady(value: js.Any): Unit = js.native
  def add_queryReady(value: js.Any): Unit = js.native
  def dataProvider_QueryIssuing(sender: js.Any, e: js.Any): Unit = js.native
  def dataProvider_QueryStateChanged(sender: js.Any, e: js.Any): Unit = js.native
  def dataProvider_ResultReady(sender: js.Any, e: js.Any): Unit = js.native
  def focus(): Unit = js.native
  def get_advancedSearchPageAddress(): String = js.native
  def get_allowEmptySearch(): Boolean = js.native
  /** Gets the search input placeholder text */
  def get_currentPrompt(): String = js.native
  /** Returns the current search term */
  def get_currentTerm(): String = js.native
  def get_initialPrompt(): String = js.native
  def get_maintainQueryState(): Boolean = js.native
  def get_msBeforeShowingProgress(): Double = js.native
  def get_navigationButtonId(): String = js.native
  def get_navigationListId(): String = js.native
  def get_navigationNodes(): js.Any = js.native
  def get_pageTitlePrefix(): String = js.native
  def get_personalResultCount(): Double = js.native
  /** Gets the css class/classes of the placeholder text. Default is 'ms-srch-sb-prompt ms-helperText' */
  def get_promptCssClass(): String = js.native
  def get_queryGroupNames(): js.Array[String] = js.native
  /** Gets the interval in milliseconds, if user is idle during this interval, suggestions retrieval will be initiated.
    * Default value is 250.
    */
  def get_querySuggestionCompletionInterval(): Double = js.native
  /** Gets number of suggestions to display. Default is 5. */
  def get_querySuggestionCount(): Double = js.native
  /** Gets minimum length of the search term for suggestions to be retrieved. Default is 2 letters. */
  def get_querySuggestionMinimumPrefixLength(): Double = js.native
  def get_querySuggestionsSourceID(): String = js.native
  /** Gets the results page address, e.g. '~site/_layouts/15/osssearchresults.aspx?u={contexturl}' */
  def get_resultsPageAddress(): String = js.native
  def get_searchBoxContainerElement(): Element = js.native
  def get_searchBoxContainerId(): String = js.native
  def get_searchBoxInputElement(): Element = js.native
  /** Gets the id of the search box input element */
  def get_searchBoxInputId(): String = js.native
  def get_searchBoxLinkElement(): Element = js.native
  def get_searchBoxLinkId(): String = js.native
  def get_searchBoxProgressClass(): String = js.native
  def get_serverInitialRender(): Boolean = js.native
  def get_setFocusOnPageLoad(): Boolean = js.native
  def get_showAdvancedLink(): Boolean = js.native
  def get_showNavigation(): Boolean = js.native
  def get_showPeopleNameSuggestions(): Boolean = js.native
  def get_showPreferencesLink(): Boolean = js.native
  def get_showQuerySuggestions(): Boolean = js.native
  def get_suggestionsListId(): String = js.native
  def get_tryInplaceQuery(): Boolean = js.native
  def get_updatePageTitle(): Boolean = js.native
  def hidePrompt(): Unit = js.native
  def raiseBatchQueryIssuingEvent(arg: js.Any): Unit = js.native
  def raiseBatchResultReadyEvent(arg: js.Any): Unit = js.native
  def raiseQueryReadyEvent(arg: js.Any): Unit = js.native
  def remove_batchQueryIssuing(value: js.Any): Unit = js.native
  def remove_batchResultReady(value: js.Any): Unit = js.native
  def remove_queryReady(value: js.Any): Unit = js.native
  def search(term: String): Unit = js.native
  def setBorder(focused: Boolean): Unit = js.native
  def set_advancedSearchPageAddress(value: String): String = js.native
  def set_allowEmptySearch(value: Boolean): Boolean = js.native
  /** Sets the search input placeholder text */
  def set_currentPrompt(value: String): String = js.native
  /** Sets the current search term.
    * Does not update results or even re-render control automatically, only sets the value.
    * You can call .renderControl() method to re-render control.
    */
  def set_currentTerm(value: String): String = js.native
  def set_initialPrompt(value: String): String = js.native
  def set_maintainQueryState(value: Boolean): Boolean = js.native
  def set_msBeforeShowingProgress(value: Double): Double = js.native
  def set_navigationButtonId(value: String): String = js.native
  def set_navigationListId(value: String): String = js.native
  def set_navigationNodes(value: js.Any): js.Any = js.native
  def set_pageTitlePrefix(value: String): String = js.native
  def set_personalResultCount(value: Double): Double = js.native
  /** Sets the css class/classes of the placeholder text. Default is 'ms-srch-sb-prompt ms-helperText' */
  def set_promptCssClass(value: String): String = js.native
  def set_queryGroupNames(value: js.Any): js.Array[String] = js.native
  /** Sets the interval in milliseconds, if user is idle during this interval, suggestions retrieval will be initiated.
    * Default value is 250.
    */
  def set_querySuggestionCompletionInterval(value: Double): Double = js.native
  /** Sets number of suggestions to display. Default is 5. */
  def set_querySuggestionCount(value: Double): Double = js.native
  /** Sets minimum length of the search term for suggestions to be retrieved. Default is 2 letters. */
  def set_querySuggestionMinimumPrefixLength(value: Double): Double = js.native
  def set_querySuggestionsSourceID(value: String): String = js.native
  /** Sets the results page address, e.g. '~site/_layouts/15/osssearchresults.aspx?u={contexturl}'
    * Parameter u is used for setting the url filter for the search, so that only results within
    * e.g. specified site are returned. Omit this parameter if you want to search everywhere.
    */
  def set_resultsPageAddress(value: String): String = js.native
  def set_searchBoxContainerId(value: String): String = js.native
  /** Sets the id of the search box input element */
  def set_searchBoxInputId(value: String): String = js.native
  def set_searchBoxLinkId(value: String): String = js.native
  def set_searchBoxProgressClass(value: String): String = js.native
  def set_serverInitialRender(value: Boolean): Boolean = js.native
  def set_setFocusOnPageLoad(value: Boolean): Boolean = js.native
  def set_showAdvancedLink(value: Boolean): Boolean = js.native
  def set_showNavigation(value: Boolean): Boolean = js.native
  def set_showPeopleNameSuggestions(value: Boolean): Boolean = js.native
  def set_showPreferencesLink(value: Boolean): Boolean = js.native
  def set_showQuerySuggestions(value: Boolean): Boolean = js.native
  def set_suggestionsListId(value: String): String = js.native
  def set_tryInplaceQuery(value: Boolean): Boolean = js.native
  def set_updatePageTitle(value: Boolean): Boolean = js.native
  def showPrompt(): Unit = js.native
}

