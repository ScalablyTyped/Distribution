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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("app")(app)
    __obj.updateDynamic("appVersion")(appVersion)
    __obj.updateDynamic("autosaved")(autosaved)
    __obj.updateDynamic("build")(build)
    __obj.updateDynamic("commit")(commit)
    __obj.updateDynamic("compatibilityVersion")(compatibilityVersion)
    __obj.updateDynamic("created")(created)
    __obj.updateDynamic("fonts")(fonts)
    __obj.updateDynamic("pagesAndArtboards")(pagesAndArtboards)
    __obj.updateDynamic("saveHistory")(saveHistory)
    __obj.updateDynamic("variant")(variant)
    __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[SketchMSMetadata]
  }
}

