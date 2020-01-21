package typings.pulumiAws.capacityReservationMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.instancePlatformMod.InstancePlatform
import typings.pulumiAws.instanceTypeMod.InstanceType
import typings.pulumiAws.tenancyMod.Tenancy
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CapacityReservationArgs extends js.Object {
  /**
    * The Availability Zone in which to create the Capacity Reservation.
    */
  val availabilityZone: Input[String] = js.native
  /**
    * Indicates whether the Capacity Reservation supports EBS-optimized instances.
    */
  val ebsOptimized: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The date and time at which the Capacity Reservation expires. When a Capacity Reservation expires, the reserved capacity is released and you can no longer launch instances into it. Valid values: [RFC3339 time string](https://tools.ietf.org/html/rfc3339#section-5.8) (`YYYY-MM-DDTHH:MM:SSZ`)
    */
  val endDate: js.UndefOr[Input[String]] = js.native
  /**
    * Indicates the way in which the Capacity Reservation ends. Specify either `unlimited` or `limited`.
    */
  val endDateType: js.UndefOr[Input[String]] = js.native
  /**
    * Indicates whether the Capacity Reservation supports instances with temporary, block-level storage.
    */
  val ephemeralStorage: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The number of instances for which to reserve capacity.
    */
  val instanceCount: Input[Double] = js.native
  /**
    * Indicates the type of instance launches that the Capacity Reservation accepts. Specify either `open` or `targeted`.
    */
  val instanceMatchCriteria: js.UndefOr[Input[String]] = js.native
  /**
    * The type of operating system for which to reserve capacity. Valid options are `Linux/UNIX`, `Red Hat Enterprise Linux`, `SUSE Linux`, `Windows`, `Windows with SQL Server`, `Windows with SQL Server Enterprise`, `Windows with SQL Server Standard` or `Windows with SQL Server Web`.
    */
  val instancePlatform: Input[InstancePlatform] = js.native
  /**
    * The instance type for which to reserve capacity.
    */
  val instanceType: Input[InstanceType] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * Indicates the tenancy of the Capacity Reservation. Specify either `default` or `dedicated`.
    */
  val tenancy: js.UndefOr[Input[Tenancy]] = js.native
}

object CapacityReservationArgs {
  @scala.inline
  def apply(
    availabilityZone: Input[String],
    instanceCount: Input[Double],
    instancePlatform: Input[InstancePlatform],
    instanceType: Input[InstanceType],
    ebsOptimized: Input[Boolean] = null,
    endDate: Input[String] = null,
    endDateType: Input[String] = null,
    ephemeralStorage: Input[Boolean] = null,
    instanceMatchCriteria: Input[String] = null,
    tags: Input[StringDictionary[_]] = null,
    tenancy: Input[Tenancy] = null
  ): CapacityReservationArgs = {
    val __obj = js.Dynamic.literal(availabilityZone = availabilityZone.asInstanceOf[js.Any], instanceCount = instanceCount.asInstanceOf[js.Any], instancePlatform = instancePlatform.asInstanceOf[js.Any], instanceType = instanceType.asInstanceOf[js.Any])
    if (ebsOptimized != null) __obj.updateDynamic("ebsOptimized")(ebsOptimized.asInstanceOf[js.Any])
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (endDateType != null) __obj.updateDynamic("endDateType")(endDateType.asInstanceOf[js.Any])
    if (ephemeralStorage != null) __obj.updateDynamic("ephemeralStorage")(ephemeralStorage.asInstanceOf[js.Any])
    if (instanceMatchCriteria != null) __obj.updateDynamic("instanceMatchCriteria")(instanceMatchCriteria.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (tenancy != null) __obj.updateDynamic("tenancy")(tenancy.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapacityReservationArgs]
  }
}

