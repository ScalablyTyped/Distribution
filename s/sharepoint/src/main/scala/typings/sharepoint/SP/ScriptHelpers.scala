package typings.sharepoint.SP

import org.scalablytyped.runtime.StringDictionary
import typings.sharepoint.SPClientTemplates.FieldSchema
import typings.sharepoint.SPClientTemplates.ListSchema
import typings.sharepoint.SPClientTemplates.RenderContext
import typings.std.HTMLElement
import typings.std.HTMLImageElement
import typings.std.HTMLTextAreaElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.ScriptHelpers")
@js.native
class ScriptHelpers () extends js.Object

/* static members */
@JSGlobal("SP.ScriptHelpers")
@js.native
object ScriptHelpers extends js.Object {
  def disableWebpartSelection(context: RenderContext): Unit = js.native
  def getDocumentQueryPairs(): StringDictionary[String] = js.native
  def getFieldFromSchema(schema: ListSchema, fieldName: String): FieldSchema = js.native
  def getLayoutsPageUrl(pageName: String, webServerRelativeUrl: String): String = js.native
  def getListLevelPermissionMask(jsonItem: String): Double = js.native
  def getTextAreaElementValue(textAreaElement: HTMLTextAreaElement): String = js.native
  def getUrlQueryPairs(docUrl: String): StringDictionary[String] = js.native
  def getUserFieldProperty(item: ListItem[_], fieldName: String, propertyName: String): js.Any = js.native
  def hasPermission(listPermissionMask: Double, listPermission: ListLevelPermissionMask): Boolean = js.native
  def isNullOrEmptyString(str: String): Boolean = js.native
  def isNullOrUndefined(obj: js.Any): Boolean = js.native
  def isNullOrUndefinedOrEmpty(str: String): Boolean = js.native
  def isUndefined(obj: js.Any): Boolean = js.native
  def newGuid(): Guid = js.native
  def removeHtml(str: String): String = js.native
  def removeHtmlAndTrimStringWithEllipsis(str: String, maxLength: Double): String = js.native
  def removeStyleChildren(element: HTMLElement): Unit = js.native
  def replaceOrAddQueryString(url: String, key: String, value: String): String = js.native
  def resizeImageToSquareLength(imgElement: HTMLImageElement, squareLength: Double): Unit = js.native
  def setTextAreaElementValue(textAreaElement: HTMLTextAreaElement, newValue: String): Unit = js.native
  def truncateToInt(n: Double): Double = js.native
  def urlCombine(path1: String, path2: String): String = js.native
}

