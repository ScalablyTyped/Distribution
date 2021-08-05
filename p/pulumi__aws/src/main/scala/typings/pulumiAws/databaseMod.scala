package typings.pulumiAws

import typings.pulumiAws.outputMod.athena.DatabaseEncryptionConfiguration
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object databaseMod {
  
  @JSImport("@pulumi/aws/athena/database", "Database")
  @js.native
  class Database protected () extends CustomResource {
    /**
      * Create a Database resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: DatabaseArgs) = this()
    def this(name: String, args: DatabaseArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Name of s3 bucket to save the results of the query execution.
      */
    val bucket: Output_[String] = js.native
    
    /**
      * The encryption key block AWS Athena uses to decrypt the data in S3, such as an AWS Key Management Service (AWS KMS) key. An `encryptionConfiguration` block is documented below.
      */
    val encryptionConfiguration: Output_[js.UndefOr[DatabaseEncryptionConfiguration]] = js.native
    
    /**
      * A boolean that indicates all tables should be deleted from the database so that the database can be destroyed without error. The tables are *not* recoverable.
      */
    val forceDestroy: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * Name of the database to create.
      */
    val name: Output_[String] = js.native
  }
  /* static members */
  object Database {
    
    @JSImport("@pulumi/aws/athena/database", "Database")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Database resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): Database = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Database]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Database = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Database]
    inline def get(name: String, id: Input[ID], state: DatabaseState): Database = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Database]
    inline def get(name: String, id: Input[ID], state: DatabaseState, opts: CustomResourceOptions): Database = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Database]
    
    /**
      * Returns true if the given object is an instance of Database.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/athena/database.Database */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/athena/database.Database */ Boolean]
  }
  
  trait DatabaseArgs extends StObject {
    
    /**
      * Name of s3 bucket to save the results of the query execution.
      */
    val bucket: Input[String]
    
    /**
      * The encryption key block AWS Athena uses to decrypt the data in S3, such as an AWS Key Management Service (AWS KMS) key. An `encryptionConfiguration` block is documented below.
      */
    val encryptionConfiguration: js.UndefOr[Input[typings.pulumiAws.inputMod.athena.DatabaseEncryptionConfiguration]] = js.undefined
    
    /**
      * A boolean that indicates all tables should be deleted from the database so that the database can be destroyed without error. The tables are *not* recoverable.
      */
    val forceDestroy: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Name of the database to create.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
  }
  object DatabaseArgs {
    
    inline def apply(bucket: Input[String]): DatabaseArgs = {
      val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[DatabaseArgs]
    }
    
    extension [Self <: DatabaseArgs](x: Self) {
      
      inline def setBucket(value: Input[String]): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
      
      inline def setEncryptionConfiguration(value: Input[typings.pulumiAws.inputMod.athena.DatabaseEncryptionConfiguration]): Self = StObject.set(x, "encryptionConfiguration", value.asInstanceOf[js.Any])
      
      inline def setEncryptionConfigurationUndefined: Self = StObject.set(x, "encryptionConfiguration", js.undefined)
      
      inline def setForceDestroy(value: Input[Boolean]): Self = StObject.set(x, "forceDestroy", value.asInstanceOf[js.Any])
      
      inline def setForceDestroyUndefined: Self = StObject.set(x, "forceDestroy", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  trait DatabaseState extends StObject {
    
    /**
      * Name of s3 bucket to save the results of the query execution.
      */
    val bucket: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The encryption key block AWS Athena uses to decrypt the data in S3, such as an AWS Key Management Service (AWS KMS) key. An `encryptionConfiguration` block is documented below.
      */
    val encryptionConfiguration: js.UndefOr[Input[typings.pulumiAws.inputMod.athena.DatabaseEncryptionConfiguration]] = js.undefined
    
    /**
      * A boolean that indicates all tables should be deleted from the database so that the database can be destroyed without error. The tables are *not* recoverable.
      */
    val forceDestroy: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Name of the database to create.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
  }
  object DatabaseState {
    
    inline def apply(): DatabaseState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DatabaseState]
    }
    
    extension [Self <: DatabaseState](x: Self) {
      
      inline def setBucket(value: Input[String]): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
      
      inline def setBucketUndefined: Self = StObject.set(x, "bucket", js.undefined)
      
      inline def setEncryptionConfiguration(value: Input[typings.pulumiAws.inputMod.athena.DatabaseEncryptionConfiguration]): Self = StObject.set(x, "encryptionConfiguration", value.asInstanceOf[js.Any])
      
      inline def setEncryptionConfigurationUndefined: Self = StObject.set(x, "encryptionConfiguration", js.undefined)
      
      inline def setForceDestroy(value: Input[Boolean]): Self = StObject.set(x, "forceDestroy", value.asInstanceOf[js.Any])
      
      inline def setForceDestroyUndefined: Self = StObject.set(x, "forceDestroy", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
}
