package typings.pulumiAws

import typings.pulumiAws.outputMod.rds.GlobalClusterGlobalClusterMember
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object globalClusterMod {
  
  @JSImport("@pulumi/aws/rds/globalCluster", "GlobalCluster")
  @js.native
  class GlobalCluster protected () extends CustomResource {
    /**
      * Create a GlobalCluster resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: GlobalClusterArgs) = this()
    def this(name: String, args: GlobalClusterArgs, opts: CustomResourceOptions) = this()
    
    /**
      * RDS Global Cluster Amazon Resource Name (ARN)
      */
    val arn: Output_[String] = js.native
    
    /**
      * Name for an automatically created database on cluster creation.
      */
    val databaseName: Output_[js.UndefOr[String]] = js.native
    
    /**
      * If the Global Cluster should have deletion protection enabled. The database can't be deleted when this value is set to `true`. The default is `false`.
      */
    val deletionProtection: Output_[js.UndefOr[Boolean]] = js.native
    
    val engine: Output_[String] = js.native
    
    /**
      * Engine version of the Aurora global database.
      * * **NOTE:** When the engine is set to `aurora-mysql`, an engine version compatible with global database is required. The earliest available version is `5.7.mysql_aurora.2.06.0`.
      */
    val engineVersion: Output_[String] = js.native
    
    /**
      * Enable to remove DB Cluster members from Global Cluster on destroy. Required with `sourceDbClusterIdentifier`.
      */
    val forceDestroy: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * The global cluster identifier.
      */
    val globalClusterIdentifier: Output_[String] = js.native
    
    /**
      * Set of objects containing Global Cluster members.
      */
    val globalClusterMembers: Output_[js.Array[GlobalClusterGlobalClusterMember]] = js.native
    
    /**
      * AWS Region-unique, immutable identifier for the global database cluster. This identifier is found in AWS CloudTrail log entries whenever the AWS KMS key for the DB cluster is accessed
      */
    val globalClusterResourceId: Output_[String] = js.native
    
    val sourceDbClusterIdentifier: Output_[String] = js.native
    
    val storageEncrypted: Output_[Boolean] = js.native
  }
  /* static members */
  object GlobalCluster {
    
    @JSImport("@pulumi/aws/rds/globalCluster", "GlobalCluster")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing GlobalCluster resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): GlobalCluster = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[GlobalCluster]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): GlobalCluster = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[GlobalCluster]
    @scala.inline
    def get(name: String, id: Input[ID], state: GlobalClusterState): GlobalCluster = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[GlobalCluster]
    @scala.inline
    def get(name: String, id: Input[ID], state: GlobalClusterState, opts: CustomResourceOptions): GlobalCluster = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[GlobalCluster]
    
    /**
      * Returns true if the given object is an instance of GlobalCluster.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/globalCluster.GlobalCluster */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/rds/globalCluster.GlobalCluster */ Boolean]
  }
  
  trait GlobalClusterArgs extends StObject {
    
    /**
      * Name for an automatically created database on cluster creation.
      */
    val databaseName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * If the Global Cluster should have deletion protection enabled. The database can't be deleted when this value is set to `true`. The default is `false`.
      */
    val deletionProtection: js.UndefOr[Input[Boolean]] = js.undefined
    
    val engine: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Engine version of the Aurora global database.
      * * **NOTE:** When the engine is set to `aurora-mysql`, an engine version compatible with global database is required. The earliest available version is `5.7.mysql_aurora.2.06.0`.
      */
    val engineVersion: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Enable to remove DB Cluster members from Global Cluster on destroy. Required with `sourceDbClusterIdentifier`.
      */
    val forceDestroy: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The global cluster identifier.
      */
    val globalClusterIdentifier: Input[String]
    
    val sourceDbClusterIdentifier: js.UndefOr[Input[String]] = js.undefined
    
    val storageEncrypted: js.UndefOr[Input[Boolean]] = js.undefined
  }
  object GlobalClusterArgs {
    
    @scala.inline
    def apply(globalClusterIdentifier: Input[String]): GlobalClusterArgs = {
      val __obj = js.Dynamic.literal(globalClusterIdentifier = globalClusterIdentifier.asInstanceOf[js.Any])
      __obj.asInstanceOf[GlobalClusterArgs]
    }
    
    @scala.inline
    implicit class GlobalClusterArgsMutableBuilder[Self <: GlobalClusterArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDatabaseName(value: Input[String]): Self = StObject.set(x, "databaseName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatabaseNameUndefined: Self = StObject.set(x, "databaseName", js.undefined)
      
      @scala.inline
      def setDeletionProtection(value: Input[Boolean]): Self = StObject.set(x, "deletionProtection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeletionProtectionUndefined: Self = StObject.set(x, "deletionProtection", js.undefined)
      
      @scala.inline
      def setEngine(value: Input[String]): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEngineUndefined: Self = StObject.set(x, "engine", js.undefined)
      
      @scala.inline
      def setEngineVersion(value: Input[String]): Self = StObject.set(x, "engineVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEngineVersionUndefined: Self = StObject.set(x, "engineVersion", js.undefined)
      
      @scala.inline
      def setForceDestroy(value: Input[Boolean]): Self = StObject.set(x, "forceDestroy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceDestroyUndefined: Self = StObject.set(x, "forceDestroy", js.undefined)
      
      @scala.inline
      def setGlobalClusterIdentifier(value: Input[String]): Self = StObject.set(x, "globalClusterIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceDbClusterIdentifier(value: Input[String]): Self = StObject.set(x, "sourceDbClusterIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceDbClusterIdentifierUndefined: Self = StObject.set(x, "sourceDbClusterIdentifier", js.undefined)
      
      @scala.inline
      def setStorageEncrypted(value: Input[Boolean]): Self = StObject.set(x, "storageEncrypted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageEncryptedUndefined: Self = StObject.set(x, "storageEncrypted", js.undefined)
    }
  }
  
  trait GlobalClusterState extends StObject {
    
    /**
      * RDS Global Cluster Amazon Resource Name (ARN)
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Name for an automatically created database on cluster creation.
      */
    val databaseName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * If the Global Cluster should have deletion protection enabled. The database can't be deleted when this value is set to `true`. The default is `false`.
      */
    val deletionProtection: js.UndefOr[Input[Boolean]] = js.undefined
    
    val engine: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Engine version of the Aurora global database.
      * * **NOTE:** When the engine is set to `aurora-mysql`, an engine version compatible with global database is required. The earliest available version is `5.7.mysql_aurora.2.06.0`.
      */
    val engineVersion: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Enable to remove DB Cluster members from Global Cluster on destroy. Required with `sourceDbClusterIdentifier`.
      */
    val forceDestroy: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The global cluster identifier.
      */
    val globalClusterIdentifier: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Set of objects containing Global Cluster members.
      */
    val globalClusterMembers: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.rds.GlobalClusterGlobalClusterMember]]]
      ] = js.undefined
    
    /**
      * AWS Region-unique, immutable identifier for the global database cluster. This identifier is found in AWS CloudTrail log entries whenever the AWS KMS key for the DB cluster is accessed
      */
    val globalClusterResourceId: js.UndefOr[Input[String]] = js.undefined
    
    val sourceDbClusterIdentifier: js.UndefOr[Input[String]] = js.undefined
    
    val storageEncrypted: js.UndefOr[Input[Boolean]] = js.undefined
  }
  object GlobalClusterState {
    
    @scala.inline
    def apply(): GlobalClusterState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GlobalClusterState]
    }
    
    @scala.inline
    implicit class GlobalClusterStateMutableBuilder[Self <: GlobalClusterState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setDatabaseName(value: Input[String]): Self = StObject.set(x, "databaseName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatabaseNameUndefined: Self = StObject.set(x, "databaseName", js.undefined)
      
      @scala.inline
      def setDeletionProtection(value: Input[Boolean]): Self = StObject.set(x, "deletionProtection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeletionProtectionUndefined: Self = StObject.set(x, "deletionProtection", js.undefined)
      
      @scala.inline
      def setEngine(value: Input[String]): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEngineUndefined: Self = StObject.set(x, "engine", js.undefined)
      
      @scala.inline
      def setEngineVersion(value: Input[String]): Self = StObject.set(x, "engineVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEngineVersionUndefined: Self = StObject.set(x, "engineVersion", js.undefined)
      
      @scala.inline
      def setForceDestroy(value: Input[Boolean]): Self = StObject.set(x, "forceDestroy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceDestroyUndefined: Self = StObject.set(x, "forceDestroy", js.undefined)
      
      @scala.inline
      def setGlobalClusterIdentifier(value: Input[String]): Self = StObject.set(x, "globalClusterIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalClusterIdentifierUndefined: Self = StObject.set(x, "globalClusterIdentifier", js.undefined)
      
      @scala.inline
      def setGlobalClusterMembers(value: Input[js.Array[Input[typings.pulumiAws.inputMod.rds.GlobalClusterGlobalClusterMember]]]): Self = StObject.set(x, "globalClusterMembers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalClusterMembersUndefined: Self = StObject.set(x, "globalClusterMembers", js.undefined)
      
      @scala.inline
      def setGlobalClusterMembersVarargs(value: Input[typings.pulumiAws.inputMod.rds.GlobalClusterGlobalClusterMember]*): Self = StObject.set(x, "globalClusterMembers", js.Array(value :_*))
      
      @scala.inline
      def setGlobalClusterResourceId(value: Input[String]): Self = StObject.set(x, "globalClusterResourceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalClusterResourceIdUndefined: Self = StObject.set(x, "globalClusterResourceId", js.undefined)
      
      @scala.inline
      def setSourceDbClusterIdentifier(value: Input[String]): Self = StObject.set(x, "sourceDbClusterIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceDbClusterIdentifierUndefined: Self = StObject.set(x, "sourceDbClusterIdentifier", js.undefined)
      
      @scala.inline
      def setStorageEncrypted(value: Input[Boolean]): Self = StObject.set(x, "storageEncrypted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageEncryptedUndefined: Self = StObject.set(x, "storageEncrypted", js.undefined)
    }
  }
}
