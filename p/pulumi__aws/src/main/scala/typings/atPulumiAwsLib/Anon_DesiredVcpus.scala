package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DesiredVcpus extends js.Object {
  var bidPercentage: js.UndefOr[scala.Double] = js.undefined
  var desiredVcpus: js.UndefOr[scala.Double] = js.undefined
  var ec2KeyPair: js.UndefOr[java.lang.String] = js.undefined
  var imageId: js.UndefOr[java.lang.String] = js.undefined
  var instanceRole: java.lang.String
  var instanceTypes: js.Array[java.lang.String]
  var maxVcpus: scala.Double
  var minVcpus: scala.Double
  var securityGroupIds: js.Array[java.lang.String]
  var spotIamFleetRole: js.UndefOr[java.lang.String] = js.undefined
  var subnets: js.Array[java.lang.String]
  var tags: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var `type`: java.lang.String
}

