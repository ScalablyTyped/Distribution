package typings
package atPulumiAwsLib.kmsGetKeyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetKeyResult extends js.Object {
  val arn: java.lang.String
  val awsAccountId: java.lang.String
  val creationDate: java.lang.String
  val deletionDate: java.lang.String
  val description: java.lang.String
  val enabled: scala.Boolean
  val expirationModel: java.lang.String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  val keyManager: java.lang.String
  val keyState: java.lang.String
  val keyUsage: java.lang.String
  val origin: java.lang.String
  val validTo: java.lang.String
}

