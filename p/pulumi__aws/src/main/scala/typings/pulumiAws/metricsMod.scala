package typings.pulumiAws

import typings.pulumiAws.enumsAutoscalingMod.Metric
import typings.pulumiAws.enumsAutoscalingMod.MetricsGranularity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object metricsMod {
  
  @JSImport("@pulumi/aws/autoscaling/metrics", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pulumi/aws/autoscaling/metrics", "GroupDesiredCapacityMetric")
  @js.native
  def GroupDesiredCapacityMetric: Metric = js.native
  @scala.inline
  def GroupDesiredCapacityMetric_=(x: Metric): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GroupDesiredCapacityMetric")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws/autoscaling/metrics", "GroupInServiceInstancesMetric")
  @js.native
  def GroupInServiceInstancesMetric: Metric = js.native
  @scala.inline
  def GroupInServiceInstancesMetric_=(x: Metric): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GroupInServiceInstancesMetric")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws/autoscaling/metrics", "GroupMaxSizeMetric")
  @js.native
  def GroupMaxSizeMetric: Metric = js.native
  @scala.inline
  def GroupMaxSizeMetric_=(x: Metric): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GroupMaxSizeMetric")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws/autoscaling/metrics", "GroupMinSizeMetric")
  @js.native
  def GroupMinSizeMetric: Metric = js.native
  @scala.inline
  def GroupMinSizeMetric_=(x: Metric): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GroupMinSizeMetric")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws/autoscaling/metrics", "GroupPendingInstances")
  @js.native
  def GroupPendingInstances: Metric = js.native
  @scala.inline
  def GroupPendingInstances_=(x: Metric): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GroupPendingInstances")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws/autoscaling/metrics", "GroupStandbyInstances")
  @js.native
  def GroupStandbyInstances: Metric = js.native
  @scala.inline
  def GroupStandbyInstances_=(x: Metric): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GroupStandbyInstances")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws/autoscaling/metrics", "GroupTerminatingInstances")
  @js.native
  def GroupTerminatingInstances: Metric = js.native
  @scala.inline
  def GroupTerminatingInstances_=(x: Metric): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GroupTerminatingInstances")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws/autoscaling/metrics", "GroupTotalInstances")
  @js.native
  def GroupTotalInstances: Metric = js.native
  @scala.inline
  def GroupTotalInstances_=(x: Metric): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GroupTotalInstances")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws/autoscaling/metrics", "OneMinuteMetricsGranularity")
  @js.native
  def OneMinuteMetricsGranularity: MetricsGranularity = js.native
  @scala.inline
  def OneMinuteMetricsGranularity_=(x: MetricsGranularity): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OneMinuteMetricsGranularity")(x.asInstanceOf[js.Any])
}
