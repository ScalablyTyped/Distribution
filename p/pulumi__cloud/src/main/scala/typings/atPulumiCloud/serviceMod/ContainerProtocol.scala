package typings.atPulumiCloud.serviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atPulumiCloud.atPulumiCloudStrings.tcp
  - typings.atPulumiCloud.atPulumiCloudStrings.udp
  - typings.atPulumiCloud.atPulumiCloudStrings.http
  - typings.atPulumiCloud.atPulumiCloudStrings.https
*/
trait ContainerProtocol extends js.Object

object ContainerProtocol {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def http: typings.atPulumiCloud.atPulumiCloudStrings.http = this.cast("http")
  @scala.inline
  def https: typings.atPulumiCloud.atPulumiCloudStrings.https = this.cast("https")
  @scala.inline
  def tcp: typings.atPulumiCloud.atPulumiCloudStrings.tcp = this.cast("tcp")
  @scala.inline
  def udp: typings.atPulumiCloud.atPulumiCloudStrings.udp = this.cast("udp")
}

