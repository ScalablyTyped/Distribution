package typings.atPulumiAws.typesOutputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAmiProductCode extends js.Object {
  var productCodeId: String
  var productCodeType: String
}

object GetAmiProductCode {
  @scala.inline
  def apply(productCodeId: String, productCodeType: String): GetAmiProductCode = {
    val __obj = js.Dynamic.literal(productCodeId = productCodeId, productCodeType = productCodeType)
  
    __obj.asInstanceOf[GetAmiProductCode]
  }
}

