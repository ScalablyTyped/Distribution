package typings.pulumiAws.metricsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.pulumiAws.pulumiAwsStrings.GroupMinSize
  - typings.pulumiAws.pulumiAwsStrings.GroupMaxSize
  - typings.pulumiAws.pulumiAwsStrings.GroupDesiredCapacity
  - typings.pulumiAws.pulumiAwsStrings.GroupInServiceInstances
  - typings.pulumiAws.pulumiAwsStrings.GroupPendingInstances
  - typings.pulumiAws.pulumiAwsStrings.GroupStandbyInstances
  - typings.pulumiAws.pulumiAwsStrings.GroupTerminatingInstances
  - typings.pulumiAws.pulumiAwsStrings.GroupTotalInstances
*/
trait Metric extends js.Object

object Metric {
  @scala.inline
  def GroupDesiredCapacity: typings.pulumiAws.pulumiAwsStrings.GroupDesiredCapacity = this.cast("GroupDesiredCapacity")
  @scala.inline
  def GroupInServiceInstances: typings.pulumiAws.pulumiAwsStrings.GroupInServiceInstances = this.cast("GroupInServiceInstances")
  @scala.inline
  def GroupMaxSize: typings.pulumiAws.pulumiAwsStrings.GroupMaxSize = this.cast("GroupMaxSize")
  @scala.inline
  def GroupMinSize: typings.pulumiAws.pulumiAwsStrings.GroupMinSize = this.cast("GroupMinSize")
  @scala.inline
  def GroupPendingInstances: typings.pulumiAws.pulumiAwsStrings.GroupPendingInstances = this.cast("GroupPendingInstances")
  @scala.inline
  def GroupStandbyInstances: typings.pulumiAws.pulumiAwsStrings.GroupStandbyInstances = this.cast("GroupStandbyInstances")
  @scala.inline
  def GroupTerminatingInstances: typings.pulumiAws.pulumiAwsStrings.GroupTerminatingInstances = this.cast("GroupTerminatingInstances")
  @scala.inline
  def GroupTotalInstances: typings.pulumiAws.pulumiAwsStrings.GroupTotalInstances = this.cast("GroupTotalInstances")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

