package typings.pulumiAws

import typings.pulumiAws.outputMod.glue.UserDefinedFunctionResourceUri
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object userDefinedFunctionMod {
  
  @JSImport("@pulumi/aws/glue/userDefinedFunction", "UserDefinedFunction")
  @js.native
  class UserDefinedFunction protected () extends CustomResource {
    /**
      * Create a UserDefinedFunction resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: UserDefinedFunctionArgs) = this()
    def this(name: String, args: UserDefinedFunctionArgs, opts: CustomResourceOptions) = this()
    
    val arn: Output_[String] = js.native
    
    /**
      * ID of the Glue Catalog to create the function in. If omitted, this defaults to the AWS Account ID.
      */
    val catalogId: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The Java class that contains the function code.
      */
    val className: Output_[String] = js.native
    
    val createTime: Output_[String] = js.native
    
    /**
      * The name of the Database to create the Function.
      */
    val databaseName: Output_[String] = js.native
    
    /**
      * The name of the function.
      */
    val name: Output_[String] = js.native
    
    /**
      * The owner of the function.
      */
    val ownerName: Output_[String] = js.native
    
    /**
      * The owner type. can be one of `USER`, `ROLE`, and `GROUP`.
      */
    val ownerType: Output_[String] = js.native
    
    /**
      * The configuration block for Resource URIs. See resource uris below for more details.
      */
    val resourceUris: Output_[js.UndefOr[js.Array[UserDefinedFunctionResourceUri]]] = js.native
  }
  /* static members */
  object UserDefinedFunction {
    
    /**
      * Get an existing UserDefinedFunction resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/glue/userDefinedFunction", "UserDefinedFunction.get")
    @js.native
    def get(name: String, id: Input[ID]): UserDefinedFunction = js.native
    @JSImport("@pulumi/aws/glue/userDefinedFunction", "UserDefinedFunction.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): UserDefinedFunction = js.native
    @JSImport("@pulumi/aws/glue/userDefinedFunction", "UserDefinedFunction.get")
    @js.native
    def get(name: String, id: Input[ID], state: UserDefinedFunctionState): UserDefinedFunction = js.native
    @JSImport("@pulumi/aws/glue/userDefinedFunction", "UserDefinedFunction.get")
    @js.native
    def get(name: String, id: Input[ID], state: UserDefinedFunctionState, opts: CustomResourceOptions): UserDefinedFunction = js.native
    
    /**
      * Returns true if the given object is an instance of UserDefinedFunction.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/glue/userDefinedFunction", "UserDefinedFunction.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glue/userDefinedFunction.UserDefinedFunction */ Boolean = js.native
  }
  
  @js.native
  trait UserDefinedFunctionArgs extends StObject {
    
    /**
      * ID of the Glue Catalog to create the function in. If omitted, this defaults to the AWS Account ID.
      */
    val catalogId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The Java class that contains the function code.
      */
    val className: Input[String] = js.native
    
    /**
      * The name of the Database to create the Function.
      */
    val databaseName: Input[String] = js.native
    
    /**
      * The name of the function.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * The owner of the function.
      */
    val ownerName: Input[String] = js.native
    
    /**
      * The owner type. can be one of `USER`, `ROLE`, and `GROUP`.
      */
    val ownerType: Input[String] = js.native
    
    /**
      * The configuration block for Resource URIs. See resource uris below for more details.
      */
    val resourceUris: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.glue.UserDefinedFunctionResourceUri]]]
      ] = js.native
  }
  object UserDefinedFunctionArgs {
    
    @scala.inline
    def apply(
      className: Input[String],
      databaseName: Input[String],
      ownerName: Input[String],
      ownerType: Input[String]
    ): UserDefinedFunctionArgs = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], databaseName = databaseName.asInstanceOf[js.Any], ownerName = ownerName.asInstanceOf[js.Any], ownerType = ownerType.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserDefinedFunctionArgs]
    }
    
    @scala.inline
    implicit class UserDefinedFunctionArgsMutableBuilder[Self <: UserDefinedFunctionArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCatalogId(value: Input[String]): Self = StObject.set(x, "catalogId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCatalogIdUndefined: Self = StObject.set(x, "catalogId", js.undefined)
      
      @scala.inline
      def setClassName(value: Input[String]): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatabaseName(value: Input[String]): Self = StObject.set(x, "databaseName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOwnerName(value: Input[String]): Self = StObject.set(x, "ownerName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerType(value: Input[String]): Self = StObject.set(x, "ownerType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceUris(value: Input[js.Array[Input[typings.pulumiAws.inputMod.glue.UserDefinedFunctionResourceUri]]]): Self = StObject.set(x, "resourceUris", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceUrisUndefined: Self = StObject.set(x, "resourceUris", js.undefined)
      
      @scala.inline
      def setResourceUrisVarargs(value: Input[typings.pulumiAws.inputMod.glue.UserDefinedFunctionResourceUri]*): Self = StObject.set(x, "resourceUris", js.Array(value :_*))
    }
  }
  
  @js.native
  trait UserDefinedFunctionState extends StObject {
    
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * ID of the Glue Catalog to create the function in. If omitted, this defaults to the AWS Account ID.
      */
    val catalogId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The Java class that contains the function code.
      */
    val className: js.UndefOr[Input[String]] = js.native
    
    val createTime: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the Database to create the Function.
      */
    val databaseName: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the function.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * The owner of the function.
      */
    val ownerName: js.UndefOr[Input[String]] = js.native
    
    /**
      * The owner type. can be one of `USER`, `ROLE`, and `GROUP`.
      */
    val ownerType: js.UndefOr[Input[String]] = js.native
    
    /**
      * The configuration block for Resource URIs. See resource uris below for more details.
      */
    val resourceUris: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.glue.UserDefinedFunctionResourceUri]]]
      ] = js.native
  }
  object UserDefinedFunctionState {
    
    @scala.inline
    def apply(): UserDefinedFunctionState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserDefinedFunctionState]
    }
    
    @scala.inline
    implicit class UserDefinedFunctionStateMutableBuilder[Self <: UserDefinedFunctionState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setCatalogId(value: Input[String]): Self = StObject.set(x, "catalogId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCatalogIdUndefined: Self = StObject.set(x, "catalogId", js.undefined)
      
      @scala.inline
      def setClassName(value: Input[String]): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCreateTime(value: Input[String]): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
      
      @scala.inline
      def setDatabaseName(value: Input[String]): Self = StObject.set(x, "databaseName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatabaseNameUndefined: Self = StObject.set(x, "databaseName", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOwnerName(value: Input[String]): Self = StObject.set(x, "ownerName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerNameUndefined: Self = StObject.set(x, "ownerName", js.undefined)
      
      @scala.inline
      def setOwnerType(value: Input[String]): Self = StObject.set(x, "ownerType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerTypeUndefined: Self = StObject.set(x, "ownerType", js.undefined)
      
      @scala.inline
      def setResourceUris(value: Input[js.Array[Input[typings.pulumiAws.inputMod.glue.UserDefinedFunctionResourceUri]]]): Self = StObject.set(x, "resourceUris", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceUrisUndefined: Self = StObject.set(x, "resourceUris", js.undefined)
      
      @scala.inline
      def setResourceUrisVarargs(value: Input[typings.pulumiAws.inputMod.glue.UserDefinedFunctionResourceUri]*): Self = StObject.set(x, "resourceUris", js.Array(value :_*))
    }
  }
}
