package typings
package realmLib.RealmNs.SyncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Instruction extends js.Object {
  var identity: java.lang.String
  var list_index: js.UndefOr[js.Any] = js.undefined
  var new_identity: js.UndefOr[js.Any] = js.undefined
  var object_identity: js.UndefOr[js.Any] = js.undefined
  var object_type: java.lang.String
  var primary_key: js.UndefOr[java.lang.String] = js.undefined
  var properties: js.UndefOr[js.Any] = js.undefined
  var property: js.UndefOr[js.Any] = js.undefined
  var `type`: realmLib.realmLibStrings.INSERT | realmLib.realmLibStrings.SET | realmLib.realmLibStrings.DELETE | realmLib.realmLibStrings.CLEAR | realmLib.realmLibStrings.LIST_SET | realmLib.realmLibStrings.LIST_INSERT | realmLib.realmLibStrings.LIST_ERASE | realmLib.realmLibStrings.LIST_CLEAR | realmLib.realmLibStrings.ADD_TYPE | realmLib.realmLibStrings.ADD_PROPERTIES | realmLib.realmLibStrings.CHANGE_IDENTITY | realmLib.realmLibStrings.SWAP_IDENTITY
  var values: js.UndefOr[js.Any] = js.undefined
}

object Instruction {
  @scala.inline
  def apply(
    identity: java.lang.String,
    object_type: java.lang.String,
    `type`: realmLib.realmLibStrings.INSERT | realmLib.realmLibStrings.SET | realmLib.realmLibStrings.DELETE | realmLib.realmLibStrings.CLEAR | realmLib.realmLibStrings.LIST_SET | realmLib.realmLibStrings.LIST_INSERT | realmLib.realmLibStrings.LIST_ERASE | realmLib.realmLibStrings.LIST_CLEAR | realmLib.realmLibStrings.ADD_TYPE | realmLib.realmLibStrings.ADD_PROPERTIES | realmLib.realmLibStrings.CHANGE_IDENTITY | realmLib.realmLibStrings.SWAP_IDENTITY,
    list_index: js.Any = null,
    new_identity: js.Any = null,
    object_identity: js.Any = null,
    primary_key: java.lang.String = null,
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

