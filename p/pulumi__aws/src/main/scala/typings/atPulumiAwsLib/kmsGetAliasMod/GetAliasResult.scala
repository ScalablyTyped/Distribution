package typings
package atPulumiAwsLib.kmsGetAliasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAliasResult extends js.Object {
  /**
    * The Amazon Resource Name(ARN) of the key alias.
    */
  val arn: java.lang.String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  /**
    * ARN pointed to by the alias.
    */
  val targetKeyArn: java.lang.String
  /**
    * Key identifier pointed to by the alias.
    */
  val targetKeyId: java.lang.String
}

object GetAliasResult {
  @scala.inline
  def apply(
    arn: java.lang.String,
    id: java.lang.String,
    targetKeyArn: java.lang.String,
    targetKeyId: java.lang.String
  ): GetAliasResult = {
    val __obj = js.Dynamic.literal(arn = arn, id = id, targetKeyArn = targetKeyArn, targetKeyId = targetKeyId)
  
    __obj.asInstanceOf[GetAliasResult]
  }
}

