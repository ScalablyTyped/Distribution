package typings.snykGoPlugin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Name extends js.Object {
  var name: String
  var runtime: js.UndefOr[String] = js.undefined
  var targetFile: js.Any
}

object Name {
  @scala.inline
  def apply(name: String, targetFile: js.Any, runtime: String = null): Name = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], targetFile = targetFile.asInstanceOf[js.Any])
    if (runtime != null) __obj.updateDynamic("runtime")(runtime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
}

