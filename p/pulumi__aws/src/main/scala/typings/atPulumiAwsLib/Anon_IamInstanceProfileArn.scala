package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IamInstanceProfileArn extends js.Object {
  var ami: java.lang.String
  var associatePublicIpAddress: js.UndefOr[scala.Boolean] = js.undefined
  var availabilityZone: java.lang.String
  var ebsBlockDevices: js.Array[Anon_DeviceNameVolumeTypeEncryptedIopsDeleteOnTerminationVolumeSize]
  var ebsOptimized: js.UndefOr[scala.Boolean] = js.undefined
  var ephemeralBlockDevices: js.Array[Anon_DeviceNameVirtualName]
  var iamInstanceProfile: js.UndefOr[java.lang.String] = js.undefined
  var iamInstanceProfileArn: js.UndefOr[java.lang.String] = js.undefined
  var instanceType: java.lang.String
  var keyName: java.lang.String
  var monitoring: js.UndefOr[scala.Boolean] = js.undefined
  var placementGroup: java.lang.String
  var placementTenancy: js.UndefOr[java.lang.String] = js.undefined
  var rootBlockDevices: js.Array[Anon_DeleteOnTerminationVolumeTypeIopsVolumeSize]
  var spotPrice: js.UndefOr[java.lang.String] = js.undefined
  var subnetId: java.lang.String
  var tags: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var userData: js.UndefOr[java.lang.String] = js.undefined
  var vpcSecurityGroupIds: js.Array[java.lang.String]
  var weightedCapacity: js.UndefOr[java.lang.String] = js.undefined
}

