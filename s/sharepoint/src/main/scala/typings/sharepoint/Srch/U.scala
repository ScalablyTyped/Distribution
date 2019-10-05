package typings.sharepoint.Srch

import org.scalablytyped.runtime.StringDictionary
import typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.ResultTable
import typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.ResultTableCollection
import typings.sharepoint.Srch.U.LoadScriptsProgress
import typings.sharepoint.sharepointStrings.Body
import typings.sharepoint.sharepointStrings.Group
import typings.sharepoint.sharepointStrings.IsFirstPinnedResultBlock
import typings.sharepoint.sharepointStrings.IsFirstRankedResultBlock
import typings.sharepoint.sharepointStrings.Item
import typings.sharepoint.sharepointStrings.ParentTableReference
import typings.sharepoint.sharepointStrings.Properties
import typings.sharepoint.sharepointStrings.QueryErrors
import typings.sharepoint.sharepointStrings.QueryId
import typings.sharepoint.sharepointStrings.QueryRuleId
import typings.sharepoint.sharepointStrings.RenderTemplateId
import typings.sharepoint.sharepointStrings.RenderTemplates
import typings.sharepoint.sharepointStrings.ResultRows
import typings.sharepoint.sharepointStrings.ResultTables
import typings.sharepoint.sharepointStrings.RowCount
import typings.sharepoint.sharepointStrings.TableType
import typings.sharepoint.sharepointStrings.TotalRows
import typings.sharepoint.sharepointStrings.TotalRowsIncludingDuplicates
import typings.sharepoint.sharepointStrings.View
import typings.sharepoint.sharepointStrings._deepLinks
import typings.sharepoint.sharepointStrings._discussions
import typings.sharepoint.sharepointStrings._group
import typings.sharepoint.sharepointStrings._groupContent
import typings.sharepoint.sharepointStrings._groupLink
import typings.sharepoint.sharepointStrings._groupTitle
import typings.sharepoint.sharepointStrings._hover
import typings.sharepoint.sharepointStrings._item
import typings.sharepoint.sharepointStrings._itemBody
import typings.sharepoint.sharepointStrings._itemIcon
import typings.sharepoint.sharepointStrings._itemPath
import typings.sharepoint.sharepointStrings._itemPreview
import typings.sharepoint.sharepointStrings._itemSummary
import typings.sharepoint.sharepointStrings._itemTitle
import typings.sharepoint.sharepointStrings._itemTitleLink
import typings.sharepoint.sharepointStrings._likes
import typings.sharepoint.sharepointStrings._members
import typings.sharepoint.sharepointStrings._postInfo
import typings.sharepoint.sharepointStrings._replies
import typings.sharepoint.sharepointStrings._visualBestBet
import typings.std.Date
import typings.std.Element
import typings.std.Event
import typings.std.XMLDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Srch.U")
@js.native
class U () extends js.Object

/* static members */
@JSGlobal("Srch.U")
@js.native
object U extends js.Object {
  @js.native
  class Ids () extends js.Object
  
  @js.native
  sealed trait LoadScriptsProgress extends js.Object
  
  @js.native
  class LoadScriptsState () extends js.Object {
    var progress: Double = js.native
    var scriptsToLoad: js.Any = js.native
    var timeoutHandle: js.Any = js.native
  }
  
  @js.native
  class PropNames () extends js.Object
  
