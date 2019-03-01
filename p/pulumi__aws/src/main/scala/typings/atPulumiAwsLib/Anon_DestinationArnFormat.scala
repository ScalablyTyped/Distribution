package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DestinationArnFormat extends js.Object {
  var destinationArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var format: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_DestinationArnFormat {
  @scala.inline
  def apply(
    destinationArn: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    format: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  ): Anon_DestinationArnFormat = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destinationArn")(destinationArn.asInstanceOf[js.Any])
    __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DestinationArnFormat]
  }
}

