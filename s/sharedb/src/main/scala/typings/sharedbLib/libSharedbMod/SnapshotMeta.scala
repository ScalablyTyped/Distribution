package typings
package sharedbLib.libSharedbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapshotMeta
  extends // Users can use server middleware to add additional metadata to snapshots.
/* key */ org.scalablytyped.runtime.StringDictionary[JSONValue] {
  var ctime: scala.Double
  var mtime: scala.Double
}

object SnapshotMeta {
  @scala.inline
  def apply(
    ctime: scala.Double,
    mtime: scala.Double,
    StringDictionary: // Users can use server middleware to add additional metadata to snapshots.
  /* key */ org.scalablytyped.runtime.StringDictionary[JSONValue] = null
  ): SnapshotMeta = {
    val __obj = js.Dynamic.literal(ctime = ctime, mtime = mtime)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[SnapshotMeta]
  }
}

