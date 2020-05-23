package typings.primereact.anon

import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Files extends js.Object {
  var files: js.Any
  var xhr: XMLHttpRequest
}

object Files {
  @scala.inline
  def apply(files: js.Any, xhr: XMLHttpRequest): Files = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], xhr = xhr.asInstanceOf[js.Any])
    __obj.asInstanceOf[Files]
  }
}

