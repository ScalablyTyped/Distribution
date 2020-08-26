package typings.sharepoint

import org.scalablytyped.runtime.StringDictionary
import typings.sharepoint.anon.Department
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
@js.native
trait ISPClientPeoplePickerEntity
  extends /* name */ StringDictionary[js.Any] {
  var Description: js.UndefOr[String] = js.native
  var DisplayText: js.UndefOr[String] = js.native
  var DomainText: js.UndefOr[String] = js.native
  var EntityData: js.UndefOr[Department] = js.native
  var EntityType: js.UndefOr[String] = js.native
  var IsResolved: js.UndefOr[Boolean] = js.native
  var Key: js.UndefOr[String] = js.native
  var MultipleMatches: js.Array[ISPClientPeoplePickerEntity] = js.native
  var ProviderDisplayName: js.UndefOr[String] = js.native
  var ProviderName: js.UndefOr[String] = js.native
}

object ISPClientPeoplePickerEntity {
  @scala.inline
  def apply(MultipleMatches: js.Array[ISPClientPeoplePickerEntity]): ISPClientPeoplePickerEntity = {
    val __obj = js.Dynamic.literal(MultipleMatches = MultipleMatches.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISPClientPeoplePickerEntity]
  }
  @scala.inline
  implicit class ISPClientPeoplePickerEntityOps[Self <: ISPClientPeoplePickerEntity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMultipleMatchesVarargs(value: ISPClientPeoplePickerEntity*): Self = this.set("MultipleMatches", js.Array(value :_*))
    @scala.inline
    def setMultipleMatches(value: js.Array[ISPClientPeoplePickerEntity]): Self = this.set("MultipleMatches", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setDisplayText(value: String): Self = this.set("DisplayText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayText: Self = this.set("DisplayText", js.undefined)
    @scala.inline
    def setDomainText(value: String): Self = this.set("DomainText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomainText: Self = this.set("DomainText", js.undefined)
    @scala.inline
    def setEntityData(value: Department): Self = this.set("EntityData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntityData: Self = this.set("EntityData", js.undefined)
    @scala.inline
    def setEntityType(value: String): Self = this.set("EntityType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntityType: Self = this.set("EntityType", js.undefined)
    @scala.inline
    def setIsResolved(value: Boolean): Self = this.set("IsResolved", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsResolved: Self = this.set("IsResolved", js.undefined)
    @scala.inline
    def setKey(value: String): Self = this.set("Key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("Key", js.undefined)
    @scala.inline
    def setProviderDisplayName(value: String): Self = this.set("ProviderDisplayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProviderDisplayName: Self = this.set("ProviderDisplayName", js.undefined)
    @scala.inline
    def setProviderName(value: String): Self = this.set("ProviderName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProviderName: Self = this.set("ProviderName", js.undefined)
  }
  
}

