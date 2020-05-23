package typings.snykPhpPlugin.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhpPlugin extends js.Object {
  var name: String
  var targetFile: String
}

object PhpPlugin {
  @scala.inline
  def apply(name: String, targetFile: String): PhpPlugin = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], targetFile = targetFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhpPlugin]
  }
}

