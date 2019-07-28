package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NameValue extends js.Object {
  var name: Input[String]
  var value: Input[String]
}

object Anon_NameValue {
  @scala.inline
  def apply(name: Input[String], value: Input[String]): Anon_NameValue = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_NameValue]
  }
}

