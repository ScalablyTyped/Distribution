package typings.sharedb.sharedbMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnapshotMeta
  extends // Users can use server middleware to add additional metadata to snapshots.
/* key */ StringDictionary[js.Any] {
  var ctime: Double = js.native
  var mtime: Double = js.native
}

object SnapshotMeta {
  @scala.inline
  def apply(ctime: Double, mtime: Double): SnapshotMeta = {
    val __obj = js.Dynamic.literal(ctime = ctime.asInstanceOf[js.Any], mtime = mtime.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotMeta]
  }
  @scala.inline
  implicit class SnapshotMetaOps[Self <: SnapshotMeta] (val x: Self) extends AnyVal {
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
    def setCtime(value: Double): Self = this.set("ctime", value.asInstanceOf[js.Any])
    @scala.inline
    def setMtime(value: Double): Self = this.set("mtime", value.asInstanceOf[js.Any])
  }
  
}

