package typings.atPulumiCloud.serviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atPulumiCloud.atPulumiCloudStrings.SharedVolume
  - typings.atPulumiCloud.atPulumiCloudStrings.HostPathVolume
*/
trait VolumeKind extends js.Object

object VolumeKind {
  @scala.inline
  def HostPathVolume: typings.atPulumiCloud.atPulumiCloudStrings.HostPathVolume = this.cast("HostPathVolume")
  @scala.inline
  def SharedVolume: typings.atPulumiCloud.atPulumiCloudStrings.SharedVolume = this.cast("SharedVolume")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

