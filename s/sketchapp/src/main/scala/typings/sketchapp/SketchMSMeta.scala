package typings.sketchapp

import typings.sketchapp.anon.App
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SketchMSMeta extends js.Object {
  var app: String = js.native
  var appVersion: String = js.native
  var autosaved: Double = js.native
  var build: Double = js.native
  var commit: String = js.native
  var compatibilityVersion: Double = js.native
  var created: App = js.native
  var fonts: js.Array[String] = js.native
  var pagesAndArtboards: SketchMSPagesAndArtboards = js.native
  var saveHistory: js.Array[String] = js.native
  var variant: String = js.native
  var version: Double = js.native
}

object SketchMSMeta {
  @scala.inline
  def apply(
    app: String,
    appVersion: String,
    autosaved: Double,
    build: Double,
    commit: String,
    compatibilityVersion: Double,
    created: App,
    fonts: js.Array[String],
    pagesAndArtboards: SketchMSPagesAndArtboards,
    saveHistory: js.Array[String],
    variant: String,
    version: Double
  ): SketchMSMeta = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], appVersion = appVersion.asInstanceOf[js.Any], autosaved = autosaved.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], compatibilityVersion = compatibilityVersion.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], fonts = fonts.asInstanceOf[js.Any], pagesAndArtboards = pagesAndArtboards.asInstanceOf[js.Any], saveHistory = saveHistory.asInstanceOf[js.Any], variant = variant.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSMeta]
  }
  @scala.inline
  implicit class SketchMSMetaOps[Self <: SketchMSMeta] (val x: Self) extends AnyVal {
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
    def setApp(value: String): Self = this.set("app", value.asInstanceOf[js.Any])
    @scala.inline
    def setAppVersion(value: String): Self = this.set("appVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutosaved(value: Double): Self = this.set("autosaved", value.asInstanceOf[js.Any])
    @scala.inline
    def setBuild(value: Double): Self = this.set("build", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommit(value: String): Self = this.set("commit", value.asInstanceOf[js.Any])
    @scala.inline
    def setCompatibilityVersion(value: Double): Self = this.set("compatibilityVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreated(value: App): Self = this.set("created", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontsVarargs(value: String*): Self = this.set("fonts", js.Array(value :_*))
    @scala.inline
    def setFonts(value: js.Array[String]): Self = this.set("fonts", value.asInstanceOf[js.Any])
    @scala.inline
    def setPagesAndArtboards(value: SketchMSPagesAndArtboards): Self = this.set("pagesAndArtboards", value.asInstanceOf[js.Any])
    @scala.inline
    def setSaveHistoryVarargs(value: String*): Self = this.set("saveHistory", js.Array(value :_*))
    @scala.inline
    def setSaveHistory(value: js.Array[String]): Self = this.set("saveHistory", value.asInstanceOf[js.Any])
    @scala.inline
    def setVariant(value: String): Self = this.set("variant", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
  }
  
}

