package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object documentationVersionMod {
  
  @JSImport("@pulumi/aws/apigateway/documentationVersion", "DocumentationVersion")
  @js.native
  class DocumentationVersion protected () extends CustomResource {
    /**
      * Create a DocumentationVersion resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: DocumentationVersionArgs) = this()
    def this(name: String, args: DocumentationVersionArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The description of the API documentation version.
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The ID of the associated Rest API
      */
    val restApiId: Output_[String] = js.native
    
    /**
      * The version identifier of the API documentation snapshot.
      */
    val version: Output_[String] = js.native
  }
  /* static members */
  object DocumentationVersion {
    
    @JSImport("@pulumi/aws/apigateway/documentationVersion", "DocumentationVersion")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing DocumentationVersion resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): DocumentationVersion = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[DocumentationVersion]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): DocumentationVersion = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[DocumentationVersion]
    @scala.inline
    def get(name: String, id: Input[ID], state: DocumentationVersionState): DocumentationVersion = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[DocumentationVersion]
    @scala.inline
    def get(name: String, id: Input[ID], state: DocumentationVersionState, opts: CustomResourceOptions): DocumentationVersion = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[DocumentationVersion]
    
    /**
      * Returns true if the given object is an instance of DocumentationVersion.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/documentationVersion.DocumentationVersion */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/apigateway/documentationVersion.DocumentationVersion */ Boolean]
  }
  
  trait DocumentationVersionArgs extends StObject {
    
    /**
      * The description of the API documentation version.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ID of the associated Rest API
      */
    val restApiId: Input[String]
    
    /**
      * The version identifier of the API documentation snapshot.
      */
    val version: Input[String]
  }
  object DocumentationVersionArgs {
    
    @scala.inline
    def apply(restApiId: Input[String], version: Input[String]): DocumentationVersionArgs = {
      val __obj = js.Dynamic.literal(restApiId = restApiId.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[DocumentationVersionArgs]
    }
    
    @scala.inline
    implicit class DocumentationVersionArgsMutableBuilder[Self <: DocumentationVersionArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setRestApiId(value: Input[String]): Self = StObject.set(x, "restApiId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: Input[String]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait DocumentationVersionState extends StObject {
    
    /**
      * The description of the API documentation version.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ID of the associated Rest API
      */
    val restApiId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The version identifier of the API documentation snapshot.
      */
    val version: js.UndefOr[Input[String]] = js.undefined
  }
  object DocumentationVersionState {
    
    @scala.inline
    def apply(): DocumentationVersionState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DocumentationVersionState]
    }
    
    @scala.inline
    implicit class DocumentationVersionStateMutableBuilder[Self <: DocumentationVersionState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setRestApiId(value: Input[String]): Self = StObject.set(x, "restApiId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestApiIdUndefined: Self = StObject.set(x, "restApiId", js.undefined)
      
      @scala.inline
      def setVersion(value: Input[String]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
