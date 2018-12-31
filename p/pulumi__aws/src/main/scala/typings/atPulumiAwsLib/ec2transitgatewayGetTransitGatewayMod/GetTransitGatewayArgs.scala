package typings
package atPulumiAwsLib.ec2transitgatewayGetTransitGatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTransitGatewayArgs extends js.Object {
  /**
    * One or more configuration blocks containing name-values filters. Detailed below.
    */
  val filters: js.UndefOr[js.Array[atPulumiAwsLib.Anon_Values]] = js.undefined
  /**
    * Identifier of the EC2 Transit Gateway.
    */
  val id: js.UndefOr[java.lang.String] = js.undefined
  val tags: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
}

