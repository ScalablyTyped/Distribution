package typings.atPulumiAws.autoscalingMetricsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atPulumiAws.atPulumiAwsStrings.GroupMinSize
  - typings.atPulumiAws.atPulumiAwsStrings.GroupMaxSize
  - typings.atPulumiAws.atPulumiAwsStrings.GroupDesiredCapacity
  - typings.atPulumiAws.atPulumiAwsStrings.GroupInServiceInstances
  - typings.atPulumiAws.atPulumiAwsStrings.GroupPendingInstances
  - typings.atPulumiAws.atPulumiAwsStrings.GroupStandbyInstances
  - typings.atPulumiAws.atPulumiAwsStrings.GroupTerminatingInstances
  - typings.atPulumiAws.atPulumiAwsStrings.GroupTotalInstances
*/
trait Metric extends js.Object

object Metric {
  @scala.inline
  def GroupDesiredCapacity: typings.atPulumiAws.atPulumiAwsStrings.GroupDesiredCapacity = this.cast("GroupDesiredCapacity")
  @scala.inline
  def GroupInServiceInstances: typings.atPulumiAws.atPulumiAwsStrings.GroupInServiceInstances = this.cast("GroupInServiceInstances")
  @scala.inline
  def GroupMaxSize: typings.atPulumiAws.atPulumiAwsStrings.GroupMaxSize = this.cast("GroupMaxSize")
  @scala.inline
  def GroupMinSize: typings.atPulumiAws.atPulumiAwsStrings.GroupMinSize = this.cast("GroupMinSize")
  @scala.inline
  def GroupPendingInstances: typings.atPulumiAws.atPulumiAwsStrings.GroupPendingInstances = this.cast("GroupPendingInstances")
  @scala.inline
  def GroupStandbyInstances: typings.atPulumiAws.atPulumiAwsStrings.GroupStandbyInstances = this.cast("GroupStandbyInstances")
  @scala.inline
  def GroupTerminatingInstances: typings.atPulumiAws.atPulumiAwsStrings.GroupTerminatingInstances = this.cast("GroupTerminatingInstances")
  @scala.inline
  def GroupTotalInstances: typings.atPulumiAws.atPulumiAwsStrings.GroupTotalInstances = this.cast("GroupTotalInstances")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

