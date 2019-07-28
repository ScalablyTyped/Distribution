package typings.atPulumiAws.atPulumiAwsMod

import typings.atPulumiAws.sagemakerEndpointConfigurationMod.EndpointConfigurationArgs
import typings.atPulumiAws.sagemakerEndpointConfigurationMod.EndpointConfigurationState
import typings.atPulumiAws.sagemakerEndpointMod.EndpointArgs
import typings.atPulumiAws.sagemakerEndpointMod.EndpointState
import typings.atPulumiAws.sagemakerModelMod.ModelArgs
import typings.atPulumiAws.sagemakerModelMod.ModelState
import typings.atPulumiAws.sagemakerNotebookInstanceLifecycleConfigurationMod.NotebookInstanceLifecycleConfigurationArgs
import typings.atPulumiAws.sagemakerNotebookInstanceLifecycleConfigurationMod.NotebookInstanceLifecycleConfigurationState
import typings.atPulumiAws.sagemakerNotebookInstanceMod.NotebookInstanceArgs
import typings.atPulumiAws.sagemakerNotebookInstanceMod.NotebookInstanceState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "sagemaker")
@js.native
object sagemakerNs extends js.Object {
  @js.native
  class Endpoint protected ()
    extends typings.atPulumiAws.sagemakerMod.Endpoint {
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
  
  @js.native
  class EndpointConfiguration protected ()
    extends typings.atPulumiAws.sagemakerMod.EndpointConfiguration {
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
  
  @js.native
  class Model protected ()
    extends typings.atPulumiAws.sagemakerMod.Model {
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
  
  @js.native
  class NotebookInstance protected ()
    extends typings.atPulumiAws.sagemakerMod.NotebookInstance {
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
  
  @js.native
  class NotebookInstanceLifecycleConfiguration protected ()
    extends typings.atPulumiAws.sagemakerMod.NotebookInstanceLifecycleConfiguration {
    /**
      * Create a NotebookInstanceLifecycleConfiguration resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: NotebookInstanceLifecycleConfigurationArgs) = this()
    def this(name: String, args: NotebookInstanceLifecycleConfigurationArgs, opts: CustomResourceOptions) = this()
  }
  
  /* static members */
  @js.native
  object Endpoint extends js.Object {
    /**
      * Get an existing Endpoint resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.sagemakerEndpointMod.Endpoint = js.native
    def get(name: String, id: Input[ID], state: EndpointState): typings.atPulumiAws.sagemakerEndpointMod.Endpoint = js.native
    def get(name: String, id: Input[ID], state: EndpointState, opts: CustomResourceOptions): typings.atPulumiAws.sagemakerEndpointMod.Endpoint = js.native
    /**
      * Returns true if the given object is an instance of Endpoint.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sagemaker/endpoint.Endpoint */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object EndpointConfiguration extends js.Object {
    /**
      * Get an existing EndpointConfiguration resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.sagemakerEndpointConfigurationMod.EndpointConfiguration = js.native
    def get(name: String, id: Input[ID], state: EndpointConfigurationState): typings.atPulumiAws.sagemakerEndpointConfigurationMod.EndpointConfiguration = js.native
    def get(name: String, id: Input[ID], state: EndpointConfigurationState, opts: CustomResourceOptions): typings.atPulumiAws.sagemakerEndpointConfigurationMod.EndpointConfiguration = js.native
    /**
      * Returns true if the given object is an instance of EndpointConfiguration.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sagemaker/endpointConfiguration.EndpointConfiguration */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Model extends js.Object {
    /**
      * Get an existing Model resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.sagemakerModelMod.Model = js.native
    def get(name: String, id: Input[ID], state: ModelState): typings.atPulumiAws.sagemakerModelMod.Model = js.native
    def get(name: String, id: Input[ID], state: ModelState, opts: CustomResourceOptions): typings.atPulumiAws.sagemakerModelMod.Model = js.native
    /**
      * Returns true if the given object is an instance of Model.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sagemaker/model.Model */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object NotebookInstance extends js.Object {
    /**
      * Get an existing NotebookInstance resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.sagemakerNotebookInstanceMod.NotebookInstance = js.native
    def get(name: String, id: Input[ID], state: NotebookInstanceState): typings.atPulumiAws.sagemakerNotebookInstanceMod.NotebookInstance = js.native
    def get(name: String, id: Input[ID], state: NotebookInstanceState, opts: CustomResourceOptions): typings.atPulumiAws.sagemakerNotebookInstanceMod.NotebookInstance = js.native
    /**
      * Returns true if the given object is an instance of NotebookInstance.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sagemaker/notebookInstance.NotebookInstance */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object NotebookInstanceLifecycleConfiguration extends js.Object {
    /**
      * Get an existing NotebookInstanceLifecycleConfiguration resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.sagemakerNotebookInstanceLifecycleConfigurationMod.NotebookInstanceLifecycleConfiguration = js.native
    def get(name: String, id: Input[ID], state: NotebookInstanceLifecycleConfigurationState): typings.atPulumiAws.sagemakerNotebookInstanceLifecycleConfigurationMod.NotebookInstanceLifecycleConfiguration = js.native
    def get(
      name: String,
      id: Input[ID],
      state: NotebookInstanceLifecycleConfigurationState,
      opts: CustomResourceOptions
    ): typings.atPulumiAws.sagemakerNotebookInstanceLifecycleConfigurationMod.NotebookInstanceLifecycleConfiguration = js.native
    /**
      * Returns true if the given object is an instance of NotebookInstanceLifecycleConfiguration.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sagemaker/notebookInstanceLifecycleConfiguration.NotebookInstanceLifecycleConfiguration */ Boolean = js.native
  }
  
}

