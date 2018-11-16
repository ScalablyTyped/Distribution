package typings
package sharepointLib.SrchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the search box control */
@JSGlobal("Srch.SearchBox")
@js.native
class SearchBox protected () extends ClientControl {
  def this(elem: stdLib.Element) = this()
  def activate(
    prompt: java.lang.String,
    searchBoxInputId: java.lang.String,
    searchBoxContainerId: java.lang.String,
    navigationButtonId: java.lang.String,
    suggestionsListId: java.lang.String,
    navigationListId: java.lang.String,
    searchBoxLinkId: java.lang.String,
    searchBoxProgressClass: java.lang.String,
    searchBoxPromptClass: java.lang.String
  ): scala.Unit = js.native
  def activateDefaultNavigationBehavior(): scala.Unit = js.native
  def activateDefaultQuerySuggestionBehavior(): scala.Unit = js.native
  def add_batchQueryIssuing(value: js.Any): scala.Unit = js.native
  def add_batchResultReady(value: js.Any): scala.Unit = js.native
  def add_queryReady(value: js.Any): scala.Unit = js.native
  def dataProvider_QueryIssuing(sender: js.Any, e: js.Any): scala.Unit = js.native
  def dataProvider_QueryStateChanged(sender: js.Any, e: js.Any): scala.Unit = js.native
  def dataProvider_ResultReady(sender: js.Any, e: js.Any): scala.Unit = js.native
  def focus(): scala.Unit = js.native
  def get_advancedSearchPageAddress(): java.lang.String = js.native
  def get_allowEmptySearch(): scala.Boolean = js.native
  /** Gets the search input placeholder text */
  def get_currentPrompt(): java.lang.String = js.native
  /** Returns the current search term */
  def get_currentTerm(): java.lang.String = js.native
  def get_initialPrompt(): java.lang.String = js.native
  def get_maintainQueryState(): scala.Boolean = js.native
  def get_msBeforeShowingProgress(): scala.Double = js.native
  def get_navigationButtonId(): java.lang.String = js.native
  def get_navigationListId(): java.lang.String = js.native
  def get_navigationNodes(): js.Any = js.native
  def get_pageTitlePrefix(): java.lang.String = js.native
  def get_personalResultCount(): scala.Double = js.native
  /** Gets the css class/classes of the placeholder text. Default is 'ms-srch-sb-prompt ms-helperText' */
  def get_promptCssClass(): java.lang.String = js.native
  def get_queryGroupNames(): js.Array[java.lang.String] = js.native
  /** Gets the interval in milliseconds, if user is idle during this interval, suggestions retrieval will be initiated.
           * Default value is 250.
           */
  def get_querySuggestionCompletionInterval(): scala.Double = js.native
  /** Gets number of suggestions to display. Default is 5. */
  def get_querySuggestionCount(): scala.Double = js.native
  /** Gets minimum length of the search term for suggestions to be retrieved. Default is 2 letters. */
  def get_querySuggestionMinimumPrefixLength(): scala.Double = js.native
  def get_querySuggestionsSourceID(): java.lang.String = js.native
  /** Gets the results page address, e.g. '~site/_layouts/15/osssearchresults.aspx?u={contexturl}' */
  def get_resultsPageAddress(): java.lang.String = js.native
  def get_searchBoxContainerElement(): stdLib.Element = js.native
  def get_searchBoxContainerId(): java.lang.String = js.native
  def get_searchBoxInputElement(): stdLib.Element = js.native
  /** Gets the id of the search box input element */
  def get_searchBoxInputId(): java.lang.String = js.native
  def get_searchBoxLinkElement(): stdLib.Element = js.native
  def get_searchBoxLinkId(): java.lang.String = js.native
  def get_searchBoxProgressClass(): java.lang.String = js.native
  def get_serverInitialRender(): scala.Boolean = js.native
  def get_setFocusOnPageLoad(): scala.Boolean = js.native
  def get_showAdvancedLink(): scala.Boolean = js.native
  def get_showNavigation(): scala.Boolean = js.native
  def get_showPeopleNameSuggestions(): scala.Boolean = js.native
  def get_showPreferencesLink(): scala.Boolean = js.native
  def get_showQuerySuggestions(): scala.Boolean = js.native
  def get_suggestionsListId(): java.lang.String = js.native
  def get_tryInplaceQuery(): scala.Boolean = js.native
  def get_updatePageTitle(): scala.Boolean = js.native
  def hidePrompt(): scala.Unit = js.native
  def raiseBatchQueryIssuingEvent(arg: js.Any): scala.Unit = js.native
  def raiseBatchResultReadyEvent(arg: js.Any): scala.Unit = js.native
  def raiseQueryReadyEvent(arg: js.Any): scala.Unit = js.native
  def remove_batchQueryIssuing(value: js.Any): scala.Unit = js.native
  def remove_batchResultReady(value: js.Any): scala.Unit = js.native
  def remove_queryReady(value: js.Any): scala.Unit = js.native
  def search(term: java.lang.String): scala.Unit = js.native
  def setBorder(focused: scala.Boolean): scala.Unit = js.native
  def set_advancedSearchPageAddress(value: java.lang.String): java.lang.String = js.native
  def set_allowEmptySearch(value: scala.Boolean): scala.Boolean = js.native
  /** Sets the search input placeholder text */
  def set_currentPrompt(value: java.lang.String): java.lang.String = js.native
  /** Sets the current search term.
            * Does not update results or even re-render control automatically, only sets the value.
            * You can call .renderControl() method to re-render control.
            */
  def set_currentTerm(value: java.lang.String): java.lang.String = js.native
  def set_initialPrompt(value: java.lang.String): java.lang.String = js.native
  def set_maintainQueryState(value: scala.Boolean): scala.Boolean = js.native
  def set_msBeforeShowingProgress(value: scala.Double): scala.Double = js.native
  def set_navigationButtonId(value: java.lang.String): java.lang.String = js.native
  def set_navigationListId(value: java.lang.String): java.lang.String = js.native
  def set_navigationNodes(value: js.Any): js.Any = js.native
  def set_pageTitlePrefix(value: java.lang.String): java.lang.String = js.native
  def set_personalResultCount(value: scala.Double): scala.Double = js.native
  /** Sets the css class/classes of the placeholder text. Default is 'ms-srch-sb-prompt ms-helperText' */
  def set_promptCssClass(value: java.lang.String): java.lang.String = js.native
  def set_queryGroupNames(value: js.Any): js.Array[java.lang.String] = js.native
  /** Sets the interval in milliseconds, if user is idle during this interval, suggestions retrieval will be initiated.
           * Default value is 250.
           */
  def set_querySuggestionCompletionInterval(value: scala.Double): scala.Double = js.native
  /** Sets number of suggestions to display. Default is 5. */
  def set_querySuggestionCount(value: scala.Double): scala.Double = js.native
  /** Sets minimum length of the search term for suggestions to be retrieved. Default is 2 letters. */
  def set_querySuggestionMinimumPrefixLength(value: scala.Double): scala.Double = js.native
  def set_querySuggestionsSourceID(value: java.lang.String): java.lang.String = js.native
  /** Sets the results page address, e.g. '~site/_layouts/15/osssearchresults.aspx?u={contexturl}'
            * Parameter u is used for setting the url filter for the search, so that only results within
            * e.g. specified site are returned. Omit this parameter if you want to search everywhere.
            */
  def set_resultsPageAddress(value: java.lang.String): java.lang.String = js.native
  def set_searchBoxContainerId(value: java.lang.String): java.lang.String = js.native
  /** Sets the id of the search box input element */
  def set_searchBoxInputId(value: java.lang.String): java.lang.String = js.native
  def set_searchBoxLinkId(value: java.lang.String): java.lang.String = js.native
  def set_searchBoxProgressClass(value: java.lang.String): java.lang.String = js.native
  def set_serverInitialRender(value: scala.Boolean): scala.Boolean = js.native
  def set_setFocusOnPageLoad(value: scala.Boolean): scala.Boolean = js.native
  def set_showAdvancedLink(value: scala.Boolean): scala.Boolean = js.native
  def set_showNavigation(value: scala.Boolean): scala.Boolean = js.native
  def set_showPeopleNameSuggestions(value: scala.Boolean): scala.Boolean = js.native
  def set_showPreferencesLink(value: scala.Boolean): scala.Boolean = js.native
  def set_showQuerySuggestions(value: scala.Boolean): scala.Boolean = js.native
  def set_suggestionsListId(value: java.lang.String): java.lang.String = js.native
  def set_tryInplaceQuery(value: scala.Boolean): scala.Boolean = js.native
  def set_updatePageTitle(value: scala.Boolean): scala.Boolean = js.native
  def showPrompt(): scala.Unit = js.native
}

