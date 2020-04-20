package typings.pulumiAws.outputMod.dynamodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTableServerSideEncryption extends js.Object {
  var enabled: Boolean = js.native
  var kmsKeyArn: String = js.native
}

object GetTableServerSideEncryption {
  @scala.inline
  def apply(enabled: Boolean, kmsKeyArn: String): GetTableServerSideEncryption = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], kmsKeyArn = kmsKeyArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTableServerSideEncryption]
  }
}

