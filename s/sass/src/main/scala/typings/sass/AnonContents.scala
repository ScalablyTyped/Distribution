package typings.sass

import typings.sass.mod._ImporterReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContents extends _ImporterReturnType {
  var contents: String
}

object AnonContents {
  @scala.inline
  def apply(contents: String): AnonContents = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContents]
  }
}

