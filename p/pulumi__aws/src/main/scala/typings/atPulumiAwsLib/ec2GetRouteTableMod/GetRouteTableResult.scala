package typings
package atPulumiAwsLib.ec2GetRouteTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRouteTableResult extends js.Object {
  val associations: js.Array[atPulumiAwsLib.Anon_SubnetIdRouteTableAssociationId]
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  /**
    * The ID of the AWS account that owns the route table
    */
  val ownerId: java.lang.String
  /**
    * The Route Table ID.
    */
  val routeTableId: java.lang.String
  val routes: js.Array[atPulumiAwsLib.Anon_InstanceId]
  /**
    * The Subnet ID.
    */
  val subnetId: java.lang.String
  val tags: org.scalablytyped.runtime.StringDictionary[js.Any]
  val vpcId: java.lang.String
}

