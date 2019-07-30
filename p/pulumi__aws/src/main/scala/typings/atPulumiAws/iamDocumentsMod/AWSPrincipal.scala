package typings.atPulumiAws.iamDocumentsMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AWSPrincipal extends Principal {
  var AWS: Input[js.Array[Input[String]] | String]
}

object AWSPrincipal {
  @scala.inline
  def apply(AWS: Input[js.Array[Input[String]] | String]): AWSPrincipal = {
    val __obj = js.Dynamic.literal(AWS = AWS.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AWSPrincipal]
  }
}

