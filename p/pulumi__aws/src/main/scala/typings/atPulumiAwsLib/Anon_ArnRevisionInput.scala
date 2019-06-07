package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArnRevisionInput extends js.Object {
  var arn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var revision: atPulumiPulumiLib.outputMod.Input[scala.Double]
}

object Anon_ArnRevisionInput {
  @scala.inline
  def apply(
    arn: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    revision: atPulumiPulumiLib.outputMod.Input[scala.Double]
  ): Anon_ArnRevisionInput = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ArnRevisionInput]
  }
}

