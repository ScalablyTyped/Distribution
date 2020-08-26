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
trait CapacityReservationState extends js.Object {
  /**
    * The ARN of the Capacity Reservation.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The Availability Zone in which to create the Capacity Reservation.
    */
  val availabilityZone: js.UndefOr[Input[String]] = js.native
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
  val instanceCount: js.UndefOr[Input[Double]] = js.native
  /**
    * Indicates the type of instance launches that the Capacity Reservation accepts. Specify either `open` or `targeted`.
    */
  val instanceMatchCriteria: js.UndefOr[Input[String]] = js.native
  /**
    * The type of operating system for which to reserve capacity. Valid options are `Linux/UNIX`, `Red Hat Enterprise Linux`, `SUSE Linux`, `Windows`, `Windows with SQL Server`, `Windows with SQL Server Enterprise`, `Windows with SQL Server Standard` or `Windows with SQL Server Web`.
    */
  val instancePlatform: js.UndefOr[Input[InstancePlatform]] = js.native
  /**
    * The instance type for which to reserve capacity.
    */
  val instanceType: js.UndefOr[Input[InstanceType]] = js.native
  /**
    * A map of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * Indicates the tenancy of the Capacity Reservation. Specify either `default` or `dedicated`.
    */
  val tenancy: js.UndefOr[Input[Tenancy]] = js.native
}

object CapacityReservationState {
  @scala.inline
  def apply(): CapacityReservationState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CapacityReservationState]
  }
  @scala.inline
  implicit class CapacityReservationStateOps[Self <: CapacityReservationState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setAvailabilityZone(value: Input[String]): Self = this.set("availabilityZone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailabilityZone: Self = this.set("availabilityZone", js.undefined)
    @scala.inline
    def setEbsOptimized(value: Input[Boolean]): Self = this.set("ebsOptimized", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEbsOptimized: Self = this.set("ebsOptimized", js.undefined)
    @scala.inline
    def setEndDate(value: Input[String]): Self = this.set("endDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndDate: Self = this.set("endDate", js.undefined)
    @scala.inline
    def setEndDateType(value: Input[String]): Self = this.set("endDateType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndDateType: Self = this.set("endDateType", js.undefined)
    @scala.inline
    def setEphemeralStorage(value: Input[Boolean]): Self = this.set("ephemeralStorage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEphemeralStorage: Self = this.set("ephemeralStorage", js.undefined)
    @scala.inline
    def setInstanceCount(value: Input[Double]): Self = this.set("instanceCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceCount: Self = this.set("instanceCount", js.undefined)
    @scala.inline
    def setInstanceMatchCriteria(value: Input[String]): Self = this.set("instanceMatchCriteria", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceMatchCriteria: Self = this.set("instanceMatchCriteria", js.undefined)
    @scala.inline
    def setInstancePlatform(value: Input[InstancePlatform]): Self = this.set("instancePlatform", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstancePlatform: Self = this.set("instancePlatform", js.undefined)
    @scala.inline
    def setInstanceType(value: Input[InstanceType]): Self = this.set("instanceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceType: Self = this.set("instanceType", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setTenancy(value: Input[Tenancy]): Self = this.set("tenancy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTenancy: Self = this.set("tenancy", js.undefined)
  }
  
}

