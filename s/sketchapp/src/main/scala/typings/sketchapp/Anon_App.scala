package typings.sketchapp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_App extends js.Object {
  var app: String
  var appVersion: String
  var build: Double
  var commit: String
  var compatibilityVersion: Double
  var variant: String
  var version: Double
}

object Anon_App {
  @scala.inline
  def apply(
    app: String,
    appVersion: String,
    build: Double,
    commit: String,
    compatibilityVersion: Double,
    variant: String,
    version: Double
  ): Anon_App = {
    val __obj = js.Dynamic.literal(app = app, appVersion = appVersion, build = build, commit = commit, compatibilityVersion = compatibilityVersion, variant = variant, version = version)
  
    __obj.asInstanceOf[Anon_App]
  }
}

