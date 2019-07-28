package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Claim extends js.Object {
  var claim: String
  var matchType: String
  var roleArn: String
  var value: String
}

object Anon_Claim {
  @scala.inline
  def apply(claim: String, matchType: String, roleArn: String, value: String): Anon_Claim = {
    val __obj = js.Dynamic.literal(claim = claim, matchType = matchType, roleArn = roleArn, value = value)
  
    __obj.asInstanceOf[Anon_Claim]
  }
}

