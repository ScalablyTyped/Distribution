package typings.atPulumiAws.ec2TenancyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atPulumiAws.atPulumiAwsStrings.default
  - typings.atPulumiAws.atPulumiAwsStrings.dedicated
*/
trait Tenancy extends js.Object

object Tenancy {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dedicated: typings.atPulumiAws.atPulumiAwsStrings.dedicated = this.cast("dedicated")
  @scala.inline
  def default: typings.atPulumiAws.atPulumiAwsStrings.default = this.cast("default")
}

