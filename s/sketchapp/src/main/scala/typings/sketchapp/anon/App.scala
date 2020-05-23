package typings.sketchapp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait App extends js.Object {
  var app: String
  var appVersion: String
  var build: Double
  var commit: String
  var compatibilityVersion: Double
  var variant: String
  var version: Double
}

object App {
  @scala.inline
  def apply(
    app: String,
    appVersion: String,
    build: Double,
    commit: String,
    compatibilityVersion: Double,
    variant: String,
    version: Double
  ): App = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], appVersion = appVersion.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], compatibilityVersion = compatibilityVersion.asInstanceOf[js.Any], variant = variant.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[App]
  }
}

