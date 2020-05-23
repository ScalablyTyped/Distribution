package typings.sindresorhusIs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pipe extends js.Object {
  var pipe: js.Function
}

object Pipe {
  @scala.inline
  def apply(pipe: js.Function): Pipe = {
    val __obj = js.Dynamic.literal(pipe = pipe.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pipe]
  }
}

