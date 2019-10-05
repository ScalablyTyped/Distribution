package typings.atPulumiAws.typesInputMod.elasticloadbalancing

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SslNegotiationPolicyAttribute extends js.Object {
  /**
    * The name of the attribute
    */
  var name: Input[String]
  /**
    * The value of the attribute
    */
  var value: Input[String]
}

object SslNegotiationPolicyAttribute {
  @scala.inline
  def apply(name: Input[String], value: Input[String]): SslNegotiationPolicyAttribute = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SslNegotiationPolicyAttribute]
  }
}

