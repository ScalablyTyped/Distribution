package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.ScriptHelpers")
@js.native
class ScriptHelpers () extends js.Object

@JSGlobal("SP.ScriptHelpers")
@js.native
object ScriptHelpers extends js.Object {
  def disableWebpartSelection(context: sharepointLib.SPClientTemplatesNs.RenderContext): scala.Unit = js.native
  def getDocumentQueryPairs(): org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
  def getFieldFromSchema(schema: sharepointLib.SPClientTemplatesNs.ListSchema, fieldName: java.lang.String): sharepointLib.SPClientTemplatesNs.FieldSchema = js.native
  def getLayoutsPageUrl(pageName: java.lang.String, webServerRelativeUrl: java.lang.String): java.lang.String = js.native
  def getListLevelPermissionMask(jsonItem: java.lang.String): scala.Double = js.native
  def getTextAreaElementValue(textAreaElement: stdLib.HTMLTextAreaElement): java.lang.String = js.native
  def getUrlQueryPairs(docUrl: java.lang.String): org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
  def getUserFieldProperty(item: sharepointLib.SPNs.ListItem[_], fieldName: java.lang.String, propertyName: java.lang.String): js.Any = js.native
  def hasPermission(listPermissionMask: scala.Double, listPermission: sharepointLib.SPNs.ListLevelPermissionMask): scala.Boolean = js.native
  def isNullOrEmptyString(str: java.lang.String): scala.Boolean = js.native
  def isNullOrUndefined(obj: js.Any): scala.Boolean = js.native
  def isNullOrUndefinedOrEmpty(str: java.lang.String): scala.Boolean = js.native
  def isUndefined(obj: js.Any): scala.Boolean = js.native
  def newGuid(): sharepointLib.SPNs.Guid = js.native
  def removeHtml(str: java.lang.String): java.lang.String = js.native
  def removeHtmlAndTrimStringWithEllipsis(str: java.lang.String, maxLength: scala.Double): java.lang.String = js.native
  def removeStyleChildren(element: stdLib.HTMLElement): scala.Unit = js.native
  def replaceOrAddQueryString(url: java.lang.String, key: java.lang.String, value: java.lang.String): java.lang.String = js.native
  def resizeImageToSquareLength(imgElement: stdLib.HTMLImageElement, squareLength: scala.Double): scala.Unit = js.native
  def setTextAreaElementValue(textAreaElement: stdLib.HTMLTextAreaElement, newValue: java.lang.String): scala.Unit = js.native
  def truncateToInt(n: scala.Double): scala.Double = js.native
  def urlCombine(path1: java.lang.String, path2: java.lang.String): java.lang.String = js.native
}