  var contentFixedWidthLength: Double = js.native
  var hitHighlightingCloseTag: String = js.native
  var hitHighlightingOpenTag: String = js.native
  var maximumSocialMetadataValue: Double = js.native
  var pathTruncationLength: Double = js.native
  var pathTruncationLengthWithMetadata: Double = js.native
  var pathTruncationLengthWithPreview: Double = js.native
  var personaControlRenderedThreshold: Double = js.native
  var summaryTruncationLength: Double = js.native
  var summaryTruncationLengthWithPreview: Double = js.native
  var titleTruncationLength: Double = js.native
  var titleTruncationLengthWithMetadata: Double = js.native
  var titleTruncationLengthWithPreview: Double = js.native
  /** Same as $addHandler with safety checks */
  def addHandler(
    element: Element,
    eventName: String,
    handler: js.Function2[/* instance */ js.Any, /* eventArgs */ js.Any, Unit]
  ): Unit = js.native
  def addRenderContextCallback(
    renderCtx: js.Any,
    callbackType: js.Any,
    callbackFunction: js.Any,
    enforceUnique: js.Any,
    templateFunction: js.Any
  ): Unit = js.native
  /** Uses SPAnimation to animate an element */
  def animate(element: Element, animationID: js.Any, finishFunc: js.Any): Unit = js.native
  def animateResults(result: Result, userAction: js.Any): Unit = js.native
  /** Safely pushes item to array (does nothing if the array is null or undefined) */
  def appendArray(array: js.Array[_], item: js.Any): Unit = js.native
  def appendScriptsToLoad(scripts: js.Array[String], script: String): Unit = js.native
  /** Appends specified parameter key and value string to the specified URL */
  def appendUrlParameter(url: String, keyAndValue: String): String = js.native
  /** Prevents default event action and stops further propagation of the event in the DOM */
  def cancelEvent(e: Event): Unit = js.native
  /** Prevents default event action or/and stops further propagation of the event in the DOM */
  def cancelEventEx(e: Event, preventDefault: Boolean, stopPropagation: Boolean): Unit = js.native
  /** Returns HTML for collapsible refiner title */
  def collapsibleRefinerTitle(
    propertyName: String,
    idPrefix: String,
    title: String,
    iconClass: String,
    customOnClick: String,
    isExpanded: String
  ): String = js.native
  def collapsibleRefinerTitle(
    propertyName: String,
    idPrefix: String,
    title: String,
    iconClass: String,
    customOnClick: Null,
    isExpanded: String
  ): String = js.native
  /** Concatenates two URL fragments and returns resulting URL */
  def concatUrl(firstPart: String, secondPart: String): String = js.native
  /** Returns copy of the passed source dictionary */
  def copyDictionary(source: StringDictionary[js.Any]): StringDictionary[js.Any] = js.native
  /** Copies the specified string to clipboard, if possible */
  def copyLink(link: String): Unit = js.native
  def createBehavior(id: String, `type`: js.Any, properties: js.Any, targetElementId: String): js.Any = js.native
  def createErrorObjectWithExecContext(messageText: js.Any, operationName: js.Any, templateFuncOrRenderCtx: js.Any): js.Any = js.native
  def createFileIconAltText(container: Boolean, b: js.Any): String = js.native
  def createXMLDocument(xml: String): XMLDocument = js.native
  /** Returns true if the value parameter is null or empty string */
  def e(value: String): Boolean = js.native
  /** Ensures that the given URL protocol value is allowed. Returns the specified URL value if the protocol is allowed; empty string otherwise. */
  def ensureAllowedProtocol(value: String): String = js.native
  /** Adds the specified CSS class to element (if not there already) */
  def ensureCSSClassNameExist(e: Element, className: String): Unit = js.native
  /** Removes the specified CSS class from the element */
  def ensureCSSClassNameNotExist(e: Element, className: String): Unit = js.native
  /** Ensures that the given value is not null, undefined or empty; throws an exception otherwise. */
  def ensureNotNullOrEmptyString(value: String, context: js.Any, methodName: String, paraName: String): Unit = js.native
  /** Ensures that the given value is not null or undefined; throws an exception otherwise. */
  def ensureNotNullOrUndefined(value: js.Any, context: js.Any, methodName: String, paraName: String): Unit = js.native
  def extractReplyTitleFromSummary(hitHighlightedSummary: String, titleLength: Double): String = js.native
  def fillKeywordQuery(query: js.Any, dp: js.Any): Unit = js.native
  def findResultObjectFromDOM(e: Element, `type`: String): js.Any = js.native
  /** Parses SharePoint array field value and returns array of strings */
  def getArray(value: String): js.Array[String] = js.native
  /** Gets calendar type according to the current regional settings */
  def getCalendarType(): js.Any = js.native
  /** Returns the ClientControl associated with specified DOM element */
  def getClientComponent(e: Element): ClientControl = js.native
  /** Gets cookie by name */
  def getCookie(name: String): String = js.native
  def getDeepLinks(deeplinks: String, maxRows: Double): String = js.native
  /** Parses user display name out from SharePoint user field value */
  def getDisplayNameFromAuthorField(authorField: String): String = js.native
  /** Safely gets field of an object (returns null if object is null or undefined) */
  def getFieldOnObject(targetObject: js.Any, fieldName: String): js.Any = js.native
  /** Returns URL to the folder.gif image */
  def getFolderIconUrl(): String = js.native
  /** Returns formatted time string from seconds string, which contains a number that represents amount of seconds passed since 00:00:00 today */
  def getFormattedTimeFromSeconds(secondsStr: String): String = js.native
  /** Converts file extension to a more friendly representation, e.g. 'doc' => 'file_Word' */
  def getFriendlyNameForFileExtension(fileExtension: String): String = js.native
  /** Returns human-friendly representation of the datetime value, e.g. "A few seconds ago"" */
  def getFriendlyTimeInterval(dateTimeSince: Date, calendarType: Double): String = js.native
  /** Returns string that contains safe call to HP.Hide */
  def getHideHoverPanelCallback(): String = js.native
  def getHighlightedProperty(key: String, result: js.Any, property: String): js.Any = js.native
  /** Returns the hostname of current page */
  def getHostName(): String = js.native
  /** Returns URL to the html16.png image */
  def getIconUrl(): String = js.native
  /** Returns URL of the appropriate file image based on the file type identifier (see getFriendlyNameForFileExtension) */
  def getIconUrlByFileExtension(item: String): String = js.native
  def getIconUrlByFileExtension(item: String, defaultIconPath: String): String = js.native
  def getImageSourceWithRendition(imageInfo: js.Any, width: Double, height: Double): String = js.native
  def getMultipleHHXMLNodeValues(xmlDoc: XMLDocument, nodeName: String, numItems: Double, rawDelimiter: String): String = js.native
  /** Safely gets field of an object or creates it if it is null or undefined */
  def getOrCreateFieldOnObject(targetObject: js.Any, fieldName: String, defaultValue: js.Any): js.Any = js.native
  /** Returns specified by attributeName attribute of startingElement or of it's closest parent who has it */
  def getParentAttributeByName(startingElement: Element, attributeName: String): String = js.native
  /** Returns the closest to startingElement parent of the specified tag name */
  def getParentElementByName(startingElement: Element, tagName: String): Element = js.native
  /** Returns display template registered (can be either string or function) */
  def getRenderTemplateByName(name: String, renderCtx: js.Any): String | RenderFunction = js.native
  def getResultObject(id: String): js.Any = js.native
  /** Returns string that contains safe call to HP.Show, passing over the itemId, hpContainerId and templateUrl parameters, and supplying false for wide parameter. */
  def getShowHoverPanelCallback(itemId: String, hpContainerId: String, templateUrl: String): String = js.native
  /** Returns string that contains safe call to HP.Show, passing over the itemId, hpContainerId and templateUrl parameters, and supplying true for wide parameter. */
  def getShowHoverPanelCallbackWide(itemId: String, hpContainerId: String, templateUrl: String): String = js.native
  def getSingleHHXMLNodeValue(xmlDoc: XMLDocument, nodeName: String): String = js.native
  /** Safely gets field of an object (returns empty string instead of null as "getFieldOnObject") */
  def getStringFieldOnObject(targetObject: js.Any, fieldName: String): String = js.native
  def getTableOfType(tableCollection: ResultTableCollection, tableTypeName: String): ResultTable = js.native
  /** Gets a value from 'Properties' field object of the specified parent object */
  def getTableProperty(parent: js.Any, propName: String): js.Any = js.native
  /** Gets the URL of template based on display template function or the rendering context */
  def getTemplateUrlFromFunctionOrRenderCtx(templateFunctionOrRenderCtx: js.Any): String = js.native
  def getTrimmedProcessedHHXMLString(value: String, cutOff: Double): String = js.native
  def getTrimmedString(value: String, cutOff: Double): String = js.native
  def getUnEncodedMultiValuedResults(multiValue: String, maxItems: Double, rawDelimiter: String): String = js.native
  /** Parses username out from SharePoint user field value */
  def getUsernameFromAuthorField(authorField: String): String = js.native
  def getVideoImageWithFallbackSource(valueObject: js.Any, width: Double, height: Double): String = js.native
  /** Returns the #s4-workspace element or if not found, then the fallback element */
  def getWorkspace(fallback: Element): Element = js.native
  def hideElement(element: Element): Unit = js.native
  def htmlEncodeNonBase64ImageUrl(url: String): String = js.native
  def includeCSS(templateLink: String, relativeLink: String): Unit = js.native
  def includeLanguageScript(templateLink: String, scriptLink: String): Unit = js.native
  def includeScript(templateLink: String, scriptLink: String): Unit = js.native
  /** Returns true if the obj parameter is array */
  def isArray(obj: js.Any): Boolean = js.native
  /** Returns true if specified by logoUrl image is one of default site logos */
  def isDefaultSiteLogo(logoUrl: String): Boolean = js.native
  /** Returns true if current page is osssearchresults.aspx */
  def isDefaultSiteSearchPage(): Boolean = js.native
  /** Returns true if the specified element is a descendant of the container element */
  def isDescendant(element: Element, container: Element): Boolean = js.native
  /** Returns true if the keyCode is \n or \r */
  def isEnterKey(keyCode: js.Any): Boolean = js.native
  def isFirstPromotedBlock(resultTable: ResultTable): Boolean = js.native
  def isFirstRankedBlock(resultTable: ResultTable): Boolean = js.native
  /** Returns true if the specified item is found in the specified array (uses '===' for comparing) */
  def isInArray(array: js.Array[_], item: js.Any): Boolean = js.native
  def isIntentTable(resultTable: ResultTable): Boolean = js.native
  /** Returns true if current page is in edit mode */
  def isPageInEditMode(): Boolean = js.native
  /** Returns true if current page is displayed in the Minimal Download Strategy (MDS) mode */
  def isPageInMdsMode(): Boolean = js.native
  def isPagePartialLoad(): Boolean = js.native
  /** Returns true if the obj parameter is null, undefined, number or string */
  def isPrimitive(obj: js.Any): Boolean = js.native
  /** Indicates whether the specified protocol is allowed. */
  def isProtocolAllowed(value: String, allowRelativeUrl: Boolean): Boolean = js.native
  /** Returns true if the current page uses right-to-left mode (RTL) */
  def isRTL(): Boolean = js.native
  def isSPFSKU(): Boolean = js.native
  /** Returns true if the specified URL belongs to the specified host name */
  def isSameHost(url: String, hostName: String): Boolean = js.native
  def isSubstrateTable(resultTable: js.Any): Boolean = js.native
  def isTableTypeof(resultTable: js.Any, tableTypeName: String): Boolean = js.native
  /** Returns true if the URL is a relative URL, but not a server-relative URL */
  def isUrlPagelRelative(url: String): Boolean = js.native
  /** Returns true if the URL is a relative URL */
  def isUrlRelative(url: String): Boolean = js.native
  /** Returns true if the URL is a server-relative URL (i.e. starts with '/') */
  def isUrlServerRelative(url: String): Boolean = js.native
  /** Returns true if the fileExtension belongs to a webpage, e.g. 'ascx', 'aspx', 'html', 'php', etc.  */
  def isWebPage(fileExtension: String): Boolean = js.native
  /** Retrieves localized string with the specified id */
  def loadResource(id: String): String = js.native
  /** Retrieves localized string with the specified id */
  def loadResourceForTemplate(id: String, templateFunc: js.Function1[/* ctx */ js.Any, String]): String = js.native
  def loadScripts(scriptReferences: js.Array[String], success: js.Any, failure: js.Any, timeout: Double): Unit = js.native
  def logClick(e: js.Any, clickType: js.Any): Unit = js.native
  def logRenderingErrorMessageToContext(renderCtx: js.Any, messageText: js.Any, operationName: js.Any): Unit = js.native
  def modifyMediaDurationRefinementName(resultRow: js.Any): Unit = js.native
  /** Returns true if the value parameter is null or undefined */
  def n(value: js.Any): Boolean = js.native
  def parseTypedRangeToken(rangeFilterToken: String, objToStoreFilterTokenType: js.Any): js.Any = js.native
  def positionElement(element: Element, offset: String): Unit = js.native
  def processHHXML(pre: String): String = js.native
  def registerLoadedScripts(scripts: js.Array[String]): Unit = js.native
  /** Registers display template function in the system.
    *  @param name Identifier of the template. Usually template is registered twice: by URL and by name.
    *  @param template The display template. It can be either string, or function, that gets the CSR context object and returns HTML string
    */
  def registerRenderTemplateByName(name: String, templateFunction: String): Unit = js.native
  def registerRenderTemplateByName(name: String, templateFunction: RenderFunction): Unit = js.native
  /** Registers in system resources defined by the dictionary object */
  def registerResourceDictionary(locale: String, dict: StringDictionary[String]): Unit = js.native
  /** Removes the specified item from the specified array and returns array that has the deleted item */
  def removeArray(array: js.Array[_], item: js.Any): js.Array[_] = js.native
  /** Same as $removeHandler with safety checks */
  def removeHandler(
    element: Element,
    eventName: String,
    handler: js.Function2[/* instance */ js.Any, /* eventArgs */ js.Any, Unit]
  ): Unit = js.native
  /** Renders datetime value in friendly format into element specified by targetElementID */
  def renderFriendlyTimeIntervalString(dateTimeSinceUTC: Date, targetElementID: String): Unit = js.native
  def renderFriendlyTimeIntervalString(dateTimeSinceUTC: Date, targetElementID: String, calendarType: Double): Unit = js.native
  /** Replaces tokens {searchcenterurl}, {contexturl}, {resultsurl}, {defaultpageslistname}, {Locale} and others, and converts URL to server-relative */
  def replaceUrlTokens(url: String): String = js.native
  def resetElement(element: Element): Unit = js.native
  @JSName("resolveRenderTemplate")
  def resolveRenderTemplate_Body(renderCtx: js.Any, component: ClientControl, level: Body): String | RenderFunction = js.native
  @JSName("resolveRenderTemplate")
  def resolveRenderTemplate_Group(renderCtx: js.Any, component: ClientControl, level: Group): String | RenderFunction = js.native
  /** Returns the CSR template that was previously registered using 'registerRenderTemplateByName' based on CSR template level */
  @JSName("resolveRenderTemplate")
  def resolveRenderTemplate_Item(renderCtx: js.Any, component: ClientControl, level: Item): String | RenderFunction = js.native
  @JSName("resolveRenderTemplate")
  def resolveRenderTemplate_View(renderCtx: js.Any, component: ClientControl, level: View): String | RenderFunction = js.native
  def restorePath(el: Element, originalText: String, selectText: String): Unit = js.native
  def restoreText(el: Element, originalText: String, selectText: String): Unit = js.native
  def selectPath(text: String, el: Element): Unit = js.native
  def selectText(text: String, el: Element): Unit = js.native
  /** Adds cookie with specified parameters */
  def setCookie(name: String, value: String): Unit = js.native
  def setCookie(name: String, value: String, expires: Date): Unit = js.native
  def setCookie(name: String, value: String, expires: Date, domain: String): Unit = js.native
  def setCookie(name: String, value: String, expires: Date, domain: String, path: String): Unit = js.native
  /** Safely sets field of an object (does nothing if either object or fieldName is null/empty); returns true if value was set */
  def setFieldOnObject(targetObject: js.Any, fieldName: String, fieldValue: js.Any): Boolean = js.native
  def setItemRenderWrapper(renderCtx: js.Any, itemRenderWrapperFunction: js.Any, templateFunction: js.Any): js.Any = js.native
  def setPath(e: Event, el: Element, text: String, originalText: String): Unit = js.native
  def setResultObject(id: String, resultObject: js.Any): js.Any = js.native
  def shouldAnimate(dp: js.Any): Boolean = js.native
  def showElement(element: Element): Unit = js.native
  /** Returns human-readable size in kilobytes/megabytes etc. (the captions are localized) */
  def toFileSizeDisplay(numberOfBytes: Double, showDecimalPart: Boolean): String = js.native
  /** Returns formatted date */
  def toFormattedDate(dateValue: Date): String = js.native
  def toFormattedDate(dateValue: Date, dateTimeFormatId: String): String = js.native
  /** Returns formatted number */
  def toFormattedNumber(num: Double, defaultDecimalPlacesIfNotInt: Double): String = js.native
  /** If number is more than 1000, rounds up three last digits, e.g. 72389 => '72,000+'. If number is more than 100000, returns '100,000+' */
  def toFriendlyNumber(num: Double): String = js.native
  def trace(c: ClientControl, method: String, message: String): Unit = js.native
  def traceFormatted(c: ClientControl, method: String, format: String, values: String*): Unit = js.native
  /** Removes trailing spaces and also replaces double spaces inside string to single spaces */
  def trimExtraSpaces(value: String): String = js.native
  def trimTitle(title: String, maximumLengthInChars: Double, numberOfTermsToUse: Double): String = js.native
  /** Truncates the string to specified maximum allowed amount of characters (if max amount is not exceeded - does nothing) */
  def truncateEnd(original: String, maxChars: Double): String = js.native
  def truncateHighlightedUrl(url: String, maxChars: Double): String = js.native
  def truncateUrl(url: String, maxChars: Double): String = js.native
  /** Adds ctag parameter to the URL and replaces URL tokens */
  def urlTokenExpansion(jsLink: String): String = js.native
  /** Returns true if the value parameter is empty string */
  def w(value: js.Any): Boolean = js.native
  /* static members */
  @js.native
  object Ids extends js.Object {
    var body: _itemBody = js.native
    var deepLinks: _deepLinks = js.native
    var discussions: _discussions = js.native
    var group: _group = js.native
    var groupContent: _groupContent = js.native
    var groupLink: _groupLink = js.native
    var groupTitle: _groupTitle = js.native
    var hover: _hover = js.native
    var icon: _itemIcon = js.native
    var item: _item = js.native
    var likes: _likes = js.native
    var members: _members = js.native
    var path: _itemPath = js.native
    var postInfo: _postInfo = js.native
    var preview: _itemPreview = js.native
    var replies: _replies = js.native
    var summary: _itemSummary = js.native
    var title: _itemTitle = js.native
    var titleLink: _itemTitleLink = js.native
    var visualBestBet: _visualBestBet = js.native
  }
  
