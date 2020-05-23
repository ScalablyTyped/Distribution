package typings.snykDockerPlugin.analyzerTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Binary extends js.Object {
  var name: String
  var version: String
}

object Binary {
  @scala.inline
  def apply(name: String, version: String): Binary = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Binary]
  }
}

