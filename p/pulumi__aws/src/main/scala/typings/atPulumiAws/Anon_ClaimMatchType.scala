package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClaimMatchType extends js.Object {
  var claim: Input[String]
  var matchType: Input[String]
  var roleArn: Input[String]
  var value: Input[String]
}

object Anon_ClaimMatchType {
  @scala.inline
  def apply(claim: Input[String], matchType: Input[String], roleArn: Input[String], value: Input[String]): Anon_ClaimMatchType = {
    val __obj = js.Dynamic.literal(claim = claim.asInstanceOf[js.Any], matchType = matchType.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ClaimMatchType]
  }
}

