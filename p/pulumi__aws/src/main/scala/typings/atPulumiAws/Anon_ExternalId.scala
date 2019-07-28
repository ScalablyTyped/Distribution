package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExternalId extends js.Object {
  var externalId: String
  var snsCallerArn: String
}

object Anon_ExternalId {
  @scala.inline
  def apply(externalId: String, snsCallerArn: String): Anon_ExternalId = {
    val __obj = js.Dynamic.literal(externalId = externalId, snsCallerArn = snsCallerArn)
  
    __obj.asInstanceOf[Anon_ExternalId]
  }
}

