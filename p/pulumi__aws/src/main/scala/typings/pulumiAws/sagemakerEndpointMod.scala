package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sagemakerEndpointMod {
  
  @JSImport("@pulumi/aws/sagemaker/endpoint", "Endpoint")
  @js.native
  class Endpoint protected () extends CustomResource {
    /**
      * Create a Endpoint resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: EndpointArgs) = this()
    def this(name: String, args: EndpointArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The Amazon Resource Name (ARN) assigned by AWS to this endpoint.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The name of the endpoint configuration to use.
      */
    val endpointConfigName: Output_[String] = js.native
    
    /**
      * The name of the endpoint. If omitted, this provider will assign a random, unique name.
      */
    val name: Output_[String] = js.native
    
    /**
      * A mapping of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object Endpoint {
    
    /**
      * Get an existing Endpoint resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/sagemaker/endpoint", "Endpoint.get")
    @js.native
    def get(name: String, id: Input[ID]): Endpoint = js.native
    @JSImport("@pulumi/aws/sagemaker/endpoint", "Endpoint.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Endpoint = js.native
    @JSImport("@pulumi/aws/sagemaker/endpoint", "Endpoint.get")
    @js.native
    def get(name: String, id: Input[ID], state: EndpointState): Endpoint = js.native
    @JSImport("@pulumi/aws/sagemaker/endpoint", "Endpoint.get")
    @js.native
    def get(name: String, id: Input[ID], state: EndpointState, opts: CustomResourceOptions): Endpoint = js.native
    
    /**
      * Returns true if the given object is an instance of Endpoint.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/sagemaker/endpoint", "Endpoint.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sagemaker/endpoint.Endpoint */ Boolean = js.native
  }
  
  @js.native
  trait EndpointArgs extends StObject {
    
    /**
      * The name of the endpoint configuration to use.
      */
    val endpointConfigName: Input[String] = js.native
    
    /**
      * The name of the endpoint. If omitted, this provider will assign a random, unique name.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * A mapping of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object EndpointArgs {
    
    @scala.inline
    def apply(endpointConfigName: Input[String]): EndpointArgs = {
      val __obj = js.Dynamic.literal(endpointConfigName = endpointConfigName.asInstanceOf[js.Any])
      __obj.asInstanceOf[EndpointArgs]
    }
    
    @scala.inline
    implicit class EndpointArgsMutableBuilder[Self <: EndpointArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEndpointConfigName(value: Input[String]): Self = StObject.set(x, "endpointConfigName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait EndpointState extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) assigned by AWS to this endpoint.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the endpoint configuration to use.
      */
    val endpointConfigName: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the endpoint. If omitted, this provider will assign a random, unique name.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * A mapping of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object EndpointState {
    
    @scala.inline
    def apply(): EndpointState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EndpointState]
    }
    
    @scala.inline
    implicit class EndpointStateMutableBuilder[Self <: EndpointState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setEndpointConfigName(value: Input[String]): Self = StObject.set(x, "endpointConfigName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpointConfigNameUndefined: Self = StObject.set(x, "endpointConfigName", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
