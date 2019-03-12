package typings
package sharepointLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object ^ extends js.Object {
  var Strings: js.Any = js.native
  var _spBodyOnLoadCalled: scala.Boolean = js.native
  var _spBodyOnLoadFunctionNames: js.Array[java.lang.String] = js.native
  var _spBodyOnLoadFunctions: js.Array[js.Function0[scala.Unit]] = js.native
  var _spFriendlyUrlPageContextInfo: sharepointLib._spFriendlyUrlPageContextInfo = js.native
  var _spPageContextInfo: sharepointLib._spPageContextInfo = js.native
  var ajaxNavigate: AjaxNavigate = js.native
  var browseris: Browseris = js.native
  @JSName("m$")
  var m$: MQuery = js.native
  var spMgr: SPMgr = js.native
  /** (calls Srch.U.addRenderContextCallback) */
  @JSName("$addRenderContextCallback")
  def $addRenderContextCallback(renderCtx: js.Any, itemWrapperFunction: js.Any): scala.Unit = js.native
  @JSName("$contentLineText")
  def $contentLineText(p: js.Any): js.Any = js.native
  /** (alias for Srch.U.findResultObjectFromDOM) */
  @JSName("$findResultObjectFromDOM")
  def $findResultObjectFromDOM(e: stdLib.Element, `type`: java.lang.String): scala.Unit = js.native
  @JSName("$getCachedItemValue")
  def $getCachedItemValue(ctx: js.Any, nameToLookup: java.lang.String): js.Any = js.native
  /** Returns the ClientControl associated with specified DOM element (alias for Srch.U.getClientComponent) */
  @JSName("$getClientControl")
  def $getClientControl(e: stdLib.Element): sharepointLib.SrchNs.ClientControl = js.native
  @JSName("$getItemValue")
  def $getItemValue(ctx: js.Any, nameToLookup: java.lang.String): js.Any = js.native
  /** (alias for Srch.U.getResultObject) */
  @JSName("$getResultItem")
  def $getResultItem(id: java.lang.String): js.Any = js.native
  /** (alias for Srch.U.getResultObject) */
  @JSName("$getResultObject")
  def $getResultObject(id: java.lang.String): js.Any = js.native
  /** (alias for SP.Utilities.HttpUtility.htmlEncode) */
  @JSName("$htmlEncode")
  def $htmlEncode(s: java.lang.String): java.lang.String = js.native
  @JSName("$imgSrcUrl")
  def $imgSrcUrl(p: js.Any): java.lang.String = js.native
  @JSName("$includeCSS")
  def $includeCSS(templateLink: java.lang.String, scriptLink: java.lang.String): scala.Unit = js.native
  @JSName("$includeLanguageScript")
  def $includeLanguageScript(templateLink: java.lang.String, scriptLink: java.lang.String): js.Any = js.native
  @JSName("$includeScript")
  def $includeScript(templateLink: java.lang.String, relativeLink: java.lang.String): scala.Unit = js.native
  /** Returns true if the specified array is null or empty */
  @JSName("$isEmptyArray")
  def $isEmptyArray(array: js.Array[_]): scala.Boolean = js.native
  /** Returns true if the value parameter is null or empty string */
  @JSName("$isEmptyString")
  def $isEmptyString(value: java.lang.String): scala.Boolean = js.native
  /** Returns true if the specified item is found in the specified array (uses '===' for comparing) */
  @JSName("$isInArray")
  def $isInArray(array: js.Array[_], item: js.Any): scala.Boolean = js.native
  /** Returns true if the value parameter is null or undefined */
  @JSName("$isNull")
  def $isNull(value: js.Any): scala.Boolean = js.native
  /** Registers in system resources defined by the dictionary object (alias for Srch.U.registerResourceDictionary) */
  @JSName("$registerResourceDictionary")
  def $registerResourceDictionary(locale: java.lang.String, dict: org.scalablytyped.runtime.StringDictionary[java.lang.String]): scala.Unit = js.native
  /** Retrieves localized string with the specified id */
  @JSName("$resource")
  def $resource(id: java.lang.String): java.lang.String = js.native
  /** (alias for SP.Utilities.HttpUtility.ecmaScriptStringLiteralEncode) */
  @JSName("$scriptEncode")
  def $scriptEncode(s: java.lang.String): java.lang.String = js.native
  /** (calls Srch.U.setItemRenderWrapper) */
  @JSName("$setItemWrapperCallback")
  def $setItemWrapperCallback(renderCtx: js.Any, itemWrapperFunction: js.Any): scala.Unit = js.native
  /** (alias for Srch.U.setResultObject) */
  @JSName("$setResultItem")
  def $setResultItem(id: java.lang.String, resultObject: js.Any): scala.Unit = js.native
  /** (alias for Srch.U.setResultObject) */
  @JSName("$setResultObject")
  def $setResultObject(id: java.lang.String, resultObject: js.Any): scala.Unit = js.native
  /** Ensures that url has correct protocol or is a relative URL, and html-encodes it.
    * If URL is incorrect, returns empty string. */
  @JSName("$urlHtmlEncode")
  def $urlHtmlEncode(s: java.lang.String): java.lang.String = js.native
  /** (alias for SP.Utilities.HttpUtility.urlKeyValueEncode) */
  @JSName("$urlKeyValueEncode")
  def $urlKeyValueEncode(s: java.lang.String): java.lang.String = js.native
  /** (alias for SP.Utilities.HttpUtility.urlPathEncode) */
  @JSName("$urlPathEncode")
  def $urlPathEncode(s: java.lang.String): java.lang.String = js.native
  def AddEvtHandler(element: stdLib.HTMLElement, event: java.lang.String, func: stdLib.EventListener): scala.Unit = js.native
  def CoreRender(template: js.Any, context: js.Any): java.lang.String = js.native
  def ExecuteOrDelayUntilBodyLoaded(initFunc: js.Function0[scala.Unit]): scala.Unit = js.native
  def ExecuteOrDelayUntilEventNotified(func: js.Function1[/* repeated */ js.Any, scala.Unit], eventName: java.lang.String): scala.Boolean = js.native
  def ExecuteOrDelayUntilScriptLoaded(func: js.Function0[scala.Unit], depScriptFileName: java.lang.String): scala.Boolean = js.native
  def GenerateIID(renderCtx: sharepointLib.SPClientTemplatesNs.RenderContext_ItemInView): java.lang.String = js.native
  def GenerateIIDForListItem(
    renderCtx: sharepointLib.SPClientTemplatesNs.RenderContext_InView,
    listItem: sharepointLib.SPClientTemplatesNs.Item
  ): java.lang.String = js.native
  def GetCurrentCtx(): ContextInfo = js.native
  /** Gets query string parameter */
  def GetUrlKeyValue(key: java.lang.String): java.lang.String = js.native
  def RefreshCommandUI(): scala.Unit = js.native
  /** Register function to rerun on partial update in MDS-enabled site.*/
  def RegisterModuleInit(scriptFileName: java.lang.String, initFunc: js.Function0[scala.Unit]): scala.Unit = js.native
  def SPClientPeoplePickerCSRTemplate(ctx: sharepointLib.SPClientTemplatesNs.RenderContext_FieldInForm): java.lang.String = js.native
  def SPFieldAttachments_Default(ctx: sharepointLib.SPClientTemplatesNs.RenderContext_FieldInForm): java.lang.String = js.native
  def SPFieldBoolean_Edit(ctx: sharepointLib.SPClientTemplatesNs.RenderContext_FieldInForm): java.lang.String = js.native
  def SPFieldChoice_Dropdown_Edit(ctx: sharepointLib.SPClientTemplatesNs.RenderContext_FieldInForm): java.lang.String = js.native
  def SPFieldChoice_Edit(ctx: sharepointLib.SPClientTemplatesNs.RenderContext_FieldInForm): java.lang.String = js.native
  def SPFieldChoice_Radio_Edit(ctx: sharepointLib.SPClientTemplatesNs.RenderContext_FieldInForm): java.lang.String = js.native
  def SPFieldDateTime_Display(ctx: sharepointLib.SPClientTemplatesNs.RenderContext_FieldInForm): java.lang.String = js.native
  def SPFieldDateTime_Edit(ctx: sharepointLib.SPClientTemplatesNs.RenderContext_FieldInForm): java.lang.String = js.native
  def SPFieldFile_Display(ctx: sharepointLib.SPClientTemplatesNs.RenderContext_FieldInForm): java.lang.String = js.native
  def SPFieldFile_Edit(ctx: sharepointLib.SPClientTemplatesNs.RenderContext_FieldInForm): java.lang.String = js.native
  def SPFieldLookupMulti_Edit(ctx: sharepointLib.SPClientTemplatesNs.RenderContext_FieldInForm): java.lang.String = js.native
  def SPFieldLookup_Display(ctx: sharepointLib.SPClientTemplatesNs.RenderContext_FieldInForm): java.lang.String = js.native
  def SPFieldLookup_Edit(ctx: sharepointLib.SPClientTemplatesNs.RenderContext_FieldInForm): java.lang.String = js.native
  def SPFieldMultiChoice_Edit(ctx: sharepointLib.SPClientTemplatesNs.RenderContext_FieldInForm): java.lang.String = js.native
  def SPFieldNote_Display(ctx: sharepointLib.SPClientTemplatesNs.RenderContext_FieldInForm): java.lang.String = js.native
  def SPFieldNote_Edit(ctx: sharepointLib.SPClientTemplatesNs.RenderContext_FieldInForm): java.lang.String = js.native
  def SPFieldNumber_Edit(ctx: sharepointLib.SPClientTemplatesNs.RenderContext_FieldInForm): java.lang.String = js.native
  def SPFieldText_Edit(ctx: sharepointLib.SPClientTemplatesNs.RenderContext_FieldInForm): java.lang.String = js.native
  def SPFieldUrl_Display(ctx: sharepointLib.SPClientTemplatesNs.RenderContext_FieldInForm): java.lang.String = js.native
  def SPFieldUrl_Edit(ctx: sharepointLib.SPClientTemplatesNs.RenderContext_FieldInForm): java.lang.String = js.native
  def SPFieldUserMulti_Display(ctx: sharepointLib.SPClientTemplatesNs.RenderContext_FieldInForm): java.lang.String = js.native
  def SPFieldUser_Display(ctx: sharepointLib.SPClientTemplatesNs.RenderContext_FieldInForm): java.lang.String = js.native
  def SPField_FormDisplay_Default(ctx: sharepointLib.SPClientTemplatesNs.RenderContext_FieldInForm): java.lang.String = js.native
  def SPField_FormDisplay_DefaultNoEncode(ctx: sharepointLib.SPClientTemplatesNs.RenderContext_FieldInForm): java.lang.String = js.native
  def SPField_FormDisplay_Empty(ctx: sharepointLib.SPClientTemplatesNs.RenderContext_FieldInForm): java.lang.String = js.native
  def SPFormControl_AppendValidationErrorMessage(nodeId: java.lang.String, errorResult: js.Any): scala.Unit = js.native
  def STSHtmlDecode(value: java.lang.String): java.lang.String = js.native
  def STSHtmlEncode(value: java.lang.String): java.lang.String = js.native
  def SetFullScreenMode(fullscreen: scala.Boolean): scala.Unit = js.native
}

