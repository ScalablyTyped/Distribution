package typings.sharepoint

import org.scalablytyped.runtime.StringDictionary
import typings.sharepoint.SPClientTemplatesNs.Item
import typings.sharepoint.SPClientTemplatesNs.RenderContext_FieldInForm
import typings.sharepoint.SPClientTemplatesNs.RenderContext_InView
import typings.sharepoint.SPClientTemplatesNs.RenderContext_ItemInView
import typings.sharepoint.SrchNs.ClientControl
import typings.std.Element
import typings.std.EventListener
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object ^ extends js.Object {
  var Strings: js.Any = js.native
  var _spBodyOnLoadCalled: Boolean = js.native
  var _spBodyOnLoadFunctionNames: js.Array[String] = js.native
  var _spBodyOnLoadFunctions: js.Array[js.Function0[Unit]] = js.native
  var _spFriendlyUrlPageContextInfo: typings.sharepoint._spFriendlyUrlPageContextInfo = js.native
  var _spPageContextInfo: typings.sharepoint._spPageContextInfo = js.native
  var ajaxNavigate: AjaxNavigate = js.native
  var browseris: Browseris = js.native
  @JSName("m$")
  var m$: MQuery = js.native
  var spMgr: SPMgr = js.native
  /** (calls Srch.U.addRenderContextCallback) */
  @JSName("$addRenderContextCallback")
  def $addRenderContextCallback(renderCtx: js.Any, itemWrapperFunction: js.Any): Unit = js.native
  @JSName("$contentLineText")
  def $contentLineText(p: js.Any): js.Any = js.native
  /** (alias for Srch.U.findResultObjectFromDOM) */
  @JSName("$findResultObjectFromDOM")
  def $findResultObjectFromDOM(e: Element, `type`: String): Unit = js.native
  @JSName("$getCachedItemValue")
  def $getCachedItemValue(ctx: js.Any, nameToLookup: String): js.Any = js.native
  /** Returns the ClientControl associated with specified DOM element (alias for Srch.U.getClientComponent) */
  @JSName("$getClientControl")
  def $getClientControl(e: Element): ClientControl = js.native
  @JSName("$getItemValue")
  def $getItemValue(ctx: js.Any, nameToLookup: String): js.Any = js.native
  /** (alias for Srch.U.getResultObject) */
  @JSName("$getResultItem")
  def $getResultItem(id: String): js.Any = js.native
  /** (alias for Srch.U.getResultObject) */
  @JSName("$getResultObject")
  def $getResultObject(id: String): js.Any = js.native
  /** (alias for SP.Utilities.HttpUtility.htmlEncode) */
  @JSName("$htmlEncode")
  def $htmlEncode(s: String): String = js.native
  @JSName("$imgSrcUrl")
  def $imgSrcUrl(p: js.Any): String = js.native
  @JSName("$includeCSS")
  def $includeCSS(templateLink: String, scriptLink: String): Unit = js.native
  @JSName("$includeLanguageScript")
  def $includeLanguageScript(templateLink: String, scriptLink: String): js.Any = js.native
  @JSName("$includeScript")
  def $includeScript(templateLink: String, relativeLink: String): Unit = js.native
  /** Returns true if the specified array is null or empty */
  @JSName("$isEmptyArray")
  def $isEmptyArray(array: js.Array[_]): Boolean = js.native
  /** Returns true if the value parameter is null or empty string */
  @JSName("$isEmptyString")
  def $isEmptyString(value: String): Boolean = js.native
  /** Returns true if the specified item is found in the specified array (uses '===' for comparing) */
  @JSName("$isInArray")
  def $isInArray(array: js.Array[_], item: js.Any): Boolean = js.native
  /** Returns true if the value parameter is null or undefined */
  @JSName("$isNull")
  def $isNull(value: js.Any): Boolean = js.native
  /** Registers in system resources defined by the dictionary object (alias for Srch.U.registerResourceDictionary) */
  @JSName("$registerResourceDictionary")
  def $registerResourceDictionary(locale: String, dict: StringDictionary[String]): Unit = js.native
  /** Retrieves localized string with the specified id */
  @JSName("$resource")
  def $resource(id: String): String = js.native
  /** (alias for SP.Utilities.HttpUtility.ecmaScriptStringLiteralEncode) */
  @JSName("$scriptEncode")
  def $scriptEncode(s: String): String = js.native
  /** (calls Srch.U.setItemRenderWrapper) */
  @JSName("$setItemWrapperCallback")
  def $setItemWrapperCallback(renderCtx: js.Any, itemWrapperFunction: js.Any): Unit = js.native
  /** (alias for Srch.U.setResultObject) */
  @JSName("$setResultItem")
  def $setResultItem(id: String, resultObject: js.Any): Unit = js.native
  /** (alias for Srch.U.setResultObject) */
  @JSName("$setResultObject")
  def $setResultObject(id: String, resultObject: js.Any): Unit = js.native
  /** Ensures that url has correct protocol or is a relative URL, and html-encodes it.
    * If URL is incorrect, returns empty string. */
  @JSName("$urlHtmlEncode")
  def $urlHtmlEncode(s: String): String = js.native
  /** (alias for SP.Utilities.HttpUtility.urlKeyValueEncode) */
  @JSName("$urlKeyValueEncode")
  def $urlKeyValueEncode(s: String): String = js.native
  /** (alias for SP.Utilities.HttpUtility.urlPathEncode) */
  @JSName("$urlPathEncode")
  def $urlPathEncode(s: String): String = js.native
  def AddEvtHandler(element: HTMLElement, event: String, func: EventListener): Unit = js.native
  def CoreRender(template: js.Any, context: js.Any): String = js.native
  def ExecuteOrDelayUntilBodyLoaded(initFunc: js.Function0[Unit]): Unit = js.native
  def ExecuteOrDelayUntilEventNotified(func: js.Function1[/* repeated */ js.Any, Unit], eventName: String): Boolean = js.native
  def ExecuteOrDelayUntilScriptLoaded(func: js.Function0[Unit], depScriptFileName: String): Boolean = js.native
  def GenerateIID(renderCtx: RenderContext_ItemInView): String = js.native
  def GenerateIIDForListItem(renderCtx: RenderContext_InView, listItem: Item): String = js.native
  def GetCurrentCtx(): ContextInfo = js.native
  /** Gets query string parameter */
  def GetUrlKeyValue(key: String): String = js.native
  def RefreshCommandUI(): Unit = js.native
  /** Register function to rerun on partial update in MDS-enabled site.*/
  def RegisterModuleInit(scriptFileName: String, initFunc: js.Function0[Unit]): Unit = js.native
  def SPClientPeoplePickerCSRTemplate(ctx: RenderContext_FieldInForm): String = js.native
  def SPFieldAttachments_Default(ctx: RenderContext_FieldInForm): String = js.native
  def SPFieldBoolean_Edit(ctx: RenderContext_FieldInForm): String = js.native
  def SPFieldChoice_Dropdown_Edit(ctx: RenderContext_FieldInForm): String = js.native
  def SPFieldChoice_Edit(ctx: RenderContext_FieldInForm): String = js.native
  def SPFieldChoice_Radio_Edit(ctx: RenderContext_FieldInForm): String = js.native
  def SPFieldDateTime_Display(ctx: RenderContext_FieldInForm): String = js.native
  def SPFieldDateTime_Edit(ctx: RenderContext_FieldInForm): String = js.native
  def SPFieldFile_Display(ctx: RenderContext_FieldInForm): String = js.native
  def SPFieldFile_Edit(ctx: RenderContext_FieldInForm): String = js.native
  def SPFieldLookupMulti_Edit(ctx: RenderContext_FieldInForm): String = js.native
  def SPFieldLookup_Display(ctx: RenderContext_FieldInForm): String = js.native
  def SPFieldLookup_Edit(ctx: RenderContext_FieldInForm): String = js.native
  def SPFieldMultiChoice_Edit(ctx: RenderContext_FieldInForm): String = js.native
  def SPFieldNote_Display(ctx: RenderContext_FieldInForm): String = js.native
  def SPFieldNote_Edit(ctx: RenderContext_FieldInForm): String = js.native
  def SPFieldNumber_Edit(ctx: RenderContext_FieldInForm): String = js.native
  def SPFieldText_Edit(ctx: RenderContext_FieldInForm): String = js.native
  def SPFieldUrl_Display(ctx: RenderContext_FieldInForm): String = js.native
  def SPFieldUrl_Edit(ctx: RenderContext_FieldInForm): String = js.native
  def SPFieldUserMulti_Display(ctx: RenderContext_FieldInForm): String = js.native
  def SPFieldUser_Display(ctx: RenderContext_FieldInForm): String = js.native
  def SPField_FormDisplay_Default(ctx: RenderContext_FieldInForm): String = js.native
  def SPField_FormDisplay_DefaultNoEncode(ctx: RenderContext_FieldInForm): String = js.native
  def SPField_FormDisplay_Empty(ctx: RenderContext_FieldInForm): String = js.native
  def SPFormControl_AppendValidationErrorMessage(nodeId: String, errorResult: js.Any): Unit = js.native
  def STSHtmlDecode(value: String): String = js.native
  def STSHtmlEncode(value: String): String = js.native
  def SetFullScreenMode(fullscreen: Boolean): Unit = js.native
}

