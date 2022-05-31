package typings.sharepoint.global

import typings.sharepoint.ISPClientPeoplePickerEntity
import typings.sharepoint.ISPClientPeoplePickerSchema
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SPClientPeoplePicker")
@js.native
class SPClientPeoplePicker ()
  extends StObject
     with typings.sharepoint.SPClientPeoplePicker
object SPClientPeoplePicker {
  
  @JSGlobal("SPClientPeoplePicker")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def AddAutoFillMetaData(
    pickerObj: typings.sharepoint.SPClientPeoplePicker,
    options: js.Array[ISPClientPeoplePickerEntity],
    numOpts: Double
  ): js.Array[ISPClientPeoplePickerEntity] = (^.asInstanceOf[js.Dynamic].applyDynamic("AddAutoFillMetaData")(pickerObj.asInstanceOf[js.Any], options.asInstanceOf[js.Any], numOpts.asInstanceOf[js.Any])).asInstanceOf[js.Array[ISPClientPeoplePickerEntity]]
  
  /* static member */
  inline def AugmentEntity(entity: ISPClientPeoplePickerEntity): ISPClientPeoplePickerEntity = ^.asInstanceOf[js.Dynamic].applyDynamic("AugmentEntity")(entity.asInstanceOf[js.Any]).asInstanceOf[ISPClientPeoplePickerEntity]
  
  /* static member */
  inline def AugmentEntitySuggestions(
    pickerObj: typings.sharepoint.SPClientPeoplePicker,
    allEntities: js.Array[ISPClientPeoplePickerEntity]
  ): js.Array[ISPClientPeoplePickerEntity] = (^.asInstanceOf[js.Dynamic].applyDynamic("AugmentEntitySuggestions")(pickerObj.asInstanceOf[js.Any], allEntities.asInstanceOf[js.Any])).asInstanceOf[js.Array[ISPClientPeoplePickerEntity]]
  inline def AugmentEntitySuggestions(
    pickerObj: typings.sharepoint.SPClientPeoplePicker,
    allEntities: js.Array[ISPClientPeoplePickerEntity],
    mergeLocal: Boolean
  ): js.Array[ISPClientPeoplePickerEntity] = (^.asInstanceOf[js.Dynamic].applyDynamic("AugmentEntitySuggestions")(pickerObj.asInstanceOf[js.Any], allEntities.asInstanceOf[js.Any], mergeLocal.asInstanceOf[js.Any])).asInstanceOf[js.Array[ISPClientPeoplePickerEntity]]
  
  /* static member */
  inline def BuildAutoFillMenuItems(pickerObj: typings.sharepoint.SPClientPeoplePicker, options: js.Array[ISPClientPeoplePickerEntity]): js.Array[ISPClientPeoplePickerEntity] = (^.asInstanceOf[js.Dynamic].applyDynamic("BuildAutoFillMenuItems")(pickerObj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[ISPClientPeoplePickerEntity]]
  
  /* static member */
  inline def BuildUnresolvedEntity(key: String, dispText: String): ISPClientPeoplePickerEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("BuildUnresolvedEntity")(key.asInstanceOf[js.Any], dispText.asInstanceOf[js.Any])).asInstanceOf[ISPClientPeoplePickerEntity]
  
