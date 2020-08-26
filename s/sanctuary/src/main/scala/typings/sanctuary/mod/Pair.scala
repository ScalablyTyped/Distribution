package typings.sanctuary.mod

import typings.sanctuary.sanctuaryStrings.sanctuarySlashPair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pair[A, B] extends js.Object {
  var `@@type`: sanctuarySlashPair = js.native
}

object Pair {
  @scala.inline
  def apply[A, B](`@@type`: sanctuarySlashPair): Pair[A, B] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("@@type")(`@@type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pair[A, B]]
  }
  @scala.inline
  implicit class PairOps[Self <: Pair[_, _], A, B] (val x: Self with (Pair[A, B])) extends AnyVal {
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
    def `set@@type`(value: sanctuarySlashPair): Self = this.set("@@type", value.asInstanceOf[js.Any])
  }
  
}

