package typings.atPulumiCloud.serviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atPulumiCloud.atPulumiCloudStrings.linux
  - typings.atPulumiCloud.atPulumiCloudStrings.windows
*/
trait HostOperatingSystem extends js.Object

object HostOperatingSystem {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def linux: typings.atPulumiCloud.atPulumiCloudStrings.linux = this.cast("linux")
  @scala.inline
  def windows: typings.atPulumiCloud.atPulumiCloudStrings.windows = this.cast("windows")
}

