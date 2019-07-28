package typings.sharepoint.SPClientTemplatesNs

import typings.sharepoint.SPNs.ClientContext
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SPClientTemplates.Utility")
@js.native
class Utility () extends js.Object

/* static members */
@JSGlobal("SPClientTemplates.Utility")
@js.native
object Utility extends js.Object {
  /** Returns ";#" */
  var UserLookupDelimitString: String = js.native
  /** Returns ";#" */
  var UserMultiValueDelimitString: String = js.native
  /** Represents lookup values array in some strange format */
  def BuildLookupValuesAsString(choiceArray: js.Array[ClientLookupValue], isMultiLookup: Boolean, setGroupDesc: Boolean): String = js.native
  def ChoiceFormatTypeToString(fileSystemObjectType: ChoiceFormatType): String = js.native
  def ComputeRegisterTypeInfo(renderCtx: TemplateOverridesOptions): js.Any = js.native
  def ControlModeToString(mode: ClientControlMode): String = js.native
  def FileSystemObjectTypeToString(fileSystemObjectType: FileSystemObjectType): String = js.native
  def GetControlOptions(control: HTMLElement): js.Any = js.native
  def GetFormContextForCurrentField(context: RenderContext_Form): ClientFormContext = js.native
  def GetPropertiesFromPageContextInfo(context: RenderContext): Unit = js.native
  /** Creates SP.ClientContext based on the specified Web URL. If the SP.Runtime.js script is not loaded, returns null */
  def InitContext(webUrl: String): ClientContext = js.native
  def IsValidControlMode(mode: Double): Boolean = js.native
  def ParseLookupValue(valueStr: String): ClientLookupValue = js.native
  def ParseMultiLookupValues(valueStr: String): js.Array[ClientLookupValue] = js.native
  def ParseURLValue(value: String): ClientUrlValue = js.native
  /** Replaces tokens "~site/", "~sitecollection/", "~sitecollectionmasterpagegallery", "{lcid}", "{locale}" and "{siteclienttag}" with appropriate context values */
  def ReplaceUrlTokens(tokenUrl: String): String = js.native
  def RichTextModeToString(fileSystemObjectType: RichTextMode): String = js.native
  /** Removes leading and trailing spaces */
  def Trim(str: String): String = js.native
  def TryParseInitialUserValue(userStr: String): js.Array[ClientUserValue] = js.native
  /** Tries to resolve user names from string. Pushes either ClientUserValue (if resolved successfully) or original string (if not) to the resulting array. */
  def TryParseUserControlValue(userStr: String, separator: String): js.Array[_] = js.native
}

