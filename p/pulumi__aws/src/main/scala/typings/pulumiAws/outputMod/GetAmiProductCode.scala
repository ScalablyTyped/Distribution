package typings.pulumiAws.outputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAmiProductCode extends js.Object {
  var productCodeId: String = js.native
  var productCodeType: String = js.native
}

object GetAmiProductCode {
  @scala.inline
  def apply(productCodeId: String, productCodeType: String): GetAmiProductCode = {
    val __obj = js.Dynamic.literal(productCodeId = productCodeId.asInstanceOf[js.Any], productCodeType = productCodeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAmiProductCode]
  }
}

