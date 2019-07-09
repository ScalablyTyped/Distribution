package typings
package readdirpLib.readdirpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReaddirpOptions extends js.Object {
  var alwaysStat: js.UndefOr[scala.Boolean] = js.undefined
  var depth: js.UndefOr[scala.Double] = js.undefined
  var directoryFilter: js.UndefOr[js.Function1[/* entry */ EntryInfo, scala.Boolean]] = js.undefined
  var fileFilter: js.UndefOr[
    java.lang.String | js.Array[java.lang.String] | (js.Function1[/* entry */ EntryInfo, scala.Boolean])
  ] = js.undefined
  var lstat: js.UndefOr[scala.Boolean] = js.undefined
  var root: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[
    readdirpLib.readdirpLibStrings.files | readdirpLib.readdirpLibStrings.directories | readdirpLib.readdirpLibStrings.files_directories | readdirpLib.readdirpLibStrings.all
  ] = js.undefined
}

object ReaddirpOptions {
  @scala.inline
  def apply(
    alwaysStat: js.UndefOr[scala.Boolean] = js.undefined,
    depth: scala.Int | scala.Double = null,
    directoryFilter: /* entry */ EntryInfo => scala.Boolean = null,
    fileFilter: java.lang.String | js.Array[java.lang.String] | (js.Function1[/* entry */ EntryInfo, scala.Boolean]) = null,
    lstat: js.UndefOr[scala.Boolean] = js.undefined,
    root: java.lang.String = null,
    `type`: readdirpLib.readdirpLibStrings.files | readdirpLib.readdirpLibStrings.directories | readdirpLib.readdirpLibStrings.files_directories | readdirpLib.readdirpLibStrings.all = null
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

