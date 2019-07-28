package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_StatusCodesArray extends js.Object {
  var statusCodes: Input[js.Array[Input[Double]]]
}

object Anon_StatusCodesArray {
  @scala.inline
  def apply(statusCodes: Input[js.Array[Input[Double]]]): Anon_StatusCodesArray = {
    val __obj = js.Dynamic.literal(statusCodes = statusCodes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_StatusCodesArray]
  }
}

