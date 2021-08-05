package typings.pulumiAws.mod

import typings.pulumiAws.enumsLambdaMod.Runtime
import typings.pulumiAws.eventSourceMappingMod.EventSourceMappingArgs
import typings.pulumiAws.eventSourceMappingMod.EventSourceMappingState
import typings.pulumiAws.functionEventInvokeConfigMod.FunctionEventInvokeConfigArgs
import typings.pulumiAws.functionEventInvokeConfigMod.FunctionEventInvokeConfigState
import typings.pulumiAws.getFunctionMod.GetFunctionArgs
import typings.pulumiAws.getFunctionMod.GetFunctionResult
import typings.pulumiAws.getInvocationMod.GetInvocationArgs
import typings.pulumiAws.getInvocationMod.GetInvocationResult
import typings.pulumiAws.getLayerVersionMod.GetLayerVersionArgs
import typings.pulumiAws.getLayerVersionMod.GetLayerVersionResult
import typings.pulumiAws.iamMod.Role
import typings.pulumiAws.lambdaAliasMod.AliasArgs
import typings.pulumiAws.lambdaAliasMod.AliasState
import typings.pulumiAws.lambdaFunctionMod.FunctionArgs
import typings.pulumiAws.lambdaFunctionMod.FunctionState
import typings.pulumiAws.lambdaGetAliasMod.GetAliasArgs
import typings.pulumiAws.lambdaGetAliasMod.GetAliasResult
import typings.pulumiAws.lambdaMixinsMod.CallbackFunctionArgs
import typings.pulumiAws.lambdaMixinsMod.EventHandler
import typings.pulumiAws.layerVersionMod.LayerVersionArgs
import typings.pulumiAws.layerVersionMod.LayerVersionState
import typings.pulumiAws.permissionMod.PermissionArgs
import typings.pulumiAws.permissionMod.PermissionState
import typings.pulumiAws.provisionedConcurrencyConfigMod.ProvisionedConcurrencyConfigArgs
import typings.pulumiAws.provisionedConcurrencyConfigMod.ProvisionedConcurrencyConfigState
import typings.pulumiAws.pulumiAwsStrings.dotnetcore2Dot1
import typings.pulumiAws.pulumiAwsStrings.dotnetcore3Dot1
import typings.pulumiAws.pulumiAwsStrings.go1Dotx
import typings.pulumiAws.pulumiAwsStrings.java11
import typings.pulumiAws.pulumiAwsStrings.java8
import typings.pulumiAws.pulumiAwsStrings.java8Dotal2
import typings.pulumiAws.pulumiAwsStrings.nodejs10Dotx
import typings.pulumiAws.pulumiAwsStrings.nodejs12Dotx
import typings.pulumiAws.pulumiAwsStrings.provided
import typings.pulumiAws.pulumiAwsStrings.providedDotal2
import typings.pulumiAws.pulumiAwsStrings.python2Dot7
import typings.pulumiAws.pulumiAwsStrings.python3Dot6
import typings.pulumiAws.pulumiAwsStrings.python3Dot7
import typings.pulumiAws.pulumiAwsStrings.python3Dot8
import typings.pulumiAws.pulumiAwsStrings.ruby2Dot5
import typings.pulumiAws.pulumiAwsStrings.ruby2Dot7
import typings.pulumiPulumi.invokeMod.InvokeOptions
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.ComponentResourceOptions
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import typings.pulumiPulumi.resourceMod.ResourceOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lambda {
  
  @JSImport("@pulumi/aws", "lambda")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pulumi/aws", "lambda.Alias")
  @js.native
  class Alias protected ()
    extends typings.pulumiAws.lambdaMod.Alias {
    /**
      * Create a Alias resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: AliasArgs) = this()
    def this(name: String, args: AliasArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Alias {
    
    @JSImport("@pulumi/aws", "lambda.Alias")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Alias resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.lambdaAliasMod.Alias = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.lambdaAliasMod.Alias]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.lambdaAliasMod.Alias = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.lambdaAliasMod.Alias]
    inline def get(name: String, id: Input[ID], state: AliasState): typings.pulumiAws.lambdaAliasMod.Alias = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.lambdaAliasMod.Alias]
    inline def get(name: String, id: Input[ID], state: AliasState, opts: CustomResourceOptions): typings.pulumiAws.lambdaAliasMod.Alias = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.lambdaAliasMod.Alias]
    
    /**
      * Returns true if the given object is an instance of Alias.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lambda/alias.Alias */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/lambda/alias.Alias */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "lambda.CallbackFunction")
  @js.native
  class CallbackFunction[E, R] protected ()
    extends typings.pulumiAws.lambdaMod.CallbackFunction[E, R] {
    def this(name: String, args: CallbackFunctionArgs[E, R]) = this()
    def this(name: String, args: CallbackFunctionArgs[E, R], opts: CustomResourceOptions) = this()
  }
  
  @JSImport("@pulumi/aws", "lambda.CustomRuntime")
  @js.native
  def CustomRuntime: Runtime = js.native
  inline def CustomRuntime_=(x: Runtime): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CustomRuntime")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws", "lambda.DotnetCore1d0Runtime")
  @js.native
  def DotnetCore1d0Runtime: dotnetcore2Dot1 | dotnetcore3Dot1 | go1Dotx | java8 | java8Dotal2 | java11 | ruby2Dot5 | ruby2Dot7 | nodejs10Dotx | nodejs12Dotx | python2Dot7 | python3Dot6 | python3Dot7 | python3Dot8 | provided | providedDotal2 = js.native
  inline def DotnetCore1d0Runtime_=(
    x: dotnetcore2Dot1 | dotnetcore3Dot1 | go1Dotx | java8 | java8Dotal2 | java11 | ruby2Dot5 | ruby2Dot7 | nodejs10Dotx | nodejs12Dotx | python2Dot7 | python3Dot6 | python3Dot7 | python3Dot8 | provided | providedDotal2
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DotnetCore1d0Runtime")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws", "lambda.DotnetCore2d0Runtime")
  @js.native
  def DotnetCore2d0Runtime: dotnetcore2Dot1 | dotnetcore3Dot1 | go1Dotx | java8 | java8Dotal2 | java11 | ruby2Dot5 | ruby2Dot7 | nodejs10Dotx | nodejs12Dotx | python2Dot7 | python3Dot6 | python3Dot7 | python3Dot8 | provided | providedDotal2 = js.native
  inline def DotnetCore2d0Runtime_=(
    x: dotnetcore2Dot1 | dotnetcore3Dot1 | go1Dotx | java8 | java8Dotal2 | java11 | ruby2Dot5 | ruby2Dot7 | nodejs10Dotx | nodejs12Dotx | python2Dot7 | python3Dot6 | python3Dot7 | python3Dot8 | provided | providedDotal2
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DotnetCore2d0Runtime")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws", "lambda.DotnetCore2d1Runtime")
  @js.native
  def DotnetCore2d1Runtime: Runtime = js.native
  inline def DotnetCore2d1Runtime_=(x: Runtime): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DotnetCore2d1Runtime")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws", "lambda.DotnetCore3d1Runtime")
  @js.native
  def DotnetCore3d1Runtime: Runtime = js.native
  inline def DotnetCore3d1Runtime_=(x: Runtime): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DotnetCore3d1Runtime")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws", "lambda.EventSourceMapping")
  @js.native
  class EventSourceMapping protected ()
    extends typings.pulumiAws.lambdaMod.EventSourceMapping {
    /**
      * Create a EventSourceMapping resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: EventSourceMappingArgs) = this()
    def this(name: String, args: EventSourceMappingArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object EventSourceMapping {
    
    @JSImport("@pulumi/aws", "lambda.EventSourceMapping")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing EventSourceMapping resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.eventSourceMappingMod.EventSourceMapping = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.eventSourceMappingMod.EventSourceMapping]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.eventSourceMappingMod.EventSourceMapping = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.eventSourceMappingMod.EventSourceMapping]
    inline def get(name: String, id: Input[ID], state: EventSourceMappingState): typings.pulumiAws.eventSourceMappingMod.EventSourceMapping = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.eventSourceMappingMod.EventSourceMapping]
    inline def get(name: String, id: Input[ID], state: EventSourceMappingState, opts: CustomResourceOptions): typings.pulumiAws.eventSourceMappingMod.EventSourceMapping = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.eventSourceMappingMod.EventSourceMapping]
    
    /**
      * Returns true if the given object is an instance of EventSourceMapping.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lambda/eventSourceMapping.EventSourceMapping */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/lambda/eventSourceMapping.EventSourceMapping */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "lambda.EventSubscription")
  @js.native
  class EventSubscription protected ()
    extends typings.pulumiAws.lambdaMod.EventSubscription {
    def this(`type`: String, name: String) = this()
    def this(`type`: String, name: String, opts: ComponentResourceOptions) = this()
  }
  
  @JSImport("@pulumi/aws", "lambda.Function")
  @js.native
  class Function protected ()
    extends typings.pulumiAws.lambdaMod.Function {
    /**
      * Create a Function resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: FunctionArgs) = this()
    def this(name: String, args: FunctionArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Function {
    
    @JSImport("@pulumi/aws", "lambda.Function")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Function resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.lambdaFunctionMod.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.lambdaFunctionMod.Function]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.lambdaFunctionMod.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.lambdaFunctionMod.Function]
    inline def get(name: String, id: Input[ID], state: FunctionState): typings.pulumiAws.lambdaFunctionMod.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.lambdaFunctionMod.Function]
    inline def get(name: String, id: Input[ID], state: FunctionState, opts: CustomResourceOptions): typings.pulumiAws.lambdaFunctionMod.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.lambdaFunctionMod.Function]
    
    /**
      * Returns true if the given object is an instance of Function.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lambda/function.Function */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/lambda/function.Function */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "lambda.FunctionEventInvokeConfig")
  @js.native
  class FunctionEventInvokeConfig protected ()
    extends typings.pulumiAws.lambdaMod.FunctionEventInvokeConfig {
    /**
      * Create a FunctionEventInvokeConfig resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: FunctionEventInvokeConfigArgs) = this()
    def this(name: String, args: FunctionEventInvokeConfigArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object FunctionEventInvokeConfig {
    
    @JSImport("@pulumi/aws", "lambda.FunctionEventInvokeConfig")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing FunctionEventInvokeConfig resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.functionEventInvokeConfigMod.FunctionEventInvokeConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.functionEventInvokeConfigMod.FunctionEventInvokeConfig]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.functionEventInvokeConfigMod.FunctionEventInvokeConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.functionEventInvokeConfigMod.FunctionEventInvokeConfig]
    inline def get(name: String, id: Input[ID], state: FunctionEventInvokeConfigState): typings.pulumiAws.functionEventInvokeConfigMod.FunctionEventInvokeConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.functionEventInvokeConfigMod.FunctionEventInvokeConfig]
    inline def get(name: String, id: Input[ID], state: FunctionEventInvokeConfigState, opts: CustomResourceOptions): typings.pulumiAws.functionEventInvokeConfigMod.FunctionEventInvokeConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.functionEventInvokeConfigMod.FunctionEventInvokeConfig]
    
    /**
      * Returns true if the given object is an instance of FunctionEventInvokeConfig.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lambda/functionEventInvokeConfig.FunctionEventInvokeConfig */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/lambda/functionEventInvokeConfig.FunctionEventInvokeConfig */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "lambda.Go1dxRuntime")
  @js.native
  def Go1dxRuntime: Runtime = js.native
  inline def Go1dxRuntime_=(x: Runtime): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Go1dxRuntime")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws", "lambda.Java11Runtime")
  @js.native
  def Java11Runtime: Runtime = js.native
  inline def Java11Runtime_=(x: Runtime): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Java11Runtime")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws", "lambda.Java8Runtime")
  @js.native
  def Java8Runtime: Runtime = js.native
  inline def Java8Runtime_=(x: Runtime): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Java8Runtime")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws", "lambda.LayerVersion")
  @js.native
  class LayerVersion protected ()
    extends typings.pulumiAws.lambdaMod.LayerVersion {
    /**
      * Create a LayerVersion resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: LayerVersionArgs) = this()
    def this(name: String, args: LayerVersionArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object LayerVersion {
    
    @JSImport("@pulumi/aws", "lambda.LayerVersion")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing LayerVersion resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.layerVersionMod.LayerVersion = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.layerVersionMod.LayerVersion]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.layerVersionMod.LayerVersion = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.layerVersionMod.LayerVersion]
    inline def get(name: String, id: Input[ID], state: LayerVersionState): typings.pulumiAws.layerVersionMod.LayerVersion = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.layerVersionMod.LayerVersion]
    inline def get(name: String, id: Input[ID], state: LayerVersionState, opts: CustomResourceOptions): typings.pulumiAws.layerVersionMod.LayerVersion = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.layerVersionMod.LayerVersion]
    
    /**
      * Returns true if the given object is an instance of LayerVersion.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lambda/layerVersion.LayerVersion */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/lambda/layerVersion.LayerVersion */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "lambda.NodeJS10dXRuntime")
  @js.native
  def NodeJS10dXRuntime: Runtime = js.native
  inline def NodeJS10dXRuntime_=(x: Runtime): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NodeJS10dXRuntime")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws", "lambda.NodeJS12dXRuntime")
  @js.native
  def NodeJS12dXRuntime: Runtime = js.native
  inline def NodeJS12dXRuntime_=(x: Runtime): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NodeJS12dXRuntime")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws", "lambda.NodeJS4d3EdgeRuntime")
  @js.native
  def NodeJS4d3EdgeRuntime: dotnetcore2Dot1 | dotnetcore3Dot1 | go1Dotx | java8 | java8Dotal2 | java11 | ruby2Dot5 | ruby2Dot7 | nodejs10Dotx | nodejs12Dotx | python2Dot7 | python3Dot6 | python3Dot7 | python3Dot8 | provided | providedDotal2 = js.native
  inline def NodeJS4d3EdgeRuntime_=(
    x: dotnetcore2Dot1 | dotnetcore3Dot1 | go1Dotx | java8 | java8Dotal2 | java11 | ruby2Dot5 | ruby2Dot7 | nodejs10Dotx | nodejs12Dotx | python2Dot7 | python3Dot6 | python3Dot7 | python3Dot8 | provided | providedDotal2
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NodeJS4d3EdgeRuntime")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws", "lambda.NodeJS4d3Runtime")
  @js.native
  def NodeJS4d3Runtime: dotnetcore2Dot1 | dotnetcore3Dot1 | go1Dotx | java8 | java8Dotal2 | java11 | ruby2Dot5 | ruby2Dot7 | nodejs10Dotx | nodejs12Dotx | python2Dot7 | python3Dot6 | python3Dot7 | python3Dot8 | provided | providedDotal2 = js.native
  inline def NodeJS4d3Runtime_=(
    x: dotnetcore2Dot1 | dotnetcore3Dot1 | go1Dotx | java8 | java8Dotal2 | java11 | ruby2Dot5 | ruby2Dot7 | nodejs10Dotx | nodejs12Dotx | python2Dot7 | python3Dot6 | python3Dot7 | python3Dot8 | provided | providedDotal2
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NodeJS4d3Runtime")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws", "lambda.NodeJS6d10Runtime")
  @js.native
  def NodeJS6d10Runtime: dotnetcore2Dot1 | dotnetcore3Dot1 | go1Dotx | java8 | java8Dotal2 | java11 | ruby2Dot5 | ruby2Dot7 | nodejs10Dotx | nodejs12Dotx | python2Dot7 | python3Dot6 | python3Dot7 | python3Dot8 | provided | providedDotal2 = js.native
  inline def NodeJS6d10Runtime_=(
    x: dotnetcore2Dot1 | dotnetcore3Dot1 | go1Dotx | java8 | java8Dotal2 | java11 | ruby2Dot5 | ruby2Dot7 | nodejs10Dotx | nodejs12Dotx | python2Dot7 | python3Dot6 | python3Dot7 | python3Dot8 | provided | providedDotal2
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NodeJS6d10Runtime")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws", "lambda.NodeJS8d10Runtime")
  @js.native
  def NodeJS8d10Runtime: dotnetcore2Dot1 | dotnetcore3Dot1 | go1Dotx | java8 | java8Dotal2 | java11 | ruby2Dot5 | ruby2Dot7 | nodejs10Dotx | nodejs12Dotx | python2Dot7 | python3Dot6 | python3Dot7 | python3Dot8 | provided | providedDotal2 = js.native
  inline def NodeJS8d10Runtime_=(
    x: dotnetcore2Dot1 | dotnetcore3Dot1 | go1Dotx | java8 | java8Dotal2 | java11 | ruby2Dot5 | ruby2Dot7 | nodejs10Dotx | nodejs12Dotx | python2Dot7 | python3Dot6 | python3Dot7 | python3Dot8 | provided | providedDotal2
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NodeJS8d10Runtime")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws", "lambda.NodeJSRuntime")
  @js.native
  def NodeJSRuntime: dotnetcore2Dot1 | dotnetcore3Dot1 | go1Dotx | java8 | java8Dotal2 | java11 | ruby2Dot5 | ruby2Dot7 | nodejs10Dotx | nodejs12Dotx | python2Dot7 | python3Dot6 | python3Dot7 | python3Dot8 | provided | providedDotal2 = js.native
  inline def NodeJSRuntime_=(
    x: dotnetcore2Dot1 | dotnetcore3Dot1 | go1Dotx | java8 | java8Dotal2 | java11 | ruby2Dot5 | ruby2Dot7 | nodejs10Dotx | nodejs12Dotx | python2Dot7 | python3Dot6 | python3Dot7 | python3Dot8 | provided | providedDotal2
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NodeJSRuntime")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws", "lambda.Permission")
  @js.native
  class Permission protected ()
    extends typings.pulumiAws.lambdaMod.Permission {
    /**
      * Create a Permission resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: PermissionArgs) = this()
    def this(name: String, args: PermissionArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Permission {
    
    @JSImport("@pulumi/aws", "lambda.Permission")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Permission resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.permissionMod.Permission = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.permissionMod.Permission]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.permissionMod.Permission = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.permissionMod.Permission]
    inline def get(name: String, id: Input[ID], state: PermissionState): typings.pulumiAws.permissionMod.Permission = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.permissionMod.Permission]
    inline def get(name: String, id: Input[ID], state: PermissionState, opts: CustomResourceOptions): typings.pulumiAws.permissionMod.Permission = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.permissionMod.Permission]
    
    /**
      * Returns true if the given object is an instance of Permission.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lambda/permission.Permission */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/lambda/permission.Permission */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "lambda.ProvisionedConcurrencyConfig")
  @js.native
  class ProvisionedConcurrencyConfig protected ()
    extends typings.pulumiAws.lambdaMod.ProvisionedConcurrencyConfig {
    /**
      * Create a ProvisionedConcurrencyConfig resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ProvisionedConcurrencyConfigArgs) = this()
    def this(name: String, args: ProvisionedConcurrencyConfigArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ProvisionedConcurrencyConfig {
    
    @JSImport("@pulumi/aws", "lambda.ProvisionedConcurrencyConfig")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ProvisionedConcurrencyConfig resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.provisionedConcurrencyConfigMod.ProvisionedConcurrencyConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.provisionedConcurrencyConfigMod.ProvisionedConcurrencyConfig]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.provisionedConcurrencyConfigMod.ProvisionedConcurrencyConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.provisionedConcurrencyConfigMod.ProvisionedConcurrencyConfig]
    inline def get(name: String, id: Input[ID], state: ProvisionedConcurrencyConfigState): typings.pulumiAws.provisionedConcurrencyConfigMod.ProvisionedConcurrencyConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.provisionedConcurrencyConfigMod.ProvisionedConcurrencyConfig]
    inline def get(name: String, id: Input[ID], state: ProvisionedConcurrencyConfigState, opts: CustomResourceOptions): typings.pulumiAws.provisionedConcurrencyConfigMod.ProvisionedConcurrencyConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.provisionedConcurrencyConfigMod.ProvisionedConcurrencyConfig]
    
    /**
      * Returns true if the given object is an instance of ProvisionedConcurrencyConfig.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lambda/provisionedConcurrencyConfig.ProvisionedConcurrencyConfig */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/lambda/provisionedConcurrencyConfig.ProvisionedConcurrencyConfig */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "lambda.Python2d7Runtime")
  @js.native
  def Python2d7Runtime: Runtime = js.native
  inline def Python2d7Runtime_=(x: Runtime): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Python2d7Runtime")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws", "lambda.Python3d6Runtime")
  @js.native
  def Python3d6Runtime: Runtime = js.native
  inline def Python3d6Runtime_=(x: Runtime): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Python3d6Runtime")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws", "lambda.Python3d7Runtime")
  @js.native
  def Python3d7Runtime: Runtime = js.native
  inline def Python3d7Runtime_=(x: Runtime): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Python3d7Runtime")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws", "lambda.Python3d8Runtime")
  @js.native
  def Python3d8Runtime: Runtime = js.native
  inline def Python3d8Runtime_=(x: Runtime): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Python3d8Runtime")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws", "lambda.Ruby2d5Runtime")
  @js.native
  def Ruby2d5Runtime: Runtime = js.native
  inline def Ruby2d5Runtime_=(x: Runtime): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Ruby2d5Runtime")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws", "lambda.Ruby2d7Runtime")
  @js.native
  def Ruby2d7Runtime: Runtime = js.native
  inline def Ruby2d7Runtime_=(x: Runtime): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Ruby2d7Runtime")(x.asInstanceOf[js.Any])
  
  object Runtime {
    
    @JSImport("@pulumi/aws", "lambda.Runtime.Custom")
    @js.native
    val Custom: provided = js.native
    
    @JSImport("@pulumi/aws", "lambda.Runtime.CustomAL2")
    @js.native
    val CustomAL2: providedDotal2 = js.native
    
    @JSImport("@pulumi/aws", "lambda.Runtime.DotnetCore2d1")
    @js.native
    val DotnetCore2d1: dotnetcore2Dot1 = js.native
    
    @JSImport("@pulumi/aws", "lambda.Runtime.DotnetCore3d1")
    @js.native
    val DotnetCore3d1: dotnetcore3Dot1 = js.native
    
    @JSImport("@pulumi/aws", "lambda.Runtime.Go1dx")
    @js.native
    val Go1dx: go1Dotx = js.native
    
    @JSImport("@pulumi/aws", "lambda.Runtime.Java11")
    @js.native
    val Java11: java11 = js.native
    
    @JSImport("@pulumi/aws", "lambda.Runtime.Java8")
    @js.native
    val Java8: java8 = js.native
    
    @JSImport("@pulumi/aws", "lambda.Runtime.Java8AL2")
    @js.native
    val Java8AL2: java8Dotal2 = js.native
    
    @JSImport("@pulumi/aws", "lambda.Runtime.NodeJS10dX")
    @js.native
    val NodeJS10dX: nodejs10Dotx = js.native
    
    @JSImport("@pulumi/aws", "lambda.Runtime.NodeJS12dX")
    @js.native
    val NodeJS12dX: nodejs12Dotx = js.native
    
    @JSImport("@pulumi/aws", "lambda.Runtime.Python2d7")
    @js.native
    val Python2d7: python2Dot7 = js.native
    
    @JSImport("@pulumi/aws", "lambda.Runtime.Python3d6")
    @js.native
    val Python3d6: python3Dot6 = js.native
    
    @JSImport("@pulumi/aws", "lambda.Runtime.Python3d7")
    @js.native
    val Python3d7: python3Dot7 = js.native
    
    @JSImport("@pulumi/aws", "lambda.Runtime.Python3d8")
    @js.native
    val Python3d8: python3Dot8 = js.native
    
    @JSImport("@pulumi/aws", "lambda.Runtime.Ruby2d5")
    @js.native
    val Ruby2d5: ruby2Dot5 = js.native
    
    @JSImport("@pulumi/aws", "lambda.Runtime.Ruby2d7")
    @js.native
    val Ruby2d7: ruby2Dot7 = js.native
  }
  
  inline def createFunctionFromEventHandler[E, R](name: String, handler: EventHandler[E, R]): typings.pulumiAws.lambdaFunctionMod.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("createFunctionFromEventHandler")(name.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.lambdaFunctionMod.Function]
  inline def createFunctionFromEventHandler[E, R](name: String, handler: EventHandler[E, R], opts: ResourceOptions): typings.pulumiAws.lambdaFunctionMod.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("createFunctionFromEventHandler")(name.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.lambdaFunctionMod.Function]
  
  inline def getAlias(args: GetAliasArgs): js.Promise[GetAliasResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAlias")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetAliasResult]]
  inline def getAlias(args: GetAliasArgs, opts: InvokeOptions): js.Promise[GetAliasResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAlias")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetAliasResult]]
  
  inline def getFunction(args: GetFunctionArgs): js.Promise[GetFunctionResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFunction")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetFunctionResult]]
  inline def getFunction(args: GetFunctionArgs, opts: InvokeOptions): js.Promise[GetFunctionResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFunction")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetFunctionResult]]
  
  inline def getInvocation(args: GetInvocationArgs): js.Promise[GetInvocationResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getInvocation")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetInvocationResult]]
  inline def getInvocation(args: GetInvocationArgs, opts: InvokeOptions): js.Promise[GetInvocationResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getInvocation")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetInvocationResult]]
  
  inline def getLayerVersion(args: GetLayerVersionArgs): js.Promise[GetLayerVersionResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLayerVersion")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetLayerVersionResult]]
  inline def getLayerVersion(args: GetLayerVersionArgs, opts: InvokeOptions): js.Promise[GetLayerVersionResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getLayerVersion")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetLayerVersionResult]]
  
  inline def isEventHandler(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lambda/lambdaMixins.EventHandler<any, any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEventHandler")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/lambda/lambdaMixins.EventHandler<any, any> */ Boolean]
  
  /* augmented module */
  object pulumiAwsLambdaFunctionAugmentingMod {
    
    @js.native
    trait Function extends StObject {
      
      /**
        * Actual Role instance value for this Function.  Will only be set if this function was
        * created from [createFunction]
        */
      var roleInstance: js.UndefOr[Role] = js.native
    }
  }
}
