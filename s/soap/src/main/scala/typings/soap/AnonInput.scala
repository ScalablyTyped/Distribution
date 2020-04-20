package typings.soap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInput extends js.Object {
  var input: js.Any
  var output: js.Any
}

object AnonInput {
  @scala.inline
  def apply(input: js.Any, output: js.Any): AnonInput = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInput]
  }
}

