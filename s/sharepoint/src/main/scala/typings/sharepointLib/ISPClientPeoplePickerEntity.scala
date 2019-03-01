package typings
package sharepointLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
trait ISPClientPeoplePickerEntity
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var Description: js.UndefOr[java.lang.String] = js.undefined
  var DisplayText: js.UndefOr[java.lang.String] = js.undefined
  var DomainText: js.UndefOr[java.lang.String] = js.undefined
  var EntityData: js.UndefOr[Anon_Department] = js.undefined
  var EntityType: js.UndefOr[java.lang.String] = js.undefined
  var IsResolved: js.UndefOr[scala.Boolean] = js.undefined
  var Key: js.UndefOr[java.lang.String] = js.undefined
  var MultipleMatches: js.Array[ISPClientPeoplePickerEntity]
  var ProviderDisplayName: js.UndefOr[java.lang.String] = js.undefined
  var ProviderName: js.UndefOr[java.lang.String] = js.undefined
}

object ISPClientPeoplePickerEntity {
  @scala.inline
  def apply(
    MultipleMatches: js.Array[ISPClientPeoplePickerEntity],
    Description: java.lang.String = null,
    DisplayText: java.lang.String = null,
    DomainText: java.lang.String = null,
    EntityData: Anon_Department = null,
    EntityType: java.lang.String = null,
    IsResolved: js.UndefOr[scala.Boolean] = js.undefined,
    Key: java.lang.String = null,
    ProviderDisplayName: java.lang.String = null,
    ProviderName: java.lang.String = null,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): ISPClientPeoplePickerEntity = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("MultipleMatches")(MultipleMatches)
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

