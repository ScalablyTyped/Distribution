package typings
package sketchappLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_App extends js.Object {
  var app: java.lang.String
  var appVersion: java.lang.String
  var build: scala.Double
  var commit: java.lang.String
  var compatibilityVersion: scala.Double
  var variant: java.lang.String
  var version: scala.Double
}

object Anon_App {
  @scala.inline
  def apply(
    app: java.lang.String,
    appVersion: java.lang.String,
    build: scala.Double,
    commit: java.lang.String,
    compatibilityVersion: scala.Double,
    variant: java.lang.String,
    version: scala.Double
  ): Anon_App = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("app")(app)
    __obj.updateDynamic("appVersion")(appVersion)
    __obj.updateDynamic("build")(build)
    __obj.updateDynamic("commit")(commit)
    __obj.updateDynamic("compatibilityVersion")(compatibilityVersion)
    __obj.updateDynamic("variant")(variant)
    __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[Anon_App]
  }
}

