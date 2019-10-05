package typings.atPulumiAws.typesOutputMod.dynamodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTableServerSideEncryption extends js.Object {
  var enabled: Boolean
}

object GetTableServerSideEncryption {
  @scala.inline
  def apply(enabled: Boolean): GetTableServerSideEncryption = {
    val __obj = js.Dynamic.literal(enabled = enabled)
  
    __obj.asInstanceOf[GetTableServerSideEncryption]
  }
}

