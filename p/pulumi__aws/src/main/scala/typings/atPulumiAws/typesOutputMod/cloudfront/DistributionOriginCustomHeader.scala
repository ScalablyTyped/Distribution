package typings.atPulumiAws.typesOutputMod.cloudfront

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DistributionOriginCustomHeader extends js.Object {
  var name: String = js.native
  var value: String = js.native
}

object DistributionOriginCustomHeader {
  @scala.inline
  def apply(name: String, value: String): DistributionOriginCustomHeader = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DistributionOriginCustomHeader]
  }
}

