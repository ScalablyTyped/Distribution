package typings.atPulumiAws.kmsGetAliasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAliasResult extends js.Object {
  /**
    * The Amazon Resource Name(ARN) of the key alias.
    */
  val arn: String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  val name: String
  /**
    * ARN pointed to by the alias.
    */
  val targetKeyArn: String
  /**
    * Key identifier pointed to by the alias.
    */
  val targetKeyId: String
}

object GetAliasResult {
  @scala.inline
  def apply(arn: String, id: String, name: String, targetKeyArn: String, targetKeyId: String): GetAliasResult = {
    val __obj = js.Dynamic.literal(arn = arn, id = id, name = name, targetKeyArn = targetKeyArn, targetKeyId = targetKeyId)
  
    __obj.asInstanceOf[GetAliasResult]
  }
}

