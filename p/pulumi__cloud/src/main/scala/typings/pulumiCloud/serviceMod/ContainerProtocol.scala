package typings.pulumiCloud.serviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.pulumiCloud.pulumiCloudStrings.tcp
  - typings.pulumiCloud.pulumiCloudStrings.udp
  - typings.pulumiCloud.pulumiCloudStrings.http
  - typings.pulumiCloud.pulumiCloudStrings.https
*/
trait ContainerProtocol extends js.Object

object ContainerProtocol {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def http: typings.pulumiCloud.pulumiCloudStrings.http = this.cast("http")
  @scala.inline
  def https: typings.pulumiCloud.pulumiCloudStrings.https = this.cast("https")
  @scala.inline
  def tcp: typings.pulumiCloud.pulumiCloudStrings.tcp = this.cast("tcp")
  @scala.inline
  def udp: typings.pulumiCloud.pulumiCloudStrings.udp = this.cast("udp")
}

