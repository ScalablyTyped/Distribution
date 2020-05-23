package typings.snykDockerPlugin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dependencies extends js.Object {
  var name: String
  var packageFormatVersion: String
  var targetOS: js.Any
  var version: String
}

object Dependencies {
  @scala.inline
  def apply(name: String, packageFormatVersion: String, targetOS: js.Any, version: String): Dependencies = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], packageFormatVersion = packageFormatVersion.asInstanceOf[js.Any], targetOS = targetOS.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dependencies]
  }
}

