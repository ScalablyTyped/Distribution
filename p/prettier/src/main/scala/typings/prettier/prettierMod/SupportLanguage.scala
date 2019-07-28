package typings.prettier.prettierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SupportLanguage extends js.Object {
  var aceMode: String
  var aliases: js.UndefOr[js.Array[String]] = js.undefined
  var codemirrorMimeType: String
  var codemirrorMode: String
  var extensions: js.Array[String]
  var filenames: js.UndefOr[js.Array[String]] = js.undefined
  var group: js.UndefOr[String] = js.undefined
  var linguistLanguageId: Double
  var name: String
  var parsers: js.Array[BuiltInParserName | String]
  var since: js.UndefOr[String] = js.undefined
  var tmScope: String
  var vscodeLanguageIds: js.Array[String]
}

object SupportLanguage {
  @scala.inline
  def apply(
    aceMode: String,
    codemirrorMimeType: String,
    codemirrorMode: String,
    extensions: js.Array[String],
    linguistLanguageId: Double,
    name: String,
    parsers: js.Array[BuiltInParserName | String],
    tmScope: String,
    vscodeLanguageIds: js.Array[String],
    aliases: js.Array[String] = null,
    filenames: js.Array[String] = null,
    group: String = null,
    since: String = null
  ): SupportLanguage = {
    val __obj = js.Dynamic.literal(aceMode = aceMode, codemirrorMimeType = codemirrorMimeType, codemirrorMode = codemirrorMode, extensions = extensions, linguistLanguageId = linguistLanguageId, name = name, parsers = parsers, tmScope = tmScope, vscodeLanguageIds = vscodeLanguageIds)
    if (aliases != null) __obj.updateDynamic("aliases")(aliases)
    if (filenames != null) __obj.updateDynamic("filenames")(filenames)
    if (group != null) __obj.updateDynamic("group")(group)
    if (since != null) __obj.updateDynamic("since")(since)
    __obj.asInstanceOf[SupportLanguage]
  }
}

