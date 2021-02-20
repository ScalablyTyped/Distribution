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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sagemakerMod {
  
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
    
    /**
      * Get an existing CodeRepository resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/sagemaker", "CodeRepository.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.codeRepositoryMod.CodeRepository = js.native
    @JSImport("@pulumi/aws/sagemaker", "CodeRepository.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.codeRepositoryMod.CodeRepository = js.native
    @JSImport("@pulumi/aws/sagemaker", "CodeRepository.get")
    @js.native
    def get(name: String, id: Input[ID], state: CodeRepositoryState): typings.pulumiAws.codeRepositoryMod.CodeRepository = js.native
    @JSImport("@pulumi/aws/sagemaker", "CodeRepository.get")
    @js.native
    def get(name: String, id: Input[ID], state: CodeRepositoryState, opts: CustomResourceOptions): typings.pulumiAws.codeRepositoryMod.CodeRepository = js.native
    
    /**
      * Returns true if the given object is an instance of CodeRepository.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/sagemaker", "CodeRepository.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sagemaker/codeRepository.CodeRepository */ Boolean = js.native
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
    
    /**
      * Get an existing Endpoint resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/sagemaker", "Endpoint.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.sagemakerEndpointMod.Endpoint = js.native
    @JSImport("@pulumi/aws/sagemaker", "Endpoint.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.sagemakerEndpointMod.Endpoint = js.native
    @JSImport("@pulumi/aws/sagemaker", "Endpoint.get")
    @js.native
    def get(name: String, id: Input[ID], state: EndpointState): typings.pulumiAws.sagemakerEndpointMod.Endpoint = js.native
    @JSImport("@pulumi/aws/sagemaker", "Endpoint.get")
    @js.native
    def get(name: String, id: Input[ID], state: EndpointState, opts: CustomResourceOptions): typings.pulumiAws.sagemakerEndpointMod.Endpoint = js.native
    
    /**
      * Returns true if the given object is an instance of Endpoint.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/sagemaker", "Endpoint.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sagemaker/endpoint.Endpoint */ Boolean = js.native
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
    
    /**
      * Get an existing EndpointConfiguration resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/sagemaker", "EndpointConfiguration.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.endpointConfigurationMod.EndpointConfiguration = js.native
    @JSImport("@pulumi/aws/sagemaker", "EndpointConfiguration.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.endpointConfigurationMod.EndpointConfiguration = js.native
    @JSImport("@pulumi/aws/sagemaker", "EndpointConfiguration.get")
    @js.native
    def get(name: String, id: Input[ID], state: EndpointConfigurationState): typings.pulumiAws.endpointConfigurationMod.EndpointConfiguration = js.native
    @JSImport("@pulumi/aws/sagemaker", "EndpointConfiguration.get")
    @js.native
    def get(name: String, id: Input[ID], state: EndpointConfigurationState, opts: CustomResourceOptions): typings.pulumiAws.endpointConfigurationMod.EndpointConfiguration = js.native
    
    /**
      * Returns true if the given object is an instance of EndpointConfiguration.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/sagemaker", "EndpointConfiguration.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sagemaker/endpointConfiguration.EndpointConfiguration */ Boolean = js.native
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
    
    /**
      * Get an existing Model resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/sagemaker", "Model.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.sagemakerModelMod.Model = js.native
    @JSImport("@pulumi/aws/sagemaker", "Model.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.sagemakerModelMod.Model = js.native
    @JSImport("@pulumi/aws/sagemaker", "Model.get")
    @js.native
    def get(name: String, id: Input[ID], state: ModelState): typings.pulumiAws.sagemakerModelMod.Model = js.native
    @JSImport("@pulumi/aws/sagemaker", "Model.get")
    @js.native
    def get(name: String, id: Input[ID], state: ModelState, opts: CustomResourceOptions): typings.pulumiAws.sagemakerModelMod.Model = js.native
    
    /**
      * Returns true if the given object is an instance of Model.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/sagemaker", "Model.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sagemaker/model.Model */ Boolean = js.native
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
    
    /**
      * Get an existing NotebookInstance resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/sagemaker", "NotebookInstance.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.notebookInstanceMod.NotebookInstance = js.native
    @JSImport("@pulumi/aws/sagemaker", "NotebookInstance.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.notebookInstanceMod.NotebookInstance = js.native
    @JSImport("@pulumi/aws/sagemaker", "NotebookInstance.get")
    @js.native
    def get(name: String, id: Input[ID], state: NotebookInstanceState): typings.pulumiAws.notebookInstanceMod.NotebookInstance = js.native
    @JSImport("@pulumi/aws/sagemaker", "NotebookInstance.get")
    @js.native
    def get(name: String, id: Input[ID], state: NotebookInstanceState, opts: CustomResourceOptions): typings.pulumiAws.notebookInstanceMod.NotebookInstance = js.native
    
    /**
      * Returns true if the given object is an instance of NotebookInstance.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/sagemaker", "NotebookInstance.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sagemaker/notebookInstance.NotebookInstance */ Boolean = js.native
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
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: NotebookInstanceLifecycleConfigurationArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object NotebookInstanceLifecycleConfiguration {
    
    /**
      * Get an existing NotebookInstanceLifecycleConfiguration resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/sagemaker", "NotebookInstanceLifecycleConfiguration.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.notebookInstanceLifecycleConfigurationMod.NotebookInstanceLifecycleConfiguration = js.native
    @JSImport("@pulumi/aws/sagemaker", "NotebookInstanceLifecycleConfiguration.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.notebookInstanceLifecycleConfigurationMod.NotebookInstanceLifecycleConfiguration = js.native
    @JSImport("@pulumi/aws/sagemaker", "NotebookInstanceLifecycleConfiguration.get")
    @js.native
    def get(name: String, id: Input[ID], state: NotebookInstanceLifecycleConfigurationState): typings.pulumiAws.notebookInstanceLifecycleConfigurationMod.NotebookInstanceLifecycleConfiguration = js.native
    @JSImport("@pulumi/aws/sagemaker", "NotebookInstanceLifecycleConfiguration.get")
    @js.native
    def get(
      name: String,
      id: Input[ID],
      state: NotebookInstanceLifecycleConfigurationState,
      opts: CustomResourceOptions
    ): typings.pulumiAws.notebookInstanceLifecycleConfigurationMod.NotebookInstanceLifecycleConfiguration = js.native
    
    /**
      * Returns true if the given object is an instance of NotebookInstanceLifecycleConfiguration.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/sagemaker", "NotebookInstanceLifecycleConfiguration.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sagemaker/notebookInstanceLifecycleConfiguration.NotebookInstanceLifecycleConfiguration */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/sagemaker", "getPrebuiltEcrImage")
  @js.native
  def getPrebuiltEcrImage(args: GetPrebuiltEcrImageArgs): js.Promise[GetPrebuiltEcrImageResult] = js.native
  @JSImport("@pulumi/aws/sagemaker", "getPrebuiltEcrImage")
  @js.native
  def getPrebuiltEcrImage(args: GetPrebuiltEcrImageArgs, opts: InvokeOptions): js.Promise[GetPrebuiltEcrImageResult] = js.native
}
