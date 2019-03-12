package typings
package sharepointLib.SrchNs

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
  var contentFixedWidthLength: scala.Double = js.native
  var hitHighlightingCloseTag: java.lang.String = js.native
  var hitHighlightingOpenTag: java.lang.String = js.native
  var maximumSocialMetadataValue: scala.Double = js.native
  var pathTruncationLength: scala.Double = js.native
  var pathTruncationLengthWithMetadata: scala.Double = js.native
  var pathTruncationLengthWithPreview: scala.Double = js.native
  var personaControlRenderedThreshold: scala.Double = js.native
  var summaryTruncationLength: scala.Double = js.native
  var summaryTruncationLengthWithPreview: scala.Double = js.native
  var titleTruncationLength: scala.Double = js.native
  var titleTruncationLengthWithMetadata: scala.Double = js.native
  var titleTruncationLengthWithPreview: scala.Double = js.native
  /** Same as $addHandler with safety checks */
  def addHandler(
    element: stdLib.Element,
    eventName: java.lang.String,
    handler: js.Function2[/* instance */ js.Any, /* eventArgs */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def addRenderContextCallback(
    renderCtx: js.Any,
    callbackType: js.Any,
    callbackFunction: js.Any,
    enforceUnique: js.Any,
    templateFunction: js.Any
  ): scala.Unit = js.native
  /** Uses SPAnimation to animate an element */
  def animate(element: stdLib.Element, animationID: js.Any, finishFunc: js.Any): scala.Unit = js.native
  def animateResults(result: sharepointLib.SrchNs.Result, userAction: js.Any): scala.Unit = js.native
  /** Safely pushes item to array (does nothing if the array is null or undefined) */
  def appendArray(array: js.Array[_], item: js.Any): scala.Unit = js.native
  def appendScriptsToLoad(scripts: js.Array[java.lang.String], script: java.lang.String): scala.Unit = js.native
  /** Appends specified parameter key and value string to the specified URL */
  def appendUrlParameter(url: java.lang.String, keyAndValue: java.lang.String): java.lang.String = js.native
  /** Prevents default event action and stops further propagation of the event in the DOM */
  def cancelEvent(e: stdLib.Event): scala.Unit = js.native
  /** Prevents default event action or/and stops further propagation of the event in the DOM */
  def cancelEventEx(e: stdLib.Event, preventDefault: scala.Boolean, stopPropagation: scala.Boolean): scala.Unit = js.native
  /** Returns HTML for collapsible refiner title */
  def collapsibleRefinerTitle(
    propertyName: java.lang.String,
    idPrefix: java.lang.String,
    title: java.lang.String,
    iconClass: java.lang.String,
    customOnClick: java.lang.String
  ): java.lang.String = js.native
  /** Concatenates two URL fragments and returns resulting URL */
  def concatUrl(firstPart: java.lang.String, secondPart: java.lang.String): java.lang.String = js.native
  /** Returns copy of the passed source dictionary */
  def copyDictionary(source: org.scalablytyped.runtime.StringDictionary[js.Any]): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  /** Copies the specified string to clipboard, if possible */
  def copyLink(link: java.lang.String): scala.Unit = js.native
  def createBehavior(id: java.lang.String, `type`: js.Any, properties: js.Any, targetElementId: java.lang.String): js.Any = js.native
  def createErrorObjectWithExecContext(messageText: js.Any, operationName: js.Any, templateFuncOrRenderCtx: js.Any): js.Any = js.native
  def createXMLDocument(xml: java.lang.String): stdLib.XMLDocument = js.native
  /** Returns true if the value parameter is null or empty string */
  def e(value: java.lang.String): scala.Boolean = js.native
  /** Ensures that the given URL protocol value is allowed. Returns the specified URL value if the protocol is allowed; empty string otherwise. */
  def ensureAllowedProtocol(value: java.lang.String): java.lang.String = js.native
  /** Adds the specified CSS class to element (if not there already) */
  def ensureCSSClassNameExist(e: stdLib.Element, className: java.lang.String): scala.Unit = js.native
  /** Removes the specified CSS class from the element */
  def ensureCSSClassNameNotExist(e: stdLib.Element, className: java.lang.String): scala.Unit = js.native
  /** Ensures that the given value is not null, undefined or empty; throws an exception otherwise. */
  def ensureNotNullOrEmptyString(value: java.lang.String, context: js.Any, methodName: java.lang.String, paraName: java.lang.String): scala.Unit = js.native
  /** Ensures that the given value is not null or undefined; throws an exception otherwise. */
  def ensureNotNullOrUndefined(value: js.Any, context: js.Any, methodName: java.lang.String, paraName: java.lang.String): scala.Unit = js.native
  def extractReplyTitleFromSummary(hitHighlightedSummary: java.lang.String, titleLength: scala.Double): java.lang.String = js.native
  def fillKeywordQuery(query: js.Any, dp: js.Any): scala.Unit = js.native
  def findResultObjectFromDOM(e: stdLib.Element, `type`: java.lang.String): js.Any = js.native
  /** Parses SharePoint array field value and returns array of strings */
  def getArray(value: java.lang.String): js.Array[java.lang.String] = js.native
  /** Gets calendar type according to the current regional settings */
  def getCalendarType(): js.Any = js.native
  /** Returns the ClientControl associated with specified DOM element */
  def getClientComponent(e: stdLib.Element): sharepointLib.SrchNs.ClientControl = js.native
  /** Gets cookie by name */
  def getCookie(name: java.lang.String): java.lang.String = js.native
  def getDeepLinks(deeplinks: java.lang.String, maxRows: scala.Double): java.lang.String = js.native
  /** Parses user display name out from SharePoint user field value */
  def getDisplayNameFromAuthorField(authorField: java.lang.String): java.lang.String = js.native
  /** Safely gets field of an object (returns null if object is null or undefined) */
  def getFieldOnObject(targetObject: js.Any, fieldName: java.lang.String): js.Any = js.native
  /** Returns URL to the folder.gif image */
  def getFolderIconUrl(): java.lang.String = js.native
  /** Returns formatted time string from seconds string, which contains a number that represents amount of seconds passed since 00:00:00 today */
  def getFormattedTimeFromSeconds(secondsStr: java.lang.String): java.lang.String = js.native
  /** Converts file extension to a more friendly representation, e.g. 'doc' => 'file_Word' */
  def getFriendlyNameForFileExtension(fileExtension: java.lang.String): java.lang.String = js.native
  /** Returns human-friendly representation of the datetime value, e.g. "A few seconds ago"" */
  def getFriendlyTimeInterval(dateTimeSince: stdLib.Date, calendarType: scala.Double): java.lang.String = js.native
  /** Returns string that contains safe call to HP.Hide */
  def getHideHoverPanelCallback(): java.lang.String = js.native
  def getHighlightedProperty(key: java.lang.String, result: js.Any, property: java.lang.String): js.Any = js.native
  /** Returns the hostname of current page */
  def getHostName(): java.lang.String = js.native
  /** Returns URL to the html16.png image */
  def getIconUrl(): java.lang.String = js.native
  /** Returns URL of the appropriate file image based on the file type identifier (see getFriendlyNameForFileExtension) */
  def getIconUrlByFileExtension(item: java.lang.String): java.lang.String = js.native
  def getIconUrlByFileExtension(item: java.lang.String, defaultIconPath: java.lang.String): java.lang.String = js.native
  def getImageSourceWithRendition(imageInfo: js.Any, width: scala.Double, height: scala.Double): java.lang.String = js.native
  def getMultipleHHXMLNodeValues(
    xmlDoc: stdLib.XMLDocument,
    nodeName: java.lang.String,
    numItems: scala.Double,
    rawDelimiter: java.lang.String
  ): java.lang.String = js.native
  /** Safely gets field of an object or creates it if it is null or undefined */
  def getOrCreateFieldOnObject(targetObject: js.Any, fieldName: java.lang.String, defaultValue: js.Any): js.Any = js.native
  /** Returns specified by attributeName attribute of startingElement or of it's closest parent who has it */
  def getParentAttributeByName(startingElement: stdLib.Element, attributeName: java.lang.String): java.lang.String = js.native
  /** Returns the closest to startingElement parent of the specified tag name */
  def getParentElementByName(startingElement: stdLib.Element, tagName: java.lang.String): stdLib.Element = js.native
  /** Returns display template registered (can be either string or function) */
  def getRenderTemplateByName(name: java.lang.String, renderCtx: js.Any): java.lang.String | sharepointLib.SrchNs.RenderFunction = js.native
  def getResultObject(id: java.lang.String): js.Any = js.native
  /** Returns string that contains safe call to HP.Show, passing over the itemId, hpContainerId and templateUrl parameters, and supplying false for wide parameter. */
  def getShowHoverPanelCallback(itemId: java.lang.String, hpContainerId: java.lang.String, templateUrl: java.lang.String): java.lang.String = js.native
  /** Returns string that contains safe call to HP.Show, passing over the itemId, hpContainerId and templateUrl parameters, and supplying true for wide parameter. */
  def getShowHoverPanelCallbackWide(itemId: java.lang.String, hpContainerId: java.lang.String, templateUrl: java.lang.String): java.lang.String = js.native
  def getSingleHHXMLNodeValue(xmlDoc: stdLib.XMLDocument, nodeName: java.lang.String): java.lang.String = js.native
  /** Safely gets field of an object (returns empty string instead of null as "getFieldOnObject") */
  def getStringFieldOnObject(targetObject: js.Any, fieldName: java.lang.String): java.lang.String = js.native
  def getTableOfType(
    tableCollection: sharepointLib.MicrosoftNs.SharePointNs.ClientNs.SearchNs.QueryNs.ResultTableCollection,
    tableTypeName: java.lang.String
  ): sharepointLib.MicrosoftNs.SharePointNs.ClientNs.SearchNs.QueryNs.ResultTable = js.native
  /** Gets a value from 'Properties' field object of the specified parent object */
  def getTableProperty(parent: js.Any, propName: java.lang.String): js.Any = js.native
  /** Gets the URL of template based on display template function or the rendering context */
  def getTemplateUrlFromFunctionOrRenderCtx(templateFunctionOrRenderCtx: js.Any): java.lang.String = js.native
  def getTrimmedProcessedHHXMLString(value: java.lang.String, cutOff: scala.Double): java.lang.String = js.native
  def getTrimmedString(value: java.lang.String, cutOff: scala.Double): java.lang.String = js.native
  def getUnEncodedMultiValuedResults(multiValue: java.lang.String, maxItems: scala.Double, rawDelimiter: java.lang.String): java.lang.String = js.native
  /** Parses username out from SharePoint user field value */
  def getUsernameFromAuthorField(authorField: java.lang.String): java.lang.String = js.native
  def getVideoImageWithFallbackSource(valueObject: js.Any, width: scala.Double, height: scala.Double): java.lang.String = js.native
  /** Returns the #s4-workspace element or if not found, then the fallback element */
  def getWorkspace(fallback: stdLib.Element): stdLib.Element = js.native
  def hideElement(element: stdLib.Element): scala.Unit = js.native
  def htmlEncodeNonBase64ImageUrl(url: java.lang.String): java.lang.String = js.native
  def includeCSS(templateLink: java.lang.String, relativeLink: java.lang.String): scala.Unit = js.native
  def includeLanguageScript(templateLink: java.lang.String, scriptLink: java.lang.String): scala.Unit = js.native
  def includeScript(templateLink: java.lang.String, scriptLink: java.lang.String): scala.Unit = js.native
  /** Returns true if the obj parameter is array */
  def isArray(obj: js.Any): scala.Boolean = js.native
  /** Returns true if specified by logoUrl image is one of default site logos */
  def isDefaultSiteLogo(logoUrl: java.lang.String): scala.Boolean = js.native
  /** Returns true if current page is osssearchresults.aspx */
  def isDefaultSiteSearchPage(): scala.Boolean = js.native
  /** Returns true if the specified element is a descendant of the container element */
  def isDescendant(element: stdLib.Element, container: stdLib.Element): scala.Boolean = js.native
  /** Returns true if the keyCode is \n or \r */
  def isEnterKey(keyCode: js.Any): scala.Boolean = js.native
  def isFirstPromotedBlock(resultTable: sharepointLib.MicrosoftNs.SharePointNs.ClientNs.SearchNs.QueryNs.ResultTable): scala.Boolean = js.native
  def isFirstRankedBlock(resultTable: sharepointLib.MicrosoftNs.SharePointNs.ClientNs.SearchNs.QueryNs.ResultTable): scala.Boolean = js.native
  /** Returns true if the specified item is found in the specified array (uses '===' for comparing) */
  def isInArray(array: js.Array[_], item: js.Any): scala.Boolean = js.native
  def isIntentTable(resultTable: sharepointLib.MicrosoftNs.SharePointNs.ClientNs.SearchNs.QueryNs.ResultTable): scala.Boolean = js.native
  /** Returns true if current page is in edit mode */
  def isPageInEditMode(): scala.Boolean = js.native
  /** Returns true if current page is displayed in the Minimal Download Strategy (MDS) mode */
  def isPageInMdsMode(): scala.Boolean = js.native
  def isPagePartialLoad(): scala.Boolean = js.native
  /** Returns true if the obj parameter is null, undefined, number or string */
  def isPrimitive(obj: js.Any): scala.Boolean = js.native
  /** Indicates whether the specified protocol is allowed. */
  def isProtocolAllowed(value: java.lang.String, allowRelativeUrl: scala.Boolean): scala.Boolean = js.native
  /** Returns true if the current page uses right-to-left mode (RTL) */
  def isRTL(): scala.Boolean = js.native
  def isSPFSKU(): scala.Boolean = js.native
  /** Returns true if the specified URL belongs to the specified host name */
  def isSameHost(url: java.lang.String, hostName: java.lang.String): scala.Boolean = js.native
  def isSubstrateTable(resultTable: js.Any): scala.Boolean = js.native
  def isTableTypeof(resultTable: js.Any, tableTypeName: java.lang.String): scala.Boolean = js.native
  /** Returns true if the URL is a relative URL, but not a server-relative URL */
  def isUrlPagelRelative(url: java.lang.String): scala.Boolean = js.native
  /** Returns true if the URL is a relative URL */
  def isUrlRelative(url: java.lang.String): scala.Boolean = js.native
  /** Returns true if the URL is a server-relative URL (i.e. starts with '/') */
  def isUrlServerRelative(url: java.lang.String): scala.Boolean = js.native
  /** Returns true if the fileExtension belongs to a webpage, e.g. 'ascx', 'aspx', 'html', 'php', etc.  */
  def isWebPage(fileExtension: java.lang.String): scala.Boolean = js.native
  /** Retrieves localized string with the specified id */
  def loadResource(id: java.lang.String): java.lang.String = js.native
  /** Retrieves localized string with the specified id */
  def loadResourceForTemplate(id: java.lang.String, templateFunc: js.Function1[/* ctx */ js.Any, java.lang.String]): java.lang.String = js.native
  def loadScripts(
    scriptReferences: js.Array[java.lang.String],
    success: js.Any,
    failure: js.Any,
    timeout: scala.Double
  ): scala.Unit = js.native
  def logClick(e: js.Any, clickType: js.Any): scala.Unit = js.native
  def logRenderingErrorMessageToContext(renderCtx: js.Any, messageText: js.Any, operationName: js.Any): scala.Unit = js.native
  def modifyMediaDurationRefinementName(resultRow: js.Any): scala.Unit = js.native
  /** Returns true if the value parameter is null or undefined */
  def n(value: js.Any): scala.Boolean = js.native
  def parseTypedRangeToken(rangeFilterToken: java.lang.String, objToStoreFilterTokenType: js.Any): js.Any = js.native
  def positionElement(element: stdLib.Element, offset: java.lang.String): scala.Unit = js.native
  def processHHXML(pre: java.lang.String): java.lang.String = js.native
  def registerLoadedScripts(scripts: js.Array[java.lang.String]): scala.Unit = js.native
  /** Registers display template function in the system.
    *  @param name Identifier of the template. Usually template is registered twice: by URL and by name.
    *  @param template The display template. It can be either string, or function, that gets the CSR context object and returns HTML string
    */
  def registerRenderTemplateByName(name: java.lang.String, templateFunction: java.lang.String): scala.Unit = js.native
  def registerRenderTemplateByName(name: java.lang.String, templateFunction: sharepointLib.SrchNs.RenderFunction): scala.Unit = js.native
  /** Registers in system resources defined by the dictionary object */
  def registerResourceDictionary(locale: java.lang.String, dict: org.scalablytyped.runtime.StringDictionary[java.lang.String]): scala.Unit = js.native
  /** Removes the specified item from the specified array and returns array that has the deleted item */
  def removeArray(array: js.Array[_], item: js.Any): js.Array[_] = js.native
  /** Same as $removeHandler with safety checks */
  def removeHandler(
    element: stdLib.Element,
    eventName: java.lang.String,
    handler: js.Function2[/* instance */ js.Any, /* eventArgs */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  /** Renders datetime value in friendly format into element specified by targetElementID */
  def renderFriendlyTimeIntervalString(dateTimeSinceUTC: stdLib.Date, targetElementID: java.lang.String): scala.Unit = js.native
  def renderFriendlyTimeIntervalString(dateTimeSinceUTC: stdLib.Date, targetElementID: java.lang.String, calendarType: scala.Double): scala.Unit = js.native
  /** Replaces tokens {searchcenterurl}, {contexturl}, {resultsurl}, {defaultpageslistname}, {Locale} and others, and converts URL to server-relative */
  def replaceUrlTokens(url: java.lang.String): java.lang.String = js.native
  def resetElement(element: stdLib.Element): scala.Unit = js.native
  @JSName("resolveRenderTemplate")
  def resolveRenderTemplate_Body(
    renderCtx: js.Any,
    component: sharepointLib.SrchNs.ClientControl,
    level: sharepointLib.sharepointLibStrings.Body
  ): java.lang.String | sharepointLib.SrchNs.RenderFunction = js.native
  @JSName("resolveRenderTemplate")
  def resolveRenderTemplate_Group(
    renderCtx: js.Any,
    component: sharepointLib.SrchNs.ClientControl,
    level: sharepointLib.sharepointLibStrings.Group
  ): java.lang.String | sharepointLib.SrchNs.RenderFunction = js.native
  /** Returns the CSR template that was previously registered using 'registerRenderTemplateByName' based on CSR template level */
  @JSName("resolveRenderTemplate")
  def resolveRenderTemplate_Item(
    renderCtx: js.Any,
    component: sharepointLib.SrchNs.ClientControl,
    level: sharepointLib.sharepointLibStrings.Item
  ): java.lang.String | sharepointLib.SrchNs.RenderFunction = js.native
  @JSName("resolveRenderTemplate")
  def resolveRenderTemplate_View(
    renderCtx: js.Any,
    component: sharepointLib.SrchNs.ClientControl,
    level: sharepointLib.sharepointLibStrings.View
  ): java.lang.String | sharepointLib.SrchNs.RenderFunction = js.native
  def restorePath(el: stdLib.Element, originalText: java.lang.String, selectText: java.lang.String): scala.Unit = js.native
  def restoreText(el: stdLib.Element, originalText: java.lang.String, selectText: java.lang.String): scala.Unit = js.native
  def selectPath(text: java.lang.String, el: stdLib.Element): scala.Unit = js.native
  def selectText(text: java.lang.String, el: stdLib.Element): scala.Unit = js.native
  /** Adds cookie with specified parameters */
  def setCookie(name: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def setCookie(name: java.lang.String, value: java.lang.String, expires: stdLib.Date): scala.Unit = js.native
  def setCookie(name: java.lang.String, value: java.lang.String, expires: stdLib.Date, domain: java.lang.String): scala.Unit = js.native
  def setCookie(
    name: java.lang.String,
    value: java.lang.String,
    expires: stdLib.Date,
    domain: java.lang.String,
    path: java.lang.String
  ): scala.Unit = js.native
  /** Safely sets field of an object (does nothing if either object or fieldName is null/empty); returns true if value was set */
  def setFieldOnObject(targetObject: js.Any, fieldName: java.lang.String, fieldValue: js.Any): scala.Boolean = js.native
  def setItemRenderWrapper(renderCtx: js.Any, itemRenderWrapperFunction: js.Any, templateFunction: js.Any): js.Any = js.native
  def setPath(e: stdLib.Event, el: stdLib.Element, text: java.lang.String, originalText: java.lang.String): scala.Unit = js.native
  def setResultObject(id: java.lang.String, resultObject: js.Any): js.Any = js.native
  def shouldAnimate(dp: js.Any): scala.Boolean = js.native
  def showElement(element: stdLib.Element): scala.Unit = js.native
  /** Returns human-readable size in kilobytes/megabytes etc. (the captions are localized) */
  def toFileSizeDisplay(numberOfBytes: scala.Double, showDecimalPart: scala.Boolean): java.lang.String = js.native
  /** Returns formatted date */
  def toFormattedDate(dateValue: stdLib.Date): java.lang.String = js.native
  def toFormattedDate(dateValue: stdLib.Date, dateTimeFormatId: java.lang.String): java.lang.String = js.native
  /** Returns formatted number */
  def toFormattedNumber(num: scala.Double, defaultDecimalPlacesIfNotInt: scala.Double): java.lang.String = js.native
  /** If number is more than 1000, rounds up three last digits, e.g. 72389 => '72,000+'. If number is more than 100000, returns '100,000+' */
  def toFriendlyNumber(num: scala.Double): java.lang.String = js.native
  def trace(c: sharepointLib.SrchNs.ClientControl, method: java.lang.String, message: java.lang.String): scala.Unit = js.native
  def traceFormatted(
    c: sharepointLib.SrchNs.ClientControl,
    method: java.lang.String,
    format: java.lang.String,
    values: java.lang.String*
  ): scala.Unit = js.native
  /** Removes trailing spaces and also replaces double spaces inside string to single spaces */
  def trimExtraSpaces(value: java.lang.String): java.lang.String = js.native
  def trimTitle(title: java.lang.String, maximumLengthInChars: scala.Double, numberOfTermsToUse: scala.Double): java.lang.String = js.native
  /** Truncates the string to specified maximum allowed amount of characters (if max amount is not exceeded - does nothing) */
  def truncateEnd(original: java.lang.String, maxChars: scala.Double): java.lang.String = js.native
  def truncateHighlightedUrl(url: java.lang.String, maxChars: scala.Double): java.lang.String = js.native
  def truncateUrl(url: java.lang.String, maxChars: scala.Double): java.lang.String = js.native
  /** Adds ctag parameter to the URL and replaces URL tokens */
  def urlTokenExpansion(jsLink: java.lang.String): java.lang.String = js.native
  /** Returns true if the value parameter is empty string */
  def w(value: js.Any): scala.Boolean = js.native
}

