package typings.atPulumiAws.typesOutputMod.elbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SslNegotiationPolicyAttribute extends js.Object {
  /**
    * The name of the attribute
    */
  var name: String
  /**
    * The value of the attribute
    */
  var value: String
}

object SslNegotiationPolicyAttribute {
  @scala.inline
  def apply(name: String, value: String): SslNegotiationPolicyAttribute = {
    val __obj = js.Dynamic.literal(name = name, value = value)
  
    __obj.asInstanceOf[SslNegotiationPolicyAttribute]
  }
}

