package typings.prettier.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SupportLanguage extends js.Object {
  var aceMode: js.UndefOr[String] = js.native
  var aliases: js.UndefOr[js.Array[String]] = js.native
  var codemirrorMimeType: js.UndefOr[String] = js.native
  var codemirrorMode: js.UndefOr[String] = js.native
  var extensions: js.UndefOr[js.Array[String]] = js.native
  var filenames: js.UndefOr[js.Array[String]] = js.native
  var group: js.UndefOr[String] = js.native
  var linguistLanguageId: js.UndefOr[Double] = js.native
  var name: String = js.native
  var parsers: js.Array[BuiltInParserName | String] = js.native
  var since: js.UndefOr[String] = js.native
  var tmScope: js.UndefOr[String] = js.native
  var vscodeLanguageIds: js.UndefOr[js.Array[String]] = js.native
}

object SupportLanguage {
  @scala.inline
  def apply(name: String, parsers: js.Array[BuiltInParserName | String]): SupportLanguage = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], parsers = parsers.asInstanceOf[js.Any])
    __obj.asInstanceOf[SupportLanguage]
  }
  @scala.inline
  implicit class SupportLanguageOps[Self <: SupportLanguage] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setParsersVarargs(value: (BuiltInParserName | String)*): Self = this.set("parsers", js.Array(value :_*))
    @scala.inline
    def setParsers(value: js.Array[BuiltInParserName | String]): Self = this.set("parsers", value.asInstanceOf[js.Any])
    @scala.inline
    def setAceMode(value: String): Self = this.set("aceMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAceMode: Self = this.set("aceMode", js.undefined)
    @scala.inline
    def setAliasesVarargs(value: String*): Self = this.set("aliases", js.Array(value :_*))
    @scala.inline
    def setAliases(value: js.Array[String]): Self = this.set("aliases", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAliases: Self = this.set("aliases", js.undefined)
    @scala.inline
    def setCodemirrorMimeType(value: String): Self = this.set("codemirrorMimeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCodemirrorMimeType: Self = this.set("codemirrorMimeType", js.undefined)
    @scala.inline
    def setCodemirrorMode(value: String): Self = this.set("codemirrorMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCodemirrorMode: Self = this.set("codemirrorMode", js.undefined)
    @scala.inline
    def setExtensionsVarargs(value: String*): Self = this.set("extensions", js.Array(value :_*))
    @scala.inline
    def setExtensions(value: js.Array[String]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    @scala.inline
    def setFilenamesVarargs(value: String*): Self = this.set("filenames", js.Array(value :_*))
    @scala.inline
    def setFilenames(value: js.Array[String]): Self = this.set("filenames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilenames: Self = this.set("filenames", js.undefined)
    @scala.inline
    def setGroup(value: String): Self = this.set("group", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    @scala.inline
    def setLinguistLanguageId(value: Double): Self = this.set("linguistLanguageId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinguistLanguageId: Self = this.set("linguistLanguageId", js.undefined)
    @scala.inline
    def setSince(value: String): Self = this.set("since", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSince: Self = this.set("since", js.undefined)
    @scala.inline
    def setTmScope(value: String): Self = this.set("tmScope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTmScope: Self = this.set("tmScope", js.undefined)
    @scala.inline
    def setVscodeLanguageIdsVarargs(value: String*): Self = this.set("vscodeLanguageIds", js.Array(value :_*))
    @scala.inline
    def setVscodeLanguageIds(value: js.Array[String]): Self = this.set("vscodeLanguageIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVscodeLanguageIds: Self = this.set("vscodeLanguageIds", js.undefined)
  }
  
}

