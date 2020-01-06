package typings.atPulumiAws.albLoadBalancerTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atPulumiAws.atPulumiAwsStrings.application
  - typings.atPulumiAws.atPulumiAwsStrings.network
*/
trait LoadBalancerType extends js.Object

object LoadBalancerType {
  @scala.inline
  def application: typings.atPulumiAws.atPulumiAwsStrings.application = this.cast("application")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def network: typings.atPulumiAws.atPulumiAwsStrings.network = this.cast("network")
}

