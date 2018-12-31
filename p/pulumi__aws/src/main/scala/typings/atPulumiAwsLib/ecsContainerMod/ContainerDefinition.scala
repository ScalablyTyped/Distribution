package typings
package atPulumiAwsLib.ecsContainerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerDefinition extends js.Object {
  var command: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var cpu: js.UndefOr[scala.Double] = js.undefined
  var disableNetworking: js.UndefOr[scala.Boolean] = js.undefined
  var dnsSearchDomains: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var dnsServers: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var dockerLabels: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var dockerSecurityOptions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var entryPoint: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var environment: js.UndefOr[js.Array[KeyValuePair]] = js.undefined
  var essential: js.UndefOr[scala.Boolean] = js.undefined
  var extraHosts: js.UndefOr[js.Array[HostEntry]] = js.undefined
  var hostname: js.UndefOr[java.lang.String] = js.undefined
  var image: js.UndefOr[java.lang.String] = js.undefined
  var links: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var linuxParameters: js.UndefOr[LinuxParameters] = js.undefined
  var logConfiguration: js.UndefOr[LogConfiguration] = js.undefined
  var memory: js.UndefOr[scala.Double] = js.undefined
  var memoryReservation: js.UndefOr[scala.Double] = js.undefined
  var mountPoints: js.UndefOr[js.Array[MountPoint]] = js.undefined
  var name: java.lang.String
  var portMappings: js.UndefOr[js.Array[PortMapping]] = js.undefined
  var privileged: js.UndefOr[scala.Boolean] = js.undefined
  var readonlyRootFilesystem: js.UndefOr[scala.Boolean] = js.undefined
  var ulimits: js.UndefOr[js.Array[Ulimit]] = js.undefined
  var user: js.UndefOr[java.lang.String] = js.undefined
  var volumesFrom: js.UndefOr[js.Array[VolumeFrom]] = js.undefined
  var workingDirectory: js.UndefOr[java.lang.String] = js.undefined
}

