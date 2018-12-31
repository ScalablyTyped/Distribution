package typings
package atPulumiAwsLib.ec2GetRouteTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRouteTableArgs extends js.Object {
  /**
    * Custom filter block as described below.
    */
  val filters: js.UndefOr[js.Array[atPulumiAwsLib.Anon_Values]] = js.undefined
  /**
    * The id of the specific Route Table to retrieve.
    */
  val routeTableId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The id of a Subnet which is connected to the Route Table (not be exported if not given in parameter).
    */
  val subnetId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A mapping of tags, each pair of which must exactly match
    * a pair on the desired Route Table.
    */
  val tags: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  /**
    * The id of the VPC that the desired Route Table belongs to.
    */
  val vpcId: js.UndefOr[java.lang.String] = js.undefined
}

