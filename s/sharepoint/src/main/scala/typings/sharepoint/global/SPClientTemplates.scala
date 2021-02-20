package typings.sharepoint.global

import typings.sharepoint.SP.ClientContext
import typings.sharepoint.SPClientTemplates.ChoiceFormatType
import typings.sharepoint.SPClientTemplates.ClientControlMode
import typings.sharepoint.SPClientTemplates.ClientLookupValue
import typings.sharepoint.SPClientTemplates.ClientUrlValue
import typings.sharepoint.SPClientTemplates.ClientUserValue
import typings.sharepoint.SPClientTemplates.FileSystemObjectType
import typings.sharepoint.SPClientTemplates.RenderContext
import typings.sharepoint.SPClientTemplates.RenderContextForm
import typings.sharepoint.SPClientTemplates.RichTextMode
import typings.sharepoint.SPClientTemplates.TemplateOverridesOptions
import typings.sharepoint.SPClientTemplates.Templates
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SPClientTemplates {
  
  @JSGlobal("SPClientTemplates.ChoiceFormatType")
  @js.native
  object ChoiceFormatType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sharepoint.SPClientTemplates.ChoiceFormatType with Double] = js.native
    
    /* 0 */ val Dropdown: typings.sharepoint.SPClientTemplates.ChoiceFormatType.Dropdown with Double = js.native
    
    /* 1 */ val Radio: typings.sharepoint.SPClientTemplates.ChoiceFormatType.Radio with Double = js.native
  }
  
  @JSGlobal("SPClientTemplates.ClientControlMode")
  @js.native
  object ClientControlMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sharepoint.SPClientTemplates.ClientControlMode with Double] = js.native
    
    /* 1 */ val DisplayForm: typings.sharepoint.SPClientTemplates.ClientControlMode.DisplayForm with Double = js.native
    
    /* 2 */ val EditForm: typings.sharepoint.SPClientTemplates.ClientControlMode.EditForm with Double = js.native
    
    /* 0 */ val Invalid: typings.sharepoint.SPClientTemplates.ClientControlMode.Invalid with Double = js.native
    
    /* 3 */ val NewForm: typings.sharepoint.SPClientTemplates.ClientControlMode.NewForm with Double = js.native
    
    /* 4 */ val View: typings.sharepoint.SPClientTemplates.ClientControlMode.View with Double = js.native
  }
  
  @JSGlobal("SPClientTemplates.ClientFormContext")
  @js.native
  class ClientFormContext ()
    extends typings.sharepoint.SPClientTemplates.ClientFormContext
  
  @JSGlobal("SPClientTemplates.DateTimeCalendarType")
  @js.native
  object DateTimeCalendarType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sharepoint.SPClientTemplates.DateTimeCalendarType with Double] = js.native
    
    /* 13 */ val ChineseLunar: typings.sharepoint.SPClientTemplates.DateTimeCalendarType.ChineseLunar with Double = js.native
    
    /* 1 */ val Gregorian: typings.sharepoint.SPClientTemplates.DateTimeCalendarType.Gregorian with Double = js.native
    
    /* 9 */ val GregorianArabic: typings.sharepoint.SPClientTemplates.DateTimeCalendarType.GregorianArabic with Double = js.native
    
    /* 8 */ val GregorianMEFrench: typings.sharepoint.SPClientTemplates.DateTimeCalendarType.GregorianMEFrench with Double = js.native
    
    /* 10 */ val GregorianXLITEnglish: typings.sharepoint.SPClientTemplates.DateTimeCalendarType.GregorianXLITEnglish with Double = js.native
    
    /* 11 */ val GregorianXLITFrench: typings.sharepoint.SPClientTemplates.DateTimeCalendarType.GregorianXLITFrench with Double = js.native
    
    /* 7 */ val Hebrew: typings.sharepoint.SPClientTemplates.DateTimeCalendarType.Hebrew with Double = js.native
    
    /* 5 */ val Hijri: typings.sharepoint.SPClientTemplates.DateTimeCalendarType.Hijri with Double = js.native
    
    /* 2 */ val Japan: typings.sharepoint.SPClientTemplates.DateTimeCalendarType.Japan with Double = js.native
    
    /* 4 */ val Korea: typings.sharepoint.SPClientTemplates.DateTimeCalendarType.Korea with Double = js.native
    
    /* 12 */ val KoreaJapanLunar: typings.sharepoint.SPClientTemplates.DateTimeCalendarType.KoreaJapanLunar with Double = js.native
    
    /* 0 */ val None: typings.sharepoint.SPClientTemplates.DateTimeCalendarType.None with Double = js.native
    
    /* 14 */ val SakaEra: typings.sharepoint.SPClientTemplates.DateTimeCalendarType.SakaEra with Double = js.native
    
    /* 3 */ val Taiwan: typings.sharepoint.SPClientTemplates.DateTimeCalendarType.Taiwan with Double = js.native
    
    /* 6 */ val Thai: typings.sharepoint.SPClientTemplates.DateTimeCalendarType.Thai with Double = js.native
    
    /* 15 */ val UmAlQura: typings.sharepoint.SPClientTemplates.DateTimeCalendarType.UmAlQura with Double = js.native
  }
  
  @JSGlobal("SPClientTemplates.DateTimeDisplayFormat")
  @js.native
  object DateTimeDisplayFormat extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sharepoint.SPClientTemplates.DateTimeDisplayFormat with Double] = js.native
    
    /* 0 */ val DateOnly: typings.sharepoint.SPClientTemplates.DateTimeDisplayFormat.DateOnly with Double = js.native
    
    /* 1 */ val DateTime: typings.sharepoint.SPClientTemplates.DateTimeDisplayFormat.DateTime with Double = js.native
    
    /* 2 */ val TimeOnly: typings.sharepoint.SPClientTemplates.DateTimeDisplayFormat.TimeOnly with Double = js.native
  }
  
  @JSGlobal("SPClientTemplates.FileSystemObjectType")
  @js.native
  object FileSystemObjectType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sharepoint.SPClientTemplates.FileSystemObjectType with Double] = js.native
    
    /* 1 */ val File: typings.sharepoint.SPClientTemplates.FileSystemObjectType.File with Double = js.native
    
    /* 2 */ val Folder: typings.sharepoint.SPClientTemplates.FileSystemObjectType.Folder with Double = js.native
    
    /* 0 */ val Invalid: typings.sharepoint.SPClientTemplates.FileSystemObjectType.Invalid with Double = js.native
    
    /* 3 */ val Web: typings.sharepoint.SPClientTemplates.FileSystemObjectType.Web with Double = js.native
  }
  
  @JSGlobal("SPClientTemplates.RichTextMode")
  @js.native
  object RichTextMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sharepoint.SPClientTemplates.RichTextMode with Double] = js.native
    
    /* 0 */ val Compatible: typings.sharepoint.SPClientTemplates.RichTextMode.Compatible with Double = js.native
    
    /* 1 */ val FullHtml: typings.sharepoint.SPClientTemplates.RichTextMode.FullHtml with Double = js.native
    
    /* 2 */ val HtmlAsXml: typings.sharepoint.SPClientTemplates.RichTextMode.HtmlAsXml with Double = js.native
    
    /* 3 */ val ThemeHtml: typings.sharepoint.SPClientTemplates.RichTextMode.ThemeHtml with Double = js.native
  }
  
  @JSGlobal("SPClientTemplates.TemplateManager")
  @js.native
  class TemplateManager ()
    extends typings.sharepoint.SPClientTemplates.TemplateManager
  object TemplateManager {
    
    /* static member */
    @JSGlobal("SPClientTemplates.TemplateManager.GetTemplates")
    @js.native
    def GetTemplates(renderCtx: RenderContext): Templates = js.native
    
    /* static member */
    @JSGlobal("SPClientTemplates.TemplateManager.RegisterTemplateOverrides")
    @js.native
    def RegisterTemplateOverrides(renderCtx: TemplateOverridesOptions): Unit = js.native
  }
  
  @JSGlobal("SPClientTemplates.UrlFormatType")
  @js.native
  object UrlFormatType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sharepoint.SPClientTemplates.UrlFormatType with Double] = js.native
    
    /* 0 */ val Hyperlink: typings.sharepoint.SPClientTemplates.UrlFormatType.Hyperlink with Double = js.native
    
    /* 1 */ val Image: typings.sharepoint.SPClientTemplates.UrlFormatType.Image with Double = js.native
  }
  
  @JSGlobal("SPClientTemplates.UserSelectionMode")
  @js.native
  object UserSelectionMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sharepoint.SPClientTemplates.UserSelectionMode with Double] = js.native
    
    /* 1 */ val PeopleAndGroups: typings.sharepoint.SPClientTemplates.UserSelectionMode.PeopleAndGroups with Double = js.native
    
    /* 0 */ val PeopleOnly: typings.sharepoint.SPClientTemplates.UserSelectionMode.PeopleOnly with Double = js.native
  }
  
  @JSGlobal("SPClientTemplates.Utility")
  @js.native
  class Utility ()
    extends typings.sharepoint.SPClientTemplates.Utility
  object Utility {
    
    @JSGlobal("SPClientTemplates.Utility")
    @js.native
    val ^ : js.Any = js.native
    
    /** Represents lookup values array in some strange format */
    /* static member */
    @JSGlobal("SPClientTemplates.Utility.BuildLookupValuesAsString")
    @js.native
    def BuildLookupValuesAsString(choiceArray: js.Array[ClientLookupValue], isMultiLookup: Boolean, setGroupDesc: Boolean): String = js.native
    
    /* static member */
    @JSGlobal("SPClientTemplates.Utility.ChoiceFormatTypeToString")
    @js.native
    def ChoiceFormatTypeToString(fileSystemObjectType: ChoiceFormatType): String = js.native
    
    /* static member */
    @JSGlobal("SPClientTemplates.Utility.ComputeRegisterTypeInfo")
    @js.native
    def ComputeRegisterTypeInfo(renderCtx: TemplateOverridesOptions): js.Any = js.native
    
    /* static member */
    @JSGlobal("SPClientTemplates.Utility.ControlModeToString")
    @js.native
    def ControlModeToString(mode: ClientControlMode): String = js.native
    
    /* static member */
    @JSGlobal("SPClientTemplates.Utility.FileSystemObjectTypeToString")
    @js.native
    def FileSystemObjectTypeToString(fileSystemObjectType: FileSystemObjectType): String = js.native
    
    /* static member */
    @JSGlobal("SPClientTemplates.Utility.GetControlOptions")
    @js.native
    def GetControlOptions(control: HTMLElement): js.Any = js.native
    
    /* static member */
    @JSGlobal("SPClientTemplates.Utility.GetFormContextForCurrentField")
    @js.native
    def GetFormContextForCurrentField(context: RenderContextForm): typings.sharepoint.SPClientTemplates.ClientFormContext = js.native
    
    /* static member */
    @JSGlobal("SPClientTemplates.Utility.GetPropertiesFromPageContextInfo")
    @js.native
    def GetPropertiesFromPageContextInfo(context: RenderContext): Unit = js.native
    
    /** Creates SP.ClientContext based on the specified Web URL. If the SP.Runtime.js script is not loaded, returns null */
    /* static member */
    @JSGlobal("SPClientTemplates.Utility.InitContext")
    @js.native
    def InitContext(webUrl: String): ClientContext = js.native
    
    /* static member */
    @JSGlobal("SPClientTemplates.Utility.IsValidControlMode")
    @js.native
    def IsValidControlMode(mode: Double): Boolean = js.native
    
    /* static member */
    @JSGlobal("SPClientTemplates.Utility.ParseLookupValue")
    @js.native
    def ParseLookupValue(valueStr: String): ClientLookupValue = js.native
    
    /* static member */
    @JSGlobal("SPClientTemplates.Utility.ParseMultiLookupValues")
    @js.native
    def ParseMultiLookupValues(valueStr: String): js.Array[ClientLookupValue] = js.native
    
    /* static member */
    @JSGlobal("SPClientTemplates.Utility.ParseURLValue")
    @js.native
    def ParseURLValue(value: String): ClientUrlValue = js.native
    
    /** Replaces tokens "~site/", "~sitecollection/", "~sitecollectionmasterpagegallery", "{lcid}", "{locale}" and "{siteclienttag}" with appropriate context values */
    /* static member */
    @JSGlobal("SPClientTemplates.Utility.ReplaceUrlTokens")
    @js.native
    def ReplaceUrlTokens(tokenUrl: String): String = js.native
    
    /* static member */
    @JSGlobal("SPClientTemplates.Utility.RichTextModeToString")
    @js.native
    def RichTextModeToString(fileSystemObjectType: RichTextMode): String = js.native
    
    /** Removes leading and trailing spaces */
    /* static member */
    @JSGlobal("SPClientTemplates.Utility.Trim")
    @js.native
    def Trim(str: String): String = js.native
    
    /* static member */
    @JSGlobal("SPClientTemplates.Utility.TryParseInitialUserValue")
    @js.native
    def TryParseInitialUserValue(userStr: String): js.Array[ClientUserValue] = js.native
    
    /** Tries to resolve user names from string. Pushes either ClientUserValue (if resolved successfully) or original string (if not) to the resulting array. */
    /* static member */
    @JSGlobal("SPClientTemplates.Utility.TryParseUserControlValue")
    @js.native
    def TryParseUserControlValue(userStr: String, separator: String): js.Array[_] = js.native
    
    /** Returns ";#" */
    /* static member */
    @JSGlobal("SPClientTemplates.Utility.UserLookupDelimitString")
    @js.native
    def UserLookupDelimitString: String = js.native
    @scala.inline
    def UserLookupDelimitString_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UserLookupDelimitString")(x.asInstanceOf[js.Any])
    
    /** Returns ";#" */
    /* static member */
    @JSGlobal("SPClientTemplates.Utility.UserMultiValueDelimitString")
    @js.native
    def UserMultiValueDelimitString: String = js.native
    @scala.inline
    def UserMultiValueDelimitString_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UserMultiValueDelimitString")(x.asInstanceOf[js.Any])
  }
}
