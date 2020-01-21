package typings.pulumiAws.outputMod.elasticloadbalancing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SslNegotiationPolicyAttribute extends js.Object {
  /**
    * The name of the attribute
    */
  var name: String = js.native
  /**
    * The value of the attribute
    */
  var value: String = js.native
}

object SslNegotiationPolicyAttribute {
  @scala.inline
  def apply(name: String, value: String): SslNegotiationPolicyAttribute = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SslNegotiationPolicyAttribute]
  }
}

