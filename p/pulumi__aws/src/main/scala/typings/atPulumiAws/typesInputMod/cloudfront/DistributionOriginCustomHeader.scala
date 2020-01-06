package typings.atPulumiAws.typesInputMod.cloudfront

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DistributionOriginCustomHeader extends js.Object {
  var name: Input[String] = js.native
  var value: Input[String] = js.native
}

object DistributionOriginCustomHeader {
  @scala.inline
  def apply(name: Input[String], value: Input[String]): DistributionOriginCustomHeader = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DistributionOriginCustomHeader]
  }
}

