package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TypeInputString extends js.Object {
  var `type`: Input[String]
}

object Anon_TypeInputString {
  @scala.inline
  def apply(`type`: Input[String]): Anon_TypeInputString = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_TypeInputString]
  }
}

