package typings.sketchapp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSMeta extends js.Object {
  var app: String
  var appVersion: String
  var autosaved: Double
  var build: Double
  var commit: String
  var compatibilityVersion: Double
  var created: AnonApp
  var fonts: js.Array[String]
  var pagesAndArtboards: SketchMSPagesAndArtboards
  var saveHistory: js.Array[String]
  var variant: String
  var version: Double
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
    created: AnonApp,
    fonts: js.Array[String],
    pagesAndArtboards: SketchMSPagesAndArtboards,
    saveHistory: js.Array[String],
    variant: String,
    version: Double
  ): SketchMSMeta = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], appVersion = appVersion.asInstanceOf[js.Any], autosaved = autosaved.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], compatibilityVersion = compatibilityVersion.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], fonts = fonts.asInstanceOf[js.Any], pagesAndArtboards = pagesAndArtboards.asInstanceOf[js.Any], saveHistory = saveHistory.asInstanceOf[js.Any], variant = variant.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SketchMSMeta]
  }
}

