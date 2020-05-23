package typings.sass.anon

import typings.sass.mod._ImporterReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait File extends _ImporterReturnType {
  var file: String
}

object File {
  @scala.inline
  def apply(file: String): File = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    __obj.asInstanceOf[File]
  }
}

