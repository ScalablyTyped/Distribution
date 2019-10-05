package typings.atPulumiAws.typesOutputMod.cloudfront

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DistributionOriginCustomHeader extends js.Object {
  var name: String
  var value: String
}

object DistributionOriginCustomHeader {
  @scala.inline
  def apply(name: String, value: String): DistributionOriginCustomHeader = {
    val __obj = js.Dynamic.literal(name = name, value = value)
  
    __obj.asInstanceOf[DistributionOriginCustomHeader]
  }
}

