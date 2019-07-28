package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NameValuesArray extends js.Object {
  var name: Input[String]
  var values: Input[js.Array[Input[String]]]
}

object Anon_NameValuesArray {
  @scala.inline
  def apply(name: Input[String], values: Input[js.Array[Input[String]]]): Anon_NameValuesArray = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_NameValuesArray]
  }
}

