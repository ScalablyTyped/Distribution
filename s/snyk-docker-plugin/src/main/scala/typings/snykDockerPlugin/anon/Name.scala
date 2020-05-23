package typings.snykDockerPlugin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Name extends js.Object {
  var name: String
  var prettyName: String
  var version: String
}

object Name {
  @scala.inline
  def apply(name: String, prettyName: String, version: String): Name = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], prettyName = prettyName.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
}

