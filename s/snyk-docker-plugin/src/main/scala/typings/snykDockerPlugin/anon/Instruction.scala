package typings.snykDockerPlugin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Instruction extends js.Object {
  var instruction: String
}

object Instruction {
  @scala.inline
  def apply(instruction: String): Instruction = {
    val __obj = js.Dynamic.literal(instruction = instruction.asInstanceOf[js.Any])
    __obj.asInstanceOf[Instruction]
  }
}

