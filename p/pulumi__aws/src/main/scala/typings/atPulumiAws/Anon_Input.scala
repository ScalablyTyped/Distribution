package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Input extends js.Object {
  var input: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
}

object Anon_Input {
  @scala.inline
  def apply(input: String = null, name: String = null): Anon_Input = {
    val __obj = js.Dynamic.literal()
    if (input != null) __obj.updateDynamic("input")(input)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Anon_Input]
  }
}

