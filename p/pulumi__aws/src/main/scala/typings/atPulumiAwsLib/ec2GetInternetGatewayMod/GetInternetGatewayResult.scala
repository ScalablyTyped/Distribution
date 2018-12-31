package typings
package atPulumiAwsLib.ec2GetInternetGatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetInternetGatewayResult extends js.Object {
  val attachments: js.Array[atPulumiAwsLib.Anon_StateVpcId]
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  val internetGatewayId: java.lang.String
  /**
    * The ID of the AWS account that owns the internet gateway.
    */
  val ownerId: java.lang.String
  val tags: org.scalablytyped.runtime.StringDictionary[js.Any]
}

