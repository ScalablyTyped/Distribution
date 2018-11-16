package typings
package atPulumiCloudLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object serviceMod {
  type ContainerProtocol = atPulumiCloudLib.atPulumiCloudLibStrings.tcp | atPulumiCloudLib.atPulumiCloudLibStrings.udp | atPulumiCloudLib.atPulumiCloudLibStrings.http | atPulumiCloudLib.atPulumiCloudLibStrings.https
  type HostOperatingSystem = atPulumiCloudLib.atPulumiCloudLibStrings.linux | atPulumiCloudLib.atPulumiCloudLibStrings.windows
  type VolumeKind = atPulumiCloudLib.atPulumiCloudLibStrings.SharedVolume | atPulumiCloudLib.atPulumiCloudLibStrings.HostPathVolume
}
