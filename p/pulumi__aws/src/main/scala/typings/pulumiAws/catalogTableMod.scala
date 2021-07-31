package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.glue.CatalogTablePartitionKey
import typings.pulumiAws.outputMod.glue.CatalogTableStorageDescriptor
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object catalogTableMod {
  
  @JSImport("@pulumi/aws/glue/catalogTable", "CatalogTable")
  @js.native
  class CatalogTable protected () extends CustomResource {
    /**
      * Create a CatalogTable resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: CatalogTableArgs) = this()
    def this(name: String, args: CatalogTableArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN of the Glue Table.
      */
    val arn: Output_[String] = js.native
    
    /**
      * ID of the Glue Catalog and database to create the table in. If omitted, this defaults to the AWS Account ID plus the database name.
      */
    val catalogId: Output_[String] = js.native
    
    /**
      * Name of the metadata database where the table metadata resides. For Hive compatibility, this must be all lowercase.
      */
    val databaseName: Output_[String] = js.native
    
    /**
      * Description of the table.
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Name of the SerDe.
      */
    val name: Output_[String] = js.native
    
    /**
      * Owner of the table.
      */
    val owner: Output_[js.UndefOr[String]] = js.native
    
    /**
      * A map of initialization parameters for the SerDe, in key-value form.
      */
    val parameters: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * A list of columns by which the table is partitioned. Only primitive types are supported as partition keys. see Partition Keys below.
      */
    val partitionKeys: Output_[js.UndefOr[js.Array[CatalogTablePartitionKey]]] = js.native
    
    /**
      * Retention time for this table.
      */
    val retention: Output_[js.UndefOr[Double]] = js.native
    
    /**
      * A storage descriptor object containing information about the physical storage of this table. You can refer to the [Glue Developer Guide](https://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-catalog-tables.html#aws-glue-api-catalog-tables-StorageDescriptor) for a full explanation of this object.
      */
    val storageDescriptor: Output_[js.UndefOr[CatalogTableStorageDescriptor]] = js.native
    
    /**
      * The type of this table (EXTERNAL_TABLE, VIRTUAL_VIEW, etc.). While optional, some Athena DDL queries such as `ALTER TABLE` and `SHOW CREATE TABLE` will fail if this argument is empty.
      */
    val tableType: Output_[js.UndefOr[String]] = js.native
    
    /**
      * If the table is a view, the expanded text of the view; otherwise null.
      */
    val viewExpandedText: Output_[js.UndefOr[String]] = js.native
    
    /**
      * If the table is a view, the original text of the view; otherwise null.
      */
    val viewOriginalText: Output_[js.UndefOr[String]] = js.native
  }
  /* static members */
  object CatalogTable {
    
    @JSImport("@pulumi/aws/glue/catalogTable", "CatalogTable")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing CatalogTable resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): CatalogTable = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[CatalogTable]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): CatalogTable = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[CatalogTable]
    @scala.inline
    def get(name: String, id: Input[ID], state: CatalogTableState): CatalogTable = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[CatalogTable]
    @scala.inline
    def get(name: String, id: Input[ID], state: CatalogTableState, opts: CustomResourceOptions): CatalogTable = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[CatalogTable]
    
    /**
      * Returns true if the given object is an instance of CatalogTable.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glue/catalogTable.CatalogTable */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/glue/catalogTable.CatalogTable */ Boolean]
  }
  
  trait CatalogTableArgs extends StObject {
    
    /**
      * ID of the Glue Catalog and database to create the table in. If omitted, this defaults to the AWS Account ID plus the database name.
      */
    val catalogId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Name of the metadata database where the table metadata resides. For Hive compatibility, this must be all lowercase.
      */
    val databaseName: Input[String]
    
    /**
      * Description of the table.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Name of the SerDe.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Owner of the table.
      */
    val owner: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A map of initialization parameters for the SerDe, in key-value form.
      */
    val parameters: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * A list of columns by which the table is partitioned. Only primitive types are supported as partition keys. see Partition Keys below.
      */
    val partitionKeys: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.glue.CatalogTablePartitionKey]]]] = js.undefined
    
    /**
      * Retention time for this table.
      */
    val retention: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * A storage descriptor object containing information about the physical storage of this table. You can refer to the [Glue Developer Guide](https://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-catalog-tables.html#aws-glue-api-catalog-tables-StorageDescriptor) for a full explanation of this object.
      */
    val storageDescriptor: js.UndefOr[Input[typings.pulumiAws.inputMod.glue.CatalogTableStorageDescriptor]] = js.undefined
    
    /**
      * The type of this table (EXTERNAL_TABLE, VIRTUAL_VIEW, etc.). While optional, some Athena DDL queries such as `ALTER TABLE` and `SHOW CREATE TABLE` will fail if this argument is empty.
      */
    val tableType: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * If the table is a view, the expanded text of the view; otherwise null.
      */
    val viewExpandedText: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * If the table is a view, the original text of the view; otherwise null.
      */
    val viewOriginalText: js.UndefOr[Input[String]] = js.undefined
  }
  object CatalogTableArgs {
    
    @scala.inline
    def apply(databaseName: Input[String]): CatalogTableArgs = {
      val __obj = js.Dynamic.literal(databaseName = databaseName.asInstanceOf[js.Any])
      __obj.asInstanceOf[CatalogTableArgs]
    }
    
    @scala.inline
    implicit class CatalogTableArgsMutableBuilder[Self <: CatalogTableArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCatalogId(value: Input[String]): Self = StObject.set(x, "catalogId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCatalogIdUndefined: Self = StObject.set(x, "catalogId", js.undefined)
      
      @scala.inline
      def setDatabaseName(value: Input[String]): Self = StObject.set(x, "databaseName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOwner(value: Input[String]): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
      
      @scala.inline
      def setParameters(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      
      @scala.inline
      def setPartitionKeys(value: Input[js.Array[Input[typings.pulumiAws.inputMod.glue.CatalogTablePartitionKey]]]): Self = StObject.set(x, "partitionKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPartitionKeysUndefined: Self = StObject.set(x, "partitionKeys", js.undefined)
      
      @scala.inline
      def setPartitionKeysVarargs(value: Input[typings.pulumiAws.inputMod.glue.CatalogTablePartitionKey]*): Self = StObject.set(x, "partitionKeys", js.Array(value :_*))
      
      @scala.inline
      def setRetention(value: Input[Double]): Self = StObject.set(x, "retention", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetentionUndefined: Self = StObject.set(x, "retention", js.undefined)
      
      @scala.inline
      def setStorageDescriptor(value: Input[typings.pulumiAws.inputMod.glue.CatalogTableStorageDescriptor]): Self = StObject.set(x, "storageDescriptor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageDescriptorUndefined: Self = StObject.set(x, "storageDescriptor", js.undefined)
      
      @scala.inline
      def setTableType(value: Input[String]): Self = StObject.set(x, "tableType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableTypeUndefined: Self = StObject.set(x, "tableType", js.undefined)
      
      @scala.inline
      def setViewExpandedText(value: Input[String]): Self = StObject.set(x, "viewExpandedText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewExpandedTextUndefined: Self = StObject.set(x, "viewExpandedText", js.undefined)
      
      @scala.inline
      def setViewOriginalText(value: Input[String]): Self = StObject.set(x, "viewOriginalText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewOriginalTextUndefined: Self = StObject.set(x, "viewOriginalText", js.undefined)
    }
  }
  
  trait CatalogTableState extends StObject {
    
    /**
      * The ARN of the Glue Table.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * ID of the Glue Catalog and database to create the table in. If omitted, this defaults to the AWS Account ID plus the database name.
      */
    val catalogId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Name of the metadata database where the table metadata resides. For Hive compatibility, this must be all lowercase.
      */
    val databaseName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Description of the table.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Name of the SerDe.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Owner of the table.
      */
    val owner: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A map of initialization parameters for the SerDe, in key-value form.
      */
    val parameters: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * A list of columns by which the table is partitioned. Only primitive types are supported as partition keys. see Partition Keys below.
      */
    val partitionKeys: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.glue.CatalogTablePartitionKey]]]] = js.undefined
    
    /**
      * Retention time for this table.
      */
    val retention: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * A storage descriptor object containing information about the physical storage of this table. You can refer to the [Glue Developer Guide](https://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-catalog-tables.html#aws-glue-api-catalog-tables-StorageDescriptor) for a full explanation of this object.
      */
    val storageDescriptor: js.UndefOr[Input[typings.pulumiAws.inputMod.glue.CatalogTableStorageDescriptor]] = js.undefined
    
    /**
      * The type of this table (EXTERNAL_TABLE, VIRTUAL_VIEW, etc.). While optional, some Athena DDL queries such as `ALTER TABLE` and `SHOW CREATE TABLE` will fail if this argument is empty.
      */
    val tableType: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * If the table is a view, the expanded text of the view; otherwise null.
      */
    val viewExpandedText: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * If the table is a view, the original text of the view; otherwise null.
      */
    val viewOriginalText: js.UndefOr[Input[String]] = js.undefined
  }
  object CatalogTableState {
    
    @scala.inline
    def apply(): CatalogTableState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CatalogTableState]
    }
    
    @scala.inline
    implicit class CatalogTableStateMutableBuilder[Self <: CatalogTableState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setCatalogId(value: Input[String]): Self = StObject.set(x, "catalogId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCatalogIdUndefined: Self = StObject.set(x, "catalogId", js.undefined)
      
      @scala.inline
      def setDatabaseName(value: Input[String]): Self = StObject.set(x, "databaseName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatabaseNameUndefined: Self = StObject.set(x, "databaseName", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOwner(value: Input[String]): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
      
      @scala.inline
      def setParameters(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      
      @scala.inline
      def setPartitionKeys(value: Input[js.Array[Input[typings.pulumiAws.inputMod.glue.CatalogTablePartitionKey]]]): Self = StObject.set(x, "partitionKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPartitionKeysUndefined: Self = StObject.set(x, "partitionKeys", js.undefined)
      
      @scala.inline
      def setPartitionKeysVarargs(value: Input[typings.pulumiAws.inputMod.glue.CatalogTablePartitionKey]*): Self = StObject.set(x, "partitionKeys", js.Array(value :_*))
      
      @scala.inline
      def setRetention(value: Input[Double]): Self = StObject.set(x, "retention", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetentionUndefined: Self = StObject.set(x, "retention", js.undefined)
      
      @scala.inline
      def setStorageDescriptor(value: Input[typings.pulumiAws.inputMod.glue.CatalogTableStorageDescriptor]): Self = StObject.set(x, "storageDescriptor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageDescriptorUndefined: Self = StObject.set(x, "storageDescriptor", js.undefined)
      
      @scala.inline
      def setTableType(value: Input[String]): Self = StObject.set(x, "tableType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableTypeUndefined: Self = StObject.set(x, "tableType", js.undefined)
      
      @scala.inline
      def setViewExpandedText(value: Input[String]): Self = StObject.set(x, "viewExpandedText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewExpandedTextUndefined: Self = StObject.set(x, "viewExpandedText", js.undefined)
      
      @scala.inline
      def setViewOriginalText(value: Input[String]): Self = StObject.set(x, "viewOriginalText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewOriginalTextUndefined: Self = StObject.set(x, "viewOriginalText", js.undefined)
    }
  }
}
