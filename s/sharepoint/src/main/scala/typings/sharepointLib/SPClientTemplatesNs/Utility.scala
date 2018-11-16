package typings
package sharepointLib.SPClientTemplatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SPClientTemplates.Utility")
@js.native
class Utility () extends js.Object

@JSGlobal("SPClientTemplates.Utility")
@js.native
object Utility extends js.Object {
  /** Returns ";#" */
  var UserLookupDelimitString: java.lang.String = js.native
  /** Returns ";#" */
  var UserMultiValueDelimitString: java.lang.String = js.native
  /** Represents lookup values array in some strange format */
  def BuildLookupValuesAsString(
    choiceArray: js.Array[sharepointLib.SPClientTemplatesNs.ClientLookupValue],
    isMultiLookup: scala.Boolean,
    setGroupDesc: scala.Boolean
  ): java.lang.String = js.native
  def ChoiceFormatTypeToString(fileSystemObjectType: sharepointLib.SPClientTemplatesNs.ChoiceFormatType): java.lang.String = js.native
  def ComputeRegisterTypeInfo(renderCtx: sharepointLib.SPClientTemplatesNs.TemplateOverridesOptions): js.Any = js.native
  def ControlModeToString(mode: sharepointLib.SPClientTemplatesNs.ClientControlMode): java.lang.String = js.native
  def FileSystemObjectTypeToString(fileSystemObjectType: sharepointLib.SPClientTemplatesNs.FileSystemObjectType): java.lang.String = js.native
  def GetControlOptions(control: stdLib.HTMLElement): js.Any = js.native
  def GetFormContextForCurrentField(context: sharepointLib.SPClientTemplatesNs.RenderContext_Form): sharepointLib.SPClientTemplatesNs.ClientFormContext = js.native
  def GetPropertiesFromPageContextInfo(context: sharepointLib.SPClientTemplatesNs.RenderContext): scala.Unit = js.native
  /** Creates SP.ClientContext based on the specified Web URL. If the SP.Runtime.js script is not loaded, returns null */
  def InitContext(webUrl: java.lang.String): sharepointLib.SPNs.ClientContext = js.native
  def IsValidControlMode(mode: scala.Double): scala.Boolean = js.native
  def ParseLookupValue(valueStr: java.lang.String): sharepointLib.SPClientTemplatesNs.ClientLookupValue = js.native
  def ParseMultiLookupValues(valueStr: java.lang.String): js.Array[sharepointLib.SPClientTemplatesNs.ClientLookupValue] = js.native
  def ParseURLValue(value: java.lang.String): sharepointLib.SPClientTemplatesNs.ClientUrlValue = js.native
  /** Replaces tokens "~site/", "~sitecollection/", "~sitecollectionmasterpagegallery", "{lcid}", "{locale}" and "{siteclienttag}" with appropriate context values */
  def ReplaceUrlTokens(tokenUrl: java.lang.String): java.lang.String = js.native
  def RichTextModeToString(fileSystemObjectType: sharepointLib.SPClientTemplatesNs.RichTextMode): java.lang.String = js.native
  /** Removes leading and trailing spaces */
  def Trim(str: java.lang.String): java.lang.String = js.native
  def TryParseInitialUserValue(userStr: java.lang.String): js.Array[sharepointLib.SPClientTemplatesNs.ClientUserValue] = js.native
  /** Tries to resolve user names from string. Pushes either ClientUserValue (if resolved successfully) or original string (if not) to the resulting array. */
  def TryParseUserControlValue(userStr: java.lang.String, separator: java.lang.String): js.Array[_] = js.native
}

