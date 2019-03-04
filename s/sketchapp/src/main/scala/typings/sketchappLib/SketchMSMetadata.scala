package typings
package sketchappLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSMetadata extends js.Object {
  var app: java.lang.String
  var appVersion: java.lang.String
  var autosaved: scala.Double
  var build: scala.Double
  var commit: java.lang.String
  var compatibilityVersion: scala.Double
  var created: Anon_App
  var fonts: js.Array[java.lang.String]
  var pagesAndArtboards: SketchMSPagesAndArtboards
  var saveHistory: js.Array[java.lang.String]
  var variant: java.lang.String
  var version: scala.Double
}

object SketchMSMetadata {
  @scala.inline
  def apply(
    app: java.lang.String,
    appVersion: java.lang.String,
    autosaved: scala.Double,
    build: scala.Double,
    commit: java.lang.String,
    compatibilityVersion: scala.Double,
    created: Anon_App,
    fonts: js.Array[java.lang.String],
    pagesAndArtboards: SketchMSPagesAndArtboards,
    saveHistory: js.Array[java.lang.String],
    variant: java.lang.String,
    version: scala.Double
  ): SketchMSMetadata = {
    val __obj = js.Dynamic.literal(app = app, appVersion = appVersion, autosaved = autosaved, build = build, commit = commit, compatibilityVersion = compatibilityVersion, created = created, fonts = fonts, pagesAndArtboards = pagesAndArtboards, saveHistory = saveHistory, variant = variant, version = version)
  
    __obj.asInstanceOf[SketchMSMetadata]
  }
}

