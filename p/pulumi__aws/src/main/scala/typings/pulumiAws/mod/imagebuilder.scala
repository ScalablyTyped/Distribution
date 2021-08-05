package typings.pulumiAws.mod

import typings.pulumiAws.componentMod.ComponentArgs
import typings.pulumiAws.componentMod.ComponentState
import typings.pulumiAws.distributionConfigurationMod.DistributionConfigurationArgs
import typings.pulumiAws.distributionConfigurationMod.DistributionConfigurationState
import typings.pulumiAws.getComponentMod.GetComponentArgs
import typings.pulumiAws.getComponentMod.GetComponentResult
import typings.pulumiAws.getDistributionConfigurationMod.GetDistributionConfigurationArgs
import typings.pulumiAws.getDistributionConfigurationMod.GetDistributionConfigurationResult
import typings.pulumiAws.getInfrastructureConfigurationMod.GetInfrastructureConfigurationArgs
import typings.pulumiAws.getInfrastructureConfigurationMod.GetInfrastructureConfigurationResult
import typings.pulumiAws.infrastructureConfigurationMod.InfrastructureConfigurationArgs
import typings.pulumiAws.infrastructureConfigurationMod.InfrastructureConfigurationState
import typings.pulumiPulumi.invokeMod.InvokeOptions
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imagebuilder {
  
  @JSImport("@pulumi/aws", "imagebuilder")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pulumi/aws", "imagebuilder.Component")
  @js.native
  class Component protected ()
    extends typings.pulumiAws.imagebuilderMod.Component {
    /**
      * Create a Component resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ComponentArgs) = this()
    def this(name: String, args: ComponentArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Component {
    
    @JSImport("@pulumi/aws", "imagebuilder.Component")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Component resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.componentMod.Component = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.componentMod.Component]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.componentMod.Component = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.componentMod.Component]
    inline def get(name: String, id: Input[ID], state: ComponentState): typings.pulumiAws.componentMod.Component = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.componentMod.Component]
    inline def get(name: String, id: Input[ID], state: ComponentState, opts: CustomResourceOptions): typings.pulumiAws.componentMod.Component = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.componentMod.Component]
    
    /**
      * Returns true if the given object is an instance of Component.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/imagebuilder/component.Component */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/imagebuilder/component.Component */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "imagebuilder.DistributionConfiguration")
  @js.native
  class DistributionConfiguration protected ()
    extends typings.pulumiAws.imagebuilderMod.DistributionConfiguration {
    /**
      * Create a DistributionConfiguration resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: DistributionConfigurationArgs) = this()
    def this(name: String, args: DistributionConfigurationArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object DistributionConfiguration {
    
    @JSImport("@pulumi/aws", "imagebuilder.DistributionConfiguration")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing DistributionConfiguration resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.distributionConfigurationMod.DistributionConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.distributionConfigurationMod.DistributionConfiguration]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.distributionConfigurationMod.DistributionConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.distributionConfigurationMod.DistributionConfiguration]
    inline def get(name: String, id: Input[ID], state: DistributionConfigurationState): typings.pulumiAws.distributionConfigurationMod.DistributionConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.distributionConfigurationMod.DistributionConfiguration]
    inline def get(name: String, id: Input[ID], state: DistributionConfigurationState, opts: CustomResourceOptions): typings.pulumiAws.distributionConfigurationMod.DistributionConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.distributionConfigurationMod.DistributionConfiguration]
    
    /**
      * Returns true if the given object is an instance of DistributionConfiguration.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/imagebuilder/distributionConfiguration.DistributionConfiguration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/imagebuilder/distributionConfiguration.DistributionConfiguration */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "imagebuilder.InfrastructureConfiguration")
  @js.native
  class InfrastructureConfiguration protected ()
    extends typings.pulumiAws.imagebuilderMod.InfrastructureConfiguration {
    /**
      * Create a InfrastructureConfiguration resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: InfrastructureConfigurationArgs) = this()
    def this(name: String, args: InfrastructureConfigurationArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object InfrastructureConfiguration {
    
    @JSImport("@pulumi/aws", "imagebuilder.InfrastructureConfiguration")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing InfrastructureConfiguration resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.infrastructureConfigurationMod.InfrastructureConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.infrastructureConfigurationMod.InfrastructureConfiguration]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.infrastructureConfigurationMod.InfrastructureConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.infrastructureConfigurationMod.InfrastructureConfiguration]
    inline def get(name: String, id: Input[ID], state: InfrastructureConfigurationState): typings.pulumiAws.infrastructureConfigurationMod.InfrastructureConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.infrastructureConfigurationMod.InfrastructureConfiguration]
    inline def get(name: String, id: Input[ID], state: InfrastructureConfigurationState, opts: CustomResourceOptions): typings.pulumiAws.infrastructureConfigurationMod.InfrastructureConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.infrastructureConfigurationMod.InfrastructureConfiguration]
    
    /**
      * Returns true if the given object is an instance of InfrastructureConfiguration.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/imagebuilder/infrastructureConfiguration.InfrastructureConfiguration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/imagebuilder/infrastructureConfiguration.InfrastructureConfiguration */ Boolean]
  }
  
  inline def getComponent(args: GetComponentArgs): js.Promise[GetComponentResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getComponent")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetComponentResult]]
  inline def getComponent(args: GetComponentArgs, opts: InvokeOptions): js.Promise[GetComponentResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getComponent")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetComponentResult]]
  
  inline def getDistributionConfiguration(args: GetDistributionConfigurationArgs): js.Promise[GetDistributionConfigurationResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDistributionConfiguration")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetDistributionConfigurationResult]]
  inline def getDistributionConfiguration(args: GetDistributionConfigurationArgs, opts: InvokeOptions): js.Promise[GetDistributionConfigurationResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDistributionConfiguration")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetDistributionConfigurationResult]]
  
  inline def getInfrastructureConfiguration(args: GetInfrastructureConfigurationArgs): js.Promise[GetInfrastructureConfigurationResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getInfrastructureConfiguration")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetInfrastructureConfigurationResult]]
  inline def getInfrastructureConfiguration(args: GetInfrastructureConfigurationArgs, opts: InvokeOptions): js.Promise[GetInfrastructureConfigurationResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getInfrastructureConfiguration")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetInfrastructureConfigurationResult]]
}
