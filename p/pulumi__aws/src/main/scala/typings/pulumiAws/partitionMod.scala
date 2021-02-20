package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.glue.PartitionStorageDescriptor
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object partitionMod {
  
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
  object Partition {
    
    /**
      * Get an existing Partition resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/glue/partition", "Partition.get")
    @js.native
    def get(name: String, id: Input[ID]): Partition = js.native
    @JSImport("@pulumi/aws/glue/partition", "Partition.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Partition = js.native
    @JSImport("@pulumi/aws/glue/partition", "Partition.get")
    @js.native
    def get(name: String, id: Input[ID], state: PartitionState): Partition = js.native
    @JSImport("@pulumi/aws/glue/partition", "Partition.get")
    @js.native
    def get(name: String, id: Input[ID], state: PartitionState, opts: CustomResourceOptions): Partition = js.native
    
    /**
      * Returns true if the given object is an instance of Partition.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/glue/partition", "Partition.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glue/partition.Partition */ Boolean = js.native
  }
  
  @js.native
  trait PartitionArgs extends StObject {
    
    /**
      * ID of the Glue Catalog and database to create the table in. If omitted, this defaults to the AWS Account ID plus the database name.
      */
    val catalogId: js.UndefOr[Input[String]] = js.native
    
    /**
      * Name of the metadata database where the table metadata resides. For Hive compatibility, this must be all lowercase.
      */
    val databaseName: Input[String] = js.native
    
    /**
      * A map of initialization parameters for the SerDe, in key-value form.
      */
    val parameters: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * The values that define the partition.
      */
    val partitionValues: Input[js.Array[Input[String]]] = js.native
    
    /**
      * A storage descriptor object containing information about the physical storage of this table. You can refer to the [Glue Developer Guide](https://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-catalog-tables.html#aws-glue-api-catalog-tables-StorageDescriptor) for a full explanation of this object.
      */
    val storageDescriptor: js.UndefOr[Input[typings.pulumiAws.inputMod.glue.PartitionStorageDescriptor]] = js.native
    
    val tableName: Input[String] = js.native
  }
  object PartitionArgs {
    
    @scala.inline
    def apply(
      databaseName: Input[String],
      partitionValues: Input[js.Array[Input[String]]],
      tableName: Input[String]
    ): PartitionArgs = {
      val __obj = js.Dynamic.literal(databaseName = databaseName.asInstanceOf[js.Any], partitionValues = partitionValues.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[PartitionArgs]
    }
    
    @scala.inline
    implicit class PartitionArgsMutableBuilder[Self <: PartitionArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCatalogId(value: Input[String]): Self = StObject.set(x, "catalogId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCatalogIdUndefined: Self = StObject.set(x, "catalogId", js.undefined)
      
      @scala.inline
      def setDatabaseName(value: Input[String]): Self = StObject.set(x, "databaseName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParameters(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      
      @scala.inline
      def setPartitionValues(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "partitionValues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPartitionValuesVarargs(value: Input[String]*): Self = StObject.set(x, "partitionValues", js.Array(value :_*))
      
      @scala.inline
      def setStorageDescriptor(value: Input[typings.pulumiAws.inputMod.glue.PartitionStorageDescriptor]): Self = StObject.set(x, "storageDescriptor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageDescriptorUndefined: Self = StObject.set(x, "storageDescriptor", js.undefined)
      
      @scala.inline
      def setTableName(value: Input[String]): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PartitionState extends StObject {
    
    /**
      * ID of the Glue Catalog and database to create the table in. If omitted, this defaults to the AWS Account ID plus the database name.
      */
    val catalogId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The time at which the partition was created.
      */
    val creationTime: js.UndefOr[Input[String]] = js.native
    
    /**
      * Name of the metadata database where the table metadata resides. For Hive compatibility, this must be all lowercase.
      */
    val databaseName: js.UndefOr[Input[String]] = js.native
    
    /**
      * The last time at which the partition was accessed.
      */
    val lastAccessedTime: js.UndefOr[Input[String]] = js.native
    
    /**
      * The last time at which column statistics were computed for this partition.
      */
    val lastAnalyzedTime: js.UndefOr[Input[String]] = js.native
    
    /**
      * A map of initialization parameters for the SerDe, in key-value form.
      */
    val parameters: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * The values that define the partition.
      */
    val partitionValues: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * A storage descriptor object containing information about the physical storage of this table. You can refer to the [Glue Developer Guide](https://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-catalog-tables.html#aws-glue-api-catalog-tables-StorageDescriptor) for a full explanation of this object.
      */
    val storageDescriptor: js.UndefOr[Input[typings.pulumiAws.inputMod.glue.PartitionStorageDescriptor]] = js.native
    
    val tableName: js.UndefOr[Input[String]] = js.native
  }
  object PartitionState {
    
    @scala.inline
    def apply(): PartitionState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartitionState]
    }
    
    @scala.inline
    implicit class PartitionStateMutableBuilder[Self <: PartitionState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCatalogId(value: Input[String]): Self = StObject.set(x, "catalogId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCatalogIdUndefined: Self = StObject.set(x, "catalogId", js.undefined)
      
      @scala.inline
      def setCreationTime(value: Input[String]): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
      
      @scala.inline
      def setDatabaseName(value: Input[String]): Self = StObject.set(x, "databaseName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatabaseNameUndefined: Self = StObject.set(x, "databaseName", js.undefined)
      
      @scala.inline
      def setLastAccessedTime(value: Input[String]): Self = StObject.set(x, "lastAccessedTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastAccessedTimeUndefined: Self = StObject.set(x, "lastAccessedTime", js.undefined)
      
      @scala.inline
      def setLastAnalyzedTime(value: Input[String]): Self = StObject.set(x, "lastAnalyzedTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastAnalyzedTimeUndefined: Self = StObject.set(x, "lastAnalyzedTime", js.undefined)
      
      @scala.inline
      def setParameters(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      
      @scala.inline
      def setPartitionValues(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "partitionValues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPartitionValuesUndefined: Self = StObject.set(x, "partitionValues", js.undefined)
      
      @scala.inline
      def setPartitionValuesVarargs(value: Input[String]*): Self = StObject.set(x, "partitionValues", js.Array(value :_*))
      
      @scala.inline
      def setStorageDescriptor(value: Input[typings.pulumiAws.inputMod.glue.PartitionStorageDescriptor]): Self = StObject.set(x, "storageDescriptor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageDescriptorUndefined: Self = StObject.set(x, "storageDescriptor", js.undefined)
      
      @scala.inline
      def setTableName(value: Input[String]): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableNameUndefined: Self = StObject.set(x, "tableName", js.undefined)
    }
  }
}
