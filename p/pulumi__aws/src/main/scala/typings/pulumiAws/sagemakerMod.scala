package typings.pulumiAws

import typings.pulumiAws.codeRepositoryMod.CodeRepositoryArgs
import typings.pulumiAws.codeRepositoryMod.CodeRepositoryState
import typings.pulumiAws.endpointConfigurationMod.EndpointConfigurationArgs
import typings.pulumiAws.endpointConfigurationMod.EndpointConfigurationState
import typings.pulumiAws.getPrebuiltEcrImageMod.GetPrebuiltEcrImageArgs
import typings.pulumiAws.getPrebuiltEcrImageMod.GetPrebuiltEcrImageResult
import typings.pulumiAws.notebookInstanceLifecycleConfigurationMod.NotebookInstanceLifecycleConfigurationArgs
import typings.pulumiAws.notebookInstanceLifecycleConfigurationMod.NotebookInstanceLifecycleConfigurationState
import typings.pulumiAws.notebookInstanceMod.NotebookInstanceArgs
import typings.pulumiAws.notebookInstanceMod.NotebookInstanceState
import typings.pulumiAws.sagemakerEndpointMod.EndpointArgs
import typings.pulumiAws.sagemakerEndpointMod.EndpointState
import typings.pulumiAws.sagemakerModelMod.ModelArgs
import typings.pulumiAws.sagemakerModelMod.ModelState
import typings.pulumiPulumi.invokeMod.InvokeOptions
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sagemakerMod {
  
  @JSImport("@pulumi/aws/sagemaker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pulumi/aws/sagemaker", "CodeRepository")
  @js.native
  class CodeRepository protected ()
    extends typings.pulumiAws.codeRepositoryMod.CodeRepository {
    /**
      * Create a CodeRepository resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: CodeRepositoryArgs) = this()
    def this(name: String, args: CodeRepositoryArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object CodeRepository {
    
    @JSImport("@pulumi/aws/sagemaker", "CodeRepository")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing CodeRepository resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.codeRepositoryMod.CodeRepository = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.codeRepositoryMod.CodeRepository]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.codeRepositoryMod.CodeRepository = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.codeRepositoryMod.CodeRepository]
    inline def get(name: String, id: Input[ID], state: CodeRepositoryState): typings.pulumiAws.codeRepositoryMod.CodeRepository = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.codeRepositoryMod.CodeRepository]
    inline def get(name: String, id: Input[ID], state: CodeRepositoryState, opts: CustomResourceOptions): typings.pulumiAws.codeRepositoryMod.CodeRepository = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.codeRepositoryMod.CodeRepository]
    
    /**
      * Returns true if the given object is an instance of CodeRepository.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sagemaker/codeRepository.CodeRepository */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/sagemaker/codeRepository.CodeRepository */ Boolean]
  }
  
  @JSImport("@pulumi/aws/sagemaker", "Endpoint")
  @js.native
  class Endpoint protected ()
    extends typings.pulumiAws.sagemakerEndpointMod.Endpoint {
    /**
      * Create a Endpoint resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: EndpointArgs) = this()
    def this(name: String, args: EndpointArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Endpoint {
    
    @JSImport("@pulumi/aws/sagemaker", "Endpoint")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Endpoint resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.sagemakerEndpointMod.Endpoint = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.sagemakerEndpointMod.Endpoint]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.sagemakerEndpointMod.Endpoint = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.sagemakerEndpointMod.Endpoint]
    inline def get(name: String, id: Input[ID], state: EndpointState): typings.pulumiAws.sagemakerEndpointMod.Endpoint = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.sagemakerEndpointMod.Endpoint]
    inline def get(name: String, id: Input[ID], state: EndpointState, opts: CustomResourceOptions): typings.pulumiAws.sagemakerEndpointMod.Endpoint = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.sagemakerEndpointMod.Endpoint]
    
    /**
      * Returns true if the given object is an instance of Endpoint.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sagemaker/endpoint.Endpoint */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/sagemaker/endpoint.Endpoint */ Boolean]
  }
  
  @JSImport("@pulumi/aws/sagemaker", "EndpointConfiguration")
  @js.native
  class EndpointConfiguration protected ()
    extends typings.pulumiAws.endpointConfigurationMod.EndpointConfiguration {
    /**
      * Create a EndpointConfiguration resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: EndpointConfigurationArgs) = this()
    def this(name: String, args: EndpointConfigurationArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object EndpointConfiguration {
    
    @JSImport("@pulumi/aws/sagemaker", "EndpointConfiguration")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing EndpointConfiguration resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.endpointConfigurationMod.EndpointConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.endpointConfigurationMod.EndpointConfiguration]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.endpointConfigurationMod.EndpointConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.endpointConfigurationMod.EndpointConfiguration]
    inline def get(name: String, id: Input[ID], state: EndpointConfigurationState): typings.pulumiAws.endpointConfigurationMod.EndpointConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.endpointConfigurationMod.EndpointConfiguration]
    inline def get(name: String, id: Input[ID], state: EndpointConfigurationState, opts: CustomResourceOptions): typings.pulumiAws.endpointConfigurationMod.EndpointConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.endpointConfigurationMod.EndpointConfiguration]
    
    /**
      * Returns true if the given object is an instance of EndpointConfiguration.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sagemaker/endpointConfiguration.EndpointConfiguration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/sagemaker/endpointConfiguration.EndpointConfiguration */ Boolean]
  }
  
  @JSImport("@pulumi/aws/sagemaker", "Model")
  @js.native
  class Model protected ()
    extends typings.pulumiAws.sagemakerModelMod.Model {
    /**
      * Create a Model resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ModelArgs) = this()
    def this(name: String, args: ModelArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Model {
    
    @JSImport("@pulumi/aws/sagemaker", "Model")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Model resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.sagemakerModelMod.Model = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.sagemakerModelMod.Model]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.sagemakerModelMod.Model = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.sagemakerModelMod.Model]
    inline def get(name: String, id: Input[ID], state: ModelState): typings.pulumiAws.sagemakerModelMod.Model = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.sagemakerModelMod.Model]
    inline def get(name: String, id: Input[ID], state: ModelState, opts: CustomResourceOptions): typings.pulumiAws.sagemakerModelMod.Model = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.sagemakerModelMod.Model]
    
    /**
      * Returns true if the given object is an instance of Model.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sagemaker/model.Model */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/sagemaker/model.Model */ Boolean]
  }
  
  @JSImport("@pulumi/aws/sagemaker", "NotebookInstance")
  @js.native
  class NotebookInstance protected ()
    extends typings.pulumiAws.notebookInstanceMod.NotebookInstance {
    /**
      * Create a NotebookInstance resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: NotebookInstanceArgs) = this()
    def this(name: String, args: NotebookInstanceArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object NotebookInstance {
    
    @JSImport("@pulumi/aws/sagemaker", "NotebookInstance")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing NotebookInstance resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.notebookInstanceMod.NotebookInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.notebookInstanceMod.NotebookInstance]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.notebookInstanceMod.NotebookInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.notebookInstanceMod.NotebookInstance]
    inline def get(name: String, id: Input[ID], state: NotebookInstanceState): typings.pulumiAws.notebookInstanceMod.NotebookInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.notebookInstanceMod.NotebookInstance]
    inline def get(name: String, id: Input[ID], state: NotebookInstanceState, opts: CustomResourceOptions): typings.pulumiAws.notebookInstanceMod.NotebookInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.notebookInstanceMod.NotebookInstance]
    
    /**
      * Returns true if the given object is an instance of NotebookInstance.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sagemaker/notebookInstance.NotebookInstance */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/sagemaker/notebookInstance.NotebookInstance */ Boolean]
  }
  
  @JSImport("@pulumi/aws/sagemaker", "NotebookInstanceLifecycleConfiguration")
  @js.native
  class NotebookInstanceLifecycleConfiguration protected ()
    extends typings.pulumiAws.notebookInstanceLifecycleConfigurationMod.NotebookInstanceLifecycleConfiguration {
    /**
      * Create a NotebookInstanceLifecycleConfiguration resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: NotebookInstanceLifecycleConfigurationArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: NotebookInstanceLifecycleConfigurationArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object NotebookInstanceLifecycleConfiguration {
    
    @JSImport("@pulumi/aws/sagemaker", "NotebookInstanceLifecycleConfiguration")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing NotebookInstanceLifecycleConfiguration resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.notebookInstanceLifecycleConfigurationMod.NotebookInstanceLifecycleConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.notebookInstanceLifecycleConfigurationMod.NotebookInstanceLifecycleConfiguration]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.notebookInstanceLifecycleConfigurationMod.NotebookInstanceLifecycleConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.notebookInstanceLifecycleConfigurationMod.NotebookInstanceLifecycleConfiguration]
    inline def get(name: String, id: Input[ID], state: NotebookInstanceLifecycleConfigurationState): typings.pulumiAws.notebookInstanceLifecycleConfigurationMod.NotebookInstanceLifecycleConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.notebookInstanceLifecycleConfigurationMod.NotebookInstanceLifecycleConfiguration]
    inline def get(
      name: String,
      id: Input[ID],
      state: NotebookInstanceLifecycleConfigurationState,
      opts: CustomResourceOptions
    ): typings.pulumiAws.notebookInstanceLifecycleConfigurationMod.NotebookInstanceLifecycleConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.notebookInstanceLifecycleConfigurationMod.NotebookInstanceLifecycleConfiguration]
    
    /**
      * Returns true if the given object is an instance of NotebookInstanceLifecycleConfiguration.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sagemaker/notebookInstanceLifecycleConfiguration.NotebookInstanceLifecycleConfiguration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/sagemaker/notebookInstanceLifecycleConfiguration.NotebookInstanceLifecycleConfiguration */ Boolean]
  }
  
  inline def getPrebuiltEcrImage(args: GetPrebuiltEcrImageArgs): js.Promise[GetPrebuiltEcrImageResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPrebuiltEcrImage")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetPrebuiltEcrImageResult]]
  inline def getPrebuiltEcrImage(args: GetPrebuiltEcrImageArgs, opts: InvokeOptions): js.Promise[GetPrebuiltEcrImageResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPrebuiltEcrImage")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetPrebuiltEcrImageResult]]
}
