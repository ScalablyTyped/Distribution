package typings.primereact

import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFiles extends js.Object {
  var files: js.Any
  var xhr: XMLHttpRequest
}

object AnonFiles {
  @scala.inline
  def apply(files: js.Any, xhr: XMLHttpRequest): AnonFiles = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], xhr = xhr.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFiles]
  }
}

