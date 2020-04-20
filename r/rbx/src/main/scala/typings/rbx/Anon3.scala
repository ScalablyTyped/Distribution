package typings.rbx

import typings.rbx.rbxStrings.centered
import typings.rbx.rbxStrings.justified
import typings.rbx.rbxStrings.left
import typings.rbx.rbxStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon3 extends js.Object {
  var value: centered | justified | left | right
}

object Anon3 {
  @scala.inline
  def apply(value: centered | justified | left | right): Anon3 = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon3]
  }
}

