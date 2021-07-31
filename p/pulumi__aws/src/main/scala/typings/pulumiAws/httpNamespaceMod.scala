package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object httpNamespaceMod {
  
  @JSImport("@pulumi/aws/servicediscovery/httpNamespace", "HttpNamespace")
  @js.native
  class HttpNamespace protected () extends CustomResource {
    /**
      * Create a HttpNamespace resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: HttpNamespaceArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: HttpNamespaceArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN that Amazon Route 53 assigns to the namespace when you create it.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The description that you specify for the namespace when you create it.
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The name of the http namespace.
      */
    val name: Output_[String] = js.native
    
    /**
      * A map of tags to assign to the namespace.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object HttpNamespace {
    
    @JSImport("@pulumi/aws/servicediscovery/httpNamespace", "HttpNamespace")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing HttpNamespace resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): HttpNamespace = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[HttpNamespace]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): HttpNamespace = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[HttpNamespace]
    @scala.inline
    def get(name: String, id: Input[ID], state: HttpNamespaceState): HttpNamespace = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[HttpNamespace]
    @scala.inline
    def get(name: String, id: Input[ID], state: HttpNamespaceState, opts: CustomResourceOptions): HttpNamespace = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[HttpNamespace]
    
    /**
      * Returns true if the given object is an instance of HttpNamespace.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/servicediscovery/httpNamespace.HttpNamespace */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/servicediscovery/httpNamespace.HttpNamespace */ Boolean]
  }
  
  trait HttpNamespaceArgs extends StObject {
    
    /**
      * The description that you specify for the namespace when you create it.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the http namespace.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A map of tags to assign to the namespace.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object HttpNamespaceArgs {
    
    @scala.inline
    def apply(): HttpNamespaceArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HttpNamespaceArgs]
    }
    
    @scala.inline
    implicit class HttpNamespaceArgsMutableBuilder[Self <: HttpNamespaceArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
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
  
  trait HttpNamespaceState extends StObject {
    
    /**
      * The ARN that Amazon Route 53 assigns to the namespace when you create it.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The description that you specify for the namespace when you create it.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the http namespace.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A map of tags to assign to the namespace.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object HttpNamespaceState {
    
    @scala.inline
    def apply(): HttpNamespaceState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HttpNamespaceState]
    }
    
    @scala.inline
    implicit class HttpNamespaceStateMutableBuilder[Self <: HttpNamespaceState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
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
