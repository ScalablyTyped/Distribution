package typings.sharepoint

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
trait ISPClientPeoplePickerEntity
  extends /* key */ StringDictionary[js.Any] {
  var Description: js.UndefOr[String] = js.undefined
  var DisplayText: js.UndefOr[String] = js.undefined
  var DomainText: js.UndefOr[String] = js.undefined
  var EntityData: js.UndefOr[Anon_Department] = js.undefined
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
    EntityData: Anon_Department = null,
    EntityType: String = null,
    IsResolved: js.UndefOr[Boolean] = js.undefined,
    Key: String = null,
    ProviderDisplayName: String = null,
    ProviderName: String = null,
    StringDictionary: /* key */ StringDictionary[js.Any] = null
  ): ISPClientPeoplePickerEntity = {
    val __obj = js.Dynamic.literal(MultipleMatches = MultipleMatches)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (DisplayText != null) __obj.updateDynamic("DisplayText")(DisplayText)
    if (DomainText != null) __obj.updateDynamic("DomainText")(DomainText)
    if (EntityData != null) __obj.updateDynamic("EntityData")(EntityData)
    if (EntityType != null) __obj.updateDynamic("EntityType")(EntityType)
    if (!js.isUndefined(IsResolved)) __obj.updateDynamic("IsResolved")(IsResolved)
    if (Key != null) __obj.updateDynamic("Key")(Key)
    if (ProviderDisplayName != null) __obj.updateDynamic("ProviderDisplayName")(ProviderDisplayName)
    if (ProviderName != null) __obj.updateDynamic("ProviderName")(ProviderName)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ISPClientPeoplePickerEntity]
  }
}

