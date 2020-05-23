package typings.snykDockerPlugin.analyzerTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OSRelease extends js.Object {
  var name: String
  var prettyName: String
  var version: String
}

object OSRelease {
  @scala.inline
  def apply(name: String, prettyName: String, version: String): OSRelease = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], prettyName = prettyName.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[OSRelease]
  }
}

