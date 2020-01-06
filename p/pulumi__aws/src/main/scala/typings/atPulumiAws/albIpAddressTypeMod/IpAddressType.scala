package typings.atPulumiAws.albIpAddressTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atPulumiAws.atPulumiAwsStrings.ipv4
  - typings.atPulumiAws.atPulumiAwsStrings.dualstack
*/
trait IpAddressType extends js.Object

object IpAddressType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dualstack: typings.atPulumiAws.atPulumiAwsStrings.dualstack = this.cast("dualstack")
  @scala.inline
  def ipv4: typings.atPulumiAws.atPulumiAwsStrings.ipv4 = this.cast("ipv4")
}

