package typings.sketchapp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSMetadata extends js.Object {
  var app: String
  var appVersion: String
  var autosaved: Double
  var build: Double
  var commit: String
  var compatibilityVersion: Double
  var created: Anon_App
  var fonts: js.Array[String]
  var pagesAndArtboards: SketchMSPagesAndArtboards
  var saveHistory: js.Array[String]
  var variant: String
  var version: Double
}

object SketchMSMetadata {
  @scala.inline
  def apply(
    app: String,
    appVersion: String,
    autosaved: Double,
    build: Double,
    commit: String,
    compatibilityVersion: Double,
    created: Anon_App,
    fonts: js.Array[String],
    pagesAndArtboards: SketchMSPagesAndArtboards,
    saveHistory: js.Array[String],
    variant: String,
    version: Double
  ): SketchMSMetadata = {
    val __obj = js.Dynamic.literal(app = app, appVersion = appVersion, autosaved = autosaved, build = build, commit = commit, compatibilityVersion = compatibilityVersion, created = created, fonts = fonts, pagesAndArtboards = pagesAndArtboards, saveHistory = saveHistory, variant = variant, version = version)
  
    __obj.asInstanceOf[SketchMSMetadata]
  }
}

