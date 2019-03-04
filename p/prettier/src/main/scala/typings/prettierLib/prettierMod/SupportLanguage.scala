package typings
package prettierLib.prettierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SupportLanguage extends js.Object {
  var aceMode: java.lang.String
  var aliases: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var codemirrorMimeType: java.lang.String
  var codemirrorMode: java.lang.String
  var extensions: js.Array[java.lang.String]
  var filenames: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var group: js.UndefOr[java.lang.String] = js.undefined
  var linguistLanguageId: scala.Double
  var name: java.lang.String
  var parsers: js.Array[BuiltInParserName] | js.Array[java.lang.String]
  var since: js.UndefOr[java.lang.String] = js.undefined
  var tmScope: java.lang.String
  var vscodeLanguageIds: js.Array[java.lang.String]
}

object SupportLanguage {
  @scala.inline
  def apply(
    aceMode: java.lang.String,
    codemirrorMimeType: java.lang.String,
    codemirrorMode: java.lang.String,
    extensions: js.Array[java.lang.String],
    linguistLanguageId: scala.Double,
    name: java.lang.String,
    parsers: js.Array[BuiltInParserName] | js.Array[java.lang.String],
    tmScope: java.lang.String,
    vscodeLanguageIds: js.Array[java.lang.String],
    aliases: js.Array[java.lang.String] = null,
    filenames: js.Array[java.lang.String] = null,
    group: java.lang.String = null,
    since: java.lang.String = null
  ): SupportLanguage = {
    val __obj = js.Dynamic.literal(aceMode = aceMode, codemirrorMimeType = codemirrorMimeType, codemirrorMode = codemirrorMode, extensions = extensions, linguistLanguageId = linguistLanguageId, name = name, parsers = parsers.asInstanceOf[js.Any], tmScope = tmScope, vscodeLanguageIds = vscodeLanguageIds)
    if (aliases != null) __obj.updateDynamic("aliases")(aliases)
    if (filenames != null) __obj.updateDynamic("filenames")(filenames)
    if (group != null) __obj.updateDynamic("group")(group)
    if (since != null) __obj.updateDynamic("since")(since)
    __obj.asInstanceOf[SupportLanguage]
  }
}

