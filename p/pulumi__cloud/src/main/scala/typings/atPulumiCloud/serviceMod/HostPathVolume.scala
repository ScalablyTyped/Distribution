package typings.atPulumiCloud.serviceMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HostPathVolume extends Volume {
  var kind: typings.atPulumiCloud.atPulumiCloudStrings.HostPathVolume
  var path: String
}

@JSImport("@pulumi/cloud/service", "HostPathVolume")
@js.native
object HostPathVolume extends TopLevel[HostPathVolumeConstructor]

