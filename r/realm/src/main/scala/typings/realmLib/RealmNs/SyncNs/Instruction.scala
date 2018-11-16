package typings
package realmLib.RealmNs.SyncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Instruction extends js.Object {
  var identity: java.lang.String
  var list_index: js.UndefOr[_]
  var new_identity: js.UndefOr[_]
  var object_identity: js.UndefOr[_]
  var object_type: java.lang.String
  var primary_key: js.UndefOr[java.lang.String]
  var properties: js.UndefOr[_]
  var property: js.UndefOr[_]
  var `type`: realmLib.realmLibStrings.INSERT | realmLib.realmLibStrings.SET | realmLib.realmLibStrings.DELETE | realmLib.realmLibStrings.CLEAR | realmLib.realmLibStrings.LIST_SET | realmLib.realmLibStrings.LIST_INSERT | realmLib.realmLibStrings.LIST_ERASE | realmLib.realmLibStrings.LIST_CLEAR | realmLib.realmLibStrings.ADD_TYPE | realmLib.realmLibStrings.ADD_PROPERTIES | realmLib.realmLibStrings.CHANGE_IDENTITY | realmLib.realmLibStrings.SWAP_IDENTITY
  var values: js.UndefOr[_]
}

