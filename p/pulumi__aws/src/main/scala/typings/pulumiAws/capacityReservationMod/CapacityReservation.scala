package typings.pulumiAws.capacityReservationMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.instancePlatformMod.InstancePlatform
import typings.pulumiAws.instanceTypeMod.InstanceType
import typings.pulumiAws.tenancyMod.Tenancy
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2/capacityReservation", "CapacityReservation")
@js.native
class CapacityReservation protected () extends CustomResource {
  /**
    * Create a CapacityReservation resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: CapacityReservationArgs) = this()
  def this(name: String, args: CapacityReservationArgs, opts: CustomResourceOptions) = this()
  /**
    * The ARN of the Capacity Reservation.
    */
  val arn: Output_[String] = js.native
  /**
    * The Availability Zone in which to create the Capacity Reservation.
    */
  val availabilityZone: Output_[String] = js.native
  /**
    * Indicates whether the Capacity Reservation supports EBS-optimized instances.
    */
  val ebsOptimized: Output_[js.UndefOr[Boolean]] = js.native
  /**
    * The date and time at which the Capacity Reservation expires. When a Capacity Reservation expires, the reserved capacity is released and you can no longer launch instances into it. Valid values: [RFC3339 time string](https://tools.ietf.org/html/rfc3339#section-5.8) (`YYYY-MM-DDTHH:MM:SSZ`)
    */
  val endDate: Output_[js.UndefOr[String]] = js.native
  /**
    * Indicates the way in which the Capacity Reservation ends. Specify either `unlimited` or `limited`.
    */
  val endDateType: Output_[js.UndefOr[String]] = js.native
  /**
    * Indicates whether the Capacity Reservation supports instances with temporary, block-level storage.
    */
  val ephemeralStorage: Output_[js.UndefOr[Boolean]] = js.native
  /**
    * The number of instances for which to reserve capacity.
    */
  val instanceCount: Output_[Double] = js.native
  /**
    * Indicates the type of instance launches that the Capacity Reservation accepts. Specify either `open` or `targeted`.
    */
  val instanceMatchCriteria: Output_[js.UndefOr[String]] = js.native
  /**
    * The type of operating system for which to reserve capacity. Valid options are `Linux/UNIX`, `Red Hat Enterprise Linux`, `SUSE Linux`, `Windows`, `Windows with SQL Server`, `Windows with SQL Server Enterprise`, `Windows with SQL Server Standard` or `Windows with SQL Server Web`.
    */
  val instancePlatform: Output_[InstancePlatform] = js.native
  /**
    * The instance type for which to reserve capacity.
    */
  val instanceType: Output_[InstanceType] = js.native
  /**
    * A map of tags to assign to the resource.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  /**
    * Indicates the tenancy of the Capacity Reservation. Specify either `default` or `dedicated`.
    */
  val tenancy: Output_[js.UndefOr[Tenancy]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/ec2/capacityReservation", "CapacityReservation")
@js.native
object CapacityReservation extends js.Object {
  /**
    * Get an existing CapacityReservation resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): CapacityReservation = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): CapacityReservation = js.native
  def get(name: String, id: Input[ID], state: CapacityReservationState): CapacityReservation = js.native
  def get(name: String, id: Input[ID], state: CapacityReservationState, opts: CustomResourceOptions): CapacityReservation = js.native
  /**
    * Returns true if the given object is an instance of CapacityReservation.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/capacityReservation.CapacityReservation */ Boolean = js.native
}

