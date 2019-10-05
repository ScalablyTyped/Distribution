package typings.sharepoint.Srch

import org.scalablytyped.runtime.StringDictionary
import typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.ResultTable
import typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.ResultTableCollection
import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Srch.Result")
@js.native
class Result protected () extends DisplayControl {
  def this(elem: Element) = this()
  def activate(
    prompt: String,
    searchBoxId: String,
    searchBoxDivId: String,
    navButtonId: String,
    suggestionsListId: String,
    navListId: String,
    searchBoxLinkId: String,
    searchBoxProgressClass: String,
    searchBoxPromptClass: String
  ): Unit = js.native
  def changeQueryLanguage(queryLanguage: Double): Unit = js.native
  def changeQueryTerm(queryTerm: js.Any): Unit = js.native
  def get_advancedSearchPageAddress(): String = js.native
  def get_advancedUrl(): String = js.native
  def get_currentPageNumber(): Double = js.native
  def get_currentTerm(): String = js.native
  def get_emptyRefinementMessageId(): String = js.native
  def get_groupTemplateId(): String = js.native
  def get_initialPrompt(): String = js.native
  def get_itemBodyTemplateId(): String = js.native
  def get_itemTemplateId(): String = js.native
  def get_maxPagesAfterCurrent(): Double = js.native
  def get_maxPagesBeforeCurrent(): Double = js.native
  def get_pagingInfo(): js.Any = js.native
  def get_preloadedItemTemplateIds(): js.Array[String] = js.native
  def get_repositionLanguageDropDown(): Boolean = js.native
  def get_scrollToTopOnRedraw(): Boolean = js.native
  def get_selectedRefinementControls(): js.Array[CSRRefinementControl] = js.native
  def get_showAdvancedLink(): Boolean = js.native
  def get_showAlertMe(): Boolean = js.native
  def get_showBestBets(): Boolean = js.native
  def get_showDefinitions(): Boolean = js.native
  def get_showDidYouMean(): Boolean = js.native
  def get_showLanguageOptions(): Boolean = js.native
  def get_showNavigation(): Boolean = js.native
  def get_showPaging(): Boolean = js.native
  def get_showPersonalFavorites(): Boolean = js.native
  def get_showPreferencesLink(): Boolean = js.native
  def get_showQuerySuggestions(): Boolean = js.native
  def get_showResultCount(): Boolean = js.native
  def get_showResults(): Boolean = js.native
  def get_showSortOptions(): Boolean = js.native
  def get_showUpScopeMessage(): Boolean = js.native
  def get_showViewDuplicates(): Boolean = js.native
  def get_useSimplifiedQueryBuilder(): Boolean = js.native
  def handleClickOnCategoryLink(id: String): Unit = js.native
  def page(startAt: Double): Unit = js.native
  def processResultReady(resultTableCollection: ResultTableCollection): Unit = js.native
  def setAriaCollapsed(element: HTMLElement): Unit = js.native
  def set_advancedUrl(value: String): String = js.native
  def set_currentPageNumber(value: Double): Double = js.native
  def set_groupTemplateId(value: String): String = js.native
  def set_itemBodyTemplateId(value: String): String = js.native
  def set_itemTemplateId(value: String): String = js.native
  def set_maxPagesAfterCurrent(value: Double): Double = js.native
  def set_maxPagesBeforeCurrent(value: Double): Double = js.native
  def set_preloadedItemTemplateIds(value: js.Array[String]): js.Array[String] = js.native
  def set_repositionLanguageDropDown(value: Boolean): Boolean = js.native
  def set_scrollToTopOnRedraw(value: Boolean): Boolean = js.native
  def set_showAdvancedLink(value: Boolean): Boolean = js.native
  def set_showAlertMe(value: Boolean): Boolean = js.native
  def set_showBestBets(value: Boolean): Boolean = js.native
  def set_showDefinitions(value: Boolean): Boolean = js.native
  def set_showDidYouMean(value: Boolean): Boolean = js.native
  def set_showLanguageOptions(value: Boolean): Boolean = js.native
  def set_showPaging(value: Boolean): Boolean = js.native
  def set_showPersonalFavorites(value: Boolean): Boolean = js.native
  def set_showPreferencesLink(value: Boolean): Boolean = js.native
  def set_showResultCount(value: Boolean): Boolean = js.native
  def set_showResults(value: Boolean): Boolean = js.native
  def set_showSortOptions(value: Boolean): Boolean = js.native
  def set_showUpScopeMessage(value: Boolean): Boolean = js.native
  def set_showViewDuplicates(value: Boolean): Boolean = js.native
  def set_useSimplifiedQueryBuilder(value: Boolean): Boolean = js.native
  /** Returns true if the specified table has results and is enabled to be shown by this control */
  def shouldShowTable(resultTable: ResultTable): Boolean = js.native
  def sort(sortName: String): Unit = js.native
  def sortOrRank(sortRankName: String): Unit = js.native
  def viewDuplicates(docId: Double): Unit = js.native
}

/* static members */
@JSGlobal("Srch.Result")
@js.native
object Result extends js.Object {
  def getSelectedPropertiesFromMappingDictionary(propMappings: js.Any): js.Array[_] = js.native
  def parsePropertyMappingWithSlotDisplayNames(mappings: js.Any): StringDictionary[js.Any] = js.native
  def parsePropertyMappingsString(mappings: js.Any): StringDictionary[js.Any] = js.native
}

