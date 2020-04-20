package typings.reactSketchapp.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RedBoxProps extends js.Object {
  /** A JavaScript Error object */
  var error: Error
}

object RedBoxProps {
  @scala.inline
  def apply(error: Error): RedBoxProps = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedBoxProps]
  }
}

