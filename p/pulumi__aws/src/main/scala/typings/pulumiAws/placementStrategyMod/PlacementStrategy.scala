package typings.pulumiAws.placementStrategyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.pulumiAws.pulumiAwsStrings.spread
  - typings.pulumiAws.pulumiAwsStrings.cluster
*/
trait PlacementStrategy extends js.Object

object PlacementStrategy {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cluster: typings.pulumiAws.pulumiAwsStrings.cluster = this.cast("cluster")
  @scala.inline
  def spread: typings.pulumiAws.pulumiAwsStrings.spread = this.cast("spread")
}

