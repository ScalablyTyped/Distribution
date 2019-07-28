package typings.sharp

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Input extends js.Object {
  var input: String | Buffer
}

object Anon_Input {
  @scala.inline
  def apply(input: String | Buffer): Anon_Input = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Input]
  }
}

