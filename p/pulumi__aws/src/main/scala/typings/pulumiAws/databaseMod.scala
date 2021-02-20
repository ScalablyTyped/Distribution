package typings.pulumiAws

import typings.pulumiAws.outputMod.athena.DatabaseEncryptionConfiguration
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
    
    /**
      * Get an existing Database resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/athena/database", "Database.get")
    @js.native
    def get(name: String, id: Input[ID]): Database = js.native
    @JSImport("@pulumi/aws/athena/database", "Database.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Database = js.native
    @JSImport("@pulumi/aws/athena/database", "Database.get")
    @js.native
    def get(name: String, id: Input[ID], state: DatabaseState): Database = js.native
    @JSImport("@pulumi/aws/athena/database", "Database.get")
    @js.native
    def get(name: String, id: Input[ID], state: DatabaseState, opts: CustomResourceOptions): Database = js.native
    
    /**
      * Returns true if the given object is an instance of Database.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/athena/database", "Database.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/athena/database.Database */ Boolean = js.native
  }
  
  @js.native
  trait DatabaseArgs extends StObject {
    
    /**
      * Name of s3 bucket to save the results of the query execution.
      */
    val bucket: Input[String] = js.native
    
    /**
      * The encryption key block AWS Athena uses to decrypt the data in S3, such as an AWS Key Management Service (AWS KMS) key. An `encryptionConfiguration` block is documented below.
      */
    val encryptionConfiguration: js.UndefOr[Input[typings.pulumiAws.inputMod.athena.DatabaseEncryptionConfiguration]] = js.native
    
    /**
      * A boolean that indicates all tables should be deleted from the database so that the database can be destroyed without error. The tables are *not* recoverable.
      */
    val forceDestroy: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * Name of the database to create.
      */
    val name: js.UndefOr[Input[String]] = js.native
  }
  object DatabaseArgs {
    
    @scala.inline
    def apply(bucket: Input[String]): DatabaseArgs = {
      val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[DatabaseArgs]
    }
    
    @scala.inline
    implicit class DatabaseArgsMutableBuilder[Self <: DatabaseArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBucket(value: Input[String]): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncryptionConfiguration(value: Input[typings.pulumiAws.inputMod.athena.DatabaseEncryptionConfiguration]): Self = StObject.set(x, "encryptionConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncryptionConfigurationUndefined: Self = StObject.set(x, "encryptionConfiguration", js.undefined)
      
      @scala.inline
      def setForceDestroy(value: Input[Boolean]): Self = StObject.set(x, "forceDestroy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceDestroyUndefined: Self = StObject.set(x, "forceDestroy", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  @js.native
  trait DatabaseState extends StObject {
    
    /**
      * Name of s3 bucket to save the results of the query execution.
      */
    val bucket: js.UndefOr[Input[String]] = js.native
    
    /**
      * The encryption key block AWS Athena uses to decrypt the data in S3, such as an AWS Key Management Service (AWS KMS) key. An `encryptionConfiguration` block is documented below.
      */
    val encryptionConfiguration: js.UndefOr[Input[typings.pulumiAws.inputMod.athena.DatabaseEncryptionConfiguration]] = js.native
    
    /**
      * A boolean that indicates all tables should be deleted from the database so that the database can be destroyed without error. The tables are *not* recoverable.
      */
    val forceDestroy: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * Name of the database to create.
      */
    val name: js.UndefOr[Input[String]] = js.native
  }
  object DatabaseState {
    
    @scala.inline
    def apply(): DatabaseState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DatabaseState]
    }
    
    @scala.inline
    implicit class DatabaseStateMutableBuilder[Self <: DatabaseState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBucket(value: Input[String]): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBucketUndefined: Self = StObject.set(x, "bucket", js.undefined)
      
      @scala.inline
      def setEncryptionConfiguration(value: Input[typings.pulumiAws.inputMod.athena.DatabaseEncryptionConfiguration]): Self = StObject.set(x, "encryptionConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncryptionConfigurationUndefined: Self = StObject.set(x, "encryptionConfiguration", js.undefined)
      
      @scala.inline
      def setForceDestroy(value: Input[Boolean]): Self = StObject.set(x, "forceDestroy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceDestroyUndefined: Self = StObject.set(x, "forceDestroy", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
}
