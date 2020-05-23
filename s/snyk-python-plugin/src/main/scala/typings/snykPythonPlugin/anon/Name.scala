package typings.snykPythonPlugin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Name extends js.Object {
  var name: String
  var runtime: String
  var targetFile: String
}

object Name {
  @scala.inline
  def apply(name: String, runtime: String, targetFile: String): Name = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any], targetFile = targetFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
}

