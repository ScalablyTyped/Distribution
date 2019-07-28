package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TypeValuesArray extends js.Object {
  var `type`: Input[String]
  var values: Input[js.Array[Input[String]]]
}

object Anon_TypeValuesArray {
  @scala.inline
  def apply(`type`: Input[String], values: Input[js.Array[Input[String]]]): Anon_TypeValuesArray = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_TypeValuesArray]
  }
}

