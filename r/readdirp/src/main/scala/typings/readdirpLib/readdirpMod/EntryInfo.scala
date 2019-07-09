package typings
package readdirpLib.readdirpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntryInfo extends js.Object {
  var basename: java.lang.String
  var dirent: js.UndefOr[nodeLib.fsMod.Dirent] = js.undefined
  var fullPath: java.lang.String
  var path: java.lang.String
  var stats: js.UndefOr[nodeLib.fsMod.Stats] = js.undefined
}

object EntryInfo {
  @scala.inline
  def apply(
    basename: java.lang.String,
    fullPath: java.lang.String,
    path: java.lang.String,
    dirent: nodeLib.fsMod.Dirent = null,
    stats: nodeLib.fsMod.Stats = null
  ): EntryInfo = {
    val __obj = js.Dynamic.literal(basename = basename, fullPath = fullPath, path = path)
    if (dirent != null) __obj.updateDynamic("dirent")(dirent)
    if (stats != null) __obj.updateDynamic("stats")(stats)
    __obj.asInstanceOf[EntryInfo]
  }
}

