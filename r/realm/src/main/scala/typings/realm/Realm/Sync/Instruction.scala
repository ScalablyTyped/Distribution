package typings.realm.Realm.Sync

import typings.realm.realmStrings.ADD_PROPERTIES
import typings.realm.realmStrings.ADD_TYPE
import typings.realm.realmStrings.CHANGE_IDENTITY
import typings.realm.realmStrings.CLEAR
import typings.realm.realmStrings.DELETE
import typings.realm.realmStrings.INSERT
import typings.realm.realmStrings.LIST_CLEAR
import typings.realm.realmStrings.LIST_ERASE
import typings.realm.realmStrings.LIST_INSERT
import typings.realm.realmStrings.LIST_SET
import typings.realm.realmStrings.SET
import typings.realm.realmStrings.SWAP_IDENTITY
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Instruction extends js.Object {
  var identity: String = js.native
  var list_index: js.UndefOr[js.Any] = js.native
  var new_identity: js.UndefOr[js.Any] = js.native
  var object_identity: js.UndefOr[js.Any] = js.native
  var object_type: String = js.native
  var primary_key: js.UndefOr[String] = js.native
  var properties: js.UndefOr[js.Any] = js.native
  var property: js.UndefOr[js.Any] = js.native
  var `type`: INSERT | SET | DELETE | CLEAR | LIST_SET | LIST_INSERT | LIST_ERASE | LIST_CLEAR | ADD_TYPE | ADD_PROPERTIES | CHANGE_IDENTITY | SWAP_IDENTITY = js.native
  var values: js.UndefOr[js.Any] = js.native
}

object Instruction {
  @scala.inline
  def apply(
    identity: String,
    object_type: String,
    `type`: INSERT | SET | DELETE | CLEAR | LIST_SET | LIST_INSERT | LIST_ERASE | LIST_CLEAR | ADD_TYPE | ADD_PROPERTIES | CHANGE_IDENTITY | SWAP_IDENTITY
  ): Instruction = {
    val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any], object_type = object_type.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Instruction]
  }
  @scala.inline
  implicit class InstructionOps[Self <: Instruction] (val x: Self) extends AnyVal {
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
    def setIdentity(value: String): Self = this.set("identity", value.asInstanceOf[js.Any])
    @scala.inline
    def setObject_type(value: String): Self = this.set("object_type", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(
      value: INSERT | SET | DELETE | CLEAR | LIST_SET | LIST_INSERT | LIST_ERASE | LIST_CLEAR | ADD_TYPE | ADD_PROPERTIES | CHANGE_IDENTITY | SWAP_IDENTITY
    ): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setList_index(value: js.Any): Self = this.set("list_index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteList_index: Self = this.set("list_index", js.undefined)
    @scala.inline
    def setNew_identity(value: js.Any): Self = this.set("new_identity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNew_identity: Self = this.set("new_identity", js.undefined)
    @scala.inline
    def setObject_identity(value: js.Any): Self = this.set("object_identity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObject_identity: Self = this.set("object_identity", js.undefined)
    @scala.inline
    def setPrimary_key(value: String): Self = this.set("primary_key", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimary_key: Self = this.set("primary_key", js.undefined)
    @scala.inline
    def setProperties(value: js.Any): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    @scala.inline
    def setProperty(value: js.Any): Self = this.set("property", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperty: Self = this.set("property", js.undefined)
    @scala.inline
    def setValues(value: js.Any): Self = this.set("values", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
  
}

