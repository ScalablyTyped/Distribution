package typings
package atPulumiAwsLib.ec2GetRouteTablesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRouteTablesArgs extends js.Object {
  /**
    * Custom filter block as described below.
    */
  val filters: js.UndefOr[js.Array[atPulumiAwsLib.Anon_Values]] = js.undefined
  /**
    * A mapping of tags, each pair of which must exactly match
    * a pair on the desired route tables.
    */
  val tags: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  /**
    * The VPC ID that you want to filter from.
    */
  val vpcId: js.UndefOr[java.lang.String] = js.undefined
}

