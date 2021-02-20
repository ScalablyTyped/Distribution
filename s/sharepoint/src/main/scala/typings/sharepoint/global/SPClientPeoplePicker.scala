package typings.sharepoint.global

import typings.sharepoint.ISPClientPeoplePickerEntity
import typings.sharepoint.ISPClientPeoplePickerSchema
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SPClientPeoplePicker")
@js.native
class SPClientPeoplePicker ()
  extends typings.sharepoint.SPClientPeoplePicker
object SPClientPeoplePicker {
  
  @JSGlobal("SPClientPeoplePicker")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("SPClientPeoplePicker.AddAutoFillMetaData")
  @js.native
  def AddAutoFillMetaData(
    pickerObj: typings.sharepoint.SPClientPeoplePicker,
    options: js.Array[ISPClientPeoplePickerEntity],
    numOpts: Double
  ): js.Array[ISPClientPeoplePickerEntity] = js.native
  
  /* static member */
  @JSGlobal("SPClientPeoplePicker.AugmentEntity")
  @js.native
  def AugmentEntity(entity: ISPClientPeoplePickerEntity): ISPClientPeoplePickerEntity = js.native
  
  /* static member */
  @JSGlobal("SPClientPeoplePicker.AugmentEntitySuggestions")
  @js.native
  def AugmentEntitySuggestions(
    pickerObj: typings.sharepoint.SPClientPeoplePicker,
    allEntities: js.Array[ISPClientPeoplePickerEntity]
  ): js.Array[ISPClientPeoplePickerEntity] = js.native
  @JSGlobal("SPClientPeoplePicker.AugmentEntitySuggestions")
  @js.native
  def AugmentEntitySuggestions(
    pickerObj: typings.sharepoint.SPClientPeoplePicker,
    allEntities: js.Array[ISPClientPeoplePickerEntity],
    mergeLocal: Boolean
  ): js.Array[ISPClientPeoplePickerEntity] = js.native
  
  /* static member */
  @JSGlobal("SPClientPeoplePicker.BuildAutoFillMenuItems")
  @js.native
  def BuildAutoFillMenuItems(pickerObj: typings.sharepoint.SPClientPeoplePicker, options: js.Array[ISPClientPeoplePickerEntity]): js.Array[ISPClientPeoplePickerEntity] = js.native
  
  /* static member */
  @JSGlobal("SPClientPeoplePicker.BuildUnresolvedEntity")
  @js.native
  def BuildUnresolvedEntity(key: String, dispText: String): ISPClientPeoplePickerEntity = js.native
  
  /* static member */
  @JSGlobal("SPClientPeoplePicker.CreateSPPrincipalType")
  @js.native
  def CreateSPPrincipalType(acctStr: String): Double = js.native
  
  // = 'Title';
  /* static member */
  @JSGlobal("SPClientPeoplePicker.DescriptionName")
  @js.native
  def DescriptionName: String = js.native
  @scala.inline
  def DescriptionName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DescriptionName")(x.asInstanceOf[js.Any])
  
  // = 'Key';
  /* static member */
  @JSGlobal("SPClientPeoplePicker.DisplayTextName")
  @js.native
  def DisplayTextName: String = js.native
  @scala.inline
  def DisplayTextName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DisplayTextName")(x.asInstanceOf[js.Any])
  
  // = 'AutoFillKey';
  /* static member */
  @JSGlobal("SPClientPeoplePicker.DisplayTextProperty")
  @js.native
  def DisplayTextProperty: String = js.native
  @scala.inline
  def DisplayTextProperty_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DisplayTextProperty")(x.asInstanceOf[js.Any])
  
  // = 'AutoFillTitleText';
  /* static member */
  @JSGlobal("SPClientPeoplePicker.DomainProperty")
  @js.native
  def DomainProperty: String = js.native
  @scala.inline
  def DomainProperty_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DomainProperty")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("SPClientPeoplePicker.GetTopLevelControl")
  @js.native
  def GetTopLevelControl(elmChild: HTMLElement): HTMLElement = js.native
  
  /* static member */
  @JSGlobal("SPClientPeoplePicker.InitializeStandalonePeoplePicker")
  @js.native
  def InitializeStandalonePeoplePicker(
    clientId: String,
    value: js.Array[ISPClientPeoplePickerEntity],
    schema: ISPClientPeoplePickerSchema
  ): Unit = js.native
  
  /* static member */
  @JSGlobal("SPClientPeoplePicker.IsUserEntity")
  @js.native
  def IsUserEntity(entity: ISPClientPeoplePickerEntity): Boolean = js.native
  
  // = "UNVALIDATED_EMAIL_ADDRESS";
  /* static member */
  @JSGlobal("SPClientPeoplePicker.KeyProperty")
  @js.native
  def KeyProperty: String = js.native
  @scala.inline
  def KeyProperty_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("KeyProperty")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("SPClientPeoplePicker.ParseUserKeyPaste")
  @js.native
  def ParseUserKeyPaste(userKey: String): String = js.native
  
  /* static member */
  @JSGlobal("SPClientPeoplePicker.PickerObjectFromSubElement")
  @js.native
  def PickerObjectFromSubElement(elmSubElement: HTMLElement): typings.sharepoint.SPClientPeoplePicker = js.native
  
  // = 'Description';
  /* static member */
  @JSGlobal("SPClientPeoplePicker.SIPAddressName")
  @js.native
  def SIPAddressName: String = js.native
  @scala.inline
  def SIPAddressName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SIPAddressName")(x.asInstanceOf[js.Any])
  
  // = 'DisplayText';
  /* static member */
  @JSGlobal("SPClientPeoplePicker.SubDisplayTextName")
  @js.native
  def SubDisplayTextName: String = js.native
  @scala.inline
  def SubDisplayTextName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SubDisplayTextName")(x.asInstanceOf[js.Any])
  
  // = 'AutoFillDisplayText';
  /* static member */
  @JSGlobal("SPClientPeoplePicker.SubDisplayTextProperty")
  @js.native
  def SubDisplayTextProperty: String = js.native
  @scala.inline
  def SubDisplayTextProperty_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SubDisplayTextProperty")(x.asInstanceOf[js.Any])
  
  // = 'SIPAddress';
  /* static member */
  @JSGlobal("SPClientPeoplePicker.SuggestionsName")
  @js.native
  def SuggestionsName: String = js.native
  @scala.inline
  def SuggestionsName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SuggestionsName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("SPClientPeoplePicker.TestLocalMatch")
  @js.native
  def TestLocalMatch(strSearchLower: String, dataEntity: ISPClientPeoplePickerEntity): Boolean = js.native
  
  // = 'AutoFillSubDisplayText';
  /* static member */
  @JSGlobal("SPClientPeoplePicker.TitleTextProperty")
  @js.native
  def TitleTextProperty: String = js.native
  @scala.inline
  def TitleTextProperty_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TitleTextProperty")(x.asInstanceOf[js.Any])
  
  // = 'MultipleMatches';
  /* static member */
  @JSGlobal("SPClientPeoplePicker.UnvalidatedEmailAddressKey")
  @js.native
  def UnvalidatedEmailAddressKey: String = js.native
  @scala.inline
  def UnvalidatedEmailAddressKey_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UnvalidatedEmailAddressKey")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("SPClientPeoplePicker.ValueName")
  @js.native
  def ValueName: String = js.native
  @scala.inline
  def ValueName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ValueName")(x.asInstanceOf[js.Any])
  
  // = 'DomainText';
  /* static member */
  object SPClientPeoplePickerDict
}
