package typings.sketchapp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonApp extends js.Object {
  var app: String
  var appVersion: String
  var build: Double
  var commit: String
  var compatibilityVersion: Double
  var variant: String
  var version: Double
}

object AnonApp {
  @scala.inline
  def apply(
    app: String,
    appVersion: String,
    build: Double,
    commit: String,
    compatibilityVersion: Double,
    variant: String,
    version: Double
  ): AnonApp = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], appVersion = appVersion.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], compatibilityVersion = compatibilityVersion.asInstanceOf[js.Any], variant = variant.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonApp]
  }
}

