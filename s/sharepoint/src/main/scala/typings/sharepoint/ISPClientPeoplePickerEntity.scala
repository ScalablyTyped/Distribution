package typings.sharepoint

import org.scalablytyped.runtime.StringDictionary
import typings.sharepoint.anon.Department
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
trait ISPClientPeoplePickerEntity
  extends /* name */ StringDictionary[js.Any] {
  var Description: js.UndefOr[String] = js.undefined
  var DisplayText: js.UndefOr[String] = js.undefined
  var DomainText: js.UndefOr[String] = js.undefined
  var EntityData: js.UndefOr[Department] = js.undefined
  var EntityType: js.UndefOr[String] = js.undefined
  var IsResolved: js.UndefOr[Boolean] = js.undefined
  var Key: js.UndefOr[String] = js.undefined
  var MultipleMatches: js.Array[ISPClientPeoplePickerEntity]
  var ProviderDisplayName: js.UndefOr[String] = js.undefined
  var ProviderName: js.UndefOr[String] = js.undefined
}

object ISPClientPeoplePickerEntity {
  @scala.inline
  def apply(
    MultipleMatches: js.Array[ISPClientPeoplePickerEntity],
    Description: String = null,
    DisplayText: String = null,
    DomainText: String = null,
    EntityData: Department = null,
    EntityType: String = null,
    IsResolved: js.UndefOr[Boolean] = js.undefined,
    Key: String = null,
    ProviderDisplayName: String = null,
    ProviderName: String = null,
    StringDictionary: /* name */ StringDictionary[js.Any] = null
  ): ISPClientPeoplePickerEntity = {
    val __obj = js.Dynamic.literal(MultipleMatches = MultipleMatches.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (DisplayText != null) __obj.updateDynamic("DisplayText")(DisplayText.asInstanceOf[js.Any])
    if (DomainText != null) __obj.updateDynamic("DomainText")(DomainText.asInstanceOf[js.Any])
    if (EntityData != null) __obj.updateDynamic("EntityData")(EntityData.asInstanceOf[js.Any])
    if (EntityType != null) __obj.updateDynamic("EntityType")(EntityType.asInstanceOf[js.Any])
    if (!js.isUndefined(IsResolved)) __obj.updateDynamic("IsResolved")(IsResolved.get.asInstanceOf[js.Any])
    if (Key != null) __obj.updateDynamic("Key")(Key.asInstanceOf[js.Any])
    if (ProviderDisplayName != null) __obj.updateDynamic("ProviderDisplayName")(ProviderDisplayName.asInstanceOf[js.Any])
    if (ProviderName != null) __obj.updateDynamic("ProviderName")(ProviderName.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ISPClientPeoplePickerEntity]
  }
}

