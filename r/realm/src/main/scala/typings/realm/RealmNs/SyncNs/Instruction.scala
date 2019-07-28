package typings.realm.RealmNs.SyncNs

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

trait Instruction extends js.Object {
  var identity: String
  var list_index: js.UndefOr[js.Any] = js.undefined
  var new_identity: js.UndefOr[js.Any] = js.undefined
  var object_identity: js.UndefOr[js.Any] = js.undefined
  var object_type: String
  var primary_key: js.UndefOr[String] = js.undefined
  var properties: js.UndefOr[js.Any] = js.undefined
  var property: js.UndefOr[js.Any] = js.undefined
  var `type`: INSERT | SET | DELETE | CLEAR | LIST_SET | LIST_INSERT | LIST_ERASE | LIST_CLEAR | ADD_TYPE | ADD_PROPERTIES | CHANGE_IDENTITY | SWAP_IDENTITY
  var values: js.UndefOr[js.Any] = js.undefined
}

object Instruction {
  @scala.inline
  def apply(
    identity: String,
    object_type: String,
    `type`: INSERT | SET | DELETE | CLEAR | LIST_SET | LIST_INSERT | LIST_ERASE | LIST_CLEAR | ADD_TYPE | ADD_PROPERTIES | CHANGE_IDENTITY | SWAP_IDENTITY,
    list_index: js.Any = null,
    new_identity: js.Any = null,
    object_identity: js.Any = null,
    primary_key: String = null,
    properties: js.Any = null,
    property: js.Any = null,
    values: js.Any = null
  ): Instruction = {
    val __obj = js.Dynamic.literal(identity = identity, object_type = object_type)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (list_index != null) __obj.updateDynamic("list_index")(list_index)
    if (new_identity != null) __obj.updateDynamic("new_identity")(new_identity)
    if (object_identity != null) __obj.updateDynamic("object_identity")(object_identity)
    if (primary_key != null) __obj.updateDynamic("primary_key")(primary_key)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (property != null) __obj.updateDynamic("property")(property)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[Instruction]
  }
}

