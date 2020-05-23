package typings.sass.anon

import typings.sass.mod._ImporterReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Contents extends _ImporterReturnType {
  var contents: String
}

object Contents {
  @scala.inline
  def apply(contents: String): Contents = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any])
    __obj.asInstanceOf[Contents]
  }
}

