package typings.pulumiAws.getAliasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAliasResult extends js.Object {
  /**
    * The Amazon Resource Name(ARN) of the key alias.
    */
  val arn: String = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  val name: String = js.native
  /**
    * ARN pointed to by the alias.
    */
  val targetKeyArn: String = js.native
  /**
    * Key identifier pointed to by the alias.
    */
  val targetKeyId: String = js.native
}

object GetAliasResult {
  @scala.inline
  def apply(arn: String, id: String, name: String, targetKeyArn: String, targetKeyId: String): GetAliasResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], targetKeyArn = targetKeyArn.asInstanceOf[js.Any], targetKeyId = targetKeyId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetAliasResult]
  }
}

