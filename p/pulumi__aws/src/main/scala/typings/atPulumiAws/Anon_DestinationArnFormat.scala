package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DestinationArnFormat extends js.Object {
  var destinationArn: Input[String]
  var format: Input[String]
}

object Anon_DestinationArnFormat {
  @scala.inline
  def apply(destinationArn: Input[String], format: Input[String]): Anon_DestinationArnFormat = {
    val __obj = js.Dynamic.literal(destinationArn = destinationArn.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_DestinationArnFormat]
  }
}

