package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExternalIdSnsCallerArn extends js.Object {
  var externalId: Input[String]
  var snsCallerArn: Input[String]
}

object Anon_ExternalIdSnsCallerArn {
  @scala.inline
  def apply(externalId: Input[String], snsCallerArn: Input[String]): Anon_ExternalIdSnsCallerArn = {
    val __obj = js.Dynamic.literal(externalId = externalId.asInstanceOf[js.Any], snsCallerArn = snsCallerArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ExternalIdSnsCallerArn]
  }
}

