package typings.atPulumiAws.typesInputMod.ssm

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PatchBaselineGlobalFilter extends js.Object {
  var key: Input[String]
  var values: Input[js.Array[Input[String]]]
}

object PatchBaselineGlobalFilter {
  @scala.inline
  def apply(key: Input[String], values: Input[js.Array[Input[String]]]): PatchBaselineGlobalFilter = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PatchBaselineGlobalFilter]
  }
}

