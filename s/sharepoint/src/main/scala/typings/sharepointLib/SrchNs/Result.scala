package typings
package sharepointLib.SrchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Srch.Result")
@js.native
class Result protected () extends DisplayControl {
  def this(elem: stdLib.Element) = this()
  def changeQueryLanguage(queryLanguage: scala.Double): scala.Unit = js.native
  def changeQueryTerm(queryTerm: js.Any): scala.Unit = js.native
  def get_advancedUrl(): java.lang.String = js.native
  def get_currentPageNumber(): scala.Double = js.native
  def get_groupTemplateId(): java.lang.String = js.native
  def get_itemBodyTemplateId(): java.lang.String = js.native
  def get_itemTemplateId(): java.lang.String = js.native
  def get_maxPagesAfterCurrent(): scala.Double = js.native
  def get_maxPagesBeforeCurrent(): scala.Double = js.native
  def get_pagingInfo(): js.Any = js.native
  def get_preloadedItemTemplateIds(): js.Array[java.lang.String] = js.native
  def get_repositionLanguageDropDown(): scala.Boolean = js.native
  def get_scrollToTopOnRedraw(): scala.Boolean = js.native
  def get_showAdvancedLink(): scala.Boolean = js.native
  def get_showAlertMe(): scala.Boolean = js.native
  def get_showBestBets(): scala.Boolean = js.native
  def get_showDefinitions(): scala.Boolean = js.native
  def get_showDidYouMean(): scala.Boolean = js.native
  def get_showLanguageOptions(): scala.Boolean = js.native
  def get_showPaging(): scala.Boolean = js.native
  def get_showPersonalFavorites(): scala.Boolean = js.native
  def get_showPreferencesLink(): scala.Boolean = js.native
  def get_showResultCount(): scala.Boolean = js.native
  def get_showResults(): scala.Boolean = js.native
  def get_showSortOptions(): scala.Boolean = js.native
  def get_showUpScopeMessage(): scala.Boolean = js.native
  def get_showViewDuplicates(): scala.Boolean = js.native
  def get_useSimplifiedQueryBuilder(): scala.Boolean = js.native
  def page(startAt: scala.Double): scala.Unit = js.native
  def processResultReady(
    resultTableCollection: sharepointLib.MicrosoftNs.SharePointNs.ClientNs.SearchNs.QueryNs.ResultTableCollection
  ): scala.Unit = js.native
  def set_advancedUrl(value: java.lang.String): java.lang.String = js.native
  def set_currentPageNumber(value: scala.Double): scala.Double = js.native
  def set_groupTemplateId(value: java.lang.String): java.lang.String = js.native
  def set_itemBodyTemplateId(value: java.lang.String): java.lang.String = js.native
  def set_itemTemplateId(value: java.lang.String): java.lang.String = js.native
  def set_maxPagesAfterCurrent(value: scala.Double): scala.Double = js.native
  def set_maxPagesBeforeCurrent(value: scala.Double): scala.Double = js.native
  def set_preloadedItemTemplateIds(value: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
  def set_repositionLanguageDropDown(value: scala.Boolean): scala.Boolean = js.native
  def set_scrollToTopOnRedraw(value: scala.Boolean): scala.Boolean = js.native
  def set_showAdvancedLink(value: scala.Boolean): scala.Boolean = js.native
  def set_showAlertMe(value: scala.Boolean): scala.Boolean = js.native
  def set_showBestBets(value: scala.Boolean): scala.Boolean = js.native
  def set_showDefinitions(value: scala.Boolean): scala.Boolean = js.native
  def set_showDidYouMean(value: scala.Boolean): scala.Boolean = js.native
  def set_showLanguageOptions(value: scala.Boolean): scala.Boolean = js.native
  def set_showPaging(value: scala.Boolean): scala.Boolean = js.native
  def set_showPersonalFavorites(value: scala.Boolean): scala.Boolean = js.native
  def set_showPreferencesLink(value: scala.Boolean): scala.Boolean = js.native
  def set_showResultCount(value: scala.Boolean): scala.Boolean = js.native
  def set_showResults(value: scala.Boolean): scala.Boolean = js.native
  def set_showSortOptions(value: scala.Boolean): scala.Boolean = js.native
  def set_showUpScopeMessage(value: scala.Boolean): scala.Boolean = js.native
  def set_showViewDuplicates(value: scala.Boolean): scala.Boolean = js.native
  def set_useSimplifiedQueryBuilder(value: scala.Boolean): scala.Boolean = js.native
  /** Returns true if the specified table has results and is enabled to be shown by this control */
  def shouldShowTable(resultTable: sharepointLib.MicrosoftNs.SharePointNs.ClientNs.SearchNs.QueryNs.ResultTable): scala.Boolean = js.native
  def sort(sortName: java.lang.String): scala.Unit = js.native
  def sortOrRank(sortRankName: java.lang.String): scala.Unit = js.native
  def viewDuplicates(docId: scala.Double): scala.Unit = js.native
}

@JSGlobal("Srch.Result")
@js.native
object Result extends js.Object {
  def getSelectedPropertiesFromMappingDictionary(propMappings: js.Any): js.Array[_] = js.native
  def parsePropertyMappingWithSlotDisplayNames(mappings: js.Any): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  def parsePropertyMappingsString(mappings: js.Any): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
}

