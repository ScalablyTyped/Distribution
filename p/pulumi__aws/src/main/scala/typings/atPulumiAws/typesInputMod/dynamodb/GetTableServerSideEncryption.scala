package typings.atPulumiAws.typesInputMod.dynamodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTableServerSideEncryption extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.undefined
}

object GetTableServerSideEncryption {
  @scala.inline
  def apply(enabled: js.UndefOr[Boolean] = js.undefined): GetTableServerSideEncryption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    __obj.asInstanceOf[GetTableServerSideEncryption]
  }
}