  /* static member */
  inline def CreateSPPrincipalType(acctStr: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateSPPrincipalType")(acctStr.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  // = 'Title';
  /* static member */
  @JSGlobal("SPClientPeoplePicker.DescriptionName")
  @js.native
  def DescriptionName: String = js.native
  inline def DescriptionName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DescriptionName")(x.asInstanceOf[js.Any])
  
  // = 'Key';
  /* static member */
  @JSGlobal("SPClientPeoplePicker.DisplayTextName")
  @js.native
  def DisplayTextName: String = js.native
  inline def DisplayTextName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DisplayTextName")(x.asInstanceOf[js.Any])
  
  // = 'AutoFillKey';
  /* static member */
  @JSGlobal("SPClientPeoplePicker.DisplayTextProperty")
  @js.native
  def DisplayTextProperty: String = js.native
  inline def DisplayTextProperty_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DisplayTextProperty")(x.asInstanceOf[js.Any])
  
  // = 'AutoFillTitleText';
  /* static member */
  @JSGlobal("SPClientPeoplePicker.DomainProperty")
  @js.native
  def DomainProperty: String = js.native
  inline def DomainProperty_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DomainProperty")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def GetTopLevelControl(elmChild: HTMLElement): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("GetTopLevelControl")(elmChild.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  
  /* static member */
  inline def InitializeStandalonePeoplePicker(
    clientId: String,
    value: js.Array[ISPClientPeoplePickerEntity],
    schema: ISPClientPeoplePickerSchema
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("InitializeStandalonePeoplePicker")(clientId.asInstanceOf[js.Any], value.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def IsUserEntity(entity: ISPClientPeoplePickerEntity): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsUserEntity")(entity.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  // = "UNVALIDATED_EMAIL_ADDRESS";
  /* static member */
  @JSGlobal("SPClientPeoplePicker.KeyProperty")
  @js.native
  def KeyProperty: String = js.native
  inline def KeyProperty_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("KeyProperty")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def ParseUserKeyPaste(userKey: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ParseUserKeyPaste")(userKey.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* static member */
  inline def PickerObjectFromSubElement(elmSubElement: HTMLElement): typings.sharepoint.SPClientPeoplePicker = ^.asInstanceOf[js.Dynamic].applyDynamic("PickerObjectFromSubElement")(elmSubElement.asInstanceOf[js.Any]).asInstanceOf[typings.sharepoint.SPClientPeoplePicker]
  
  // = 'Description';
  /* static member */
  @JSGlobal("SPClientPeoplePicker.SIPAddressName")
  @js.native
  def SIPAddressName: String = js.native
  inline def SIPAddressName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SIPAddressName")(x.asInstanceOf[js.Any])
  
  // = 'DisplayText';
  /* static member */
  @JSGlobal("SPClientPeoplePicker.SubDisplayTextName")
  @js.native
  def SubDisplayTextName: String = js.native
  inline def SubDisplayTextName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SubDisplayTextName")(x.asInstanceOf[js.Any])
  
  // = 'AutoFillDisplayText';
  /* static member */
  @JSGlobal("SPClientPeoplePicker.SubDisplayTextProperty")
  @js.native
  def SubDisplayTextProperty: String = js.native
  inline def SubDisplayTextProperty_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SubDisplayTextProperty")(x.asInstanceOf[js.Any])
  
  // = 'SIPAddress';
  /* static member */
  @JSGlobal("SPClientPeoplePicker.SuggestionsName")
  @js.native
  def SuggestionsName: String = js.native
  inline def SuggestionsName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SuggestionsName")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def TestLocalMatch(strSearchLower: String, dataEntity: ISPClientPeoplePickerEntity): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("TestLocalMatch")(strSearchLower.asInstanceOf[js.Any], dataEntity.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  // = 'AutoFillSubDisplayText';
  /* static member */
  @JSGlobal("SPClientPeoplePicker.TitleTextProperty")
  @js.native
  def TitleTextProperty: String = js.native
  inline def TitleTextProperty_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TitleTextProperty")(x.asInstanceOf[js.Any])
  
  // = 'MultipleMatches';
  /* static member */
  @JSGlobal("SPClientPeoplePicker.UnvalidatedEmailAddressKey")
  @js.native
  def UnvalidatedEmailAddressKey: String = js.native
  inline def UnvalidatedEmailAddressKey_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UnvalidatedEmailAddressKey")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("SPClientPeoplePicker.ValueName")
  @js.native
  def ValueName: String = js.native
  inline def ValueName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ValueName")(x.asInstanceOf[js.Any])
}
