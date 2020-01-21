package typings.pulumiAws.protocolTypeMod

import typings.pulumiAws.pulumiAwsStrings.all_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.pulumiAws.pulumiAwsStrings.all_
  - typings.pulumiAws.pulumiAwsStrings.icmp
  - typings.pulumiAws.pulumiAwsStrings.tcp
  - typings.pulumiAws.pulumiAwsStrings.udp
*/
trait ProtocolType extends js.Object

object ProtocolType {
  @scala.inline
  def all: all_ = this.cast("all")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def icmp: typings.pulumiAws.pulumiAwsStrings.icmp = this.cast("icmp")
  @scala.inline
  def tcp: typings.pulumiAws.pulumiAwsStrings.tcp = this.cast("tcp")
  @scala.inline
  def udp: typings.pulumiAws.pulumiAwsStrings.udp = this.cast("udp")
}

