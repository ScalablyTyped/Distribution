package typings.sawtoothSdk.protobufMod.ChangeLogEntry

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a Successor. */
@js.native
trait ISuccessor extends js.Object {
  /** Successor deletions */
  var deletions: js.UndefOr[js.Array[Uint8Array] | Null] = js.native
  /** Successor successor */
  var successor: js.UndefOr[Uint8Array | Null] = js.native
}

object ISuccessor {
  @scala.inline
  def apply(): ISuccessor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISuccessor]
  }
  @scala.inline
  implicit class ISuccessorOps[Self <: ISuccessor] (val x: Self) extends AnyVal {
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
    def setDeletionsVarargs(value: Uint8Array*): Self = this.set("deletions", js.Array(value :_*))
    @scala.inline
    def setDeletions(value: js.Array[Uint8Array]): Self = this.set("deletions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeletions: Self = this.set("deletions", js.undefined)
    @scala.inline
    def setDeletionsNull: Self = this.set("deletions", null)
    @scala.inline
    def setSuccessor(value: Uint8Array): Self = this.set("successor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuccessor: Self = this.set("successor", js.undefined)
    @scala.inline
    def setSuccessorNull: Self = this.set("successor", null)
  }
  
}

