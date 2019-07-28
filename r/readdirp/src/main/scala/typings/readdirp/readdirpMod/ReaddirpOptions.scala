package typings.readdirp.readdirpMod

import typings.readdirp.readdirpStrings.all
import typings.readdirp.readdirpStrings.directories
import typings.readdirp.readdirpStrings.files
import typings.readdirp.readdirpStrings.files_directories
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReaddirpOptions extends js.Object {
  var alwaysStat: js.UndefOr[Boolean] = js.undefined
  var depth: js.UndefOr[Double] = js.undefined
  var directoryFilter: js.UndefOr[js.Function1[/* entry */ EntryInfo, Boolean]] = js.undefined
  var fileFilter: js.UndefOr[String | js.Array[String] | (js.Function1[/* entry */ EntryInfo, Boolean])] = js.undefined
  var lstat: js.UndefOr[Boolean] = js.undefined
  var root: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[files | directories | files_directories | all] = js.undefined
}

object ReaddirpOptions {
  @scala.inline
  def apply(
    alwaysStat: js.UndefOr[Boolean] = js.undefined,
    depth: Int | Double = null,
    directoryFilter: /* entry */ EntryInfo => Boolean = null,
    fileFilter: String | js.Array[String] | (js.Function1[/* entry */ EntryInfo, Boolean]) = null,
    lstat: js.UndefOr[Boolean] = js.undefined,
    root: String = null,
    `type`: files | directories | files_directories | all = null
  ): ReaddirpOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alwaysStat)) __obj.updateDynamic("alwaysStat")(alwaysStat)
    if (depth != null) __obj.updateDynamic("depth")(depth.asInstanceOf[js.Any])
    if (directoryFilter != null) __obj.updateDynamic("directoryFilter")(js.Any.fromFunction1(directoryFilter))
    if (fileFilter != null) __obj.updateDynamic("fileFilter")(fileFilter.asInstanceOf[js.Any])
    if (!js.isUndefined(lstat)) __obj.updateDynamic("lstat")(lstat)
    if (root != null) __obj.updateDynamic("root")(root)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaddirpOptions]
  }
}

