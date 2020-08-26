package typings.pulumiCloud.serviceMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharedVolume extends Volume {
  var kind: typings.pulumiCloud.pulumiCloudStrings.SharedVolume = js.native
  var name: String = js.native
}

@JSImport("@pulumi/cloud/service", "SharedVolume")
@js.native
object SharedVolume extends TopLevel[SharedVolumeConstructor]

