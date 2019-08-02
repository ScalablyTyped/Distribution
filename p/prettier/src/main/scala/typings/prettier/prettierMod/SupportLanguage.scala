package typings.prettier.prettierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SupportLanguage extends js.Object {
  var aceMode: js.UndefOr[String] = js.undefined
  var aliases: js.UndefOr[js.Array[String]] = js.undefined
  var codemirrorMimeType: js.UndefOr[String] = js.undefined
  var codemirrorMode: js.UndefOr[String] = js.undefined
  var extensions: js.UndefOr[js.Array[String]] = js.undefined
  var filenames: js.UndefOr[js.Array[String]] = js.undefined
  var group: js.UndefOr[String] = js.undefined
  var linguistLanguageId: js.UndefOr[Double] = js.undefined
  var name: String
  var parsers: js.Array[BuiltInParserName | String]
  var since: js.UndefOr[String] = js.undefined
  var tmScope: js.UndefOr[String] = js.undefined
  var vscodeLanguageIds: js.UndefOr[js.Array[String]] = js.undefined
}

object SupportLanguage {
  @scala.inline
  def apply(
    name: String,
    parsers: js.Array[BuiltInParserName | String],
    aceMode: String = null,
    aliases: js.Array[String] = null,
    codemirrorMimeType: String = null,
    codemirrorMode: String = null,
    extensions: js.Array[String] = null,
    filenames: js.Array[String] = null,
    group: String = null,
    linguistLanguageId: Int | Double = null,
    since: String = null,
    tmScope: String = null,
    vscodeLanguageIds: js.Array[String] = null
  ): SupportLanguage = {
    val __obj = js.Dynamic.literal(name = name, parsers = parsers)
    if (aceMode != null) __obj.updateDynamic("aceMode")(aceMode)
    if (aliases != null) __obj.updateDynamic("aliases")(aliases)
    if (codemirrorMimeType != null) __obj.updateDynamic("codemirrorMimeType")(codemirrorMimeType)
    if (codemirrorMode != null) __obj.updateDynamic("codemirrorMode")(codemirrorMode)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    if (filenames != null) __obj.updateDynamic("filenames")(filenames)
    if (group != null) __obj.updateDynamic("group")(group)
    if (linguistLanguageId != null) __obj.updateDynamic("linguistLanguageId")(linguistLanguageId.asInstanceOf[js.Any])
    if (since != null) __obj.updateDynamic("since")(since)
    if (tmScope != null) __obj.updateDynamic("tmScope")(tmScope)
    if (vscodeLanguageIds != null) __obj.updateDynamic("vscodeLanguageIds")(vscodeLanguageIds)
    __obj.asInstanceOf[SupportLanguage]
  }
}

