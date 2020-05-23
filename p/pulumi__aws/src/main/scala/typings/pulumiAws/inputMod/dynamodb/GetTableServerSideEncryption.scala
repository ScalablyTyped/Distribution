package typings.pulumiAws.inputMod.dynamodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTableServerSideEncryption extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.native
  var kmsKeyArn: js.UndefOr[String] = js.native
}

object GetTableServerSideEncryption {
  @scala.inline
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, kmsKeyArn: String = null): GetTableServerSideEncryption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (kmsKeyArn != null) __obj.updateDynamic("kmsKeyArn")(kmsKeyArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTableServerSideEncryption]
  }
}