  @js.native
  object LoadScriptsProgress extends js.Object {
    @js.native
    sealed trait failure extends LoadScriptsProgress
    
    @js.native
    sealed trait loading extends LoadScriptsProgress
    
    @js.native
    sealed trait success extends LoadScriptsProgress
    
    /* 2 */ val failure: typings.sharepoint.Srch.U.LoadScriptsProgress.failure with Double = js.native
    /* 0 */ val loading: typings.sharepoint.Srch.U.LoadScriptsProgress.loading with Double = js.native
    /* 1 */ val success: typings.sharepoint.Srch.U.LoadScriptsProgress.success with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[LoadScriptsProgress with Double] = js.native
  }
  
  /* static members */
  @js.native
  object PropNames extends js.Object {
    var isFirstPinnedBlock: IsFirstPinnedResultBlock = js.native
    var isFirstRankedBlock: IsFirstRankedResultBlock = js.native
    var parentTableReference: ParentTableReference = js.native
    var properties: Properties = js.native
    var queryErrors: QueryErrors = js.native
    var queryId: QueryId = js.native
    var queryRuleId: QueryRuleId = js.native
    var renderTemplateId: RenderTemplateId = js.native
    var renderTemplates: RenderTemplates = js.native
    var resultRows: ResultRows = js.native
    var resultTables: ResultTables = js.native
    var rowCount: RowCount = js.native
    var tableType: TableType = js.native
    var totalRows: TotalRows = js.native
    var totalRowsIncludingDuplicates: TotalRowsIncludingDuplicates = js.native
  }
  
}

