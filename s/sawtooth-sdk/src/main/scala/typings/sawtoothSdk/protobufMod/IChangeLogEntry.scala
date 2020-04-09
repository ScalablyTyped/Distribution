package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.ChangeLogEntry.ISuccessor
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IChangeLogEntry extends js.Object {
  /** ChangeLogEntry additions */
  var additions: js.UndefOr[js.Array[Uint8Array] | Null] = js.undefined
  /** ChangeLogEntry parent */
  var parent: js.UndefOr[Uint8Array | Null] = js.undefined
  /** ChangeLogEntry successors */
  var successors: js.UndefOr[js.Array[ISuccessor] | Null] = js.undefined
}

object IChangeLogEntry {
  @scala.inline
  def apply(
    additions: js.Array[Uint8Array] = null,
    parent: Uint8Array = null,
    successors: js.Array[ISuccessor] = null
  ): IChangeLogEntry = {
    val __obj = js.Dynamic.literal()
    if (additions != null) __obj.updateDynamic("additions")(additions.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (successors != null) __obj.updateDynamic("successors")(successors.asInstanceOf[js.Any])
    __obj.asInstanceOf[IChangeLogEntry]
  }
}

