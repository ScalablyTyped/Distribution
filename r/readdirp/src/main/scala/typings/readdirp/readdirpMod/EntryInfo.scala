package typings.readdirp.readdirpMod

import typings.node.fsMod.Dirent
import typings.node.fsMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntryInfo extends js.Object {
  var basename: String
  var dirent: js.UndefOr[Dirent] = js.undefined
  var fullPath: String
  var path: String
  var stats: js.UndefOr[Stats] = js.undefined
}

object EntryInfo {
  @scala.inline
  def apply(basename: String, fullPath: String, path: String, dirent: Dirent = null, stats: Stats = null): EntryInfo = {
    val __obj = js.Dynamic.literal(basename = basename, fullPath = fullPath, path = path)
    if (dirent != null) __obj.updateDynamic("dirent")(dirent)
    if (stats != null) __obj.updateDynamic("stats")(stats)
    __obj.asInstanceOf[EntryInfo]
  }
}

