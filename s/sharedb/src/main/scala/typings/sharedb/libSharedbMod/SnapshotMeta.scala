package typings.sharedb.libSharedbMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapshotMeta
  extends // Users can use server middleware to add additional metadata to snapshots.
/* key */ StringDictionary[js.Any] {
  var ctime: Double
  var mtime: Double
}

object SnapshotMeta {
  @scala.inline
  def apply(
    ctime: Double,
    mtime: Double,
    StringDictionary: // Users can use server middleware to add additional metadata to snapshots.
  /* key */ StringDictionary[js.Any] = null
  ): SnapshotMeta = {
    val __obj = js.Dynamic.literal(ctime = ctime, mtime = mtime)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[SnapshotMeta]
  }
}

