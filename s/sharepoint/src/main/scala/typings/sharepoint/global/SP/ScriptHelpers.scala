package typings.sharepoint.global.SP

import org.scalablytyped.runtime.StringDictionary
import typings.sharepoint.SPClientTemplates.FieldSchema
import typings.sharepoint.SPClientTemplates.ListSchema
import typings.sharepoint.SPClientTemplates.RenderContext
import typings.std.HTMLElement
import typings.std.HTMLImageElement
import typings.std.HTMLTextAreaElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.ScriptHelpers")
@js.native
class ScriptHelpers ()
  extends typings.sharepoint.SP.ScriptHelpers
object ScriptHelpers {
  
  /* static member */
  @JSGlobal("SP.ScriptHelpers.disableWebpartSelection")
  @js.native
  def disableWebpartSelection(context: RenderContext): Unit = js.native
  
  /* static member */
  @JSGlobal("SP.ScriptHelpers.getDocumentQueryPairs")
  @js.native
  def getDocumentQueryPairs(): StringDictionary[String] = js.native
  
  /* static member */
  @JSGlobal("SP.ScriptHelpers.getFieldFromSchema")
  @js.native
  def getFieldFromSchema(schema: ListSchema, fieldName: String): FieldSchema = js.native
  
  /* static member */
  @JSGlobal("SP.ScriptHelpers.getLayoutsPageUrl")
  @js.native
  def getLayoutsPageUrl(pageName: String, webServerRelativeUrl: String): String = js.native
  
  /* static member */
  @JSGlobal("SP.ScriptHelpers.getListLevelPermissionMask")
  @js.native
  def getListLevelPermissionMask(jsonItem: String): Double = js.native
  
  /* static member */
  @JSGlobal("SP.ScriptHelpers.getTextAreaElementValue")
  @js.native
  def getTextAreaElementValue(textAreaElement: HTMLTextAreaElement): String = js.native
  
  /* static member */
  @JSGlobal("SP.ScriptHelpers.getUrlQueryPairs")
  @js.native
  def getUrlQueryPairs(docUrl: String): StringDictionary[String] = js.native
  
  /* static member */
  @JSGlobal("SP.ScriptHelpers.getUserFieldProperty")
  @js.native
  def getUserFieldProperty(item: typings.sharepoint.SP.ListItem[_], fieldName: String, propertyName: String): js.Any = js.native
  
  /* static member */
  @JSGlobal("SP.ScriptHelpers.hasPermission")
  @js.native
  def hasPermission(listPermissionMask: Double, listPermission: typings.sharepoint.SP.ListLevelPermissionMask): Boolean = js.native
  
  /* static member */
  @JSGlobal("SP.ScriptHelpers.isNullOrEmptyString")
  @js.native
  def isNullOrEmptyString(str: String): Boolean = js.native
  
  /* static member */
  @JSGlobal("SP.ScriptHelpers.isNullOrUndefined")
  @js.native
  def isNullOrUndefined(obj: js.Any): Boolean = js.native
  
  /* static member */
  @JSGlobal("SP.ScriptHelpers.isNullOrUndefinedOrEmpty")
  @js.native
  def isNullOrUndefinedOrEmpty(str: String): Boolean = js.native
  
  /* static member */
  @JSGlobal("SP.ScriptHelpers.isUndefined")
  @js.native
  def isUndefined(obj: js.Any): Boolean = js.native
  
  /* static member */
  @JSGlobal("SP.ScriptHelpers.newGuid")
  @js.native
  def newGuid(): typings.sharepoint.SP.Guid = js.native
  
  /* static member */
  @JSGlobal("SP.ScriptHelpers.removeHtml")
  @js.native
  def removeHtml(str: String): String = js.native
  
  /* static member */
  @JSGlobal("SP.ScriptHelpers.removeHtmlAndTrimStringWithEllipsis")
  @js.native
  def removeHtmlAndTrimStringWithEllipsis(str: String, maxLength: Double): String = js.native
  
  /* static member */
  @JSGlobal("SP.ScriptHelpers.removeStyleChildren")
  @js.native
  def removeStyleChildren(element: HTMLElement): Unit = js.native
  
  /* static member */
  @JSGlobal("SP.ScriptHelpers.replaceOrAddQueryString")
  @js.native
  def replaceOrAddQueryString(url: String, key: String, value: String): String = js.native
  
  /* static member */
  @JSGlobal("SP.ScriptHelpers.resizeImageToSquareLength")
  @js.native
  def resizeImageToSquareLength(imgElement: HTMLImageElement, squareLength: Double): Unit = js.native
  
  /* static member */
  @JSGlobal("SP.ScriptHelpers.setTextAreaElementValue")
  @js.native
  def setTextAreaElementValue(textAreaElement: HTMLTextAreaElement, newValue: String): Unit = js.native
  
  /* static member */
  @JSGlobal("SP.ScriptHelpers.truncateToInt")
  @js.native
  def truncateToInt(n: Double): Double = js.native
  
  /* static member */
  @JSGlobal("SP.ScriptHelpers.urlCombine")
  @js.native
  def urlCombine(path1: String, path2: String): String = js.native
}
