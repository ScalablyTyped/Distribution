package typings.sass

import typings.sass.mod._ImporterReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFile extends _ImporterReturnType {
  var file: String
}

object AnonFile {
  @scala.inline
  def apply(file: String): AnonFile = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFile]
  }
}

