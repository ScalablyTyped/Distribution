package typings.pulumiAws.partitionMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.glue.PartitionStorageDescriptor
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/glue/partition", "Partition")
@js.native
class Partition protected () extends CustomResource {
  /**
    * Create a Partition resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: PartitionArgs) = this()
  def this(name: String, args: PartitionArgs, opts: CustomResourceOptions) = this()
  
  /**
    * ID of the Glue Catalog and database to create the table in. If omitted, this defaults to the AWS Account ID plus the database name.
    */
  val catalogId: Output_[String] = js.native
  
  /**
    * The time at which the partition was created.
    */
  val creationTime: Output_[String] = js.native
  
  /**
    * Name of the metadata database where the table metadata resides. For Hive compatibility, this must be all lowercase.
    */
  val databaseName: Output_[String] = js.native
  
  /**
    * The last time at which the partition was accessed.
    */
  val lastAccessedTime: Output_[String] = js.native
  
  /**
    * The last time at which column statistics were computed for this partition.
    */
  val lastAnalyzedTime: Output_[String] = js.native
  
  /**
    * A map of initialization parameters for the SerDe, in key-value form.
    */
  val parameters: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  
  /**
    * The values that define the partition.
    */
  val partitionValues: Output_[js.Array[String]] = js.native
  
  /**
    * A storage descriptor object containing information about the physical storage of this table. You can refer to the [Glue Developer Guide](https://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-catalog-tables.html#aws-glue-api-catalog-tables-StorageDescriptor) for a full explanation of this object.
    */
  val storageDescriptor: Output_[js.UndefOr[PartitionStorageDescriptor]] = js.native
  
  val tableName: Output_[String] = js.native
}
/* static members */
@JSImport("@pulumi/aws/glue/partition", "Partition")
@js.native
object Partition extends js.Object {
  
  /**
    * Get an existing Partition resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): Partition = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Partition = js.native
  def get(name: String, id: Input[ID], state: PartitionState): Partition = js.native
  def get(name: String, id: Input[ID], state: PartitionState, opts: CustomResourceOptions): Partition = js.native
  
  /**
    * Returns true if the given object is an instance of Partition.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glue/partition.Partition */ Boolean = js.native
}
