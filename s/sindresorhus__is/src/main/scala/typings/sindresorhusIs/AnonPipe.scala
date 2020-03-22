package typings.sindresorhusIs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPipe extends js.Object {
  var pipe: js.Function
}

object AnonPipe {
  @scala.inline
  def apply(pipe: js.Function): AnonPipe = {
    val __obj = js.Dynamic.literal(pipe = pipe.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPipe]
  }
}

