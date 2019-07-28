package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeyValuesArray extends js.Object {
  var key: Input[String]
  var values: Input[js.Array[Input[String]]]
}

object Anon_KeyValuesArray {
  @scala.inline
  def apply(key: Input[String], values: Input[js.Array[Input[String]]]): Anon_KeyValuesArray = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_KeyValuesArray]
  }
}

